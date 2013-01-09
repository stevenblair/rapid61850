package rapid61850;

import org.eclipse.emf.ecore.EObject;

import ch.iec._61850._2006.scl.TExtRef;

public class CFunctionGSECoder extends CFunctionCoder {
	
	public CFunctionGSECoder(EObject obj, CoderType coderType, SCDAdditionalMappings map) {
		super(obj, CommsType.GSE, coderType, map);
		
		if (coderType == CoderType.DECODER) {
			this.prefix = "ber_decode_";
		}
		else if (coderType == CoderType.ENCODER) {
			this.prefix = "ber_encode_";
		}
	}

	public CFunctionGSECoder(EObject obj, TExtRef extRef, CoderType coderType, SCDAdditionalMappings map) {
		this(obj, coderType, map);
		this.extRef = extRef;
	}
	
}
