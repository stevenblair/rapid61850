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

#define WPCAP
#define HAVE_REMOTE
#define WIN32_LEAN_AND_MEAN

#define TEST_LOCAL_SV_GSE	1

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <pcap.h>
#include <sys/time.h>
#include <math.h>
#include <windows.h>
#include <winsock2.h>

#include "iec61850.h"

#define PI				3.1415926535897932384626433832795
#define TWO_PI			6.283185307179586476925286766559
#define BUFFFER_LENGTH	2048

pcap_t *fp;
char errbuf[PCAP_ERRBUF_SIZE];
unsigned char buf[BUFFFER_LENGTH] = {0};
int len = 0;

//void DFT(struct simpleSAV *sav, struct simpleVector *vector, int N) {
//	int k = 0;
//	float re = 0, im = 0;
//
//	for (k = 0; k < N; k++) {
//		re += sav[(N - 1) - k].instMag.f * cos(TWO_PI * k / N);
//		im += sav[(N - 1) - k].instMag.f * sin(TWO_PI * k / N);
//	}
//
//	re = re * 2 / N;
//	im = im * 2 / N;
//
//	vector->mag.f = sqrt(re*re + im*im);
//	vector->ang.f = atan2(im, re);
//}

void packet_handler(u_char *param, const struct pcap_pkthdr *header, const u_char *pkt_data) {
    if (header->len == 737) {	// hardcoded packet length for demo
		svDecode((unsigned char *) pkt_data, header->len);


    }
}

pcap_t *initWinpcap() {
	pcap_t *fpl;
    pcap_if_t *alldevs;
    pcap_if_t *used_if;

    /* Retrieve the device list from the local machine */
    if (pcap_findalldevs_ex(PCAP_SRC_IF_STRING, NULL /* auth is not needed */, &alldevs, errbuf) == -1) {
        fprintf(stderr, "Error in pcap_findalldevs_ex: %s\n", errbuf);
        exit(1);
    }

    used_if = alldevs;

    // find VirtualBox's "Sun" interface
    /*while (strstr(used_if->description, "Sun") == NULL && used_if->next != NULL) {
    	used_if = used_if->next;
    }*/

    fprintf(stdout, "%s\n", used_if->description);
    fflush(stdout);

	if ((fpl = pcap_open_live(used_if->name,		// name of the device
							 65536,			// portion of the packet to capture. It doesn't matter in this case
							 1,				// promiscuous mode (nonzero means promiscuous)
							 1000,			// read timeout
							 errbuf			// error buffer
							 )) == NULL)
	{
		fprintf(stderr, "\nUnable to open the adapter. %s is not supported by WinPcap\n", alldevs->name);
		exit(2);
	}

    //pcap_freealldevs(alldevs);

	return fpl;
}

int main() {
    int len = 0;
	int i = 0;

	initialise_iec61850();
	fp = initWinpcap();

	Send.S1.D1.sendUD_1.ud.bbTVTR = 11000;

	for (i = 0; i < Send.S1.D1.LN0.udCB.noASDU; i++) {
		len = Send.S1.D1.LN0.udCB.update(buf);
	}

	if (len > 0) {
		pcap_sendpacket(fp, buf, len);
		gse_sv_packet_filter(buf, len);

		printf("SV value [0]: %d, SV value [15]: %d", Recv.S1.D1.recvUD_1.sv_inputs_udCB.Send_D1_ud[0].D1__GGIO_1_ud.bbTVTR, Recv.S1.D1.recvUD_1.sv_inputs_udCB.Send_D1_ud[15].D1__GGIO_1_ud.bbTVTR);
		fflush(stdout);
	}

	return 0;


	while (1) {
		pcap_loop(fp, 1, packet_handler, NULL);    // capture SV packet
		Sleep(1);
	}

	pcap_close(fp);

	return 0;
}
