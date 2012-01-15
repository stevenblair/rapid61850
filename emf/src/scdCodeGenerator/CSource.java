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

package scdCodeGenerator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import scdCodeGeneratorTemplates.CSourceTemplate;

import ch.iec._61850._2006.scl.TDataSet;


public class CSource extends CFile {
	public StringBuilder instances;
	public StringBuilder manualFunctions;
	public CSourceTemplate template;
	public List<CFunction>	functions;
	
	public CSource(String filename, String includes) {
		super(filename, includes);
		
		this.instances = new StringBuilder();
		this.manualFunctions = new StringBuilder();
		this.template = new CSourceTemplate();
		this.functions = new ArrayList<CFunction>();
	}

	public void appendFunctionObject(CFunction functionObject) {
		this.functions.add(functionObject);
	}
	
	public void appendFunctions(StringBuilder functions) {
		this.manualFunctions.append(functions);
	}

	public void appendFunctions(String functions) {
		this.manualFunctions.append(functions);
	}

	public void appendInstances(StringBuilder instances) {
		this.instances.append(instances);
	}

	public void appendInstances(String instances) {
		this.instances.append(instances);
	}
	
	public CHeader populateHeaderFilePrototypes(CHeader h) {
		Iterator<CFunction> funcs = functions.iterator();
		
		while (funcs.hasNext()) {
			CFunction func = funcs.next();
			
			if (func instanceof CFunctionCoder) {
				if (!(((CFunctionCoder) func).dataType instanceof TDataSet)) {
					continue;
				}
			}
			
			h.appendFunctionPrototypes(func.getPrototype());
		}
		
		return h;
	}

	public void saveFile() {
		saveFile(template.generate(this));
	}
}
