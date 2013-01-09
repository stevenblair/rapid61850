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

#ifndef INTERFACE_H_
#define INTERFACE_H_

#include "iec61850.h"
#include "interfaceSendPacket.h"

//#if HIGH_LEVEL_INTERFACE == 1

#ifdef _WIN32
	#define WPCAP
	#define HAVE_REMOTE
	#define WIN32_LEAN_AND_MEAN
#endif
#include <pcap.h>

extern unsigned char bufIn[2048];
extern unsigned char bufOut[2048];

extern pcap_t *fp;

void start();
void stop();
int readPacket();

//#endif

#endif /* INTERFACE_H_ */
