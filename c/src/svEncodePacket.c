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

#include "svPacketData.h"
#include "svEncode.h"
#include "gseEncode.h"
#include "encodePacket.h"


int svASDULength(struct svControl *svControl) {
	int len = 0;

	len += strlen((const char *) svControl->ASDU[0].svID) + 2;
	//printf("%i, %s\n", strlen(svControl->ASDU[0].svID), svControl->ASDU[0].svID);
	//len += strlen((const char *) svControl->ASDU[0].datset) + 2;
	len += ber_integer_length((&svControl->ASDU[0].smpCnt), SV_GET_LENGTH_INT16U)/*BER_GET_LENGTH_CTYPE_INT16U(&svControl->ASDU[0].smpCnt)*/ + 2;
	len += ber_integer_length((&svControl->ASDU[0].confRev), SV_GET_LENGTH_INT32U)/*BER_GET_LENGTH_CTYPE_INT32U(&svControl->ASDU[0].confRev)*/ + 2;
	len += SV_GET_LENGTH_BOOLEAN + 2;
	//len += BER_GET_LENGTH_CTYPE_INT16U(&svControl->ASDU[0].smpRate) + 2;
	len += svControl->ASDU[0].data.size + getLengthBytes(svControl->ASDU[0].data.size);
	len++;

	return len;
}

int svSeqLength(struct svControl *svControl) {
	int len = svASDULength(svControl);
	len += getLengthBytes(len);
	len++;
	len = len * svControl->noASDU;	// assume all ASDUs are the same size

	return len;
}

int svAPDULength(struct svControl *svControl) {
	int len = svSeqLength(svControl);
	len += getLengthBytes(len);
	len++;

	len += 3;

	return len;
}


//TODO: convert to proper BER sizes, where needed
// creates an SV packet, including frame header. returns 0 on fail; number of bytes on success
int svEncodePacket(struct svControl *svControl, unsigned char *buf) {
	int offset = 0;
	int len = svAPDULength(svControl);
	len += getLengthBytes(len);
	len += 9;		// savPdu tag size (1 byte), plus 8 "header" bytes

	// frame header
	memcpy(&buf[offset], svControl->ethHeaderData.destMACAddress, 6);	// destination MAC addresses
	offset += 6;
	memcpy(&buf[offset], LOCAL_MAC_ADDRESS, 6);						// source MAC addresses
	offset += 6;

	buf[offset++] = 0x81;	// TPID
	buf[offset++] = 0x00;

	netmemcpy(&buf[offset], &svControl->ethHeaderData.VLAN_ID, 2);	// TCI
	buf[offset] |= (svControl->ethHeaderData.VLAN_PRIORITY << 5);
	offset += 2;

	buf[offset++] = 0x88;	// EtherType
	buf[offset++] = 0xBA;

	netmemcpy(&buf[offset], &svControl->ethHeaderData.APPID, 2);	// APPID
	offset += 2;

	netmemcpy(&buf[offset], &len, 2);	// length
	offset += 2;

	buf[offset++] = 0x00;	// reserved 1
	buf[offset++] = 0x00;
	buf[offset++] = 0x00;	// reserved 2
	buf[offset++] = 0x00;

	buf[offset++] = SV_TAG_SAVPDU;
	offset += encodeLength(&buf[offset], svAPDULength(svControl));

	buf[offset++] = SV_TAG_NOASDU;
	offset += encodeLength(&buf[offset], ber_integer_length(&svControl->noASDU, SV_GET_LENGTH_INT16U));
	offset += ber_encode_integer(&buf[offset], &svControl->noASDU, ber_integer_length(&svControl->noASDU, SV_GET_LENGTH_INT16U));

	buf[offset++] = SV_TAG_SEQUENCEOFASDU;
	offset += encodeLength(&buf[offset], svSeqLength(svControl));

	int i = 0;
	int size = 0;
	for (i = 0; i < svControl->noASDU; i++) {
		buf[offset++] = SV_TAG_ASDU;
		offset += encodeLength(&buf[offset], svASDULength(svControl));

		size = strlen((const char *) svControl->ASDU[i].svID);
		buf[offset++] = SV_TAG_SVID;
		buf[offset++] = size;
		memcpy(&buf[offset], svControl->ASDU[i].svID, size);
		offset += size;

#if SV_OPTIONAL_SUPPORTED == 1
		if (svControl->ASDU[i].showDatset) {
			size = strlen(svControl->ASDU[i].datset);
			buf[offset++] = SV_TAG_DATSET;
			buf[offset++] = size;
			memcpy(&buf[offset], svControl->ASDU[i].datset, size);
			offset += size;
		}
#endif

		buf[offset++] = SV_TAG_SMPCNT;
		offset += encodeLength(&buf[offset], ber_integer_length(&svControl->ASDU[i].smpCnt, SV_GET_LENGTH_INT16U));
		offset += ber_encode_integer(&buf[offset], &svControl->ASDU[i].smpCnt, SV_GET_LENGTH_INT16U);

		buf[offset++] = SV_TAG_CONFREV;
		offset += encodeLength(&buf[offset], ber_integer_length(&svControl->ASDU[i].confRev, SV_GET_LENGTH_INT32U));
		offset += ber_encode_integer(&buf[offset], &svControl->ASDU[i].confRev, SV_GET_LENGTH_INT32U);

#if SV_OPTIONAL_SUPPORTED == 1
		if (svControl->ASDU[i].showRefrTm) {
			buf[offset++] = SV_TAG_REFRTM;
			offset += encodeLength(&buf[offset], BER_GET_LENGTH_CTYPE_TIMESTAMP(&svControl->ASDU[i].refrTm));
			setTimestamp(&svControl->ASDU[i].refrTm);
			memcpy(&buf[offset], &svControl->ASDU[i].refrTm, BER_GET_LENGTH_CTYPE_TIMESTAMP(&svControl->ASDU[i].refrTm));
			offset += BER_GET_LENGTH_CTYPE_TIMESTAMP(&svControl->ASDU[i].refrTm);
		}
#endif

		buf[offset++] = SV_TAG_SMPSYNCH;
		buf[offset++] = SV_GET_LENGTH_BOOLEAN;
		offset += ENCODE_CTYPE_BOOLEAN(&buf[offset], &svControl->ASDU[i].smpSynch);

#if SV_OPTIONAL_SUPPORTED == 1
		if (svControl->ASDU[i].showSmpRate) {
			buf[offset++] = SV_TAG_SMPRATE;
			buf[offset++] = SV_GET_LENGTH_INT16U;
			offset += ENCODE_CTYPE_INT16U(&buf[offset], &svControl->ASDU[i].smpRate);
		}
#endif

		buf[offset++] = SV_TAG_SEQUENCEOFDATA;
		offset += encodeLength(&buf[offset], svControl->ASDU[i].data.size);
		memcpy(&buf[offset], svControl->ASDU[i].data.data, svControl->ASDU[i].data.size);
		offset += svControl->ASDU[i].data.size;
	}

	// assume network interface, such as WinPcap, generates CRC bytes

	return offset;
}
