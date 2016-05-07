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

#include "svEncodeBasic.h"
#include "ied.h"
#include "svEncode.h"




int encode_IEC_61850_9_2LEAV(unsigned char *buf, struct IEC_61850_9_2LEAV *IEC_61850_9_2LEAV) {
	int offset = 0;

	offset += ENCODE_CTYPE_INT32(&buf[offset], &IEC_61850_9_2LEAV->i);

	return offset;
}
int encode_IEC_61850_9_2LEsVCAmp(unsigned char *buf, struct IEC_61850_9_2LEsVCAmp *IEC_61850_9_2LEsVCAmp) {
	int offset = 0;

	offset += ENCODE_CTYPE_FLOAT32(&buf[offset], &IEC_61850_9_2LEsVCAmp->scaleFactor);
	offset += ENCODE_CTYPE_FLOAT32(&buf[offset], &IEC_61850_9_2LEsVCAmp->offset);

	return offset;
}
int encode_IEC_61850_9_2LEsVCVol(unsigned char *buf, struct IEC_61850_9_2LEsVCVol *IEC_61850_9_2LEsVCVol) {
	int offset = 0;

	offset += ENCODE_CTYPE_FLOAT32(&buf[offset], &IEC_61850_9_2LEsVCVol->scaleFactor);
	offset += ENCODE_CTYPE_FLOAT32(&buf[offset], &IEC_61850_9_2LEsVCVol->offset);

	return offset;
}
int encode_IEC_61850_9_2LESAVAmp(unsigned char *buf, struct IEC_61850_9_2LESAVAmp *IEC_61850_9_2LESAVAmp) {
	int offset = 0;

	offset += encode_IEC_61850_9_2LEAV(&buf[offset], &IEC_61850_9_2LESAVAmp->instMag);
	offset += ENCODE_CTYPE_QUALITY(&buf[offset], &IEC_61850_9_2LESAVAmp->q);
	offset += encode_IEC_61850_9_2LEsVCAmp(&buf[offset], &IEC_61850_9_2LESAVAmp->sVC);

	return offset;
}
int encode_IEC_61850_9_2LESAVVol(unsigned char *buf, struct IEC_61850_9_2LESAVVol *IEC_61850_9_2LESAVVol) {
	int offset = 0;

	offset += encode_IEC_61850_9_2LEAV(&buf[offset], &IEC_61850_9_2LESAVVol->instMag);
	offset += ENCODE_CTYPE_QUALITY(&buf[offset], &IEC_61850_9_2LESAVVol->q);
	offset += encode_IEC_61850_9_2LEsVCVol(&buf[offset], &IEC_61850_9_2LESAVVol->sVC);

	return offset;
}
int encode_IEC_61850_9_2LEINC(unsigned char *buf, struct IEC_61850_9_2LEINC *IEC_61850_9_2LEINC) {
	int offset = 0;

	offset += ENCODE_CTYPE_INT32(&buf[offset], &IEC_61850_9_2LEINC->ctlVal);
	offset += ENCODE_CTYPE_INT32(&buf[offset], &IEC_61850_9_2LEINC->stVal);
	offset += ENCODE_CTYPE_QUALITY(&buf[offset], &IEC_61850_9_2LEINC->q);
	offset += ENCODE_CTYPE_TIMESTAMP(&buf[offset], &IEC_61850_9_2LEINC->t);

	return offset;
}
int encode_LE_IED_MUnn_PhsMeas1(unsigned char *buf) {
	int offset = 0;

	offset += encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_1.Amp.instMag);
	offset += ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_1.Amp.q);
	offset += encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_2.Amp.instMag);
	offset += ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_2.Amp.q);
	offset += encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_3.Amp.instMag);
	offset += ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_3.Amp.q);
	offset += encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_4.Amp.instMag);
	offset += ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_4.Amp.q);
	offset += encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_1.Vol.instMag);
	offset += ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_1.Vol.q);
	offset += encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_2.Vol.instMag);
	offset += ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_2.Vol.q);
	offset += encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_3.Vol.instMag);
	offset += ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_3.Vol.q);
	offset += encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_4.Vol.instMag);
	offset += ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_4.Vol.q);

	return offset;
}
int encode_control_LE_IED_MUnn_MSVCB01(unsigned char *buf) {
	return encode_LE_IED_MUnn_PhsMeas1(buf);
}
int encode_LE_IED_MUnn_PhsMeas2(unsigned char *buf) {
	int offset = 0;

	offset += encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_5.Amp.instMag);
	offset += ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_5.Amp.q);
	offset += encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_6.Amp.instMag);
	offset += ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_6.Amp.q);
	offset += encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_7.Amp.instMag);
	offset += ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_7.Amp.q);
	offset += encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_8.Amp.instMag);
	offset += ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_8.Amp.q);
	offset += encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_5.Vol.instMag);
	offset += ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_5.Vol.q);
	offset += encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_6.Vol.instMag);
	offset += ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_6.Vol.q);
	offset += encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_7.Vol.instMag);
	offset += ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_7.Vol.q);
	offset += encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_8.Vol.instMag);
	offset += ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_8.Vol.q);

	return offset;
}
int encode_control_LE_IED_MUnn_MSVCB02(unsigned char *buf) {
	return encode_LE_IED_MUnn_PhsMeas2(buf);
}


