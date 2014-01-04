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

#ifndef JSON_DATABASE_H
#define JSON_DATABASE_H

#ifdef __cplusplus /* If this is a C++ compiler, use C linkage */
extern "C" {
#endif

typedef enum {
	BASIC_TYPE_COMPOUND = 0,
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
	BASIC_TYPE_FLOAT64,
	BASIC_TYPE_ENUMERATED,
	BASIC_TYPE_CODED_ENUM,
	BASIC_TYPE_OCTET_STRING,
	BASIC_TYPE_VISIBLE_STRING,
	BASIC_TYPE_UNICODE_STRING,
	BASIC_TYPE_CURRENCY
} BasicType;

typedef struct Item {
	char *objectRef;
	BasicType type;
	void *data;	// TODO a pointer to the data JSON encoding/decoding functions? Either encode compound, or an actual data type (int, float, etc.)
	int numberOfItems;
	struct Item *items;
} Item;

void init_database();

extern Item database;


#ifdef __cplusplus /* If this is a C++ compiler, end C linkage */
}
#endif

#endif
