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

#include "svDecodeBasic.h"
#include "ied.h"
#include "svDecode.h"



int decode_myAnalogValue(unsigned char *buf, struct myAnalogValue *myAnalogValue) {
	int offset = 0;

	offset += DECODE_CTYPE_FLOAT32(&buf[offset], &myAnalogValue->f);

	return offset;
}
int decode_ScaledValueConfig(unsigned char *buf, struct ScaledValueConfig *ScaledValueConfig) {
	int offset = 0;

	offset += DECODE_CTYPE_FLOAT32(&buf[offset], &ScaledValueConfig->scaleFactor);
	offset += DECODE_CTYPE_FLOAT32(&buf[offset], &ScaledValueConfig->offset);

	return offset;
}
int decode_myVector(unsigned char *buf, struct myVector *myVector) {
	int offset = 0;

	offset += decode_myAnalogValue(&buf[offset], &myVector->mag);
	offset += decode_myAnalogValue(&buf[offset], &myVector->ang);

	return offset;
}
int decode_simpleVector(unsigned char *buf, struct simpleVector *simpleVector) {
	int offset = 0;

	offset += decode_myAnalogValue(&buf[offset], &simpleVector->mag);
	offset += decode_myAnalogValue(&buf[offset], &simpleVector->ang);

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
int decode_myDPL(unsigned char *buf, struct myDPL *myDPL) {
	int offset = 0;

	offset += DECODE_CTYPE_VISSTRING255(&buf[offset], &myDPL->vendor);
	offset += DECODE_CTYPE_VISSTRING255(&buf[offset], &myDPL->hwRev);

	return offset;
}
int decode_myPos(unsigned char *buf, struct myPos *myPos) {
	int offset = 0;

	offset += DECODE_CTYPE_DBPOS(&buf[offset], &myPos->stVal);
	offset += DECODE_CTYPE_QUALITY(&buf[offset], &myPos->q);
	offset += DECODE_CTYPE_TIMESTAMP(&buf[offset], &myPos->t);
	offset += DECODE_CTYPE_BOOLEAN(&buf[offset], &myPos->ctlVal);

	return offset;
}
int decode_mySPS(unsigned char *buf, struct mySPS *mySPS) {
	int offset = 0;

	offset += DECODE_CTYPE_INT32(&buf[offset], &mySPS->stVal);
	offset += DECODE_CTYPE_QUALITY(&buf[offset], &mySPS->q);
	offset += DECODE_CTYPE_TIMESTAMP(&buf[offset], &mySPS->t);

	return offset;
}
int decode_myMV(unsigned char *buf, struct myMV *myMV) {
	int offset = 0;

	offset += decode_myAnalogValue(&buf[offset], &myMV->mag);
	offset += DECODE_CTYPE_QUALITY(&buf[offset], &myMV->q);
	offset += DECODE_CTYPE_TIMESTAMP(&buf[offset], &myMV->t);
	offset += decode_ScaledValueConfig(&buf[offset], &myMV->sVC);

	return offset;
}
int decode_simpleMV(unsigned char *buf, struct simpleMV *simpleMV) {
	int offset = 0;

	offset += DECODE_CTYPE_FLOAT32(&buf[offset], &simpleMV->mag);
	offset += DECODE_CTYPE_QUALITY(&buf[offset], &simpleMV->q);
	offset += DECODE_CTYPE_TIMESTAMP(&buf[offset], &simpleMV->t);
	offset += decode_ScaledValueConfig(&buf[offset], &simpleMV->sVC);

	return offset;
}
int decode_simpleCMV(unsigned char *buf, struct simpleCMV *simpleCMV) {
	int offset = 0;

	offset += decode_simpleVector(&buf[offset], &simpleCMV->cVal);
	offset += DECODE_CTYPE_QUALITY(&buf[offset], &simpleCMV->q);
	offset += DECODE_CTYPE_TIMESTAMP(&buf[offset], &simpleCMV->t);

	return offset;
}
int decode_simpleWYE(unsigned char *buf, struct simpleWYE *simpleWYE) {
	int offset = 0;

	offset += decode_simpleCMV(&buf[offset], &simpleWYE->phsA);
	offset += decode_simpleCMV(&buf[offset], &simpleWYE->phsB);
	offset += decode_simpleCMV(&buf[offset], &simpleWYE->phsC);

	return offset;
}
int decode_myCMV(unsigned char *buf, struct myCMV *myCMV) {
	int offset = 0;

	offset += decode_myVector(&buf[offset], &myCMV->cVal);
	offset += DECODE_CTYPE_QUALITY(&buf[offset], &myCMV->q);
	offset += DECODE_CTYPE_TIMESTAMP(&buf[offset], &myCMV->t);

	return offset;
}
int decode_mySEQ(unsigned char *buf, struct mySEQ *mySEQ) {
	int offset = 0;

	offset += decode_myCMV(&buf[offset], &mySEQ->c1);
	offset += decode_myCMV(&buf[offset], &mySEQ->c2);
	offset += decode_myCMV(&buf[offset], &mySEQ->c3);
	offset += DECODE_CTYPE_ENUM(&buf[offset], (CTYPE_ENUM *) &mySEQ->seqT);

	return offset;
}
int decode_mySAV(unsigned char *buf, struct mySAV *mySAV) {
	int offset = 0;

	offset += decode_myAnalogValue(&buf[offset], &mySAV->instMag);
	offset += DECODE_CTYPE_QUALITY(&buf[offset], &mySAV->q);

	return offset;
}
int decode_simpleSAV(unsigned char *buf, struct simpleSAV *simpleSAV) {
	int offset = 0;

	offset += decode_myAnalogValue(&buf[offset], &simpleSAV->instMag);
	offset += DECODE_CTYPE_QUALITY(&buf[offset], &simpleSAV->q);

	return offset;
}
int decode_smv_LPHD_1(unsigned char *buf, int noASDU) {
	int offset = 0;

	offset += decode_myAnalogValue(&buf[offset], &D1Q1SB4.S1.C1.LPHD_1.sv_inputs.instMag_1[noASDU]);
	offset += decode_myMod(&buf[offset], &D1Q1SB4.S1.C1.LPHD_1.sv_inputs.Mod_1[noASDU]);
	offset += DECODE_CTYPE_ENUM(&buf[offset], (CTYPE_ENUM *) &D1Q1SB4.S1.C1.LPHD_1.sv_inputs.stVal_1[noASDU]);
	offset += DECODE_CTYPE_QUALITY(&buf[offset], &D1Q1SB4.S1.C1.LPHD_1.sv_inputs.q_1[noASDU]);
	offset += decode_myMV(&buf[offset], &D1Q1SB4.S1.C1.LPHD_1.sv_inputs.Amps_1[noASDU]);
	offset += decode_myPos(&buf[offset], &D1Q1SB4.S1.C1.LPHD_1.sv_inputs.Pos_2[noASDU]);

	return offset;
}
int decode_rmxu_MMXU_1(unsigned char *buf, int noASDU) {
	int offset = 0;

	offset += decode_simpleSAV(&buf[offset], &D1Q1SB4.S1.C1.MMXU_1.sv_inputs.AmpLocPhsA_1[noASDU]);
	offset += decode_simpleSAV(&buf[offset], &D1Q1SB4.S1.C1.MMXU_1.sv_inputs.AmpLocPhsB_1[noASDU]);
	offset += decode_simpleSAV(&buf[offset], &D1Q1SB4.S1.C1.MMXU_1.sv_inputs.AmpLocPhsC_1[noASDU]);

	return offset;
}
int decode_smv_RSYN_1(unsigned char *buf, int noASDU) {
	int offset = 0;

	offset += decode_myAnalogValue(&buf[offset], &D1Q1SB4.S1.C1.RSYN_1.sv_inputs.instMag_1[noASDU]);
	offset += decode_myMod(&buf[offset], &D1Q1SB4.S1.C1.RSYN_1.sv_inputs.Mod_1[noASDU]);
	offset += DECODE_CTYPE_ENUM(&buf[offset], (CTYPE_ENUM *) &D1Q1SB4.S1.C1.RSYN_1.sv_inputs.stVal_1[noASDU]);
	offset += DECODE_CTYPE_QUALITY(&buf[offset], &D1Q1SB4.S1.C1.RSYN_1.sv_inputs.q_1[noASDU]);
	offset += decode_myMV(&buf[offset], &D1Q1SB4.S1.C1.RSYN_1.sv_inputs.Amps_1[noASDU]);
	offset += decode_myPos(&buf[offset], &D1Q1SB4.S1.C1.RSYN_1.sv_inputs.Pos_2[noASDU]);

	return offset;
}

void svDecodeDataset(unsigned char *dataset, int datasetLength, int ASDU, unsigned char *svID, int svIDLength) {

	if (strncmp((const char *) svID, "11", svIDLength) == 0) {
		decode_smv_LPHD_1(dataset, ASDU);
	}
	if (strncmp((const char *) svID, "rmxu", svIDLength) == 0) {
		decode_rmxu_MMXU_1(dataset, ASDU);
	}
	if (strncmp((const char *) svID, "11", svIDLength) == 0) {
		decode_smv_RSYN_1(dataset, ASDU);
	}
}


