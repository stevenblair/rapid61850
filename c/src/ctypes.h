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

#ifndef CTYPES_H
#define CTYPES_H

#ifdef __cplusplus /* If this is a C++ compiler, use C linkage */
extern "C" {
#endif

#include <string.h>

#define LITTLE_ENDIAN			1
#define TIMESTAMP_SUPPORTED		1

#define LOCAL_MAC_ADDRESS_VALUE	{0x01, 0x0C, 0xCD, 0x01, 0x00, 0x02}

#define GOOSE_FIXED_SIZE		0	// set to 1 to enable fixed-sized GOOSE datasets, which are slightly more efficient to encode.

// platform-specific data types to conform to SV type sizes (Table 14 in IEC 61850-9-2)
#define CTYPE_BOOLEAN		unsigned char
#define CTYPE_INT8			char
#define CTYPE_INT16			short
#define CTYPE_INT32			int
#define CTYPE_INT8U			unsigned char
#define CTYPE_INT16U		unsigned short
#define CTYPE_INT32U		unsigned int
#define CTYPE_ENUM			CTYPE_INT32
#define CTYPE_FLOAT32		float
#define CTYPE_FLOAT64		double
#define CTYPE_VISSTRING255	char *
#define CTYPE_DBPOS			int
#define CTYPE_QUALITY		CTYPE_INT16U
#define CTYPE_TIMESTAMP		long long

// sampled value dataset type sizes, in bytes
#define SV_GET_LENGTH_FLOAT32				4
#define SV_GET_LENGTH_FLOAT64				8
#define SV_GET_LENGTH_TIMESTAMP				8
#define SV_GET_LENGTH_INT16					2
#define SV_GET_LENGTH_INT32					4
#define SV_GET_LENGTH_INT16U				2
#define SV_GET_LENGTH_INT32U				4
#define SV_GET_LENGTH_VISSTRING255			35
#define SV_GET_LENGTH_BOOLEAN				1
#define SV_GET_LENGTH_ENUM					4
#define SV_GET_LENGTH_QUALITY				4
#define SV_GET_LENGTH_DBPOS					4

#if GOOSE_FIXED_SIZE == 1
// BER datatype sizes, which are dependent on the actual data
#define BER_GET_LENGTH_CTYPE_FLOAT32(x)			(SV_GET_LENGTH_FLOAT32)
#define BER_GET_LENGTH_CTYPE_FLOAT64(x)			(SV_GET_LENGTH_FLOAT64)
#define BER_GET_LENGTH_CTYPE_TIMESTAMP(x)		(SV_GET_LENGTH_TIMESTAMP)
#define BER_GET_LENGTH_CTYPE_INT16(x)			(3)								// 16-bit datatypes are encoded in 24 bits!
#define BER_GET_LENGTH_CTYPE_INT32(x)			(5)
#define BER_GET_LENGTH_CTYPE_INT16U(x)			(3)
#define BER_GET_LENGTH_CTYPE_INT32U(x)			(5)
#define BER_GET_LENGTH_CTYPE_VISSTRING255(x)	(SV_GET_LENGTH_VISSTRING255)
#define BER_GET_LENGTH_CTYPE_BOOLEAN(x)			(SV_GET_LENGTH_BOOLEAN)
#define BER_GET_LENGTH_CTYPE_ENUM(x)			(2)
#define BER_GET_LENGTH_CTYPE_QUALITY(x)			(3)
#define BER_GET_LENGTH_CTYPE_DBPOS(x)			(SV_GET_LENGTH_DBPOS)
#else
#define BER_GET_LENGTH_CTYPE_FLOAT32(x)			(SV_GET_LENGTH_FLOAT32 + 1)		// + 1 byte for number of exponent bits
#define BER_GET_LENGTH_CTYPE_FLOAT64(x)			(SV_GET_LENGTH_FLOAT64 + 1)		// + 1 byte for number of exponent bits
#define BER_GET_LENGTH_CTYPE_TIMESTAMP(x)		(SV_GET_LENGTH_TIMESTAMP)
#define BER_GET_LENGTH_CTYPE_INT16(x)			(ber_integer_length((x), SV_GET_LENGTH_INT16))
#define BER_GET_LENGTH_CTYPE_INT32(x)			(ber_integer_length((x), SV_GET_LENGTH_INT32))
#define BER_GET_LENGTH_CTYPE_INT16U(x)			(ber_integer_length((x), SV_GET_LENGTH_INT16U))
#define BER_GET_LENGTH_CTYPE_INT32U(x)			(ber_integer_length((x), SV_GET_LENGTH_INT32U))
#define BER_GET_LENGTH_CTYPE_VISSTRING255(x)	(SV_GET_LENGTH_VISSTRING255)
#define BER_GET_LENGTH_CTYPE_BOOLEAN(x)			(SV_GET_LENGTH_BOOLEAN)
#define BER_GET_LENGTH_CTYPE_ENUM(x)			(ber_integer_length((x), SV_GET_LENGTH_ENUM))
#define BER_GET_LENGTH_CTYPE_QUALITY(x)			(/*SV_GET_LENGTH_QUALITY*/2 + 1)		// + 1 byte for padding
#define BER_GET_LENGTH_CTYPE_DBPOS(x)			(SV_GET_LENGTH_DBPOS)
#endif

#define ASN1_TAG_ARRAY							0x81
#define ASN1_TAG_STRUCTURE						0x82
#define ASN1_TAG_BOOLEAN						0x83
#define ASN1_TAG_BIT_STRING						0x84
#define ASN1_TAG_INTEGER						0x85
#define ASN1_TAG_UNSIGNED						0x86
#define ASN1_TAG_FLOATING_POINT					0x87
#define ASN1_TAG_REAL							0x88
#define ASN1_TAG_OCTET_STRING					0x89
#define ASN1_TAG_VISIBLE_STRING					0x8A

#define QUALITY_UNUSED_BITS						3		// total_bits (16) - used_bits (13) = 3

int ber_integer_length(void *value, int maxLength);
int ber_encode_integer(unsigned char *bufDst, void *value, int maxLength);
void ber_decode_integer(unsigned char *buf, int length, void *value, int maxLength);

void reversememcpy(unsigned char *dst, const unsigned char *src, unsigned int len);
void netmemcpy(void *dst, const void *src, unsigned int len);
void hostmemcpy(void *dst, const void *src, unsigned int len);

void setTimestamp(CTYPE_TIMESTAMP *t);
void gse_sv_packet_filter(unsigned char *buf, int len);

struct UtcTime {
	unsigned char bytes[8];		// format: ssssssssssssssssssssssssssssssssffffffffffffffffffffffffqqqqqqqq
};

extern unsigned char LOCAL_MAC_ADDRESS[];

struct ethHeaderData {
	unsigned char destMACAddress[6];	// stored in big-endian format
	CTYPE_INT16U APPID;
	CTYPE_INT16U VLAN_ID;
	CTYPE_INT16U VLAN_PRIORITY;
};

#ifdef __cplusplus /* If this is a C++ compiler, end C linkage */
}
#endif

#endif

