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

#include "ctypes.h"
#include "datatypes.h"
#include "ied.h"
#include "svEncodeBasic.h"

// SV encoding of basic types
int ENCODE_CTYPE_FLOAT32(unsigned char *buf, CTYPE_FLOAT32 *value) {
	netmemcpy(buf, value, SV_GET_LENGTH_FLOAT32);

	return SV_GET_LENGTH_FLOAT32;
}
int ENCODE_CTYPE_FLOAT64(unsigned char *buf, CTYPE_FLOAT64 *value) {
	netmemcpy(buf, value, SV_GET_LENGTH_FLOAT64);

	return SV_GET_LENGTH_FLOAT64;
}
int ENCODE_CTYPE_QUALITY(unsigned char *buf, CTYPE_QUALITY *value) {
	netmemcpy(&buf[2], value, 2);			// assumes Quality is stored as 16-bit, but SV encoding is 32-bit

	return SV_GET_LENGTH_QUALITY;
}
int ENCODE_CTYPE_TIMESTAMP(unsigned char *buf, CTYPE_TIMESTAMP *value) {
	netmemcpy(buf, value, SV_GET_LENGTH_TIMESTAMP);

	return SV_GET_LENGTH_TIMESTAMP;
}
int ENCODE_CTYPE_ENUM(unsigned char *buf, CTYPE_ENUM *value) {	// assuming enum is an int - allows any enum type to be used
	netmemcpy(buf, value, SV_GET_LENGTH_ENUM);

	return SV_GET_LENGTH_ENUM;
}
int ENCODE_CTYPE_INT8(unsigned char *buf, CTYPE_INT8 *value) {
	netmemcpy(buf, value, SV_GET_LENGTH_INT8);

	return SV_GET_LENGTH_INT8;
}
int ENCODE_CTYPE_INT16(unsigned char *buf, CTYPE_INT16 *value) {
	netmemcpy(buf, value, SV_GET_LENGTH_INT16);

	return SV_GET_LENGTH_INT16;
}
int ENCODE_CTYPE_INT32(unsigned char *buf, CTYPE_INT32 *value) {
	netmemcpy(buf, value, SV_GET_LENGTH_INT32);

	return SV_GET_LENGTH_INT32;
}
int ENCODE_CTYPE_INT16U(unsigned char *buf, CTYPE_INT16U *value) {
	netmemcpy(buf, value, SV_GET_LENGTH_INT16U);

	return SV_GET_LENGTH_INT16U;
}
int ENCODE_CTYPE_INT32U(unsigned char *buf, CTYPE_INT32U *value) {
	netmemcpy(buf, value, SV_GET_LENGTH_INT32U);

	return SV_GET_LENGTH_INT32U;
}
int ENCODE_CTYPE_VISSTRING255(unsigned char *buf, CTYPE_VISSTRING255 *value) {
	netmemcpy(buf, value, SV_GET_LENGTH_VISSTRING255);

	return SV_GET_LENGTH_VISSTRING255;
}
int ENCODE_CTYPE_BOOLEAN(unsigned char *buf, CTYPE_BOOLEAN *value) {
	netmemcpy(buf, value, SV_GET_LENGTH_BOOLEAN);

	return SV_GET_LENGTH_BOOLEAN;
}
int ENCODE_CTYPE_DBPOS(unsigned char *buf, CTYPE_DBPOS *value) {
	netmemcpy(buf, value, SV_GET_LENGTH_DBPOS);

	return SV_GET_LENGTH_DBPOS;
}
