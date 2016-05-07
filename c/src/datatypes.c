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

#include <stdlib.h>
#include "ctypes.h"
#include "datatypes.h"
#include "ied.h"





void init_IEC_61850_9_2LEAV(struct IEC_61850_9_2LEAV *IEC_61850_9_2LEAV) {
}
void init_IEC_61850_9_2LEsVCAmp(struct IEC_61850_9_2LEsVCAmp *IEC_61850_9_2LEsVCAmp) {
	IEC_61850_9_2LEsVCAmp->scaleFactor = 0.001;
	IEC_61850_9_2LEsVCAmp->offset = 0;
}
void init_IEC_61850_9_2LEsVCVol(struct IEC_61850_9_2LEsVCVol *IEC_61850_9_2LEsVCVol) {
	IEC_61850_9_2LEsVCVol->scaleFactor = 0.01;
	IEC_61850_9_2LEsVCVol->offset = 0;
}
void init_IEC_61850_9_2LESAVAmp(struct IEC_61850_9_2LESAVAmp *IEC_61850_9_2LESAVAmp) {
}
void init_IEC_61850_9_2LESAVVol(struct IEC_61850_9_2LESAVVol *IEC_61850_9_2LESAVVol) {
}
void init_IEC_61850_9_2LEINC(struct IEC_61850_9_2LEINC *IEC_61850_9_2LEINC) {
}
void init_datatypes() {
	init_IEC_61850_9_2LEsVCAmp(&LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_1.Amp.sVC);
	init_IEC_61850_9_2LEsVCAmp(&LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_2.Amp.sVC);
	init_IEC_61850_9_2LEsVCAmp(&LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_3.Amp.sVC);
	init_IEC_61850_9_2LEsVCAmp(&LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_4.Amp.sVC);
	init_IEC_61850_9_2LEsVCVol(&LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_1.Vol.sVC);
	init_IEC_61850_9_2LEsVCVol(&LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_2.Vol.sVC);
	init_IEC_61850_9_2LEsVCVol(&LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_3.Vol.sVC);
	init_IEC_61850_9_2LEsVCVol(&LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_4.Vol.sVC);
	init_IEC_61850_9_2LEsVCAmp(&LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_5.Amp.sVC);
	init_IEC_61850_9_2LEsVCAmp(&LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_6.Amp.sVC);
	init_IEC_61850_9_2LEsVCAmp(&LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_7.Amp.sVC);
	init_IEC_61850_9_2LEsVCAmp(&LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_8.Amp.sVC);
	init_IEC_61850_9_2LEsVCVol(&LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_5.Vol.sVC);
	init_IEC_61850_9_2LEsVCVol(&LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_6.Vol.sVC);
	init_IEC_61850_9_2LEsVCVol(&LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_7.Vol.sVC);
	init_IEC_61850_9_2LEsVCVol(&LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_8.Vol.sVC);
	init_IEC_61850_9_2LEsVCAmp(&LE_IED_RECV.S1.MUnn.IEC_61850_9_2LETCTR_1.Amp.sVC);
	init_IEC_61850_9_2LEsVCAmp(&LE_IED_RECV.S1.MUnn.IEC_61850_9_2LETCTR_2.Amp.sVC);
	init_IEC_61850_9_2LEsVCAmp(&LE_IED_RECV.S1.MUnn.IEC_61850_9_2LETCTR_3.Amp.sVC);
	init_IEC_61850_9_2LEsVCAmp(&LE_IED_RECV.S1.MUnn.IEC_61850_9_2LETCTR_4.Amp.sVC);
	init_IEC_61850_9_2LEsVCVol(&LE_IED_RECV.S1.MUnn.IEC_61850_9_2LETVTR_1.Vol.sVC);
	init_IEC_61850_9_2LEsVCVol(&LE_IED_RECV.S1.MUnn.IEC_61850_9_2LETVTR_2.Vol.sVC);
	init_IEC_61850_9_2LEsVCVol(&LE_IED_RECV.S1.MUnn.IEC_61850_9_2LETVTR_3.Vol.sVC);
	init_IEC_61850_9_2LEsVCVol(&LE_IED_RECV.S1.MUnn.IEC_61850_9_2LETVTR_4.Vol.sVC);
}

