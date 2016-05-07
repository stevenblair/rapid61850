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

#include "gseEncodeBasic.h"
#include "ied.h"
#include "gseEncode.h"




int ber_get_length_IEC_61850_9_2LEAV(struct IEC_61850_9_2LEAV *IEC_61850_9_2LEAV) {
	int total = 0;
	int len = 0;

	len = BER_GET_LENGTH_CTYPE_INT32(&IEC_61850_9_2LEAV->i);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_IEC_61850_9_2LEAV(unsigned char *buf, struct IEC_61850_9_2LEAV *IEC_61850_9_2LEAV) {
	int offset = 0;

	buf[offset++] = 0xA2;
	offset += encodeLength(&buf[offset], ber_get_length_IEC_61850_9_2LEAV(IEC_61850_9_2LEAV));

	offset += BER_ENCODE_CTYPE_INT32(&buf[offset], &IEC_61850_9_2LEAV->i);

	return offset;
}
int ber_get_length_IEC_61850_9_2LEsVCAmp(struct IEC_61850_9_2LEsVCAmp *IEC_61850_9_2LEsVCAmp) {
	int total = 0;
	int len = 0;

	len = BER_GET_LENGTH_CTYPE_FLOAT32(&IEC_61850_9_2LEsVCAmp->scaleFactor);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_FLOAT32(&IEC_61850_9_2LEsVCAmp->offset);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_IEC_61850_9_2LEsVCAmp(unsigned char *buf, struct IEC_61850_9_2LEsVCAmp *IEC_61850_9_2LEsVCAmp) {
	int offset = 0;

	buf[offset++] = 0xA2;
	offset += encodeLength(&buf[offset], ber_get_length_IEC_61850_9_2LEsVCAmp(IEC_61850_9_2LEsVCAmp));

	offset += BER_ENCODE_CTYPE_FLOAT32(&buf[offset], &IEC_61850_9_2LEsVCAmp->scaleFactor);
	offset += BER_ENCODE_CTYPE_FLOAT32(&buf[offset], &IEC_61850_9_2LEsVCAmp->offset);

	return offset;
}
int ber_get_length_IEC_61850_9_2LEsVCVol(struct IEC_61850_9_2LEsVCVol *IEC_61850_9_2LEsVCVol) {
	int total = 0;
	int len = 0;

	len = BER_GET_LENGTH_CTYPE_FLOAT32(&IEC_61850_9_2LEsVCVol->scaleFactor);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_FLOAT32(&IEC_61850_9_2LEsVCVol->offset);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_IEC_61850_9_2LEsVCVol(unsigned char *buf, struct IEC_61850_9_2LEsVCVol *IEC_61850_9_2LEsVCVol) {
	int offset = 0;

	buf[offset++] = 0xA2;
	offset += encodeLength(&buf[offset], ber_get_length_IEC_61850_9_2LEsVCVol(IEC_61850_9_2LEsVCVol));

	offset += BER_ENCODE_CTYPE_FLOAT32(&buf[offset], &IEC_61850_9_2LEsVCVol->scaleFactor);
	offset += BER_ENCODE_CTYPE_FLOAT32(&buf[offset], &IEC_61850_9_2LEsVCVol->offset);

	return offset;
}
int ber_get_length_IEC_61850_9_2LESAVAmp(struct IEC_61850_9_2LESAVAmp *IEC_61850_9_2LESAVAmp) {
	int total = 0;
	int len = 0;

	len = ber_get_length_IEC_61850_9_2LEAV(&IEC_61850_9_2LESAVAmp->instMag);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_QUALITY(&IEC_61850_9_2LESAVAmp->q);
	total += len + getLengthBytes(len) + 1;
	len = ber_get_length_IEC_61850_9_2LEsVCAmp(&IEC_61850_9_2LESAVAmp->sVC);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_IEC_61850_9_2LESAVAmp(unsigned char *buf, struct IEC_61850_9_2LESAVAmp *IEC_61850_9_2LESAVAmp) {
	int offset = 0;

	buf[offset++] = 0xA2;
	offset += encodeLength(&buf[offset], ber_get_length_IEC_61850_9_2LESAVAmp(IEC_61850_9_2LESAVAmp));

	offset += ber_encode_IEC_61850_9_2LEAV(&buf[offset], &IEC_61850_9_2LESAVAmp->instMag);
	offset += BER_ENCODE_CTYPE_QUALITY(&buf[offset], &IEC_61850_9_2LESAVAmp->q);
	offset += ber_encode_IEC_61850_9_2LEsVCAmp(&buf[offset], &IEC_61850_9_2LESAVAmp->sVC);

	return offset;
}
int ber_get_length_IEC_61850_9_2LESAVVol(struct IEC_61850_9_2LESAVVol *IEC_61850_9_2LESAVVol) {
	int total = 0;
	int len = 0;

	len = ber_get_length_IEC_61850_9_2LEAV(&IEC_61850_9_2LESAVVol->instMag);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_QUALITY(&IEC_61850_9_2LESAVVol->q);
	total += len + getLengthBytes(len) + 1;
	len = ber_get_length_IEC_61850_9_2LEsVCVol(&IEC_61850_9_2LESAVVol->sVC);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_IEC_61850_9_2LESAVVol(unsigned char *buf, struct IEC_61850_9_2LESAVVol *IEC_61850_9_2LESAVVol) {
	int offset = 0;

	buf[offset++] = 0xA2;
	offset += encodeLength(&buf[offset], ber_get_length_IEC_61850_9_2LESAVVol(IEC_61850_9_2LESAVVol));

	offset += ber_encode_IEC_61850_9_2LEAV(&buf[offset], &IEC_61850_9_2LESAVVol->instMag);
	offset += BER_ENCODE_CTYPE_QUALITY(&buf[offset], &IEC_61850_9_2LESAVVol->q);
	offset += ber_encode_IEC_61850_9_2LEsVCVol(&buf[offset], &IEC_61850_9_2LESAVVol->sVC);

	return offset;
}
int ber_get_length_IEC_61850_9_2LEINC(struct IEC_61850_9_2LEINC *IEC_61850_9_2LEINC) {
	int total = 0;
	int len = 0;

	len = BER_GET_LENGTH_CTYPE_INT32(&IEC_61850_9_2LEINC->ctlVal);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_INT32(&IEC_61850_9_2LEINC->stVal);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_QUALITY(&IEC_61850_9_2LEINC->q);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_TIMESTAMP(&IEC_61850_9_2LEINC->t);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_IEC_61850_9_2LEINC(unsigned char *buf, struct IEC_61850_9_2LEINC *IEC_61850_9_2LEINC) {
	int offset = 0;

	buf[offset++] = 0xA2;
	offset += encodeLength(&buf[offset], ber_get_length_IEC_61850_9_2LEINC(IEC_61850_9_2LEINC));

	offset += BER_ENCODE_CTYPE_INT32(&buf[offset], &IEC_61850_9_2LEINC->ctlVal);
	offset += BER_ENCODE_CTYPE_INT32(&buf[offset], &IEC_61850_9_2LEINC->stVal);
	offset += BER_ENCODE_CTYPE_QUALITY(&buf[offset], &IEC_61850_9_2LEINC->q);
	offset += BER_ENCODE_CTYPE_TIMESTAMP(&buf[offset], &IEC_61850_9_2LEINC->t);

	return offset;
}
int ber_get_length_LE_IED_MUnn_PhsMeas1() {
	int total = 0;
	int len = 0;

	len = ber_get_length_IEC_61850_9_2LEAV(&LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_1.Amp.instMag);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_QUALITY(&LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_1.Amp.q);
	total += len + getLengthBytes(len) + 1;
	len = ber_get_length_IEC_61850_9_2LEAV(&LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_2.Amp.instMag);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_QUALITY(&LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_2.Amp.q);
	total += len + getLengthBytes(len) + 1;
	len = ber_get_length_IEC_61850_9_2LEAV(&LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_3.Amp.instMag);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_QUALITY(&LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_3.Amp.q);
	total += len + getLengthBytes(len) + 1;
	len = ber_get_length_IEC_61850_9_2LEAV(&LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_4.Amp.instMag);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_QUALITY(&LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_4.Amp.q);
	total += len + getLengthBytes(len) + 1;
	len = ber_get_length_IEC_61850_9_2LEAV(&LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_1.Vol.instMag);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_QUALITY(&LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_1.Vol.q);
	total += len + getLengthBytes(len) + 1;
	len = ber_get_length_IEC_61850_9_2LEAV(&LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_2.Vol.instMag);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_QUALITY(&LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_2.Vol.q);
	total += len + getLengthBytes(len) + 1;
	len = ber_get_length_IEC_61850_9_2LEAV(&LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_3.Vol.instMag);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_QUALITY(&LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_3.Vol.q);
	total += len + getLengthBytes(len) + 1;
	len = ber_get_length_IEC_61850_9_2LEAV(&LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_4.Vol.instMag);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_QUALITY(&LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_4.Vol.q);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_LE_IED_MUnn_PhsMeas1(unsigned char *buf) {
	int offset = 0;

	offset += ber_encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_1.Amp.instMag);
	offset += BER_ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_1.Amp.q);
	offset += ber_encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_2.Amp.instMag);
	offset += BER_ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_2.Amp.q);
	offset += ber_encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_3.Amp.instMag);
	offset += BER_ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_3.Amp.q);
	offset += ber_encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_4.Amp.instMag);
	offset += BER_ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_4.Amp.q);
	offset += ber_encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_1.Vol.instMag);
	offset += BER_ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_1.Vol.q);
	offset += ber_encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_2.Vol.instMag);
	offset += BER_ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_2.Vol.q);
	offset += ber_encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_3.Vol.instMag);
	offset += BER_ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_3.Vol.q);
	offset += ber_encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_4.Vol.instMag);
	offset += BER_ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_4.Vol.q);

	return offset;
}
int ber_get_length_LE_IED_MUnn_PhsMeas2() {
	int total = 0;
	int len = 0;

	len = ber_get_length_IEC_61850_9_2LEAV(&LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_5.Amp.instMag);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_QUALITY(&LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_5.Amp.q);
	total += len + getLengthBytes(len) + 1;
	len = ber_get_length_IEC_61850_9_2LEAV(&LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_6.Amp.instMag);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_QUALITY(&LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_6.Amp.q);
	total += len + getLengthBytes(len) + 1;
	len = ber_get_length_IEC_61850_9_2LEAV(&LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_7.Amp.instMag);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_QUALITY(&LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_7.Amp.q);
	total += len + getLengthBytes(len) + 1;
	len = ber_get_length_IEC_61850_9_2LEAV(&LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_8.Amp.instMag);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_QUALITY(&LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_8.Amp.q);
	total += len + getLengthBytes(len) + 1;
	len = ber_get_length_IEC_61850_9_2LEAV(&LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_5.Vol.instMag);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_QUALITY(&LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_5.Vol.q);
	total += len + getLengthBytes(len) + 1;
	len = ber_get_length_IEC_61850_9_2LEAV(&LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_6.Vol.instMag);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_QUALITY(&LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_6.Vol.q);
	total += len + getLengthBytes(len) + 1;
	len = ber_get_length_IEC_61850_9_2LEAV(&LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_7.Vol.instMag);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_QUALITY(&LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_7.Vol.q);
	total += len + getLengthBytes(len) + 1;
	len = ber_get_length_IEC_61850_9_2LEAV(&LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_8.Vol.instMag);
	total += len + getLengthBytes(len) + 1;
	len = BER_GET_LENGTH_CTYPE_QUALITY(&LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_8.Vol.q);
	total += len + getLengthBytes(len) + 1;

	return total;
}
int ber_encode_LE_IED_MUnn_PhsMeas2(unsigned char *buf) {
	int offset = 0;

	offset += ber_encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_5.Amp.instMag);
	offset += BER_ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_5.Amp.q);
	offset += ber_encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_6.Amp.instMag);
	offset += BER_ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_6.Amp.q);
	offset += ber_encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_7.Amp.instMag);
	offset += BER_ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_7.Amp.q);
	offset += ber_encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_8.Amp.instMag);
	offset += BER_ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_8.Amp.q);
	offset += ber_encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_5.Vol.instMag);
	offset += BER_ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_5.Vol.q);
	offset += ber_encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_6.Vol.instMag);
	offset += BER_ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_6.Vol.q);
	offset += ber_encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_7.Vol.instMag);
	offset += BER_ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_7.Vol.q);
	offset += ber_encode_IEC_61850_9_2LEAV(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_8.Vol.instMag);
	offset += BER_ENCODE_CTYPE_QUALITY(&buf[offset], &LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_8.Vol.q);

	return offset;
}


