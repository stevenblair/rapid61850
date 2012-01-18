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
#include "gse.h"
#include "ied.h"
#include "gseDecode.h"



int ber_decode_ud(unsigned char *buf, struct ud *ud) {
	int offset = 0;

	if (buf[offset++] == 0xA2) {
		offset += getLengthFieldSize(buf[offset]);

		offset += BER_DECODE_CTYPE_INT8(&buf[offset], &ud->LNName);
		offset += BER_DECODE_CTYPE_INT8(&buf[offset], &ud->DataSetName);
		offset += BER_DECODE_CTYPE_INT16(&buf[offset], &ud->LDName);
		offset += BER_DECODE_CTYPE_INT16(&buf[offset], &ud->phsaTCTRrated);
		offset += BER_DECODE_CTYPE_INT16(&buf[offset], &ud->neutTCTRrated);
		offset += BER_DECODE_CTYPE_INT16(&buf[offset], &ud->phsaTVTRrated);
		offset += BER_DECODE_CTYPE_INT16(&buf[offset], &ud->Tdr);
		offset += BER_DECODE_CTYPE_INT16(&buf[offset], &ud->phsaTCTR);
		offset += BER_DECODE_CTYPE_INT16(&buf[offset], &ud->phsbTCTR);
		offset += BER_DECODE_CTYPE_INT16(&buf[offset], &ud->phscTCTR);
		offset += BER_DECODE_CTYPE_INT16(&buf[offset], &ud->neutTCTR);
		offset += BER_DECODE_CTYPE_INT16(&buf[offset], &ud->phsaTCTR1);
		offset += BER_DECODE_CTYPE_INT16(&buf[offset], &ud->phsbTCTR1);
		offset += BER_DECODE_CTYPE_INT16(&buf[offset], &ud->phscTCTR1);
		offset += BER_DECODE_CTYPE_INT16(&buf[offset], &ud->phsaTVTR);
		offset += BER_DECODE_CTYPE_INT16(&buf[offset], &ud->phsbTVTR);
		offset += BER_DECODE_CTYPE_INT16(&buf[offset], &ud->phscTVTR);
		offset += BER_DECODE_CTYPE_INT16(&buf[offset], &ud->neutTVTR);
		offset += BER_DECODE_CTYPE_INT16(&buf[offset], &ud->bbTVTR);
		offset += BER_DECODE_CTYPE_INT16(&buf[offset], &ud->statusWord1);
		offset += BER_DECODE_CTYPE_INT16(&buf[offset], &ud->statusWord2);
		offset += BER_DECODE_CTYPE_INT16(&buf[offset], &ud->samplingRate);
		offset += BER_DECODE_CTYPE_INT8(&buf[offset], &ud->ConfigurationRevisionNumber);
	}

	return offset;
}
int ber_decode_myMod(unsigned char *buf, struct myMod *myMod) {
	int offset = 0;

	if (buf[offset++] == 0xA2) {
		offset += getLengthFieldSize(buf[offset]);

		offset += BER_DECODE_CTYPE_ENUM(&buf[offset], (CTYPE_ENUM *) &myMod->ctlVal);
		offset += BER_DECODE_CTYPE_ENUM(&buf[offset], (CTYPE_ENUM *) &myMod->stVal);
		offset += BER_DECODE_CTYPE_QUALITY(&buf[offset], &myMod->q);
		offset += BER_DECODE_CTYPE_TIMESTAMP(&buf[offset], &myMod->t);
	}

	return offset;
}
int ber_decode_myHealth(unsigned char *buf, struct myHealth *myHealth) {
	int offset = 0;

	if (buf[offset++] == 0xA2) {
		offset += getLengthFieldSize(buf[offset]);

		offset += BER_DECODE_CTYPE_ENUM(&buf[offset], (CTYPE_ENUM *) &myHealth->stVal);
	}

	return offset;
}
int ber_decode_myBeh(unsigned char *buf, struct myBeh *myBeh) {
	int offset = 0;

	if (buf[offset++] == 0xA2) {
		offset += getLengthFieldSize(buf[offset]);

		offset += BER_DECODE_CTYPE_ENUM(&buf[offset], (CTYPE_ENUM *) &myBeh->stVal);
	}

	return offset;
}
int ber_decode_myINS(unsigned char *buf, struct myINS *myINS) {
	int offset = 0;

	if (buf[offset++] == 0xA2) {
		offset += getLengthFieldSize(buf[offset]);

		offset += BER_DECODE_CTYPE_INT32(&buf[offset], &myINS->stVal);
	}

	return offset;
}
int ber_decode_myLPL(unsigned char *buf, struct myLPL *myLPL) {
	int offset = 0;

	if (buf[offset++] == 0xA2) {
		offset += getLengthFieldSize(buf[offset]);

		offset += BER_DECODE_CTYPE_VISSTRING255(&buf[offset], &myLPL->ldNs);
		offset += BER_DECODE_CTYPE_VISSTRING255(&buf[offset], &myLPL->configRev);
	}

	return offset;
}
int ber_decode_Send_D1_ud(unsigned char *buf, struct Send_D1_ud *Send_D1_ud) {
	int offset = 0;

	offset += ber_decode_ud(&buf[offset], &Send_D1_ud->D1__GGIO_1_ud);

	return offset;
}

void gseDecodeDataset(unsigned char *dataset, CTYPE_INT16U datasetLength, unsigned char *gocbRef, CTYPE_INT16U gocbRefLength, CTYPE_INT32U timeAllowedToLive, CTYPE_TIMESTAMP T, CTYPE_INT32U stNum, CTYPE_INT32U sqNum) {

}


