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

import ch.iec._61850._2006.scl.TControl;
import ch.iec._61850._2006.scl.TIED;
import ch.iec._61850._2006.scl.TLDevice;

/**
 * Generates the mapping between Controls and Datasets. 
 */
public class CFunctionControl extends CFunction {
	
	private TControl control;
	private String prefix;
	private SCDAdditionalMappings map;

	public CFunctionControl(TControl control, CommsType commsType, SCDAdditionalMappings map) {
		super();
		this.control = control;
		this.map = map;
		if (commsType == CommsType.GSE) {
			this.prefix = "ber_encode_"; 
		}
		else{
			this.prefix = "encode_"; 
		}
		this.returnType = "int";
	}

	@Override
	public String getName() {
		String iedName = ((TIED) control.eContainer().eContainer().eContainer().eContainer().eContainer()).getName();
		String ldInst = ((TLDevice) control.eContainer().eContainer()).getInst();
		
		return "control_" + iedName + "_" + ldInst + "_" + control.getName();
	}

	@Override
	public String getArgs() {
		return "unsigned char *buf";
	}

	@Override
	public String getFunctionName() {
		return this.prefix + this.getName();
	}

	@Override
	public String getBody() {
		String datasetUniqueName = SCDCodeGenerator.getUniqueDatasetName(/*control.getDataSetRef()*/map.getDataset(control));
		return "\treturn " + this.prefix + datasetUniqueName + "(buf);\n";
	}

}
