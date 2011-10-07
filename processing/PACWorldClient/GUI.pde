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
