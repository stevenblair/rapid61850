/**
 * Rapid-prototyping protection schemes with IEC 61850
 *
 *
 * This is an example main file to implement IEC 61850-9-2LE Sampled Values.
 * Three SV streams are generated.
 *
 * Use the rapid61850 Java code to generate the IEC 61850 code, with "scd_LE.xml" as the SCD file.
 * In ctypes.c, set HIGH_LEVEL_INTERFACE to '1'.
 * Include interface.c and interfaceSendPack.c in the C build. Exclude main.c.
 *
 *
 * Copyright (c) 2016 Steven Blair
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

#ifdef _WIN32
#define WPCAP
#define HAVE_REMOTE
#define WIN32_LEAN_AND_MEAN
#endif

#include <pcap.h>
#include <math.h>
#include <unistd.h>
#include <windows.h>
#include "iec61850.h"

/* Basic Compression Library */
#include "bcl/rle.h"
#include "bcl/shannonfano.h"
#include "bcl/huffman.h"
#include "bcl/rice.h"
#include "bcl/lz.h"
#include "bcl/systimer.h"

#include "liblzg/lzg.h"

#include "FastLZ/fastlz.h"

#include "lzfx/lzfx.h"


#define PI						3.1415926535897932384626433832795
#define TWO_PI_OVER_THREE		2.0943951023931954923084289221863
#define NUMBER_OF_ALGORITHMS	17

unsigned char bufIn[2048] = {0};
unsigned char bufOut[2048] = {0};

pcap_t *fp;
char errbuf[PCAP_ERRBUF_SIZE];


typedef struct alg_result {
	float ratio;
	float compress_time_us;
	float decompress_time_us;
} alg_result;

alg_result **results;
unsigned int result_iterations = 0;

void create_results() {
	results = (alg_result**) malloc(sizeof(alg_result *) * NUMBER_OF_ALGORITHMS);

//	results = malloc(NUMBER_OF_ALGORITHMS * sizeof(alg_result *) + (NUMBER_OF_ALGORITHMS * (result_iterations * sizeof(alg_result))));

	int i = 0, j = 0;
	for (i = 0; i < NUMBER_OF_ALGORITHMS; i++) {
		results[i] = (alg_result*) malloc(sizeof(alg_result) * result_iterations);
	}

	for (i = 0; i < NUMBER_OF_ALGORITHMS; i++) {
		for (j = 0; j < result_iterations; j++) {
			results[i][j].ratio = 1.0;
			results[i][j].compress_time_us = 0.0;
			results[i][j].decompress_time_us = 0.0;
		}
	}
}


void usleep_custom(__int64 usec) {
	HANDLE timer;
	LARGE_INTEGER ft;

	ft.QuadPart = -(10*usec); // Convert to 100 nanosecond interval, negative value indicates relative time

	timer = CreateWaitableTimer(NULL, TRUE, NULL);
	SetWaitableTimer(timer, &ft, 0, NULL, NULL, 0);
	WaitForSingleObject(timer, INFINITE);
	CloseHandle(timer);
}

const char *get_algorithm_name(int algo) {
	//	  if( strcmp( argv[1], "rle" ) == 0 )     algo = 1;
	//	  if( strcmp( argv[1], "huff" ) == 0 )    algo = 2;
	//	  if( strcmp( argv[1], "rice8" ) == 0 )   algo = 3;
	//	  if( strcmp( argv[1], "rice16" ) == 0 )  algo = 4;
	//	  if( strcmp( argv[1], "rice32" ) == 0 )  algo = 5;
	//	  if( strcmp( argv[1], "rice8s" ) == 0 )  algo = 6;
	//	  if( strcmp( argv[1], "rice16s" ) == 0 ) algo = 7;
	//	  if( strcmp( argv[1], "rice32s" ) == 0 ) algo = 8;
	//	  if( strcmp( argv[1], "lz" ) == 0 )      algo = 9;
	//	  if( strcmp( argv[1], "lz_f" ) == 0 )    algo = 10;
	//	  if( strcmp( argv[1], "sf" ) == 0 )      algo = 11;
	switch(algo) {
	case 1: return "rle";
	case 2: return "huff";
	case 3: return "rice8";
	case 4: return "rice16";
	case 5: return "rice32";
	case 6: return "rice8s";
	case 7: return "rice16s";
	case 8: return "rice32s";
	case 9: return "lz";
	case 10: return "lz_f";
	case 11: return "sf";
	case 12: return "lzg1";
	case 13: return "lzg5";
	case 14: return "lzg9";
	case 15: return "fastlz1";
	case 16: return "fastlz2";
	case 17: return "lzfx";
	default: break;
	}
	return "";
}

int TestBuf(unsigned char *in, unsigned int insize, unsigned int iteration, int algo) {
	unsigned int  outsize, bufsize = 0, *work, k, err_count;
	unsigned char *out, *buf;
	double        t0, t_comp, t_uncomp;
//	static unsigned int iteration = 0;

//	printf("Testing %s:", get_algorithm_name(algo));

	// liblzg config
	lzg_encoder_config_t config;
	LZG_InitEncoderConfig(&config);
	config.fast = LZG_TRUE;
	config.level = LZG_LEVEL_1;

	// FastLZ config
	int FastLZ_level = 1;

	switch(algo) {
	case 12:
		config.level = LZG_LEVEL_1;
		break;
	case 13:
		config.level = LZG_LEVEL_5;
		break;
	case 14:
		config.level = LZG_LEVEL_9;
		break;
	case 15:
		FastLZ_level = 1;
		break;
	case 16:
		FastLZ_level = 2;
		break;
	default:
		break;
	}

	// worst case output buffer size
	if (algo <= 11 || algo == 15 || algo == 16) {
		bufsize = (insize * 104 + 50) / 100 + 384;
	}
	else if (algo > 11 && algo <= 14) {
		bufsize = LZG_MaxEncodedSize(insize);
	}
	else if (algo == 17) {
		bufsize = LZG_MaxEncodedSize(insize);
	}

	// allocate memory
	out = (unsigned char *) malloc(2 * bufsize);
	if (!out) {
		printf("out of memory!\n");
		return 0;
	}

	// pointers to compression buffer and output memory
	buf = &out[0];
	out = &buf[bufsize];

	// compress and decompress
	switch(algo) {
	case 1:
		t0 = GetTime();
		outsize = RLE_Compress( in, buf, insize );
		t_comp = GetTime() - t0;
		t0 = GetTime();
		RLE_Uncompress( buf, out, outsize );
		t_uncomp = GetTime() - t0;
		break;
	case 2:
		t0 = GetTime();
		outsize = Huffman_Compress( in, buf, insize );
		t_comp = GetTime() - t0;
		t0 = GetTime();
		Huffman_Uncompress( buf, out, outsize, insize );
		t_uncomp = GetTime() - t0;
		break;
	case 3:
		t0 = GetTime();
		outsize = Rice_Compress( in, buf, insize, RICE_FMT_UINT8 );
		t_comp = GetTime() - t0;
		t0 = GetTime();
		Rice_Uncompress( buf, out, outsize, insize, RICE_FMT_UINT8 );
		t_uncomp = GetTime() - t0;
		break;
	case 4:
		t0 = GetTime();
		outsize = Rice_Compress( in, buf, insize, RICE_FMT_UINT16 );
		t_comp = GetTime() - t0;
		t0 = GetTime();
		Rice_Uncompress( buf, out, outsize, insize, RICE_FMT_UINT16 );
		t_uncomp = GetTime() - t0;
		break;
	case 5:
		t0 = GetTime();
		outsize = Rice_Compress( in, buf, insize, RICE_FMT_UINT32 );
		t_comp = GetTime() - t0;
		t0 = GetTime();
		Rice_Uncompress( buf, out, outsize, insize, RICE_FMT_UINT32 );
		t_uncomp = GetTime() - t0;
		break;
	case 6:
		t0 = GetTime();
		outsize = Rice_Compress( in, buf, insize, RICE_FMT_INT8 );
		t_comp = GetTime() - t0;
		t0 = GetTime();
		Rice_Uncompress( buf, out, outsize, insize, RICE_FMT_INT8 );
		t_uncomp = GetTime() - t0;
		break;
	case 7:
		t0 = GetTime();
		outsize = Rice_Compress( in, buf, insize, RICE_FMT_INT16 );
		t_comp = GetTime() - t0;
		t0 = GetTime();
		Rice_Uncompress( buf, out, outsize, insize, RICE_FMT_INT16 );
		t_uncomp = GetTime() - t0;
		break;
	case 8:
		t0 = GetTime();
		outsize = Rice_Compress( in, buf, insize, RICE_FMT_INT32 );
		t_comp = GetTime() - t0;
		t0 = GetTime();
		Rice_Uncompress( buf, out, outsize, insize, RICE_FMT_INT32 );
		t_uncomp = GetTime() - t0;
		break;
	case 9:
		t0 = GetTime();
		outsize = LZ_Compress( in, buf, insize );
		t_comp = GetTime() - t0;
		t0 = GetTime();
		LZ_Uncompress( buf, out, outsize );
		t_uncomp = GetTime() - t0;
		break;
	case 10:
		work = malloc( sizeof(unsigned int) * (65536+insize) );
		if (work) {
			t0 = GetTime();
			outsize = LZ_CompressFast( in, buf, insize, work );
			t_comp = GetTime() - t0;
			free( work );
			t0 = GetTime();
			LZ_Uncompress( buf, out, outsize );
			t_uncomp = GetTime() - t0;
		}
		else {
			printf( "unable to allocate working buffer!\n" );
			t_comp = 0.0;
			t_uncomp = 0.0;
			outsize = 0;
		}
		break;
	case 11:
		t0 = GetTime();
		outsize = SF_Compress( in, buf, insize );
		t_comp = GetTime() - t0;
		t0 = GetTime();
		SF_Uncompress( buf, out, outsize, insize );
		t_uncomp = GetTime() - t0;
		break;
	case 12:
	case 13:
	case 14:
		t0 = GetTime();
		outsize = LZG_Encode(in, insize, buf, bufsize, &config);
		t_comp = GetTime() - t0;
		t0 = GetTime();
		LZG_Decode(buf, outsize, out, insize);
		t_uncomp = GetTime() - t0;
		break;
	case 15:
	case 16:
		t0 = GetTime();
		outsize = fastlz_compress_level(FastLZ_level, in, insize, buf);
		t_comp = GetTime() - t0;
		t0 = GetTime();
		fastlz_decompress(buf, outsize, out, insize);
		t_uncomp = GetTime() - t0;
		break;
	case 17:
		t0 = GetTime();
		outsize = bufsize;
		lzfx_compress(in, insize, buf, &outsize);
		t_comp = GetTime() - t0;
		t0 = GetTime();
		lzfx_decompress(buf, outsize, out, &insize);
		t_uncomp = GetTime() - t0;
		break;
	default:
		outsize = 0;
		t_comp = 0.0;
		t_uncomp = 0.0;
	}

	err_count = 0;
	if (outsize > 0) {
		// show compression result
		float ratio = (float) outsize / (float) insize;
//		printf("\n  Compression: %d/%d bytes (%.1f%%)", outsize, insize, 100 * ratio);

		// compare input / output data
		for (k = 0; k < insize; ++ k) {
			if (in[ k ] != out[ k ]) {
//				if (err_count == 0) printf( "\n" );
//				if (err_count == 30) printf( "    ...\n" );
//				else if (err_count < 30) {
//					printf( "    %d: %d != %d\n", k, out[ k ], in[ k ] );
//				}
				++ err_count;
			}
		}

		// did we have success?
		if (err_count == 0) {
//			printf("\n");
//			printf("    Compression speed: %3.1f KB/s (%.3f us)\n",
//					(double) insize / (1024.0 * t_comp), 1000000.0 * t_comp);
//			printf("    Decompression speed: %3.1f KB/s (%.3f us)\n",
//					(double) insize / (1024.0 * t_uncomp), 1000000.0 * t_uncomp);

			results[algo - 1][iteration].ratio = ratio;
			results[algo - 1][iteration].compress_time_us = 1000000.0 * t_comp;
			results[algo - 1][iteration].decompress_time_us = 1000000.0 * t_uncomp;
			iteration++;
//			printf("  %s\t%f\n", get_algorithm_name(algo), results[algo - 1][iteration].ratio);
		}
		else {
//			printf("    *******************************\n");
//			printf("    ERROR: %s %d faulty bytes\n", get_algorithm_name(algo), err_count);
//			printf("    *******************************\n");
		}
	}

	// free all memory
	free(out);

	return (outsize > 0) && (err_count == 0);
}


void analyse_results(unsigned int compression_iterations) {
	float total_ratio[NUMBER_OF_ALGORITHMS] = {0.0};
	float total_compress_time_us[NUMBER_OF_ALGORITHMS] = {0.0};
	float total_decompress_time_us[NUMBER_OF_ALGORITHMS] = {0.0};
	int i = 0, j = 0;

	for (i = 0; i < NUMBER_OF_ALGORITHMS; i++) {
		for (j = 0; j < compression_iterations; j++) {
			total_ratio[i] += results[i][j].ratio;
//			printf("  %s\t%f, %f\n", get_algorithm_name(i + 1), total_ratio[i], results[i][j].ratio);
			total_compress_time_us[i] += results[i][j].compress_time_us;
			total_decompress_time_us[i] += results[i][j].decompress_time_us;
		}
	}

	for (i = 0; i < NUMBER_OF_ALGORITHMS; i++) {
//		printf("%s\t%f, %f, %f\n", get_algorithm_name(i + 1), total_ratio[i], total_compress_time_us[i], total_decompress_time_us[i]);
		float mean_ratio = total_ratio[i] / compression_iterations;
		float mean_compress_time_us = total_compress_time_us[i] / compression_iterations;
		float mean_decompress_time_us = total_decompress_time_us[i] / compression_iterations;
		float mean_total_time_us = mean_compress_time_us + mean_decompress_time_us;
		float mean_combined = mean_total_time_us * mean_ratio;

		if (mean_ratio < 0.9 && mean_total_time_us < 100.0) {
			printf("%s\t%.2f\t%4.1f us\t(%4.1f, %4.1f)\t%5.1f\n", get_algorithm_name(i + 1), mean_ratio, mean_total_time_us, mean_compress_time_us, mean_decompress_time_us, mean_combined);
		}
	}
}


void packet_handler(u_char *param, const struct pcap_pkthdr *header, const u_char *pkt_data) {
	gse_sv_packet_filter((unsigned char *) pkt_data, header->len);
}

pcap_t *init_pcap() {
	pcap_t *fpl;
	pcap_if_t *alldevs = 0;
	pcap_if_t *used_if;

	/* Retrieve the device list from the local machine */
#ifdef _WIN32
	if (pcap_findalldevs_ex(PCAP_SRC_IF_STRING, NULL /* auth is not needed */, &alldevs, errbuf) == -1) {
		fprintf(stderr, "Error in pcap_findalldevs_ex: %s\n", errbuf);
		exit(1);
	}
#else
	if (pcap_findalldevs(&alldevs, errbuf) == -1) {
		fprintf(stderr, "Error in pcap_findalldevs: %s\n", errbuf);
		exit(1);
	}
#endif

	used_if = alldevs;

#ifdef _WIN32
	fprintf(stdout, "network interface: %s\n", used_if->description);
#else
	fprintf(stdout, "network interface: %s\n", used_if->name);
#endif
	fflush(stdout);

	if ((fpl = pcap_open_live(used_if->name,	// name of the device
			65536,				// portion of the packet to capture. It doesn't matter in this case
			1,					// promiscuous mode (nonzero means promiscuous)
			1,					// read timeout
			errbuf				// error buffer
	)) == NULL)
	{
		fprintf(stderr, "\nUnable to open the adapter. %s is not supported by WinPcap\n", alldevs->name);
		exit(2);
	}

	pcap_freealldevs(alldevs);

	return fpl;
}

int toI(double I, double value) {
	return (CTYPE_INT32) (I * value / ((double) LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_1.Amp.sVC.scaleFactor));
}

int toV(double V, double value) {
	return (CTYPE_INT32) (V * value / ((double) LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_1.Vol.sVC.scaleFactor));
}

double harmonic(double num, double mag, double theta, double phase) {
	return mag * sin((theta * num + phase));
}

int main() {
	initialise_iec61850();	// initialise IEC 61850 library
	fp = init_pcap();		// initialise platform-specific libpcap network interface

	InitTimer();

	double f_nominal = 50.0;
	double samplesPerCycle = 288.0;
	double f = 50.0;
	double w;
	double Vnom = 11000.0;
	double V = Vnom * sqrt(2) / sqrt(3);
	double Zmag = 8.0;
	double I = V / Zmag;
	double phi = 0.2 * PI;
	unsigned int sample_rate = f_nominal * samplesPerCycle; // TODO smpRate should be given per nominal cycle?
	double Ts = 1.0 / (sample_rate);
	double theta = 0.0;
	unsigned int t = 0;
	unsigned int muNumber = 0;

	unsigned int compression_start_offset = 28;
	int i = 0;
	unsigned int compression_iterations = 0;

	result_iterations = sample_rate / LE_IED.S1.MUnn.LN0.MSVCB01.noASDU;
//	printf("result_iterations: %d\n", result_iterations);
	create_results();

	while (1) {
		//		LE_IED.S1.MUnn.LN0.MSVCB01.ASDU[0].svID[9] = (char) (((int)'0') + muNumber);
		//phi = (((double) rand()) / ((double) RAND_MAX)) * PI;

		for (t = 0; t < sample_rate; t++) {
			w = 2 * PI * f;
			theta = w * (((double) t) * Ts);
			//			printf("running\n");
			//			fflush(stdout);

			LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_1.Vol.instMag.i = toV(V, harmonic(1, 1.0, theta, 0)                   + harmonic(9, muNumber * 0.04, theta, 0)                   + harmonic(11, muNumber * 0.01, theta, 0));
			LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_2.Vol.instMag.i = toV(V, harmonic(1, 1.0, theta, - TWO_PI_OVER_THREE) + harmonic(9, muNumber * 0.02, theta, - TWO_PI_OVER_THREE) + harmonic(13, muNumber * 0.01, theta, - TWO_PI_OVER_THREE));
			LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_3.Vol.instMag.i = toV(V, harmonic(1, 1.0, theta, + TWO_PI_OVER_THREE) + harmonic(9, muNumber * 0.01, theta, + TWO_PI_OVER_THREE) + harmonic(15, muNumber * 0.01, theta, + TWO_PI_OVER_THREE));
			LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_4.Vol.instMag.i = 0;

			LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_1.Amp.instMag.i = toI(I, harmonic(1, 1.0, theta - phi, 0)                   + harmonic(2, muNumber * 0.05, theta - phi, 0)                   + harmonic(3, 0.03, theta - phi, 0) + harmonic(5, 0.10, theta - phi, 0)                   + harmonic(7, 0.05, theta - phi, 0)                   + harmonic(9, 0.03, theta - phi, 0));
			LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_2.Amp.instMag.i = toI(I, harmonic(1, 0.9, theta - phi, - TWO_PI_OVER_THREE) + harmonic(2, muNumber * 0.05, theta - phi, + TWO_PI_OVER_THREE) + harmonic(3, 0.03, theta - phi, 0) + harmonic(5, 0.10, theta - phi, + TWO_PI_OVER_THREE) + harmonic(7, 0.05, theta - phi, - TWO_PI_OVER_THREE) + harmonic(9, 0.03, theta - phi, 0));
			LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_3.Amp.instMag.i = toI(I, harmonic(1, 0.8, theta - phi, + TWO_PI_OVER_THREE) + harmonic(2, muNumber * 0.05, theta - phi, - TWO_PI_OVER_THREE) + harmonic(3, 0.03, theta - phi, 0) + harmonic(5, 0.10, theta - phi, - TWO_PI_OVER_THREE) + harmonic(7, 0.05, theta - phi, + TWO_PI_OVER_THREE) + harmonic(9, 0.03, theta - phi, 0));
			LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_4.Amp.instMag.i = 0;

			int len = sv_update_LE_IED_MUnn_MSVCB01(bufOut);
			if (len > 0) {
//				printf("len > 0: %d\n", t);
				for (i = 0; i < NUMBER_OF_ALGORITHMS; i++) {
					TestBuf(&bufOut[compression_start_offset - 1], len - compression_start_offset, compression_iterations, i + 1);
				}

				//				pcap_sendpacket(fp, bufOut, len);
				compression_iterations++;
			}

//			if (t + 1 >= 7200 - 1) {//result_iterations) {
//				analyse_results(compression_iterations);
//				return 0;
//			}
//			else {
//				printf("t: %d, %d\n", t, result_iterations);
//			}

			//			usleep_custom(1000000 / LE_IED.S1.MUnn.LN0.MSVCB01.ASDU[LE_IED.S1.MUnn.LN0.MSVCB01.ASDUCount].smpRate);
		}

		analyse_results(compression_iterations);
		return 0;

//		usleep_custom(1000000);

		// simple method to vary Merging Unit number, and phase angle of current waveforms
		//		muNumber++;
		//		phi += 0.10 * PI;
		//		if (muNumber == 1) {
		//			muNumber = 0;
		//			phi = 0.0;
		////			usleep(1000000);//Sleep(1);
		//		}

		//		usleep(1000000);
	}

	return 0;
}
