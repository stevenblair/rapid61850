/**
 * Rapid-prototyping protection schemes with IEC 61850
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

package rapid61850;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class CFile {
	public final String C_PATH = ".." + File.separator + "c" + File.separator + "src" + File.separator;                 // defines the output location for generated C code
	public final String LICENSE_PATH = "src" + File.separator + "rapid61850" + File.separator + "license.txt";
	public String filename;
	public List<String> includesLocal;
	public List<String> includesSystem;
	
	public CFile(String filename) {
		this.filename = filename;
		this.includesLocal = new ArrayList<String>();
		this.includesSystem = new ArrayList<String>();
	}
	
	public abstract void saveFile();
	
	public String getFilename() {
		return this.filename;
	}
	
	public void addIncludeLocal(String headerName) {
		includesLocal.add(headerName);
	}
	
	public void addIncludeLocal(CHeader header) {
		includesLocal.add(header.getFilename());
	}
	
	public void addIncludeSystem(String headerName) {
		includesSystem.add(headerName);
	}
	
	public String getIncludes() {
		StringBuilder allIncludes = new StringBuilder();
		Iterator<String> includesSystemIterator = includesSystem.iterator();
		Iterator<String> includesLocalIterator = includesLocal.iterator();

		while (includesSystemIterator.hasNext()) {
			allIncludes.append("#include <" + includesSystemIterator.next() + ">\n");
		}
		while (includesLocalIterator.hasNext()) {
			allIncludes.append("#include \"" + includesLocalIterator.next() + "\"\n");
		}
		
		return allIncludes.toString();
	}

//	public void saveFile(String fileText) {
//		saveFile(fileText, null);
//	}

	public void saveFile(String fileText, String folder) {
		try {
			File f;
			if (folder != null && folder.length() > 0) {
				f = new File(C_PATH + folder + filename);
			}
			else {
				f = new File(C_PATH + filename);
			}
			
			File copyrightTextFile = new File(LICENSE_PATH);
			FileInputStream fis  = new FileInputStream(copyrightTextFile);
		    BufferedReader in = new BufferedReader(new InputStreamReader(fis));
		    
			if (f.exists()) {
				f.delete();
				f.createNewFile();
			}
			
			FileWriter fw = new FileWriter(f);
			
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
