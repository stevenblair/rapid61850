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

#include <unistd.h>
#include "ied.h"
#include "sv.h"
#include "svPacketData.h"
#include "svDecode.h"
#include "svEncode.h"
#include "encodePacket.h"

#define EXCLUDE_DUPLICATE_ASDU_FIELDS	1


// encoding functions

int svASDULength_compress(struct svControl *svControl, short ASDU) {
	int len = 0;

#if EXCLUDE_DUPLICATE_ASDU_FIELDS == 1
	if (ASDU == 0) {
#endif
	len += strlen((const char *) svControl->ASDU[ASDU].svID) + 2;
	//printf("%i, %s\n", strlen(svControl->ASDU[ASDU].svID), svControl->ASDU[ASDU].svID);
	//len += strlen((const char *) svControl->ASDU[ASDU].datset) + 2;
#if EXCLUDE_DUPLICATE_ASDU_FIELDS == 1
	}
#endif

#if EXCLUDE_DUPLICATE_ASDU_FIELDS == 1
	if (ASDU == 0) {
#endif
#if SV_FIXED_SMPCNT_CONFREV_SIZE == 1
	len += SV_GET_LENGTH_INT16U + 2;	// smpCnt
	len += SV_GET_LENGTH_INT32U + 2;	// confRev
#else
	len += ber_integer_length((&svControl->ASDU[ASDU].smpCnt), SV_GET_LENGTH_INT16U)/*BER_GET_LENGTH_CTYPE_INT16U(&svControl->ASDU[ASDU].smpCnt)*/ + 2;
	len += ber_integer_length((&svControl->ASDU[ASDU].confRev), SV_GET_LENGTH_INT32U)/*BER_GET_LENGTH_CTYPE_INT32U(&svControl->ASDU[ASDU].confRev)*/ + 2;
#endif

	len += SV_GET_LENGTH_BOOLEAN + 2;
#if EXCLUDE_DUPLICATE_ASDU_FIELDS == 1
	}
#endif

	//len += BER_GET_LENGTH_CTYPE_INT16U(&svControl->ASDU[ASDU].smpRate) + 2;
	len += svControl->ASDU[ASDU].data.size + getLengthBytes(svControl->ASDU[ASDU].data.size);
	len++;

	return len;
}

//int svSeqLength(struct svControl *svControl) {
//	int len = svASDULength(svControl);
//	len += getLengthBytes(len);
//	len++;
//	len = len * svControl->noASDU;	// assume all ASDUs are the same size
//
//	return len;
//}
int svSeqLength_compress(struct svControl *svControl) {
	int i = 0;
	int len = 0;

	for (i = 0; i < svControl->noASDU; i++) {
		int this_ASDU_len = svASDULength_compress(svControl, i);
		len += this_ASDU_len;
		len += getLengthBytes(this_ASDU_len);
		len++;	// TODO needed?
	}
	//	len = len * svControl->noASDU;	// assume all ASDUs are the same size

	return len;
}

int svAPDULength_compress(struct svControl *svControl) {
	int len = svSeqLength_compress(svControl);
	len += getLengthBytes(len);
	len++;

	len += 3;

	return len;
}

// creates an SV packet, including frame header. returns 0 on fail; number of bytes on success
int svEncodePacket_compress(struct svControl *svControl, unsigned char *buf) {
	int offset = 0;
	int len = svAPDULength_compress(svControl);
	len += getLengthBytes(len);
	len += 9;		// savPdu tag size (1 byte), plus 8 "header" bytes

	// frame header
	memcpy(&buf[offset], svControl->ethHeaderData.destMACAddress, 6);	// destination MAC addresses
	offset += 6;
	memcpy(&buf[offset], LOCAL_MAC_ADDRESS, 6);						// source MAC addresses
	offset += 6;

#if SV_USE_VLAN == 1
	buf[offset++] = 0x81;	// TPID
	buf[offset++] = 0x00;

	netmemcpy(&buf[offset], &svControl->ethHeaderData.VLAN_ID, 2);	// TCI
	buf[offset] |= (svControl->ethHeaderData.VLAN_PRIORITY << 5);
	offset += 2;
#endif

	buf[offset++] = 0x88;	// EtherType
	buf[offset++] = 0xBA;

	netmemcpy(&buf[offset], &svControl->ethHeaderData.APPID, 2);	// APPID
	offset += 2;

	netmemcpy(&buf[offset], &len, 2);	// length
	offset += 2;

	buf[offset++] = 0x00;	// reserved 1
	buf[offset++] = 0x00;
	buf[offset++] = 0x00;	// reserved 2
	buf[offset++] = 0x00;

	buf[offset++] = SV_TAG_SAVPDU;
	offset += encodeLength(&buf[offset], svAPDULength_compress(svControl));

	buf[offset++] = SV_TAG_NOASDU;
	offset += encodeLength(&buf[offset], ber_integer_length(&svControl->noASDU, SV_GET_LENGTH_INT16U));
	offset += ber_encode_integer(&buf[offset], &svControl->noASDU, ber_integer_length(&svControl->noASDU, SV_GET_LENGTH_INT16U));

	buf[offset++] = SV_TAG_SEQUENCEOFASDU;
	offset += encodeLength(&buf[offset], svSeqLength_compress(svControl));

	int i = 0;
	int size = 0;
	for (i = 0; i < svControl->noASDU; i++) {
		buf[offset++] = SV_TAG_ASDU;
		offset += encodeLength(&buf[offset], svASDULength_compress(svControl, i));

#if EXCLUDE_DUPLICATE_ASDU_FIELDS == 1
	if (i == 0) {
#endif
		size = strlen((const char *) svControl->ASDU[i].svID);
		buf[offset++] = SV_TAG_SVID;
		buf[offset++] = size;
		memcpy(&buf[offset], svControl->ASDU[i].svID, size);
		offset += size;
#if EXCLUDE_DUPLICATE_ASDU_FIELDS == 1
	}
#endif

#if SV_OPTIONAL_SUPPORTED == 1
		if (svControl->ASDU[i].showDatset) {
			size = strlen(svControl->ASDU[i].datset);
			buf[offset++] = SV_TAG_DATSET;
			buf[offset++] = size;
			memcpy(&buf[offset], svControl->ASDU[i].datset, size);
			offset += size;
		}
#endif

#if EXCLUDE_DUPLICATE_ASDU_FIELDS == 1
	if (i == 0) {
#endif
		buf[offset++] = SV_TAG_SMPCNT;
#if SV_FIXED_SMPCNT_CONFREV_SIZE == 1
		buf[offset++] = SV_GET_LENGTH_INT16U;
		netmemcpy(&buf[offset], &svControl->ASDU[i].smpCnt, SV_GET_LENGTH_INT16U);
		offset += SV_GET_LENGTH_INT16U;
#else
		offset += encodeLength(&buf[offset], ber_integer_length(&svControl->ASDU[i].smpCnt, SV_GET_LENGTH_INT16U));
		offset += ber_encode_integer(&buf[offset], &svControl->ASDU[i].smpCnt, SV_GET_LENGTH_INT16U);
#endif
#if EXCLUDE_DUPLICATE_ASDU_FIELDS == 1
	}
#endif

#if EXCLUDE_DUPLICATE_ASDU_FIELDS == 1
	if (i == 0) {
#endif
		buf[offset++] = SV_TAG_CONFREV;
#if SV_FIXED_SMPCNT_CONFREV_SIZE == 1
		buf[offset++] = SV_GET_LENGTH_INT32U;
		netmemcpy(&buf[offset], &svControl->ASDU[i].confRev, SV_GET_LENGTH_INT32U);
		offset += SV_GET_LENGTH_INT32U;
#else
		offset += encodeLength(&buf[offset], ber_integer_length(&svControl->ASDU[i].confRev, SV_GET_LENGTH_INT32U));
		offset += ber_encode_integer(&buf[offset], &svControl->ASDU[i].confRev, SV_GET_LENGTH_INT32U);
#endif
#if EXCLUDE_DUPLICATE_ASDU_FIELDS == 1
	}
#endif

#if SV_OPTIONAL_SUPPORTED == 1
		if (svControl->ASDU[i].showRefrTm) {
			buf[offset++] = SV_TAG_REFRTM;
			offset += encodeLength(&buf[offset], BER_GET_LENGTH_CTYPE_TIMESTAMP(&svControl->ASDU[i].refrTm));
			setTimestamp(&svControl->ASDU[i].refrTm);
			memcpy(&buf[offset], &svControl->ASDU[i].refrTm, BER_GET_LENGTH_CTYPE_TIMESTAMP(&svControl->ASDU[i].refrTm));
			offset += BER_GET_LENGTH_CTYPE_TIMESTAMP(&svControl->ASDU[i].refrTm);
		}
#endif

#if EXCLUDE_DUPLICATE_ASDU_FIELDS == 1
	if (i == 0) {
#endif
		buf[offset++] = SV_TAG_SMPSYNCH;
		buf[offset++] = SV_GET_LENGTH_BOOLEAN;
		offset += ENCODE_CTYPE_BOOLEAN(&buf[offset], &svControl->ASDU[i].smpSynch);
#if EXCLUDE_DUPLICATE_ASDU_FIELDS == 1
	}
#endif

#if SV_OPTIONAL_SUPPORTED == 1
		if (svControl->ASDU[i].showSmpRate) {
			buf[offset++] = SV_TAG_SMPRATE;
			buf[offset++] = SV_GET_LENGTH_INT16U;
			offset += ENCODE_CTYPE_INT16U(&buf[offset], &svControl->ASDU[i].smpRate);
		}
#endif

		buf[offset++] = SV_TAG_SEQUENCEOFDATA;
		offset += encodeLength(&buf[offset], svControl->ASDU[i].data.size);
		memcpy(&buf[offset], svControl->ASDU[i].data.data, svControl->ASDU[i].data.size);
		offset += svControl->ASDU[i].data.size;
	}

	// assume network interface, such as WinPcap, generates CRC bytes

	return offset;
}

// from https://techoverflow.net/blog/2013/01/25/efficiently-encoding-variable-length-integers-in-cc/
size_t encode_int32_t(uint8_t* output, int32_t value) {
	uint32_t value2 = (value >> 31) ^ (value << 1);
    size_t outputSize = 0;
    //While more than 7 bits of data are left, occupy the last output byte
    // and set the next byte flag
    while (value2 > 127) {
        //|128: Set the next byte flag
        output[outputSize] = ((uint8_t)(value2)) | 128;
        //Remove the seven bits we just wrote
        value2 >>= 7;
        outputSize++;
    }
    output[outputSize++] = ((uint8_t)value2) & 127;
    return outputSize;
}
size_t encode_uint32_t(uint8_t* output, uint32_t value) {
    size_t outputSize = 0;
    //While more than 7 bits of data are left, occupy the last output byte
    // and set the next byte flag
    while (value > 127) {
        //|128: Set the next byte flag
        output[outputSize] = ((uint8_t)(value)) | 128;
        //Remove the seven bits we just wrote
        value >>= 7;
        outputSize++;
    }
    output[outputSize++] = ((uint8_t)value) & 127;
    return outputSize;
}

uint32_t decode_uint32_t(uint8_t* input, size_t inputSize, uint8_t *number_of_bytes) {
	uint32_t ret = 0;
	size_t i = 0;
    for (i = 0; i < inputSize; i++) {
        ret |= (input[i] & 127) << (7 * i);
        //If the next-byte flag is set
        if(!(input[i] & 128)) {
            break;
        }
    }
    *number_of_bytes = i + 1;
    return ret;
}
int32_t decode_int32_t(uint8_t* input, size_t inputSize, uint8_t *number_of_bytes) {
	uint32_t ret = 0;
	size_t i = 0;
    for (i = 0; i < inputSize; i++) {
        ret |= (input[i] & 127) << (7 * i);
        //If the next-byte flag is set
        if(!(input[i] & 128)) {
            break;
        }
    }
    *number_of_bytes = i + 1;
    ret = logicalRightShift(ret, 1) ^ -(ret & 1);	// decode zigzag
    return ret;
}

int encode_LE_IED_MUnn_PhsMeas1_compress(unsigned char *buf, struct LE_IED_MUnn_PhsMeas1 *prev_data_values, short ASDUCount) {
	int offset = 0;

	if (ASDUCount == 0) {
		offset += encode_LE_IED_MUnn_PhsMeas1(buf);
//		offset += encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_1.Amp.instMag);
//		offset += ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_1.Amp.q);
//		offset += encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_2.Amp.instMag);
//		offset += ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_2.Amp.q);
//		offset += encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_3.Amp.instMag);
//		offset += ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_3.Amp.q);
//		offset += encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_4.Amp.instMag);
//		offset += ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_4.Amp.q);
//		offset += encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_1.Vol.instMag);
//		offset += ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_1.Vol.q);
//		offset += encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_2.Vol.instMag);
//		offset += ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_2.Vol.q);
//		offset += encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_3.Vol.instMag);
//		offset += ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_3.Vol.q);
//		offset += encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_4.Vol.instMag);
//		offset += ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_4.Vol.q);

//		printf("offset (ASDUCount == 0): %d\n", offset);
	}
	else {
		// TODO store prev value in static struct variable?
		// TODO should be formed of individual *_compress encoders
		offset += encode_int32_t(&buf[offset], prev_data_values->MUnn_TCTR_1_Amp_instMag.i - LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_1.Amp.instMag.i);
		offset += encode_uint32_t(&buf[offset], prev_data_values->MUnn_TCTR_1_Amp_q - LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_1.Amp.q);
		offset += encode_int32_t(&buf[offset], prev_data_values->MUnn_TCTR_2_Amp_instMag.i - LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_2.Amp.instMag.i);
		offset += encode_uint32_t(&buf[offset], prev_data_values->MUnn_TCTR_2_Amp_q - LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_2.Amp.q);
		offset += encode_int32_t(&buf[offset], prev_data_values->MUnn_TCTR_3_Amp_instMag.i - LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_3.Amp.instMag.i);
		offset += encode_uint32_t(&buf[offset], prev_data_values->MUnn_TCTR_3_Amp_q - LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_3.Amp.q);
		offset += encode_int32_t(&buf[offset], prev_data_values->MUnn_TCTR_4_Amp_instMag.i - LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_4.Amp.instMag.i);
		offset += encode_uint32_t(&buf[offset], prev_data_values->MUnn_TCTR_4_Amp_q - LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_4.Amp.q);
		offset += encode_int32_t(&buf[offset], prev_data_values->MUnn_TVTR_1_Vol_instMag.i - LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_1.Vol.instMag.i);
		offset += encode_uint32_t(&buf[offset], prev_data_values->MUnn_TVTR_1_Vol_q - LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_1.Vol.q);
		offset += encode_int32_t(&buf[offset], prev_data_values->MUnn_TVTR_2_Vol_instMag.i - LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_2.Vol.instMag.i);
		offset += encode_uint32_t(&buf[offset], prev_data_values->MUnn_TVTR_2_Vol_q - LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_2.Vol.q);
		offset += encode_int32_t(&buf[offset], prev_data_values->MUnn_TVTR_3_Vol_instMag.i - LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_3.Vol.instMag.i);
		offset += encode_uint32_t(&buf[offset], prev_data_values->MUnn_TVTR_3_Vol_q - LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_3.Vol.q);
		offset += encode_int32_t(&buf[offset], prev_data_values->MUnn_TVTR_4_Vol_instMag.i - LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_4.Vol.instMag.i);
		offset += encode_uint32_t(&buf[offset], prev_data_values->MUnn_TVTR_4_Vol_q - LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_4.Vol.q);

//		printf("offset: %d\n", offset);
	}

	// TODO no need to copy if last ASDU
	prev_data_values->MUnn_TCTR_1_Amp_instMag.i = LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_1.Amp.instMag.i;
	prev_data_values->MUnn_TCTR_1_Amp_q = LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_1.Amp.q;
	prev_data_values->MUnn_TCTR_2_Amp_instMag.i = LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_2.Amp.instMag.i;
	prev_data_values->MUnn_TCTR_2_Amp_q = LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_2.Amp.q;
	prev_data_values->MUnn_TCTR_3_Amp_instMag.i = LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_3.Amp.instMag.i;
	prev_data_values->MUnn_TCTR_3_Amp_q = LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_3.Amp.q;
	prev_data_values->MUnn_TCTR_4_Amp_instMag.i = LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_4.Amp.instMag.i;
	prev_data_values->MUnn_TCTR_4_Amp_q = LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_4.Amp.q;
	prev_data_values->MUnn_TVTR_1_Vol_instMag.i = LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_1.Vol.instMag.i;
	prev_data_values->MUnn_TVTR_1_Vol_q = LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_1.Vol.q;
	prev_data_values->MUnn_TVTR_2_Vol_instMag.i = LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_2.Vol.instMag.i;
	prev_data_values->MUnn_TVTR_2_Vol_q = LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_2.Vol.q;
	prev_data_values->MUnn_TVTR_3_Vol_instMag.i = LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_3.Vol.instMag.i;
	prev_data_values->MUnn_TVTR_3_Vol_q = LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_3.Vol.q;
	prev_data_values->MUnn_TVTR_4_Vol_instMag.i = LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_4.Vol.instMag.i;
	prev_data_values->MUnn_TVTR_4_Vol_q = LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_4.Vol.q;

	return offset;
}

int encode_control_LE_IED_MUnn_MSVCB01_compress(unsigned char *buf, struct LE_IED_MUnn_PhsMeas1 *prev_data_values, short ASDUCount) {
	return encode_LE_IED_MUnn_PhsMeas1_compress(buf, prev_data_values, ASDUCount);
}

// returns 1 if buf contains valid packet data
int sv_update_LE_IED_MUnn_MSVCB01_compress(unsigned char *buf) {
	struct LE_IED_MUnn_PhsMeas1 *prev_data_values = NULL;
//	if (LE_IED.S1.MUnn.LN0.MSVCB01.noASDU > 1 && LE_IED.S1.MUnn.LN0.MSVCB01.ASDUCount > 0) {
		prev_data_values = &LE_IED.S1.MUnn.LN0.MSVCB01.prev_dataset_values;
//	}
	int size = encode_control_LE_IED_MUnn_MSVCB01_compress(LE_IED.S1.MUnn.LN0.MSVCB01.ASDU[LE_IED.S1.MUnn.LN0.MSVCB01.ASDUCount].data.data, prev_data_values, LE_IED.S1.MUnn.LN0.MSVCB01.ASDUCount);
	LE_IED.S1.MUnn.LN0.MSVCB01.ASDU[LE_IED.S1.MUnn.LN0.MSVCB01.ASDUCount].data.size = size;

	LE_IED.S1.MUnn.LN0.MSVCB01.ASDU[LE_IED.S1.MUnn.LN0.MSVCB01.ASDUCount].smpCnt = LE_IED.S1.MUnn.LN0.MSVCB01.sampleCountMaster;
	LE_IED.S1.MUnn.LN0.MSVCB01.sampleCountMaster++;

	if (LE_IED.S1.MUnn.LN0.MSVCB01.sampleCountMaster == LE_IED.S1.MUnn.LN0.MSVCB01.ASDU[LE_IED.S1.MUnn.LN0.MSVCB01.ASDUCount].smpRate) {
		LE_IED.S1.MUnn.LN0.MSVCB01.sampleCountMaster = 0;
	}

	if (++LE_IED.S1.MUnn.LN0.MSVCB01.ASDUCount == LE_IED.S1.MUnn.LN0.MSVCB01.noASDU) {
		LE_IED.S1.MUnn.LN0.MSVCB01.ASDUCount = 0;
		return svEncodePacket_compress(&LE_IED.S1.MUnn.LN0.MSVCB01, buf);
	}

	return 0;
}


// decoding functions

int DECODE_CTYPE_QUALITY_compress(unsigned char *buf, CTYPE_QUALITY *value) {
	uint8_t number_of_bytes = 0;
	*value = decode_uint32_t(buf, 4, &number_of_bytes);

	return number_of_bytes;
}
int DECODE_CTYPE_INT32_compress(unsigned char *buf, CTYPE_INT32 *value) {
	uint8_t number_of_bytes = 0;
	*value = decode_int32_t(buf, 4, &number_of_bytes);

	return number_of_bytes;
}
int decode_IEC_61850_9_2LEAV_compress(unsigned char *buf, struct IEC_61850_9_2LEAV *IEC_61850_9_2LEAV) {
	int offset = 0;

	offset += DECODE_CTYPE_INT32_compress(&buf[offset], &IEC_61850_9_2LEAV->i);

	return offset;
}

int decode_LE_IED_MUnn_PhsMeas1_compress(unsigned char *buf, CTYPE_INT16U smpCnt, struct LE_IED_MUnn_PhsMeas1 *LE_IED_MUnn_PhsMeas1, struct LE_IED_MUnn_PhsMeas1 *prev_LE_IED_MUnn_PhsMeas1) {
	int offset = 0;

	offset += decode_IEC_61850_9_2LEAV_compress(&buf[offset], &LE_IED_MUnn_PhsMeas1->MUnn_TCTR_1_Amp_instMag);
	offset += DECODE_CTYPE_QUALITY_compress(&buf[offset], &LE_IED_MUnn_PhsMeas1->MUnn_TCTR_1_Amp_q);
	offset += decode_IEC_61850_9_2LEAV_compress(&buf[offset], &LE_IED_MUnn_PhsMeas1->MUnn_TCTR_2_Amp_instMag);
	offset += DECODE_CTYPE_QUALITY_compress(&buf[offset], &LE_IED_MUnn_PhsMeas1->MUnn_TCTR_2_Amp_q);
	offset += decode_IEC_61850_9_2LEAV_compress(&buf[offset], &LE_IED_MUnn_PhsMeas1->MUnn_TCTR_3_Amp_instMag);
	offset += DECODE_CTYPE_QUALITY_compress(&buf[offset], &LE_IED_MUnn_PhsMeas1->MUnn_TCTR_3_Amp_q);
	offset += decode_IEC_61850_9_2LEAV_compress(&buf[offset], &LE_IED_MUnn_PhsMeas1->MUnn_TCTR_4_Amp_instMag);
	offset += DECODE_CTYPE_QUALITY_compress(&buf[offset], &LE_IED_MUnn_PhsMeas1->MUnn_TCTR_4_Amp_q);
	offset += decode_IEC_61850_9_2LEAV_compress(&buf[offset], &LE_IED_MUnn_PhsMeas1->MUnn_TVTR_1_Vol_instMag);
	offset += DECODE_CTYPE_QUALITY_compress(&buf[offset], &LE_IED_MUnn_PhsMeas1->MUnn_TVTR_1_Vol_q);
	offset += decode_IEC_61850_9_2LEAV_compress(&buf[offset], &LE_IED_MUnn_PhsMeas1->MUnn_TVTR_2_Vol_instMag);
	offset += DECODE_CTYPE_QUALITY_compress(&buf[offset], &LE_IED_MUnn_PhsMeas1->MUnn_TVTR_2_Vol_q);
	offset += decode_IEC_61850_9_2LEAV_compress(&buf[offset], &LE_IED_MUnn_PhsMeas1->MUnn_TVTR_3_Vol_instMag);
	offset += DECODE_CTYPE_QUALITY_compress(&buf[offset], &LE_IED_MUnn_PhsMeas1->MUnn_TVTR_3_Vol_q);
	offset += decode_IEC_61850_9_2LEAV_compress(&buf[offset], &LE_IED_MUnn_PhsMeas1->MUnn_TVTR_4_Vol_instMag);
	offset += DECODE_CTYPE_QUALITY_compress(&buf[offset], &LE_IED_MUnn_PhsMeas1->MUnn_TVTR_4_Vol_q);

	LE_IED_MUnn_PhsMeas1->MUnn_TCTR_1_Amp_instMag.i += prev_LE_IED_MUnn_PhsMeas1->MUnn_TCTR_1_Amp_instMag.i;
	LE_IED_MUnn_PhsMeas1->MUnn_TCTR_2_Amp_instMag.i += prev_LE_IED_MUnn_PhsMeas1->MUnn_TCTR_2_Amp_instMag.i;
	LE_IED_MUnn_PhsMeas1->MUnn_TCTR_3_Amp_instMag.i += prev_LE_IED_MUnn_PhsMeas1->MUnn_TCTR_3_Amp_instMag.i;
	LE_IED_MUnn_PhsMeas1->MUnn_TCTR_4_Amp_instMag.i += prev_LE_IED_MUnn_PhsMeas1->MUnn_TCTR_4_Amp_instMag.i;
	LE_IED_MUnn_PhsMeas1->MUnn_TVTR_1_Vol_instMag.i += prev_LE_IED_MUnn_PhsMeas1->MUnn_TVTR_1_Vol_instMag.i;
	LE_IED_MUnn_PhsMeas1->MUnn_TVTR_2_Vol_instMag.i += prev_LE_IED_MUnn_PhsMeas1->MUnn_TVTR_2_Vol_instMag.i;
	LE_IED_MUnn_PhsMeas1->MUnn_TVTR_3_Vol_instMag.i += prev_LE_IED_MUnn_PhsMeas1->MUnn_TVTR_3_Vol_instMag.i;
	LE_IED_MUnn_PhsMeas1->MUnn_TVTR_4_Vol_instMag.i += prev_LE_IED_MUnn_PhsMeas1->MUnn_TVTR_4_Vol_instMag.i;
	LE_IED_MUnn_PhsMeas1->MUnn_TCTR_1_Amp_q += prev_LE_IED_MUnn_PhsMeas1->MUnn_TCTR_1_Amp_q;
	LE_IED_MUnn_PhsMeas1->MUnn_TCTR_2_Amp_q += prev_LE_IED_MUnn_PhsMeas1->MUnn_TCTR_2_Amp_q;
	LE_IED_MUnn_PhsMeas1->MUnn_TCTR_3_Amp_q += prev_LE_IED_MUnn_PhsMeas1->MUnn_TCTR_3_Amp_q;
	LE_IED_MUnn_PhsMeas1->MUnn_TCTR_4_Amp_q += prev_LE_IED_MUnn_PhsMeas1->MUnn_TCTR_4_Amp_q;
	LE_IED_MUnn_PhsMeas1->MUnn_TVTR_1_Vol_q += prev_LE_IED_MUnn_PhsMeas1->MUnn_TVTR_1_Vol_q;
	LE_IED_MUnn_PhsMeas1->MUnn_TVTR_2_Vol_q += prev_LE_IED_MUnn_PhsMeas1->MUnn_TVTR_2_Vol_q;
	LE_IED_MUnn_PhsMeas1->MUnn_TVTR_3_Vol_q += prev_LE_IED_MUnn_PhsMeas1->MUnn_TVTR_3_Vol_q;
	LE_IED_MUnn_PhsMeas1->MUnn_TVTR_4_Vol_q += prev_LE_IED_MUnn_PhsMeas1->MUnn_TVTR_4_Vol_q;

//	printf("decode offset: %d\n", offset);

	return offset;
}

void svDecodeDataset_compress(unsigned char *dataset, int datasetLength, int ASDU, unsigned char *svID, int svIDLength, CTYPE_INT16U smpCnt) {
	if (svIDLength == 9 && strncmp((const char *) svID, "000MU0001", svIDLength) == 0) {
		if (ASDU == 0) {
			decode_LE_IED_MUnn_PhsMeas1(dataset, smpCnt, &LE_IED_RECV.S1.MUnn.IEC_61850_9_2LETCTR_1.sv_inputs_MSVCB01.LE_IED_MUnn_PhsMeas1[ASDU]);
		}
		else {
			decode_LE_IED_MUnn_PhsMeas1_compress(dataset, smpCnt, &LE_IED_RECV.S1.MUnn.IEC_61850_9_2LETCTR_1.sv_inputs_MSVCB01.LE_IED_MUnn_PhsMeas1[ASDU], &LE_IED_RECV.S1.MUnn.IEC_61850_9_2LETCTR_1.sv_inputs_MSVCB01.LE_IED_MUnn_PhsMeas1[ASDU - 1]);
		}
		LE_IED_RECV.S1.MUnn.IEC_61850_9_2LETCTR_1.sv_inputs_MSVCB01.smpCnt = smpCnt;
		if (LE_IED_RECV.S1.MUnn.IEC_61850_9_2LETCTR_1.sv_inputs_MSVCB01.datasetDecodeDone != NULL) {
			LE_IED_RECV.S1.MUnn.IEC_61850_9_2LETCTR_1.sv_inputs_MSVCB01.datasetDecodeDone(smpCnt);
		}
	}
}

int svDecodeASDU_compress(unsigned char *buf, int len, int noASDU, int prev_smpCnt, unsigned char *prev_svID, int *prev_svID_length) {
	unsigned char tag;	// assumes only one byte is used
	int lengthFieldSize;
	int lengthValue;
	int offsetForNonSequence;
	unsigned char *svID = NULL;
	int svIDLength = 0;
    int smpCnt = -1;

	int i = 0;
    for (i = 0; i < len;) {
		tag = (unsigned char) buf[i];
		lengthFieldSize = getLengthFieldSize((unsigned char) buf[i + 1]);
		lengthValue = decodeLength((unsigned char *) &buf[i + 1]);
		offsetForNonSequence = 1 + lengthFieldSize + lengthValue;

		//printf("\ttag: %x, noASDU: %u, lengthFieldSize: %i, lengthValue: %i, offset: %i\n", tag, noASDU, lengthFieldSize, lengthValue, offsetForNonSequence);

		switch (tag) {
			case SV_TAG_SVID:
				svID = &buf[i + 1 + lengthFieldSize];
				svIDLength = lengthValue;

				prev_svID = svID;
				*prev_svID_length = lengthValue;
				break;
			case SV_TAG_DATSET:

				break;
			case SV_TAG_SMPCNT:
				ber_decode_integer(&buf[i + 1 + lengthFieldSize], lengthValue, &smpCnt, SV_GET_LENGTH_INT16U);
				break;
			case SV_TAG_CONFREV:

				break;
			case SV_TAG_REFRTM:

				break;
			case SV_TAG_SMPSYNCH:

				break;
			case SV_TAG_SMPRATE:

				break;
			case SV_TAG_SEQUENCEOFDATA:
				if (svID != NULL) {
					svDecodeDataset_compress(&buf[i + 1 + lengthFieldSize], lengthValue, noASDU, svID, svIDLength, smpCnt);
				}
				else if (prev_svID != NULL) {
					svDecodeDataset_compress(&buf[i + 1 + lengthFieldSize], lengthValue, noASDU, prev_svID, *prev_svID_length, smpCnt);
				}
				break;
			default:
				break;
		}

		i += offsetForNonSequence;
	}
    return smpCnt;
}

void svDecodeAPDU_compress(unsigned char *buf, int len, unsigned int ASDU, unsigned int totalASDUs) {
	unsigned char tag = (unsigned char) buf[0];	// assumes only one byte is used
	int lengthFieldSize = getLengthFieldSize((unsigned char) buf[1]);
	int lengthValue = decodeLength((unsigned char *) &buf[1]);
	int offsetForSequence = 1 + lengthFieldSize;
	int offsetForNonSequence = 1 + lengthFieldSize + lengthValue;
	unsigned int noASDU = 0;
	int prev_smpCnt = 0;
	unsigned char *prev_svID = NULL;
	int prev_svID_length = 0;
	int ret = 0;
	//static unsigned int ASDU = 0;

	//printf("tag: %x, ASDU: %u,  totalASDUs: %u, lengthFieldSize: %i, lengthValue: %i, offset: %i\n", tag, ASDU, totalASDUs, lengthFieldSize, lengthValue, offsetForNonSequence);

	switch (tag) {
		case SV_TAG_SAVPDU:
			svDecodeAPDU_compress(&buf[offsetForSequence], lengthValue, ASDU, totalASDUs);
			break;
		case SV_TAG_NOASDU:
			noASDU = (unsigned int) buf[1 + lengthFieldSize];	// assuming noASDU is < 126
			//ASDU = 0;
			svDecodeAPDU_compress(&buf[offsetForNonSequence], len - offsetForNonSequence, ASDU, noASDU);
			break;
		case SV_TAG_SEQUENCEOFASDU:
			svDecodeAPDU_compress(&buf[offsetForSequence], lengthValue, ASDU, totalASDUs);
			break;
		case SV_TAG_ASDU:
			ret = svDecodeASDU_compress(&buf[offsetForSequence], lengthValue, ASDU, prev_smpCnt, prev_svID, &prev_svID_length);
			if (ret > 0) {
				prev_smpCnt = ret;
			}
			else {
				prev_smpCnt++;
			}
			ASDU++;

			// process any more ASDUs, until max number
			if (ASDU < totalASDUs) {
				svDecodeAPDU_compress(&buf[offsetForNonSequence], len - offsetForNonSequence, ASDU, totalASDUs);
			}
			break;
		default:
			break;
	}
}

void svDecode_compress(unsigned char *buf, int len) {
	int offset = 16;   // start of 'length' field in payload

	// check for VLAN tag
	if (buf[12] == 0x81 && buf[13] == 0x00) {
		offset = 20;
	}

	unsigned short APDULength = ((buf[offset] << 8) | buf[offset + 1]) - 8;    // must use length in PDU because total bytes (len) may contain CRC

	svDecodeAPDU_compress(&buf[offset + 6], APDULength, 0, 0);    // cuts out frame header
}
