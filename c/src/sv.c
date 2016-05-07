/**
 * Rapid-prototyping protection schemes with IEC 61850
 *
 * Copyright (c) 2014 Steven Blair
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
int sv_update_LE_IED_MUnn_MSVCB01(unsigned char *buf) {
	int size = encode_control_LE_IED_MUnn_MSVCB01(LE_IED.S1.MUnn.LN0.MSVCB01.ASDU[LE_IED.S1.MUnn.LN0.MSVCB01.ASDUCount].data.data);
	LE_IED.S1.MUnn.LN0.MSVCB01.ASDU[LE_IED.S1.MUnn.LN0.MSVCB01.ASDUCount].data.size = size;

	LE_IED.S1.MUnn.LN0.MSVCB01.ASDU[LE_IED.S1.MUnn.LN0.MSVCB01.ASDUCount].smpCnt = LE_IED.S1.MUnn.LN0.MSVCB01.sampleCountMaster;
	LE_IED.S1.MUnn.LN0.MSVCB01.sampleCountMaster++;

	if (LE_IED.S1.MUnn.LN0.MSVCB01.sampleCountMaster == LE_IED.S1.MUnn.LN0.MSVCB01.ASDU[LE_IED.S1.MUnn.LN0.MSVCB01.ASDUCount].smpRate) {
		LE_IED.S1.MUnn.LN0.MSVCB01.sampleCountMaster = 0;
	}

	if (++LE_IED.S1.MUnn.LN0.MSVCB01.ASDUCount == LE_IED.S1.MUnn.LN0.MSVCB01.noASDU) {
		LE_IED.S1.MUnn.LN0.MSVCB01.ASDUCount = 0;
		return svEncodePacket(&LE_IED.S1.MUnn.LN0.MSVCB01, buf);
	}

	return 0;
}

// returns 1 if buf contains valid packet data
int sv_update_LE_IED_MUnn_MSVCB02(unsigned char *buf) {
	int size = encode_control_LE_IED_MUnn_MSVCB02(LE_IED.S1.MUnn.LN0.MSVCB02.ASDU[LE_IED.S1.MUnn.LN0.MSVCB02.ASDUCount].data.data);
	LE_IED.S1.MUnn.LN0.MSVCB02.ASDU[LE_IED.S1.MUnn.LN0.MSVCB02.ASDUCount].data.size = size;

	LE_IED.S1.MUnn.LN0.MSVCB02.ASDU[LE_IED.S1.MUnn.LN0.MSVCB02.ASDUCount].smpCnt = LE_IED.S1.MUnn.LN0.MSVCB02.sampleCountMaster;
	LE_IED.S1.MUnn.LN0.MSVCB02.sampleCountMaster++;

	if (LE_IED.S1.MUnn.LN0.MSVCB02.sampleCountMaster == LE_IED.S1.MUnn.LN0.MSVCB02.ASDU[LE_IED.S1.MUnn.LN0.MSVCB02.ASDUCount].smpRate) {
		LE_IED.S1.MUnn.LN0.MSVCB02.sampleCountMaster = 0;
	}

	if (++LE_IED.S1.MUnn.LN0.MSVCB02.ASDUCount == LE_IED.S1.MUnn.LN0.MSVCB02.noASDU) {
		LE_IED.S1.MUnn.LN0.MSVCB02.ASDUCount = 0;
		return svEncodePacket(&LE_IED.S1.MUnn.LN0.MSVCB02, buf);
	}

	return 0;
}

void init_sv() {
	int i = 0;

	LE_IED.S1.MUnn.LN0.MSVCB01.noASDU = 1;
	LE_IED.S1.MUnn.LN0.MSVCB01.ethHeaderData.destMACAddress[0] = 0x01;
	LE_IED.S1.MUnn.LN0.MSVCB01.ethHeaderData.destMACAddress[1] = 0x0C;
	LE_IED.S1.MUnn.LN0.MSVCB01.ethHeaderData.destMACAddress[2] = 0xCD;
	LE_IED.S1.MUnn.LN0.MSVCB01.ethHeaderData.destMACAddress[3] = 0x04;
	LE_IED.S1.MUnn.LN0.MSVCB01.ethHeaderData.destMACAddress[4] = 0x00;
	LE_IED.S1.MUnn.LN0.MSVCB01.ethHeaderData.destMACAddress[5] = 0x01;
	LE_IED.S1.MUnn.LN0.MSVCB01.ethHeaderData.APPID = 0x4000;
	LE_IED.S1.MUnn.LN0.MSVCB01.ethHeaderData.VLAN_ID = 0x000;
	LE_IED.S1.MUnn.LN0.MSVCB01.ethHeaderData.VLAN_PRIORITY = 0x4;
	LE_IED.S1.MUnn.LN0.MSVCB01.ASDU = (struct ASDU *) calloc(1, sizeof(struct ASDU));
	for (i = 0; i < 1; i++) {
		LE_IED.S1.MUnn.LN0.MSVCB01.ASDU[i].svID = (unsigned char *) calloc(1, 10);
		strncpy((char *) LE_IED.S1.MUnn.LN0.MSVCB01.ASDU[i].svID, "000MU0001\0", 10);
		LE_IED.S1.MUnn.LN0.MSVCB01.ASDU[i].datset = (unsigned char *) calloc(1, 9);
		strncpy((char *) LE_IED.S1.MUnn.LN0.MSVCB01.ASDU[i].datset, "PhsMeas1\0", 9);
		LE_IED.S1.MUnn.LN0.MSVCB01.ASDU[i].smpCnt = 0;
		LE_IED.S1.MUnn.LN0.MSVCB01.ASDU[i].confRev = 1;
		LE_IED.S1.MUnn.LN0.MSVCB01.ASDU[i].smpSynch = 1;
		LE_IED.S1.MUnn.LN0.MSVCB01.ASDU[i].showRefrTm = 0;
		LE_IED.S1.MUnn.LN0.MSVCB01.ASDU[i].showDatset = 0;
		LE_IED.S1.MUnn.LN0.MSVCB01.ASDU[i].showSmpRate = 0;
		LE_IED.S1.MUnn.LN0.MSVCB01.ASDU[i].smpRate = 4000;
		LE_IED.S1.MUnn.LN0.MSVCB01.ASDU[i].data.size = 0;
	}
	LE_IED.S1.MUnn.LN0.MSVCB01.ASDUCount = 0;
	LE_IED.S1.MUnn.LN0.MSVCB01.update = &sv_update_LE_IED_MUnn_MSVCB01;

	LE_IED.S1.MUnn.LN0.MSVCB02.noASDU = 1;
	LE_IED.S1.MUnn.LN0.MSVCB02.ethHeaderData.destMACAddress[0] = 0x01;
	LE_IED.S1.MUnn.LN0.MSVCB02.ethHeaderData.destMACAddress[1] = 0x0C;
	LE_IED.S1.MUnn.LN0.MSVCB02.ethHeaderData.destMACAddress[2] = 0xCD;
	LE_IED.S1.MUnn.LN0.MSVCB02.ethHeaderData.destMACAddress[3] = 0x04;
	LE_IED.S1.MUnn.LN0.MSVCB02.ethHeaderData.destMACAddress[4] = 0x00;
	LE_IED.S1.MUnn.LN0.MSVCB02.ethHeaderData.destMACAddress[5] = 0x01;
	LE_IED.S1.MUnn.LN0.MSVCB02.ethHeaderData.APPID = 0x4000;
	LE_IED.S1.MUnn.LN0.MSVCB02.ethHeaderData.VLAN_ID = 0x000;
	LE_IED.S1.MUnn.LN0.MSVCB02.ethHeaderData.VLAN_PRIORITY = 0x4;
	LE_IED.S1.MUnn.LN0.MSVCB02.ASDU = (struct ASDU *) calloc(1, sizeof(struct ASDU));
	for (i = 0; i < 1; i++) {
		LE_IED.S1.MUnn.LN0.MSVCB02.ASDU[i].svID = (unsigned char *) calloc(1, 10);
		strncpy((char *) LE_IED.S1.MUnn.LN0.MSVCB02.ASDU[i].svID, "000MU0101\0", 10);
		LE_IED.S1.MUnn.LN0.MSVCB02.ASDU[i].datset = (unsigned char *) calloc(1, 9);
		strncpy((char *) LE_IED.S1.MUnn.LN0.MSVCB02.ASDU[i].datset, "PhsMeas2\0", 9);
		LE_IED.S1.MUnn.LN0.MSVCB02.ASDU[i].smpCnt = 0;
		LE_IED.S1.MUnn.LN0.MSVCB02.ASDU[i].confRev = 1;
		LE_IED.S1.MUnn.LN0.MSVCB02.ASDU[i].smpSynch = 1;
		LE_IED.S1.MUnn.LN0.MSVCB02.ASDU[i].showRefrTm = 0;
		LE_IED.S1.MUnn.LN0.MSVCB02.ASDU[i].showDatset = 0;
		LE_IED.S1.MUnn.LN0.MSVCB02.ASDU[i].showSmpRate = 0;
		LE_IED.S1.MUnn.LN0.MSVCB02.ASDU[i].smpRate = 4000;
		LE_IED.S1.MUnn.LN0.MSVCB02.ASDU[i].data.size = 0;
	}
	LE_IED.S1.MUnn.LN0.MSVCB02.ASDUCount = 0;
	LE_IED.S1.MUnn.LN0.MSVCB02.update = &sv_update_LE_IED_MUnn_MSVCB02;
}

