/*
 * interface.h
 *
 *  Created on: 16 Mar 2012
 *      Author: Steven
 */

#ifndef INTERFACE_H_
#define INTERFACE_H_

#include "iec61850.h"

extern unsigned char bufIn[2048];
extern unsigned char bufOut[2048];

void D1Q1SB4_S1_C1_RSYNa_1_gse_inputs_ItlPositions_datasetDecodeDone(CTYPE_INT32U timeAllowedToLive, CTYPE_TIMESTAMP T, CTYPE_INT32U stNum, CTYPE_INT32U sqNum);

void start();

void stop();

// auto-generated list of SV and GSE send wrappers
int sv_update_E1Q1SB1_C1_Volt_buf();
int gse_send_D1Q1SB4_C1_MMXUResult_buf(CTYPE_BOOLEAN statusChange, CTYPE_INT32U timeAllowedToLive);

int readPacket();


#endif /* INTERFACE_H_ */
