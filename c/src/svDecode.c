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

#include "sv.h"
#include "svDecodeBasic.h"
#include "ied.h"
#include "svDecode.h"




int decode_IEC_61850_9_2LEAV(unsigned char *buf, struct IEC_61850_9_2LEAV *IEC_61850_9_2LEAV) {
	int offset = 0;

	offset += DECODE_CTYPE_INT32(&buf[offset], &IEC_61850_9_2LEAV->i);

	return offset;
}
int decode_IEC_61850_9_2LEsVCAmp(unsigned char *buf, struct IEC_61850_9_2LEsVCAmp *IEC_61850_9_2LEsVCAmp) {
	int offset = 0;

	offset += DECODE_CTYPE_FLOAT32(&buf[offset], &IEC_61850_9_2LEsVCAmp->scaleFactor);
	offset += DECODE_CTYPE_FLOAT32(&buf[offset], &IEC_61850_9_2LEsVCAmp->offset);

	return offset;
}
int decode_IEC_61850_9_2LEsVCVol(unsigned char *buf, struct IEC_61850_9_2LEsVCVol *IEC_61850_9_2LEsVCVol) {
	int offset = 0;

	offset += DECODE_CTYPE_FLOAT32(&buf[offset], &IEC_61850_9_2LEsVCVol->scaleFactor);
	offset += DECODE_CTYPE_FLOAT32(&buf[offset], &IEC_61850_9_2LEsVCVol->offset);

	return offset;
}
int decode_IEC_61850_9_2LESAVAmp(unsigned char *buf, struct IEC_61850_9_2LESAVAmp *IEC_61850_9_2LESAVAmp) {
	int offset = 0;

	offset += decode_IEC_61850_9_2LEAV(&buf[offset], &IEC_61850_9_2LESAVAmp->instMag);
	offset += DECODE_CTYPE_QUALITY(&buf[offset], &IEC_61850_9_2LESAVAmp->q);
	offset += decode_IEC_61850_9_2LEsVCAmp(&buf[offset], &IEC_61850_9_2LESAVAmp->sVC);

	return offset;
}
int decode_IEC_61850_9_2LESAVVol(unsigned char *buf, struct IEC_61850_9_2LESAVVol *IEC_61850_9_2LESAVVol) {
	int offset = 0;

	offset += decode_IEC_61850_9_2LEAV(&buf[offset], &IEC_61850_9_2LESAVVol->instMag);
	offset += DECODE_CTYPE_QUALITY(&buf[offset], &IEC_61850_9_2LESAVVol->q);
	offset += decode_IEC_61850_9_2LEsVCVol(&buf[offset], &IEC_61850_9_2LESAVVol->sVC);

	return offset;
}
int decode_IEC_61850_9_2LEINC(unsigned char *buf, struct IEC_61850_9_2LEINC *IEC_61850_9_2LEINC) {
	int offset = 0;

	offset += DECODE_CTYPE_INT32(&buf[offset], &IEC_61850_9_2LEINC->ctlVal);
	offset += DECODE_CTYPE_INT32(&buf[offset], &IEC_61850_9_2LEINC->stVal);
	offset += DECODE_CTYPE_QUALITY(&buf[offset], &IEC_61850_9_2LEINC->q);
	offset += DECODE_CTYPE_TIMESTAMP(&buf[offset], &IEC_61850_9_2LEINC->t);

	return offset;
}
int decode_LE_IED_MUnn_PhsMeas1(unsigned char *buf, CTYPE_INT16U smpCnt, struct LE_IED_MUnn_PhsMeas1 *LE_IED_MUnn_PhsMeas1) {
	int offset = 0;

	offset += decode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED_MUnn_PhsMeas1->MUnn_TCTR_1_Amp_instMag);
	offset += DECODE_CTYPE_QUALITY(&buf[offset], &LE_IED_MUnn_PhsMeas1->MUnn_TCTR_1_Amp_q);
	offset += decode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED_MUnn_PhsMeas1->MUnn_TCTR_2_Amp_instMag);
	offset += DECODE_CTYPE_QUALITY(&buf[offset], &LE_IED_MUnn_PhsMeas1->MUnn_TCTR_2_Amp_q);
	offset += decode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED_MUnn_PhsMeas1->MUnn_TCTR_3_Amp_instMag);
	offset += DECODE_CTYPE_QUALITY(&buf[offset], &LE_IED_MUnn_PhsMeas1->MUnn_TCTR_3_Amp_q);
	offset += decode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED_MUnn_PhsMeas1->MUnn_TCTR_4_Amp_instMag);
	offset += DECODE_CTYPE_QUALITY(&buf[offset], &LE_IED_MUnn_PhsMeas1->MUnn_TCTR_4_Amp_q);
	offset += decode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED_MUnn_PhsMeas1->MUnn_TVTR_1_Vol_instMag);
	offset += DECODE_CTYPE_QUALITY(&buf[offset], &LE_IED_MUnn_PhsMeas1->MUnn_TVTR_1_Vol_q);
	offset += decode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED_MUnn_PhsMeas1->MUnn_TVTR_2_Vol_instMag);
	offset += DECODE_CTYPE_QUALITY(&buf[offset], &LE_IED_MUnn_PhsMeas1->MUnn_TVTR_2_Vol_q);
	offset += decode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED_MUnn_PhsMeas1->MUnn_TVTR_3_Vol_instMag);
	offset += DECODE_CTYPE_QUALITY(&buf[offset], &LE_IED_MUnn_PhsMeas1->MUnn_TVTR_3_Vol_q);
	offset += decode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED_MUnn_PhsMeas1->MUnn_TVTR_4_Vol_instMag);
	offset += DECODE_CTYPE_QUALITY(&buf[offset], &LE_IED_MUnn_PhsMeas1->MUnn_TVTR_4_Vol_q);

	return offset;
}
int decode_LE_IED_MUnn_PhsMeas2(unsigned char *buf, CTYPE_INT16U smpCnt, struct LE_IED_MUnn_PhsMeas2 *LE_IED_MUnn_PhsMeas2) {
	int offset = 0;

	offset += decode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED_MUnn_PhsMeas2->MUnn_TCTR_5_Amp_instMag);
	offset += DECODE_CTYPE_QUALITY(&buf[offset], &LE_IED_MUnn_PhsMeas2->MUnn_TCTR_5_Amp_q);
	offset += decode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED_MUnn_PhsMeas2->MUnn_TCTR_6_Amp_instMag);
	offset += DECODE_CTYPE_QUALITY(&buf[offset], &LE_IED_MUnn_PhsMeas2->MUnn_TCTR_6_Amp_q);
	offset += decode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED_MUnn_PhsMeas2->MUnn_TCTR_7_Amp_instMag);
	offset += DECODE_CTYPE_QUALITY(&buf[offset], &LE_IED_MUnn_PhsMeas2->MUnn_TCTR_7_Amp_q);
	offset += decode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED_MUnn_PhsMeas2->MUnn_TCTR_8_Amp_instMag);
	offset += DECODE_CTYPE_QUALITY(&buf[offset], &LE_IED_MUnn_PhsMeas2->MUnn_TCTR_8_Amp_q);
	offset += decode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED_MUnn_PhsMeas2->MUnn_TVTR_5_Vol_instMag);
	offset += DECODE_CTYPE_QUALITY(&buf[offset], &LE_IED_MUnn_PhsMeas2->MUnn_TVTR_5_Vol_q);
	offset += decode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED_MUnn_PhsMeas2->MUnn_TVTR_6_Vol_instMag);
	offset += DECODE_CTYPE_QUALITY(&buf[offset], &LE_IED_MUnn_PhsMeas2->MUnn_TVTR_6_Vol_q);
	offset += decode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED_MUnn_PhsMeas2->MUnn_TVTR_7_Vol_instMag);
	offset += DECODE_CTYPE_QUALITY(&buf[offset], &LE_IED_MUnn_PhsMeas2->MUnn_TVTR_7_Vol_q);
	offset += decode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED_MUnn_PhsMeas2->MUnn_TVTR_8_Vol_instMag);
	offset += DECODE_CTYPE_QUALITY(&buf[offset], &LE_IED_MUnn_PhsMeas2->MUnn_TVTR_8_Vol_q);

	return offset;
}

void svDecodeDataset(unsigned char *dataset, int datasetLength, int ASDU, unsigned char *svID, int svIDLength, CTYPE_INT16U smpCnt) {

	if (svIDLength == 9 && strncmp((const char *) svID, "000MU0001", svIDLength) == 0) {
		decode_LE_IED_MUnn_PhsMeas1(dataset, smpCnt, &LE_IED_RECV.S1.MUnn.IEC_61850_9_2LETCTR_1.sv_inputs_MSVCB01.LE_IED_MUnn_PhsMeas1[ASDU]);
		LE_IED_RECV.S1.MUnn.IEC_61850_9_2LETCTR_1.sv_inputs_MSVCB01.smpCnt = smpCnt;
		if (LE_IED_RECV.S1.MUnn.IEC_61850_9_2LETCTR_1.sv_inputs_MSVCB01.datasetDecodeDone != NULL) {
			LE_IED_RECV.S1.MUnn.IEC_61850_9_2LETCTR_1.sv_inputs_MSVCB01.datasetDecodeDone(smpCnt);
		}
	}
	if (svIDLength == 9 && strncmp((const char *) svID, "000MU0101", svIDLength) == 0) {
		decode_LE_IED_MUnn_PhsMeas2(dataset, smpCnt, &LE_IED_RECV.S1.MUnn.IEC_61850_9_2LETCTR_1.sv_inputs_MSVCB02.LE_IED_MUnn_PhsMeas2);
		LE_IED_RECV.S1.MUnn.IEC_61850_9_2LETCTR_1.sv_inputs_MSVCB02.smpCnt = smpCnt;
		if (LE_IED_RECV.S1.MUnn.IEC_61850_9_2LETCTR_1.sv_inputs_MSVCB02.datasetDecodeDone != NULL) {
			LE_IED_RECV.S1.MUnn.IEC_61850_9_2LETCTR_1.sv_inputs_MSVCB02.datasetDecodeDone(smpCnt);
		}
	}
}


