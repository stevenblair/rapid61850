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


#include "ctypes.h"
#if JSON_INTERFACE == 1

#ifndef JSON_DATABASE_H
#define JSON_DATABASE_H

#ifdef __cplusplus /* If this is a C++ compiler, use C linkage */
extern "C" {
#endif

#include <stdlib.h>
#include <string.h>
#include "mongoose.h"

/**
 * The basic data types defined in IEC 61850-7-2:2010, plus an identifier for constructed data types.
 */
typedef enum {
	BASIC_TYPE_CONSTRUCTED = 0,
	BASIC_TYPE_BOOLEAN,
	BASIC_TYPE_INT8,
	BASIC_TYPE_INT16,
	BASIC_TYPE_INT32,
	BASIC_TYPE_INT64,
	BASIC_TYPE_INT8U,
	BASIC_TYPE_INT16U,
	BASIC_TYPE_INT24U,
	BASIC_TYPE_INT32U,
	BASIC_TYPE_FLOAT32,
	BASIC_TYPE_FLOAT64, // not specified in IEC 61850-7-2:2010
	BASIC_TYPE_ENUMERATED,
	BASIC_TYPE_CODED_ENUM,
	BASIC_TYPE_OCTET_STRING,
	BASIC_TYPE_VISIBLE_STRING,
	BASIC_TYPE_UNICODE_STRING,
	BASIC_TYPE_CURRENCY
} BasicType;

typedef enum {
	TRIGGER_OPTION_NOT_SPECIFIED = 0,
	TRIGGER_OPTION_FALSE = 1,
	TRIGGER_OPTION_TRUE = 2
} TriggerOptionValue;

/**
 * A generic description of any data "item" in IEC 61850. Some fields are not needed for all data types.
 */
typedef struct Item {
	char *objectRef;
	BasicType type;
	char *typeSCL;
	void *data;			// a pointer to the data within the data model
	int numberOfItems;
	struct Item *items;
	char *lnClass;
	char *CDC;
	char *FC;
	TriggerOptionValue dchg;
	TriggerOptionValue qchg;
} Item;

void init_database();

void init_JSON_RPC(mg_handler_t handler, void *(*serve)(void *));

extern Item dataModelIndex;


#ifdef __cplusplus /* If this is a C++ compiler, end C linkage */
}
#endif

#endif

#endif
