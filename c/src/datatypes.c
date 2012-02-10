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

#include <stdlib.h>
#include "ctypes.h"
#include "datatypes.h"
#include "ied.h"





void init_myAnalogValue(struct myAnalogValue *myAnalogValue) {
	myAnalogValue->f = 1.024;
}
void init_ScaledValueConfig(struct ScaledValueConfig *ScaledValueConfig) {
}
void init_myVector(struct myVector *myVector) {
}
void init_simpleVector(struct simpleVector *simpleVector) {
}
void init_myMod(struct myMod *myMod) {
}
void init_myHealth(struct myHealth *myHealth) {
}
void init_myBeh(struct myBeh *myBeh) {
}
void init_myINS(struct myINS *myINS) {
}
void init_myLPL(struct myLPL *myLPL) {
	if (myLPL->ldNs != NULL) {
		free(myLPL->ldNs);
	}
	myLPL->ldNs = (CTYPE_VISSTRING255) malloc(18);
	strncpy(myLPL->ldNs, "IEC61850-7-4:2003\0", 18);
	if (myLPL->configRev != NULL) {
		free(myLPL->configRev);
	}
	myLPL->configRev = (CTYPE_VISSTRING255) malloc(9);
	strncpy(myLPL->configRev, "Rev 3.45\0", 9);
}
void init_myDPL(struct myDPL *myDPL) {
	if (myDPL->vendor != NULL) {
		free(myDPL->vendor);
	}
	myDPL->vendor = (CTYPE_VISSTRING255) malloc(13);
	strncpy(myDPL->vendor, "myVendorName\0", 13);
	if (myDPL->hwRev != NULL) {
		free(myDPL->hwRev);
	}
	myDPL->hwRev = (CTYPE_VISSTRING255) malloc(9);
	strncpy(myDPL->hwRev, "Rev 1.23\0", 9);
}
void init_myPos(struct myPos *myPos) {
}
void init_mySPS(struct mySPS *mySPS) {
	mySPS->stVal = 178;
}
void init_myMV(struct myMV *myMV) {
}
void init_simpleMV(struct simpleMV *simpleMV) {
}
void init_simpleCMV(struct simpleCMV *simpleCMV) {
	simpleCMV->testInteger = -1234;
	simpleCMV->testBoolean = 1;
}
void init_simpleWYE(struct simpleWYE *simpleWYE) {
}
void init_myCMV(struct myCMV *myCMV) {
}
void init_mySEQ(struct mySEQ *mySEQ) {
}
void init_mySAV(struct mySAV *mySAV) {
}
void init_simpleSAV(struct simpleSAV *simpleSAV) {
}
void init_datatypes() {
	init_myLPL(&E1Q1SB1.S1.C1.LN0.LLN0.NamPlt);
	init_myLPL(&E1Q1SB1.S1.C1.LN0.LLN0.NamPlt);
	init_myLPL(&E1Q1SB1.S1.C1.LN0.LLN0.NamPlt);
	init_myLPL(&E1Q1SB1.S1.C1.LN0.LLN0.NamPlt);
	init_myLPL(&E1Q1SB1.S1.C1.LN0.LLN0.NamPlt);
	init_myAnalogValue(&E1Q1SB1.S1.C1.exampleRMXU_1.AmpLocPhsA.instMag);
	init_myAnalogValue(&E1Q1SB1.S1.C1.exampleRMXU_1.AmpLocPhsB.instMag);
	init_myAnalogValue(&E1Q1SB1.S1.C1.exampleRMXU_1.AmpLocPhsC.instMag);
	init_myLPL(&E1Q1SB1.S1.C1.LPHDa_1.NamPlt);
	init_myDPL(&E1Q1SB1.S1.C1.LPHDa_1.PhyNam);
	init_mySPS(&E1Q1SB1.S1.C1.LPHDa_1.Proxy);
	E1Q1SB1.S1.C1.LPHDa_1.Proxy.stVal = 17;
	if (E1Q1SB1.S1.C1.LPHDa_1.PhyNam.hwRev != NULL) {
		free(E1Q1SB1.S1.C1.LPHDa_1.PhyNam.hwRev);
	}
	E1Q1SB1.S1.C1.LPHDa_1.PhyNam.hwRev = (CTYPE_VISSTRING255) malloc(19);
	strncpy(E1Q1SB1.S1.C1.LPHDa_1.PhyNam.hwRev, "replacement string\0", 19);
	init_mySPS(&E1Q1SB1.S1.C1.CSWIa_1.GrpAl);
	init_mySPS(&E1Q1SB1.S1.C1.CSWIa_2.GrpAl);
	init_myAnalogValue(&E1Q1SB1.S1.C1.MMXUa_1.Amps.mag);
	init_myAnalogValue(&E1Q1SB1.S1.C1.MMXUa_1.Volts.mag);
	E1Q1SB1.S1.C1.MMXUa_1.Volts.sVC.offset = 10;
	E1Q1SB1.S1.C1.MMXUa_1.Volts.sVC.scaleFactor = 200;
	init_myAnalogValue(&E1Q1SB1.S1.C1.TVTRa_1.Vol.instMag);
	init_myLPL(&D1Q1SB4.S1.C1.LN0.LLN0.NamPlt);
	init_myLPL(&D1Q1SB4.S1.C1.LN0.LLN0.NamPlt);
	init_simpleCMV(&D1Q1SB4.S1.C1.exampleMMXU_1.A.phsA);
	init_mySPS(&D1Q1SB4.S1.C1.exampleMMXU_1.A.phsA.testSecondLayerSDO);
	init_simpleCMV(&D1Q1SB4.S1.C1.exampleMMXU_1.A.phsB);
	init_mySPS(&D1Q1SB4.S1.C1.exampleMMXU_1.A.phsB.testSecondLayerSDO);
	init_simpleCMV(&D1Q1SB4.S1.C1.exampleMMXU_1.A.phsC);
	init_mySPS(&D1Q1SB4.S1.C1.exampleMMXU_1.A.phsC.testSecondLayerSDO);
	D1Q1SB4.S1.C1.exampleMMXU_1.A.phsA.cVal.mag.f = 7.54;
	init_myLPL(&D1Q1SB4.S1.C1.LPHDa_1.NamPlt);
	init_myDPL(&D1Q1SB4.S1.C1.LPHDa_1.PhyNam);
	init_mySPS(&D1Q1SB4.S1.C1.LPHDa_1.Proxy);
	D1Q1SB4.S1.C1.LPHDa_1.Proxy.stVal = 49;
	init_myLPL(&D1Q1SB4.S1.C1.RSYNa_1.NamPlt);
	init_mySPS(&D1Q1SB4.S1.C1.RSYNa_1.Rel);
}

