import processing.core.*; 
import processing.xml.*; 

import java.io.*; 
import java.net.*; 
import processing.net.*; 

import controlP5.*; 

import java.applet.*; 
import java.awt.Dimension; 
import java.awt.Frame; 
import java.awt.event.MouseEvent; 
import java.awt.event.KeyEvent; 
import java.awt.event.FocusEvent; 
import java.awt.Image; 
import java.io.*; 
import java.net.*; 
import java.text.*; 
import java.util.*; 
import java.util.zip.*; 
import java.util.regex.*; 

public class PACWorldClient extends PApplet {

//import processing.opengl.*;





final float MOUSE_OVER_LINE_DISTANCE_THRESHOLD = 5.0f;
final int OFFSET_ORIGINAL = 60;
final int X_START = 150;
final int Y_START = 150;
final int X_MAX = 800;
final int Y_MAX = 600;
final int Y_SECOND_ROW = 175;

final int redPhaseA = color(180, 33, 38);      // RGB values
final int yellowPhaseB = color(222, 215, 20);
final int bluePhaseC = color(36, 78, 198);
final int colorPhaseMap[] = {
  redPhaseA, yellowPhaseB, bluePhaseC
};

PVector signal[] = new PVector[3];
PVector pos[] = new PVector[3];
PVector neg[] = new PVector[3];
PVector zero[] = new PVector[3];

float magA = 0.0f;
float magB = 0.0f;
float magC = 0.0f;
float phaseA = 0.0f;
float phaseB = 0.0f;
float phaseC = 0.0f;

float scalePhasors = 1.0f;
PFont font;

Socket socket = null;
PrintWriter out = null;
BufferedReader in = null;
String input;
float data[];

public void initVariables() {
  for (int i = 0; i < 3; i++) {
    signal[i] = new PVector(0.0f, 0.0f);
    pos[i] = new PVector(0.0f, 0.0f);
    neg[i] = new PVector(0.0f, 0.0f);
    zero[i] = new PVector(0.0f, 0.0f);
  }
}

public PVector rotateAlpha(PVector pv) {
  float magnitude = pv.mag();
  float phase = atan2(pv.get().y, pv.get().x) + radians(120);

  return new PVector(magnitude*cos(phase), magnitude*sin(phase));
}

public PVector rotateAlphaNeg(PVector pv) {
  float magnitude = pv.mag();
  float phase = atan2(pv.get().y, pv.get().x) + radians(-120);

  return new PVector(magnitude*cos(phase), magnitude*sin(phase));
}

public void setVariables() {
  signal[0].set(magA*cos(radians(phaseA)), magA*sin(radians(phaseA)), 0.0f);
  signal[1].set(magB*cos(radians(phaseB)), magB*sin(radians(phaseB)), 0.0f);
  signal[2].set(magC*cos(radians(phaseC)), magC*sin(radians(phaseC)), 0.0f);

  float posX = signal[0].get().x + rotateAlpha(signal[1]).get().x + rotateAlpha(rotateAlpha(signal[2])).get().x;
  float posY = signal[0].get().y + rotateAlpha(signal[1]).get().y + rotateAlpha(rotateAlpha(signal[2])).get().y;

  float negX = signal[0].get().x + rotateAlpha(rotateAlpha(signal[1])).get().x + rotateAlpha(signal[2]).get().x;
  float negY = signal[0].get().y + rotateAlpha(rotateAlpha(signal[1])).get().y + rotateAlpha(signal[2]).get().y;



  pos[0].set(posX, posY, 0.0f);
  pos[0].div(3);
  PVector pos2 = rotateAlphaNeg(pos[0]);        // awkward workaround for .js
  pos[1].set(pos2.get().x, pos2.get().y, 0.0f);
  PVector pos3 = rotateAlpha(pos[0]);
  pos[2].set(pos3.get().x, pos3.get().y, 0.0f);

  neg[0].set(negX, negY, 0.0f);
  neg[0].div(3);
  PVector neg2 = rotateAlpha(neg[0]);        // awkward workaround for .js
  neg[1].set(neg2.get().x, neg2.get().y, 0.0f);
  PVector neg3 = rotateAlphaNeg(neg[0]);
  neg[2].set(neg3.get().x, neg3.get().y, 0.0f);



  for (int i = 0; i < 3; i++) {
    zero[i].set(signal[0].get().x + signal[1].get().x + signal[2].get().x, signal[0].get().y + signal[1].get().y + signal[2].get().y, 0.0f);
    zero[i].div(3);
  }
}

public boolean mouseIsOverLine(float x1, float y1, float x2, float y2) {
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
public void drawPhasors(PVector[] vectors, boolean autoRotate, int x, int y) {
  float m = 0.0f;
  float ang = 0.0f;
  PVector pv;

  for (int j = 0; j < 3; j++) {
    pv = vectors[j];
    m = scalePhasors * pv.mag();
    ang = atan2(pv.get().y, pv.get().x);

    strokeWeight(OFFSET_ORIGINAL / 10.0f);
    stroke(colorPhaseMap[j], 100/*OFFSET_ORIGINAL * 1.5*/);
    line(x, y, x + m*cos(ang), y - m*sin(ang));    // note: y-axis is "upside-down" in processing

      if (pv.mag() > 10) {
      fill(210);
      text(nfc(pv.mag(), 1) + ", " + nfc(degrees(ang), 1) + "\u00b0", x + m*cos(ang), y - m*sin(ang));
    }
  }
}

public void setup() {
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

public void draw() {
  boolean gotPhasors = false;

  // Receive data from server
  try {
    while (in.ready ()) {
      String input = in.readLine();

      if (gotPhasors == false) {
        data = PApplet.parseFloat(split(input, ' ')); // Split values into an array
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

ControlP5 controlP5;

public void initGUI() {
  controlP5 = new ControlP5(this);
  controlP5.addToggle("SendGOOSE", false, 650, 30, 100, 40);
}

public void SendGOOSE(boolean flag) {
  if (flag == true) {
    out.write("1");
    out.flush();
  }
  else {
    out.write("0");
    out.flush();
  }
}
  static public void main(String args[]) {
    PApplet.main(new String[] { "--present", "--bgcolor=#666666", "--stop-color=#cccccc", "PACWorldClient" });
  }
}
