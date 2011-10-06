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

#include "encodePacket.h"
#include "gsePacketData.h"
#include "gseEncode.h"
#include "svEncode.h"

int getGseHeaderLength(struct gseData *gseData) {
	int size = 0;
	int len = 0;

	size = strlen((const char *) gseData->gocbRef);
	len += size + getLengthBytes(size) + 1;

	size = BER_GET_LENGTH_CTYPE_INT32U(&gseData->timeAllowedToLive);
	len += size + getLengthBytes(size) + 1;

	size = strlen((const char *) gseData->datSet);
	len += size + getLengthBytes(size) + 1;

	size = strlen((const char *) gseData->goID);
	len += size + getLengthBytes(size) + 1;

	size = BER_GET_LENGTH_CTYPE_TIMESTAMP(&gseData->t);
	len += size + getLengthBytes(size) + 1;

	size = BER_GET_LENGTH_CTYPE_INT32U(&gseData->stNum);
	len += size + getLengthBytes(size) + 1;

	size = BER_GET_LENGTH_CTYPE_INT32U(&gseData->sqNum);
	len += size + getLengthBytes(size) + 1;

	size = BER_GET_LENGTH_CTYPE_BOOLEAN(&gseData->test);
	len += size + getLengthBytes(size) + 1;

	size = BER_GET_LENGTH_CTYPE_INT32U(&gseData->confRev);
	len += size + getLengthBytes(size) + 1;

	size = BER_GET_LENGTH_CTYPE_BOOLEAN(&gseData->ndsCom);
	len += size + getLengthBytes(size) + 1;

	size = BER_GET_LENGTH_CTYPE_INT32U(&gseData->numDatSetEntries);
	len += size + getLengthBytes(size) + 1;

	size = (gseData->getDatasetLength)();
	len += size + getLengthBytes(size) + 1;

	return len;
}

// creates a GSE packet, including frame header. returns 0 on fail; number of bytes on success
int gseEncodePacket(struct gseData *gseData, unsigned char *buf) {
	int offset = 0;
	int size = 0;
	int ADPULength = getGseHeaderLength(gseData);
	int len = ADPULength + 9 + getLengthBytes(ADPULength);	// APDU tag size (1 byte), plus 8 "header" bytes

	//printf("ADPULength: %i, len: %i\n", ADPULength, len);

	// frame header
	memcpy(&buf[offset], gseData->ethHeaderData.destMACAddress, 6);	// destination MAC addresses
	offset += 6;
	memcpy(&buf[offset], LOCAL_MAC_ADDRESS, 6);						// source MAC addresses
	offset += 6;

	buf[offset++] = 0x81;	// TPID
	buf[offset++] = 0x00;

	netmemcpy(&buf[offset], &gseData->ethHeaderData.VLAN_ID, 2);	// TCI
	buf[offset] |= (gseData->ethHeaderData.VLAN_PRIORITY << 5);
	offset += 2;

	buf[offset++] = 0x88;	// EtherType
	buf[offset++] = 0xB8;

	netmemcpy(&buf[offset], &gseData->ethHeaderData.APPID, 2);	// APPID
	offset += 2;

	netmemcpy(&buf[offset], &len, 2);	// length
	offset += 2;

	buf[offset++] = 0x00;	// reserved 1
	buf[offset++] = 0x00;
	buf[offset++] = 0x00;	// reserved 2
	buf[offset++] = 0x00;

	buf[offset++] = 0x61;
	offset += encodeLength(&buf[offset], ADPULength /*+ getLengthBytes(ADPULength) + 1*/);

	buf[offset++] = 0x80;
	size = strlen((const char *) gseData->gocbRef);
	buf[offset++] = size;
	memcpy(&buf[offset], gseData->gocbRef, size);
	offset += size;

	buf[offset++] = 0x81;
	offset += encodeLength(&buf[offset], BER_GET_LENGTH_CTYPE_INT32U(&gseData->timeAllowedToLive));
	//offset += BER_ENCODE_CTYPE_INT32U(&buf[offset], &gseData->timeAllowedToLive);
	offset += ber_encode_integer(&buf[offset], &gseData->timeAllowedToLive, SV_GET_LENGTH_INT32U);

	buf[offset++] = 0x82;
	size = strlen((const char *) gseData->datSet);
	buf[offset++] = size;
	memcpy(&buf[offset], gseData->datSet, size);
	offset += size;

	buf[offset++] = 0x83;
	size = strlen((const char *) gseData->goID);
	buf[offset++] = size;
	memcpy(&buf[offset], gseData->goID, size);
	offset += size;

	buf[offset++] = 0x84;
	offset += encodeLength(&buf[offset], BER_GET_LENGTH_CTYPE_TIMESTAMP(&gseData->t));
	setTimestamp(&gseData->t);
	memcpy(&buf[offset], &gseData->t, BER_GET_LENGTH_CTYPE_TIMESTAMP(&gseData->t));
	offset += BER_GET_LENGTH_CTYPE_TIMESTAMP(&gseData->t);

	buf[offset++] = 0x85;
	offset += encodeLength(&buf[offset], BER_GET_LENGTH_CTYPE_INT32U(&gseData->stNum));
	offset += ber_encode_integer(&buf[offset], &gseData->stNum, SV_GET_LENGTH_INT32U);

	buf[offset++] = 0x86;
	offset += encodeLength(&buf[offset], BER_GET_LENGTH_CTYPE_INT32U(&gseData->sqNum));
	offset += ber_encode_integer(&buf[offset], &gseData->sqNum, SV_GET_LENGTH_INT32U);

	buf[offset++] = 0x87;
	offset += encodeLength(&buf[offset], BER_GET_LENGTH_CTYPE_BOOLEAN(&gseData->test));
	offset += ber_encode_integer(&buf[offset], &gseData->test, SV_GET_LENGTH_BOOLEAN);

	buf[offset++] = 0x88;
	offset += encodeLength(&buf[offset], BER_GET_LENGTH_CTYPE_INT32U(&gseData->confRev));
	offset += ber_encode_integer(&buf[offset], &gseData->confRev, SV_GET_LENGTH_INT32U);

	buf[offset++] = 0x89;
	offset += encodeLength(&buf[offset], BER_GET_LENGTH_CTYPE_BOOLEAN(&gseData->ndsCom));
	offset += ber_encode_integer(&buf[offset], &gseData->ndsCom, SV_GET_LENGTH_BOOLEAN);

	buf[offset++] = 0x8A;
	offset += encodeLength(&buf[offset], BER_GET_LENGTH_CTYPE_INT32U(&gseData->numDatSetEntries));
	offset += ber_encode_integer(&buf[offset], &gseData->numDatSetEntries, SV_GET_LENGTH_INT32U);

	buf[offset++] = 0xAB;
	offset += encodeLength(&buf[offset], (gseData->getDatasetLength)());
	offset += (gseData->encodeDataset)(&buf[offset]);

	// assume network interface, such as WinPcap, generates CRC bytes

	return offset;
}
