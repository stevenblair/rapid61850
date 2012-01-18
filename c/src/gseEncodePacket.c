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

#include "encodePacket.h"
#include "gsePacketData.h"
#include "gseEncode.h"
#include "svEncode.h"

int getGseHeaderLength(struct gseControl *gseControl) {
	int size = 0;
	int len = 0;

	size = strlen((const char *) gseControl->gocbRef);
	len += size + getLengthBytes(size) + 1;

	size = BER_GET_LENGTH_CTYPE_INT32U(&gseControl->timeAllowedToLive);
	len += size + getLengthBytes(size) + 1;

	size = strlen((const char *) gseControl->datSet);
	len += size + getLengthBytes(size) + 1;

	size = strlen((const char *) gseControl->goID);
	len += size + getLengthBytes(size) + 1;

	size = BER_GET_LENGTH_CTYPE_TIMESTAMP(&gseControl->t);
	len += size + getLengthBytes(size) + 1;

	size = BER_GET_LENGTH_CTYPE_INT32U(&gseControl->stNum);
	len += size + getLengthBytes(size) + 1;

	size = BER_GET_LENGTH_CTYPE_INT32U(&gseControl->sqNum);
	len += size + getLengthBytes(size) + 1;

	size = BER_GET_LENGTH_CTYPE_BOOLEAN(&gseControl->test);
	len += size + getLengthBytes(size) + 1;

	size = BER_GET_LENGTH_CTYPE_INT32U(&gseControl->confRev);
	len += size + getLengthBytes(size) + 1;

	size = BER_GET_LENGTH_CTYPE_BOOLEAN(&gseControl->ndsCom);
	len += size + getLengthBytes(size) + 1;

	size = BER_GET_LENGTH_CTYPE_INT32U(&gseControl->numDatSetEntries);
	len += size + getLengthBytes(size) + 1;

	size = (gseControl->getDatasetLength)();
	len += size + getLengthBytes(size) + 1;

	return len;
}

// creates a GSE packet, including frame header. returns 0 on fail; number of bytes on success
int gseEncodePacket(struct gseControl *gseControl, unsigned char *buf) {
	int offset = 0;
	int size = 0;
	int ADPULength = getGseHeaderLength(gseControl);
	int len = ADPULength + 9 + getLengthBytes(ADPULength);	// APDU tag size (1 byte), plus 8 "header" bytes

	//printf("ADPULength: %i, len: %i\n", ADPULength, len);

	// frame header
	memcpy(&buf[offset], gseControl->ethHeaderData.destMACAddress, 6);	// destination MAC addresses
	offset += 6;
	memcpy(&buf[offset], LOCAL_MAC_ADDRESS, 6);						// source MAC addresses
	offset += 6;

	buf[offset++] = 0x81;	// TPID
	buf[offset++] = 0x00;

	netmemcpy(&buf[offset], &gseControl->ethHeaderData.VLAN_ID, 2);	// TCI
	buf[offset] |= (gseControl->ethHeaderData.VLAN_PRIORITY << 5);
	offset += 2;

	buf[offset++] = 0x88;	// EtherType
	buf[offset++] = 0xB8;

	netmemcpy(&buf[offset], &gseControl->ethHeaderData.APPID, 2);	// APPID
	offset += 2;

	netmemcpy(&buf[offset], &len, 2);	// length
	offset += 2;

	buf[offset++] = 0x00;	// reserved 1
	buf[offset++] = 0x00;
	buf[offset++] = 0x00;	// reserved 2
	buf[offset++] = 0x00;

	buf[offset++] = ASN1_TAG_SEQUENCE;
	offset += encodeLength(&buf[offset], ADPULength /*+ getLengthBytes(ADPULength) + 1*/);

	buf[offset++] = GSE_TAG_GOCBREF;
	size = strlen((const char *) gseControl->gocbRef);
	buf[offset++] = size;
	memcpy(&buf[offset], gseControl->gocbRef, size);
	offset += size;

	buf[offset++] = GSE_TAG_TIME_ALLOWED_TO_LIVE;
	offset += encodeLength(&buf[offset], BER_GET_LENGTH_CTYPE_INT32U(&gseControl->timeAllowedToLive));
	//offset += BER_ENCODE_CTYPE_INT32U(&buf[offset], &gseControl->timeAllowedToLive);
	offset += ber_encode_integer(&buf[offset], &gseControl->timeAllowedToLive, SV_GET_LENGTH_INT32U);

	buf[offset++] = GSE_TAG_DATSET;
	size = strlen((const char *) gseControl->datSet);
	buf[offset++] = size;
	memcpy(&buf[offset], gseControl->datSet, size);
	offset += size;

	buf[offset++] = GSE_TAG_GOID;
	size = strlen((const char *) gseControl->goID);
	buf[offset++] = size;
	memcpy(&buf[offset], gseControl->goID, size);
	offset += size;

	buf[offset++] = GSE_TAG_T;
	offset += encodeLength(&buf[offset], BER_GET_LENGTH_CTYPE_TIMESTAMP(&gseControl->t));
	setTimestamp(&gseControl->t);
	memcpy(&buf[offset], &gseControl->t, BER_GET_LENGTH_CTYPE_TIMESTAMP(&gseControl->t));
	offset += BER_GET_LENGTH_CTYPE_TIMESTAMP(&gseControl->t);

	buf[offset++] = GSE_TAG_STNUM;
	offset += encodeLength(&buf[offset], BER_GET_LENGTH_CTYPE_INT32U(&gseControl->stNum));
	offset += ber_encode_integer(&buf[offset], &gseControl->stNum, SV_GET_LENGTH_INT32U);

	buf[offset++] = GSE_TAG_SQNUM;
	offset += encodeLength(&buf[offset], BER_GET_LENGTH_CTYPE_INT32U(&gseControl->sqNum));
	offset += ber_encode_integer(&buf[offset], &gseControl->sqNum, SV_GET_LENGTH_INT32U);

	buf[offset++] = GSE_TAG_SIMULATION;
	offset += encodeLength(&buf[offset], BER_GET_LENGTH_CTYPE_BOOLEAN(&gseControl->test));
	offset += ber_encode_integer(&buf[offset], &gseControl->test, SV_GET_LENGTH_BOOLEAN);

	buf[offset++] = GSE_TAG_CONFREV;
	offset += encodeLength(&buf[offset], BER_GET_LENGTH_CTYPE_INT32U(&gseControl->confRev));
	offset += ber_encode_integer(&buf[offset], &gseControl->confRev, SV_GET_LENGTH_INT32U);

	buf[offset++] = GSE_TAG_NDSCOM;
	offset += encodeLength(&buf[offset], BER_GET_LENGTH_CTYPE_BOOLEAN(&gseControl->ndsCom));
	offset += ber_encode_integer(&buf[offset], &gseControl->ndsCom, SV_GET_LENGTH_BOOLEAN);

	buf[offset++] = GSE_TAG_NUMDATSETENTRIES;
	offset += encodeLength(&buf[offset], BER_GET_LENGTH_CTYPE_INT32U(&gseControl->numDatSetEntries));
	offset += ber_encode_integer(&buf[offset], &gseControl->numDatSetEntries, SV_GET_LENGTH_INT32U);

	buf[offset++] = GSE_TAG_ALLDATA;
	offset += encodeLength(&buf[offset], (gseControl->getDatasetLength)());
	offset += (gseControl->encodeDataset)(&buf[offset]);

	// assume network interface, such as WinPcap, generates CRC bytes

	return offset;
}
