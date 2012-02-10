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
	offset += DECODE_CTYPE_INT32(&buf[offset], &myMV->int1);
	offset += DECODE_CTYPE_INT32(&buf[offset], &myMV->int2);
	offset += DECODE_CTYPE_INT32(&buf[offset], &myMV->int3);

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
	offset += decode_mySPS(&buf[offset], &simpleCMV->testSecondLayerSDO);
	offset += DECODE_CTYPE_INT32(&buf[offset], &simpleCMV->testInteger);
	offset += DECODE_CTYPE_BOOLEAN(&buf[offset], &simpleCMV->testBoolean);

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
int decode_E1Q1SB1_C1_Performance(unsigned char *buf, CTYPE_INT16U smpCnt, struct E1Q1SB1_C1_Performance *E1Q1SB1_C1_Performance) {
	int offset = 0;

	offset += decode_myMV(&buf[offset], &E1Q1SB1_C1_Performance->C1_MMXU_1_Amps);
	offset += decode_myMV(&buf[offset], &E1Q1SB1_C1_Performance->C1_MMXU_1_Volts);

	return offset;
}
int decode_E1Q1SB1_C1_Positions(unsigned char *buf, CTYPE_INT16U smpCnt, struct E1Q1SB1_C1_Positions *E1Q1SB1_C1_Positions) {
	int offset = 0;

	offset += decode_myAnalogValue(&buf[offset], &E1Q1SB1_C1_Positions->C1_TVTR_1_Vol_instMag);
	offset += decode_myPos(&buf[offset], &E1Q1SB1_C1_Positions->C1_CSWI_1_Pos);
	offset += decode_myPos(&buf[offset], &E1Q1SB1_C1_Positions->C1_CSWI_2_Pos);
	offset += DECODE_CTYPE_ENUM(&buf[offset], (CTYPE_ENUM *) &E1Q1SB1_C1_Positions->C1_MMXU_1_Mod_stVal);

	return offset;
}
int decode_E1Q1SB1_C1_Measurands(unsigned char *buf, CTYPE_INT16U smpCnt, struct E1Q1SB1_C1_Measurands *E1Q1SB1_C1_Measurands) {
	int offset = 0;

	offset += decode_myAnalogValue(&buf[offset], &E1Q1SB1_C1_Measurands->C1_TVTR_1_Vol_instMag);

	return offset;
}
int decode_E1Q1SB1_C1_smv(unsigned char *buf, CTYPE_INT16U smpCnt, struct E1Q1SB1_C1_smv *E1Q1SB1_C1_smv) {
	int offset = 0;

	offset += decode_myAnalogValue(&buf[offset], &E1Q1SB1_C1_smv->C1_TVTR_1_Vol_instMag);
	offset += decode_myMod(&buf[offset], &E1Q1SB1_C1_smv->C1_CSWI_1_Mod);
	offset += DECODE_CTYPE_ENUM(&buf[offset], (CTYPE_ENUM *) &E1Q1SB1_C1_smv->C1_MMXU_1_Mod_stVal);

	return offset;
}
int decode_E1Q1SB1_C1_rmxu(unsigned char *buf, CTYPE_INT16U smpCnt, struct E1Q1SB1_C1_rmxu *E1Q1SB1_C1_rmxu) {
	int offset = 0;

	offset += decode_simpleSAV(&buf[offset], &E1Q1SB1_C1_rmxu->C1_RMXU_1_AmpLocPhsA);
	offset += decode_simpleSAV(&buf[offset], &E1Q1SB1_C1_rmxu->C1_RMXU_1_AmpLocPhsB);
	offset += decode_simpleSAV(&buf[offset], &E1Q1SB1_C1_rmxu->C1_RMXU_1_AmpLocPhsC);

	return offset;
}
int decode_D1Q1SB4_C1_SyckResult(unsigned char *buf, CTYPE_INT16U smpCnt, struct D1Q1SB4_C1_SyckResult *D1Q1SB4_C1_SyckResult) {
	int offset = 0;

	offset += decode_mySPS(&buf[offset], &D1Q1SB4_C1_SyckResult->C1_RSYN_1_Rel);

	return offset;
}
int decode_D1Q1SB4_C1_MMXUResult(unsigned char *buf, CTYPE_INT16U smpCnt, struct D1Q1SB4_C1_MMXUResult *D1Q1SB4_C1_MMXUResult) {
	int offset = 0;

	offset += decode_simpleWYE(&buf[offset], &D1Q1SB4_C1_MMXUResult->C1_MMXU_1_A);

	return offset;
}

void svDecodeDataset(unsigned char *dataset, int datasetLength, int ASDU, unsigned char *svID, int svIDLength, CTYPE_INT16U smpCnt) {

	if (strncmp((const char *) svID, "11", svIDLength) == 0) {
		decode_E1Q1SB1_C1_smv(dataset, smpCnt, &D1Q1SB4.S1.C1.LPHDa_1.sv_inputs_Volt.E1Q1SB1_C1_smv[ASDU]);
		D1Q1SB4.S1.C1.LPHDa_1.sv_inputs_Volt.smpCnt = smpCnt;
		if (D1Q1SB4.S1.C1.LPHDa_1.sv_inputs_Volt.datasetDecodeDone != NULL) {
			D1Q1SB4.S1.C1.LPHDa_1.sv_inputs_Volt.datasetDecodeDone(smpCnt);
		}
	}
	if (strncmp((const char *) svID, "rmxu", svIDLength) == 0) {
		decode_E1Q1SB1_C1_rmxu(dataset, smpCnt, &D1Q1SB4.S1.C1.exampleMMXU_1.sv_inputs_rmxuCB.E1Q1SB1_C1_rmxu[ASDU]);
		D1Q1SB4.S1.C1.exampleMMXU_1.sv_inputs_rmxuCB.smpCnt = smpCnt;
		if (D1Q1SB4.S1.C1.exampleMMXU_1.sv_inputs_rmxuCB.datasetDecodeDone != NULL) {
			D1Q1SB4.S1.C1.exampleMMXU_1.sv_inputs_rmxuCB.datasetDecodeDone(smpCnt);
		}
	}
	if (strncmp((const char *) svID, "Performance", svIDLength) == 0) {
		decode_E1Q1SB1_C1_Performance(dataset, smpCnt, &D1Q1SB4.S1.C1.exampleMMXU_1.sv_inputs_PerformanceSV.E1Q1SB1_C1_Performance);
		D1Q1SB4.S1.C1.exampleMMXU_1.sv_inputs_PerformanceSV.smpCnt = smpCnt;
		if (D1Q1SB4.S1.C1.exampleMMXU_1.sv_inputs_PerformanceSV.datasetDecodeDone != NULL) {
			D1Q1SB4.S1.C1.exampleMMXU_1.sv_inputs_PerformanceSV.datasetDecodeDone(smpCnt);
		}
	}
	if (strncmp((const char *) svID, "11", svIDLength) == 0) {
		decode_E1Q1SB1_C1_smv(dataset, smpCnt, &D1Q1SB4.S1.C1.RSYNa_1.sv_inputs_Volt.E1Q1SB1_C1_smv[ASDU]);
		D1Q1SB4.S1.C1.RSYNa_1.sv_inputs_Volt.smpCnt = smpCnt;
		if (D1Q1SB4.S1.C1.RSYNa_1.sv_inputs_Volt.datasetDecodeDone != NULL) {
			D1Q1SB4.S1.C1.RSYNa_1.sv_inputs_Volt.datasetDecodeDone(smpCnt);
		}
	}
}


