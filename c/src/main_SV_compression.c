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

#include "trle/trle.h"

#include "mrle/mrle.h"


#define PI						3.1415926535897932384626433832795
#define TWO_PI_OVER_THREE		2.0943951023931954923084289221863
#define NUMBER_OF_ALGORITHMS	19
#define BUF_SIZE				4096

unsigned char bufIn[2048] = {0};
unsigned char bufOut[2048] = {0};

pcap_t *fp;
char errbuf[PCAP_ERRBUF_SIZE];




typedef struct alg_result {
	unsigned char success;
	unsigned int original_data_length;
	float ratio;
	float compress_time_us;
	float decompress_time_us;
	unsigned int memory_use;
} alg_result;

alg_result **results;
unsigned int result_iterations = 0;

unsigned char *buf;
unsigned char *out;
unsigned int *work;


void create_results() {
	results = (alg_result**) malloc(sizeof(alg_result *) * NUMBER_OF_ALGORITHMS);

//	results = malloc(NUMBER_OF_ALGORITHMS * sizeof(alg_result *) + (NUMBER_OF_ALGORITHMS * (result_iterations * sizeof(alg_result))));

	int i = 0, j = 0;
	for (i = 0; i < NUMBER_OF_ALGORITHMS; i++) {
		results[i] = (alg_result*) malloc(sizeof(alg_result) * result_iterations);
	}

	for (i = 0; i < NUMBER_OF_ALGORITHMS; i++) {
		for (j = 0; j < result_iterations; j++) {
			results[i][j].success = 0;
			results[i][j].original_data_length = 0;
			results[i][j].ratio = 1.0;
			results[i][j].compress_time_us = 0.0;
			results[i][j].decompress_time_us = 0.0;
			results[i][j].memory_use = 0;
		}
	}
}

// http://www.programiz.com/c-programming/examples/standard-deviation
//float standard_deviation(float data[], int n) {
float standard_deviation(alg_result *data, int n) {
    float mean = 0.0, sum_deviation = 0.0;
    int i;
    for (i=0; i<n;++i) {
        mean += data[i].ratio;
    }
    mean = mean/n;
    for (i=0; i<n;++i)
    	sum_deviation += (data[i].ratio-mean)*(data[i].ratio-mean);
    return sqrt(sum_deviation / n);
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
	case 18: return "trle";
	case 19: return "mrle";
	default: break;
	}
	return "";
}

int TestBuf(unsigned char *in, unsigned int insize, unsigned int iteration, int algo) {
	unsigned int  outsize, bufsize = 0, k, err_count;
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
	if (algo <= 11 || algo == 15 || algo == 16 || algo == 18 || algo == 19) {
		bufsize = (insize * 104 + 50) / 100 + 384;
	}
	else if (algo > 11 && algo <= 14) {
		bufsize = LZG_MaxEncodedSize(insize);
	}
	else if (algo == 17) {
		bufsize = LZG_MaxEncodedSize(insize);
	}

	if (bufsize * 2 > BUF_SIZE) {
		printf("bufsize too large: %d\n", bufsize);
	}

	// allocate memory
//	out = (unsigned char *) malloc(2 * bufsize);
//	if (!out) {
//		printf("out of memory!\n");
//		return 0;
//	}

	// pointers to compression buffer and output memory
//	buf = &out[0];
//	out = &buf[bufsize];

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
//		work = malloc( sizeof(unsigned int) * (65536+insize) );
		if (work) {
			t0 = GetTime();
			outsize = LZ_CompressFast( in, buf, insize, work );
			t_comp = GetTime() - t0;
//			free( work );
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
	case 18:
		t0 = GetTime();
		outsize = bufsize;
		outsize = trlec(in, insize, buf);
		t_comp = GetTime() - t0;
		t0 = GetTime();
		trled(buf, outsize, out, insize);
		t_uncomp = GetTime() - t0;
		break;
	case 19:
		t0 = GetTime();
		outsize = bufsize;
		outsize = mrlec(in, insize, buf);
		t_comp = GetTime() - t0;
		t0 = GetTime();
		mrled(buf, out, insize);
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

			results[algo - 1][iteration].success = 1;
			results[algo - 1][iteration].original_data_length = insize;
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
//	free(out);

	return (outsize > 0) && (err_count == 0);
}


void analyse_results(unsigned int compression_iterations) {
	unsigned int total_success[NUMBER_OF_ALGORITHMS] = {0.0};
	unsigned int total_bytes[NUMBER_OF_ALGORITHMS] = {0.0};
	float total_ratio[NUMBER_OF_ALGORITHMS] = {0.0};
	float total_compress_time_us[NUMBER_OF_ALGORITHMS] = {0.0};
	float total_decompress_time_us[NUMBER_OF_ALGORITHMS] = {0.0};
	int i = 0, j = 0;

	for (i = 0; i < NUMBER_OF_ALGORITHMS; i++) {
		for (j = 0; j < compression_iterations; j++) {
			total_success[i] += results[i][j].success;
			total_bytes[i] += results[i][j].original_data_length;
			total_ratio[i] += results[i][j].ratio;
//			printf("  %s\t%f, %f\n", get_algorithm_name(i + 1), total_ratio[i], results[i][j].ratio);
			total_compress_time_us[i] += results[i][j].compress_time_us;
			total_decompress_time_us[i] += results[i][j].decompress_time_us;
		}
	}

	printf("alg\tbytes\tratio\tstddev\ttotal time\t\tscore\titerations\n");
	for (i = 0; i < NUMBER_OF_ALGORITHMS; i++) {
//		printf("%s\t%f, %f, %f\n", get_algorithm_name(i + 1), total_ratio[i], total_compress_time_us[i], total_decompress_time_us[i]);
		float mean_ratio = total_ratio[i] / compression_iterations;
		float mean_bytes = total_bytes[i] / compression_iterations;
		float mean_compress_time_us = total_compress_time_us[i] / compression_iterations;
		float mean_decompress_time_us = total_decompress_time_us[i] / compression_iterations;
		float mean_total_time_us = mean_compress_time_us + mean_decompress_time_us;
		float mean_combined = mean_total_time_us * mean_ratio;
		float std_dev = standard_deviation(results[i], compression_iterations);

		if (total_success[i] == compression_iterations && mean_ratio < 0.9 && mean_total_time_us < 100.0) {
			printf("%s\t%.0f\t%.2f\t%.2f\t%4.1f us\t(%4.1f, %4.1f)\t%5.1f\t%d\n", get_algorithm_name(i + 1), mean_bytes, mean_ratio, std_dev, mean_total_time_us, mean_compress_time_us, mean_decompress_time_us, mean_combined, compression_iterations);
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

// from http://stackoverflow.com/a/3564685/57743
int32_t EncodeInt32(int32_t value, unsigned char *out) {
//	int32_t out = 0;
	char first = 1;
	int out_size = 0;

	// zigzag encoding
//	value = (value >> 31) ^ (value << 1);

	while (first || value > 0) {
		first = 0;
		unsigned char lower7bits = (unsigned char) (value & 0x7f);
		value >>= 7;
		if (value > 0) {
			lower7bits |= 128;
		}
//		if (first == 0) {
//			out <<= 8;
//		}
//		out |= lower7bits;
		out[out_size] |= lower7bits;
		out_size++;
//		writer.Write(lower7bits);
	}

	return out_size;
}

int32_t logicalRightShift(int32_t x, int32_t n) {
    return (unsigned)x >> n;
}

//int32_t DecodeInt32(int32_t in) {
//	unsigned char more = 1;
//	int value = 0;
//	int shift = 0;
//
//	while (more) {
////		while ((in & 0xff000000) == 0) {
////			in = logicalRightShift(in, 8);
////		}
//		unsigned char lower7bits = in & 0xff000000;
//		more = (lower7bits & 128) != 0;
//		if (more) {
//			in = in << 8;
//		}
//		value |= (lower7bits & 0x7f) << shift;
//		shift += 7;
//	}
//
////	value = logicalRightShift(value, 1) ^ -(value & 1);	// decode zigzag
//	return value;
//}

int decode_vlq(unsigned char *in) {
    int result = 0;
    int offset = 0;
    do {
//        result = (result << 7) | (*in & 0x7F);
    	result |= *in << (7 * offset);
    	offset++;
    }
    while (*in++ & 0x80);
    return result;
}


// from https://en.wikipedia.org/wiki/LEB128
int32_t EncodeInt32_LEB128(int32_t value) {
	int32_t out = 0;
	int more = 1;
	unsigned char negative = (value < 0);
	int size = 32;
	char first = 1;

	while(more) {
		first = 0;
		unsigned char byte = value & 0x7f; //low order 7 bits of value;
		value >>= 7;
	  /* the following is unnecessary if the implementation of >>= uses an
		 arithmetic rather than logical shift for a signed left operand */
	  if (negative)
		value |= - (1 <<(size - 7)); /* sign extend */

	  /* sign bit of byte is second high order bit (0x40) */
	  if ((value == 0 && (byte & 0x40) == 0) || (value == -1 && (byte & 0x40) == 1))
		more = 0;
	  else
		  byte |= 0x80;//set high order bit of byte;

	  if (first == 0) {
			out <<= 8;
		}
		out |= byte;
	}
	return out;
}

//public static int DecodeInt32(this BinaryReader reader)
//    {
//        if (reader == null)
//            throw new ArgumentNullException("reader");
//
//        bool more = true;
//        int value = 0;
//        int shift = 0;
//        while (more)
//        {
//            byte lower7bits = reader.ReadByte();
//            more = (lower7bits & 128) != 0;
//            value |= (lower7bits & 0x7f) << shift;
//            shift += 7;
//        }
//        return value;
//    }


// from https://rosettacode.org/wiki/Variable-length_quantity#C
uint32_t to_seq(int32_t x, uint8_t *out) {
//	x = (x >> 31) ^ (x << 1);

	int i, j;
	for (i = 5; i > 0; i--) {
		if (x & 127ULL << i * 7) break;
	}
	for (j = 0; j <= i; j++) {
		out[j] = ((x >> ((i - j) * 7)) & 127) | 128;
//		if (j > 0 && out[j] == 0xFF && out[j - 1] == 0xFF) {
//			break;
//		}
	}

	out[i] ^= 128;
	return j;
}
int32_t from_seq(uint8_t *in, int32_t *bits) {
	int32_t r = 0;

	do {
		*bits += 7;
		r = (r << 7) | (int32_t)(*in & 127);
	} while (*in++ & 128);

//	r = logicalRightShift(r, 1) ^ -(r & 1);	// decode zigzag
	return r;
}


// from https://techoverflow.net/blog/2013/01/25/efficiently-encoding-variable-length-integers-in-cc/
size_t encodeVarint(int32_t value, uint8_t* output) {
	uint32_t value2 = (value >> 31) ^ (value << 1);
    size_t outputSize = 0;
    //While more than 7 bits of data are left, occupy the last output byte
    // and set the next byte flag
    while (value2 > 127) {
        //|128: Set the next byte flag
        output[outputSize] = ((uint8_t)(value2)) | 128;
        //Remove the seven bits we just wrote
        value2 >>= 7;
        outputSize++;
    }
    output[outputSize++] = ((uint8_t)value2) & 127;
    return outputSize;
}

/**
 * Decodes an unsigned variable-length integer using the MSB algorithm.
 * @param value A variable-length encoded integer of arbitrary size.
 * @param inputSize How many bytes are
 */
uint32_t decodeVarint(uint8_t* input, size_t inputSize) {
	uint32_t ret = 0;
	size_t i = 0;
    for (i = 0; i < inputSize; i++) {
        ret |= (input[i] & 127) << (7 * i);
        //If the next-byte flag is set
        if(!(input[i] & 128)) {
            break;
        }
    }
    ret = logicalRightShift(ret, 1) ^ -(ret & 1);	// decode zigzag
    return ret;
}


//void test_value(int32_t value) {
//	unsigned char buf[16] = {0};
//	int size = EncodeInt32(value, buf);
//	int32_t out = decode_vlq(buf);
//	printf("in: %d, encoded size: %d, decoded value: %d\n", value, size, out);
//}
void test_value2(int32_t value) {
	unsigned char buf[12] = {0};
	int32_t bits = 0;
	int size = to_seq(value, buf);
	int32_t out = from_seq(buf, &bits);
	printf("in: %d, encoded size: %d, %d bits (%x%x%x%x%x%x%x), decoded value: %d\n", value, size, bits, buf[0], buf[1], buf[2], buf[3], buf[4], buf[5], buf[6], out);
}
void test_value(int32_t value) {
	unsigned char buf[12] = {0};
	int size = encodeVarint(value, buf);
	int32_t out = decodeVarint(buf, size);
	printf("in: %d, encoded size: %d (%x%x%x%x%x%x%x), decoded value: %d\n", value, size, buf[0], buf[1], buf[2], buf[3], buf[4], buf[5], buf[6], out);
}

int main() {
	initialise_iec61850();	// initialise IEC 61850 library
	fp = init_pcap();		// initialise platform-specific libpcap network interface

	test_value(0);
	test_value(720000);
	test_value(-720000);
	test_value(3020000);
	test_value(-3020000);
//	printf("in: %x out %x, %d\n", 720000, EncodeInt32(720000), DecodeInt32(EncodeInt32(720000)));
//	printf("in: %x out %x, %d\n", -720000, EncodeInt32(-720000), DecodeInt32(EncodeInt32(-720000)));
//	printf("in: %x out %x, %d\n", -1720000, EncodeInt32(-1720000), DecodeInt32(EncodeInt32(-1720000)));
//	printf("in: %x out %x, %d\n", -3020000, EncodeInt32(-3020000), DecodeInt32(EncodeInt32(-3020000)));

	InitTimer();
	buf = (unsigned char *) malloc(BUF_SIZE);
	out = (unsigned char *) malloc(BUF_SIZE);
	work = malloc(sizeof(unsigned int) * (65536 + BUF_SIZE));

	double f_nominal = 50.0;
	double samplesPerCycle = 288.0;
	double f = 50.0;
	double w;
	double Vnom = 400000.0;
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

//	double t0 = 0.0, t1 = 0.0;;

	while (1) {
		//		LE_IED.S1.MUnn.LN0.MSVCB01.ASDU[0].svID[9] = (char) (((int)'0') + muNumber);
		//phi = (((double) rand()) / ((double) RAND_MAX)) * PI;

//		t0 = GetTime();

		for (t = 0; t < sample_rate; t++) {
			w = 2 * PI * f;
			theta = w * (((double) t) * Ts);
			//			printf("running\n");
			//			fflush(stdout);

			LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_1.Vol.instMag.i = toV(V, harmonic(1, 1.0, theta, 0)                   + harmonic(9, muNumber * 0.04, theta, 0)                   + harmonic(11, muNumber * 0.01, theta, 0));
			LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_2.Vol.instMag.i = toV(V, harmonic(1, 1.0, theta, - TWO_PI_OVER_THREE) + harmonic(9, muNumber * 0.02, theta, - TWO_PI_OVER_THREE) + harmonic(13, muNumber * 0.01, theta, - TWO_PI_OVER_THREE));
			LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_3.Vol.instMag.i = toV(V, harmonic(1, 1.0, theta, + TWO_PI_OVER_THREE) + harmonic(9, muNumber * 0.01, theta, + TWO_PI_OVER_THREE) + harmonic(15, muNumber * 0.01, theta, + TWO_PI_OVER_THREE));
			LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_4.Vol.instMag.i = LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_1.Vol.instMag.i + LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_2.Vol.instMag.i + LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_3.Vol.instMag.i;
//			LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_4.Vol.instMag.i = 0;

			LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_1.Amp.instMag.i = toI(I, harmonic(1, 1.0, theta - phi, 0)                   + harmonic(2, muNumber * 0.05, theta - phi, 0)                   + harmonic(3, 0.03, theta - phi, 0) + harmonic(5, 0.10, theta - phi, 0)                   + harmonic(7, 0.05, theta - phi, 0)                   + harmonic(9, 0.03, theta - phi, 0));
			LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_2.Amp.instMag.i = toI(I, harmonic(1, 0.9, theta - phi, - TWO_PI_OVER_THREE) + harmonic(2, muNumber * 0.05, theta - phi, + TWO_PI_OVER_THREE) + harmonic(3, 0.03, theta - phi, 0) + harmonic(5, 0.10, theta - phi, + TWO_PI_OVER_THREE) + harmonic(7, 0.05, theta - phi, - TWO_PI_OVER_THREE) + harmonic(9, 0.03, theta - phi, 0));
			LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_3.Amp.instMag.i = toI(I, harmonic(1, 0.8, theta - phi, + TWO_PI_OVER_THREE) + harmonic(2, muNumber * 0.05, theta - phi, - TWO_PI_OVER_THREE) + harmonic(3, 0.03, theta - phi, 0) + harmonic(5, 0.10, theta - phi, - TWO_PI_OVER_THREE) + harmonic(7, 0.05, theta - phi, + TWO_PI_OVER_THREE) + harmonic(9, 0.03, theta - phi, 0));
			LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_4.Amp.instMag.i = LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_1.Amp.instMag.i + LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_2.Amp.instMag.i + LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_3.Amp.instMag.i;
//			LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_4.Amp.instMag.i = 0;

			int len = sv_update_LE_IED_MUnn_MSVCB01_compress(bufOut);

			if (len > 0) {
				printf("len > 0: %d, %d bytes\n", t, len);
				for (i = 0; i < NUMBER_OF_ALGORITHMS; i++) {
					TestBuf(&bufOut[compression_start_offset - 1], len - compression_start_offset, compression_iterations, i + 1);
				}

				pcap_sendpacket(fp, bufOut, len);
				compression_iterations++;
			}

			if (t >= 72.00 - 1) {//result_iterations) {
//				t1 = GetTime() - t0;
//				printf("t1: %lf us\n", t1 * 1000);

				analyse_results(compression_iterations);
				return 0;
			}
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
