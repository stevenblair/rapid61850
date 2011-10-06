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

package sclToC;

import sclToCHelper.CHeaderTemplate;

public class CHeader extends CFile {
	public String headerProtectName;
	public StringBuilder datatypes;
	public StringBuilder functionPrototypes;
	public StringBuilder extern;
	public CHeaderTemplate template;
	
	public CHeader(String filename, String headerProtectName, String includes) {
		super(filename, includes);
		
		this.headerProtectName = headerProtectName;
		this.datatypes = new StringBuilder();
		this.functionPrototypes = new StringBuilder();
		this.extern = new StringBuilder();
		this.template = new CHeaderTemplate();
	}

	public void appendFunctionPrototypes(StringBuilder functionPrototypes) {
		this.functionPrototypes.append(functionPrototypes);
	}

	public void appendFunctionPrototypes(String functionPrototypes) {
		this.functionPrototypes.append(functionPrototypes);
	}

	public void appendDatatypes(StringBuilder datatypes) {
		this.datatypes.append(datatypes);
	}

	public void appendDatatypes(String datatypes) {
		this.datatypes.append(datatypes);
	}

	public void appendExtern(StringBuilder extern) {
		this.extern.append(extern);
	}

	public void appendExtern(String extern) {
		this.extern.append(extern);
	}

	public void saveFile() {
		saveFile(template.generate(this));
	}
}
