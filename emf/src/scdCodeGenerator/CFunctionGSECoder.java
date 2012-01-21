package scdCodeGenerator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TAccessPoint;
import ch.iec._61850._2006.scl.TExtRef;
import ch.iec._61850._2006.scl.TFCDA;
import ch.iec._61850._2006.scl.TIED;
import ch.iec._61850._2006.scl.TSDO;
import ch.iec._61850._2006.scl.TDO;
import ch.iec._61850._2006.scl.TDA;
import ch.iec._61850._2006.scl.TBDA;

public class CFunctionGSECoder extends CFunctionCoder {

	protected String accumulator = "offset";
	protected String buffer ="&buf[offset], ";
	
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
		String assignment = "+=";
		
		if (getLength == true) {
			assignment = "=";
		}
		
		if (objectClass == SclPackage.eINSTANCE.getTBDA()) {
			TBDA bda = (TBDA) obj;
			itemType = map.getCoderType(bda);
			
			if (!bda.getBType().toString().equals("Struct")) {
				basicDataType = true;
			}
			if (bda.getBType().toString().equals("Enum")) {
				enumCast = "(CTYPE_ENUM *) ";
			}
			//System.out.println("itemType: " + itemType + ", bda: " + bda);
			
			variableName = bda.getName().toString();
		}
		else if (objectClass == SclPackage.eINSTANCE.getTDA()) {
			TDA da = (TDA) obj;
			itemType = map.getCoderType(da);
			
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
			
			//itemType = fcda.getCoderType();
			//variableName = fcda.getVariableName();
			itemType = map.getCoderType(map.getDataAttribute(fcda));
			variableName = map.getVariableName(fcda);

			if (map.getPrintedType(map.getDataAttribute(fcda)) != null) {
				if (!map.getPrintedType(map.getDataAttribute(fcda)).contains("struct")) {
					basicDataType = true;
				}
				if (map.getPrintedType(map.getDataAttribute(fcda)).contains("enum")) {
					enumCast = "(CTYPE_ENUM *) ";
				}
			}
			
			if (coderType == CoderType.ENCODER) {
				String iedName = ((TIED) fcda.eContainer().eContainer().eContainer().eContainer().eContainer().eContainer()).getName();
				String apName = ((TAccessPoint) fcda.eContainer().eContainer().eContainer().eContainer().eContainer()).getName();
				
				source =  iedName + "." + apName + "." + fcda.getLdInst() + "." + map.getLN(fcda).getPrefix() + map.getLN(fcda).getLnType().replaceAll("[^A-Za-z0-9]", "_") + "_" + map.getLN(fcda).getInst();
				
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

		return "\t" + accumulator + " " + assignment + " " + coder + itemType + "(" + buffer + enumCast + "&" + source + subItemLinker + variableName + ");\n";
	}
}
