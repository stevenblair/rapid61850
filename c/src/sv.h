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

#ifndef SV_H
#define SV_H

#ifdef __cplusplus /* If this is a C++ compiler, use C linkage */
extern "C" {
#endif

#include "svEncode.h"
#include "svDecode.h"
#include "svPacketData.h"



void init_sv();
int sv_update_Volt_11(unsigned char *buf);
int sv_update_rmxuCB_rmxu(unsigned char *buf);
void svDecode(unsigned char *buf, int len);


extern struct svData Volt_11;
extern struct svData rmxuCB_rmxu;


#ifdef __cplusplus /* If this is a C++ compiler, end C linkage */
}
#endif

#endif
