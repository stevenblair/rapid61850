/**
 * Rapid-prototyping protection schemes with IEC 61850
 *
 * Copyright (c) 2014 Steven Blair
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

// data attributes
struct IEC_61850_9_2LEAV {
	CTYPE_INT32 i;
};
struct IEC_61850_9_2LEsVCAmp {
	CTYPE_FLOAT32 scaleFactor;
	CTYPE_FLOAT32 offset;
};
struct IEC_61850_9_2LEsVCVol {
	CTYPE_FLOAT32 scaleFactor;
	CTYPE_FLOAT32 offset;
};

// data objects
struct IEC_61850_9_2LESAVAmp {
	struct IEC_61850_9_2LEAV instMag;
	CTYPE_QUALITY q;
	struct IEC_61850_9_2LEsVCAmp sVC;
};
struct IEC_61850_9_2LESAVVol {
	struct IEC_61850_9_2LEAV instMag;
	CTYPE_QUALITY q;
	struct IEC_61850_9_2LEsVCVol sVC;
};
struct IEC_61850_9_2LEINC {
	CTYPE_INT32 ctlVal;
	CTYPE_INT32 stVal;
	CTYPE_QUALITY q;
	CTYPE_TIMESTAMP t;
};

// datasets
struct LE_IED_MUnn_PhsMeas1 {
	struct IEC_61850_9_2LEAV MUnn_TCTR_1_Amp_instMag;
	CTYPE_QUALITY MUnn_TCTR_1_Amp_q;
	struct IEC_61850_9_2LEAV MUnn_TCTR_2_Amp_instMag;
	CTYPE_QUALITY MUnn_TCTR_2_Amp_q;
	struct IEC_61850_9_2LEAV MUnn_TCTR_3_Amp_instMag;
	CTYPE_QUALITY MUnn_TCTR_3_Amp_q;
	struct IEC_61850_9_2LEAV MUnn_TCTR_4_Amp_instMag;
	CTYPE_QUALITY MUnn_TCTR_4_Amp_q;
	struct IEC_61850_9_2LEAV MUnn_TVTR_1_Vol_instMag;
	CTYPE_QUALITY MUnn_TVTR_1_Vol_q;
	struct IEC_61850_9_2LEAV MUnn_TVTR_2_Vol_instMag;
	CTYPE_QUALITY MUnn_TVTR_2_Vol_q;
	struct IEC_61850_9_2LEAV MUnn_TVTR_3_Vol_instMag;
	CTYPE_QUALITY MUnn_TVTR_3_Vol_q;
	struct IEC_61850_9_2LEAV MUnn_TVTR_4_Vol_instMag;
	CTYPE_QUALITY MUnn_TVTR_4_Vol_q;
};
struct LE_IED_MUnn_PhsMeas2 {
	struct IEC_61850_9_2LEAV MUnn_TCTR_5_Amp_instMag;
	CTYPE_QUALITY MUnn_TCTR_5_Amp_q;
	struct IEC_61850_9_2LEAV MUnn_TCTR_6_Amp_instMag;
	CTYPE_QUALITY MUnn_TCTR_6_Amp_q;
	struct IEC_61850_9_2LEAV MUnn_TCTR_7_Amp_instMag;
	CTYPE_QUALITY MUnn_TCTR_7_Amp_q;
	struct IEC_61850_9_2LEAV MUnn_TCTR_8_Amp_instMag;
	CTYPE_QUALITY MUnn_TCTR_8_Amp_q;
	struct IEC_61850_9_2LEAV MUnn_TVTR_5_Vol_instMag;
	CTYPE_QUALITY MUnn_TVTR_5_Vol_q;
	struct IEC_61850_9_2LEAV MUnn_TVTR_6_Vol_instMag;
	CTYPE_QUALITY MUnn_TVTR_6_Vol_q;
	struct IEC_61850_9_2LEAV MUnn_TVTR_7_Vol_instMag;
	CTYPE_QUALITY MUnn_TVTR_7_Vol_q;
	struct IEC_61850_9_2LEAV MUnn_TVTR_8_Vol_instMag;
	CTYPE_QUALITY MUnn_TVTR_8_Vol_q;
};

// logical nodes
struct IEC_61850_9_2LELLN0 {
	struct IEC_61850_9_2LEINC Mod;
};
struct IEC_61850_9_2LETCTR {
	struct IEC_61850_9_2LESAVAmp Amp;
	struct {
		struct LE_IED_MUnn_PhsMeas1 LE_IED_MUnn_PhsMeas1[6];
		void (*datasetDecodeDone)(CTYPE_INT16U smpCnt);
		CTYPE_INT16U smpCnt;
	} sv_inputs_MSVCB01;
	struct {
		struct LE_IED_MUnn_PhsMeas2 LE_IED_MUnn_PhsMeas2;
		void (*datasetDecodeDone)(CTYPE_INT16U smpCnt);
		CTYPE_INT16U smpCnt;
	} sv_inputs_MSVCB02;
};
struct IEC_61850_9_2LETVTR {
	struct IEC_61850_9_2LESAVVol Vol;
};

void init_datatypes();




#ifdef __cplusplus /* If this is a C++ compiler, end C linkage */
}
#endif

#endif
