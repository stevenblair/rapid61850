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

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;

import ch.iec._61850._2006.scl.TAbstractDataAttribute;
import ch.iec._61850._2006.scl.TAccessPoint;
import ch.iec._61850._2006.scl.TBDA;
import ch.iec._61850._2006.scl.TDA;
import ch.iec._61850._2006.scl.TDAType;
import ch.iec._61850._2006.scl.TDO;
import ch.iec._61850._2006.scl.TDOType;
import ch.iec._61850._2006.scl.TDataSet;
import ch.iec._61850._2006.scl.TDataTypeTemplates;
import ch.iec._61850._2006.scl.TExtRef;
import ch.iec._61850._2006.scl.TFCDA;
import ch.iec._61850._2006.scl.TGSEControl;
import ch.iec._61850._2006.scl.TIED;
import ch.iec._61850._2006.scl.TLN;
import ch.iec._61850._2006.scl.TLDevice;
import ch.iec._61850._2006.scl.TSDO;
import ch.iec._61850._2006.scl.TSampledValueControl;

public class CFunctionCoder extends CFunction {
	
	protected EObject		dataType;	// may be DO, DA, or DataSet
	protected CommsType		commsType;
	protected CoderType		coderType;
	protected String		prefix;
	protected TExtRef		extRef;
	protected String		GSESVInputPath;

	public CFunctionCoder(EObject obj, CommsType commsType, CoderType coderType) {
		super("int");

		this.commsType = commsType;
		this.coderType = coderType;
		this.dataType = obj;
		
		if (commsType == CommsType.SV && coderType == CoderType.DECODER) {
			this.prefix = "decode_";
		}
		else if (commsType == CommsType.SV && coderType == CoderType.ENCODER) {
			this.prefix = "encode_";
		}
		else if (commsType == CommsType.GSE && coderType == CoderType.DECODER) {
			this.prefix = "ber_decode_";
		}
		else if (commsType == CommsType.GSE && coderType == CoderType.ENCODER) {
			this.prefix = "ber_encode_";
		}
	}
	
	public CFunctionCoder(EObject obj, TExtRef extRef, CommsType commsType, CoderType coderType) {
		this(obj, commsType, coderType);
		
		this.extRef = extRef;
	}
	
	public String getArgs() {
		if (this.dataType.eClass().getName().equals("TDataSet")) {
			if (commsType == CommsType.SV && coderType == CoderType.DECODER) {
				return "unsigned char *buf, int noASDU, CTYPE_INT16U smpCnt";
			}
			else {
				return "unsigned char *buf";
			}
		}
		else {
			return "unsigned char *buf, struct " + getName() + " *" + getName();
		}
	}

	public String getPrefix() {
		return prefix;
	}
	
	public String getName() {
		if (dataType.eClass().getName().equals("TDAType")) {
			return ((TDAType) dataType).getId();
		}
		else if (dataType.eClass().getName().equals("TDOType")) {
			return ((TDOType) dataType).getId();
		}
		else  if (dataType.eClass().getName().equals("TDataSet")) {
			if (commsType == CommsType.SV) {
				if (coderType == CoderType.DECODER && extRef != null) {
					String uriFragment = extRef.eResource().getURIFragment(extRef);
					String lnNameUri = uriFragment.substring(0, uriFragment.indexOf("/@inputs"));
					TLN ln = (TLN) extRef.eResource().getEObject(lnNameUri);
					
					return ((TDataSet) dataType).getName() + "_" + ln.getLnClass().toString() + "_" + ln.getInst();
				}
				else {
					return SCDCodeGenerator.getSVControl((TDataSet) dataType).getSmvID();
				}
			}
			else if (commsType == CommsType.GSE) {
				if (coderType == CoderType.DECODER && extRef != null) {
					String uriFragment = extRef.eResource().getURIFragment(extRef);
					String lnNameUri = uriFragment.substring(0, uriFragment.indexOf("/@inputs"));
					TLN ln = (TLN) extRef.eResource().getEObject(lnNameUri);
					
					//System.out.println("GSE decoder, " + ((TDataSet) dataType).getName() + "_" + ln.getLnClass().toString() + "_" + ln.getInst());
					
					return ((TDataSet) dataType).getName() + "_" + ln.getLnClass().toString() + "_" + ln.getInst();
				}
				else {
					//System.out.println(coderType + ", other type of GSE, appID: " + SCLCodeGenerator.getGSEControl((TDataSet) dataType).getAppID() + " extref: " + extRef);
					return SCDCodeGenerator.getGSEControl((TDataSet) dataType).getAppID();
				}
			}
		}
		
		return null;
	}
	
	public String getFunctionName() {
		return this.prefix + getName();
	}
	
	public String getItemCoder(EObject obj, Boolean getLength) {
		String item = "";
		String name = "";
		String bType = null;
		String type = null;
		String variableName = "";
		String buf = "";
		String prefix = "";
		String accumulator = "offset +=";
		String noASDUIndex = "";
		String instanceSuffix = "";
		String compoundName = null;
		
		if (getLength) {
			prefix = "ber_get_length_";
			accumulator = "len =";
		}
		else {
			buf = "&buf[offset], ";
			prefix = getPrefix();
		}
		
		if (obj.eClass().getName().equals("TFCDA")) {
			String iedName = "ied";
			String apName = "ap";
			String ldName = "ld";
			String lnName = "ln";
			
			TFCDA fcda = ((TFCDA) obj);
			TDataTypeTemplates dtt = getTDataTypeTemplates();
			
			if (commsType == CommsType.SV && extRef != null) {
				TSampledValueControl svControl = SCDCodeGenerator.getSVControl((TDataSet) dataType);
				
				if (svControl != null) {
					long noASDU = svControl.getNofASDU();
					
					if (noASDU > 1) {
						noASDUIndex = "_" + fcda.getLnInst() + "[noASDU]"; 
					}
					String uriFragment = extRef.eResource().getURIFragment(extRef);
					
					// find IED, AP, LD, and LN name using EMF URI lookup
					String iedNameUri = uriFragment.substring(0, uriFragment.indexOf("/@accessPoint"));
					String apNameUri = uriFragment.substring(0, uriFragment.indexOf("/@server"));
					String ldNameUri = uriFragment.substring(0, uriFragment.indexOf("/@lN"));
					String lnNameUri = uriFragment.substring(0, uriFragment.indexOf("/@inputs"));
					iedName = (((TIED) extRef.eResource().getEObject(iedNameUri)).getName());
					apName = (((TAccessPoint) extRef.eResource().getEObject(apNameUri)).getName());
					ldName = (((TLDevice) extRef.eResource().getEObject(ldNameUri)).getInst());
					lnName = (((TLN) extRef.eResource().getEObject(lnNameUri)).getLnClass().toString());
					
					variableName = iedName + "." + apName + "." + ldName + "." + extRef.getPrefix() + lnName + "_" + extRef.getLnInst() + ".sv_inputs.";
					GSESVInputPath = variableName;
				}
			}
			else if (commsType == CommsType.GSE && extRef != null) {
				TGSEControl gseControl = SCDCodeGenerator.getGSEControl((TDataSet) dataType);
				
				if (gseControl != null) {
					String uriFragment = extRef.eResource().getURIFragment(extRef);
					
					// find IED, AP, LD, and LN name using EMF URI lookup
					String iedNameUri = uriFragment.substring(0, uriFragment.indexOf("/@accessPoint"));
					String apNameUri = uriFragment.substring(0, uriFragment.indexOf("/@server"));
					String ldNameUri = uriFragment.substring(0, uriFragment.indexOf("/@lN"));
					String lnNameUri = uriFragment.substring(0, uriFragment.indexOf("/@inputs"));
					TLN ln = (((TLN) extRef.eResource().getEObject(lnNameUri)));					//TODO: this is null
					iedName = (((TIED) extRef.eResource().getEObject(iedNameUri)).getName());
					apName = (((TAccessPoint) extRef.eResource().getEObject(apNameUri)).getName());
					ldName = (((TLDevice) extRef.eResource().getEObject(ldNameUri)).getInst());
					lnName = ln.getLnClass().toString();
					
					String lnPrefix = "";
					if (ln.getPrefix() != null) {
						lnPrefix = ln.getPrefix();
					}
					
					//TODO: part after ".gse_inputs." needs to be expanded
					//variableName = iedName + "." + apName + "." + ldName + "." + /*ln.getPrefix() +*/ lnName + "_" + extRef.getLnInst() + ".gse_inputs."/* + extRef.getIedName() + "_" + fcda.getLdInst() + "_" + fcda.getPrefix()*/;
					GSESVInputPath = iedName + "." + apName + "." + ldName + "." + lnPrefix + lnName + "_" + extRef.getLnInst() + ".gse_inputs.";
					variableName = GSESVInputPath + extRef.getIedName() + "_" + fcda.getLdInst() + "_" + fcda.getPrefix();
					instanceSuffix = "_" + fcda.getLnInst();
				}
			}
			else {
				String uriFragment = fcda.eResource().getURIFragment(fcda);
				String iedNameUri = uriFragment.substring(0, uriFragment.indexOf("/@accessPoint"));
				String apNameUri = uriFragment.substring(0, uriFragment.indexOf("/@server"));
				//String ldNameUri = uriFragment.substring(0, uriFragment.indexOf("/@lN0"));
				iedName = (((TIED) fcda.eResource().getEObject(iedNameUri)).getName());
				apName = (((TAccessPoint) fcda.eResource().getEObject(apNameUri)).getName());
				//ldName = (((TLDevice) fcda.eResource().getEObject(ldNameUri)).getInst());
				
				variableName = iedName + "." + apName + "." + fcda.getLdInst() + "." + fcda.getPrefix() + fcda.getLnClass().toString() + "_" + fcda.getLnInst() + ".";
			}
			
			if (fcda.getDaName() != null && !fcda.getDaName().equals("")) {
				TAbstractDataAttribute da = SCDCodeGenerator.getDA(dtt, fcda.getLnInst(), fcda.getLnClass().toString(), fcda.getDoName(), fcda.getDaName());
				obj = da;
				
				if (obj != null && obj.eClass().getName().equals("TBDA")) {
					if (fcda.getDaName().contains(".")) {
						compoundName = fcda.getDaName();	// ensure we use the full name, e.g., "foo.bar"
						
						if (!dataType.eClass().getName().equals("TDataSet") || coderType != CoderType.ENCODER) {
							compoundName = compoundName.replaceAll("[^A-Za-z0-9]", "_");
						}
					}
				}
				
				if (coderType == CoderType.ENCODER) {
					variableName = variableName.concat(fcda.getDoName() + ".");
				}
			}
			else {
				TDO dataObject = SCDCodeGenerator.getDO(dtt, fcda.getLnClass().toString(), fcda.getDoName());
				obj = dataObject;
			}
		}
		else {
			variableName = getName() + "->";
		}
		
		if (obj == null) {
			return "";
		}
		
		if (obj.eClass().getName().equals("TBDA")) {
			if (compoundName == null) {
				name = ((TBDA) obj).getName().toString();
			}
			else {
				name = compoundName;
			}
			bType = ((TBDA) obj).getBType().toString();
			if (((TBDA) obj).getType() != null) {
				type = ((TBDA) obj).getType().toString();
			}
		}
		else if (obj.eClass().getName().equals("TDA")) {
			if (compoundName == null) {
				name = ((TDA) obj).getName().toString();
			}
			else {
				name = compoundName;
			}
			bType = ((TDA) obj).getBType().toString();
			if (((TDA) obj).getType() != null) {
				type = ((TDA) obj).getType().toString();
			}
		}
		else if (obj.eClass().getName().equals("TDO")) {
			name = ((TDO) obj).getName().toString();
			if (((TDO) obj).getType() != null) {
				type = ((TDO) obj).getType().toString();
			}
		}
		else if (obj.eClass().getName().equals("TSDO")) {
			name = ((TSDO) obj).getName().toString();
			if (((TSDO) obj).getType() != null) {
				type = ((TSDO) obj).getType().toString();
			}
		}
		
		name = name.concat(instanceSuffix);
		
		if (bType == null || bType.equals("Struct")) {
			item = "\t" + accumulator + " " + prefix + type + "(" + buf + "&" + variableName + name + noASDUIndex + ");\n";
		}
		else {
			String enumCast = "";
			if (bType.equals("Enum")) {
				enumCast = "(CTYPE_ENUM *) ";
			}
			item = "\t" + accumulator + " " + prefix.toUpperCase() + "CTYPE_" + bType.toUpperCase() + "(" + buf + enumCast + "&" + variableName + name + noASDUIndex + ");\n";
		}
		
		//System.out.println(item);
		
		return item;
	}
	
	public TDataTypeTemplates getTDataTypeTemplates() {
		String uriFragment = "//@sCL/@dataTypeTemplates";

		return (TDataTypeTemplates) dataType.eResource().getEObject(uriFragment);
	}
	
	//		should cater for:
	//			encoding and decoding (where relevant)
	//			SV and GSE
	//			DO, DA, BDA, SDO, or FCDA (where the FCDA refers to a DO or DA)
	public String getBody() {
		Iterator<EObject> objects = dataType.eContents().iterator();
		String body = "\tint offset = 0;\n\n";
		Boolean gseDecodeNotDataset = false;
		Boolean decodeDataset = false;
		
		if (!dataType.eClass().getName().equals("TDAType") && !dataType.eClass().getName().equals("TDOType")) {
			decodeDataset = true;
		}

		// add tag/length code required for GSE encoding/decoding
		if (commsType == CommsType.GSE) {
			if (dataType.eClass().getName().equals("TDAType") || dataType.eClass().getName().equals("TDOType")) {
				if (coderType == CoderType.ENCODER) {
					body = body.concat("\tbuf[offset++] = 0xA2;\n");
					body = body.concat("\toffset += encodeLength(&buf[offset], ber_get_length_" + getName() + "(" + getName() + "));\n\n");
				}
				else {
					gseDecodeNotDataset = true;
					body = body.concat("\tif (buf[offset++] == 0xA2) {\n");
					body = body.concat("\t\toffset += getLengthFieldSize(buf[offset]);\n\n");
				}
			}
		}
		
		while (objects.hasNext()) {
			EObject obj = objects.next();

			if (gseDecodeNotDataset) {
				body = body.concat("\t");
			}
			body = body.concat(getItemCoder(obj, false));
		}
		
		if (gseDecodeNotDataset) {
			body = body.concat("\t}\n");
		}
		
		if (decodeDataset == true) {
			if (coderType == CoderType.DECODER) {
				// call (optional) callback after dataset decode
				if (commsType == CommsType.GSE) {
					
					//iedName + "." + apName + "." + ldName + "." + lnPrefix + lnName + "_" + extRef.getLnInst() + ".gse_inputs.";
					/*TGSEControl gseControl = SCLCodeGenerator.getGSEControl((TDataSet)dataType);
					String gseName = gseControl.getName() + "_" + gseControl.getAppID();*/
					
					body = body.concat("\n\tif (" + GSESVInputPath + "datasetDecodeDone != NULL) {\n");
					body = body.concat("\t\t" + GSESVInputPath + "datasetDecodeDone();\n");
					body = body.concat("\t}\n");
				}
				else if (commsType == CommsType.SV) {
					/*if (dataType != null) {
						TSampledValueControl svControl = SCLCodeGenerator.getSVControl((TDataSet)dataType);
						
						if (svControl != null) {
							String svName = svControl.getName() + "_" + svControl.getSmvID();
			*/
							body = body.concat("\n\tif (" + GSESVInputPath + "datasetDecodeDone != NULL) {\n");
							body = body.concat("\t\t" + GSESVInputPath + "datasetDecodeDone(smpCnt);\n");
							body = body.concat("\t}\n");
							/*
						}
					}*/
				}
			}
		}
		
		body = body.concat("\n\treturn offset;\n");
		
		return body;
	}
	
}
