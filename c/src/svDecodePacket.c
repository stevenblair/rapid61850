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

#include "svDecodeBasic.h"
#include "ied.h"
#include "svDecode.h"
#include "svPacketData.h"
#include "decodePacket.h"
#include "gseDecodeBasic.h"
#include <stddef.h>


void svDecodeASDU(unsigned char *buf, int len, int noASDU) {
	unsigned char tag;	// assumes only one byte is used
	int lengthFieldSize;
	int lengthValue;
	int offsetForNonSequence;
	unsigned char *svID = NULL;
	int svIDLength = 0;
    CTYPE_INT16U smpCnt = 0;
    uint64_t refrTm = 0;

	int i = 0;
    for (i = 0; i < len;) {
		tag = (unsigned char) buf[i];
		lengthFieldSize = getLengthFieldSize((unsigned char) buf[i + 1]);
		lengthValue = decodeLength((unsigned char *) &buf[i + 1]);
		offsetForNonSequence = 1 + lengthFieldSize + lengthValue;

		//printf("\ttag: %x, noASDU: %u, lengthFieldSize: %i, lengthValue: %i, offset: %i\n", tag, noASDU, lengthFieldSize, lengthValue, offsetForNonSequence);

		switch (tag) {
			case SV_TAG_SVID:
				svID = &buf[i + 1 + lengthFieldSize];
				svIDLength = lengthValue;
				break;
			case SV_TAG_DATSET:

				break;
			case SV_TAG_SMPCNT:
				ber_decode_integer(&buf[i + 1 + lengthFieldSize], lengthValue, &smpCnt, SV_GET_LENGTH_INT16U);
				break;
			case SV_TAG_CONFREV:

				break;
			case SV_TAG_REFRTM:
				netmemcpy(&refrTm, &buf[i + 1 + lengthFieldSize], lengthValue);
				break;
			case SV_TAG_SMPSYNCH:

				break;
			case SV_TAG_SMPRATE:

				break;
			case SV_TAG_SEQUENCEOFDATA:
				if (svID != NULL) {
					svDecodeDataset(&buf[i + 1 + lengthFieldSize], lengthValue, noASDU, svID, svIDLength, smpCnt, refrTm);
				}
				break;
			default:
				break;
		}

		i += offsetForNonSequence;
	}
}

void svDecodeAPDU(unsigned char *buf, int len, unsigned int ASDU, unsigned int totalASDUs) {
	unsigned char tag = (unsigned char) buf[0];	// assumes only one byte is used
	int lengthFieldSize = getLengthFieldSize((unsigned char) buf[1]);
	int lengthValue = decodeLength((unsigned char *) &buf[1]);
	int offsetForSequence = 1 + lengthFieldSize;
	int offsetForNonSequence = 1 + lengthFieldSize + lengthValue;
	unsigned int noASDU = 0;
	//static unsigned int ASDU = 0;

	//printf("tag: %x, ASDU: %u,  totalASDUs: %u, lengthFieldSize: %i, lengthValue: %i, offset: %i\n", tag, ASDU, totalASDUs, lengthFieldSize, lengthValue, offsetForNonSequence);

	switch (tag) {
		case SV_TAG_SAVPDU:
			svDecodeAPDU(&buf[offsetForSequence], lengthValue, ASDU, totalASDUs);
			break;
		case SV_TAG_NOASDU:
			noASDU = (unsigned int) buf[1 + lengthFieldSize];	// assuming noASDU is < 126
			//ASDU = 0;
			svDecodeAPDU(&buf[offsetForNonSequence], len - offsetForNonSequence, ASDU, noASDU);
			break;
		case SV_TAG_SEQUENCEOFASDU:
			svDecodeAPDU(&buf[offsetForSequence], lengthValue, ASDU, totalASDUs);
			break;
		case SV_TAG_ASDU:
			svDecodeASDU(&buf[offsetForSequence], lengthValue, ASDU);
			ASDU++;

			// process any more ASDUs, until max number
			if (ASDU < totalASDUs) {
				svDecodeAPDU(&buf[offsetForNonSequence], len - offsetForNonSequence, ASDU, totalASDUs);
			}
			break;
		default:
			break;
	}
}

void svDecode(unsigned char *buf, int len) {
	int offset = 16;   // start of 'length' field in payload

	// check for VLAN tag
	if (buf[12] == 0x81 && buf[13] == 0x00) {
		offset = 20;
	}

	unsigned short APDULength = ((buf[offset] << 8) | buf[offset + 1]) - 8;    // must use length in PDU because total bytes (len) may contain CRC

	svDecodeAPDU(&buf[offset + 6], APDULength, 0, 0);    // cuts out frame header
}
