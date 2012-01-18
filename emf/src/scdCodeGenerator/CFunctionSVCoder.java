package scdCodeGenerator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TAccessPoint;
import ch.iec._61850._2006.scl.TBDA;
import ch.iec._61850._2006.scl.TDA;
import ch.iec._61850._2006.scl.TDO;
import ch.iec._61850._2006.scl.TExtRef;
import ch.iec._61850._2006.scl.TFCDA;
import ch.iec._61850._2006.scl.TIED;
import ch.iec._61850._2006.scl.TSDO;

public class CFunctionSVCoder extends CFunctionCoder {

	public CFunctionSVCoder(EObject obj, CoderType coderType) {
		super(obj, CommsType.SV, coderType);
		
		if (coderType == CoderType.DECODER) {
			this.prefix = "decode_";
		}
		else if (coderType == CoderType.ENCODER) {
			this.prefix = "encode_";
		}
	}

	public CFunctionSVCoder(EObject obj, TExtRef extRef, CoderType coderType) {
		this(obj, coderType);
		this.extRef = extRef;
	}

	@Override
	public String getItemCoder(EObject obj, Boolean getLength) {
		EClass objectClass = obj.eClass();
		String itemType = "";
		String variableName = "";
		String enumCast = "";
		String coder = getPrefix();
		Boolean basicDataType = false;
		String source = getName();
		String subItemLinker = "->";
		
		if (objectClass == SclPackage.eINSTANCE.getTBDA()) {
			TBDA bda = (TBDA) obj;
			itemType = bda.getCoderType();
			
			if (!bda.getBType().toString().equals("Struct")) {
				basicDataType = true;
			}
			if (bda.getBType().toString().equals("Enum")) {
				enumCast = "(CTYPE_ENUM *) ";
			}
			
			variableName = bda.getName().toString();
		}
		else if (objectClass == SclPackage.eINSTANCE.getTDA()) {
			TDA da = (TDA) obj;
			itemType = da.getCoderType();
			
			if (!da.getBType().toString().equals("Struct")) {
				basicDataType = true;
			}
			if (da.getBType().toString().equals("Enum")) {
				enumCast = "(CTYPE_ENUM *) ";
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
			if (fcda.getPrintedType().contains("enum")) {
				enumCast = "(CTYPE_ENUM *) ";
			}
			
			if (coderType == CoderType.ENCODER) {
				String iedName = ((TIED) fcda.eContainer().eContainer().eContainer().eContainer().eContainer().eContainer()).getName();
				String apName = ((TAccessPoint) fcda.eContainer().eContainer().eContainer().eContainer().eContainer()).getName();
				
				source =  iedName + "." + apName + "." + fcda.getLdInst() + "." + fcda.getLnRef().getPrefix() + fcda.getLnRef().getLnType().replaceAll("[^A-Za-z0-9]", "_") + "_" + fcda.getLnRef().getInst();
				
				if (fcda.getDaName() == null || fcda.getDaName().equals("")) {
					variableName = fcda.getDoName();
				}
				else {
					source = source + "." + fcda.getDoName();
					variableName = fcda.getDaName();
				}
				subItemLinker = ".";
			}
		}
		
		if (basicDataType) {
			coder = coder.toUpperCase();
		}
		
		return "\toffset += " + coder + itemType + "(&buf[offset], " + enumCast + "&" + source + subItemLinker + variableName + ");\n";
	}
}
