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


// data objects
struct ud {
	CTYPE_INT8 LNName;
	CTYPE_INT8 DataSetName;
	CTYPE_INT16 LDName;
	CTYPE_INT16 phsaTCTRrated;
	CTYPE_INT16 neutTCTRrated;
	CTYPE_INT16 phsaTVTRrated;
	CTYPE_INT16 Tdr;
	CTYPE_INT16 phsaTCTR;
	CTYPE_INT16 phsbTCTR;
	CTYPE_INT16 phscTCTR;
	CTYPE_INT16 neutTCTR;
	CTYPE_INT16 phsaTCTR1;
	CTYPE_INT16 phsbTCTR1;
	CTYPE_INT16 phscTCTR1;
	CTYPE_INT16 phsaTVTR;
	CTYPE_INT16 phsbTVTR;
	CTYPE_INT16 phscTVTR;
	CTYPE_INT16 neutTVTR;
	CTYPE_INT16 bbTVTR;
	CTYPE_INT16 statusWord1;
	CTYPE_INT16 statusWord2;
	CTYPE_INT16 samplingRate;
	CTYPE_INT8 ConfigurationRevisionNumber;
};
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

// datasets
struct Send_D1_ud {
	struct ud D1__GGIO_1_ud;
};

// logical nodes
struct LN0 {
	struct myMod Mod;
	struct myHealth Health;
	struct myBeh Beh;
	struct myLPL NamPlt;
};
struct sendUD {
	struct ud ud;
};
struct recvUD {
	struct ud ud;
	struct {
		struct Send_D1_ud Send_D1_ud[16];
		void (*datasetDecodeDone)(CTYPE_INT16U smpCnt);
		CTYPE_INT16U smpCnt;
	} sv_inputs_udCB;
};

void init_datatypes();




#ifdef __cplusplus /* If this is a C++ compiler, end C linkage */
}
#endif

#endif
