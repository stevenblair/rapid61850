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



int ber_get_length_myAnalogValue(struct myAnalogValue *myAnalogValue) {
	int total = 0;
	int len = 0;

	len = BER_GET_LENGTH_CTYPE_FLOAT32(&myAnalogValue->f);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_myAnalogValue(unsigned char *buf, struct myAnalogValue *myAnalogValue) {
	int offset = 0;

	buf[offset++] = 0xA2;
	offset += encodeLength(&buf[offset], ber_get_length_myAnalogValue(myAnalogValue));

	offset += BER_ENCODE_CTYPE_FLOAT32(&buf[offset], &myAnalogValue->f);

	return offset;
}
int ber_get_length_ScaledValueConfig(struct ScaledValueConfig *ScaledValueConfig) {
	int total = 0;
	int len = 0;

	len = BER_GET_LENGTH_CTYPE_FLOAT32(&ScaledValueConfig->scaleFactor);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_FLOAT32(&ScaledValueConfig->offset);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_ScaledValueConfig(unsigned char *buf, struct ScaledValueConfig *ScaledValueConfig) {
	int offset = 0;

	buf[offset++] = 0xA2;
	offset += encodeLength(&buf[offset], ber_get_length_ScaledValueConfig(ScaledValueConfig));

	offset += BER_ENCODE_CTYPE_FLOAT32(&buf[offset], &ScaledValueConfig->scaleFactor);
	offset += BER_ENCODE_CTYPE_FLOAT32(&buf[offset], &ScaledValueConfig->offset);

	return offset;
}
int ber_get_length_myVector(struct myVector *myVector) {
	int total = 0;
	int len = 0;

	len = ber_get_length_myAnalogValue(&myVector->mag);
	total += len + getLengthBytes(len) + 1;
	len = ber_get_length_myAnalogValue(&myVector->ang);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_myVector(unsigned char *buf, struct myVector *myVector) {
	int offset = 0;

	buf[offset++] = 0xA2;
	offset += encodeLength(&buf[offset], ber_get_length_myVector(myVector));

	offset += ber_encode_myAnalogValue(&buf[offset], &myVector->mag);
	offset += ber_encode_myAnalogValue(&buf[offset], &myVector->ang);

	return offset;
}
int ber_get_length_simpleVector(struct simpleVector *simpleVector) {
	int total = 0;
	int len = 0;

	len = ber_get_length_myAnalogValue(&simpleVector->mag);
	total += len + getLengthBytes(len) + 1;
	len = ber_get_length_myAnalogValue(&simpleVector->ang);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_simpleVector(unsigned char *buf, struct simpleVector *simpleVector) {
	int offset = 0;

	buf[offset++] = 0xA2;
	offset += encodeLength(&buf[offset], ber_get_length_simpleVector(simpleVector));

	offset += ber_encode_myAnalogValue(&buf[offset], &simpleVector->mag);
	offset += ber_encode_myAnalogValue(&buf[offset], &simpleVector->ang);

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
int ber_get_length_myDPL(struct myDPL *myDPL) {
	int total = 0;
	int len = 0;

	len = BER_GET_LENGTH_CTYPE_VISSTRING255(&myDPL->vendor);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_VISSTRING255(&myDPL->hwRev);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_myDPL(unsigned char *buf, struct myDPL *myDPL) {
	int offset = 0;

	buf[offset++] = 0xA2;
	offset += encodeLength(&buf[offset], ber_get_length_myDPL(myDPL));

	offset += BER_ENCODE_CTYPE_VISSTRING255(&buf[offset], &myDPL->vendor);
	offset += BER_ENCODE_CTYPE_VISSTRING255(&buf[offset], &myDPL->hwRev);

	return offset;
}
int ber_get_length_myPos(struct myPos *myPos) {
	int total = 0;
	int len = 0;

	len = BER_GET_LENGTH_CTYPE_DBPOS(&myPos->stVal);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_QUALITY(&myPos->q);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_TIMESTAMP(&myPos->t);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_BOOLEAN(&myPos->ctlVal);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_myPos(unsigned char *buf, struct myPos *myPos) {
	int offset = 0;

	buf[offset++] = 0xA2;
	offset += encodeLength(&buf[offset], ber_get_length_myPos(myPos));

	offset += BER_ENCODE_CTYPE_DBPOS(&buf[offset], &myPos->stVal);
	offset += BER_ENCODE_CTYPE_QUALITY(&buf[offset], &myPos->q);
	offset += BER_ENCODE_CTYPE_TIMESTAMP(&buf[offset], &myPos->t);
	offset += BER_ENCODE_CTYPE_BOOLEAN(&buf[offset], &myPos->ctlVal);

	return offset;
}
int ber_get_length_mySPS(struct mySPS *mySPS) {
	int total = 0;
	int len = 0;

	len = BER_GET_LENGTH_CTYPE_INT32(&mySPS->stVal);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_QUALITY(&mySPS->q);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_TIMESTAMP(&mySPS->t);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_mySPS(unsigned char *buf, struct mySPS *mySPS) {
	int offset = 0;

	buf[offset++] = 0xA2;
	offset += encodeLength(&buf[offset], ber_get_length_mySPS(mySPS));

	offset += BER_ENCODE_CTYPE_INT32(&buf[offset], &mySPS->stVal);
	offset += BER_ENCODE_CTYPE_QUALITY(&buf[offset], &mySPS->q);
	offset += BER_ENCODE_CTYPE_TIMESTAMP(&buf[offset], &mySPS->t);

	return offset;
}
int ber_get_length_myMV(struct myMV *myMV) {
	int total = 0;
	int len = 0;

	len = ber_get_length_myAnalogValue(&myMV->mag);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_QUALITY(&myMV->q);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_TIMESTAMP(&myMV->t);
	total += len + getLengthBytes(len) + 1;
	len = ber_get_length_ScaledValueConfig(&myMV->sVC);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_INT32(&myMV->int1);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_INT32(&myMV->int2);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_INT32(&myMV->int3);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_myMV(unsigned char *buf, struct myMV *myMV) {
	int offset = 0;

	buf[offset++] = 0xA2;
	offset += encodeLength(&buf[offset], ber_get_length_myMV(myMV));

	offset += ber_encode_myAnalogValue(&buf[offset], &myMV->mag);
	offset += BER_ENCODE_CTYPE_QUALITY(&buf[offset], &myMV->q);
	offset += BER_ENCODE_CTYPE_TIMESTAMP(&buf[offset], &myMV->t);
	offset += ber_encode_ScaledValueConfig(&buf[offset], &myMV->sVC);
	offset += BER_ENCODE_CTYPE_INT32(&buf[offset], &myMV->int1);
	offset += BER_ENCODE_CTYPE_INT32(&buf[offset], &myMV->int2);
	offset += BER_ENCODE_CTYPE_INT32(&buf[offset], &myMV->int3);

	return offset;
}
int ber_get_length_simpleMV(struct simpleMV *simpleMV) {
	int total = 0;
	int len = 0;

	len = BER_GET_LENGTH_CTYPE_FLOAT32(&simpleMV->mag);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_QUALITY(&simpleMV->q);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_TIMESTAMP(&simpleMV->t);
	total += len + getLengthBytes(len) + 1;
	len = ber_get_length_ScaledValueConfig(&simpleMV->sVC);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_simpleMV(unsigned char *buf, struct simpleMV *simpleMV) {
	int offset = 0;

	buf[offset++] = 0xA2;
	offset += encodeLength(&buf[offset], ber_get_length_simpleMV(simpleMV));

	offset += BER_ENCODE_CTYPE_FLOAT32(&buf[offset], &simpleMV->mag);
	offset += BER_ENCODE_CTYPE_QUALITY(&buf[offset], &simpleMV->q);
	offset += BER_ENCODE_CTYPE_TIMESTAMP(&buf[offset], &simpleMV->t);
	offset += ber_encode_ScaledValueConfig(&buf[offset], &simpleMV->sVC);

	return offset;
}
int ber_get_length_simpleCMV(struct simpleCMV *simpleCMV) {
	int total = 0;
	int len = 0;

	len = ber_get_length_simpleVector(&simpleCMV->cVal);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_QUALITY(&simpleCMV->q);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_TIMESTAMP(&simpleCMV->t);
	total += len + getLengthBytes(len) + 1;
	len = ber_get_length_mySPS(&simpleCMV->testSecondLayerSDO);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_INT32(&simpleCMV->testInteger);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_BOOLEAN(&simpleCMV->testBoolean);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_simpleCMV(unsigned char *buf, struct simpleCMV *simpleCMV) {
	int offset = 0;

	buf[offset++] = 0xA2;
	offset += encodeLength(&buf[offset], ber_get_length_simpleCMV(simpleCMV));

	offset += ber_encode_simpleVector(&buf[offset], &simpleCMV->cVal);
	offset += BER_ENCODE_CTYPE_QUALITY(&buf[offset], &simpleCMV->q);
	offset += BER_ENCODE_CTYPE_TIMESTAMP(&buf[offset], &simpleCMV->t);
	offset += ber_encode_mySPS(&buf[offset], &simpleCMV->testSecondLayerSDO);
	offset += BER_ENCODE_CTYPE_INT32(&buf[offset], &simpleCMV->testInteger);
	offset += BER_ENCODE_CTYPE_BOOLEAN(&buf[offset], &simpleCMV->testBoolean);

	return offset;
}
int ber_get_length_simpleWYE(struct simpleWYE *simpleWYE) {
	int total = 0;
	int len = 0;

	len = ber_get_length_simpleCMV(&simpleWYE->phsA);
	total += len + getLengthBytes(len) + 1;
	len = ber_get_length_simpleCMV(&simpleWYE->phsB);
	total += len + getLengthBytes(len) + 1;
	len = ber_get_length_simpleCMV(&simpleWYE->phsC);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_simpleWYE(unsigned char *buf, struct simpleWYE *simpleWYE) {
	int offset = 0;

	buf[offset++] = 0xA2;
	offset += encodeLength(&buf[offset], ber_get_length_simpleWYE(simpleWYE));

	offset += ber_encode_simpleCMV(&buf[offset], &simpleWYE->phsA);
	offset += ber_encode_simpleCMV(&buf[offset], &simpleWYE->phsB);
	offset += ber_encode_simpleCMV(&buf[offset], &simpleWYE->phsC);

	return offset;
}
int ber_get_length_myCMV(struct myCMV *myCMV) {
	int total = 0;
	int len = 0;

	len = ber_get_length_myVector(&myCMV->cVal);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_QUALITY(&myCMV->q);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_TIMESTAMP(&myCMV->t);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_myCMV(unsigned char *buf, struct myCMV *myCMV) {
	int offset = 0;

	buf[offset++] = 0xA2;
	offset += encodeLength(&buf[offset], ber_get_length_myCMV(myCMV));

	offset += ber_encode_myVector(&buf[offset], &myCMV->cVal);
	offset += BER_ENCODE_CTYPE_QUALITY(&buf[offset], &myCMV->q);
	offset += BER_ENCODE_CTYPE_TIMESTAMP(&buf[offset], &myCMV->t);

	return offset;
}
int ber_get_length_mySEQ(struct mySEQ *mySEQ) {
	int total = 0;
	int len = 0;

	len = ber_get_length_myCMV(&mySEQ->c1);
	total += len + getLengthBytes(len) + 1;
	len = ber_get_length_myCMV(&mySEQ->c2);
	total += len + getLengthBytes(len) + 1;
	len = ber_get_length_myCMV(&mySEQ->c3);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_ENUM((CTYPE_ENUM *) &mySEQ->seqT);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_mySEQ(unsigned char *buf, struct mySEQ *mySEQ) {
	int offset = 0;

	buf[offset++] = 0xA2;
	offset += encodeLength(&buf[offset], ber_get_length_mySEQ(mySEQ));

	offset += ber_encode_myCMV(&buf[offset], &mySEQ->c1);
	offset += ber_encode_myCMV(&buf[offset], &mySEQ->c2);
	offset += ber_encode_myCMV(&buf[offset], &mySEQ->c3);
	offset += BER_ENCODE_CTYPE_ENUM(&buf[offset], (CTYPE_ENUM *) &mySEQ->seqT);

	return offset;
}
int ber_get_length_mySAV(struct mySAV *mySAV) {
	int total = 0;
	int len = 0;

	len = ber_get_length_myAnalogValue(&mySAV->instMag);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_QUALITY(&mySAV->q);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_mySAV(unsigned char *buf, struct mySAV *mySAV) {
	int offset = 0;

	buf[offset++] = 0xA2;
	offset += encodeLength(&buf[offset], ber_get_length_mySAV(mySAV));

	offset += ber_encode_myAnalogValue(&buf[offset], &mySAV->instMag);
	offset += BER_ENCODE_CTYPE_QUALITY(&buf[offset], &mySAV->q);

	return offset;
}
int ber_get_length_simpleSAV(struct simpleSAV *simpleSAV) {
	int total = 0;
	int len = 0;

	len = ber_get_length_myAnalogValue(&simpleSAV->instMag);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_QUALITY(&simpleSAV->q);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_simpleSAV(unsigned char *buf, struct simpleSAV *simpleSAV) {
	int offset = 0;

	buf[offset++] = 0xA2;
	offset += encodeLength(&buf[offset], ber_get_length_simpleSAV(simpleSAV));

	offset += ber_encode_myAnalogValue(&buf[offset], &simpleSAV->instMag);
	offset += BER_ENCODE_CTYPE_QUALITY(&buf[offset], &simpleSAV->q);

	return offset;
}
int ber_get_length_E1Q1SB1_C1_Performance() {
	int total = 0;
	int len = 0;

	len = ber_get_length_myMV(&E1Q1SB1.S1.C1.MMXUa_1.Amps);
	total += len + getLengthBytes(len) + 1;
	len = ber_get_length_myMV(&E1Q1SB1.S1.C1.MMXUa_1.Volts);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_E1Q1SB1_C1_Performance(unsigned char *buf) {
	int offset = 0;

	offset += ber_encode_myMV(&buf[offset], &E1Q1SB1.S1.C1.MMXUa_1.Amps);
	offset += ber_encode_myMV(&buf[offset], &E1Q1SB1.S1.C1.MMXUa_1.Volts);

	return offset;
}
int ber_encode_control_E1Q1SB1_C1_Performance(unsigned char *buf) {
	return ber_encode_E1Q1SB1_C1_Performance(buf);
}
int ber_get_length_E1Q1SB1_C1_Positions() {
	int total = 0;
	int len = 0;

	len = ber_get_length_myAnalogValue(&E1Q1SB1.S1.C1.TVTRa_1.Vol.instMag);
	total += len + getLengthBytes(len) + 1;
	len = ber_get_length_myPos(&E1Q1SB1.S1.C1.CSWIa_1.Pos);
	total += len + getLengthBytes(len) + 1;
	len = ber_get_length_myPos(&E1Q1SB1.S1.C1.CSWIa_2.Pos);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_ENUM((CTYPE_ENUM *) &E1Q1SB1.S1.C1.MMXUa_1.Mod.stVal);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_E1Q1SB1_C1_Positions(unsigned char *buf) {
	int offset = 0;

	offset += ber_encode_myAnalogValue(&buf[offset], &E1Q1SB1.S1.C1.TVTRa_1.Vol.instMag);
	offset += ber_encode_myPos(&buf[offset], &E1Q1SB1.S1.C1.CSWIa_1.Pos);
	offset += ber_encode_myPos(&buf[offset], &E1Q1SB1.S1.C1.CSWIa_2.Pos);
	offset += BER_ENCODE_CTYPE_ENUM(&buf[offset], (CTYPE_ENUM *) &E1Q1SB1.S1.C1.MMXUa_1.Mod.stVal);

	return offset;
}
int ber_encode_control_E1Q1SB1_C1_ItlPositions(unsigned char *buf) {
	return ber_encode_E1Q1SB1_C1_Positions(buf);
}
int ber_encode_control_E1Q1SB1_C1_AnotherPositions(unsigned char *buf) {
	return ber_encode_E1Q1SB1_C1_Positions(buf);
}
int ber_get_length_E1Q1SB1_C1_Measurands() {
	int total = 0;
	int len = 0;

	len = ber_get_length_myAnalogValue(&E1Q1SB1.S1.C1.TVTRa_1.Vol.instMag);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_E1Q1SB1_C1_Measurands(unsigned char *buf) {
	int offset = 0;

	offset += ber_encode_myAnalogValue(&buf[offset], &E1Q1SB1.S1.C1.TVTRa_1.Vol.instMag);

	return offset;
}
int ber_get_length_E1Q1SB1_C1_smv() {
	int total = 0;
	int len = 0;

	len = ber_get_length_myAnalogValue(&E1Q1SB1.S1.C1.TVTRa_1.Vol.instMag);
	total += len + getLengthBytes(len) + 1;
	len = ber_get_length_myMod(&E1Q1SB1.S1.C1.CSWIa_1.Mod);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_ENUM((CTYPE_ENUM *) &E1Q1SB1.S1.C1.MMXUa_1.Mod.stVal);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_E1Q1SB1_C1_smv(unsigned char *buf) {
	int offset = 0;

	offset += ber_encode_myAnalogValue(&buf[offset], &E1Q1SB1.S1.C1.TVTRa_1.Vol.instMag);
	offset += ber_encode_myMod(&buf[offset], &E1Q1SB1.S1.C1.CSWIa_1.Mod);
	offset += BER_ENCODE_CTYPE_ENUM(&buf[offset], (CTYPE_ENUM *) &E1Q1SB1.S1.C1.MMXUa_1.Mod.stVal);

	return offset;
}
int ber_get_length_E1Q1SB1_C1_rmxu() {
	int total = 0;
	int len = 0;

	len = ber_get_length_simpleSAV(&E1Q1SB1.S1.C1.exampleRMXU_1.AmpLocPhsA);
	total += len + getLengthBytes(len) + 1;
	len = ber_get_length_simpleSAV(&E1Q1SB1.S1.C1.exampleRMXU_1.AmpLocPhsB);
	total += len + getLengthBytes(len) + 1;
	len = ber_get_length_simpleSAV(&E1Q1SB1.S1.C1.exampleRMXU_1.AmpLocPhsC);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_E1Q1SB1_C1_rmxu(unsigned char *buf) {
	int offset = 0;

	offset += ber_encode_simpleSAV(&buf[offset], &E1Q1SB1.S1.C1.exampleRMXU_1.AmpLocPhsA);
	offset += ber_encode_simpleSAV(&buf[offset], &E1Q1SB1.S1.C1.exampleRMXU_1.AmpLocPhsB);
	offset += ber_encode_simpleSAV(&buf[offset], &E1Q1SB1.S1.C1.exampleRMXU_1.AmpLocPhsC);

	return offset;
}
int ber_get_length_D1Q1SB4_C1_SyckResult() {
	int total = 0;
	int len = 0;

	len = ber_get_length_mySPS(&D1Q1SB4.S1.C1.RSYNa_1.Rel);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_D1Q1SB4_C1_SyckResult(unsigned char *buf) {
	int offset = 0;

	offset += ber_encode_mySPS(&buf[offset], &D1Q1SB4.S1.C1.RSYNa_1.Rel);

	return offset;
}
int ber_encode_control_D1Q1SB4_C1_SyckResult(unsigned char *buf) {
	return ber_encode_D1Q1SB4_C1_SyckResult(buf);
}
int ber_get_length_D1Q1SB4_C1_MMXUResult() {
	int total = 0;
	int len = 0;

	len = ber_get_length_simpleWYE(&D1Q1SB4.S1.C1.exampleMMXU_1.A);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_D1Q1SB4_C1_MMXUResult(unsigned char *buf) {
	int offset = 0;

	offset += ber_encode_simpleWYE(&buf[offset], &D1Q1SB4.S1.C1.exampleMMXU_1.A);

	return offset;
}
int ber_encode_control_D1Q1SB4_C1_MMXUResult(unsigned char *buf) {
	return ber_encode_D1Q1SB4_C1_MMXUResult(buf);
}


