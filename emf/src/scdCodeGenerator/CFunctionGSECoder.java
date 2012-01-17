package scdCodeGenerator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TExtRef;
import ch.iec._61850._2006.scl.TFCDA;
import ch.iec._61850._2006.scl.TSDO;
import ch.iec._61850._2006.scl.TDO;
import ch.iec._61850._2006.scl.TDA;
import ch.iec._61850._2006.scl.TBDA;

public class CFunctionGSECoder extends CFunctionCoder {

	protected String accumulator = "offset";
	protected String buffer ="&buf[offset], ";
	
	public CFunctionGSECoder(EObject obj, CoderType coderType) {
		super(obj, CommsType.GSE, coderType);
		
		if (coderType == CoderType.DECODER) {
			this.prefix = "ber_decode_";
		}
		else if (coderType == CoderType.ENCODER) {
			this.prefix = "ber_encode_";
		}
	}

	public CFunctionGSECoder(EObject obj, TExtRef extRef, CoderType coderType) {
		this(obj, coderType);
		this.extRef = extRef;
	}
	
	@Override
	public String getItemCoder(EObject obj, Boolean getLength) {
		EClass objectClass = obj.eClass();
		String itemType = "";
		String variableName = "";
		String coder = getPrefix();
		Boolean basicDataType = false;
		
		if (objectClass == SclPackage.eINSTANCE.getTBDA()) {
			TBDA bda = (TBDA) obj;
			itemType = bda.getCoderType();
			
			if (!bda.getBType().toString().equals("Struct")) {
				basicDataType = true;
			}
			
			variableName = bda.getName().toString();
		}
		else if (objectClass == SclPackage.eINSTANCE.getTDA()) {
			TDA da = (TDA) obj;
			itemType = da.getCoderType();
			
			if (!da.getBType().toString().equals("Struct")) {
				basicDataType = true;
			}
			
			variableName = da.getName().toString();
		}
		else if (objectClass == SclPackage.eINSTANCE.getTDO()) {
			TDO dataObject = (TDO) obj;
			
			itemType = dataObject.getType();
			variableName = dataObject.getName();
		}
		else if (objectClass == SclPackage.eINSTANCE.getTSDO()) {
			TSDO sdo = (TSDO) obj;
			
			itemType = sdo.getType();
			variableName = sdo.getName();
		}
		else if (objectClass == SclPackage.eINSTANCE.getTExtRef()) {
			itemType = "extref";
		}
		else if (objectClass == SclPackage.eINSTANCE.getTFCDA()) {
			TFCDA fcda = ((TFCDA) obj);
			
			itemType = fcda.getCoderType();
			variableName = fcda.getVariableName();
			
			if (!fcda.getPrintedType().contains("struct")) {
				basicDataType = true;
			}
		}

		if (basicDataType) {
			coder = coder.toUpperCase();
		}
		
//		offset += ber_decode_myAnalogValue(&buf[offset], &dest->C1__TVTR_1_Vol_instMag);
//		offset += ber_decode_myPos(&buf[offset], &dest->C1__CSWI_1_Pos);
//		offset += ber_decode_myPos(&buf[offset], &dest->C1__CSWI_2_Pos);
//		offset += BER_DECODE_CTYPE_ENUM(&buf[offset], (CTYPE_ENUM *) &dest->C1__MMXU_1_Mod_stVal);

		return "\t" + accumulator + " += " + coder + itemType + "(" + buffer + "&" + getName() + "->" + variableName + ");\n";
	}
	
	/*public String getName() {
		return null;
	}*/
	

	/*public String getBody() {
		Iterator<EObject> objects = dataType.eContents().iterator();
		String func = "\tint total = 0;\n\tint len = 0;\n\n";
		
		while (objects.hasNext()) {
			EObject obj = objects.next();
			
			if (obj == null) {
				return null;
			}

			func = func.concat(getItemCoder(obj, false));
		}
		
		func = func.concat("\n\treturn total;\n");
		
		return func;
	}*/
}
