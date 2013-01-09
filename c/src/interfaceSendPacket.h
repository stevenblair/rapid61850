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

#ifndef INTERFACE_SEND_PACKET_H
#define INTERFACE_SEND_PACKET_H

#ifdef __cplusplus /* If this is a C++ compiler, use C linkage */
extern "C" {
#endif

#include "iec61850.h"
#include "interface.h"




int interface_sv_update_E1Q1SB1_C1_PerformanceSV();
int interface_gse_send_E1Q1SB1_C1_Performance(int statusChange, int timeAllowedToLive);
int interface_gse_send_E1Q1SB1_C1_ItlPositions(int statusChange, int timeAllowedToLive);
int interface_gse_send_E1Q1SB1_C1_AnotherPositions(int statusChange, int timeAllowedToLive);
int interface_sv_update_E1Q1SB1_C1_Volt();
int interface_sv_update_E1Q1SB1_C1_rmxuCB();
int interface_gse_send_D1Q1SB4_C1_SyckResult(int statusChange, int timeAllowedToLive);
int interface_gse_send_D1Q1SB4_C1_MMXUResult(int statusChange, int timeAllowedToLive);




#ifdef __cplusplus /* If this is a C++ compiler, end C linkage */
}
#endif

#endif
