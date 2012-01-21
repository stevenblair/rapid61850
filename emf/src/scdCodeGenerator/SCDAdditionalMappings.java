package scdCodeGenerator;

import java.util.HashMap;
import java.util.Map;

import ch.iec._61850._2006.scl.TAbstractDataAttribute;
import ch.iec._61850._2006.scl.TBaseElement;
import ch.iec._61850._2006.scl.TControl;
import ch.iec._61850._2006.scl.TDataSet;
import ch.iec._61850._2006.scl.TFCDA;
import ch.iec._61850._2006.scl.TLN;
import ch.iec._61850._2006.scl.TUnNaming;

public class SCDAdditionalMappings {

	private Map<TControl, TDataSet> controlToDataset;
	private Map<TBaseElement, String> dataAttibuteToPrintedType;
	private Map<TBaseElement, String> dataAttibuteToCoderType;
	private Map<TFCDA, TBaseElement> fcdaToDataAttribute;
	private Map<TFCDA, String> fcdaToVariableName;
	private Map<TFCDA, TLN> fcdaToLN;
	//private Map<TFCDA, String> fcdaToCoderType;

	public SCDAdditionalMappings() {
		controlToDataset = new HashMap<>();
		dataAttibuteToPrintedType = new HashMap<>();
		dataAttibuteToCoderType = new HashMap<>();
		fcdaToDataAttribute = new HashMap<>();
		fcdaToVariableName = new HashMap<>();
		fcdaToLN = new HashMap<>();
		//fcdaToCoderType = new HashMap<>();
	}
	
	public TDataSet getDataset(TControl control) {
		return controlToDataset.get(control);
	}

	public void setDataset(TControl key, TDataSet value) {
		if (key != null && value != null) {
			controlToDataset.put(key, value);
		}
	}
	
	public TLN getLN(TFCDA fcda) {
		return fcdaToLN.get(fcda);
	}
	
	public void setLN(TFCDA key, TLN value) {
		if (key != null && value != null) {
			fcdaToLN.put(key, value);
		}
	}
	
	public String getCoderType(TBaseElement da) {
			return dataAttibuteToCoderType.get(da);
	}

	public void setCoderType(TBaseElement key, String value) {
		if (key != null && value != null) {
			dataAttibuteToCoderType.put(key, value);
		}
	}

	/*public String getCoderType(TFCDA fcda) {
		return fcdaToCoderType.get(fcda);
	}
	
	public void setCoderType(TFCDA key, String value) {
		if (key != null && value != null) {
			fcdaToCoderType.put(key, value);
		}
	}*/
	
	public String getPrintedType(TBaseElement da) {
		return dataAttibuteToPrintedType.get(da);
	}
	
	public void setPrintedType(TBaseElement key, String value) {
		if (key != null && value != null) {
			dataAttibuteToPrintedType.put(key, value);
		}
	}
	
	public String getVariableName(TFCDA fcda) {
			return fcdaToVariableName.get(fcda);
	}
	
	public void setVariableName(TFCDA key, String value) {
		if (key != null && value != null) {
			fcdaToVariableName.put(key, value);
		}
	}
	
	public TBaseElement getDataAttribute(TFCDA fcda) {
			return fcdaToDataAttribute.get(fcda);
	}
	
	public void setDataAttribute(TFCDA key, TBaseElement value) {
		if (key != null && value != null) {
			fcdaToDataAttribute.put(key, value);
		}
	}

}
