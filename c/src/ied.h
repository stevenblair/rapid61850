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

#ifndef IED_H
#define IED_H

#ifdef __cplusplus /* If this is a C++ compiler, use C linkage */
extern "C" {
#endif

#include "datatypes.h"
#include "sv.h"
#include "gse.h"


struct LE_IED_t {
	struct {
		struct {
			struct {
				struct IEC_61850_9_2LELLN0 LLN0;
				struct svControl MSVCB01;
				struct LE_IED_MUnn_PhsMeas1 MSVCB01_prev_dataset_values;	// additional storage for dataset's previous values
				struct svControl MSVCB02;
			} LN0;
			struct IEC_61850_9_2LETCTR IEC_61850_9_2LETCTR_1;
			struct IEC_61850_9_2LETCTR IEC_61850_9_2LETCTR_2;
			struct IEC_61850_9_2LETCTR IEC_61850_9_2LETCTR_3;
			struct IEC_61850_9_2LETCTR IEC_61850_9_2LETCTR_4;
			struct IEC_61850_9_2LETVTR IEC_61850_9_2LETVTR_1;
			struct IEC_61850_9_2LETVTR IEC_61850_9_2LETVTR_2;
			struct IEC_61850_9_2LETVTR IEC_61850_9_2LETVTR_3;
			struct IEC_61850_9_2LETVTR IEC_61850_9_2LETVTR_4;
			struct IEC_61850_9_2LETCTR IEC_61850_9_2LETCTR_5;
			struct IEC_61850_9_2LETCTR IEC_61850_9_2LETCTR_6;
			struct IEC_61850_9_2LETCTR IEC_61850_9_2LETCTR_7;
			struct IEC_61850_9_2LETCTR IEC_61850_9_2LETCTR_8;
			struct IEC_61850_9_2LETVTR IEC_61850_9_2LETVTR_5;
			struct IEC_61850_9_2LETVTR IEC_61850_9_2LETVTR_6;
			struct IEC_61850_9_2LETVTR IEC_61850_9_2LETVTR_7;
			struct IEC_61850_9_2LETVTR IEC_61850_9_2LETVTR_8;
		} MUnn;
	} S1;
};

struct LE_IED_RECV_t {
	struct {
		struct {
			struct {
				struct IEC_61850_9_2LELLN0 LLN0;
			} LN0;
			struct IEC_61850_9_2LETCTR IEC_61850_9_2LETCTR_1;
			struct IEC_61850_9_2LETCTR IEC_61850_9_2LETCTR_2;
			struct IEC_61850_9_2LETCTR IEC_61850_9_2LETCTR_3;
			struct IEC_61850_9_2LETCTR IEC_61850_9_2LETCTR_4;
			struct IEC_61850_9_2LETVTR IEC_61850_9_2LETVTR_1;
			struct IEC_61850_9_2LETVTR IEC_61850_9_2LETVTR_2;
			struct IEC_61850_9_2LETVTR IEC_61850_9_2LETVTR_3;
			struct IEC_61850_9_2LETVTR IEC_61850_9_2LETVTR_4;
		} MUnn;
	} S1;
};




extern struct LE_IED_t LE_IED;
extern struct LE_IED_RECV_t LE_IED_RECV;


#ifdef __cplusplus /* If this is a C++ compiler, end C linkage */
}
#endif

#endif
