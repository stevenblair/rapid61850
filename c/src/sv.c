/**
 * Rapid-prototyping protection schemes with IEC 61850
 *
 * Copyright (c) 2011 Steven Blair
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

#include "sv.h"
#include "svPacketData.h"
#include "svDecode.h"
#include "svEncode.h"

struct svData Volt_11;
struct svData rmxuCB_rmxu;




// returns 1 if buf contains valid packet data
int sv_update_Volt_11(unsigned char *buf) {
	int size = encode_11(Volt_11.ASDU[Volt_11.ASDUCount].data.data);
	Volt_11.ASDU[Volt_11.ASDUCount].data.size = size;

	Volt_11.ASDU[Volt_11.ASDUCount].smpCnt = Volt_11.sampleCountMaster;
	Volt_11.sampleCountMaster++;

	if (++Volt_11.ASDUCount == Volt_11.noASDU) {
		Volt_11.ASDUCount = 0;
		return svEncodePacket(&Volt_11, buf);
	}

	return 0;
}

// returns 1 if buf contains valid packet data
int sv_update_rmxuCB_rmxu(unsigned char *buf) {
	int size = encode_rmxu(rmxuCB_rmxu.ASDU[rmxuCB_rmxu.ASDUCount].data.data);
	rmxuCB_rmxu.ASDU[rmxuCB_rmxu.ASDUCount].data.size = size;

	rmxuCB_rmxu.ASDU[rmxuCB_rmxu.ASDUCount].smpCnt = rmxuCB_rmxu.sampleCountMaster;
	rmxuCB_rmxu.sampleCountMaster++;

	if (++rmxuCB_rmxu.ASDUCount == rmxuCB_rmxu.noASDU) {
		rmxuCB_rmxu.ASDUCount = 0;
		return svEncodePacket(&rmxuCB_rmxu, buf);
	}

	return 0;
}

void init_sv() {
	int i = 0;

	Volt_11.noASDU = 2;
	Volt_11.ethHeaderData.destMACAddress[0] = 0x01;
	Volt_11.ethHeaderData.destMACAddress[1] = 0x0C;
	Volt_11.ethHeaderData.destMACAddress[2] = 0xCD;
	Volt_11.ethHeaderData.destMACAddress[3] = 0x04;
	Volt_11.ethHeaderData.destMACAddress[4] = 0x00;
	Volt_11.ethHeaderData.destMACAddress[5] = 0x01;
	Volt_11.ethHeaderData.APPID = 0x4000;
	Volt_11.ethHeaderData.VLAN_ID = 0x123;
	Volt_11.ethHeaderData.VLAN_PRIORITY = 0x4;
	Volt_11.ASDU = (struct ASDU *) malloc(2 * sizeof(struct ASDU));
	for (i = 0; i < 2; i++) {
		Volt_11.ASDU[i].svID = (unsigned char *) malloc(3);
		strncpy((char *) Volt_11.ASDU[i].svID, "11\0", 3);
		Volt_11.ASDU[i].datset = (unsigned char *) malloc(4);
		strncpy((char *) Volt_11.ASDU[i].datset, "smv\0", 4);
		Volt_11.ASDU[i].smpCnt = 0;
		Volt_11.ASDU[i].confRev = 1;
		Volt_11.ASDU[i].smpSynch = 1;
		Volt_11.ASDU[i].smpRate = 4800;
		Volt_11.ASDU[i].data.size = 0;
	}
	Volt_11.ASDUCount = 0;
	Volt_11.datasetDecodeDone = NULL;

	rmxuCB_rmxu.noASDU = 16;
	rmxuCB_rmxu.ethHeaderData.destMACAddress[0] = 0x01;
	rmxuCB_rmxu.ethHeaderData.destMACAddress[1] = 0x0C;
	rmxuCB_rmxu.ethHeaderData.destMACAddress[2] = 0xCD;
	rmxuCB_rmxu.ethHeaderData.destMACAddress[3] = 0x04;
	rmxuCB_rmxu.ethHeaderData.destMACAddress[4] = 0x00;
	rmxuCB_rmxu.ethHeaderData.destMACAddress[5] = 0x01;
	rmxuCB_rmxu.ethHeaderData.APPID = 0x4000;
	rmxuCB_rmxu.ethHeaderData.VLAN_ID = 0x123;
	rmxuCB_rmxu.ethHeaderData.VLAN_PRIORITY = 0x4;
	rmxuCB_rmxu.ASDU = (struct ASDU *) malloc(16 * sizeof(struct ASDU));
	for (i = 0; i < 16; i++) {
		rmxuCB_rmxu.ASDU[i].svID = (unsigned char *) malloc(5);
		strncpy((char *) rmxuCB_rmxu.ASDU[i].svID, "rmxu\0", 5);
		rmxuCB_rmxu.ASDU[i].datset = (unsigned char *) malloc(5);
		strncpy((char *) rmxuCB_rmxu.ASDU[i].datset, "rmxu\0", 5);
		rmxuCB_rmxu.ASDU[i].smpCnt = 0;
		rmxuCB_rmxu.ASDU[i].confRev = 1;
		rmxuCB_rmxu.ASDU[i].smpSynch = 1;
		rmxuCB_rmxu.ASDU[i].smpRate = 16;
		rmxuCB_rmxu.ASDU[i].data.size = 0;
	}
	rmxuCB_rmxu.ASDUCount = 0;
	rmxuCB_rmxu.datasetDecodeDone = NULL;
}

