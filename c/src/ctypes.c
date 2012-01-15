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
#include "gse.h"
#include "sv.h"
#if TIMESTAMP_SUPPORTED == 1
#include <sys\time.h>
#endif

unsigned char	LOCAL_MAC_ADDRESS[] = LOCAL_MAC_ADDRESS_VALUE;

// TODO: implement fixed-sized version
int ber_integer_length(void *value, int maxLength) {
	unsigned char	endian_buf[16] = {0};
	netmemcpy(endian_buf, value, maxLength);	// ensure bytes are in big-endian order

	unsigned char *buf = endian_buf;
	unsigned char *end1 = buf + maxLength - 1;
	int shift = 0;

	/* Compute the number of superfluous leading bytes */
	for(; buf < end1; buf++) {
		/*
		 * If the contents octets of an integer value encoding
		 * consist of more than one octet, then the bits of the
		 * first octet and bit 8 of the second octet:
		 * a) shall not all be ones; and
		 * b) shall not all be zero.
		 */
		switch(*buf) {
		case 0x00:
			if((buf[1] & 0x80) == 0) {
				continue;
			}
			break;
		case 0xff:
			if((buf[1] & 0x80)) {
				continue;
			}
			break;
		}
		break;
	}

	shift = buf - endian_buf;

	return maxLength - shift;
}

// TODO: implement fixed-sized version
int ber_encode_integer(unsigned char *bufDst, void *value, int maxLength) {
	unsigned char	endian_buf[16] = {0};
	netmemcpy(endian_buf, value, maxLength);	// ensure bytes are in big-endian order

	unsigned char *buf = endian_buf;
	unsigned char *end1 = buf + maxLength - 1;
	int shift = 0;

	/* Compute the number of superfluous leading bytes */
	for(; buf < end1; buf++) {
		/*
		 * If the contents octets of an integer value encoding
		 * consist of more than one octet, then the bits of the
		 * first octet and bit 8 of the second octet:
		 * a) shall not all be ones; and
		 * b) shall not all be zero.
		 */
		switch(*buf) {
		case 0x00:
			if((buf[1] & 0x80) == 0) {
				continue;
			}
			break;
		case 0xff:
			if((buf[1] & 0x80)) {
				continue;
			}
			break;
		}
		break;
	}

	shift = buf - endian_buf;

	/* Remove leading superfluous bytes from the integer */
	//if (shift) {
		unsigned char *nb = endian_buf;
		unsigned char *end;

		maxLength -= shift;	/* New size, minus bad bytes */
		end = nb + maxLength;

		int i = 0;
		for(; nb < end; nb++, buf++, i++) {
			//*nb = *buf;
			bufDst[i] = *buf;
		}

		//printf("st->size: %d, end: %d\n", st->size, *end);
	//}

	//memcpy((unsigned char *) bufDst, (const unsigned char *) endian_buf, maxLength);

	//printf("%d  %d  %d\n", (int) *st->buf, st->size, shift);
	return maxLength;
}

void ber_decode_integer(unsigned char *buf, int length, void *value, int maxLength) {
	unsigned char	endian_buf[16] = {0};
	unsigned char padding = (buf[0] & 0x80) ? 0xFF : 0x00;
	int i = 0;
	unsigned char *dest = (unsigned char *) value;

	for (i = maxLength - 1; i >= 0; i--) {
		if ((i + length) < maxLength) {
			endian_buf[i] = padding;
		}
		else {
			endian_buf[i] = buf[i - (maxLength - length)];
		}
	}

	netmemcpy(dest, endian_buf, maxLength);
}

//TODO need cast to, for example, (unsigned char *) for calls to reversememcpy()?

// a simple memcpy implementation, that reverses endian-ness
void reversememcpy(unsigned char *dst, const unsigned char *src, unsigned int len) {
	while (len--) {
		*dst++ = src[len];
	}
}

void setTimestamp(CTYPE_TIMESTAMP *dest) {
#if TIMESTAMP_SUPPORTED == 1
	unsigned char *buf = (unsigned char *) dest;
	struct timeval tv;
	CTYPE_INT32U frac = 0;

	gettimeofday(&tv, NULL);
	frac = (CTYPE_INT32U) ((float) tv.tv_usec * 4294.967296);	// * 2^32 / 1000000;

	netmemcpy(&buf[0], &tv.tv_sec, 4);
	netmemcpy(&buf[4], &frac, 4);

	buf[7] = 0x18;	// quality: 24 bits of accuracy
#endif
}

// if the recommended MAC address ranges are used, this function filters GOOSE and SV packets
void gse_sv_packet_filter(unsigned char *buf, int len) {
	if (buf[0] == 0x01 && buf[1] == 0x0C && buf[2] == 0xCD) {
		if (buf[3] == 0x01) {
			//GOOSE: 01-0C-CD-01-00-00 to 01-0C-CD-01-01-FF
			gseDecode(buf, len);
		}
		else if (buf[3] == 0x04) {
			//SV: 01-0C-CD-04-00-00 to 01-0C-CD-04-01-FF
			svDecode(buf, len);
		}
	}
}

// copies bytes to network format (big-endian)
void netmemcpy(void *dst, const void *src, unsigned int len) {
#ifdef LITTLE_ENDIAN
	reversememcpy((unsigned char *) dst, (const unsigned char *) src, len);
#else
	memcpy((unsigned char *) dst, (const unsigned char *) src, len);
#endif
}

// copies bytes to host format (little-endian)
void hostmemcpy(void *dst, const void *src, unsigned int len) {
#ifdef LITTLE_ENDIAN
	memcpy((unsigned char *) dst, (const unsigned char *) src, len);
#else
	reversememcpy((unsigned char *) dst, (const unsigned char *) src, len);
#endif
}
