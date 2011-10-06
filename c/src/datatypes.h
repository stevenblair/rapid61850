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

#ifndef DATATYPES_H
#define DATATYPES_H

#ifdef __cplusplus /* If this is a C++ compiler, use C linkage */
extern "C" {
#endif

#include "ctypes.h"

// enums
enum ACDdir {
	ACDDIR_UNKNOWN,
	ACDDIR_FORWARD,
	ACDDIR_BACKWARD,
	ACDDIR_BOTH
};
enum seqT {
	SEQT_POS_NEG_ZERO,
	SEQT_DIR_QUAD_ZERO
};
enum Dbpos {
	DBPOS_INTERMEDIATE,
	DBPOS_OFF,
	DBPOS_ON,
	DBPOS_BAD
};
enum Tcmd {
	TCMD_STOP,
	TCMD_LOWER,
	TCMD_HIGHER,
	TCMD_RESERVED
};
enum Beh {
	BEH_ON,
	BEH_BLOCKED,
	BEH_TEST,
	BEH_TEST_BLOCKED,
	BEH_OFF
};
enum Mod {
	MOD_ON,
	MOD_BLOCKED,
	MOD_TEST,
	MOD_TEST_BLOCKED,
	MOD_OFF
};
enum Health {
	HEALTH_OK,
	HEALTH_WARNING,
	HEALTH_ALARM
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
};
struct simpleMV {
	CTYPE_FLOAT32 mag;
	CTYPE_QUALITY q;
	CTYPE_TIMESTAMP t;
	struct ScaledValueConfig sVC;
};
struct simpleCMV {
	struct simpleVector cVal;
	CTYPE_QUALITY q;
	CTYPE_TIMESTAMP t;
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
		struct myAnalogValue instMag_1[2];
		struct myMod Mod_1[2];
		enum Mod stVal_1[2];
		CTYPE_QUALITY q_1[2];
		struct myMV Amps_1[2];
		struct myPos Pos_2[2];
	} sv_inputs;
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
		struct simpleSAV AmpLocPhsA_1[16];
		struct simpleSAV AmpLocPhsB_1[16];
		struct simpleSAV AmpLocPhsC_1[16];
	} sv_inputs;
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
		struct myAnalogValue instMag_1[2];
		struct myMod Mod_1[2];
		enum Mod stVal_1[2];
		CTYPE_QUALITY q_1[2];
		struct myMV Amps_1[2];
		struct myPos Pos_2[2];
	} sv_inputs;
	struct {
		struct myAnalogValue instMag_1;
		struct myPos Pos_1;
		struct myPos Pos_2;
		enum Mod stVal_1;
		struct myMV Amps_1;
		struct myMV Volts_1;
	} gse_inputs;
};

void init_datatypes();




#ifdef __cplusplus /* If this is a C++ compiler, end C linkage */
}
#endif

#endif
