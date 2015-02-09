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

    used_if = alldevs->next->next->next;

#ifdef _WIN32
    fprintf(stdout, "%s\n", used_if->description);
#else
    fprintf(stdout, "%s\n", used_if->name);
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

int main() {
	initialise_iec61850();
	fp = init_pcap();

#if JSON_INTERFACE == 1
	start_json_interface();

	srand(time(NULL));

	struct exampleJSON *relays[] = {&JSON.S1.C1.exampleJSON_1, &JSON.S1.C1.exampleJSON_2, &JSON.S1.C1.exampleJSON_3, &JSON.S1.C1.exampleJSON_4, &JSON.S1.C1.exampleJSON_5};
	int numberOfRelays = sizeof relays / sizeof relays[0];

	int timer = 0;
	int alarmTimer[numberOfRelays];
	int alarmTimerThreshold[numberOfRelays];
	int tripTimer[numberOfRelays];
	int tripTimerThreshold[numberOfRelays];
	int lampTestMonitor[numberOfRelays];
	int maxAlarms = 10;

	int i = 0;
	for (i = 0; i < numberOfRelays; i++) {
		alarmTimer[i] = 0;
		alarmTimerThreshold[i] = (int) 20000 * getRand();
		tripTimer[i] = 0;
		tripTimerThreshold[i] = (int) 100000 * getRand();
		lampTestMonitor[i] = relays[i]->Ind.LEDTest;
//		relays[i]->Ind.Trip = 1;
	}

	float phaseVoltageMag = (float) (11000.0 / sqrt(3));

	while (1) {
		if (++timer >= 5) {
			timer = 0;

			for (i = 0; i < numberOfRelays; i++) {
				float phaseCurrentMag = 200.0 + 50.0 * (float) rand() / (float) RAND_MAX;
				float phaseCurrentAng = -30.0 * (float) rand() / (float) RAND_MAX;

				relays[i]->Hz.mag = 50.0 + getRand() / 100.0;

				relays[i]->SeqV.phsA.cVal.mag.f = phaseVoltageMag;
				relays[i]->SeqV.phsA.cVal.ang.f = 0.0;
				relays[i]->SeqV.phsB.cVal.mag.f = 0.0;
				relays[i]->SeqV.phsB.cVal.ang.f = -120.0;
				relays[i]->SeqV.phsC.cVal.mag.f = 0.0;
				relays[i]->SeqV.phsC.cVal.ang.f = 120.0;
				relays[i]->SeqV.neut.cVal.mag.f = 0.0;
				relays[i]->SeqV.phsA.cVal.ang.f = 0.0;

				relays[i]->PhV.phsA.cVal.mag.f = phaseVoltageMag;
				relays[i]->PhV.phsA.cVal.ang.f = 0.0;
				relays[i]->PhV.phsB.cVal.mag.f = phaseVoltageMag;
				relays[i]->PhV.phsB.cVal.ang.f = -120.0;
				relays[i]->PhV.phsC.cVal.mag.f = phaseVoltageMag;
				relays[i]->PhV.phsC.cVal.ang.f = 120.0;
				relays[i]->PhV.neut.cVal.mag.f = 0.0;
				relays[i]->PhV.phsA.cVal.ang.f = 0.0;

				relays[i]->V1.phsA.cVal.mag.f = phaseVoltageMag;
				relays[i]->V1.phsA.cVal.ang.f = 0.0;
				relays[i]->V1.phsB.cVal.mag.f = 0.0;
				relays[i]->V1.phsB.cVal.ang.f = -120.0;
				relays[i]->V1.phsC.cVal.mag.f = 0.0;
				relays[i]->V1.phsC.cVal.ang.f = 120.0;
				relays[i]->V1.neut.cVal.mag.f = 0.0;
				relays[i]->V1.phsA.cVal.ang.f = 0.0;

				relays[i]->SeqA.phsA.cVal.mag.f = phaseCurrentMag;
				relays[i]->SeqA.phsA.cVal.ang.f = phaseCurrentAng;

				relays[i]->A1.phsA.cVal.mag.f = phaseCurrentMag;
				relays[i]->A1.phsA.cVal.ang.f = phaseCurrentAng;
				relays[i]->A1.phsB.cVal.mag.f = phaseCurrentMag;
				relays[i]->A1.phsB.cVal.ang.f = -120.0 + phaseCurrentAng;
				relays[i]->A1.phsC.cVal.mag.f = phaseCurrentMag;
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
		Sleep(1);
#else
		usleep(1000);
#endif
	}
#endif

	pcap_close(fp);

	return 0;
}
