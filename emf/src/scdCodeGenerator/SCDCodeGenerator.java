/**
 * Rapid-prototyping protection schemes with IEC 61850
 *
 * Copyright (c) 2011 Steven Blair
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

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.query.conditions.ObjectInstanceCondition;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.eclipse.emf.query.statements.FROM;
import org.eclipse.emf.query.statements.IQueryResult;
import org.eclipse.emf.query.statements.SELECT;
import org.eclipse.emf.query.statements.WHERE;
import org.eclipse.emf.query.conditions.eobjects.structuralfeatures.*;//EObjectAttributeValueCondition
import org.eclipse.emf.query.conditions.strings.StringValue;
import ch.iec._61850._2006.scl.DocumentRoot;
import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TAbstractDataAttribute;
import ch.iec._61850._2006.scl.TAccessPoint;
import ch.iec._61850._2006.scl.TBDA;
import ch.iec._61850._2006.scl.TCommunication;
import ch.iec._61850._2006.scl.TConnectedAP;
import ch.iec._61850._2006.scl.TDA;
import ch.iec._61850._2006.scl.TDAType;
import ch.iec._61850._2006.scl.TDO;
import ch.iec._61850._2006.scl.TDOI;
import ch.iec._61850._2006.scl.TDOType;
import ch.iec._61850._2006.scl.TDataSet;
import ch.iec._61850._2006.scl.TDataTypeTemplates;
import ch.iec._61850._2006.scl.TEnumType;
import ch.iec._61850._2006.scl.TEnumVal;
import ch.iec._61850._2006.scl.TExtRef;
import ch.iec._61850._2006.scl.TFCDA;
import ch.iec._61850._2006.scl.TGSE;
import ch.iec._61850._2006.scl.TGSEControl;
import ch.iec._61850._2006.scl.TIED;
import ch.iec._61850._2006.scl.TLDevice;
import ch.iec._61850._2006.scl.TLN;
import ch.iec._61850._2006.scl.TLN0;
import ch.iec._61850._2006.scl.TLNodeType;
import ch.iec._61850._2006.scl.TP;
import ch.iec._61850._2006.scl.TSDO;
import ch.iec._61850._2006.scl.TSMV;
import ch.iec._61850._2006.scl.TSampledValueControl;
import ch.iec._61850._2006.scl.TSubNetwork;
import ch.iec._61850._2006.scl.TVal;
import ch.iec._61850._2006.scl.TDAI;
import ch.iec._61850._2006.scl.TSDI;
import ch.iec._61850._2006.scl.util.SclXMLProcessor;

public class SCDCodeGenerator {
	
	final static String PATH_TO_SOURCE = "src\\scdCodeGenerator\\";

	public void generateCode(String filename) {
		// import SCD file
		String scdFileName = PATH_TO_SOURCE + filename;
		Resource resource = null;
		
		try {
			File scdFile = new File(scdFileName);
			if (scdFile.exists()) {
				SclXMLProcessor processor = new SclXMLProcessor();
				resource = processor.load(scdFile.getAbsolutePath(), null);
			}
			else {
				SCDValidator.error("SCD file does not exist");
			}
		}
		catch (Exception e) {
			//e.printStackTrace();
			SCDValidator.error("cannot parse SCD file");
		}
		
		DocumentRoot root = ((DocumentRoot) resource.getContents().get(0));
		
		
		// model validation and pre-caching
		SCDValidator.checkForDuplicateNames(root);
		SCDValidator.setPrintedType(root);
		SCDValidator.mapDataSetToControl(root);
		SCDValidator.mapExtRefToDataSet(root);
		SCDValidator.mapControlToControlBlock(root);
		SCDValidator.mapFCDAToDataType(root);
		SCDValidator.checkForCircularSDOReferences(root);
		
		
		// initialise C files
		CSource svEncodeSource = new CSource("svEncode.c", "#include \"svEncodeBasic.h\"\n#include \"ied.h\"\n#include \"svEncode.h\"");
		CSource svDecodeSource = new CSource("svDecode.c", "#include \"sv.h\"\n#include \"svDecodeBasic.h\"\n#include \"ied.h\"\n#include \"svDecode.h\"");
		CSource gseEncodeSource = new CSource("gseEncode.c", "#include \"gseEncodeBasic.h\"\n#include \"ied.h\"\n#include \"gseEncode.h\"");
		CSource gseDecodeSource = new CSource("gseDecode.c", "#include \"gseDecodeBasic.h\"\n#include \"gse.h\"\n#include \"ied.h\"\n#include \"gseDecode.h\"");
		CSource svSource = new CSource("sv.c", "#include \"sv.h\"\n#include \"svPacketData.h\"\n#include \"svDecode.h\"\n#include \"svEncode.h\"");
		CSource gseSource = new CSource("gse.c", "#include \"gsePacketData.h\"\n#include \"gseDecode.h\"\n#include \"gseEncode.h\"");
		CSource iedSource = new CSource("ied.c", "#include \"ied.h\"\n#include \"datatypes.h\"");
		CSource dataTypesSource = new CSource("datatypes.c", "#include \"ctypes.h\"\n#include \"datatypes.h\"\n#include \"ied.h\"\n#include <stdlib.h>");

		CHeader svEncodeHeader = new CHeader("svEncode.h", "SV_ENCODE_H", "#include \"svEncodeBasic.h\"\n#include \"svPacketData.h\"");
		CHeader svDecodeHeader = new CHeader("svDecode.h", "SV_DECODE_H", "#include \"svPacketData.h\"");
		CHeader gseEncodeHeader = new CHeader("gseEncode.h", "GSE_ENCODE_H", "#include \"gseEncodeBasic.h\"\n#include \"gsePacketData.h\"");
		CHeader gseDecodeHeader = new CHeader("gseDecode.h", "GSE_DECODE_H", "#include \"gsePacketData.h\"");
		CHeader svHeader = new CHeader("sv.h", "SV_H", "#include \"svEncode.h\"\n#include \"svDecode.h\"\n#include \"svPacketData.h\"", false);
		CHeader gseHeader = new CHeader("gse.h", "GSE_H", "#include \"gseEncode.h\"\n#include \"gseDecode.h\"\n#include \"gsePacketData.h\"", false);
		CHeader iedHeader = new CHeader("ied.h", "IED_H", "#include \"datatypes.h\"");
		CHeader dataTypesHeader = new CHeader("datatypes.h", "DATATYPES_H", "#include \"ctypes.h\"");
		
		svHeader.appendFunctionPrototypes("void init_sv();\n");
		gseHeader.appendFunctionPrototypes("void init_gse();\n");

		StringBuilder svDecodeDatasetFunction = new StringBuilder();	// faster than StringBuffer, but not thread-safe
		StringBuilder gseDecodeDatasetFunction = new StringBuilder();
		StringBuilder svPacketDataInit = new StringBuilder();
		StringBuilder gsePacketDataInit = new StringBuilder();

		
		// create lists of DO and DA types that require initialisation
		List<String> initDATypes = new ArrayList<String>();
		List<String> initDOTypes = new ArrayList<String>();
		
		// get main SCD sections
		TDataTypeTemplates dataTypeTemplates = root.getSCL().getDataTypeTemplates();
		TCommunication comms = root.getSCL().getCommunication();

		// process enum types
		Iterator<TEnumType> enums = dataTypeTemplates.getEnumType().iterator();
		dataTypesHeader.appendDatatypes("// enums\n");
		
		while (enums.hasNext()) {
			TEnumType enumType = enums.next();
			Iterator<TEnumVal> enumVals = enumType.getEnumVal().iterator();
			
			dataTypesHeader.appendDatatypes("enum " + enumType.getId().replaceAll("[^A-Za-z0-9]", "_") + " {\n");
			
			while (enumVals.hasNext()) {
				TEnumVal enumVal = enumVals.next();

				dataTypesHeader.appendDatatypes("\t" + enumType.getId().toUpperCase().replaceAll("[^A-Za-z0-9]", "_") + "_" + enumVal.getValue().toUpperCase().replaceAll("[^A-Za-z0-9]", "_") + " = " + enumVal.getOrd().intValue());
				
				if (enumVals.hasNext()) {
					dataTypesHeader.appendDatatypes(",");
				}
				dataTypesHeader.appendDatatypes("\n");
			}

			dataTypesHeader.appendDatatypes("};\n");
		}
		dataTypesHeader.appendDatatypes("\n");
		
		
		// process Data Attribute types
		Iterator<TDAType> daTypes = dataTypeTemplates.getDAType().iterator();
		dataTypesHeader.appendDatatypes("// data attributes\n");
		
		while (daTypes.hasNext()) {
			TDAType daType = daTypes.next();
			dataTypesHeader.appendDatatypes("struct " + daType.getId() + " {");
			
			// generate GSE/SV DA encode/decode functions
			gseEncodeSource.appendFunctionObject(new CFunctionLengthCoder(daType, CommsType.GSE, CoderType.ENCODER));
			gseEncodeSource.appendFunctionObject(new CFunctionCoder(daType, CommsType.GSE, CoderType.ENCODER));
			gseDecodeSource.appendFunctionObject(new CFunctionCoder(daType, CommsType.GSE, CoderType.DECODER));
			svEncodeSource.appendFunctionObject(new CFunctionCoder(daType, CommsType.SV, CoderType.ENCODER));
			svDecodeSource.appendFunctionObject(new CFunctionCoder(daType, CommsType.SV, CoderType.DECODER));
			
			Iterator <TBDA> bdaTypes = daType.getBDA().iterator();

			dataTypesSource.appendFunctions("void init_" + daType.getId() + "(struct " + daType.getId() + " *" + daType.getId() + ") {\n");
			
			while (bdaTypes.hasNext()) {
				TBDA bdaType = bdaTypes.next();
				String bda = bdaType.getPrintedType() + " " + bdaType.getName() + ";";

				dataTypesHeader.appendDatatypes("\n\t" + bda);
				
				// create initialise function, and add to list
				Iterator<TVal> vals = bdaType.getVal().iterator();
				while (vals.hasNext()) {
					TVal val = vals.next();
					
					dataTypesSource.appendFunctions(initAbstractDataAttribute(daType.getId(), bdaType, val));
					initDATypes.add(daType.getId());
				}
			}
			
			dataTypesSource.appendFunctions("}\n");
			
			dataTypesHeader.appendDatatypes("\n};");
			if (daTypes.hasNext()) {
				dataTypesHeader.appendDatatypes("\n");
			}
		}
		dataTypesHeader.appendDatatypes("\n\n");
		

		// process Data Objects
		Iterator<TDOType> doTypes = dataTypeTemplates.getDOType().iterator();
		dataTypesHeader.appendDatatypes("// data objects\n");
		
		while (doTypes.hasNext()) {
			TDOType doType = doTypes.next();

			// generate GSE/SV DO encode/decode functions
			gseEncodeSource.appendFunctionObject(new CFunctionLengthCoder(doType, CommsType.GSE, CoderType.ENCODER));
			gseEncodeSource.appendFunctionObject(new CFunctionCoder(doType, CommsType.GSE, CoderType.ENCODER));
			gseDecodeSource.appendFunctionObject(new CFunctionCoder(doType, CommsType.GSE, CoderType.DECODER));
			svEncodeSource.appendFunctionObject(new CFunctionCoder(doType, CommsType.SV, CoderType.ENCODER));
			svDecodeSource.appendFunctionObject(new CFunctionCoder(doType, CommsType.SV, CoderType.DECODER));
			
			dataTypesHeader.appendDatatypes("struct " + doType.getId() + " {");

			Iterator<TDA> das = doType.getDA().iterator();
			Iterator<TSDO> sdos = doType.getSDO().iterator();
			
			while (sdos.hasNext()) {
				TSDO sdo = sdos.next();				
				String sdoString = "struct " + sdo.getType() + " " + sdo.getName() + ";";

				dataTypesHeader.appendDatatypes("\n\t" + sdoString);
			}
			
			dataTypesSource.appendFunctions("void init_" + doType.getId() + "(struct " + doType.getId() + " *" + doType.getId() + ") {\n");
			
			while (das.hasNext()) {
				TDA da = das.next();				
				String daString = da.getPrintedType() + " " + da.getName() + ";";

				dataTypesHeader.appendDatatypes("\n\t" + daString);
				
				
				Iterator<TVal> vals = da.getVal().iterator();
				while (vals.hasNext()) {
					TVal val = vals.next();
					
					// create initialise function, and add to list
					dataTypesSource.appendFunctions(initAbstractDataAttribute(doType.getId(), da, val));
					initDOTypes.add(doType.getId());
				}
			}
			dataTypesSource.appendFunctions("}\n");
			
			
			dataTypesHeader.appendDatatypes("\n};");
			if (doTypes.hasNext()) {
				dataTypesHeader.appendDatatypes("\n");
			}
		}

		dataTypesHeader.appendDatatypes("\n\n");
		
		
		// process Logical Node Types
		Iterator<TLNodeType> lnTypes = dataTypeTemplates.getLNodeType().iterator();
		dataTypesHeader.appendDatatypes("// logical nodes\n");
		svDecodeDatasetFunction.append("void svDecodeDataset(unsigned char *dataset, int datasetLength, int ASDU, unsigned char *svID, int svIDLength, CTYPE_INT16U smpCnt) {\n");
		gseDecodeDatasetFunction.append("void gseDecodeDataset(unsigned char *dataset, int datasetLength, unsigned char *datSet, int datSetLength) {\n");
		
		while (lnTypes.hasNext()) {
			TLNodeType lnType = lnTypes.next();
			dataTypesHeader.appendDatatypes("struct " + lnType.getId().replaceAll("[^A-Za-z0-9]", "_") + " {");
			
			Iterator<TDO> dos = lnType.getDO().iterator();
			
			while (dos.hasNext()) {
				TDO dataObject = dos.next();				
				String doString = "struct " + dataObject.getType() + " " + dataObject.getName() + ";";

				dataTypesHeader.appendDatatypes("\n\t" + doString);
			}
			
			// deal with Inputs/ExtRefs
			Iterator<TIED> ieds = root.getSCL().getIED().iterator();
			
			while (ieds.hasNext()) {
				TIED ied = ieds.next();
				
				if (ied.getAccessPoint() != null) {
					Iterator<TAccessPoint> aps = ied.getAccessPoint().iterator();
					
					while (aps.hasNext()) {
						TAccessPoint ap = aps.next();
						List<String> svDatasetsConsumed = new ArrayList<String>();
						List<String> gseDatasetsConsumed = new ArrayList<String>();
						
						if (ap.getServer() != null && ap.getServer().getLDevice().size() > 0) {
							Iterator<TLDevice> lds = ap.getServer().getLDevice().iterator();
							
							while (lds.hasNext()) {
								TLDevice ld = lds.next();
								
								Iterator<TLN> lns = ld.getLN().iterator();
								
								while (lns.hasNext()) {
									TLN ln = lns.next();
									
									if (ln.getLnType().equals(lnType.getId())) {
										if (ln.getInputs() != null) {
											Iterator<TExtRef> extRefs = ln.getInputs().getExtRef().iterator();
											
											while (extRefs.hasNext()) {
												TExtRef extRef = extRefs.next();
												TDataSet dataset = extRef.getDataSet();
												TSampledValueControl svControl = getSVControl(dataset);
												TGSEControl gseControl = getGSEControl(dataset);

												if (svControl != null) {
													long noASDU = svControl.getNofASDU();
													String noASDUString = "";
													
													if (noASDU > 1) {
														noASDUString = "[" + noASDU + "]"; 
													}
													
													if (!datasetIsConsumed(svDatasetsConsumed, dataset)) {
														Iterator<TFCDA> fcdas = dataset.getFCDA().iterator();
														svDatasetsConsumed.add(dataset.getName());
														
														//System.out.println("\tadding sv dataset: " + dataset.getName() + " size: " + svDatasetsConsumed.size());

														dataTypesHeader.appendDatatypes("\n\tstruct {");
														
														svDecodeSource.appendFunctionObject(new CFunctionCoder(dataset, extRef, CommsType.SV, CoderType.DECODER));
														svDecodeDatasetFunction.append("\n\tif (strncmp((const char *) svID, \"" + svControl.getSmvID() + "\", svIDLength) == 0) {");
														svDecodeDatasetFunction.append("\n\t\tdecode_" + svControl.getDatSet() + "_" + ln.getLnClass().toString() + "_" + ln.getInst() + "(dataset, ASDU, smpCnt);");
														svDecodeDatasetFunction.append("\n\t}");
														
														while (fcdas.hasNext()) {
															TFCDA fcda = fcdas.next();
															String dataElementName = "";
															StringBuilder dataInstanceName = new StringBuilder(ied.getName() + "." + ap.getName() + "." + ld.getInst() + ".");
															
															if (fcda.getPrefix() != null) {
																dataInstanceName.append(fcda.getPrefix());
															}
															dataInstanceName.append(ln.getLnClass().toString() + "_" + ln.getInst() + ".sv_inputs.");
															
															if (fcda.getDaName() != null) {
																dataElementName = fcda.getDaName();
															}
															else if (fcda.getDoName() != null) {
																dataElementName = fcda.getDoName();
															}
															dataInstanceName.append(dataElementName);
															dataTypesHeader.appendDatatypes("\n\t\t" + fcda.getPrintedType() + " " + dataElementName + "_" + fcda.getLnInst() + noASDUString + ";");
														}
														
														dataTypesHeader.appendDatatypes("\n\t\tvoid (*datasetDecodeDone)(CTYPE_INT16U smpCnt);");
														dataTypesHeader.appendDatatypes("\n\t} sv_inputs;");
													}
												}
												else if (gseControl != null) {
													// GSE dataset decode functions
													if (!datasetIsConsumed(gseDatasetsConsumed, dataset)) {
														Iterator<TFCDA> fcdas = dataset.getFCDA().iterator();
														gseDatasetsConsumed.add(dataset.getName());
														//System.out.println("\tadding gse dataset: " + dataset.getName());

														dataTypesHeader.appendDatatypes("\n\tstruct {");
														
														//TODO GSE datasets may have more complex names: e.g. "E1Q1SB1C1/LLN0$Positions". Ensure encoded correctly
														String datSet = extRef.getIedName() + ld.getInst() + "/" + ld.getLN0().getLnClass().toString() + "$" + gseControl.getDatSet();
														
														gseDecodeSource.appendFunctionObject(new CFunctionCoder(dataset, extRef, CommsType.GSE, CoderType.DECODER));
														
														gseDecodeDatasetFunction.append("\n\tif (strncmp((const char *) datSet, \"" + /*gseControl.getDatSet()*/datSet + "\", datSetLength) == 0) {");
														gseDecodeDatasetFunction.append("\n\t\tber_decode_" + gseControl.getDatSet() + "_" + ln.getLnClass().toString() + "_" + ln.getInst() + "(dataset);");
														gseDecodeDatasetFunction.append("\n\t}");
														
														while (fcdas.hasNext()) {
															TFCDA fcda = fcdas.next();
															String dataElementName = "";
															String fcdaName = "";
															StringBuilder dataInstanceName = new StringBuilder(ied.getName() + "." + ap.getName() + "." + ld.getInst() + ".");
															
															if (fcda.getPrefix() != null) {
																dataInstanceName.append(fcda.getPrefix());
															}
															dataInstanceName.append(ln.getLnClass().toString() + "_" + ln.getInst() + ".gse_inputs.");
															
															if (fcda.getDaName() != null) {
																dataElementName = fcda.getDaName().replaceAll("[^A-Za-z0-9]", "_");
																fcdaName = ied.getName() + "_" + ld.getInst() + "_" + fcda.getPrefix() + fcda.getDaName() + "_" + fcda.getLnInst();
																dataInstanceName.append(fcdaName);
															}
															else {
																dataElementName = fcda.getDoName();
																dataInstanceName.append(extRef.getIedName() + "_" + fcda.getLdInst() + "_" + fcda.getDoName());
															}
															dataTypesHeader.appendDatatypes("\n\t\t" + fcda.getPrintedType() + " " + extRef.getIedName() + "_" + fcda.getLdInst() + "_" + fcda.getPrefix() + dataElementName + "_" + fcda.getLnInst() + ";");
														}

														dataTypesHeader.appendDatatypes("\n\t\tvoid (*datasetDecodeDone)();");
														dataTypesHeader.appendDatatypes("\n\t} gse_inputs;");
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			
			dataTypesHeader.appendDatatypes("\n};");
			if (lnTypes.hasNext()) {
				dataTypesHeader.appendDatatypes("\n");
			}
		}
		
		dataTypesHeader.appendFunctionPrototypes("void init_datatypes();\n");
		svDecodeDatasetFunction.append("\n}\n\n");
		svDecodeSource.appendFunctions(svDecodeDatasetFunction);
		gseDecodeDatasetFunction.append("\n}\n\n");
		gseDecodeSource.appendFunctions(gseDecodeDatasetFunction);

		
		// process IEDs
		Iterator<TIED> ieds = root.getSCL().getIED().iterator();

		dataTypesSource.appendFunctions("void init_datatypes() {\n");
		boolean svExists = false;
		
		while (ieds.hasNext()) {
			TIED ied = ieds.next();
			String iedName = ied.getName();
			
			iedHeader.appendDatatypes("struct " +  iedName + " {\n");
			
			if (ied.getAccessPoint() != null) {
				Iterator<TAccessPoint> aps = ied.getAccessPoint().iterator();
				
				while (aps.hasNext()) {
					TAccessPoint ap = aps.next();
					String apName = ap.getName();
					
					iedHeader.appendDatatypes("\tstruct {\n");
					
					if (ap.getServer() != null && ap.getServer().getLDevice().size() > 0) {
						Iterator<TLDevice> lds = ap.getServer().getLDevice().iterator();
						
						while (lds.hasNext()) {
							TLDevice ld = lds.next();
							String ldName = ld.getInst();

							iedHeader.appendDatatypes("\t\tstruct {\n");
							
							// generate SV and GOOSE dataset encoders
							if (ld.getLN0() != null) {
								// add LLN0 to IED definition
								iedHeader.appendDatatypes("\t\t\tstruct " + ld.getLN0().getLnType().replaceAll("[^A-Za-z0-9]", "_") + " LLN0;\n");
								
								if (ld.getLN0().getDataSet() != null) {
									Iterator<TDataSet> datasets = ld.getLN0().getDataSet().iterator();
									
									//TODO: should loop through all TControl (sub-types: TGSEControl, TSampledValueControl) rather than datasets, because of possible many-to-one mapping
									while (datasets.hasNext()) {
										TDataSet dataset = datasets.next();
										
										if (ld.getLN0().getSampledValueControl() != null) {
											if (svExists == false) {
												svPacketDataInit.append("\tint i = 0;\n\n");	// ensure this line only appears in init_sv() once, and only if needed
												svExists = true;
											}

											// initialise LN0 data
											Iterator<TDO> dos = getLNTypeDOs(dataTypeTemplates, ld.getLN0().getLnType()).iterator();
											
											// look up lists of DOs and DAs and initialise if required
											while (dos.hasNext()) {
												TDO dataObject = dos.next();
												
												if (listContains(initDOTypes, dataObject.getType())) {
													dataTypesSource.appendFunctions("\tinit_" + dataObject.getType() + "(&" + iedName + "." + apName + "." + ldName + ".LLN0"/* + lnName*/ + "." + dataObject.getName() + ");\n");
												}
												
												if (getDOTypeDAs(dataTypeTemplates, dataObject.getType()) != null) {
													Iterator<TDA> das = getDOTypeDAs(dataTypeTemplates, dataObject.getType()).iterator();
													
													if (das != null) {
														while (das.hasNext()) {
															TDA da = das.next();
															
															if (listContains(initDATypes, da.getType())) {
																dataTypesSource.appendFunctions("\tinit_" + da.getType() + "(&" + iedName + "." + apName + "." + ldName + ".LNN0"/* + lnName*/ + "." + dataObject.getName() + "." + da.getName().toString() + ");\n");
															}
														}
													}
												}
											}
											
											
											Iterator<TSampledValueControl> svControls = ld.getLN0().getSampledValueControl().iterator();
											
											while (svControls.hasNext()) {
												TSampledValueControl svControl = svControls.next();
												
												// find SV datasets
												if (svControl.getDatSet().equals(dataset.getName())) {
													svEncodeSource.appendFunctionObject(new CFunctionCoder(dataset, CommsType.SV, CoderType.ENCODER));
												}
												
												if (svControl.getDatSet().equals(dataset.getName())) {
													String svName = svControl.getName() + "_" + svControl.getSmvID();
													svSource.appendInstances("struct svData " + svName + ";\n");
													svHeader.appendExtern("extern struct svData " + svName + ";\n");

													svPacketDataInit.append("\t" + svName + ".noASDU = " + svControl.getNofASDU() + ";\n");
													
													TSMV smv = getCommunicationSMV(comms, iedName, apName, ldName, svControl.getName());
													
													//System.out.println("svName: " + svControl.getName() + ", CbName: " + smv.getCbName() + ", LdInst: " + smv.getLdInst() + " " + smv.getAddress().getP().get(0).getValue());
													Iterator<TP> ps = smv.getAddress().getP().iterator();
													Boolean useDefaultVlanPriority = true;
													Boolean useDefaultVlanID = true;
													
													while (ps.hasNext()) {
														TP p = ps.next();
														
														if (p.getType().toString().equals("MAC-Address")) {
															String[] macSplit = p.getValue().split("-");
															
															if (macSplit.length == 6) {
																for (int i = 0; i < 6; i++) {
																	svPacketDataInit.append("\t" + svName + ".ethHeaderData.destMACAddress[" + i + "] = 0x" + macSplit[i] + ";\n");	// must be big-endian
																}
															}
														}
														else if (p.getType().toString().equals("APPID")) {
															svPacketDataInit.append("\t" + svName + ".ethHeaderData.APPID = 0x" + p.getValue() + ";\n");
														}
														else if (p.getType().toString().equals("VLAN-ID")) {
															svPacketDataInit.append("\t" + svName + ".ethHeaderData.VLAN_ID = 0x" + p.getValue() + ";\n");
															useDefaultVlanID = false;
														}
														else if (p.getType().toString().equals("VLAN-PRIORITY")) {
															svPacketDataInit.append("\t" + svName + ".ethHeaderData.VLAN_PRIORITY = 0x" + p.getValue() + ";\n");
															useDefaultVlanPriority = false;
														}
													}

													// default values specified in 9-2, 5.3.3
													if (useDefaultVlanPriority) {
														svPacketDataInit.append("\t" + svName + ".ethHeaderData.VLAN_PRIORITY = 0;\n");
													}
													if (useDefaultVlanID) {
														svPacketDataInit.append("\t" + svName + ".ethHeaderData.VLAN_ID = 4;\n");
													}
													
													svPacketDataInit.append("\t" + svName + ".ASDU = (struct ASDU *) malloc(" + svControl.getNofASDU() + " * sizeof(struct ASDU));\n");
													
													// assume all ASDUs refer to the same dataset
													//svPacketDataInit.append("\tint i = 0;\n");
													svPacketDataInit.append("\tfor (i = 0; i < " + svControl.getNofASDU() + "; i++) {\n");
													svPacketDataInit.append("\t\t" + svName + ".ASDU[i].svID = (unsigned char *) malloc(" + (svControl.getSmvID().length() + 1) + ");\n");
													svPacketDataInit.append("\t\tstrncpy((char *) " + svName + ".ASDU[i].svID, \"" + svControl.getSmvID() + "\\0\", " + (svControl.getSmvID().length() + 1) + ");\n");
													svPacketDataInit.append("\t\t" + svName + ".ASDU[i].datset = (unsigned char *) malloc(" + (dataset.getName().length() + 1) + ");\n");
													svPacketDataInit.append("\t\tstrncpy((char *) " + svName + ".ASDU[i].datset, \"" + dataset.getName() + "\\0\", " + (dataset.getName().length() + 1) + ");\n");
													svPacketDataInit.append("\t\t" + svName + ".ASDU[i].smpCnt = 0;\n");
													svPacketDataInit.append("\t\t" + svName + ".ASDU[i].confRev = " + svControl.getConfRev() + ";\n");
													
													int smpSynch = 0, showRefrTm = 0, showDatset = 0, showSmpRate = 0;
													if (svControl.getSmvOpts() != null) {
														if (svControl.getSmvOpts().isSampleSynchronized() == true) {
															smpSynch = 1;
														}
														if (svControl.getSmvOpts().isRefreshTime() == true) {
															showRefrTm = 1;
														}
														if (svControl.getSmvOpts().isDataSet() == true) {
															showDatset = 1;
														}
														if (svControl.getSmvOpts().isSampleRate() == true) {
															showSmpRate = 1;
														}
													}
													svPacketDataInit.append("\t\t" + svName + ".ASDU[i].smpSynch = " + smpSynch + ";\n");
													svPacketDataInit.append("\t\t" + svName + ".ASDU[i].showRefrTm = " + showRefrTm + ";\n");
													svPacketDataInit.append("\t\t" + svName + ".ASDU[i].showDatset = " + showDatset + ";\n");
													svPacketDataInit.append("\t\t" + svName + ".ASDU[i].showSmpRate = " + showSmpRate + ";\n");
													svPacketDataInit.append("\t\t" + svName + ".ASDU[i].smpRate = " + svControl.getSmpRate() + ";\n");
													svPacketDataInit.append("\t\t" + svName + ".ASDU[i].data.size = 0;\n");
													
													svPacketDataInit.append("\t}\n");

													svPacketDataInit.append("\t" + svName + ".ASDUCount = 0;\n");
													//svPacketDataInit.append("\t" + svName + ".datasetDecodeDone = NULL;\n");

													if (svControls.hasNext()) {
														svPacketDataInit.append("\n");
													}
													
													// update SV values function (which sends packet if noASDU reached)
													String svUpdateFunctionPrototype = "int sv_update_" + svName + "(unsigned char *buf)";
													svHeader.appendFunctionPrototypes(svUpdateFunctionPrototype + ";\n");
													
													svSource.appendFunctions("\n// returns 1 if buf contains valid packet data");
													svSource.appendFunctions("\n" + svUpdateFunctionPrototype + " {\n");
													svSource.appendFunctions("\tint size = encode_" + /*dataset.getName()*/svControl.getSmvID() + "(" + svName + ".ASDU[" + svName + ".ASDUCount].data.data);\n");
													svSource.appendFunctions("\t" + svName + ".ASDU[" + svName + ".ASDUCount].data.size = size;\n\n");

													svSource.appendFunctions("\t" + svName + ".ASDU[" + svName + ".ASDUCount].smpCnt = " + svName + ".sampleCountMaster;\n");
													svSource.appendFunctions("\t" + svName + ".sampleCountMaster++;\n\n");
													
													svSource.appendFunctions("\tif (++" + svName + ".ASDUCount == " + svName + ".noASDU) {\n");
													svSource.appendFunctions("\t\t" + svName + ".ASDUCount = 0;\n");
													svSource.appendFunctions("\t\treturn svEncodePacket(&" + svName + ", buf);\n");
													svSource.appendFunctions("\t}\n");
													svSource.appendFunctions("\n\treturn 0;\n");
													svSource.appendFunctions("}\n");
												}
											}
										}
										
										if (ld.getLN0().getGSEControl() != null) {
											Iterator<TGSEControl> gseControls = ld.getLN0().getGSEControl().iterator();
											
											while (gseControls.hasNext()) {
												TGSEControl gseControl = gseControls.next();
												
												// find GSE datasets
												if (gseControl.getDatSet().equals(dataset.getName())) {
													gseEncodeSource.appendFunctionObject(new CFunctionLengthCoder(dataset, CommsType.GSE, CoderType.ENCODER));
													gseEncodeSource.appendFunctionObject(new CFunctionCoder(dataset, CommsType.GSE, CoderType.ENCODER));
													//gseDecodeSource.appendFunctionObject(new CFunctionCoder(dataset, CommsType.GSE, CoderType.DECODER));
												}
												
												if (gseControl.getDatSet().equals(dataset.getName())) {
													String gseName = gseControl.getName() + "_" + gseControl.getAppID();
													gseSource.appendInstances("struct gseControl " + gseName + ";\n");
													gseHeader.appendExtern("extern struct gseControl " + gseName + ";\n");
													//gsePacketDataInit.append("\t" + gseName + ".noASDU = " + svControl.getNofASDU() + ";\n");
													
													TGSE gse = getCommunicationGSE(comms, iedName, apName, ldName, gseControl.getName());
													Iterator<TP> ps = gse.getAddress().getP().iterator();
													Boolean useDefaultVlanPriority = true;
													Boolean useDefaultVlanID = true;
													
													while (ps.hasNext()) {
														TP p = ps.next();
														
														if (p.getType().toString().equals("MAC-Address")) {
															String[] macSplit = p.getValue().split("-");
															
															if (macSplit.length == 6) {
																for (int i = 0; i < 6; i++) {
																	gsePacketDataInit.append("\t" + gseName + ".ethHeaderData.destMACAddress[" + i + "] = 0x" + macSplit[i] + ";\n");	// must be big-endian
																}
															}
														}
														else if (p.getType().toString().equals("APPID")) {
															gsePacketDataInit.append("\t" + gseName + ".ethHeaderData.APPID = 0x" + p.getValue() + ";\n");
														}
														else if (p.getType().toString().equals("VLAN-ID")) {
															gsePacketDataInit.append("\t" + gseName + ".ethHeaderData.VLAN_ID = 0x" + p.getValue() + ";\n");
															useDefaultVlanID = false;
														}
														else if (p.getType().toString().equals("VLAN-PRIORITY")) {
															gsePacketDataInit.append("\t" + gseName + ".ethHeaderData.VLAN_PRIORITY = 0x" + p.getValue() + ";\n");
															useDefaultVlanPriority = false;
														}
													}
													
													// default values specified in 8-1, Annex C
													if (useDefaultVlanPriority) {
														gsePacketDataInit.append("\t" + gseName + ".ethHeaderData.VLAN_PRIORITY = 0;\n");
													}
													if (useDefaultVlanID) {
														gsePacketDataInit.append("\t" + gseName + ".ethHeaderData.VLAN_ID = 4;\n");
													}
	
													gsePacketDataInit.append("\t" + gseName + ".goID = (unsigned char *) malloc(" + (gseControl.getAppID().length() + 1) + ");\n");
													gsePacketDataInit.append("\tstrncpy((char *) " + gseName + ".goID, \"" + gseControl.getAppID() + "\\0\", " + (gseControl.getAppID().length() + 1) + ");\n");
	
													gsePacketDataInit.append("\t" + gseName + ".t = 0;\n");
													
													String gocbRef = iedName + ld.getInst() + "/" + ld.getLN0().getLnClass().toString() + "$" + gseControl.getName();
													if (gocbRef.length() > 65) {
														gocbRef = gocbRef.substring(0, 64);
													}
													gsePacketDataInit.append("\t" + gseName + ".gocbRef = (unsigned char *) malloc(" + (gocbRef.length() + 1) + ");\n");
													gsePacketDataInit.append("\tstrncpy((char *) " + gseName + ".gocbRef, \"" + gocbRef + "\\0\", " + (gocbRef.length() + 1) + ");\n");
													
													String datSet = iedName + ld.getInst() + "/" + ld.getLN0().getLnClass().toString() + "$" + gseControl.getDatSet();
													if (datSet.length() > 65) {
														datSet = datSet.substring(0, 64);
													}
													gsePacketDataInit.append("\t" + gseName + ".datSet = (unsigned char *) malloc(" + (datSet.length() + 1) + ");\n");
													gsePacketDataInit.append("\tstrncpy((char *) " + gseName + ".datSet, \"" + datSet + "\\0\", " + (datSet.length() + 1) + ");\n");
	
													gsePacketDataInit.append("\t" + gseName + ".timeAllowedToLive = 0;\n");
													gsePacketDataInit.append("\t" + gseName + ".stNum = 0;\n");
													gsePacketDataInit.append("\t" + gseName + ".sqNum = 0;\n");
													gsePacketDataInit.append("\t" + gseName + ".test = 0;\n");
													gsePacketDataInit.append("\t" + gseName + ".confRev = " + gseControl.getConfRev() + ";\n");
													gsePacketDataInit.append("\t" + gseName + ".ndsCom = 0;\n");
													gsePacketDataInit.append("\t" + gseName + ".numDatSetEntries = " + dataset.getFCDA().size() + ";\n");
													gsePacketDataInit.append("\t" + gseName + ".encodeDataset = &ber_encode_" + gseControl.getAppID() + ";\n");
													gsePacketDataInit.append("\t" + gseName + ".getDatasetLength = &ber_get_length_" + gseControl.getAppID() + ";\n");
													//gsePacketDataInit.append("\t" + gseName + ".datasetDecodeDone = NULL;\n\n");
													
													// send GSE function
													String gseUpdateFunctionPrototype = "int gse_send_" + gseName + "(unsigned char *buf, CTYPE_BOOLEAN statusChange, CTYPE_INT32U timeAllowedToLive)";
													gseHeader.appendFunctionPrototypes(gseUpdateFunctionPrototype + ";\n");
													
													gseSource.appendFunctions("\n// returns 1 if buf contains valid packet data");
													gseSource.appendFunctions("\n" + gseUpdateFunctionPrototype + " {\n");
													
													gseSource.appendFunctions("\t" + gseName + ".timeAllowedToLive = timeAllowedToLive;\n\n");
													gseSource.appendFunctions("\tif (statusChange) {\n");
													gseSource.appendFunctions("\t\t" + gseName + ".stNum++;\n");
													gseSource.appendFunctions("\t\tif (" + gseName + ".stNum == 0) {\n");
													gseSource.appendFunctions("\t\t\t" + gseName + ".stNum = 1;\n");
													gseSource.appendFunctions("\t\t}\n");
													gseSource.appendFunctions("\t\t" + gseName + ".sqNum = 0;\n");
													gseSource.appendFunctions("\t}\n");
													gseSource.appendFunctions("\telse {\n");
													gseSource.appendFunctions("\t\t" + gseName + ".sqNum++;\n");
													gseSource.appendFunctions("\t\tif (" + gseName + ".sqNum == 0) {\n");
													gseSource.appendFunctions("\t\t\t" + gseName + ".sqNum = 1;\n");
													gseSource.appendFunctions("\t\t}\n\t}\n\n");
													
													gseSource.appendFunctions("\treturn gseEncodePacket(&" + gseName + ", buf);\n");
													gseSource.appendFunctions("}\n");
												}
											}
										}
									}
								}
							}
							
							Iterator<TLN> lns = ld.getLN().iterator();
							
							while (lns.hasNext()) {
								TLN ln = lns.next();
								StringBuilder lnName = new StringBuilder();
								
								if (ln.getPrefix() != null && !ln.getPrefix().equals("")) {
									lnName.append(ln.getPrefix());
								}
								
								lnName.append(ln.getLnClass().toString().replaceAll("[^A-Za-z0-9]", "_") + "_" + ln.getInst());	// multiple LN instances are given the C name: "[<Prefix>]<LN class>_<instance number>"
								
								iedHeader.appendDatatypes("\t\t\tstruct " + ln.getLnType().replaceAll("[^A-Za-z0-9]", "_") + " " + lnName + ";\n");
								
								
								// initialise LN data
								Iterator<TDO> dos = getLNTypeDOs(dataTypeTemplates, ln.getLnType()).iterator();
								StringBuilder accumulatedName = new StringBuilder(iedName + "." + apName + "." + ldName + "." + lnName + ".");
								
								// look up lists of DOs and DAs and initialise if required
								while (dos.hasNext()) {
									TDO dataObject = dos.next();
									
									if (listContains(initDOTypes, dataObject.getType())) {
										dataTypesSource.appendFunctions("\tinit_" + dataObject.getType() + "(&" + accumulatedName.toString() + dataObject.getName() + ");\n");
									}
									
									Iterator<TDA> das = getDOTypeDAs(dataTypeTemplates, dataObject.getType()).iterator();
									
									while (das.hasNext()) {
										TDA da = das.next();
										
										if (listContains(initDATypes, da.getType())) {
											dataTypesSource.appendFunctions("\tinit_" + da.getType() + "(&" + accumulatedName.toString() + dataObject.getName() + "." + da.getName().toString() + ");\n");
										}
										
										//TODO make recursive; add SDO
										processDA(dataTypeTemplates, ln, dataObject, da, initDATypes);
										
										//System.out.println("DA: " + getDA(dataTypeTemplates, ln.getLnClass().toString(), dataObject.getName(), da.getName().toString()));
									}
								}
								
								// override specific LN data
								Iterator<TDOI> dois = ln.getDOI().iterator();
								accumulatedName = new StringBuilder(iedName + "." + apName + "." + ldName + "." + lnName + ".");
								
								while (dois.hasNext()) {
									TDOI doi = dois.next();
									Iterator<TDAI> dais = doi.getDAI().iterator();
									Iterator<TSDI> sdis = doi.getSDI().iterator();
									accumulatedName.append(doi.getName() + ".");
									
									while (dais.hasNext()) {
										TDAI dai = dais.next();
										Iterator<TVal> vals = dai.getVal().iterator();
										
										// only supports single values
										if (dai.getVal().size() == 1) {
											while (vals.hasNext()) {
												TVal val = vals.next();
											
												//dataTypesSource.appendFunctions("\t" + accumulatedName.toString() + dai.getName().toString() + " = " + val.getValue() + ";\n");
												dataTypesSource.appendFunctions(initDAI(accumulatedName.toString(), dai, val));
											}
										}
									}
									
									while (sdis.hasNext()) {
										TSDI sdi = sdis.next();
										
										processSDI(sdi, new StringBuilder(accumulatedName + sdi.getName().toString() + "."), dataTypesSource);
									}
								}
							}

							iedHeader.appendDatatypes("\t\t} " + ldName + ";\n");
						}
					}
					
					iedHeader.appendDatatypes("\t} " +  apName + ";\n");
				}
			}

			iedHeader.appendDatatypes("};\n");

			if (ieds.hasNext()) {
				iedHeader.appendDatatypes("\n");
			}

			iedSource.appendInstances("struct " + iedName + " " + iedName + ";\n");
			iedHeader.appendExtern("extern struct " + iedName + " " + iedName + ";\n");
		}
		
		dataTypesSource.appendFunctions("}\n");

		
		
		svSource.appendFunctions("\nvoid init_sv() {\n");
		svSource.appendFunctions(svPacketDataInit);
		svSource.appendFunctions("}\n");
		
		gseSource.appendFunctions("\nvoid init_gse() {\n");
		gseSource.appendFunctions(gsePacketDataInit);
		gseSource.appendFunctions("}\n");
		
		svDecodeHeader = svDecodeSource.populateHeaderFilePrototypes(svDecodeHeader);
		svEncodeHeader = svEncodeSource.populateHeaderFilePrototypes(svEncodeHeader);
		gseEncodeHeader = gseEncodeSource.populateHeaderFilePrototypes(gseEncodeHeader);
		gseDecodeHeader = gseDecodeSource.populateHeaderFilePrototypes(gseDecodeHeader);
		svDecodeHeader.appendFunctionPrototypes("\nvoid svDecodeDataset(unsigned char *dataset, int datasetLength, int ASDU, unsigned char *svID, int svIDLength, CTYPE_INT16U smpCnt);");
		gseDecodeHeader.appendFunctionPrototypes("\nvoid gseDecodeDataset(unsigned char *dataset, int datasetLength, unsigned char *datSet, int datSetLength);");
		svEncodeHeader.appendFunctionPrototypes("\nint svEncodePacket(struct svData *svData, unsigned char *buf);");
		gseEncodeHeader.appendFunctionPrototypes("int gseEncodePacket(struct gseControl *gseControl, unsigned char *buf);");
		svHeader.appendFunctionPrototypes("void svDecode(unsigned char *buf, int len);\n");
		gseHeader.appendFunctionPrototypes("void gseDecode(unsigned char *buf, int len);\n");
		
		svDecodeSource.saveFile();
		svEncodeSource.saveFile();
		gseDecodeSource.saveFile();
		gseEncodeSource.saveFile();
		svSource.saveFile();
		gseSource.saveFile();
		iedSource.saveFile();
		dataTypesSource.saveFile();

		svEncodeHeader.saveFile();
		svDecodeHeader.saveFile();
		gseEncodeHeader.saveFile();
		gseDecodeHeader.saveFile();
		svHeader.saveFile();
		gseHeader.saveFile();
		iedHeader.saveFile();
		dataTypesHeader.saveFile();
		
		/*try {
			resource.save(System.out, null);
		} catch (IOException e) {
			e.printStackTrace();
		}*/
	}
	


	private static void processDA(TDataTypeTemplates dataTypeTemplates, TLN ln, TDO dataObject, TDA da, List<String> initDATypes) {

	}

	public static void processSDI(TSDI sdi, StringBuilder accumulatedName, CSource dataTypesSource) {
		Iterator<TDAI> dais = sdi.getDAI().iterator();
		Iterator<TSDI> sdis = sdi.getSDI().iterator();
		
		while (dais.hasNext()) {
			TDAI dai = dais.next();
			Iterator<TVal> vals = dai.getVal().iterator();
			
			// only supports single values
			if (dai.getVal().size() == 1) {
				while (vals.hasNext()) {
					TVal val = vals.next();
				
					//dataTypesSource.appendFunctions("\t" + accumulatedName.toString() + dai.getName().toString() + " = " + val.getValue() + ";\n");
					dataTypesSource.appendFunctions(initDAI(accumulatedName.toString(), dai, val));
				}
			}
		}
		
		while (sdis.hasNext()) {
			TSDI sdiNext = sdis.next();
			
			processSDI(sdiNext, new StringBuilder(accumulatedName + sdiNext.getName().toString() + "."), dataTypesSource);
		}
	}
	
	public static String initDAI(String accumulatedName, TDAI dai, TVal val) {
		String initCode = "";
		String datatype = "Int32";
		int valSize = val.getValue().length() + 1;
		
		if (datatype.equals("VisString255")) {
			initCode = initCode.concat("\t" + accumulatedName.toString() + dai.getName().toString() + " = (CTYPE_VISSTRING255) malloc(" + valSize + ");\n");
			initCode = initCode.concat("\tstrncpy(" + "\t" + accumulatedName.toString() + dai.getName().toString() + ", \"" + val.getValue() + "\\0\", " + valSize + ");\n");
		}
		else {
			//TODO: complete for other data types
			//initCode = initCode.concat("\t" + accumulatedName.toString() + dai.getName().toString() + " = " + val.getValue() + ";\n");
		}
		
		return initCode;
	}
	
	public static Boolean listContains(List<String> list, String da) {
		Iterator<String> iter = list.iterator();
		
		while (iter.hasNext()) {
			if (iter.next().equals(da)) {
				return true;
			}
		}
		
		return false;
	}
	
	public static String initAbstractDataAttribute(String id, TAbstractDataAttribute da, TVal val) {
		String initCode = "";
		int valSize = val.getValue().length() + 1;
		
		if (da.getBType().toString().equals("VisString255")) {
			initCode = initCode.concat("\t" + id + "->" + da.getName().toString() + " = (CTYPE_VISSTRING255) malloc(" + valSize + ");\n");
			initCode = initCode.concat("\tstrncpy(" + id + "->" + da.getName().toString() + ", \"" + val.getValue() + "\\0\", " + valSize + ");\n");
		}
		else if (da.getBType().toString().equals("FLOAT32")) {
			initCode = initCode.concat("\t" + id + "->" + da.getName().toString() + " = " + val.getValue() + ";\n");
		}
		
		return initCode;
	}
	
	public static List<TDO> getLNTypeDOs(TDataTypeTemplates dataTypeTemplates, String lnTypeName) {
		Iterator<TLNodeType> lnTypes = dataTypeTemplates.getLNodeType().iterator();
		
		while (lnTypes.hasNext()) {
			TLNodeType lnType = lnTypes.next();
			
			if (lnType.getId().equals(lnTypeName)) {
				return lnType.getDO();
			}
		}
		
		return null;
	}
	
	
	public static List<TDA> getDOTypeDAs(TDataTypeTemplates dataTypeTemplates, String doTypeName) {
		Iterator<TDOType> doTypes = dataTypeTemplates.getDOType().iterator();
		
		while (doTypes.hasNext()) {
			TDOType doType = doTypes.next();
			
			if (doType.getId().equals(doTypeName)) {
				return doType.getDA();
			}
		}
		
		return null;
	}
	
	public static String getNameFromCompoundName(String compound) {
		String split[] = compound.split("\\.");
		
		if (split.length > 0) {
			return split[split.length - 1];
		}
		
		return compound;
	}
	
	public static TSampledValueControl getSVControl(TDataSet dataset) {
		if (dataset == null) {
			return null;
		}
		
		TLN0 ln0 = (TLN0) (dataset.eContainer());
		
		if (ln0 == null) {
			return null;
		}
		
		Iterator<TSampledValueControl> svControls =  ln0.getSampledValueControl().iterator();
		
		while (svControls.hasNext()) {
			TSampledValueControl svControl = svControls.next();
			
			if (svControl.getDatSet().equals(dataset.getName())) {
				return svControl;
			}
		}
		
		return null;
	}
	
	public static TGSEControl getGSEControl(TDataSet dataset) {
		if (dataset == null) {
			return null;
		}
		TLN0 ln0 = (TLN0) (dataset.eContainer());
		
		if (ln0 == null) {
			return null;
		}
		
		Iterator<TGSEControl> gseControls =  ln0.getGSEControl().iterator();
		
		while (gseControls.hasNext()) {
			TGSEControl gseControl = gseControls.next();
			
			if (gseControl.getDatSet().equals(dataset.getName())) {
				return gseControl;
			}
		}
		
		return null;
	}
	
	public static Boolean datasetIsConsumed(List<String> datasetsConsumed, TDataSet dataset) {
		Iterator<String> iter = datasetsConsumed.iterator();
		
		while (iter.hasNext()) {
			if (iter.next().equals(dataset.getName())) {
				return true;
			}
		}
		
		return false;
	}


	public static TDO getDO2(TDataTypeTemplates dataTypeTemplates, String lnClass, String doName) {
		ObjectInstanceCondition sc = new ObjectInstanceCondition((Object) lnClass) {
			@Override
			public boolean isSatisfied(Object obj) {
				return getObject().toString().equals(obj.toString());
			}
		};
		final EObjectCondition isLNClass = new EObjectAttributeValueCondition(
			SclPackage.eINSTANCE.getTLNodeType_LnClass(),
			sc
		);
		final EObjectCondition isDOName = new EObjectAttributeValueCondition(
			SclPackage.eINSTANCE.getTDO_Name(),
			new StringValue(doName)
		);

		// find DO name, then extract DO type
		IQueryResult result = new SELECT(
			new FROM(
				new SELECT(
					new FROM(dataTypeTemplates),
					new WHERE(isLNClass)
				)
			), new WHERE(isDOName)
		).execute();
		
		System.out.println("results: " + result.size());

		return null;
	}

	public static TDO getDO(TDataTypeTemplates dataTypeTemplates, String lnClass, String doName) {
		Iterator<TLNodeType> lnTypes = dataTypeTemplates.getLNodeType().iterator();
		
		while (lnTypes.hasNext()) {
			TLNodeType lnType = lnTypes.next();
			
			Iterator<TDO> dos = lnType.getDO().iterator();

			while (dos.hasNext()) {
				TDO doType = dos.next();
				
				if (doType.getName().equals(doName)) {
					return doType;
				}
			}
		}
		
		return null;
	}

	public static TAbstractDataAttribute getDA(TDataTypeTemplates dataTypeTemplates, String lnInst, String lnClass, String doName, String daName) {
		ObjectInstanceCondition sc = new ObjectInstanceCondition((Object) lnClass) {
			@Override
			public boolean isSatisfied(Object obj) {
				return getObject().toString().equals(obj.toString());
			}
		};
		final EObjectCondition isLNClass = new EObjectAttributeValueCondition(
			SclPackage.eINSTANCE.getTLNodeType_LnClass(),
			sc
		);
		final EObjectCondition isDOName = new EObjectAttributeValueCondition(
			SclPackage.eINSTANCE.getTDO_Name(),
			new StringValue(doName)
		);
		final EObjectCondition isDAName = new EObjectAttributeValueCondition(
			SclPackage.eINSTANCE.getTAbstractDataAttribute_Name(),
			new StringValue(daName)
		);

		// find DO name, then extract DO type
		IQueryResult result = new SELECT(
			new FROM(
				new SELECT(
					new FROM(dataTypeTemplates),
					new WHERE(isLNClass)
				)
			), new WHERE(isDOName)
		).execute();
		
		String DOType = "";
		if (result.getException() != null) {
			return null;
		} else {
	        if (result.size() >= Integer.parseInt(lnInst)) {
	        	int i = 1;
			    for (Object next : result) {
			        if (i == Integer.parseInt(lnInst)) {
				        DOType = ((TDO) next).getType();
				        break;
			        }
			        i++;
			    }
	        }
	        else {
	        	//System.out.println("result = " + result.size() + ", " + Integer.parseInt(lnInst));
	        	return null;
	        }
		}
		final EObjectCondition isDOType = new EObjectAttributeValueCondition(
			SclPackage.eINSTANCE.getTIDNaming_Id(),
			new StringValue(DOType)
		);
		
		// find DA from DO type (the id attribute) and DA name
		IQueryResult result2 = 	new SELECT(
			new FROM(
				new SELECT(
					new FROM(dataTypeTemplates),
					new WHERE(isDOType)
				)
			), new WHERE(isDAName)
		).execute();
    	//System.out.println("result1 = " + result.size() + ", result2 = " + result2.size());
		
		if (result2.getException() != null) {
			return null;
		} else {
	        if (result2.size() == 1) {
			    for (Object next : result2) {
			        return (TAbstractDataAttribute) next;
			    }
	        }
	        else {
	        	return null;
	        }
		}
		
		return null;
	}

	public static TSMV getCommunicationSMV(TCommunication comms, String iedName, String apName, String ldName, String cbName) {
		if (comms == null) {
			System.out.println("comms null!");
			return null;
		}
		
		Iterator<TSubNetwork> subnets = comms.getSubNetwork().iterator();
		
		while (subnets.hasNext()) {
			TSubNetwork subnet  = subnets.next();
			
			Iterator<TConnectedAP> aps = subnet.getConnectedAP().iterator();
			
			while (aps.hasNext()) {
				TConnectedAP ap = aps.next();
				
				if (ap.getIedName().equals(iedName) && ap.getApName().equals(apName)) {
					
					Iterator<TSMV> smvs = ap.getSMV().iterator();
					
					while (smvs.hasNext()) {
						TSMV smv = smvs.next();
						
						if (smv.getCbName().equals(cbName) && smv.getLdInst().equals(ldName)) {
							return smv;
						}
					}
				}
			}
		}
		
		return null;
	}
	
	public static TGSE getCommunicationGSE(TCommunication comms, String iedName, String apName, String ldName, String cbName) {
		if (comms == null) {
			System.out.println("comms null!");
			return null;
		}
		
		Iterator<TSubNetwork> subnets = comms.getSubNetwork().iterator();
		
		while (subnets.hasNext()) {
			TSubNetwork subnet  = subnets.next();
			
			Iterator<TConnectedAP> aps = subnet.getConnectedAP().iterator();
			
			while (aps.hasNext()) {
				TConnectedAP ap = aps.next();
				
				if (ap.getIedName().equals(iedName) && ap.getApName().equals(apName)) {
					
					Iterator<TGSE> gses = ap.getGSE().iterator();
					
					while (gses.hasNext()) {
						TGSE gse = gses.next();
						
						if (gse.getCbName().equals(cbName) && gse.getLdInst().equals(ldName)) {
							return gse;
						}
					}
				}
			}
		}
		
		return null;
	}
}
