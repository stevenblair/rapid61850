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
#define BUFFFER_LENGTH	1024

pcap_t *fp;
char errbuf[PCAP_ERRBUF_SIZE];
unsigned char buf[BUFFFER_LENGTH] = {0};
int len = 0;

void DFT(struct simpleSAV *sav, struct simpleVector *vector, int N) {
	int k = 0;
	float re = 0, im = 0;

	for (k = 0; k < N; k++) {
		re += sav[(N - 1) - k].instMag.f * cos(TWO_PI * k / N);
		im += sav[(N - 1) - k].instMag.f * sin(TWO_PI * k / N);
	}

	re = re * 2 / N;
	im = im * 2 / N;

	vector->mag.f = sqrt(re*re + im*im);
	vector->ang.f = atan2(im, re);
}

void packet_handler(u_char *param, const struct pcap_pkthdr *header, const u_char *pkt_data) {
    if (header->len == 737) {	// hardcoded packet length for demo
		svDecode((unsigned char *) pkt_data, header->len);

		DFT(D1Q1SB4.S1.C1.exampleMMXU_1.sv_inputs_rmxuCB.E1Q1SB1_C1_rmxu.C1__RMXU_1_AmpLocPhsA, &D1Q1SB4.S1.C1.exampleMMXU_1.A.phsA.cVal, 16);
		DFT(D1Q1SB4.S1.C1.exampleMMXU_1.sv_inputs_rmxuCB.E1Q1SB1_C1_rmxu.C1__RMXU_1_AmpLocPhsB, &D1Q1SB4.S1.C1.exampleMMXU_1.A.phsB.cVal, 16);
		DFT(D1Q1SB4.S1.C1.exampleMMXU_1.sv_inputs_rmxuCB.E1Q1SB1_C1_rmxu.C1__RMXU_1_AmpLocPhsC, &D1Q1SB4.S1.C1.exampleMMXU_1.A.phsC.cVal, 16);
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
	unsigned int loops = 0;
	unsigned int gooseLoop = 0;

	SOCKET sock;                        // Socket descriptor
    SOCKET client = INVALID_SOCKET;
    char tcpBuffer[BUFFFER_LENGTH]; // Buffer for echo string
    char recvBuffer[BUFFFER_LENGTH]; // Buffer for echo string
    int len = 0;
    int lenRecv = 0;
    WSADATA wsaData;                 // Structure for WinSock setup communication
    struct sockaddr_in sin;
    int lengthSin = sizeof sin;
    memset(&sin, 0, lengthSin);
    sin.sin_family = AF_INET;
    sin.sin_addr.s_addr = INADDR_ANY;
    sin.sin_port = htons(12345);

    if (WSAStartup(MAKEWORD(2, 0), &wsaData) != 0) { // Load Winsock 2.0 DLL
        fprintf(stderr, "WSAStartup() failed: %d", WSAGetLastError());
        exit(1);
    }

    if ((sock = socket(PF_INET, SOCK_STREAM, IPPROTO_TCP)) == SOCKET_ERROR) {
        fprintf(stderr, "socket() failed: %d", WSAGetLastError());
        exit(1);
    }

    // set socket non-blocking
    u_long mode = 1;
    if (ioctlsocket(sock, FIONBIO, &mode) != NO_ERROR) {
    	printf("ioctlsocket() failed: %d\n", WSAGetLastError());
    }

    /*BOOL bOptVal = TRUE;
    int bOptLen = sizeof(BOOL);
    if (setsockopt(sock, SOL_SOCKET, SO_KEEPALIVE, (char*)&bOptVal, bOptLen) != SOCKET_ERROR) {
      //printf("Set SO_KEEPALIVE: ON\n");
    }*/

    if (bind(sock, (struct sockaddr *) &sin, lengthSin) == SOCKET_ERROR) {
        fprintf(stderr, "bind() failed: %d", WSAGetLastError());
        exit(1);
    }

    if (listen(sock, SOMAXCONN) == SOCKET_ERROR) {
        fprintf(stderr, "listen() failed: %d", WSAGetLastError());
        exit(1);
    }

	initialise_iec61850();
	fp = initWinpcap();

	E1Q1SB1.S1.C1.TVTRa_1.Vol.instMag.f = 0;

	while (1) {
		pcap_loop(fp, 1, packet_handler, NULL);    // capture SV packet

		if (++loops >= 16) {
			loops = 0;

			if (++gooseLoop >= 10) {
				gooseLoop = 0;

				len = gse_send_ItlPositions_Itl(buf, 0, 512);

				if (pcap_sendpacket(fp, buf, len) != 0) {
					fprintf(stderr,"\nError sending the packet: %s\n", pcap_geterr(fp));
				}
			}

			if (client != INVALID_SOCKET) {
				len = sprintf(tcpBuffer, "%f %f %f %f %f %f\n", D1Q1SB4.S1.C1.exampleMMXU_1.A.phsA.cVal.mag.f, 180 * D1Q1SB4.S1.C1.exampleMMXU_1.A.phsA.cVal.ang.f / PI, D1Q1SB4.S1.C1.exampleMMXU_1.A.phsB.cVal.mag.f, 180 * D1Q1SB4.S1.C1.exampleMMXU_1.A.phsB.cVal.ang.f / PI, D1Q1SB4.S1.C1.exampleMMXU_1.A.phsC.cVal.mag.f, 180 * D1Q1SB4.S1.C1.exampleMMXU_1.A.phsC.cVal.ang.f / PI);
				if (send(client, tcpBuffer, len, 0) == SOCKET_ERROR) {
					client = INVALID_SOCKET;
					continue;
				}

				fd_set sockets;					// contains list of sockets for select
				sockets.fd_count = 1;			// one socket
				sockets.fd_array[0] = client;	// add it
				struct timeval timevalInfo;		// tells select how long to wait
				timevalInfo.tv_sec = 0;
				timevalInfo.tv_usec = 1;		// wait for 1

				//call select to determine readability of function
				int sret = select(0, &sockets, NULL, NULL, &timevalInfo);

				if (sret > 0) {
					lenRecv = recv(client, recvBuffer, 1, 0);
					if (lenRecv > 0) {
						if (recvBuffer[0] == '1') {
							E1Q1SB1.S1.C1.TVTRa_1.Vol.instMag.f = 1;
						}
						else {
							E1Q1SB1.S1.C1.TVTRa_1.Vol.instMag.f = 0;
						}

						len = gse_send_ItlPositions_Itl(buf, 0, 512);

						if (pcap_sendpacket(fp, buf, len) != 0) {
							fprintf(stderr,"\nError sending the packet: %s\n", pcap_geterr(fp));
						}
					}
				}
			}
			else {
				client = accept(sock, (struct sockaddr *) &sin, &lengthSin);
				if (client == SOCKET_ERROR) {
					client = INVALID_SOCKET;
				}
			}
		}
		Sleep(1);
	}

	pcap_close(fp);

	return 0;
}
