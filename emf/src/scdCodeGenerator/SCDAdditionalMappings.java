package scdCodeGenerator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import ch.iec._61850._2006.scl.TBaseElement;
import ch.iec._61850._2006.scl.TControl;
import ch.iec._61850._2006.scl.TDataSet;
import ch.iec._61850._2006.scl.TExtRef;
import ch.iec._61850._2006.scl.TFCDA;
import ch.iec._61850._2006.scl.TLN;

public class SCDAdditionalMappings {

	private Map<TControl, TDataSet> controlToDataset;
	private Map<TBaseElement, String> dataAttibuteToPrintedType;
	private Map<TBaseElement, String> dataAttibuteToCoderType;
	private Map<TFCDA, TBaseElement> fcdaToDataAttribute;
	private Map<TFCDA, String> fcdaToVariableName;
	private Map<TFCDA, TLN> fcdaToLN;
	private Map<TExtRef, List<TDataSet>> extRefToDatasets;

	public SCDAdditionalMappings() {
		controlToDataset = new HashMap<TControl, TDataSet>();
		dataAttibuteToPrintedType = new HashMap<TBaseElement, String>();
		dataAttibuteToCoderType = new HashMap<TBaseElement, String>();
		fcdaToDataAttribute = new HashMap<TFCDA, TBaseElement>();
		fcdaToVariableName = new HashMap<TFCDA, String>();
		fcdaToLN = new HashMap<TFCDA, TLN>();
		extRefToDatasets = new HashMap<TExtRef, List<TDataSet>>();
	}
	
	public Iterator<TDataSet> getDatasets(TExtRef extRef) {
		return extRefToDatasets.get(extRef).iterator();
	}

	public void setDatasets(TExtRef key, List<TDataSet> value) {
		if (key != null && value != null) {
			extRefToDatasets.put(key, value);
		}
	}
	
	public TDataSet getDataset(TControl control) {
		return controlToDataset.get(control);
	}
	
	public Iterator<TControl> getControls(TDataSet value) {
	     Set<TControl> keys = new HashSet<TControl>();
	     for (Entry<TControl, TDataSet> entry : controlToDataset.entrySet()) {
	         if (value.equals(entry.getValue())) {
	             keys.add(entry.getKey());
	         }
	     }
	     return keys.iterator();
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
