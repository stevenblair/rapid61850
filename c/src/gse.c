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

#include "gsePacketData.h"
#include "gseDecode.h"
#include "gseEncode.h"

struct gseControl ItlPositions_Itl;
struct gseControl SyckResult_SynChk;
struct gseControl MMXUResult_MMXUResult;




// returns 1 if buf contains valid packet data
int gse_send_ItlPositions_Itl(unsigned char *buf, CTYPE_BOOLEAN statusChange, CTYPE_INT32U timeAllowedToLive) {
	ItlPositions_Itl.timeAllowedToLive = timeAllowedToLive;

	if (statusChange) {
		ItlPositions_Itl.stNum++;
		if (ItlPositions_Itl.stNum == 0) {
			ItlPositions_Itl.stNum = 1;
		}
		ItlPositions_Itl.sqNum = 0;
	}
	else {
		ItlPositions_Itl.sqNum++;
		if (ItlPositions_Itl.sqNum == 0) {
			ItlPositions_Itl.sqNum = 1;
		}
	}

	return gseEncodePacket(&ItlPositions_Itl, buf);
}

// returns 1 if buf contains valid packet data
int gse_send_SyckResult_SynChk(unsigned char *buf, CTYPE_BOOLEAN statusChange, CTYPE_INT32U timeAllowedToLive) {
	SyckResult_SynChk.timeAllowedToLive = timeAllowedToLive;

	if (statusChange) {
		SyckResult_SynChk.stNum++;
		if (SyckResult_SynChk.stNum == 0) {
			SyckResult_SynChk.stNum = 1;
		}
		SyckResult_SynChk.sqNum = 0;
	}
	else {
		SyckResult_SynChk.sqNum++;
		if (SyckResult_SynChk.sqNum == 0) {
			SyckResult_SynChk.sqNum = 1;
		}
	}

	return gseEncodePacket(&SyckResult_SynChk, buf);
}

// returns 1 if buf contains valid packet data
int gse_send_MMXUResult_MMXUResult(unsigned char *buf, CTYPE_BOOLEAN statusChange, CTYPE_INT32U timeAllowedToLive) {
	MMXUResult_MMXUResult.timeAllowedToLive = timeAllowedToLive;

	if (statusChange) {
		MMXUResult_MMXUResult.stNum++;
		if (MMXUResult_MMXUResult.stNum == 0) {
			MMXUResult_MMXUResult.stNum = 1;
		}
		MMXUResult_MMXUResult.sqNum = 0;
	}
	else {
		MMXUResult_MMXUResult.sqNum++;
		if (MMXUResult_MMXUResult.sqNum == 0) {
			MMXUResult_MMXUResult.sqNum = 1;
		}
	}

	return gseEncodePacket(&MMXUResult_MMXUResult, buf);
}

void init_gse() {
	ItlPositions_Itl.ethHeaderData.destMACAddress[0] = 0x01;
	ItlPositions_Itl.ethHeaderData.destMACAddress[1] = 0x0C;
	ItlPositions_Itl.ethHeaderData.destMACAddress[2] = 0xCD;
	ItlPositions_Itl.ethHeaderData.destMACAddress[3] = 0x01;
	ItlPositions_Itl.ethHeaderData.destMACAddress[4] = 0x00;
	ItlPositions_Itl.ethHeaderData.destMACAddress[5] = 0x04;
	ItlPositions_Itl.ethHeaderData.APPID = 0x3000;
	ItlPositions_Itl.ethHeaderData.VLAN_PRIORITY = 0x4;
	ItlPositions_Itl.ethHeaderData.VLAN_ID = 4;
	ItlPositions_Itl.goID = (unsigned char *) malloc(4);
	strncpy((char *) ItlPositions_Itl.goID, "Itl\0", 4);
	ItlPositions_Itl.t = 0;
	ItlPositions_Itl.gocbRef = (unsigned char *) malloc(28);
	strncpy((char *) ItlPositions_Itl.gocbRef, "E1Q1SB1C1/LLN0$ItlPositions\0", 28);
	ItlPositions_Itl.datSet = (unsigned char *) malloc(25);
	strncpy((char *) ItlPositions_Itl.datSet, "E1Q1SB1C1/LLN0$Positions\0", 25);
	ItlPositions_Itl.timeAllowedToLive = 0;
	ItlPositions_Itl.stNum = 0;
	ItlPositions_Itl.sqNum = 0;
	ItlPositions_Itl.test = 0;
	ItlPositions_Itl.confRev = 1;
	ItlPositions_Itl.ndsCom = 0;
	ItlPositions_Itl.numDatSetEntries = 6;
	ItlPositions_Itl.encodeDataset = &ber_encode_Itl;
	ItlPositions_Itl.getDatasetLength = &ber_get_length_Itl;
	SyckResult_SynChk.ethHeaderData.destMACAddress[0] = 0x01;
	SyckResult_SynChk.ethHeaderData.destMACAddress[1] = 0x0C;
	SyckResult_SynChk.ethHeaderData.destMACAddress[2] = 0xCD;
	SyckResult_SynChk.ethHeaderData.destMACAddress[3] = 0x01;
	SyckResult_SynChk.ethHeaderData.destMACAddress[4] = 0x00;
	SyckResult_SynChk.ethHeaderData.destMACAddress[5] = 0x02;
	SyckResult_SynChk.ethHeaderData.APPID = 0x3001;
	SyckResult_SynChk.ethHeaderData.VLAN_PRIORITY = 0x4;
	SyckResult_SynChk.ethHeaderData.VLAN_ID = 4;
	SyckResult_SynChk.goID = (unsigned char *) malloc(7);
	strncpy((char *) SyckResult_SynChk.goID, "SynChk\0", 7);
	SyckResult_SynChk.t = 0;
	SyckResult_SynChk.gocbRef = (unsigned char *) malloc(26);
	strncpy((char *) SyckResult_SynChk.gocbRef, "D1Q1SB4C1/LLN0$SyckResult\0", 26);
	SyckResult_SynChk.datSet = (unsigned char *) malloc(26);
	strncpy((char *) SyckResult_SynChk.datSet, "D1Q1SB4C1/LLN0$SyckResult\0", 26);
	SyckResult_SynChk.timeAllowedToLive = 0;
	SyckResult_SynChk.stNum = 0;
	SyckResult_SynChk.sqNum = 0;
	SyckResult_SynChk.test = 0;
	SyckResult_SynChk.confRev = 0;
	SyckResult_SynChk.ndsCom = 0;
	SyckResult_SynChk.numDatSetEntries = 1;
	SyckResult_SynChk.encodeDataset = &ber_encode_SynChk;
	SyckResult_SynChk.getDatasetLength = &ber_get_length_SynChk;
	MMXUResult_MMXUResult.ethHeaderData.destMACAddress[0] = 0x01;
	MMXUResult_MMXUResult.ethHeaderData.destMACAddress[1] = 0x0C;
	MMXUResult_MMXUResult.ethHeaderData.destMACAddress[2] = 0xCD;
	MMXUResult_MMXUResult.ethHeaderData.destMACAddress[3] = 0x01;
	MMXUResult_MMXUResult.ethHeaderData.destMACAddress[4] = 0x00;
	MMXUResult_MMXUResult.ethHeaderData.destMACAddress[5] = 0x02;
	MMXUResult_MMXUResult.ethHeaderData.APPID = 0x3001;
	MMXUResult_MMXUResult.ethHeaderData.VLAN_PRIORITY = 0x4;
	MMXUResult_MMXUResult.ethHeaderData.VLAN_ID = 4;
	MMXUResult_MMXUResult.goID = (unsigned char *) malloc(11);
	strncpy((char *) MMXUResult_MMXUResult.goID, "MMXUResult\0", 11);
	MMXUResult_MMXUResult.t = 0;
	MMXUResult_MMXUResult.gocbRef = (unsigned char *) malloc(26);
	strncpy((char *) MMXUResult_MMXUResult.gocbRef, "D1Q1SB4C1/LLN0$MMXUResult\0", 26);
	MMXUResult_MMXUResult.datSet = (unsigned char *) malloc(26);
	strncpy((char *) MMXUResult_MMXUResult.datSet, "D1Q1SB4C1/LLN0$MMXUResult\0", 26);
	MMXUResult_MMXUResult.timeAllowedToLive = 0;
	MMXUResult_MMXUResult.stNum = 0;
	MMXUResult_MMXUResult.sqNum = 0;
	MMXUResult_MMXUResult.test = 0;
	MMXUResult_MMXUResult.confRev = 0;
	MMXUResult_MMXUResult.ndsCom = 0;
	MMXUResult_MMXUResult.numDatSetEntries = 1;
	MMXUResult_MMXUResult.encodeDataset = &ber_encode_MMXUResult;
	MMXUResult_MMXUResult.getDatasetLength = &ber_get_length_MMXUResult;
}

