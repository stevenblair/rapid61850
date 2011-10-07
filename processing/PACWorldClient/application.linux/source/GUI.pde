ControlP5 controlP5;

void initGUI() {
  controlP5 = new ControlP5(this);
  controlP5.addToggle("SendGOOSE", false, 650, 30, 100, 40);
}

void SendGOOSE(boolean flag) {
  if (flag == true) {
    out.write("1");
    out.flush();
  }
  else {
    out.write("0");
    out.flush();
  }
}
