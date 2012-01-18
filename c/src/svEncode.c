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

#include "svEncodeBasic.h"
#include "ied.h"
#include "svEncode.h"



int encode_ud(unsigned char *buf, struct ud *ud) {
	int offset = 0;

	offset += ENCODE_CTYPE_INT8(&buf[offset], &ud->LNName);
	offset += ENCODE_CTYPE_INT8(&buf[offset], &ud->DataSetName);
	offset += ENCODE_CTYPE_INT16(&buf[offset], &ud->LDName);
	offset += ENCODE_CTYPE_INT16(&buf[offset], &ud->phsaTCTRrated);
	offset += ENCODE_CTYPE_INT16(&buf[offset], &ud->neutTCTRrated);
	offset += ENCODE_CTYPE_INT16(&buf[offset], &ud->phsaTVTRrated);
	offset += ENCODE_CTYPE_INT16(&buf[offset], &ud->Tdr);
	offset += ENCODE_CTYPE_INT16(&buf[offset], &ud->phsaTCTR);
	offset += ENCODE_CTYPE_INT16(&buf[offset], &ud->phsbTCTR);
	offset += ENCODE_CTYPE_INT16(&buf[offset], &ud->phscTCTR);
	offset += ENCODE_CTYPE_INT16(&buf[offset], &ud->neutTCTR);
	offset += ENCODE_CTYPE_INT16(&buf[offset], &ud->phsaTCTR1);
	offset += ENCODE_CTYPE_INT16(&buf[offset], &ud->phsbTCTR1);
	offset += ENCODE_CTYPE_INT16(&buf[offset], &ud->phscTCTR1);
	offset += ENCODE_CTYPE_INT16(&buf[offset], &ud->phsaTVTR);
	offset += ENCODE_CTYPE_INT16(&buf[offset], &ud->phsbTVTR);
	offset += ENCODE_CTYPE_INT16(&buf[offset], &ud->phscTVTR);
	offset += ENCODE_CTYPE_INT16(&buf[offset], &ud->neutTVTR);
	offset += ENCODE_CTYPE_INT16(&buf[offset], &ud->bbTVTR);
	offset += ENCODE_CTYPE_INT16(&buf[offset], &ud->statusWord1);
	offset += ENCODE_CTYPE_INT16(&buf[offset], &ud->statusWord2);
	offset += ENCODE_CTYPE_INT16(&buf[offset], &ud->samplingRate);
	offset += ENCODE_CTYPE_INT8(&buf[offset], &ud->ConfigurationRevisionNumber);

	return offset;
}
int encode_myMod(unsigned char *buf, struct myMod *myMod) {
	int offset = 0;

	offset += ENCODE_CTYPE_ENUM(&buf[offset], (CTYPE_ENUM *) &myMod->ctlVal);
	offset += ENCODE_CTYPE_ENUM(&buf[offset], (CTYPE_ENUM *) &myMod->stVal);
	offset += ENCODE_CTYPE_QUALITY(&buf[offset], &myMod->q);
	offset += ENCODE_CTYPE_TIMESTAMP(&buf[offset], &myMod->t);

	return offset;
}
int encode_myHealth(unsigned char *buf, struct myHealth *myHealth) {
	int offset = 0;

	offset += ENCODE_CTYPE_ENUM(&buf[offset], (CTYPE_ENUM *) &myHealth->stVal);

	return offset;
}
int encode_myBeh(unsigned char *buf, struct myBeh *myBeh) {
	int offset = 0;

	offset += ENCODE_CTYPE_ENUM(&buf[offset], (CTYPE_ENUM *) &myBeh->stVal);

	return offset;
}
int encode_myINS(unsigned char *buf, struct myINS *myINS) {
	int offset = 0;

	offset += ENCODE_CTYPE_INT32(&buf[offset], &myINS->stVal);

	return offset;
}
int encode_myLPL(unsigned char *buf, struct myLPL *myLPL) {
	int offset = 0;

	offset += ENCODE_CTYPE_VISSTRING255(&buf[offset], &myLPL->ldNs);
	offset += ENCODE_CTYPE_VISSTRING255(&buf[offset], &myLPL->configRev);

	return offset;
}
int encode_Send_D1_ud(unsigned char *buf) {
	int offset = 0;

	offset += encode_ud(&buf[offset], &Send.S1.D1.sendUD_1.ud);

	return offset;
}
int encode_control_Send_D1_udCB(unsigned char *buf) {
	return encode_Send_D1_ud(buf);
}


