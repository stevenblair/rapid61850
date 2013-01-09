package rapid61850;

import org.eclipse.emf.ecore.EObject;

import ch.iec._61850._2006.scl.TExtRef;

public class CFunctionSVCoder extends CFunctionCoder {

	public CFunctionSVCoder(EObject obj, CoderType coderType, SCDAdditionalMappings map) {
		super(obj, CommsType.SV, coderType, map);
		
		if (coderType == CoderType.DECODER) {
			this.prefix = "decode_";
		}
		else if (coderType == CoderType.ENCODER) {
			this.prefix = "encode_";
		}
	}

	public CFunctionSVCoder(EObject obj, TExtRef extRef, CoderType coderType, SCDAdditionalMappings map) {
		this(obj, coderType, map);
		this.extRef = extRef;
	}
	
}
