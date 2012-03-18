
#include "interface.h"
#include "interfaceSendPacket.h"

unsigned char bufIn[2048] = {0};
unsigned char bufOut[2048] = {0};

pcap_t *fp;
char errbuf[PCAP_ERRBUF_SIZE];

pcap_t *init_pcap() {
	pcap_t *fpl;
    pcap_if_t *alldevs;
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

    // find VirtualBox's "Sun" interface
    /*while (strstr(used_if->description, "Sun") == NULL && used_if->next != NULL) {
    	used_if = used_if->next;
    }*/

    fprintf(stdout, "network interface: %s\n", used_if->description);
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

    pcap_freealldevs(alldevs);

	return fpl;
}

void start() {
	initialise_iec61850();	// initialise IEC 61850 library

	fp = init_pcap();	// initialise platform-specific libpcap network interface

	// initialise send() functions for each SV and GSE control?

	// initialise callback wrappers?
	//D1Q1SB4.S1.C1.RSYNa_1.gse_inputs_ItlPositions.datasetDecodeDone = &D1Q1SB4_S1_C1_RSYNa_1_gse_inputs_ItlPositions_datasetDecodeDone;
}

void stop() {
	pcap_close(fp);	// close network interface
}

int readPacket() {
	int len = 0;	// read from Ethernet packet

	gse_sv_packet_filter(bufIn, len);

	return 0;
}

