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

package scdCodeGenerator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class CFile {
	public final String C_PATH = "..\\c\\src\\";
	public final String LICENSE_PATH = "src\\scdCodeGenerator\\license.txt";
	public String filename;
	public String includes;
	
	public CFile(String filename, String includes) {
		this.filename = filename;
		this.includes = includes;
	}
	
	public abstract void saveFile();

	public void saveFile(String fileText) {
		
		try {
			File f = new File(C_PATH + filename);
			FileWriter fw = new FileWriter(f);
			
			File copyrightTextFile = new File(LICENSE_PATH);
			//FileReader fr = new FileReader(copyrightTextFile);
			FileInputStream fis  = new FileInputStream(copyrightTextFile);
		    BufferedReader in = new BufferedReader(new InputStreamReader(fis));
		    
			if (f.exists()) {
				f.delete();
			}
			
			String line;
			while ((line = in.readLine()) != null) {
				fw.append(line + "\n");
			}
			fw.append("\n" + fileText.toString());
			fw.close();
			in.close();
		}
		catch (IOException e) {
			System.out.println("IO exception: " + e);
		}
	}
}
