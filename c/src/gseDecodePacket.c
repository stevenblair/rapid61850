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


#include "gseDecodeBasic.h"
#include "ied.h"
#include "gseDecode.h"
#include "gsePacketData.h"
#include "decodePacket.h"
#include <stddef.h>


void gseDecodePDU(unsigned char *buf) {
	unsigned char	tag = 0;
	CTYPE_INT16U	lengthFieldSize = 0;
	CTYPE_INT16U	lengthValue = 0;
	CTYPE_INT16U	offsetForSequence = 0;
	CTYPE_INT16U	offsetForNonSequence = 0;
	unsigned char	*gocbRef = NULL;
	CTYPE_INT16U	gocbRefLength = 0;
	CTYPE_INT32U	timeAllowedToLive = 0;
	CTYPE_TIMESTAMP	T = 0;
	CTYPE_INT32U	sqNum = 0;
	CTYPE_INT32U	stNum = 0;

	while (1) {
		tag = (unsigned char) buf[0];	// assumes only one byte is used
		lengthFieldSize = getLengthFieldSize((unsigned char) buf[1]);
		lengthValue = decodeLength((unsigned char *) &buf[1]);
		offsetForSequence = 1 + lengthFieldSize;
		offsetForNonSequence = 1 + lengthFieldSize + lengthValue;

		switch (tag) {
		case GSE_TAG_GOCBREF:
			// save pointer to gocbRef name
			gocbRef = &buf[offsetForSequence];
			gocbRefLength = lengthValue;

			buf = &buf[offsetForNonSequence];
			break;
		case GSE_TAG_TIME_ALLOWED_TO_LIVE:
			ber_decode_integer(&buf[offsetForSequence], lengthValue, &timeAllowedToLive, SV_GET_LENGTH_INT32U);
			buf = &buf[offsetForNonSequence];
			break;
		case ASN1_TAG_SEQUENCE:
			buf = &buf[offsetForSequence];
			break;
		case GSE_TAG_DATSET:
			buf = &buf[offsetForNonSequence];
			break;
		case GSE_TAG_T:
			memcpy(&T, &buf[offsetForSequence], BER_GET_LENGTH_CTYPE_TIMESTAMP(&T));
			buf = &buf[offsetForNonSequence];
			break;
		case GSE_TAG_STNUM:
			ber_decode_integer(&buf[offsetForSequence], lengthValue, &stNum, SV_GET_LENGTH_INT32U);
			buf = &buf[offsetForNonSequence];
			break;
		case GSE_TAG_SQNUM:
			ber_decode_integer(&buf[offsetForSequence], lengthValue, &sqNum, SV_GET_LENGTH_INT32U);
			buf = &buf[offsetForNonSequence];
			break;
		case GSE_TAG_ALLDATA:
			gseDecodeDataset(&buf[offsetForSequence], lengthValue, gocbRef, gocbRefLength, timeAllowedToLive, T, stNum, sqNum);
			return;
			break;
		default:
			buf = &buf[offsetForNonSequence];
			break;
		}
	}
}

void gseDecode(unsigned char *buf, int len) {
	int offset = 22;

	// check for VLAN tag
	if (buf[12] == 0x81 && buf[13] == 0x00) {
		offset = 26;
	}

	gseDecodePDU(&buf[offset]);	// cuts out frame header (fixed size of 26 bytes before start of APDU)
}
