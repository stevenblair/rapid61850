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

#ifndef SV_DECODE_H
#define SV_DECODE_H

#ifdef __cplusplus /* If this is a C++ compiler, use C linkage */
extern "C" {
#endif

#include "svPacketData.h"




int decode_E1Q1SB1_C1_Performance(unsigned char *buf, CTYPE_INT16U smpCnt, struct E1Q1SB1_C1_Performance *E1Q1SB1_C1_Performance);
int decode_E1Q1SB1_C1_Positions(unsigned char *buf, CTYPE_INT16U smpCnt, struct E1Q1SB1_C1_Positions *E1Q1SB1_C1_Positions);
int decode_E1Q1SB1_C1_Measurands(unsigned char *buf, CTYPE_INT16U smpCnt, struct E1Q1SB1_C1_Measurands *E1Q1SB1_C1_Measurands);
int decode_E1Q1SB1_C1_smv(unsigned char *buf, CTYPE_INT16U smpCnt, struct E1Q1SB1_C1_smv *E1Q1SB1_C1_smv);
int decode_E1Q1SB1_C1_rmxu(unsigned char *buf, CTYPE_INT16U smpCnt, struct E1Q1SB1_C1_rmxu *E1Q1SB1_C1_rmxu);
int decode_D1Q1SB4_C1_SyckResult(unsigned char *buf, CTYPE_INT16U smpCnt, struct D1Q1SB4_C1_SyckResult *D1Q1SB4_C1_SyckResult);
int decode_D1Q1SB4_C1_MMXUResult(unsigned char *buf, CTYPE_INT16U smpCnt, struct D1Q1SB4_C1_MMXUResult *D1Q1SB4_C1_MMXUResult);

void svDecodeDataset(unsigned char *dataset, int datasetLength, int ASDU, unsigned char *svID, int svIDLength, CTYPE_INT16U smpCnt);



#ifdef __cplusplus /* If this is a C++ compiler, end C linkage */
}
#endif

#endif
