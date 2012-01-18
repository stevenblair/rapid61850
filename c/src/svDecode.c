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

#include "sv.h"
#include "svDecodeBasic.h"
#include "ied.h"
#include "svDecode.h"



int decode_ud(unsigned char *buf, struct ud *ud) {
	int offset = 0;

	offset += DECODE_CTYPE_INT8(&buf[offset], &ud->LNName);
	offset += DECODE_CTYPE_INT8(&buf[offset], &ud->DataSetName);
	offset += DECODE_CTYPE_INT16(&buf[offset], &ud->LDName);
	offset += DECODE_CTYPE_INT16(&buf[offset], &ud->phsaTCTRrated);
	offset += DECODE_CTYPE_INT16(&buf[offset], &ud->neutTCTRrated);
	offset += DECODE_CTYPE_INT16(&buf[offset], &ud->phsaTVTRrated);
	offset += DECODE_CTYPE_INT16(&buf[offset], &ud->Tdr);
	offset += DECODE_CTYPE_INT16(&buf[offset], &ud->phsaTCTR);
	offset += DECODE_CTYPE_INT16(&buf[offset], &ud->phsbTCTR);
	offset += DECODE_CTYPE_INT16(&buf[offset], &ud->phscTCTR);
	offset += DECODE_CTYPE_INT16(&buf[offset], &ud->neutTCTR);
	offset += DECODE_CTYPE_INT16(&buf[offset], &ud->phsaTCTR1);
	offset += DECODE_CTYPE_INT16(&buf[offset], &ud->phsbTCTR1);
	offset += DECODE_CTYPE_INT16(&buf[offset], &ud->phscTCTR1);
	offset += DECODE_CTYPE_INT16(&buf[offset], &ud->phsaTVTR);
	offset += DECODE_CTYPE_INT16(&buf[offset], &ud->phsbTVTR);
	offset += DECODE_CTYPE_INT16(&buf[offset], &ud->phscTVTR);
	offset += DECODE_CTYPE_INT16(&buf[offset], &ud->neutTVTR);
	offset += DECODE_CTYPE_INT16(&buf[offset], &ud->bbTVTR);
	offset += DECODE_CTYPE_INT16(&buf[offset], &ud->statusWord1);
	offset += DECODE_CTYPE_INT16(&buf[offset], &ud->statusWord2);
	offset += DECODE_CTYPE_INT16(&buf[offset], &ud->samplingRate);
	offset += DECODE_CTYPE_INT8(&buf[offset], &ud->ConfigurationRevisionNumber);

	return offset;
}
int decode_myMod(unsigned char *buf, struct myMod *myMod) {
	int offset = 0;

	offset += DECODE_CTYPE_ENUM(&buf[offset], (CTYPE_ENUM *) &myMod->ctlVal);
	offset += DECODE_CTYPE_ENUM(&buf[offset], (CTYPE_ENUM *) &myMod->stVal);
	offset += DECODE_CTYPE_QUALITY(&buf[offset], &myMod->q);
	offset += DECODE_CTYPE_TIMESTAMP(&buf[offset], &myMod->t);

	return offset;
}
int decode_myHealth(unsigned char *buf, struct myHealth *myHealth) {
	int offset = 0;

	offset += DECODE_CTYPE_ENUM(&buf[offset], (CTYPE_ENUM *) &myHealth->stVal);

	return offset;
}
int decode_myBeh(unsigned char *buf, struct myBeh *myBeh) {
	int offset = 0;

	offset += DECODE_CTYPE_ENUM(&buf[offset], (CTYPE_ENUM *) &myBeh->stVal);

	return offset;
}
int decode_myINS(unsigned char *buf, struct myINS *myINS) {
	int offset = 0;

	offset += DECODE_CTYPE_INT32(&buf[offset], &myINS->stVal);

	return offset;
}
int decode_myLPL(unsigned char *buf, struct myLPL *myLPL) {
	int offset = 0;

	offset += DECODE_CTYPE_VISSTRING255(&buf[offset], &myLPL->ldNs);
	offset += DECODE_CTYPE_VISSTRING255(&buf[offset], &myLPL->configRev);

	return offset;
}
int decode_Send_D1_ud(unsigned char *buf, int noASDU, CTYPE_INT16U smpCnt, struct Send_D1_ud *Send_D1_ud) {
	int offset = 0;

	offset += decode_ud(&buf[offset], &Send_D1_ud->D1__GGIO_1_ud);

	return offset;
}

void svDecodeDataset(unsigned char *dataset, int datasetLength, int ASDU, unsigned char *svID, int svIDLength, CTYPE_INT16U smpCnt) {

	if (strncmp((const char *) svID, "ud", svIDLength) == 0) {
		decode_Send_D1_ud(dataset, ASDU, smpCnt, &Recv.S1.D1.recvUD_1.sv_inputs_udCB.Send_D1_ud[ASDU]);
		Recv.S1.D1.recvUD_1.sv_inputs_udCB.smpCnt = smpCnt;
		if (Recv.S1.D1.recvUD_1.sv_inputs_udCB.datasetDecodeDone != NULL) {
			Recv.S1.D1.recvUD_1.sv_inputs_udCB.datasetDecodeDone(smpCnt);
		}
	}
}


