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

#include "interfaceSendPacket.h"






int sv_update_E1Q1SB1_C1_PerformanceSV_buf() {
	int len = sv_update_E1Q1SB1_C1_PerformanceSV(bufOut);

	if (len > 0) {
		pcap_sendpacket(fp, bufOut, len);
	}

	return len;
}

int gse_send_E1Q1SB1_C1_Performance_buf(int statusChange, int timeAllowedToLive) {
	int len = gse_send_E1Q1SB1_C1_Performance(bufOut, (CTYPE_BOOLEAN) statusChange, (CTYPE_INT32U) timeAllowedToLive);

	if (len > 0) {
		pcap_sendpacket(fp, bufOut, len);
	}

	return len;
}

int gse_send_E1Q1SB1_C1_ItlPositions_buf(int statusChange, int timeAllowedToLive) {
	int len = gse_send_E1Q1SB1_C1_ItlPositions(bufOut, (CTYPE_BOOLEAN) statusChange, (CTYPE_INT32U) timeAllowedToLive);

	if (len > 0) {
		pcap_sendpacket(fp, bufOut, len);
	}

	return len;
}

int gse_send_E1Q1SB1_C1_AnotherPositions_buf(int statusChange, int timeAllowedToLive) {
	int len = gse_send_E1Q1SB1_C1_AnotherPositions(bufOut, (CTYPE_BOOLEAN) statusChange, (CTYPE_INT32U) timeAllowedToLive);

	if (len > 0) {
		pcap_sendpacket(fp, bufOut, len);
	}

	return len;
}

int sv_update_E1Q1SB1_C1_Volt_buf() {
	int len = sv_update_E1Q1SB1_C1_Volt(bufOut);

	if (len > 0) {
		pcap_sendpacket(fp, bufOut, len);
	}

	return len;
}

int sv_update_E1Q1SB1_C1_rmxuCB_buf() {
	int len = sv_update_E1Q1SB1_C1_rmxuCB(bufOut);

	if (len > 0) {
		pcap_sendpacket(fp, bufOut, len);
	}

	return len;
}

int gse_send_D1Q1SB4_C1_SyckResult_buf(int statusChange, int timeAllowedToLive) {
	int len = gse_send_D1Q1SB4_C1_SyckResult(bufOut, (CTYPE_BOOLEAN) statusChange, (CTYPE_INT32U) timeAllowedToLive);

	if (len > 0) {
		pcap_sendpacket(fp, bufOut, len);
	}

	return len;
}

int gse_send_D1Q1SB4_C1_MMXUResult_buf(int statusChange, int timeAllowedToLive) {
	int len = gse_send_D1Q1SB4_C1_MMXUResult(bufOut, (CTYPE_BOOLEAN) statusChange, (CTYPE_INT32U) timeAllowedToLive);

	if (len > 0) {
		pcap_sendpacket(fp, bufOut, len);
	}

	return len;
}

