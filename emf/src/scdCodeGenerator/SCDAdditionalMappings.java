package scdCodeGenerator;

import java.util.HashMap;
import java.util.Map;

import ch.iec._61850._2006.scl.TAbstractDataAttribute;
import ch.iec._61850._2006.scl.TControl;
import ch.iec._61850._2006.scl.TDataSet;
import ch.iec._61850._2006.scl.TFCDA;
import ch.iec._61850._2006.scl.TLN;

public class SCDAdditionalMappings {

	private Map<TControl, TDataSet> controlToDataset;
	private Map<TFCDA, TLN> fcdaToLN;
	private Map<TAbstractDataAttribute, String> dataAttibuteToPrintedType;
	private Map<TAbstractDataAttribute, String> dataAttibuteToCoderType;
	private Map<TFCDA, String> fcdaToPrintedType;
	private Map<TFCDA, String> fcdaToCoderType;
	private Map<TFCDA, String> fcdaToVariableName;

	public SCDAdditionalMappings() {
		dataAttibuteToPrintedType = new HashMap<>();
		dataAttibuteToCoderType = new HashMap<>();
		controlToDataset = new HashMap<>();
		fcdaToLN = new HashMap<>();
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
	
	public String getCoderType(TAbstractDataAttribute da) {
			return dataAttibuteToPrintedType.get(da);
	}
	
	public void setCoderType(TAbstractDataAttribute key, String value) {
		if (key != null && value != null) {
			dataAttibuteToCoderType.put(key, value);
		}
	}
	
	public String getPrintedType(TAbstractDataAttribute da) {
		return dataAttibuteToCoderType.get(da);
	}
	
	public void setPrintedType(TAbstractDataAttribute key, String value) {
		if (key != null && value != null) {
			dataAttibuteToPrintedType.put(key, value);
		}
	}
	
	public String getPrintedType(TFCDA da) {
		return fcdaToPrintedType.get(da);
	}
	
	public void setPrintedType(TFCDA key, String value) {
		if (key != null && value != null) {
			fcdaToPrintedType.put(key, value);
		}
	}
	
	public String getCoderType(TFCDA da) {
			return fcdaToCoderType.get(da);
	}
	
	public void setCoderType(TFCDA key, String value) {
		if (key != null && value != null) {
			fcdaToCoderType.put(key, value);
		}
	}
	
	public String getVariableName(TFCDA da) {
			return fcdaToVariableName.get(da);
	}
	
	public void setVariableName(TFCDA key, String value) {
		if (key != null && value != null) {
			fcdaToVariableName.put(key, value);
		}
	}

}
