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

#include "svPacketData.h"
#include "svEncode.h"
#include "gseEncode.h"
#include "encodePacket.h"


int svASDULength(struct svData *svData) {
	int len = 0;

	len += strlen((const char *) svData->ASDU[0].svID) + 2;
	//printf("%i, %s\n", strlen(svData->ASDU[0].svID), svData->ASDU[0].svID);
	//len += strlen((const char *) svData->ASDU[0].datset) + 2;
	len += BER_GET_LENGTH_CTYPE_INT16U(&svData->ASDU[0].smpCnt) + 2;
	len += BER_GET_LENGTH_CTYPE_INT32U(&svData->ASDU[0].confRev) + 2;
	len += SV_GET_LENGTH_BOOLEAN + 2;
	//len += BER_GET_LENGTH_CTYPE_INT16U(&svData->ASDU[0].smpRate) + 2;
	len += svData->ASDU[0].data.size + getLengthBytes(svData->ASDU[0].data.size);
	len++;

	return len;
}

int svSeqLength(struct svData *svData) {
	int len = svASDULength(svData);
	len += getLengthBytes(len);
	len++;
	len = len * svData->noASDU;	// assume all ASDUs are the same size

	return len;
}

int svAPDULength(struct svData *svData) {
	int len = svSeqLength(svData);
	len += getLengthBytes(len);
	len++;

	len += 3;

	return len;
}


//TODO: convert to proper BER sizes
// creates an SV packet, including frame header. returns 0 on fail; number of bytes on success
int svEncodePacket(struct svData *svData, unsigned char *buf) {
	int offset = 0;
	int len = svAPDULength(svData);
	len += getLengthBytes(len);
	len += 9;		// savPdu tag size (1 byte), plus 8 "header" bytes

	// frame header
	memcpy(&buf[offset], svData->ethHeaderData.destMACAddress, 6);	// destination MAC addresses
	offset += 6;
	memcpy(&buf[offset], LOCAL_MAC_ADDRESS, 6);						// source MAC addresses
	offset += 6;

	buf[offset++] = 0x81;	// TPID
	buf[offset++] = 0x00;

	netmemcpy(&buf[offset], &svData->ethHeaderData.VLAN_ID, 2);	// TCI
	buf[offset] |= (svData->ethHeaderData.VLAN_PRIORITY << 5);
	offset += 2;

	buf[offset++] = 0x88;	// EtherType
	buf[offset++] = 0xBA;

	netmemcpy(&buf[offset], &svData->ethHeaderData.APPID, 2);	// APPID
	offset += 2;

	netmemcpy(&buf[offset], &len, 2);	// length
	offset += 2;

	buf[offset++] = 0x00;	// reserved 1
	buf[offset++] = 0x00;
	buf[offset++] = 0x00;	// reserved 2
	buf[offset++] = 0x00;

	buf[offset++] = 0x60;
	offset += encodeLength(&buf[offset], svAPDULength(svData));

	//TODO noASDU may be > 126?
	buf[offset++] = 0x80;
	buf[offset++] = 1;
	buf[offset++] = (unsigned char) svData->noASDU;

	buf[offset++] = 0xA2;
	offset += encodeLength(&buf[offset], svSeqLength(svData));

	int i = 0;
	int size = 0;
	for (i = 0; i < svData->noASDU; i++) {
		buf[offset++] = 0x30;
		offset += encodeLength(&buf[offset], svASDULength(svData));

		size = strlen((const char *) svData->ASDU[i].svID);
		buf[offset++] = 0x80;
		buf[offset++] = size;
		memcpy(&buf[offset], svData->ASDU[i].svID, size);
		offset += size;

		/*size = strlen(svData->ASDU[i].datset);
		buf[offset++] = 0x81;
		buf[offset++] = size;
		memcpy(&buf[offset], svData->ASDU[i].datset, size);
		offset += size;*/

		buf[offset++] = 0x82;
		offset += encodeLength(&buf[offset], BER_GET_LENGTH_CTYPE_INT16U(&svData->ASDU[i].smpCnt));
		offset += ber_encode_integer(&buf[offset], &svData->ASDU[i].smpCnt, SV_GET_LENGTH_INT16U);
		//buf[offset++] = BER_GET_LENGTH_CTYPE_INT16U(&svData->ASDU[i].smpCnt);
		//offset += BER_ENCODE_CTYPE_INT16U(&buf[offset], &svData->ASDU[i].smpCnt);

		buf[offset++] = 0x83;
		offset += encodeLength(&buf[offset], BER_GET_LENGTH_CTYPE_INT32U(&svData->ASDU[i].confRev));
		offset += ber_encode_integer(&buf[offset], &svData->ASDU[i].confRev, SV_GET_LENGTH_INT32U);
		//buf[offset++] = BER_GET_LENGTH_CTYPE_INT32U(&svData->ASDU[i].confRev);
		//offset += BER_ENCODE_CTYPE_INT32U(&buf[offset], &svData->ASDU[i].confRev);

		buf[offset++] = 0x85;
		buf[offset++] = SV_GET_LENGTH_BOOLEAN;
		offset += ENCODE_CTYPE_BOOLEAN(&buf[offset], &svData->ASDU[i].smpSynch);

		/*buf[offset++] = 0x86;
		buf[offset++] = SV_GET_LENGTH_INT16U;
		offset += ENCODE_CTYPE_INT16U(&buf[offset], &svData->ASDU[i].smpRate);*/

		buf[offset++] = 0x87;
		offset += encodeLength(&buf[offset], svData->ASDU[i].data.size);
		memcpy(&buf[offset], svData->ASDU[i].data.data, svData->ASDU[i].data.size);
		offset += svData->ASDU[i].data.size;
	}

	// assume network interface, such as WinPcap, generates CRC bytes

	return offset;
}
