/*
 * interface.h
 *
 *  Created on: 16 Mar 2012
 *      Author: Steven
 */

#ifndef INTERFACE_H_
#define INTERFACE_H_

#include "iec61850.h"
#include "interfaceSendPacket.h"

//#if INTERFACE_SUPPORTED == 1

#ifdef _WIN32
	#define WPCAP
	#define HAVE_REMOTE
	#define WIN32_LEAN_AND_MEAN
#endif
#include <pcap.h>

extern unsigned char bufIn[2048];
extern unsigned char bufOut[2048];

extern pcap_t *fp;

//void D1Q1SB4_S1_C1_RSYNa_1_gse_inputs_ItlPositions_datasetDecodeDone(CTYPE_INT32U timeAllowedToLive, CTYPE_TIMESTAMP T, CTYPE_INT32U stNum, CTYPE_INT32U sqNum);

void start();
void stop();
int readPacket();

//#endif

#endif /* INTERFACE_H_ */
