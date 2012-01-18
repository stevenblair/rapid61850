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

#ifndef IED_H
#define IED_H

#ifdef __cplusplus /* If this is a C++ compiler, use C linkage */
extern "C" {
#endif

#include "datatypes.h"
#include "sv.h"
#include "gse.h"

struct Send {
	struct {
		struct {
			struct {
				struct LN0 LLN0;
				struct svControl udCB;
			} LN0;
			struct sendUD sendUD_1;
		} D1;
	} S1;
};

struct Recv {
	struct {
		struct {
			struct {
				struct LN0 LLN0;
			} LN0;
			struct recvUD recvUD_1;
		} D1;
	} S1;
};




extern struct Send Send;
extern struct Recv Recv;


#ifdef __cplusplus /* If this is a C++ compiler, end C linkage */
}
#endif

#endif
