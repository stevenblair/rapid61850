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

#include "gseEncodeBasic.h"
#include "ied.h"
#include "gseEncode.h"



int ber_get_length_ud(struct ud *ud) {
	int total = 0;
	int len = 0;

	len = BER_GET_LENGTH_CTYPE_INT8(&ud->LNName);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_INT8(&ud->DataSetName);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_INT16(&ud->LDName);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_INT16(&ud->phsaTCTRrated);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_INT16(&ud->neutTCTRrated);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_INT16(&ud->phsaTVTRrated);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_INT16(&ud->Tdr);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_INT16(&ud->phsaTCTR);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_INT16(&ud->phsbTCTR);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_INT16(&ud->phscTCTR);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_INT16(&ud->neutTCTR);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_INT16(&ud->phsaTCTR1);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_INT16(&ud->phsbTCTR1);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_INT16(&ud->phscTCTR1);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_INT16(&ud->phsaTVTR);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_INT16(&ud->phsbTVTR);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_INT16(&ud->phscTVTR);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_INT16(&ud->neutTVTR);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_INT16(&ud->bbTVTR);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_INT16(&ud->statusWord1);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_INT16(&ud->statusWord2);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_INT16(&ud->samplingRate);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_INT8(&ud->ConfigurationRevisionNumber);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_ud(unsigned char *buf, struct ud *ud) {
	int offset = 0;

	buf[offset++] = 0xA2;
	offset += encodeLength(&buf[offset], ber_get_length_ud(ud));

	offset += BER_ENCODE_CTYPE_INT8(&buf[offset], &ud->LNName);
	offset += BER_ENCODE_CTYPE_INT8(&buf[offset], &ud->DataSetName);
	offset += BER_ENCODE_CTYPE_INT16(&buf[offset], &ud->LDName);
	offset += BER_ENCODE_CTYPE_INT16(&buf[offset], &ud->phsaTCTRrated);
	offset += BER_ENCODE_CTYPE_INT16(&buf[offset], &ud->neutTCTRrated);
	offset += BER_ENCODE_CTYPE_INT16(&buf[offset], &ud->phsaTVTRrated);
	offset += BER_ENCODE_CTYPE_INT16(&buf[offset], &ud->Tdr);
	offset += BER_ENCODE_CTYPE_INT16(&buf[offset], &ud->phsaTCTR);
	offset += BER_ENCODE_CTYPE_INT16(&buf[offset], &ud->phsbTCTR);
	offset += BER_ENCODE_CTYPE_INT16(&buf[offset], &ud->phscTCTR);
	offset += BER_ENCODE_CTYPE_INT16(&buf[offset], &ud->neutTCTR);
	offset += BER_ENCODE_CTYPE_INT16(&buf[offset], &ud->phsaTCTR1);
	offset += BER_ENCODE_CTYPE_INT16(&buf[offset], &ud->phsbTCTR1);
	offset += BER_ENCODE_CTYPE_INT16(&buf[offset], &ud->phscTCTR1);
	offset += BER_ENCODE_CTYPE_INT16(&buf[offset], &ud->phsaTVTR);
	offset += BER_ENCODE_CTYPE_INT16(&buf[offset], &ud->phsbTVTR);
	offset += BER_ENCODE_CTYPE_INT16(&buf[offset], &ud->phscTVTR);
	offset += BER_ENCODE_CTYPE_INT16(&buf[offset], &ud->neutTVTR);
	offset += BER_ENCODE_CTYPE_INT16(&buf[offset], &ud->bbTVTR);
	offset += BER_ENCODE_CTYPE_INT16(&buf[offset], &ud->statusWord1);
	offset += BER_ENCODE_CTYPE_INT16(&buf[offset], &ud->statusWord2);
	offset += BER_ENCODE_CTYPE_INT16(&buf[offset], &ud->samplingRate);
	offset += BER_ENCODE_CTYPE_INT8(&buf[offset], &ud->ConfigurationRevisionNumber);

	return offset;
}
int ber_get_length_myMod(struct myMod *myMod) {
	int total = 0;
	int len = 0;

	len = BER_GET_LENGTH_CTYPE_ENUM((CTYPE_ENUM *) &myMod->ctlVal);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_ENUM((CTYPE_ENUM *) &myMod->stVal);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_QUALITY(&myMod->q);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_TIMESTAMP(&myMod->t);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_myMod(unsigned char *buf, struct myMod *myMod) {
	int offset = 0;

	buf[offset++] = 0xA2;
	offset += encodeLength(&buf[offset], ber_get_length_myMod(myMod));

	offset += BER_ENCODE_CTYPE_ENUM(&buf[offset], (CTYPE_ENUM *) &myMod->ctlVal);
	offset += BER_ENCODE_CTYPE_ENUM(&buf[offset], (CTYPE_ENUM *) &myMod->stVal);
	offset += BER_ENCODE_CTYPE_QUALITY(&buf[offset], &myMod->q);
	offset += BER_ENCODE_CTYPE_TIMESTAMP(&buf[offset], &myMod->t);

	return offset;
}
int ber_get_length_myHealth(struct myHealth *myHealth) {
	int total = 0;
	int len = 0;

	len = BER_GET_LENGTH_CTYPE_ENUM((CTYPE_ENUM *) &myHealth->stVal);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_myHealth(unsigned char *buf, struct myHealth *myHealth) {
	int offset = 0;

	buf[offset++] = 0xA2;
	offset += encodeLength(&buf[offset], ber_get_length_myHealth(myHealth));

	offset += BER_ENCODE_CTYPE_ENUM(&buf[offset], (CTYPE_ENUM *) &myHealth->stVal);

	return offset;
}
int ber_get_length_myBeh(struct myBeh *myBeh) {
	int total = 0;
	int len = 0;

	len = BER_GET_LENGTH_CTYPE_ENUM((CTYPE_ENUM *) &myBeh->stVal);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_myBeh(unsigned char *buf, struct myBeh *myBeh) {
	int offset = 0;

	buf[offset++] = 0xA2;
	offset += encodeLength(&buf[offset], ber_get_length_myBeh(myBeh));

	offset += BER_ENCODE_CTYPE_ENUM(&buf[offset], (CTYPE_ENUM *) &myBeh->stVal);

	return offset;
}
int ber_get_length_myINS(struct myINS *myINS) {
	int total = 0;
	int len = 0;

	len = BER_GET_LENGTH_CTYPE_INT32(&myINS->stVal);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_myINS(unsigned char *buf, struct myINS *myINS) {
	int offset = 0;

	buf[offset++] = 0xA2;
	offset += encodeLength(&buf[offset], ber_get_length_myINS(myINS));

	offset += BER_ENCODE_CTYPE_INT32(&buf[offset], &myINS->stVal);

	return offset;
}
int ber_get_length_myLPL(struct myLPL *myLPL) {
	int total = 0;
	int len = 0;

	len = BER_GET_LENGTH_CTYPE_VISSTRING255(&myLPL->ldNs);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_VISSTRING255(&myLPL->configRev);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_myLPL(unsigned char *buf, struct myLPL *myLPL) {
	int offset = 0;

	buf[offset++] = 0xA2;
	offset += encodeLength(&buf[offset], ber_get_length_myLPL(myLPL));

	offset += BER_ENCODE_CTYPE_VISSTRING255(&buf[offset], &myLPL->ldNs);
	offset += BER_ENCODE_CTYPE_VISSTRING255(&buf[offset], &myLPL->configRev);

	return offset;
}
int ber_get_length_Send_D1_ud(struct Send_D1_ud *Send_D1_ud) {
	int total = 0;
	int len = 0;

	len = ber_get_length_ud(&Send.S1.D1.sendUD_1.ud);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_Send_D1_ud(unsigned char *buf) {
	int offset = 0;

	offset += ber_encode_ud(&buf[offset], &Send.S1.D1.sendUD_1.ud);

	return offset;
}


