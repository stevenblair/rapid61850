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
int sv_update_Volt_11(unsigned char *buf) {
	int size = encode_control_Volt(E1Q1SB1.S1.C1.LN0.Volt_11.ASDU[E1Q1SB1.S1.C1.LN0.Volt_11.ASDUCount].data.data);
	E1Q1SB1.S1.C1.LN0.Volt_11.ASDU[E1Q1SB1.S1.C1.LN0.Volt_11.ASDUCount].data.size = size;

	E1Q1SB1.S1.C1.LN0.Volt_11.ASDU[E1Q1SB1.S1.C1.LN0.Volt_11.ASDUCount].smpCnt = E1Q1SB1.S1.C1.LN0.Volt_11.sampleCountMaster;
	E1Q1SB1.S1.C1.LN0.Volt_11.sampleCountMaster++;

	if (++E1Q1SB1.S1.C1.LN0.Volt_11.ASDUCount == E1Q1SB1.S1.C1.LN0.Volt_11.noASDU) {
		E1Q1SB1.S1.C1.LN0.Volt_11.ASDUCount = 0;
		return svEncodePacket(&E1Q1SB1.S1.C1.LN0.Volt_11, buf);
	}

	return 0;
}

// returns 1 if buf contains valid packet data
int sv_update_rmxuCB_rmxu(unsigned char *buf) {
	int size = encode_control_rmxuCB(E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.ASDU[E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.ASDUCount].data.data);
	E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.ASDU[E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.ASDUCount].data.size = size;

	E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.ASDU[E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.ASDUCount].smpCnt = E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.sampleCountMaster;
	E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.sampleCountMaster++;

	if (++E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.ASDUCount == E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.noASDU) {
		E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.ASDUCount = 0;
		return svEncodePacket(&E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu, buf);
	}

	return 0;
}

void init_sv() {
	int i = 0;

	E1Q1SB1.S1.C1.LN0.Volt_11.update = &sv_update_Volt_11;
	E1Q1SB1.S1.C1.LN0.Volt_11.noASDU = 2;
	E1Q1SB1.S1.C1.LN0.Volt_11.ethHeaderData.destMACAddress[0] = 0x01;
	E1Q1SB1.S1.C1.LN0.Volt_11.ethHeaderData.destMACAddress[1] = 0x0C;
	E1Q1SB1.S1.C1.LN0.Volt_11.ethHeaderData.destMACAddress[2] = 0xCD;
	E1Q1SB1.S1.C1.LN0.Volt_11.ethHeaderData.destMACAddress[3] = 0x04;
	E1Q1SB1.S1.C1.LN0.Volt_11.ethHeaderData.destMACAddress[4] = 0x00;
	E1Q1SB1.S1.C1.LN0.Volt_11.ethHeaderData.destMACAddress[5] = 0x01;
	E1Q1SB1.S1.C1.LN0.Volt_11.ethHeaderData.APPID = 0x4000;
	E1Q1SB1.S1.C1.LN0.Volt_11.ethHeaderData.VLAN_ID = 0x123;
	E1Q1SB1.S1.C1.LN0.Volt_11.ethHeaderData.VLAN_PRIORITY = 0x4;
	E1Q1SB1.S1.C1.LN0.Volt_11.ASDU = (struct ASDU *) malloc(2 * sizeof(struct ASDU));
	for (i = 0; i < 2; i++) {
		E1Q1SB1.S1.C1.LN0.Volt_11.ASDU[i].svID = (unsigned char *) malloc(3);
		strncpy((char *) E1Q1SB1.S1.C1.LN0.Volt_11.ASDU[i].svID, "11\0", 3);
		E1Q1SB1.S1.C1.LN0.Volt_11.ASDU[i].datset = (unsigned char *) malloc(4);
		strncpy((char *) E1Q1SB1.S1.C1.LN0.Volt_11.ASDU[i].datset, "smv\0", 4);
		E1Q1SB1.S1.C1.LN0.Volt_11.ASDU[i].smpCnt = 0;
		E1Q1SB1.S1.C1.LN0.Volt_11.ASDU[i].confRev = 1;
		E1Q1SB1.S1.C1.LN0.Volt_11.ASDU[i].smpSynch = 1;
		E1Q1SB1.S1.C1.LN0.Volt_11.ASDU[i].showRefrTm = 1;
		E1Q1SB1.S1.C1.LN0.Volt_11.ASDU[i].showDatset = 0;
		E1Q1SB1.S1.C1.LN0.Volt_11.ASDU[i].showSmpRate = 1;
		E1Q1SB1.S1.C1.LN0.Volt_11.ASDU[i].smpRate = 4800;
		E1Q1SB1.S1.C1.LN0.Volt_11.ASDU[i].data.size = 0;
	}
	E1Q1SB1.S1.C1.LN0.Volt_11.ASDUCount = 0;

	E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.update = &sv_update_rmxuCB_rmxu;
	E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.noASDU = 16;
	E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.ethHeaderData.destMACAddress[0] = 0x01;
	E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.ethHeaderData.destMACAddress[1] = 0x0C;
	E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.ethHeaderData.destMACAddress[2] = 0xCD;
	E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.ethHeaderData.destMACAddress[3] = 0x04;
	E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.ethHeaderData.destMACAddress[4] = 0x00;
	E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.ethHeaderData.destMACAddress[5] = 0x01;
	E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.ethHeaderData.APPID = 0x4000;
	E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.ethHeaderData.VLAN_ID = 0x123;
	E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.ethHeaderData.VLAN_PRIORITY = 0x4;
	E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.ASDU = (struct ASDU *) malloc(16 * sizeof(struct ASDU));
	for (i = 0; i < 16; i++) {
		E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.ASDU[i].svID = (unsigned char *) malloc(5);
		strncpy((char *) E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.ASDU[i].svID, "rmxu\0", 5);
		E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.ASDU[i].datset = (unsigned char *) malloc(5);
		strncpy((char *) E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.ASDU[i].datset, "rmxu\0", 5);
		E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.ASDU[i].smpCnt = 0;
		E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.ASDU[i].confRev = 1;
		E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.ASDU[i].smpSynch = 1;
		E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.ASDU[i].showRefrTm = 1;
		E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.ASDU[i].showDatset = 0;
		E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.ASDU[i].showSmpRate = 1;
		E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.ASDU[i].smpRate = 16;
		E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.ASDU[i].data.size = 0;
	}
	E1Q1SB1.S1.C1.LN0.rmxuCB_rmxu.ASDUCount = 0;
}

