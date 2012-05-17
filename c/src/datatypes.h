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

#ifndef DATATYPES_H
#define DATATYPES_H

#ifdef __cplusplus /* If this is a C++ compiler, use C linkage */
extern "C" {
#endif

#include "ctypes.h"


// enums
enum ACDdir {
	ACDDIR_UNKNOWN = 0,
	ACDDIR_FORWARD = 1,
	ACDDIR_BACKWARD = 2,
	ACDDIR_BOTH = 3
};
enum seqT {
	SEQT_POS_NEG_ZERO = 0,
	SEQT_DIR_QUAD_ZERO = 1
};
enum Dbpos {
	DBPOS_INTERMEDIATE = 0,
	DBPOS_OFF = 1,
	DBPOS_ON = 2,
	DBPOS_BAD = 3
};
enum Tcmd {
	TCMD_STOP = 0,
	TCMD_LOWER = 1,
	TCMD_HIGHER = 2,
	TCMD_RESERVED = 3
};
enum Beh {
	BEH_ON = 1,
	BEH_BLOCKED = 2,
	BEH_TEST = 3,
	BEH_TEST_BLOCKED = 4,
	BEH_OFF = 5
};
enum Mod {
	MOD_ON = 1,
	MOD_BLOCKED = 2,
	MOD_TEST = 3,
	MOD_TEST_BLOCKED = 4,
	MOD_OFF = 5
};
enum Health {
	HEALTH_OK = 1,
	HEALTH_WARNING = 2,
	HEALTH_ALARM = 3
};

// data attributes
struct myAnalogValue {
	CTYPE_FLOAT32 f;
};
struct ScaledValueConfig {
	CTYPE_FLOAT32 scaleFactor;
	CTYPE_FLOAT32 offset;
};
struct myVector {
	struct myAnalogValue mag;
	struct myAnalogValue ang;
};
struct simpleVector {
	struct myAnalogValue mag;
	struct myAnalogValue ang;
};

// data objects
struct myMod {
	enum Mod ctlVal;
	enum Mod stVal;
	CTYPE_QUALITY q;
	CTYPE_TIMESTAMP t;
};
struct myHealth {
	enum Health stVal;
};
struct myBeh {
	enum Beh stVal;
};
struct myINS {
	CTYPE_INT32 stVal;
};
struct myLPL {
	CTYPE_VISSTRING255 ldNs;
	CTYPE_VISSTRING255 configRev;
};
struct myDPL {
	CTYPE_VISSTRING255 vendor;
	CTYPE_VISSTRING255 hwRev;
};
struct myPos {
	CTYPE_DBPOS stVal;
	CTYPE_QUALITY q;
	CTYPE_TIMESTAMP t;
	CTYPE_BOOLEAN ctlVal;
};
struct mySPS {
	CTYPE_INT32 stVal;
	CTYPE_QUALITY q;
	CTYPE_TIMESTAMP t;
};
struct myMV {
	struct myAnalogValue mag;
	CTYPE_QUALITY q;
	CTYPE_TIMESTAMP t;
	struct ScaledValueConfig sVC;
	CTYPE_INT32 int1;
	CTYPE_INT32 int2;
	CTYPE_INT32 int3;
};
struct simpleMV {
	CTYPE_FLOAT32 mag;
	CTYPE_QUALITY q;
	CTYPE_TIMESTAMP t;
	struct ScaledValueConfig sVC;
};
struct simpleCMV {
	struct mySPS testSecondLayerSDO;
	struct simpleVector cVal;
	CTYPE_QUALITY q;
	CTYPE_TIMESTAMP t;
	CTYPE_INT32 testInteger;
	CTYPE_BOOLEAN testBoolean;
};
struct simpleWYE {
	struct simpleCMV phsA;
	struct simpleCMV phsB;
	struct simpleCMV phsC;
};
struct myCMV {
	struct myVector cVal;
	CTYPE_QUALITY q;
	CTYPE_TIMESTAMP t;
};
struct mySEQ {
	struct myCMV c1;
	struct myCMV c2;
	struct myCMV c3;
	enum seqT seqT;
};
struct mySAV {
	struct myAnalogValue instMag;
	CTYPE_QUALITY q;
};
struct simpleSAV {
	struct myAnalogValue instMag;
	CTYPE_QUALITY q;
};

// datasets
struct E1Q1SB1_C1_Performance {
	struct myMV C1_MMXU_1_Amps;
	struct myMV C1_MMXU_1_Volts;
};
struct E1Q1SB1_C1_Positions {
	struct myAnalogValue C1_TVTR_1_Vol_instMag;
	struct myPos C1_CSWI_1_Pos;
	struct myPos C1_CSWI_2_Pos;
	enum Mod C1_MMXU_1_Mod_stVal;
};
struct E1Q1SB1_C1_Measurands {
	struct myAnalogValue C1_TVTR_1_Vol_instMag;
};
struct E1Q1SB1_C1_smv {
	struct myAnalogValue C1_TVTR_1_Vol_instMag;
	struct myMod C1_CSWI_1_Mod;
	enum Mod C1_MMXU_1_Mod_stVal;
};
struct E1Q1SB1_C1_rmxu {
	struct simpleSAV C1_RMXU_1_AmpLocPhsA;
	struct simpleSAV C1_RMXU_1_AmpLocPhsB;
	struct simpleSAV C1_RMXU_1_AmpLocPhsC;
};
struct D1Q1SB4_C1_SyckResult {
	struct mySPS C1_RSYN_1_Rel;
};
struct D1Q1SB4_C1_MMXUResult {
	struct simpleWYE C1_MMXU_1_A;
};

// logical nodes
struct LN0 {
	struct myMod Mod;
	struct myHealth Health;
	struct myBeh Beh;
	struct myLPL NamPlt;
};
struct LPHDa {
	struct myMod Mod;
	struct myHealth Health;
	struct myBeh Beh;
	struct myLPL NamPlt;
	struct myDPL PhyNam;
	struct myINS PhyHealth;
	struct mySPS Proxy;
	struct {
		struct E1Q1SB1_C1_smv E1Q1SB1_C1_smv[2];
		void (*datasetDecodeDone)(CTYPE_INT16U smpCnt);
		CTYPE_INT16U smpCnt;
	} sv_inputs_Volt;
};
struct CSWIa {
	struct myMod Mod;
	struct myHealth Health;
	struct myBeh Beh;
	struct myPos Pos;
	struct mySPS GrpAl;
};
struct MMXUa {
	struct myMod Mod;
	struct myHealth Beh;
	struct myBeh Health;
	struct myMV Amps;
	struct myMV Volts;
};
struct exampleMMXU {
	struct myMod Mod;
	struct myHealth Beh;
	struct myBeh Health;
	struct simpleWYE A;
	struct {
		struct E1Q1SB1_C1_rmxu E1Q1SB1_C1_rmxu[16];
		void (*datasetDecodeDone)(CTYPE_INT16U smpCnt);
		CTYPE_INT16U smpCnt;
	} sv_inputs_rmxuCB;
	struct {
		struct E1Q1SB1_C1_Performance E1Q1SB1_C1_Performance;
		void (*datasetDecodeDone)(CTYPE_INT16U smpCnt);
		CTYPE_INT16U smpCnt;
	} sv_inputs_PerformanceSV;
	struct {
		struct E1Q1SB1_C1_Performance E1Q1SB1_C1_Performance;
		void (*datasetDecodeDone)(CTYPE_INT32U timeAllowedToLive, CTYPE_TIMESTAMP T, CTYPE_INT32U stNum, CTYPE_INT32U sqNum);
		CTYPE_INT32U timeAllowedToLive;
		CTYPE_TIMESTAMP T;
		CTYPE_INT32U stNum;
		CTYPE_INT32U sqNum;
	} gse_inputs_Performance;
};
struct exampleRMXU {
	struct myMod Mod;
	struct myHealth Beh;
	struct myBeh Health;
	struct simpleSAV AmpLocPhsA;
	struct simpleSAV AmpLocPhsB;
	struct simpleSAV AmpLocPhsC;
};
struct CILOa {
	struct myHealth Mod;
	struct myBeh Beh;
	struct myINS Health;
	struct mySPS EnaOpen;
	struct mySPS EnaClose;
};
struct TVTRa {
	struct myMod Mod;
	struct myHealth Health;
	struct myBeh Beh;
	struct mySAV Vol;
};
struct RSYNa {
	struct myMod Mod;
	struct myHealth Health;
	struct myBeh Beh;
	struct myLPL NamPlt;
	struct mySPS Rel;
	struct {
		struct E1Q1SB1_C1_smv E1Q1SB1_C1_smv[2];
		void (*datasetDecodeDone)(CTYPE_INT16U smpCnt);
		CTYPE_INT16U smpCnt;
	} sv_inputs_Volt;
	struct {
		struct E1Q1SB1_C1_Positions E1Q1SB1_C1_Positions;
		void (*datasetDecodeDone)(CTYPE_INT32U timeAllowedToLive, CTYPE_TIMESTAMP T, CTYPE_INT32U stNum, CTYPE_INT32U sqNum);
		CTYPE_INT32U timeAllowedToLive;
		CTYPE_TIMESTAMP T;
		CTYPE_INT32U stNum;
		CTYPE_INT32U sqNum;
	} gse_inputs_AnotherPositions;
	struct {
		struct E1Q1SB1_C1_Positions E1Q1SB1_C1_Positions;
		void (*datasetDecodeDone)(CTYPE_INT32U timeAllowedToLive, CTYPE_TIMESTAMP T, CTYPE_INT32U stNum, CTYPE_INT32U sqNum);
		CTYPE_INT32U timeAllowedToLive;
		CTYPE_TIMESTAMP T;
		CTYPE_INT32U stNum;
		CTYPE_INT32U sqNum;
	} gse_inputs_ItlPositions;
};

void init_datatypes();




#ifdef __cplusplus /* If this is a C++ compiler, end C linkage */
}
#endif

#endif
