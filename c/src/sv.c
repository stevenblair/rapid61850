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
int sv_update_Send_D1_udCB(unsigned char *buf) {
	int size = encode_control_Send_D1_udCB(Send.S1.D1.LN0.udCB.ASDU[Send.S1.D1.LN0.udCB.ASDUCount].data.data);
	Send.S1.D1.LN0.udCB.ASDU[Send.S1.D1.LN0.udCB.ASDUCount].data.size = size;

	Send.S1.D1.LN0.udCB.ASDU[Send.S1.D1.LN0.udCB.ASDUCount].smpCnt = Send.S1.D1.LN0.udCB.sampleCountMaster;
	Send.S1.D1.LN0.udCB.sampleCountMaster++;

	if (++Send.S1.D1.LN0.udCB.ASDUCount == Send.S1.D1.LN0.udCB.noASDU) {
		Send.S1.D1.LN0.udCB.ASDUCount = 0;
		return svEncodePacket(&Send.S1.D1.LN0.udCB, buf);
	}

	return 0;
}

void init_sv() {
	int i = 0;

	Send.S1.D1.LN0.udCB.noASDU = 16;
	Send.S1.D1.LN0.udCB.ethHeaderData.destMACAddress[0] = 0x01;
	Send.S1.D1.LN0.udCB.ethHeaderData.destMACAddress[1] = 0x0C;
	Send.S1.D1.LN0.udCB.ethHeaderData.destMACAddress[2] = 0xCD;
	Send.S1.D1.LN0.udCB.ethHeaderData.destMACAddress[3] = 0x04;
	Send.S1.D1.LN0.udCB.ethHeaderData.destMACAddress[4] = 0x00;
	Send.S1.D1.LN0.udCB.ethHeaderData.destMACAddress[5] = 0x01;
	Send.S1.D1.LN0.udCB.ethHeaderData.APPID = 0x4000;
	Send.S1.D1.LN0.udCB.ethHeaderData.VLAN_ID = 0x123;
	Send.S1.D1.LN0.udCB.ethHeaderData.VLAN_PRIORITY = 0x4;
	Send.S1.D1.LN0.udCB.ASDU = (struct ASDU *) malloc(16 * sizeof(struct ASDU));
	for (i = 0; i < 16; i++) {
		Send.S1.D1.LN0.udCB.ASDU[i].svID = (unsigned char *) malloc(3);
		strncpy((char *) Send.S1.D1.LN0.udCB.ASDU[i].svID, "ud\0", 3);
		Send.S1.D1.LN0.udCB.ASDU[i].datset = (unsigned char *) malloc(3);
		strncpy((char *) Send.S1.D1.LN0.udCB.ASDU[i].datset, "ud\0", 3);
		Send.S1.D1.LN0.udCB.ASDU[i].smpCnt = 0;
		Send.S1.D1.LN0.udCB.ASDU[i].confRev = 1;
		Send.S1.D1.LN0.udCB.ASDU[i].smpSynch = 1;
		Send.S1.D1.LN0.udCB.ASDU[i].showRefrTm = 1;
		Send.S1.D1.LN0.udCB.ASDU[i].showDatset = 0;
		Send.S1.D1.LN0.udCB.ASDU[i].showSmpRate = 1;
		Send.S1.D1.LN0.udCB.ASDU[i].smpRate = 16;
		Send.S1.D1.LN0.udCB.ASDU[i].data.size = 0;
	}
	Send.S1.D1.LN0.udCB.ASDUCount = 0;
	Send.S1.D1.LN0.udCB.update = &sv_update_Send_D1_udCB;
}

