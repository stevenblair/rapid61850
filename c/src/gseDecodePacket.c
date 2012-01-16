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



//temp
//#include <stdio.h>
//#include <stdlib.h>


//TODO move these inside gseDecodePDU() and loop, rather than recurse to ensure re-entrant
unsigned char	datasetName[65] = {0};		// maximum length of 65 bytes
CTYPE_INT16U	datasetNameLength = 0;
unsigned char	gocbRef[129] = {0};			// maximum length of 129 bytes
CTYPE_INT16U	gocbRefLength = 0;


void gseDecodePDU(unsigned char *buf) {
	unsigned char	tag = (unsigned char) buf[0];	// assumes only one byte is used
	CTYPE_INT16U	lengthFieldSize = getLengthFieldSize((unsigned char) buf[1]);
	CTYPE_INT16U	lengthValue = decodeLength((unsigned char *) &buf[1]);
	CTYPE_INT16U	offsetForSequence = 1 + lengthFieldSize;
	CTYPE_INT16U	offsetForNonSequence = 1 + lengthFieldSize + lengthValue;

	//printf("tag: %x, lengthFieldSize: %i, lengthValue: %i, offset: %i\n", tag, lengthFieldSize, lengthValue, offsetForNonSequence);

	switch (tag) {
	case 0x80:
		// save gocbRef name
		memcpy(datasetName, &buf[offsetForSequence], lengthValue);
		datasetNameLength = lengthValue;
		gseDecodePDU(&buf[offsetForNonSequence]);
		break;
	case 0x61:
		gseDecodePDU(&buf[offsetForSequence]);
		break;
	case 0x82:
		// save dataset name
		memcpy(datasetName, &buf[offsetForSequence], lengthValue);
		datasetNameLength = lengthValue;
		//printf("%s, %d\n", datasetName, datasetNameLength);
		//fflush(stdout);

		gseDecodePDU(&buf[offsetForNonSequence]);
		break;
	case 0xAB:
		gseDecodeDataset(&buf[offsetForSequence], lengthValue, gocbRef, gocbRefLength);
		return;
		break;
	default:
		gseDecodePDU(&buf[offsetForNonSequence]);
		break;
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
