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
#include "gsePacketData.h"
#include "gseDecode.h"
#include "gseEncode.h"





// returns 1 if buf contains valid packet data
int gse_send_ItlPositions_Itl(unsigned char *buf, CTYPE_BOOLEAN statusChange, CTYPE_INT32U timeAllowedToLive) {
	E1Q1SB1.S1.C1.LN0.ItlPositions_Itl.timeAllowedToLive = timeAllowedToLive;

	if (statusChange) {
		E1Q1SB1.S1.C1.LN0.ItlPositions_Itl.stNum++;
		if (E1Q1SB1.S1.C1.LN0.ItlPositions_Itl.stNum == 0) {
			E1Q1SB1.S1.C1.LN0.ItlPositions_Itl.stNum = 1;
		}
		E1Q1SB1.S1.C1.LN0.ItlPositions_Itl.sqNum = 0;
	}
	else {
		E1Q1SB1.S1.C1.LN0.ItlPositions_Itl.sqNum++;
		if (E1Q1SB1.S1.C1.LN0.ItlPositions_Itl.sqNum == 0) {
			E1Q1SB1.S1.C1.LN0.ItlPositions_Itl.sqNum = 1;
		}
	}

	return gseEncodePacket(&E1Q1SB1.S1.C1.LN0.ItlPositions_Itl, buf);
}

// returns 1 if buf contains valid packet data
int gse_send_AnotherPositions_Itl(unsigned char *buf, CTYPE_BOOLEAN statusChange, CTYPE_INT32U timeAllowedToLive) {
	E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl.timeAllowedToLive = timeAllowedToLive;

	if (statusChange) {
		E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl.stNum++;
		if (E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl.stNum == 0) {
			E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl.stNum = 1;
		}
		E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl.sqNum = 0;
	}
	else {
		E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl.sqNum++;
		if (E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl.sqNum == 0) {
			E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl.sqNum = 1;
		}
	}

	return gseEncodePacket(&E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl, buf);
}

// returns 1 if buf contains valid packet data
int gse_send_SyckResult_SynChk(unsigned char *buf, CTYPE_BOOLEAN statusChange, CTYPE_INT32U timeAllowedToLive) {
	D1Q1SB4.S1.C1.LN0.SyckResult_SynChk.timeAllowedToLive = timeAllowedToLive;

	if (statusChange) {
		D1Q1SB4.S1.C1.LN0.SyckResult_SynChk.stNum++;
		if (D1Q1SB4.S1.C1.LN0.SyckResult_SynChk.stNum == 0) {
			D1Q1SB4.S1.C1.LN0.SyckResult_SynChk.stNum = 1;
		}
		D1Q1SB4.S1.C1.LN0.SyckResult_SynChk.sqNum = 0;
	}
	else {
		D1Q1SB4.S1.C1.LN0.SyckResult_SynChk.sqNum++;
		if (D1Q1SB4.S1.C1.LN0.SyckResult_SynChk.sqNum == 0) {
			D1Q1SB4.S1.C1.LN0.SyckResult_SynChk.sqNum = 1;
		}
	}

	return gseEncodePacket(&D1Q1SB4.S1.C1.LN0.SyckResult_SynChk, buf);
}

// returns 1 if buf contains valid packet data
int gse_send_MMXUResult_MMXUResult(unsigned char *buf, CTYPE_BOOLEAN statusChange, CTYPE_INT32U timeAllowedToLive) {
	D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult.timeAllowedToLive = timeAllowedToLive;

	if (statusChange) {
		D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult.stNum++;
		if (D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult.stNum == 0) {
			D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult.stNum = 1;
		}
		D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult.sqNum = 0;
	}
	else {
		D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult.sqNum++;
		if (D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult.sqNum == 0) {
			D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult.sqNum = 1;
		}
	}

	return gseEncodePacket(&D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult, buf);
}

void init_gse() {
	E1Q1SB1.S1.C1.LN0.ItlPositions_Itl.send = &gse_send_ItlPositions_Itl;
	E1Q1SB1.S1.C1.LN0.ItlPositions_Itl.ethHeaderData.destMACAddress[0] = 0x01;
	E1Q1SB1.S1.C1.LN0.ItlPositions_Itl.ethHeaderData.destMACAddress[1] = 0x0C;
	E1Q1SB1.S1.C1.LN0.ItlPositions_Itl.ethHeaderData.destMACAddress[2] = 0xCD;
	E1Q1SB1.S1.C1.LN0.ItlPositions_Itl.ethHeaderData.destMACAddress[3] = 0x01;
	E1Q1SB1.S1.C1.LN0.ItlPositions_Itl.ethHeaderData.destMACAddress[4] = 0x00;
	E1Q1SB1.S1.C1.LN0.ItlPositions_Itl.ethHeaderData.destMACAddress[5] = 0x04;
	E1Q1SB1.S1.C1.LN0.ItlPositions_Itl.ethHeaderData.APPID = 0x3000;
	E1Q1SB1.S1.C1.LN0.ItlPositions_Itl.ethHeaderData.VLAN_PRIORITY = 0x4;
	E1Q1SB1.S1.C1.LN0.ItlPositions_Itl.ethHeaderData.VLAN_ID = 4;
	E1Q1SB1.S1.C1.LN0.ItlPositions_Itl.goID = (unsigned char *) malloc(4);
	strncpy((char *) E1Q1SB1.S1.C1.LN0.ItlPositions_Itl.goID, "Itl\0", 4);
	E1Q1SB1.S1.C1.LN0.ItlPositions_Itl.t = 0;
	E1Q1SB1.S1.C1.LN0.ItlPositions_Itl.gocbRef = (unsigned char *) malloc(28);
	strncpy((char *) E1Q1SB1.S1.C1.LN0.ItlPositions_Itl.gocbRef, "E1Q1SB1.S1.C1.LN0.ItlPositions_Itl\0", 28);
	E1Q1SB1.S1.C1.LN0.ItlPositions_Itl.datSet = (unsigned char *) malloc(25);
	strncpy((char *) E1Q1SB1.S1.C1.LN0.ItlPositions_Itl.datSet, "E1Q1SB1C1/LLN0$Positions\0", 25);
	E1Q1SB1.S1.C1.LN0.ItlPositions_Itl.timeAllowedToLive = 0;
	E1Q1SB1.S1.C1.LN0.ItlPositions_Itl.stNum = 0;
	E1Q1SB1.S1.C1.LN0.ItlPositions_Itl.sqNum = 0;
	E1Q1SB1.S1.C1.LN0.ItlPositions_Itl.test = 0;
	E1Q1SB1.S1.C1.LN0.ItlPositions_Itl.confRev = 1;
	E1Q1SB1.S1.C1.LN0.ItlPositions_Itl.ndsCom = 0;
	E1Q1SB1.S1.C1.LN0.ItlPositions_Itl.numDatSetEntries = 6;
	E1Q1SB1.S1.C1.LN0.ItlPositions_Itl.encodeDataset = &ber_encode_E1Q1SB1_C1_Positions;
	E1Q1SB1.S1.C1.LN0.ItlPositions_Itl.getDatasetLength = &ber_get_length_E1Q1SB1_C1_Positions;
	E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl.send = &gse_send_AnotherPositions_Itl;
	E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl.ethHeaderData.destMACAddress[0] = 0x01;
	E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl.ethHeaderData.destMACAddress[1] = 0x0C;
	E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl.ethHeaderData.destMACAddress[2] = 0xCD;
	E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl.ethHeaderData.destMACAddress[3] = 0x01;
	E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl.ethHeaderData.destMACAddress[4] = 0x00;
	E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl.ethHeaderData.destMACAddress[5] = 0x04;
	E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl.ethHeaderData.APPID = 0x3000;
	E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl.ethHeaderData.VLAN_PRIORITY = 0x4;
	E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl.ethHeaderData.VLAN_ID = 4;
	E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl.goID = (unsigned char *) malloc(4);
	strncpy((char *) E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl.goID, "Itl\0", 4);
	E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl.t = 0;
	E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl.gocbRef = (unsigned char *) malloc(32);
	strncpy((char *) E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl.gocbRef, "E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl\0", 32);
	E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl.datSet = (unsigned char *) malloc(25);
	strncpy((char *) E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl.datSet, "E1Q1SB1C1/LLN0$Positions\0", 25);
	E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl.timeAllowedToLive = 0;
	E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl.stNum = 0;
	E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl.sqNum = 0;
	E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl.test = 0;
	E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl.confRev = 1;
	E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl.ndsCom = 0;
	E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl.numDatSetEntries = 6;
	E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl.encodeDataset = &ber_encode_E1Q1SB1_C1_Positions;
	E1Q1SB1.S1.C1.LN0.AnotherPositions_Itl.getDatasetLength = &ber_get_length_E1Q1SB1_C1_Positions;
	D1Q1SB4.S1.C1.LN0.SyckResult_SynChk.send = &gse_send_SyckResult_SynChk;
	D1Q1SB4.S1.C1.LN0.SyckResult_SynChk.ethHeaderData.destMACAddress[0] = 0x01;
	D1Q1SB4.S1.C1.LN0.SyckResult_SynChk.ethHeaderData.destMACAddress[1] = 0x0C;
	D1Q1SB4.S1.C1.LN0.SyckResult_SynChk.ethHeaderData.destMACAddress[2] = 0xCD;
	D1Q1SB4.S1.C1.LN0.SyckResult_SynChk.ethHeaderData.destMACAddress[3] = 0x01;
	D1Q1SB4.S1.C1.LN0.SyckResult_SynChk.ethHeaderData.destMACAddress[4] = 0x00;
	D1Q1SB4.S1.C1.LN0.SyckResult_SynChk.ethHeaderData.destMACAddress[5] = 0x02;
	D1Q1SB4.S1.C1.LN0.SyckResult_SynChk.ethHeaderData.APPID = 0x3001;
	D1Q1SB4.S1.C1.LN0.SyckResult_SynChk.ethHeaderData.VLAN_PRIORITY = 0x4;
	D1Q1SB4.S1.C1.LN0.SyckResult_SynChk.ethHeaderData.VLAN_ID = 4;
	D1Q1SB4.S1.C1.LN0.SyckResult_SynChk.goID = (unsigned char *) malloc(7);
	strncpy((char *) D1Q1SB4.S1.C1.LN0.SyckResult_SynChk.goID, "SynChk\0", 7);
	D1Q1SB4.S1.C1.LN0.SyckResult_SynChk.t = 0;
	D1Q1SB4.S1.C1.LN0.SyckResult_SynChk.gocbRef = (unsigned char *) malloc(26);
	strncpy((char *) D1Q1SB4.S1.C1.LN0.SyckResult_SynChk.gocbRef, "D1Q1SB4.S1.C1.LN0.SyckResult_SynChk\0", 26);
	D1Q1SB4.S1.C1.LN0.SyckResult_SynChk.datSet = (unsigned char *) malloc(26);
	strncpy((char *) D1Q1SB4.S1.C1.LN0.SyckResult_SynChk.datSet, "D1Q1SB4C1/LLN0$SyckResult\0", 26);
	D1Q1SB4.S1.C1.LN0.SyckResult_SynChk.timeAllowedToLive = 0;
	D1Q1SB4.S1.C1.LN0.SyckResult_SynChk.stNum = 0;
	D1Q1SB4.S1.C1.LN0.SyckResult_SynChk.sqNum = 0;
	D1Q1SB4.S1.C1.LN0.SyckResult_SynChk.test = 0;
	D1Q1SB4.S1.C1.LN0.SyckResult_SynChk.confRev = 0;
	D1Q1SB4.S1.C1.LN0.SyckResult_SynChk.ndsCom = 0;
	D1Q1SB4.S1.C1.LN0.SyckResult_SynChk.numDatSetEntries = 1;
	D1Q1SB4.S1.C1.LN0.SyckResult_SynChk.encodeDataset = &ber_encode_D1Q1SB4_C1_SyckResult;
	D1Q1SB4.S1.C1.LN0.SyckResult_SynChk.getDatasetLength = &ber_get_length_D1Q1SB4_C1_SyckResult;
	D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult.send = &gse_send_MMXUResult_MMXUResult;
	D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult.ethHeaderData.destMACAddress[0] = 0x01;
	D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult.ethHeaderData.destMACAddress[1] = 0x0C;
	D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult.ethHeaderData.destMACAddress[2] = 0xCD;
	D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult.ethHeaderData.destMACAddress[3] = 0x01;
	D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult.ethHeaderData.destMACAddress[4] = 0x00;
	D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult.ethHeaderData.destMACAddress[5] = 0x02;
	D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult.ethHeaderData.APPID = 0x3001;
	D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult.ethHeaderData.VLAN_PRIORITY = 0x4;
	D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult.ethHeaderData.VLAN_ID = 4;
	D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult.goID = (unsigned char *) malloc(11);
	strncpy((char *) D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult.goID, "MMXUResult\0", 11);
	D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult.t = 0;
	D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult.gocbRef = (unsigned char *) malloc(26);
	strncpy((char *) D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult.gocbRef, "D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult\0", 26);
	D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult.datSet = (unsigned char *) malloc(26);
	strncpy((char *) D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult.datSet, "D1Q1SB4C1/LLN0$MMXUResult\0", 26);
	D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult.timeAllowedToLive = 0;
	D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult.stNum = 0;
	D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult.sqNum = 0;
	D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult.test = 0;
	D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult.confRev = 0;
	D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult.ndsCom = 0;
	D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult.numDatSetEntries = 1;
	D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult.encodeDataset = &ber_encode_D1Q1SB4_C1_MMXUResult;
	D1Q1SB4.S1.C1.LN0.MMXUResult_MMXUResult.getDatasetLength = &ber_get_length_D1Q1SB4_C1_MMXUResult;
}

