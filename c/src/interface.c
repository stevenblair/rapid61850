
#include "interface.h"

unsigned char bufIn[2048] = {0};
unsigned char bufOut[2048] = {0};

void D1Q1SB4_S1_C1_RSYNa_1_gse_inputs_ItlPositions_datasetDecodeDone(CTYPE_INT32U timeAllowedToLive, CTYPE_TIMESTAMP T, CTYPE_INT32U stNum, CTYPE_INT32U sqNum) {

}

void start() {
	initialise_iec61850();

	// initialise platform-specific libpcap network interface

	// initialise send() functions for each SV and GSE control?

	// initialise callback wrappers?
	D1Q1SB4.S1.C1.RSYNa_1.gse_inputs_ItlPositions.datasetDecodeDone = &D1Q1SB4_S1_C1_RSYNa_1_gse_inputs_ItlPositions_datasetDecodeDone;
}

void stop() {
	// close network interface
}

int readPacket() {
	// read from Ethernet packet here
	int len = 0;

	gse_sv_packet_filter(bufIn, len);

	return 0;
}

// auto-generated list of SV and GSE send wrappers; these could be called directly, but send() functions in LN structure would be better
int sv_update_E1Q1SB1_C1_Volt_buf() {
	int len = sv_update_E1Q1SB1_C1_Volt(bufOut);

	if (len > 0) {
		// send packet here
	}

	return len;
}
int gse_send_D1Q1SB4_C1_MMXUResult_buf(CTYPE_BOOLEAN statusChange, CTYPE_INT32U timeAllowedToLive) {
	int len = gse_send_D1Q1SB4_C1_MMXUResult(bufOut, statusChange, timeAllowedToLive);

	if (len > 0) {
		// send packet here
	}

	return len;
}
