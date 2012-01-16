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

#ifndef GSE_PACKET_DATA_H
#define GSE_PACKET_DATA_H

#ifdef __cplusplus /* If this is a C++ compiler, use C linkage */
extern "C" {
#endif

#include <stdlib.h>
#include <string.h>
#include "ctypes.h"

struct gseControl {
	struct ethHeaderData ethHeaderData;
	unsigned char *gocbRef;						// <IEDname><LDinst>/LLN0$<GSEControl.name> e.g. "E1Q1SB1C1/LLN0$ItlPositions"
	CTYPE_INT32U timeAllowedToLive;
	unsigned char *datSet;						// <IEDname><LDinst>/LLN0$<DataSet.name> e.g. "E1Q1SB1C1/LLN0$Positions"
	unsigned char *goID;						// optional
	CTYPE_TIMESTAMP t;
	CTYPE_INT32U stNum;
	CTYPE_INT32U sqNum;
	CTYPE_BOOLEAN test;
	CTYPE_INT32U confRev;
	CTYPE_BOOLEAN ndsCom;
	CTYPE_INT32U numDatSetEntries;
	CTYPE_INT32U minTime;						// stored in milliseconds
	CTYPE_INT32U maxTime;						// stored in milliseconds
	int (*encodeDataset)(unsigned char *buf);	// function pointer to dataset-specific encoder
	int (*getDatasetLength)();					// function pointer to dataset-specific getLength function
};

#ifdef __cplusplus /* If this is a C++ compiler, end C linkage */
}
#endif

#endif
