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

#include "encodePacket.h"
#include "svEncodeBasic.h"

int getLengthBytes(int len) {
	if (len <= 126) {
		return 1;
	}
	else if (len <= 255) {
		return 2;
	}
	else {
		return 3;
	}
}

int encodeLength(unsigned char *buf, CTYPE_INT16U len) {
	if (len <= 126) {
		buf[0] = (unsigned char) len;
		return 1;
	}
	else if (len <= 255) {
		buf[0] = (unsigned char) 0x81;			// 0x80 specifies larger than one byte; 0x01 is number of length bytes to follow
		buf[1] = (unsigned char) len;

		return 2;
	}
	else {
		// assume length is not greater than 2^15
		buf[0] = (unsigned char) 0x82;			// 0x80 specifies larger than one byte; 0x02 is number of length bytes to follow
		ENCODE_CTYPE_INT16U(&buf[1], &len);

		return 3;
	}
}
