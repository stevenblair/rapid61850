/**
 * Rapid-prototyping protection schemes with IEC 61850
 *
 * Copyright (c) 2014 Steven Blair
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

#define WPCAP
#define HAVE_REMOTE
#ifdef _WIN32
#define WIN32_LEAN_AND_MEAN
#else
#include <unistd.h>
#endif


#include <pcap.h>
#include <math.h>
#include "iec61850.h"

#if JSON_INTERFACE == 1
#include "json\mongoose.h"
#include "json\json.h"
#endif


#define BUFFER_LENGTH	2048

pcap_t *fp;
char errbuf[PCAP_ERRBUF_SIZE];
unsigned char buf[BUFFER_LENGTH] = {0};
int len = 0;


#define PI					3.1415926535897932384626433832795
#define TWO_PI_OVER_THREE	2.0943951023931954923084289221863


int toI(double I, double value) {
	return (CTYPE_INT32) (I * value / 0.001);
}

int toV(double V, double value) {
	return (CTYPE_INT32) (V * value / 0.01);
}

double harmonic(double num, double mag, double theta, double phase) {
	return mag * sin((theta * num + phase));
}

void packet_handler(u_char *param, const struct pcap_pkthdr *header, const u_char *pkt_data) {
	gse_sv_packet_filter((unsigned char *) pkt_data, header->len);
}

pcap_t *init_pcap() {
	pcap_t *fpl;
    pcap_if_t *alldevs;
    pcap_if_t *used_if;

    // Retrieve the device list from the local machine
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
    fprintf(stdout, "%s\n", used_if->description);
#else
    fprintf(stdout, "%s\n%s\n", used_if->name, used_if->description);
#endif
    fflush(stdout);

	if ((fpl = pcap_open_live(used_if->name,	// name of the device
							 65536,				// portion of the packet to capture. It doesn't matter in this case
							 1,					// promiscuous mode (nonzero means promiscuous)
							 1000,				// read timeout
							 errbuf				// error buffer
							 )) == NULL)
	{
		fprintf(stderr, "\nUnable to open the adapter. %s is not supported by WinPcap\n", alldevs->name);
		exit(2);
	}

//    pcap_freealldevs(alldevs);

	return fpl;
}


/**
 * Returns a random number between 0.0 and 1.0.
 */
float getRand() {
	return (float) rand() / (float) RAND_MAX;
}


#define PI					3.1415926535897932384626433832795
#define TWO_PI_OVER_THREE	2.0943951023931954923084289221863



int main() {
	initialise_iec61850();
	fp = init_pcap();

#if JSON_INTERFACE == 1
	start_json_interface();


	double f_nominal = 50.0;
	double samplesPerCycle = 80.0;
	double f = 50.0;
	double w;
	double Vnom = 11000.0;
	double V = Vnom * sqrt(2) / sqrt(3);
	double Zmag = 10.0;
	double I = V / Zmag;
	double phi = 0.16666666679 * PI;
	double Ts = 1 / (f_nominal * samplesPerCycle);
	double theta = 0.0;
	int t = 0;


	srand(time(NULL));

	struct exampleJSON *relays[] = {&JSON.S1.C1.exampleJSON_1, &JSON2.S1.C1.exampleJSON_1, &JSON3.S1.C1.exampleJSON_1, &JSON4.S1.C1.exampleJSON_1, &JSON5.S1.C1.exampleJSON_1};
	int numberOfRelays = sizeof relays / sizeof relays[0];

	int timer = 0;
	int alarmTimer[numberOfRelays];
	int alarmTimerThreshold[numberOfRelays];
	int tripTimer[numberOfRelays];
	int tripTimerThreshold[numberOfRelays];
	int lampTestMonitor[numberOfRelays];
	int maxAlarms = 10;

	int i = 0;
//	for (i = 0; i < number?

	int len = 0;
	unsigned char bufOut[2048] = {0};

	float phaseVoltageRMS = (float) (V / sqrt(2));

	while (1) {
		float phaseCurrentMag = (I / sqrt(2));// + 80.0 * (float) rand() / (float) RAND_MAX;
		float phaseCurrentAng = -30.0 * (float) rand() / (float) RAND_MAX;

		if (++timer >= 1) {
			timer = 0;

			for (i = 0; i < numberOfRelays; i++) {
				float relayVoltageMagError = 1.0;//1.0 + 1.0 * getRand() / 100.0;
				float relayCurrentMagError = 1.0 + 30.0 * getRand() / 100.0;

				relays[i]->Hz.mag = 50.0 + getRand() / 100.0;

				relays[i]->SeqV.phsA.cVal.mag.f = phaseVoltageRMS * relayVoltageMagError;
				relays[i]->SeqV.phsA.cVal.ang.f = 0.0;
				relays[i]->SeqV.phsB.cVal.mag.f = 0.0;
				relays[i]->SeqV.phsB.cVal.ang.f = -120.0;
				relays[i]->SeqV.phsC.cVal.mag.f = 0.0;
				relays[i]->SeqV.phsC.cVal.ang.f = 120.0;
				relays[i]->SeqV.neut.cVal.mag.f = 0.0;
				relays[i]->SeqV.phsA.cVal.ang.f = 0.0;

				relays[i]->PhV.phsA.cVal.mag.f = phaseVoltageRMS * relayVoltageMagError;
				relays[i]->PhV.phsA.cVal.ang.f = 0.0;
				relays[i]->PhV.phsB.cVal.mag.f = phaseVoltageRMS * relayVoltageMagError;
				relays[i]->PhV.phsB.cVal.ang.f = -120.0;
				relays[i]->PhV.phsC.cVal.mag.f = phaseVoltageRMS * relayVoltageMagError;
				relays[i]->PhV.phsC.cVal.ang.f = 120.0;
				relays[i]->PhV.neut.cVal.mag.f = 0.0;
				relays[i]->PhV.phsA.cVal.ang.f = 0.0;

				relays[i]->V1.phsA.cVal.mag.f = phaseVoltageRMS * relayVoltageMagError;
				relays[i]->V1.phsA.cVal.ang.f = 0.0;
				relays[i]->V1.phsB.cVal.mag.f = 0.0;
				relays[i]->V1.phsB.cVal.ang.f = -120.0;
				relays[i]->V1.phsC.cVal.mag.f = 0.0;
				relays[i]->V1.phsC.cVal.ang.f = 120.0;
				relays[i]->V1.neut.cVal.mag.f = 0.0;
				relays[i]->V1.phsA.cVal.ang.f = 0.0;

				relays[i]->SeqA.phsA.cVal.mag.f = phaseCurrentMag * relayCurrentMagError;
				relays[i]->SeqA.phsA.cVal.ang.f = phaseCurrentAng;

				relays[i]->A1.phsA.cVal.mag.f = phaseCurrentMag * relayCurrentMagError;
				relays[i]->A1.phsA.cVal.ang.f = phaseCurrentAng;
				relays[i]->A1.phsB.cVal.mag.f = phaseCurrentMag * relayCurrentMagError;
				relays[i]->A1.phsB.cVal.ang.f = -120.0 + phaseCurrentAng;
				relays[i]->A1.phsC.cVal.mag.f = phaseCurrentMag * relayCurrentMagError;
				relays[i]->A1.phsC.cVal.ang.f = 120.0 + phaseCurrentAng;
				relays[i]->A1.neut.cVal.mag.f = 0.0;
				relays[i]->A1.neut.cVal.ang.f = 0.0;
			}
		}

		for (i = 0; i < numberOfRelays; i++) {
			if (++alarmTimer[i] >= alarmTimerThreshold[i] && relays[i]->Ind.NumOfAlarms < maxAlarms) {
				alarmTimer[i] = 0;
				relays[i]->Ind.NumOfAlarms++;
			}
			if (++tripTimer[i] >= tripTimerThreshold[i]) {
				tripTimer[i] = 0;
				relays[i]->Ind.Trip = 1;
			}

			if (lampTestMonitor[i] != relays[i]->Ind.LEDTest) {
				lampTestMonitor[i] = relays[i]->Ind.LEDTest;
				printf("Relay %i LED lamp test: %i\n", i + 1, relays[i]->Ind.LEDTest);
				fflush(stdout);
			}

			if (relays[i]->Ind.ResetIndications != 0) {
				relays[i]->Ind.ResetIndications = 0;
				relays[i]->Ind.Trip = 0;
				relays[i]->Ind.NumOfAlarms = 0;
				alarmTimer[i] = 0;
				tripTimer[i] = 0;
//				printf("Relay %i reset trips\n", i + 1);
//				fflush(stdout);
			}
		}
#ifdef _WIN32
		Sleep(1000);

		for (t = 0; t < JSON.S1.C1.LN0.MSVCB01.ASDU[JSON.S1.C1.LN0.MSVCB01.ASDUCount].smpRate; t++) {
			w = 2 * PI * f;
			theta = w * (((double) t) * Ts);
//			printf("running\n");
//			fflush(stdout);

			JSON.S1.C1.IEC_61850_9_2LETVTR_1.Vol.instMag.i = toV(V, harmonic(1, 1.0, theta, 0)                   + harmonic(3, 0.02, theta, 0) + harmonic(7, 0.01, theta, 0));
			JSON.S1.C1.IEC_61850_9_2LETVTR_2.Vol.instMag.i = toV(V, harmonic(1, 1.0, theta, - TWO_PI_OVER_THREE) + harmonic(3, 0.02, theta, 0) + harmonic(7, 0.01, theta, - TWO_PI_OVER_THREE));
			JSON.S1.C1.IEC_61850_9_2LETVTR_3.Vol.instMag.i = toV(V, harmonic(1, 1.0, theta, + TWO_PI_OVER_THREE) + harmonic(3, 0.02, theta, 0) + harmonic(7, 0.01, theta, + TWO_PI_OVER_THREE));
			JSON.S1.C1.IEC_61850_9_2LETVTR_4.Vol.instMag.i = JSON.S1.C1.IEC_61850_9_2LETVTR_1.Vol.instMag.i + JSON.S1.C1.IEC_61850_9_2LETVTR_2.Vol.instMag.i + JSON.S1.C1.IEC_61850_9_2LETVTR_3.Vol.instMag.i;

			JSON.S1.C1.IEC_61850_9_2LETCTR_1.Amp.instMag.i = toI(relays[0]->A1.phsA.cVal.mag.f, harmonic(1, 1.0, theta - phi, 0)                   + harmonic(2, 0.01, theta - phi, 0)                   + harmonic(3, 0.05, theta - phi, 0) + harmonic(5, 0.05, theta - phi, 0)                   + harmonic(7, 0.03, theta - phi, 0)                   + harmonic(9, 0.03, theta - phi, 0));
			JSON.S1.C1.IEC_61850_9_2LETCTR_2.Amp.instMag.i = toI(relays[0]->A1.phsA.cVal.mag.f, harmonic(1, 1.0, theta - phi, - TWO_PI_OVER_THREE) + harmonic(2, 0.01, theta - phi, + TWO_PI_OVER_THREE) + harmonic(3, 0.05, theta - phi, 0) + harmonic(5, 0.05, theta - phi, + TWO_PI_OVER_THREE) + harmonic(7, 0.03, theta - phi, - TWO_PI_OVER_THREE) + harmonic(9, 0.03, theta - phi, 0));
			JSON.S1.C1.IEC_61850_9_2LETCTR_3.Amp.instMag.i = toI(relays[0]->A1.phsA.cVal.mag.f, harmonic(1, 1.0, theta - phi, + TWO_PI_OVER_THREE) + harmonic(2, 0.01, theta - phi, - TWO_PI_OVER_THREE) + harmonic(3, 0.05, theta - phi, 0) + harmonic(5, 0.05, theta - phi, - TWO_PI_OVER_THREE) + harmonic(7, 0.03, theta - phi, + TWO_PI_OVER_THREE) + harmonic(9, 0.03, theta - phi, 0));
			JSON.S1.C1.IEC_61850_9_2LETCTR_4.Amp.instMag.i = JSON.S1.C1.IEC_61850_9_2LETCTR_1.Amp.instMag.i + JSON.S1.C1.IEC_61850_9_2LETCTR_2.Amp.instMag.i + JSON.S1.C1.IEC_61850_9_2LETCTR_3.Amp.instMag.i;

			len = sv_update_JSON_C1_MSVCB01(bufOut);
			if (len > 0) {
				pcap_sendpacket(fp, bufOut, len);
			}
		}

		len = gse_send_JSON_C1_MGSECB01(bufOut, 1, 255);
		if (len > 0) {
			pcap_sendpacket(fp, bufOut, len);
		}
#else
		usleep(1000000);
#endif
	}
#endif

	pcap_close(fp);

	return 0;
}
