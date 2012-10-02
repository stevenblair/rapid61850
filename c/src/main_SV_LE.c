/**
 * Rapid-prototyping protection schemes with IEC 61850
 *
 *
 * This is an example main file to implement IEC 61850-9-2LE Sampled Values.
 * Three SV streams are generated.
 *
 * Use the rapid61850 Java code to generate the IEC 61850 code, with "scd_LE.xml" as the SCD file.
 * In ctypes.c, set HIGH_LEVEL_INTERFACE to '1'.
 * Include interface.c and interfaceSendPack.c in the C build. Exclude main.c.
 *
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


#include "iec61850.h"

#include "interface.h"
#include <math.h>
#include <unistd.h>

#define PI					3.1415926535897932384626433832795
#define TWO_PI_OVER_THREE	2.0943951023931954923084289221863


int main() {
	start();    // start IEC 61850 library

	double f_nominal = 50.0;
	double samplesPerCycle = 80.0;
	double f = 50.0;
	double w;
	double Vnom = 11000.0;
	double V = Vnom * sqrt(2) / sqrt(3);
	double Zmag = 5.0;
	double phi = 0.2 * PI;
	double Ts = 1 / (f_nominal * samplesPerCycle);
	double theta = 0.0;
	int t = 0;
	unsigned char muNumber = '1';

	LE_IED.S1.MUnn.LN0.MSVCB01.ASDU[LE_IED.S1.MUnn.LN0.MSVCB01.ASDUCount].smpRate = f_nominal * samplesPerCycle;

	while (1) {
		LE_IED.S1.MUnn.LN0.MSVCB01.ASDU[0].svID[9] = muNumber;
		//phi = (((double) rand()) / ((double) RAND_MAX)) * PI;

		for (t = 0; t < LE_IED.S1.MUnn.LN0.MSVCB01.ASDU[LE_IED.S1.MUnn.LN0.MSVCB01.ASDUCount].smpRate; t++) {
			w = 2 * PI * f;
			theta = w * (((double) t) * Ts);

			LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_1.Vol.instMag.i = (CTYPE_INT32) (V * sin(theta) / ((double) LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_1.Vol.sVC.scaleFactor) + (V * 0.25 * sin(theta * 2) / ((double) LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_1.Vol.sVC.scaleFactor)));
			LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_2.Vol.instMag.i = (CTYPE_INT32) (V * sin(theta - TWO_PI_OVER_THREE) / LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_2.Vol.sVC.scaleFactor) + (V * 0.20 * sin(theta * 3) / ((double) LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_1.Vol.sVC.scaleFactor));
			LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_3.Vol.instMag.i = (CTYPE_INT32) (V * sin(theta + TWO_PI_OVER_THREE) / LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_3.Vol.sVC.scaleFactor) + (V * 0.10 * sin(theta * 5) / ((double) LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_1.Vol.sVC.scaleFactor));
			LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_4.Vol.instMag.i = 0;

			LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_1.Amp.instMag.i = (CTYPE_INT32) ((V / Zmag) * sin(theta - phi) / LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_1.Amp.sVC.scaleFactor);
			LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_2.Amp.instMag.i = (CTYPE_INT32) ((V / Zmag) * sin(theta - phi - TWO_PI_OVER_THREE) / LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_2.Amp.sVC.scaleFactor);
			LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_3.Amp.instMag.i = (CTYPE_INT32) ((V / Zmag) * sin(theta - phi + TWO_PI_OVER_THREE) / LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_3.Amp.sVC.scaleFactor);
			LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_4.Amp.instMag.i = 0;

			sv_update_LE_IED_MUnn_MSVCB01_buf();    // send SV packet
		}

		// simple method to vary Merging Unit number, and phase angle of current waveforms
		muNumber++;
		phi += 0.2 * PI;
		if (muNumber == '4') {
			muNumber = '1';
			phi = 0.0;
		}

		usleep(100000);
	}

	return 0;
}
