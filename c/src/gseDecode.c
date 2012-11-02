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




int ber_decode_myAnalogValue(unsigned char *buf, struct myAnalogValue *myAnalogValue) {
	int offset = 0;

	if (buf[offset++] == 0xA2) {
		offset += getLengthFieldSize(buf[offset]);

		offset += BER_DECODE_CTYPE_FLOAT32(&buf[offset], &myAnalogValue->f);
	}

	return offset;
}
int ber_decode_ScaledValueConfig(unsigned char *buf, struct ScaledValueConfig *ScaledValueConfig) {
	int offset = 0;

	if (buf[offset++] == 0xA2) {
		offset += getLengthFieldSize(buf[offset]);

		offset += BER_DECODE_CTYPE_FLOAT32(&buf[offset], &ScaledValueConfig->scaleFactor);
		offset += BER_DECODE_CTYPE_FLOAT32(&buf[offset], &ScaledValueConfig->offset);
	}

	return offset;
}
int ber_decode_myVector(unsigned char *buf, struct myVector *myVector) {
	int offset = 0;

	if (buf[offset++] == 0xA2) {
		offset += getLengthFieldSize(buf[offset]);

		offset += ber_decode_myAnalogValue(&buf[offset], &myVector->mag);
		offset += ber_decode_myAnalogValue(&buf[offset], &myVector->ang);
	}

	return offset;
}
int ber_decode_simpleVector(unsigned char *buf, struct simpleVector *simpleVector) {
	int offset = 0;

	if (buf[offset++] == 0xA2) {
		offset += getLengthFieldSize(buf[offset]);

		offset += ber_decode_myAnalogValue(&buf[offset], &simpleVector->mag);
		offset += ber_decode_myAnalogValue(&buf[offset], &simpleVector->ang);
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
int ber_decode_myDPL(unsigned char *buf, struct myDPL *myDPL) {
	int offset = 0;

	if (buf[offset++] == 0xA2) {
		offset += getLengthFieldSize(buf[offset]);

		offset += BER_DECODE_CTYPE_VISSTRING255(&buf[offset], &myDPL->vendor);
		offset += BER_DECODE_CTYPE_VISSTRING255(&buf[offset], &myDPL->hwRev);
	}

	return offset;
}
int ber_decode_myPos(unsigned char *buf, struct myPos *myPos) {
	int offset = 0;

	if (buf[offset++] == 0xA2) {
		offset += getLengthFieldSize(buf[offset]);

		offset += BER_DECODE_CTYPE_DBPOS(&buf[offset], &myPos->stVal);
		offset += BER_DECODE_CTYPE_QUALITY(&buf[offset], &myPos->q);
		offset += BER_DECODE_CTYPE_TIMESTAMP(&buf[offset], &myPos->t);
		offset += BER_DECODE_CTYPE_BOOLEAN(&buf[offset], &myPos->ctlVal);
	}

	return offset;
}
int ber_decode_mySPS(unsigned char *buf, struct mySPS *mySPS) {
	int offset = 0;

	if (buf[offset++] == 0xA2) {
		offset += getLengthFieldSize(buf[offset]);

		offset += BER_DECODE_CTYPE_INT32(&buf[offset], &mySPS->stVal);
		offset += BER_DECODE_CTYPE_QUALITY(&buf[offset], &mySPS->q);
		offset += BER_DECODE_CTYPE_TIMESTAMP(&buf[offset], &mySPS->t);
	}

	return offset;
}
int ber_decode_myMV(unsigned char *buf, struct myMV *myMV) {
	int offset = 0;

	if (buf[offset++] == 0xA2) {
		offset += getLengthFieldSize(buf[offset]);

		offset += ber_decode_myAnalogValue(&buf[offset], &myMV->mag);
		offset += BER_DECODE_CTYPE_QUALITY(&buf[offset], &myMV->q);
		offset += BER_DECODE_CTYPE_TIMESTAMP(&buf[offset], &myMV->t);
		offset += ber_decode_ScaledValueConfig(&buf[offset], &myMV->sVC);
		offset += BER_DECODE_CTYPE_INT32(&buf[offset], &myMV->int1);
		offset += BER_DECODE_CTYPE_INT32(&buf[offset], &myMV->int2);
		offset += BER_DECODE_CTYPE_INT32(&buf[offset], &myMV->int3);
	}

	return offset;
}
int ber_decode_simpleMV(unsigned char *buf, struct simpleMV *simpleMV) {
	int offset = 0;

	if (buf[offset++] == 0xA2) {
		offset += getLengthFieldSize(buf[offset]);

		offset += BER_DECODE_CTYPE_FLOAT32(&buf[offset], &simpleMV->mag);
		offset += BER_DECODE_CTYPE_QUALITY(&buf[offset], &simpleMV->q);
		offset += BER_DECODE_CTYPE_TIMESTAMP(&buf[offset], &simpleMV->t);
		offset += ber_decode_ScaledValueConfig(&buf[offset], &simpleMV->sVC);
	}

	return offset;
}
int ber_decode_simpleCMV(unsigned char *buf, struct simpleCMV *simpleCMV) {
	int offset = 0;

	if (buf[offset++] == 0xA2) {
		offset += getLengthFieldSize(buf[offset]);

		offset += ber_decode_simpleVector(&buf[offset], &simpleCMV->cVal);
		offset += BER_DECODE_CTYPE_QUALITY(&buf[offset], &simpleCMV->q);
		offset += BER_DECODE_CTYPE_TIMESTAMP(&buf[offset], &simpleCMV->t);
		offset += ber_decode_mySPS(&buf[offset], &simpleCMV->testSecondLayerSDO);
		offset += BER_DECODE_CTYPE_INT32(&buf[offset], &simpleCMV->testInteger);
		offset += BER_DECODE_CTYPE_BOOLEAN(&buf[offset], &simpleCMV->testBoolean);
	}

	return offset;
}
int ber_decode_simpleWYE(unsigned char *buf, struct simpleWYE *simpleWYE) {
	int offset = 0;

	if (buf[offset++] == 0xA2) {
		offset += getLengthFieldSize(buf[offset]);

		offset += ber_decode_simpleCMV(&buf[offset], &simpleWYE->phsA);
		offset += ber_decode_simpleCMV(&buf[offset], &simpleWYE->phsB);
		offset += ber_decode_simpleCMV(&buf[offset], &simpleWYE->phsC);
	}

	return offset;
}
int ber_decode_myCMV(unsigned char *buf, struct myCMV *myCMV) {
	int offset = 0;

	if (buf[offset++] == 0xA2) {
		offset += getLengthFieldSize(buf[offset]);

		offset += ber_decode_myVector(&buf[offset], &myCMV->cVal);
		offset += BER_DECODE_CTYPE_QUALITY(&buf[offset], &myCMV->q);
		offset += BER_DECODE_CTYPE_TIMESTAMP(&buf[offset], &myCMV->t);
	}

	return offset;
}
int ber_decode_mySEQ(unsigned char *buf, struct mySEQ *mySEQ) {
	int offset = 0;

	if (buf[offset++] == 0xA2) {
		offset += getLengthFieldSize(buf[offset]);

		offset += ber_decode_myCMV(&buf[offset], &mySEQ->c1);
		offset += ber_decode_myCMV(&buf[offset], &mySEQ->c2);
		offset += ber_decode_myCMV(&buf[offset], &mySEQ->c3);
		offset += BER_DECODE_CTYPE_ENUM(&buf[offset], (CTYPE_ENUM *) &mySEQ->seqT);
	}

	return offset;
}
int ber_decode_mySAV(unsigned char *buf, struct mySAV *mySAV) {
	int offset = 0;

	if (buf[offset++] == 0xA2) {
		offset += getLengthFieldSize(buf[offset]);

		offset += ber_decode_myAnalogValue(&buf[offset], &mySAV->instMag);
		offset += BER_DECODE_CTYPE_QUALITY(&buf[offset], &mySAV->q);
	}

	return offset;
}
int ber_decode_simpleSAV(unsigned char *buf, struct simpleSAV *simpleSAV) {
	int offset = 0;

	if (buf[offset++] == 0xA2) {
		offset += getLengthFieldSize(buf[offset]);

		offset += ber_decode_myAnalogValue(&buf[offset], &simpleSAV->instMag);
		offset += BER_DECODE_CTYPE_QUALITY(&buf[offset], &simpleSAV->q);
	}

	return offset;
}
int ber_decode_E1Q1SB1_C1_Performance(unsigned char *buf, struct E1Q1SB1_C1_Performance *E1Q1SB1_C1_Performance) {
	int offset = 0;

	offset += ber_decode_myMV(&buf[offset], &E1Q1SB1_C1_Performance->C1_MMXU_1_Amps);
	offset += ber_decode_myMV(&buf[offset], &E1Q1SB1_C1_Performance->C1_MMXU_1_Volts);

	return offset;
}
int ber_decode_E1Q1SB1_C1_Positions(unsigned char *buf, struct E1Q1SB1_C1_Positions *E1Q1SB1_C1_Positions) {
	int offset = 0;

	offset += ber_decode_myAnalogValue(&buf[offset], &E1Q1SB1_C1_Positions->C1_TVTR_1_Vol_instMag);
	offset += ber_decode_myPos(&buf[offset], &E1Q1SB1_C1_Positions->C1_CSWI_1_Pos);
	offset += ber_decode_myPos(&buf[offset], &E1Q1SB1_C1_Positions->C1_CSWI_2_Pos);
	offset += BER_DECODE_CTYPE_ENUM(&buf[offset], (CTYPE_ENUM *) &E1Q1SB1_C1_Positions->C1_MMXU_1_Mod_stVal);

	return offset;
}
int ber_decode_E1Q1SB1_C1_Measurands(unsigned char *buf, struct E1Q1SB1_C1_Measurands *E1Q1SB1_C1_Measurands) {
	int offset = 0;

	offset += ber_decode_myAnalogValue(&buf[offset], &E1Q1SB1_C1_Measurands->C1_TVTR_1_Vol_instMag);

	return offset;
}
int ber_decode_E1Q1SB1_C1_smv(unsigned char *buf, struct E1Q1SB1_C1_smv *E1Q1SB1_C1_smv) {
	int offset = 0;

	offset += ber_decode_myAnalogValue(&buf[offset], &E1Q1SB1_C1_smv->C1_TVTR_1_Vol_instMag);
	offset += ber_decode_myMod(&buf[offset], &E1Q1SB1_C1_smv->C1_CSWI_1_Mod);
	offset += BER_DECODE_CTYPE_ENUM(&buf[offset], (CTYPE_ENUM *) &E1Q1SB1_C1_smv->C1_MMXU_1_Mod_stVal);

	return offset;
}
int ber_decode_E1Q1SB1_C1_rmxu(unsigned char *buf, struct E1Q1SB1_C1_rmxu *E1Q1SB1_C1_rmxu) {
	int offset = 0;

	offset += ber_decode_simpleSAV(&buf[offset], &E1Q1SB1_C1_rmxu->C1_RMXU_1_AmpLocPhsA);
	offset += ber_decode_simpleSAV(&buf[offset], &E1Q1SB1_C1_rmxu->C1_RMXU_1_AmpLocPhsB);
	offset += ber_decode_simpleSAV(&buf[offset], &E1Q1SB1_C1_rmxu->C1_RMXU_1_AmpLocPhsC);

	return offset;
}
int ber_decode_D1Q1SB4_C1_SyckResult(unsigned char *buf, struct D1Q1SB4_C1_SyckResult *D1Q1SB4_C1_SyckResult) {
	int offset = 0;

	offset += ber_decode_mySPS(&buf[offset], &D1Q1SB4_C1_SyckResult->C1_RSYN_1_Rel);

	return offset;
}
int ber_decode_D1Q1SB4_C1_MMXUResult(unsigned char *buf, struct D1Q1SB4_C1_MMXUResult *D1Q1SB4_C1_MMXUResult) {
	int offset = 0;

	offset += ber_decode_simpleWYE(&buf[offset], &D1Q1SB4_C1_MMXUResult->C1_MMXU_1_A);

	return offset;
}

void gseDecodeDataset(unsigned char *dataset, CTYPE_INT16U datasetLength, unsigned char *gocbRef, CTYPE_INT16U gocbRefLength, CTYPE_INT32U timeAllowedToLive, CTYPE_TIMESTAMP T, CTYPE_INT32U stNum, CTYPE_INT32U sqNum) {

	if (gocbRefLength == 29 && strncmp((const char *) gocbRef, "E1Q1SB1C1/LLN0$GO$Performance", gocbRefLength) == 0) {
		if (stNum != D1Q1SB4.S1.C1.exampleMMXU_1.gse_inputs_Performance.stNum) {
			ber_decode_E1Q1SB1_C1_Performance(dataset, &D1Q1SB4.S1.C1.exampleMMXU_1.gse_inputs_Performance.E1Q1SB1_C1_Performance);
		}
		D1Q1SB4.S1.C1.exampleMMXU_1.gse_inputs_Performance.timeAllowedToLive = timeAllowedToLive;
		D1Q1SB4.S1.C1.exampleMMXU_1.gse_inputs_Performance.T = T;
		D1Q1SB4.S1.C1.exampleMMXU_1.gse_inputs_Performance.stNum = stNum;
		D1Q1SB4.S1.C1.exampleMMXU_1.gse_inputs_Performance.sqNum = sqNum;
		if (D1Q1SB4.S1.C1.exampleMMXU_1.gse_inputs_Performance.datasetDecodeDone != NULL) {
			D1Q1SB4.S1.C1.exampleMMXU_1.gse_inputs_Performance.datasetDecodeDone(timeAllowedToLive, T, stNum, sqNum);
		}
	}
	if (gocbRefLength == 34 && strncmp((const char *) gocbRef, "E1Q1SB1C1/LLN0$GO$AnotherPositions", gocbRefLength) == 0) {
		if (stNum != D1Q1SB4.S1.C1.RSYNa_1.gse_inputs_AnotherPositions.stNum) {
			ber_decode_E1Q1SB1_C1_Positions(dataset, &D1Q1SB4.S1.C1.RSYNa_1.gse_inputs_AnotherPositions.E1Q1SB1_C1_Positions);
		}
		D1Q1SB4.S1.C1.RSYNa_1.gse_inputs_AnotherPositions.timeAllowedToLive = timeAllowedToLive;
		D1Q1SB4.S1.C1.RSYNa_1.gse_inputs_AnotherPositions.T = T;
		D1Q1SB4.S1.C1.RSYNa_1.gse_inputs_AnotherPositions.stNum = stNum;
		D1Q1SB4.S1.C1.RSYNa_1.gse_inputs_AnotherPositions.sqNum = sqNum;
		if (D1Q1SB4.S1.C1.RSYNa_1.gse_inputs_AnotherPositions.datasetDecodeDone != NULL) {
			D1Q1SB4.S1.C1.RSYNa_1.gse_inputs_AnotherPositions.datasetDecodeDone(timeAllowedToLive, T, stNum, sqNum);
		}
	}
	if (gocbRefLength == 30 && strncmp((const char *) gocbRef, "E1Q1SB1C1/LLN0$GO$ItlPositions", gocbRefLength) == 0) {
		if (stNum != D1Q1SB4.S1.C1.RSYNa_1.gse_inputs_ItlPositions.stNum) {
			ber_decode_E1Q1SB1_C1_Positions(dataset, &D1Q1SB4.S1.C1.RSYNa_1.gse_inputs_ItlPositions.E1Q1SB1_C1_Positions);
		}
		D1Q1SB4.S1.C1.RSYNa_1.gse_inputs_ItlPositions.timeAllowedToLive = timeAllowedToLive;
		D1Q1SB4.S1.C1.RSYNa_1.gse_inputs_ItlPositions.T = T;
		D1Q1SB4.S1.C1.RSYNa_1.gse_inputs_ItlPositions.stNum = stNum;
		D1Q1SB4.S1.C1.RSYNa_1.gse_inputs_ItlPositions.sqNum = sqNum;
		if (D1Q1SB4.S1.C1.RSYNa_1.gse_inputs_ItlPositions.datasetDecodeDone != NULL) {
			D1Q1SB4.S1.C1.RSYNa_1.gse_inputs_ItlPositions.datasetDecodeDone(timeAllowedToLive, T, stNum, sqNum);
		}
	}
}


