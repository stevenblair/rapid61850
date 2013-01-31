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
int gse_send_E1Q1SB1_C1_Performance(unsigned char *buf, CTYPE_BOOLEAN statusChange, CTYPE_INT32U timeAllowedToLive) {
	E1Q1SB1.S1.C1.LN0.Performance.timeAllowedToLive = timeAllowedToLive;

	if (statusChange) {
		E1Q1SB1.S1.C1.LN0.Performance.stNum++;
		if (E1Q1SB1.S1.C1.LN0.Performance.stNum == 0) {
			E1Q1SB1.S1.C1.LN0.Performance.stNum = 1;
		}
		E1Q1SB1.S1.C1.LN0.Performance.sqNum = 0;
	}
	else {
		E1Q1SB1.S1.C1.LN0.Performance.sqNum++;
		if (E1Q1SB1.S1.C1.LN0.Performance.sqNum == 0) {
			E1Q1SB1.S1.C1.LN0.Performance.sqNum = 1;
		}
	}

	return gseEncodePacket(&E1Q1SB1.S1.C1.LN0.Performance, buf);
}

// returns 1 if buf contains valid packet data
int gse_send_E1Q1SB1_C1_ItlPositions(unsigned char *buf, CTYPE_BOOLEAN statusChange, CTYPE_INT32U timeAllowedToLive) {
	E1Q1SB1.S1.C1.LN0.ItlPositions.timeAllowedToLive = timeAllowedToLive;

	if (statusChange) {
		E1Q1SB1.S1.C1.LN0.ItlPositions.stNum++;
		if (E1Q1SB1.S1.C1.LN0.ItlPositions.stNum == 0) {
			E1Q1SB1.S1.C1.LN0.ItlPositions.stNum = 1;
		}
		E1Q1SB1.S1.C1.LN0.ItlPositions.sqNum = 0;
	}
	else {
		E1Q1SB1.S1.C1.LN0.ItlPositions.sqNum++;
		if (E1Q1SB1.S1.C1.LN0.ItlPositions.sqNum == 0) {
			E1Q1SB1.S1.C1.LN0.ItlPositions.sqNum = 1;
		}
	}

	return gseEncodePacket(&E1Q1SB1.S1.C1.LN0.ItlPositions, buf);
}

// returns 1 if buf contains valid packet data
int gse_send_E1Q1SB1_C1_AnotherPositions(unsigned char *buf, CTYPE_BOOLEAN statusChange, CTYPE_INT32U timeAllowedToLive) {
	E1Q1SB1.S1.C1.LN0.AnotherPositions.timeAllowedToLive = timeAllowedToLive;

	if (statusChange) {
		E1Q1SB1.S1.C1.LN0.AnotherPositions.stNum++;
		if (E1Q1SB1.S1.C1.LN0.AnotherPositions.stNum == 0) {
			E1Q1SB1.S1.C1.LN0.AnotherPositions.stNum = 1;
		}
		E1Q1SB1.S1.C1.LN0.AnotherPositions.sqNum = 0;
	}
	else {
		E1Q1SB1.S1.C1.LN0.AnotherPositions.sqNum++;
		if (E1Q1SB1.S1.C1.LN0.AnotherPositions.sqNum == 0) {
			E1Q1SB1.S1.C1.LN0.AnotherPositions.sqNum = 1;
		}
	}

	return gseEncodePacket(&E1Q1SB1.S1.C1.LN0.AnotherPositions, buf);
}

// returns 1 if buf contains valid packet data
int gse_send_D1Q1SB4_C1_SyckResult(unsigned char *buf, CTYPE_BOOLEAN statusChange, CTYPE_INT32U timeAllowedToLive) {
	D1Q1SB4.S1.C1.LN0.SyckResult.timeAllowedToLive = timeAllowedToLive;

	if (statusChange) {
		D1Q1SB4.S1.C1.LN0.SyckResult.stNum++;
		if (D1Q1SB4.S1.C1.LN0.SyckResult.stNum == 0) {
			D1Q1SB4.S1.C1.LN0.SyckResult.stNum = 1;
		}
		D1Q1SB4.S1.C1.LN0.SyckResult.sqNum = 0;
	}
	else {
		D1Q1SB4.S1.C1.LN0.SyckResult.sqNum++;
		if (D1Q1SB4.S1.C1.LN0.SyckResult.sqNum == 0) {
			D1Q1SB4.S1.C1.LN0.SyckResult.sqNum = 1;
		}
	}

	return gseEncodePacket(&D1Q1SB4.S1.C1.LN0.SyckResult, buf);
}

// returns 1 if buf contains valid packet data
int gse_send_D1Q1SB4_C1_MMXUResult(unsigned char *buf, CTYPE_BOOLEAN statusChange, CTYPE_INT32U timeAllowedToLive) {
	D1Q1SB4.S1.C1.LN0.MMXUResult.timeAllowedToLive = timeAllowedToLive;

	if (statusChange) {
		D1Q1SB4.S1.C1.LN0.MMXUResult.stNum++;
		if (D1Q1SB4.S1.C1.LN0.MMXUResult.stNum == 0) {
			D1Q1SB4.S1.C1.LN0.MMXUResult.stNum = 1;
		}
		D1Q1SB4.S1.C1.LN0.MMXUResult.sqNum = 0;
	}
	else {
		D1Q1SB4.S1.C1.LN0.MMXUResult.sqNum++;
		if (D1Q1SB4.S1.C1.LN0.MMXUResult.sqNum == 0) {
			D1Q1SB4.S1.C1.LN0.MMXUResult.sqNum = 1;
		}
	}

	return gseEncodePacket(&D1Q1SB4.S1.C1.LN0.MMXUResult, buf);
}

void init_gse() {
	E1Q1SB1.S1.C1.LN0.Performance.ethHeaderData.destMACAddress[0] = 0x01;
	E1Q1SB1.S1.C1.LN0.Performance.ethHeaderData.destMACAddress[1] = 0x0C;
	E1Q1SB1.S1.C1.LN0.Performance.ethHeaderData.destMACAddress[2] = 0xCD;
	E1Q1SB1.S1.C1.LN0.Performance.ethHeaderData.destMACAddress[3] = 0x01;
	E1Q1SB1.S1.C1.LN0.Performance.ethHeaderData.destMACAddress[4] = 0x00;
	E1Q1SB1.S1.C1.LN0.Performance.ethHeaderData.destMACAddress[5] = 0x04;
	E1Q1SB1.S1.C1.LN0.Performance.ethHeaderData.APPID = 0x3000;
	E1Q1SB1.S1.C1.LN0.Performance.ethHeaderData.VLAN_PRIORITY = 0x4;
	E1Q1SB1.S1.C1.LN0.Performance.ethHeaderData.VLAN_ID = 4;
	E1Q1SB1.S1.C1.LN0.Performance.goID = (unsigned char *) malloc(12);
	strncpy((char *) E1Q1SB1.S1.C1.LN0.Performance.goID, "Performance\0", 12);
	E1Q1SB1.S1.C1.LN0.Performance.t = 0;
	E1Q1SB1.S1.C1.LN0.Performance.gocbRef = (unsigned char *) malloc(30);
	strncpy((char *) E1Q1SB1.S1.C1.LN0.Performance.gocbRef, "E1Q1SB1C1/LLN0$GO$Performance\0", 30);
	E1Q1SB1.S1.C1.LN0.Performance.datSet = (unsigned char *) malloc(27);
	strncpy((char *) E1Q1SB1.S1.C1.LN0.Performance.datSet, "E1Q1SB1C1/LLN0$Performance\0", 27);
	E1Q1SB1.S1.C1.LN0.Performance.timeAllowedToLive = 0;
	E1Q1SB1.S1.C1.LN0.Performance.stNum = 0;
	E1Q1SB1.S1.C1.LN0.Performance.sqNum = 0;
	E1Q1SB1.S1.C1.LN0.Performance.test = 0;
	E1Q1SB1.S1.C1.LN0.Performance.confRev = 1;
	E1Q1SB1.S1.C1.LN0.Performance.ndsCom = 0;
	E1Q1SB1.S1.C1.LN0.Performance.numDatSetEntries = 2;
	E1Q1SB1.S1.C1.LN0.Performance.encodeDataset = &ber_encode_E1Q1SB1_C1_Performance;
	E1Q1SB1.S1.C1.LN0.Performance.getDatasetLength = &ber_get_length_E1Q1SB1_C1_Performance;
	E1Q1SB1.S1.C1.LN0.Performance.send = &gse_send_E1Q1SB1_C1_Performance;
	E1Q1SB1.S1.C1.LN0.ItlPositions.ethHeaderData.destMACAddress[0] = 0x01;
	E1Q1SB1.S1.C1.LN0.ItlPositions.ethHeaderData.destMACAddress[1] = 0x0C;
	E1Q1SB1.S1.C1.LN0.ItlPositions.ethHeaderData.destMACAddress[2] = 0xCD;
	E1Q1SB1.S1.C1.LN0.ItlPositions.ethHeaderData.destMACAddress[3] = 0x01;
	E1Q1SB1.S1.C1.LN0.ItlPositions.ethHeaderData.destMACAddress[4] = 0x00;
	E1Q1SB1.S1.C1.LN0.ItlPositions.ethHeaderData.destMACAddress[5] = 0x04;
	E1Q1SB1.S1.C1.LN0.ItlPositions.ethHeaderData.APPID = 0x3000;
	E1Q1SB1.S1.C1.LN0.ItlPositions.ethHeaderData.VLAN_PRIORITY = 0x4;
	E1Q1SB1.S1.C1.LN0.ItlPositions.ethHeaderData.VLAN_ID = 4;
	E1Q1SB1.S1.C1.LN0.ItlPositions.goID = (unsigned char *) malloc(4);
	strncpy((char *) E1Q1SB1.S1.C1.LN0.ItlPositions.goID, "Itl\0", 4);
	E1Q1SB1.S1.C1.LN0.ItlPositions.t = 0;
	E1Q1SB1.S1.C1.LN0.ItlPositions.gocbRef = (unsigned char *) malloc(31);
	strncpy((char *) E1Q1SB1.S1.C1.LN0.ItlPositions.gocbRef, "E1Q1SB1C1/LLN0$GO$ItlPositions\0", 31);
	E1Q1SB1.S1.C1.LN0.ItlPositions.datSet = (unsigned char *) malloc(25);
	strncpy((char *) E1Q1SB1.S1.C1.LN0.ItlPositions.datSet, "E1Q1SB1C1/LLN0$Positions\0", 25);
	E1Q1SB1.S1.C1.LN0.ItlPositions.timeAllowedToLive = 0;
	E1Q1SB1.S1.C1.LN0.ItlPositions.stNum = 0;
	E1Q1SB1.S1.C1.LN0.ItlPositions.sqNum = 0;
	E1Q1SB1.S1.C1.LN0.ItlPositions.test = 0;
	E1Q1SB1.S1.C1.LN0.ItlPositions.confRev = 1;
	E1Q1SB1.S1.C1.LN0.ItlPositions.ndsCom = 0;
	E1Q1SB1.S1.C1.LN0.ItlPositions.numDatSetEntries = 4;
	E1Q1SB1.S1.C1.LN0.ItlPositions.encodeDataset = &ber_encode_E1Q1SB1_C1_Positions;
	E1Q1SB1.S1.C1.LN0.ItlPositions.getDatasetLength = &ber_get_length_E1Q1SB1_C1_Positions;
	E1Q1SB1.S1.C1.LN0.ItlPositions.send = &gse_send_E1Q1SB1_C1_ItlPositions;
	E1Q1SB1.S1.C1.LN0.AnotherPositions.ethHeaderData.destMACAddress[0] = 0x01;
	E1Q1SB1.S1.C1.LN0.AnotherPositions.ethHeaderData.destMACAddress[1] = 0x0C;
	E1Q1SB1.S1.C1.LN0.AnotherPositions.ethHeaderData.destMACAddress[2] = 0xCD;
	E1Q1SB1.S1.C1.LN0.AnotherPositions.ethHeaderData.destMACAddress[3] = 0x01;
	E1Q1SB1.S1.C1.LN0.AnotherPositions.ethHeaderData.destMACAddress[4] = 0x00;
	E1Q1SB1.S1.C1.LN0.AnotherPositions.ethHeaderData.destMACAddress[5] = 0x04;
	E1Q1SB1.S1.C1.LN0.AnotherPositions.ethHeaderData.APPID = 0x3000;
	E1Q1SB1.S1.C1.LN0.AnotherPositions.ethHeaderData.VLAN_PRIORITY = 0x4;
	E1Q1SB1.S1.C1.LN0.AnotherPositions.ethHeaderData.VLAN_ID = 4;
	E1Q1SB1.S1.C1.LN0.AnotherPositions.goID = (unsigned char *) malloc(4);
	strncpy((char *) E1Q1SB1.S1.C1.LN0.AnotherPositions.goID, "Itl\0", 4);
	E1Q1SB1.S1.C1.LN0.AnotherPositions.t = 0;
	E1Q1SB1.S1.C1.LN0.AnotherPositions.gocbRef = (unsigned char *) malloc(35);
	strncpy((char *) E1Q1SB1.S1.C1.LN0.AnotherPositions.gocbRef, "E1Q1SB1C1/LLN0$GO$AnotherPositions\0", 35);
	E1Q1SB1.S1.C1.LN0.AnotherPositions.datSet = (unsigned char *) malloc(25);
	strncpy((char *) E1Q1SB1.S1.C1.LN0.AnotherPositions.datSet, "E1Q1SB1C1/LLN0$Positions\0", 25);
	E1Q1SB1.S1.C1.LN0.AnotherPositions.timeAllowedToLive = 0;
	E1Q1SB1.S1.C1.LN0.AnotherPositions.stNum = 0;
	E1Q1SB1.S1.C1.LN0.AnotherPositions.sqNum = 0;
	E1Q1SB1.S1.C1.LN0.AnotherPositions.test = 0;
	E1Q1SB1.S1.C1.LN0.AnotherPositions.confRev = 1;
	E1Q1SB1.S1.C1.LN0.AnotherPositions.ndsCom = 0;
	E1Q1SB1.S1.C1.LN0.AnotherPositions.numDatSetEntries = 4;
	E1Q1SB1.S1.C1.LN0.AnotherPositions.encodeDataset = &ber_encode_E1Q1SB1_C1_Positions;
	E1Q1SB1.S1.C1.LN0.AnotherPositions.getDatasetLength = &ber_get_length_E1Q1SB1_C1_Positions;
	E1Q1SB1.S1.C1.LN0.AnotherPositions.send = &gse_send_E1Q1SB1_C1_AnotherPositions;
	D1Q1SB4.S1.C1.LN0.SyckResult.ethHeaderData.destMACAddress[0] = 0x01;
	D1Q1SB4.S1.C1.LN0.SyckResult.ethHeaderData.destMACAddress[1] = 0x0C;
	D1Q1SB4.S1.C1.LN0.SyckResult.ethHeaderData.destMACAddress[2] = 0xCD;
	D1Q1SB4.S1.C1.LN0.SyckResult.ethHeaderData.destMACAddress[3] = 0x01;
	D1Q1SB4.S1.C1.LN0.SyckResult.ethHeaderData.destMACAddress[4] = 0x00;
	D1Q1SB4.S1.C1.LN0.SyckResult.ethHeaderData.destMACAddress[5] = 0x02;
	D1Q1SB4.S1.C1.LN0.SyckResult.ethHeaderData.APPID = 0x3001;
	D1Q1SB4.S1.C1.LN0.SyckResult.ethHeaderData.VLAN_PRIORITY = 0x4;
	D1Q1SB4.S1.C1.LN0.SyckResult.ethHeaderData.VLAN_ID = 4;
	D1Q1SB4.S1.C1.LN0.SyckResult.goID = (unsigned char *) malloc(7);
	strncpy((char *) D1Q1SB4.S1.C1.LN0.SyckResult.goID, "SynChk\0", 7);
	D1Q1SB4.S1.C1.LN0.SyckResult.t = 0;
	D1Q1SB4.S1.C1.LN0.SyckResult.gocbRef = (unsigned char *) malloc(29);
	strncpy((char *) D1Q1SB4.S1.C1.LN0.SyckResult.gocbRef, "D1Q1SB4C1/LLN0$GO$SyckResult\0", 29);
	D1Q1SB4.S1.C1.LN0.SyckResult.datSet = (unsigned char *) malloc(26);
	strncpy((char *) D1Q1SB4.S1.C1.LN0.SyckResult.datSet, "D1Q1SB4C1/LLN0$SyckResult\0", 26);
	D1Q1SB4.S1.C1.LN0.SyckResult.timeAllowedToLive = 0;
	D1Q1SB4.S1.C1.LN0.SyckResult.stNum = 0;
	D1Q1SB4.S1.C1.LN0.SyckResult.sqNum = 0;
	D1Q1SB4.S1.C1.LN0.SyckResult.test = 0;
	D1Q1SB4.S1.C1.LN0.SyckResult.confRev = 0;
	D1Q1SB4.S1.C1.LN0.SyckResult.ndsCom = 0;
	D1Q1SB4.S1.C1.LN0.SyckResult.numDatSetEntries = 1;
	D1Q1SB4.S1.C1.LN0.SyckResult.encodeDataset = &ber_encode_D1Q1SB4_C1_SyckResult;
	D1Q1SB4.S1.C1.LN0.SyckResult.getDatasetLength = &ber_get_length_D1Q1SB4_C1_SyckResult;
	D1Q1SB4.S1.C1.LN0.SyckResult.send = &gse_send_D1Q1SB4_C1_SyckResult;
	D1Q1SB4.S1.C1.LN0.MMXUResult.ethHeaderData.destMACAddress[0] = 0x01;
	D1Q1SB4.S1.C1.LN0.MMXUResult.ethHeaderData.destMACAddress[1] = 0x0C;
	D1Q1SB4.S1.C1.LN0.MMXUResult.ethHeaderData.destMACAddress[2] = 0xCD;
	D1Q1SB4.S1.C1.LN0.MMXUResult.ethHeaderData.destMACAddress[3] = 0x01;
	D1Q1SB4.S1.C1.LN0.MMXUResult.ethHeaderData.destMACAddress[4] = 0x00;
	D1Q1SB4.S1.C1.LN0.MMXUResult.ethHeaderData.destMACAddress[5] = 0x02;
	D1Q1SB4.S1.C1.LN0.MMXUResult.ethHeaderData.APPID = 0x3001;
	D1Q1SB4.S1.C1.LN0.MMXUResult.ethHeaderData.VLAN_PRIORITY = 0x4;
	D1Q1SB4.S1.C1.LN0.MMXUResult.ethHeaderData.VLAN_ID = 4;
	D1Q1SB4.S1.C1.LN0.MMXUResult.goID = (unsigned char *) malloc(11);
	strncpy((char *) D1Q1SB4.S1.C1.LN0.MMXUResult.goID, "MMXUResult\0", 11);
	D1Q1SB4.S1.C1.LN0.MMXUResult.t = 0;
	D1Q1SB4.S1.C1.LN0.MMXUResult.gocbRef = (unsigned char *) malloc(29);
	strncpy((char *) D1Q1SB4.S1.C1.LN0.MMXUResult.gocbRef, "D1Q1SB4C1/LLN0$GO$MMXUResult\0", 29);
	D1Q1SB4.S1.C1.LN0.MMXUResult.datSet = (unsigned char *) malloc(26);
	strncpy((char *) D1Q1SB4.S1.C1.LN0.MMXUResult.datSet, "D1Q1SB4C1/LLN0$MMXUResult\0", 26);
	D1Q1SB4.S1.C1.LN0.MMXUResult.timeAllowedToLive = 0;
	D1Q1SB4.S1.C1.LN0.MMXUResult.stNum = 0;
	D1Q1SB4.S1.C1.LN0.MMXUResult.sqNum = 0;
	D1Q1SB4.S1.C1.LN0.MMXUResult.test = 0;
	D1Q1SB4.S1.C1.LN0.MMXUResult.confRev = 0;
	D1Q1SB4.S1.C1.LN0.MMXUResult.ndsCom = 0;
	D1Q1SB4.S1.C1.LN0.MMXUResult.numDatSetEntries = 1;
	D1Q1SB4.S1.C1.LN0.MMXUResult.encodeDataset = &ber_encode_D1Q1SB4_C1_MMXUResult;
	D1Q1SB4.S1.C1.LN0.MMXUResult.getDatasetLength = &ber_get_length_D1Q1SB4_C1_MMXUResult;
	D1Q1SB4.S1.C1.LN0.MMXUResult.send = &gse_send_D1Q1SB4_C1_MMXUResult;
}

