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

#include "ied.h"
#include "sv.h"
#include "svPacketData.h"
#include "svDecode.h"
#include "svEncode.h"






// returns 1 if buf contains valid packet data
int sv_update_E1Q1SB1_C1_PerformanceSV(unsigned char *buf) {
	int size = encode_control_E1Q1SB1_C1_PerformanceSV(E1Q1SB1.S1.C1.LN0.PerformanceSV.ASDU[E1Q1SB1.S1.C1.LN0.PerformanceSV.ASDUCount].data.data);
	E1Q1SB1.S1.C1.LN0.PerformanceSV.ASDU[E1Q1SB1.S1.C1.LN0.PerformanceSV.ASDUCount].data.size = size;

	E1Q1SB1.S1.C1.LN0.PerformanceSV.ASDU[E1Q1SB1.S1.C1.LN0.PerformanceSV.ASDUCount].smpCnt = E1Q1SB1.S1.C1.LN0.PerformanceSV.sampleCountMaster;
	E1Q1SB1.S1.C1.LN0.PerformanceSV.sampleCountMaster++;

	if (++E1Q1SB1.S1.C1.LN0.PerformanceSV.ASDUCount == E1Q1SB1.S1.C1.LN0.PerformanceSV.noASDU) {
		E1Q1SB1.S1.C1.LN0.PerformanceSV.ASDUCount = 0;
		return svEncodePacket(&E1Q1SB1.S1.C1.LN0.PerformanceSV, buf);
	}

	return 0;
}

// returns 1 if buf contains valid packet data
int sv_update_E1Q1SB1_C1_Volt(unsigned char *buf) {
	int size = encode_control_E1Q1SB1_C1_Volt(E1Q1SB1.S1.C1.LN0.Volt.ASDU[E1Q1SB1.S1.C1.LN0.Volt.ASDUCount].data.data);
	E1Q1SB1.S1.C1.LN0.Volt.ASDU[E1Q1SB1.S1.C1.LN0.Volt.ASDUCount].data.size = size;

	E1Q1SB1.S1.C1.LN0.Volt.ASDU[E1Q1SB1.S1.C1.LN0.Volt.ASDUCount].smpCnt = E1Q1SB1.S1.C1.LN0.Volt.sampleCountMaster;
	E1Q1SB1.S1.C1.LN0.Volt.sampleCountMaster++;

	if (++E1Q1SB1.S1.C1.LN0.Volt.ASDUCount == E1Q1SB1.S1.C1.LN0.Volt.noASDU) {
		E1Q1SB1.S1.C1.LN0.Volt.ASDUCount = 0;
		return svEncodePacket(&E1Q1SB1.S1.C1.LN0.Volt, buf);
	}

	return 0;
}

// returns 1 if buf contains valid packet data
int sv_update_E1Q1SB1_C1_rmxuCB(unsigned char *buf) {
	int size = encode_control_E1Q1SB1_C1_rmxuCB(E1Q1SB1.S1.C1.LN0.rmxuCB.ASDU[E1Q1SB1.S1.C1.LN0.rmxuCB.ASDUCount].data.data);
	E1Q1SB1.S1.C1.LN0.rmxuCB.ASDU[E1Q1SB1.S1.C1.LN0.rmxuCB.ASDUCount].data.size = size;

	E1Q1SB1.S1.C1.LN0.rmxuCB.ASDU[E1Q1SB1.S1.C1.LN0.rmxuCB.ASDUCount].smpCnt = E1Q1SB1.S1.C1.LN0.rmxuCB.sampleCountMaster;
	E1Q1SB1.S1.C1.LN0.rmxuCB.sampleCountMaster++;

	if (++E1Q1SB1.S1.C1.LN0.rmxuCB.ASDUCount == E1Q1SB1.S1.C1.LN0.rmxuCB.noASDU) {
		E1Q1SB1.S1.C1.LN0.rmxuCB.ASDUCount = 0;
		return svEncodePacket(&E1Q1SB1.S1.C1.LN0.rmxuCB, buf);
	}

	return 0;
}

void init_sv() {
	int i = 0;

	E1Q1SB1.S1.C1.LN0.PerformanceSV.noASDU = 1;
	E1Q1SB1.S1.C1.LN0.PerformanceSV.ethHeaderData.destMACAddress[0] = 0x01;
	E1Q1SB1.S1.C1.LN0.PerformanceSV.ethHeaderData.destMACAddress[1] = 0x0C;
	E1Q1SB1.S1.C1.LN0.PerformanceSV.ethHeaderData.destMACAddress[2] = 0xCD;
	E1Q1SB1.S1.C1.LN0.PerformanceSV.ethHeaderData.destMACAddress[3] = 0x04;
	E1Q1SB1.S1.C1.LN0.PerformanceSV.ethHeaderData.destMACAddress[4] = 0x00;
	E1Q1SB1.S1.C1.LN0.PerformanceSV.ethHeaderData.destMACAddress[5] = 0x01;
	E1Q1SB1.S1.C1.LN0.PerformanceSV.ethHeaderData.APPID = 0x4000;
	E1Q1SB1.S1.C1.LN0.PerformanceSV.ethHeaderData.VLAN_ID = 0x123;
	E1Q1SB1.S1.C1.LN0.PerformanceSV.ethHeaderData.VLAN_PRIORITY = 0x4;
	E1Q1SB1.S1.C1.LN0.PerformanceSV.ASDU = (struct ASDU *) malloc(1 * sizeof(struct ASDU));
	for (i = 0; i < 1; i++) {
		E1Q1SB1.S1.C1.LN0.PerformanceSV.ASDU[i].svID = (unsigned char *) malloc(12);
		strncpy((char *) E1Q1SB1.S1.C1.LN0.PerformanceSV.ASDU[i].svID, "Performance\0", 12);
		E1Q1SB1.S1.C1.LN0.PerformanceSV.ASDU[i].datset = (unsigned char *) malloc(12);
		strncpy((char *) E1Q1SB1.S1.C1.LN0.PerformanceSV.ASDU[i].datset, "Performance\0", 12);
		E1Q1SB1.S1.C1.LN0.PerformanceSV.ASDU[i].smpCnt = 0;
		E1Q1SB1.S1.C1.LN0.PerformanceSV.ASDU[i].confRev = 1;
		E1Q1SB1.S1.C1.LN0.PerformanceSV.ASDU[i].smpSynch = 1;
		E1Q1SB1.S1.C1.LN0.PerformanceSV.ASDU[i].showRefrTm = 1;
		E1Q1SB1.S1.C1.LN0.PerformanceSV.ASDU[i].showDatset = 0;
		E1Q1SB1.S1.C1.LN0.PerformanceSV.ASDU[i].showSmpRate = 1;
		E1Q1SB1.S1.C1.LN0.PerformanceSV.ASDU[i].smpRate = 4800;
		E1Q1SB1.S1.C1.LN0.PerformanceSV.ASDU[i].data.size = 0;
	}
	E1Q1SB1.S1.C1.LN0.PerformanceSV.ASDUCount = 0;
	E1Q1SB1.S1.C1.LN0.PerformanceSV.update = &sv_update_E1Q1SB1_C1_PerformanceSV;

	E1Q1SB1.S1.C1.LN0.Volt.noASDU = 2;
	E1Q1SB1.S1.C1.LN0.Volt.ethHeaderData.destMACAddress[0] = 0x01;
	E1Q1SB1.S1.C1.LN0.Volt.ethHeaderData.destMACAddress[1] = 0x0C;
	E1Q1SB1.S1.C1.LN0.Volt.ethHeaderData.destMACAddress[2] = 0xCD;
	E1Q1SB1.S1.C1.LN0.Volt.ethHeaderData.destMACAddress[3] = 0x04;
	E1Q1SB1.S1.C1.LN0.Volt.ethHeaderData.destMACAddress[4] = 0x00;
	E1Q1SB1.S1.C1.LN0.Volt.ethHeaderData.destMACAddress[5] = 0x01;
	E1Q1SB1.S1.C1.LN0.Volt.ethHeaderData.APPID = 0x4000;
	E1Q1SB1.S1.C1.LN0.Volt.ethHeaderData.VLAN_ID = 0x123;
	E1Q1SB1.S1.C1.LN0.Volt.ethHeaderData.VLAN_PRIORITY = 0x4;
	E1Q1SB1.S1.C1.LN0.Volt.ASDU = (struct ASDU *) malloc(2 * sizeof(struct ASDU));
	for (i = 0; i < 2; i++) {
		E1Q1SB1.S1.C1.LN0.Volt.ASDU[i].svID = (unsigned char *) malloc(3);
		strncpy((char *) E1Q1SB1.S1.C1.LN0.Volt.ASDU[i].svID, "11\0", 3);
		E1Q1SB1.S1.C1.LN0.Volt.ASDU[i].datset = (unsigned char *) malloc(4);
		strncpy((char *) E1Q1SB1.S1.C1.LN0.Volt.ASDU[i].datset, "smv\0", 4);
		E1Q1SB1.S1.C1.LN0.Volt.ASDU[i].smpCnt = 0;
		E1Q1SB1.S1.C1.LN0.Volt.ASDU[i].confRev = 1;
		E1Q1SB1.S1.C1.LN0.Volt.ASDU[i].smpSynch = 1;
		E1Q1SB1.S1.C1.LN0.Volt.ASDU[i].showRefrTm = 1;
		E1Q1SB1.S1.C1.LN0.Volt.ASDU[i].showDatset = 0;
		E1Q1SB1.S1.C1.LN0.Volt.ASDU[i].showSmpRate = 1;
		E1Q1SB1.S1.C1.LN0.Volt.ASDU[i].smpRate = 4800;
		E1Q1SB1.S1.C1.LN0.Volt.ASDU[i].data.size = 0;
	}
	E1Q1SB1.S1.C1.LN0.Volt.ASDUCount = 0;
	E1Q1SB1.S1.C1.LN0.Volt.update = &sv_update_E1Q1SB1_C1_Volt;

	E1Q1SB1.S1.C1.LN0.rmxuCB.noASDU = 16;
	E1Q1SB1.S1.C1.LN0.rmxuCB.ethHeaderData.destMACAddress[0] = 0x01;
	E1Q1SB1.S1.C1.LN0.rmxuCB.ethHeaderData.destMACAddress[1] = 0x0C;
	E1Q1SB1.S1.C1.LN0.rmxuCB.ethHeaderData.destMACAddress[2] = 0xCD;
	E1Q1SB1.S1.C1.LN0.rmxuCB.ethHeaderData.destMACAddress[3] = 0x04;
	E1Q1SB1.S1.C1.LN0.rmxuCB.ethHeaderData.destMACAddress[4] = 0x00;
	E1Q1SB1.S1.C1.LN0.rmxuCB.ethHeaderData.destMACAddress[5] = 0x01;
	E1Q1SB1.S1.C1.LN0.rmxuCB.ethHeaderData.APPID = 0x4000;
	E1Q1SB1.S1.C1.LN0.rmxuCB.ethHeaderData.VLAN_ID = 0x123;
	E1Q1SB1.S1.C1.LN0.rmxuCB.ethHeaderData.VLAN_PRIORITY = 0x4;
	E1Q1SB1.S1.C1.LN0.rmxuCB.ASDU = (struct ASDU *) malloc(16 * sizeof(struct ASDU));
	for (i = 0; i < 16; i++) {
		E1Q1SB1.S1.C1.LN0.rmxuCB.ASDU[i].svID = (unsigned char *) malloc(5);
		strncpy((char *) E1Q1SB1.S1.C1.LN0.rmxuCB.ASDU[i].svID, "rmxu\0", 5);
		E1Q1SB1.S1.C1.LN0.rmxuCB.ASDU[i].datset = (unsigned char *) malloc(5);
		strncpy((char *) E1Q1SB1.S1.C1.LN0.rmxuCB.ASDU[i].datset, "rmxu\0", 5);
		E1Q1SB1.S1.C1.LN0.rmxuCB.ASDU[i].smpCnt = 0;
		E1Q1SB1.S1.C1.LN0.rmxuCB.ASDU[i].confRev = 1;
		E1Q1SB1.S1.C1.LN0.rmxuCB.ASDU[i].smpSynch = 1;
		E1Q1SB1.S1.C1.LN0.rmxuCB.ASDU[i].showRefrTm = 1;
		E1Q1SB1.S1.C1.LN0.rmxuCB.ASDU[i].showDatset = 0;
		E1Q1SB1.S1.C1.LN0.rmxuCB.ASDU[i].showSmpRate = 1;
		E1Q1SB1.S1.C1.LN0.rmxuCB.ASDU[i].smpRate = 16;
		E1Q1SB1.S1.C1.LN0.rmxuCB.ASDU[i].data.size = 0;
	}
	E1Q1SB1.S1.C1.LN0.rmxuCB.ASDUCount = 0;
	E1Q1SB1.S1.C1.LN0.rmxuCB.update = &sv_update_E1Q1SB1_C1_rmxuCB;
}

