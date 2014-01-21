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
#ifdef _WIN32
#define WIN32_LEAN_AND_MEAN
#endif


#include <pcap.h>
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

//    pcap_freealldevs(alldevs);

	return fpl;
}


int main() {
	initialise_iec61850();
	fp = init_pcap();

#if JSON_INTERFACE == 1
	start_json_interface();

#ifdef USE_SSL
	// generate and print out hash, to be copied into password file
	// WARNING: for convenience only; do not store passwords in plain text in production code
	char hash[33];
	mg_md5(hash, "admin", ":", "localhost", ":", "admin", NULL);
	printf("%s\n", hash);
	fflush(stdout);
#endif

	while (1) {
#ifndef USE_SSL
		int port;
		int reply_len;
		char *reply;

		// test get values
		for (port = 8001; port <= 8012; port++) {
			reply = send_http_request(port, &reply_len, "GET", "/");
			free(reply);
			Sleep(1);
		}

		// test get definition
		for (port = 8001; port <= 8012; port++) {
			reply = send_http_request(port, &reply_len, "GET", "/definition/");
			free(reply);
			Sleep(1);
		}

		// test get directory
		for (port = 8001; port <= 8012; port++) {
			char *reply = send_http_request(port, &reply_len, "GET", "/directory/");
			free(reply);
			Sleep(1);
		}

		// test set values
		{
			float x = (float) rand() / (float) (RAND_MAX / 10000.0);
			char value[64] = {0};
			sprintf(value, "%f", x);
			reply = send_http_request_post(8012, &reply_len, "/C1/exampleMMXU_1.A.phsA.cVal.mag.f", value);
			free(reply);
			Sleep(1);

			sprintf(value, "%d", (int) x);
			reply = send_http_request_post(8012, &reply_len, "/C1/exampleMMXU_1.A.phsA.testInteger", value);
			free(reply);
			Sleep(1);

			reply = send_http_request_post(8012, &reply_len, "/C1/LN0.NamPlt.configRev", "abcdefgh");
			free(reply);
			Sleep(100);

			reply = send_http_request_post(8012, &reply_len, "/C1/LN0.NamPlt.configRev", "xyz");
			free(reply);
			Sleep(100);

			reply = send_http_request_post(8012, &reply_len, "/C1/LN0.NamPlt.configRev", "1234567890");
			free(reply);
			Sleep(100);
		}
#else
		Sleep(100);
#endif
	}
#endif

	pcap_close(fp);

	return 0;
}
