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
#include "gseDecodeBasic.h"
#include <string.h>

// GSE decoding of basic types
int BER_DECODE_CTYPE_FLOAT32(unsigned char *buf, CTYPE_FLOAT32 *value) {
	CTYPE_INT16U offset = 0;
	CTYPE_INT16U len = 0;

	if (buf[offset++] == 0x87) {
		len += decodeLength(&buf[offset]);
		offset += getLengthFieldSize(buf[offset]);

		// check for 8 bits for exponent
		if (buf[offset++] == 0x08) {
			netmemcpy(value, &buf[offset], len - 1);
		}
	}

	return offset + len - 1;
}

int BER_DECODE_CTYPE_FLOAT64(unsigned char *buf, CTYPE_FLOAT64 *value) {
	CTYPE_INT16U offset = 0;
	CTYPE_INT16U len = 0;

	if (buf[offset++] == 0x87) {
		len += decodeLength(&buf[offset]);
		offset += getLengthFieldSize(buf[offset]);

		// check for 11 bits for exponent
		if (buf[offset++] == 0x0B) {
			netmemcpy(value, &buf[offset], len - 1);
		}
	}

	return offset + len - 1;
}
int BER_DECODE_CTYPE_QUALITY(unsigned char *buf, CTYPE_QUALITY *value) {
	CTYPE_INT16U offset = 0;
	CTYPE_INT16U len = 0;

	if (buf[offset++] == ASN1_TAG_INTEGER) {
		len += decodeLength(&buf[offset]);
		offset += getLengthFieldSize(buf[offset]);

		netmemcpy(value, &buf[offset], len);		//TODO check if memcpy should be used here, and elsewhere
	}

	return offset + len;
}
int BER_DECODE_CTYPE_TIMESTAMP(unsigned char *buf, CTYPE_TIMESTAMP *value) {
	CTYPE_INT16U offset = 0;
	CTYPE_INT16U len = 0;

	if (buf[offset++] == 0x89) {
		len += decodeLength(&buf[offset]);
		offset += getLengthFieldSize(buf[offset]);

		netmemcpy(value, &buf[offset], len);
	}

	return offset + len;
}
int BER_DECODE_CTYPE_ENUM(unsigned char *buf, CTYPE_ENUM *value) {	// assuming enum is an int - allows any enum type to be used
	CTYPE_INT16U offset = 0;
	CTYPE_INT16U len = 0;

	if (buf[offset++] == ASN1_TAG_UNSIGNED) {
		len += decodeLength(&buf[offset]);
		offset += getLengthFieldSize(buf[offset]);

		ber_decode_integer(&buf[offset], len, value, SV_GET_LENGTH_INT32U);
	}

	return offset + len;
}
int BER_DECODE_CTYPE_INT8(unsigned char *buf, CTYPE_INT8 *value) {
	CTYPE_INT16U offset = 0;
	CTYPE_INT16U len = 0;

	if (buf[offset++] == ASN1_TAG_INTEGER) {
		len += decodeLength(&buf[offset]);
		offset += getLengthFieldSize(buf[offset]);

		ber_decode_integer(&buf[offset], len, value, SV_GET_LENGTH_INT8);
	}

	return offset + len;
}
int BER_DECODE_CTYPE_INT16(unsigned char *buf, CTYPE_INT16 *value) {
	CTYPE_INT16U offset = 0;
	CTYPE_INT16U len = 0;

	if (buf[offset++] == ASN1_TAG_INTEGER) {
		len += decodeLength(&buf[offset]);
		offset += getLengthFieldSize(buf[offset]);

		ber_decode_integer(&buf[offset], len, value, SV_GET_LENGTH_INT16);
	}

	return offset + len;
}
int BER_DECODE_CTYPE_INT32(unsigned char *buf, CTYPE_INT32 *value) {
	CTYPE_INT16U offset = 0;
	CTYPE_INT16U len = 0;

	if (buf[offset++] == ASN1_TAG_INTEGER) {
		len += decodeLength(&buf[offset]);
		offset += getLengthFieldSize(buf[offset]);

		ber_decode_integer(&buf[offset], len, value, SV_GET_LENGTH_INT32);
	}

	return offset + len;
}
int BER_DECODE_CTYPE_INT16U(unsigned char *buf, CTYPE_INT16U *value) {
	CTYPE_INT16U offset = 0;
	CTYPE_INT16U len = 0;

	if (buf[offset++] == ASN1_TAG_UNSIGNED) {
		len += decodeLength(&buf[offset]);
		offset += getLengthFieldSize(buf[offset]);

		ber_decode_integer(&buf[offset], len, value, SV_GET_LENGTH_INT16U);
	}

	return offset + len;
}
int BER_DECODE_CTYPE_INT32U(unsigned char *buf, CTYPE_INT32U *value) {
	CTYPE_INT16U offset = 0;
	CTYPE_INT16U len = 0;

	if (buf[offset++] == ASN1_TAG_UNSIGNED) {
		len += decodeLength(&buf[offset]);
		offset += getLengthFieldSize(buf[offset]);

		ber_decode_integer(&buf[offset], len, value, SV_GET_LENGTH_INT32U);
	}

	return offset + len;
}
int BER_DECODE_CTYPE_VISSTRING255(unsigned char *buf, CTYPE_VISSTRING255 *value) {
	netmemcpy(value, buf, SV_GET_LENGTH_VISSTRING255);

	return SV_GET_LENGTH_VISSTRING255;
}
int BER_DECODE_CTYPE_BOOLEAN(unsigned char *buf, CTYPE_BOOLEAN *value) {
	CTYPE_INT16U offset = 0;
	CTYPE_INT16U len = 0;

	if (buf[offset++] == ASN1_TAG_BOOLEAN) {
		len += decodeLength(&buf[offset]);
		offset += getLengthFieldSize(buf[offset]);

		netmemcpy(value, &buf[offset], len);
	}

	return offset + len;
}
int BER_DECODE_CTYPE_DBPOS(unsigned char *buf, CTYPE_DBPOS *value) {
	netmemcpy(value, buf, SV_GET_LENGTH_DBPOS);

	return SV_GET_LENGTH_DBPOS;
}
