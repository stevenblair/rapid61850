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

#include "decodePacket.h"
//#include "svEncodeBasic.h"


// returns size of length field, from first byte
int getLengthFieldSize(unsigned char byte) {
	if (byte <= 126) {
		return 1;
	}
	else {
		return 1 + (byte & 0x7F);
	}
}

//TODO	check this works for all inputs, e.g., buf[1] = 0xFF
int decodeLength(unsigned char *buf) {
	if (buf[0] <= 126) {
		return buf[0];
	}
	else {
		int bytes = (buf[0] & 0x7F);

		if (bytes == 1) {
			return buf[1];
		}
		else if (bytes == 2) {	// assumes max length of 2^15
			return ((buf[1] & 0xFF) << 8) | (buf[2] & 0xFF);
		}
	}

	return 0;
}
