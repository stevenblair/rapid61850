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

#ifndef GSE_BER_ENCODE_BASIC_C
#define GSE_BER_ENCODE_BASIC_C

#include "ctypes.h"
#include "datatypes.h"
#include "ied.h"
#include "gseEncodeBasic.h"

// BER encoding of basic types
int BER_ENCODE_CTYPE_FLOAT32(unsigned char *buf, CTYPE_FLOAT32 *value) {
	CTYPE_INT16U offset = 0;
	CTYPE_INT16U len = BER_GET_LENGTH_CTYPE_FLOAT32(value);

	buf[offset++] = ASN1_TAG_FLOATING_POINT;
	offset += encodeLength(&buf[offset], len);

	buf[offset++] = 0x08;	// bits for exponent
	netmemcpy(&buf[offset], value, len - 1);

	return offset + len - 1;
}
int BER_ENCODE_CTYPE_FLOAT64(unsigned char *buf, CTYPE_FLOAT64 *value) {
	CTYPE_INT16U offset = 0;
	CTYPE_INT16U len = BER_GET_LENGTH_CTYPE_FLOAT64(value);

	buf[offset++] = ASN1_TAG_FLOATING_POINT;
	offset += encodeLength(&buf[offset], len);

	buf[offset++] = 0x0B;	// bits for exponent
	netmemcpy(&buf[offset], value, len - 1);

	return offset + len - 1;
}

int BER_ENCODE_CTYPE_QUALITY(unsigned char *buf, CTYPE_QUALITY *value) {
	CTYPE_INT16U offset = 0;
	CTYPE_INT16U len = BER_GET_LENGTH_CTYPE_QUALITY(value);

	buf[offset++] = ASN1_TAG_BIT_STRING;
	offset += encodeLength(&buf[offset], len);

	buf[offset++] = QUALITY_UNUSED_BITS;	// number of unused bits
	netmemcpy(&buf[offset], value, len - 1);

	return offset + len - 1;
}
int BER_ENCODE_CTYPE_TIMESTAMP(unsigned char *buf, CTYPE_TIMESTAMP *value) {
	CTYPE_INT16U offset = 0;
	CTYPE_INT16U len = BER_GET_LENGTH_CTYPE_TIMESTAMP(value);

	buf[offset++] = ASN1_TAG_OCTET_STRING;
	offset += encodeLength(&buf[offset], len);

	memcpy(&buf[offset], value, len);

	return offset + len;
}
int BER_ENCODE_CTYPE_ENUM(unsigned char *buf, CTYPE_ENUM *value) {
	CTYPE_INT16U offset = 0;
	CTYPE_INT16U len = BER_GET_LENGTH_CTYPE_ENUM(value);

	buf[offset++] = ASN1_TAG_INTEGER;
	offset += encodeLength(&buf[offset], len);

#if GOOSE_FIXED_SIZE == 1
	ber_encode_integer_fixed_size(&buf[offset], value, SV_GET_LENGTH_INT8);
#else
	ber_encode_integer(&buf[offset], value, SV_GET_LENGTH_INT32U);			// assuming enum is an int - allows any enum type to be used
#endif

	return offset + len;
}
int BER_ENCODE_CTYPE_INT8(unsigned char *buf, CTYPE_INT8 *value) {
	CTYPE_INT16U offset = 0;
	CTYPE_INT16U len = BER_GET_LENGTH_CTYPE_INT8(value);

	buf[offset++] = ASN1_TAG_INTEGER;
	offset += encodeLength(&buf[offset], len);

#if GOOSE_FIXED_SIZE == 1
	ber_encode_integer_fixed_size(&buf[offset], value, SV_GET_LENGTH_INT8);
#else
	ber_encode_integer(&buf[offset], value, SV_GET_LENGTH_INT8);
#endif

	return offset + len;
}
int BER_ENCODE_CTYPE_INT16(unsigned char *buf, CTYPE_INT16 *value) {
	CTYPE_INT16U offset = 0;
	CTYPE_INT16U len = BER_GET_LENGTH_CTYPE_INT16(value);

	buf[offset++] = ASN1_TAG_INTEGER;
	offset += encodeLength(&buf[offset], len);

#if GOOSE_FIXED_SIZE == 1
	ber_encode_integer_fixed_size(&buf[offset], value, SV_GET_LENGTH_INT16);
#else
	ber_encode_integer(&buf[offset], value, SV_GET_LENGTH_INT16);
#endif

	return offset + len;
}
int BER_ENCODE_CTYPE_INT32(unsigned char *buf, CTYPE_INT32 *value) {
	CTYPE_INT16U offset = 0;
	CTYPE_INT16U len = BER_GET_LENGTH_CTYPE_INT32(value);

	buf[offset++] = ASN1_TAG_INTEGER;
	offset += encodeLength(&buf[offset], len);

#if GOOSE_FIXED_SIZE == 1
	ber_encode_integer_fixed_size(&buf[offset], value, SV_GET_LENGTH_INT32);
#else
	ber_encode_integer(&buf[offset], value, SV_GET_LENGTH_INT32);
#endif

	return offset + len;
}
int BER_ENCODE_CTYPE_INT16U(unsigned char *buf, CTYPE_INT16U *value) {
	CTYPE_INT16U offset = 0;
	CTYPE_INT16U len = BER_GET_LENGTH_CTYPE_INT16U(value);

	buf[offset++] = ASN1_TAG_UNSIGNED;
	offset += encodeLength(&buf[offset], len);

#if GOOSE_FIXED_SIZE == 1
	ber_encode_integer_fixed_size(&buf[offset], value, SV_GET_LENGTH_INT16U);
#else
	ber_encode_integer(&buf[offset], value, SV_GET_LENGTH_INT16U);
#endif

	return offset + len;
}
int BER_ENCODE_CTYPE_INT32U(unsigned char *buf, CTYPE_INT32U *value) {
	CTYPE_INT16U offset = 0;
	CTYPE_INT16U len = BER_GET_LENGTH_CTYPE_INT32U(value);

	buf[offset++] = ASN1_TAG_UNSIGNED;
	offset += encodeLength(&buf[offset], len);

#if GOOSE_FIXED_SIZE == 1
	ber_encode_integer_fixed_size(&buf[offset], value, SV_GET_LENGTH_INT32U);
#else
	ber_encode_integer(&buf[offset], value, SV_GET_LENGTH_INT32U);
#endif

	return offset + len;
}
int BER_ENCODE_CTYPE_VISSTRING255(unsigned char *buf, CTYPE_VISSTRING255 *value) {
	netmemcpy(buf, value, BER_GET_LENGTH_CTYPE_VISSTRING255(value));

	return BER_GET_LENGTH_CTYPE_VISSTRING255(value);
}
int BER_ENCODE_CTYPE_BOOLEAN(unsigned char *buf, CTYPE_BOOLEAN *value) {
	CTYPE_INT16U offset = 0;
	CTYPE_INT16U len = BER_GET_LENGTH_CTYPE_BOOLEAN(value);

	buf[offset++] = ASN1_TAG_BOOLEAN;
	offset += encodeLength(&buf[offset], len);

	netmemcpy(&buf[offset], value, len);

	return offset + len;
}
int BER_ENCODE_CTYPE_DBPOS(unsigned char *buf, CTYPE_DBPOS *value) {
	CTYPE_INT16U offset = 0;
	CTYPE_INT16U len = BER_GET_LENGTH_CTYPE_DBPOS(value);

	buf[offset++] = 0x85;
	offset += encodeLength(&buf[offset], len);

	netmemcpy(&buf[offset], value, len);

	return offset + len;
}

#endif
