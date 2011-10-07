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

//import processing.opengl.*;

import java.io.*;
import java.net.*;
import processing.net.*;

final float MOUSE_OVER_LINE_DISTANCE_THRESHOLD = 5.0;
final int OFFSET_ORIGINAL = 60;
final int X_START = 150;
final int Y_START = 150;
final int X_MAX = 800;
final int Y_MAX = 600;
final int Y_SECOND_ROW = 175;

final color redPhaseA = color(180, 33, 38);      // RGB values
final color yellowPhaseB = color(222, 215, 20);
final color bluePhaseC = color(36, 78, 198);
final color colorPhaseMap[] = {
  redPhaseA, yellowPhaseB, bluePhaseC
};

PVector signal[] = new PVector[3];
PVector pos[] = new PVector[3];
PVector neg[] = new PVector[3];
PVector zero[] = new PVector[3];

float magA = 0.0;
float magB = 0.0;
float magC = 0.0;
float phaseA = 0.0;
float phaseB = 0.0;
float phaseC = 0.0;

float scalePhasors = 1.0;
PFont font;

Socket socket = null;
PrintWriter out = null;
BufferedReader in = null;
String input;
float data[];

void initVariables() {
  for (int i = 0; i < 3; i++) {
    signal[i] = new PVector(0.0, 0.0);
    pos[i] = new PVector(0.0, 0.0);
    neg[i] = new PVector(0.0, 0.0);
    zero[i] = new PVector(0.0, 0.0);
  }
}

PVector rotateAlpha(PVector pv) {
  float magnitude = pv.mag();
  float phase = atan2(pv.get().y, pv.get().x) + radians(120);

  return new PVector(magnitude*cos(phase), magnitude*sin(phase));
}

PVector rotateAlphaNeg(PVector pv) {
  float magnitude = pv.mag();
  float phase = atan2(pv.get().y, pv.get().x) + radians(-120);

  return new PVector(magnitude*cos(phase), magnitude*sin(phase));
}

void setVariables() {
  signal[0].set(magA*cos(radians(phaseA)), magA*sin(radians(phaseA)), 0.0);
  signal[1].set(magB*cos(radians(phaseB)), magB*sin(radians(phaseB)), 0.0);
  signal[2].set(magC*cos(radians(phaseC)), magC*sin(radians(phaseC)), 0.0);

  float posX = signal[0].get().x + rotateAlpha(signal[1]).get().x + rotateAlpha(rotateAlpha(signal[2])).get().x;
  float posY = signal[0].get().y + rotateAlpha(signal[1]).get().y + rotateAlpha(rotateAlpha(signal[2])).get().y;

  float negX = signal[0].get().x + rotateAlpha(rotateAlpha(signal[1])).get().x + rotateAlpha(signal[2]).get().x;
  float negY = signal[0].get().y + rotateAlpha(rotateAlpha(signal[1])).get().y + rotateAlpha(signal[2]).get().y;



  pos[0].set(posX, posY, 0.0);
  pos[0].div(3);
  PVector pos2 = rotateAlphaNeg(pos[0]);        // awkward workaround for .js
  pos[1].set(pos2.get().x, pos2.get().y, 0.0);
  PVector pos3 = rotateAlpha(pos[0]);
  pos[2].set(pos3.get().x, pos3.get().y, 0.0);

  neg[0].set(negX, negY, 0.0);
  neg[0].div(3);
  PVector neg2 = rotateAlpha(neg[0]);        // awkward workaround for .js
  neg[1].set(neg2.get().x, neg2.get().y, 0.0);
  PVector neg3 = rotateAlphaNeg(neg[0]);
  neg[2].set(neg3.get().x, neg3.get().y, 0.0);



  for (int i = 0; i < 3; i++) {
    zero[i].set(signal[0].get().x + signal[1].get().x + signal[2].get().x, signal[0].get().y + signal[1].get().y + signal[2].get().y, 0.0);
    zero[i].div(3);
  }
}

boolean mouseIsOverLine(float x1, float y1, float x2, float y2) {
  float d = dist(x1, y1, x2, y2);
  float d1 = dist(x1, y1, mouseX, mouseY);
  float d2 = dist(x2, y2, mouseX, mouseY);

  // distance between vertices must be similar to sum of distances from each vertex to mouse
  if (d1 + d2 < d + MOUSE_OVER_LINE_DISTANCE_THRESHOLD) {
    return true;
  }

  return false;
}

// offset defines which result set is passed
void drawPhasors(PVector[] vectors, boolean autoRotate, int x, int y) {
  float m = 0.0;
  float ang = 0.0;
  PVector pv;

  for (int j = 0; j < 3; j++) {
    pv = vectors[j];
    m = scalePhasors * pv.mag();
    ang = atan2(pv.get().y, pv.get().x);

    strokeWeight(OFFSET_ORIGINAL / 10.0);
    stroke(colorPhaseMap[j], 100/*OFFSET_ORIGINAL * 1.5*/);
    line(x, y, x + m*cos(ang), y - m*sin(ang));    // note: y-axis is "upside-down" in processing

      if (pv.mag() > 10) {
      fill(210);
      text(nfc(pv.mag(), 1) + ", " + nfc(degrees(ang), 1) + "°", x + m*cos(ang), y - m*sin(ang));
    }
  }
}

void setup() {
  size(X_MAX, Y_MAX/*, OPENGL*/);
  background(0);
  randomSeed(0);
  //strokeWeight(2);
  font = createFont("SansSerif.plain", 9);
  textFont(font);
  textSize(14);
  textLeading(10);
  textAlign(CENTER);
  smooth();
  colorMode(HSB);

  initGUI();
  initVariables();

  //frameRate(15);

  // Connect to the server's IP address and port
  try {
    socket = new Socket("127.0.0.1", 12345);
    out = new PrintWriter(socket.getOutputStream(), true);
    in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
  } 
  catch (UnknownHostException e) {
    System.err.println("Don't know about host");
    System.exit(1);
  } 
  catch (IOException e) {
    System.err.println("Couldn't get I/O for the connection to");
    System.exit(1);
  }
}

void draw() {
  boolean gotPhasors = false;

  // Receive data from server
  try {
    while (in.ready ()) {
      String input = in.readLine();

      if (gotPhasors == false) {
        data = float(split(input, ' ')); // Split values into an array
        //System.out.println(data[0] + " " + data[1] + " " + data[2] + " " + data[3] + " " + data[4] + " " + data[5]);

        magA = data[0];
        phaseA = data[1];
        magB = data[2];
        phaseB = data[3];
        magC = data[4];
        phaseC = data[5];

        gotPhasors = true;
      }
    }
  } 
  catch (IOException e) {
    System.out.println("Read failed");
    System.exit(1);
  }

  background(0);
  setVariables();

  // draw grid
  stroke(20);
  strokeWeight(1);
  line(0, Y_START, X_MAX, Y_START);
  line(0, Y_START + 275, X_MAX, Y_START + 275);

  line(X_START, 0, X_START, X_MAX);
  line(X_START + 250, 0, X_START + 250, X_MAX);
  line(X_START + 500, 0, X_START + 500, X_MAX);
  //line(X_START + 550, 0, X_START + 550, X_MAX);

  fill(210);
  text("input phasors", X_START, Y_START + 150);
  text("positive seq", X_START, Y_START + 425);
  text("negative seq", X_START + 250, Y_START + 425);
  text("zero seq", X_START + 500, Y_START + 425);

  drawPhasors(signal, false, X_START, Y_START);
  drawPhasors(pos, true, X_START, Y_START + 275);
  drawPhasors(neg, true, X_START + 250, Y_START + 275);
  drawPhasors(zero, false, X_START + 500, Y_START + 275);
}

