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


int toI(double I, double value) {
	return (CTYPE_INT32) (I * value / ((double) LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_1.Amp.sVC.scaleFactor));
}

int toV(double V, double value) {
	return (CTYPE_INT32) (V * value / ((double) LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_1.Vol.sVC.scaleFactor));
}

double harmonic(double num, double mag, double theta, double phase) {
	return mag * sin((theta + phase) * num);
}

int main() {
	start();    // start IEC 61850 library

	double f_nominal = 50.0;
	double samplesPerCycle = 80.0;
	double f = 50.0;
	double w;
	double Vnom = 11000.0;
	double V = Vnom * sqrt(2) / sqrt(3);
	double Zmag = 8.0;
	double I = V / Zmag;
	double phi = 0.2 * PI;
	double Ts = 1 / (f_nominal * samplesPerCycle);
	double theta = 0.0;
	int t = 0;
	unsigned int muNumber = 0;

	LE_IED.S1.MUnn.LN0.MSVCB01.ASDU[LE_IED.S1.MUnn.LN0.MSVCB01.ASDUCount].smpRate = f_nominal * samplesPerCycle;

	while (1) {
//		LE_IED.S1.MUnn.LN0.MSVCB01.ASDU[0].svID[9] = (char) (((int)'0') + muNumber);
		//phi = (((double) rand()) / ((double) RAND_MAX)) * PI;

		for (t = 0; t < LE_IED.S1.MUnn.LN0.MSVCB01.ASDU[LE_IED.S1.MUnn.LN0.MSVCB01.ASDUCount].smpRate; t++) {
			w = 2 * PI * f;
			theta = w * (((double) t) * Ts);
//			printf("running\n");
//			fflush(stdout);

			LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_1.Vol.instMag.i = toV(V, harmonic(1, 1.0, theta, 0)                   + harmonic(9, muNumber * 0.04, theta, 0)                   + harmonic(11, muNumber * 0.01, theta, 0));
			LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_2.Vol.instMag.i = toV(V, harmonic(1, 1.0, theta, - TWO_PI_OVER_THREE) + harmonic(9, muNumber * 0.02, theta, - TWO_PI_OVER_THREE) + harmonic(13, muNumber * 0.01, theta, - TWO_PI_OVER_THREE));
			LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_3.Vol.instMag.i = toV(V, harmonic(1, 1.0, theta, + TWO_PI_OVER_THREE) + harmonic(9, muNumber * 0.01, theta, + TWO_PI_OVER_THREE) + harmonic(15, muNumber * 0.01, theta, + TWO_PI_OVER_THREE));
			LE_IED.S1.MUnn.IEC_61850_9_2LETVTR_4.Vol.instMag.i = 0;

			LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_1.Amp.instMag.i = toI(I, harmonic(1, 1.0, theta - phi, 0)                   + harmonic(2, muNumber * 0.05, theta - phi, 0)                   + harmonic(3, 0.03, theta - phi, 0) + harmonic(5, 0.10, theta - phi, 0)                   + harmonic(7, 0.05, theta - phi, 0)                   + harmonic(9, 0.03, theta - phi, 0));
			LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_2.Amp.instMag.i = toI(I, harmonic(1, 0.9, theta - phi, - TWO_PI_OVER_THREE) + harmonic(2, muNumber * 0.05, theta - phi, + TWO_PI_OVER_THREE) + harmonic(3, 0.03, theta - phi, 0) + harmonic(5, 0.10, theta - phi, + TWO_PI_OVER_THREE) + harmonic(7, 0.05, theta - phi, - TWO_PI_OVER_THREE) + harmonic(9, 0.03, theta - phi, 0));
			LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_3.Amp.instMag.i = toI(I, harmonic(1, 0.8, theta - phi, + TWO_PI_OVER_THREE) + harmonic(2, muNumber * 0.05, theta - phi, - TWO_PI_OVER_THREE) + harmonic(3, 0.03, theta - phi, 0) + harmonic(5, 0.10, theta - phi, - TWO_PI_OVER_THREE) + harmonic(7, 0.05, theta - phi, + TWO_PI_OVER_THREE) + harmonic(9, 0.03, theta - phi, 0));
			LE_IED.S1.MUnn.IEC_61850_9_2LETCTR_4.Amp.instMag.i = 0;

			interface_sv_update_LE_IED_MUnn_MSVCB01();    // send SV packet

//			usleep(250);
		}

		// simple method to vary Merging Unit number, and phase angle of current waveforms
//		muNumber++;
//		phi += 0.10 * PI;
//		if (muNumber == 1) {
//			muNumber = 0;
//			phi = 0.0;
////			usleep(1000000);//Sleep(1);
//		}

		usleep(1000000);
	}

	return 0;
}
