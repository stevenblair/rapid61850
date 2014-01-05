/**
 * Rapid-prototyping protection schemes with IEC 61850
 *
 * Copyright (c) 2012 Steven Blair
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

#if HIGH_LEVEL_INTERFACE == 0
	#define WPCAP
	#define HAVE_REMOTE
	#define WIN32_LEAN_AND_MEAN

	#include <pcap.h>
#endif
#include "iec61850.h"
#if HIGH_LEVEL_INTERFACE == 1
#include "interface.h"
#endif

#include "jsonRPC.h"

#if HIGH_LEVEL_INTERFACE == 0

#define BUFFER_LENGTH	2048

pcap_t *fp;
char errbuf[PCAP_ERRBUF_SIZE];
unsigned char buf[BUFFER_LENGTH] = {0};
int len = 0;

void packet_handler(u_char *param, const struct pcap_pkthdr *header, const u_char *pkt_data) {
	gse_sv_packet_filter((unsigned char *) pkt_data, header->len);
}

pcap_t *initWinpcap() {
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

    //pcap_freealldevs(alldevs);

	return fpl;
}
#endif

int main() {
#if HIGH_LEVEL_INTERFACE == 1
	start();

	interface_gse_send_E1Q1SB1_C1_Performance(1, 512);

	return 0;
#else
    int len = 0;

	initialise_iec61850();
	fp = initWinpcap();

	srand(time(NULL));
	float valueGSE = (float) rand() / (float) RAND_MAX;
	float valueSV = (float) rand() / (float) RAND_MAX;

	// test GOOSE
	E1Q1SB1.S1.C1.TVTRa_1.Vol.instMag.f = valueGSE;
	len = E1Q1SB1.S1.C1.LN0.ItlPositions.send(buf, 0, 512);
	pcap_sendpacket(fp, buf, len);

	gse_sv_packet_filter(buf, len);
	printf("GSE test: %s\n", D1Q1SB4.S1.C1.RSYNa_1.gse_inputs_ItlPositions.E1Q1SB1_C1_Positions.C1_TVTR_1_Vol_instMag.f == valueGSE ? "passed" : "failed");
	fflush(stdout);

	// test database lookup
	unsigned char databaseValueResult = 0;
	Item *ln = getLN("E1Q1SB1", "C1", "TVTRa_1");
	if (ln != NULL) {
		Item *valueDatabaseRef = getItem(ln, 3, "Vol", "instMag", "f");
		if (valueDatabaseRef != NULL) {
			float *databaseValue = (float *) (valueDatabaseRef->data);
			if (*databaseValue == valueGSE) {
				databaseValueResult = TRUE;
			}
		}
		else {
			printf("Database lookup test: item null\n");
		}
	}
	else {
		printf("Database lookup test: LN null\n");
	}
	printf("Database lookup test: %s\n", databaseValueResult ? "passed" : "failed");
	fflush(stdout);

	// test database lookup 2
	Item *valueDatabaseRef2 = getItemFromPath("E1Q1SB1", "C1/TVTRa_1.Vol.instMag.f");
	char databaseBuf[64] = {0};
	itemToJSON(databaseBuf, valueDatabaseRef2);
	printf("Database lookup test 2: %f, %s\n", *(float *) valueDatabaseRef2->data, databaseBuf);
	fflush(stdout);

	// test database print
	char printBuf[10000];
	int charsPrinted =  itemTreeToJSON(printBuf, getIED("E1Q1SB1"), 0);
	printf("Database print test:\n");
	printf("%d\n%s\n", charsPrinted, printBuf);
	fflush(stdout);

	// test Sampled Values
	E1Q1SB1.S1.C1.exampleRMXU_1.AmpLocPhsA.instMag.f = valueSV;
	int i = 0;
	for (i = 0; i < E1Q1SB1.S1.C1.LN0.rmxuCB.noASDU; i++) {
		len = E1Q1SB1.S1.C1.LN0.rmxuCB.update(buf);

		if (len > 0) {
			pcap_sendpacket(fp, buf, len);
			gse_sv_packet_filter(buf, len);

			printf("SV test: %s\n", D1Q1SB4.S1.C1.exampleMMXU_1.sv_inputs_rmxuCB.E1Q1SB1_C1_rmxu[15].C1_RMXU_1_AmpLocPhsA.instMag.f == valueSV ? "passed" : "failed");
			fflush(stdout);
		}
	}

	pcap_close(fp);

	return 0;
#endif
}
