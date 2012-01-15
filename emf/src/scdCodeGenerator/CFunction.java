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


public abstract class CFunction {

	public String returnType;

	public CFunction() {
		this.returnType = "";
	}

	public CFunction(String returnType) {
		this.returnType = returnType;
	}

	public abstract String getName();
	public abstract String getArgs();
	public abstract String getFunctionName();
	public abstract String getBody();

	public String getFunctionDefinition() {
		return this.returnType + " " + this.getFunctionName() + "(" + this.getArgs() + ")";
	}

	public String getPrototype() {
		return this.getFunctionDefinition() + ";\n";
	}

	// template method
	public String toString() {
		return getFunctionDefinition() + " {\n" + this.getBody() + "}";
	}
}
