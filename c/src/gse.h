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

#ifndef GSE_H
#define GSE_H

#ifdef __cplusplus /* If this is a C++ compiler, use C linkage */
extern "C" {
#endif

#include "gseEncode.h"
#include "gseDecode.h"
#include "gsePacketData.h"



void init_gse();
int gse_send_E1Q1SB1_C1_ItlPositions(unsigned char *buf, CTYPE_BOOLEAN statusChange, CTYPE_INT32U timeAllowedToLive);
int gse_send_E1Q1SB1_C1_AnotherPositions(unsigned char *buf, CTYPE_BOOLEAN statusChange, CTYPE_INT32U timeAllowedToLive);
int gse_send_D1Q1SB4_C1_SyckResult(unsigned char *buf, CTYPE_BOOLEAN statusChange, CTYPE_INT32U timeAllowedToLive);
int gse_send_D1Q1SB4_C1_MMXUResult(unsigned char *buf, CTYPE_BOOLEAN statusChange, CTYPE_INT32U timeAllowedToLive);
void gseDecode(unsigned char *buf, int len);




#ifdef __cplusplus /* If this is a C++ compiler, end C linkage */
}
#endif

#endif
