package scdCodeGenerator;

import ch.iec._61850._2006.scl.TControl;
import ch.iec._61850._2006.scl.TIED;
import ch.iec._61850._2006.scl.TLDevice;

public class CFunctionControl extends CFunction {
	
	private TControl control;
	private String prefix;

	public CFunctionControl(TControl control, CommsType commsType) {
		super();
		this.control = control;
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
		String datasetUniqueName = SCDCodeGenerator.getUniqueDatasetName(control.getDataSetRef());
		return "\treturn " + this.prefix + datasetUniqueName + "(buf);\n";
	}

}
