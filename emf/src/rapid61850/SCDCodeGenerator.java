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

package rapid61850;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ch.iec._61850._2006.scl.DocumentRoot;
import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TAbstractDataAttribute;
import ch.iec._61850._2006.scl.TAccessPoint;
import ch.iec._61850._2006.scl.TBDA;
import ch.iec._61850._2006.scl.TCommunication;
import ch.iec._61850._2006.scl.TConnectedAP;
import ch.iec._61850._2006.scl.TControl;
import ch.iec._61850._2006.scl.TDA;
import ch.iec._61850._2006.scl.TDAI;
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
import ch.iec._61850._2006.scl.TSDI;
import ch.iec._61850._2006.scl.TSDO;
import ch.iec._61850._2006.scl.TSMV;
import ch.iec._61850._2006.scl.TSampledValueControl;
import ch.iec._61850._2006.scl.TSubNetwork;
import ch.iec._61850._2006.scl.TVal;

public class SCDCodeGenerator {

	private static final int JSON_WEB_SERVER_START_PORT = 8001;

	public void generateCode(DocumentRoot root, SCDAdditionalMappings map) {
		// initialise C header files
		CHeader dataTypesHeader = new CHeader("datatypes.h", "DATATYPES_H");
		CHeader svEncodeHeader = new CHeader("svEncode.h", "SV_ENCODE_H");
		CHeader svDecodeHeader = new CHeader("svDecode.h", "SV_DECODE_H");
		CHeader gseEncodeHeader = new CHeader("gseEncode.h", "GSE_ENCODE_H");
		CHeader gseDecodeHeader = new CHeader("gseDecode.h", "GSE_DECODE_H");
		CHeader svHeader = new CHeader("sv.h", "SV_H");
		CHeader gseHeader = new CHeader("gse.h", "GSE_H");
		CHeader iedHeader = new CHeader("ied.h", "IED_H");
		CHeader interfaceHeader = new CHeader("interfaceSendPacket.h", "INTERFACE_SEND_PACKET_H");

		dataTypesHeader.addIncludeLocal("ctypes.h");
		svEncodeHeader.addIncludeLocal("svEncodeBasic.h");
		svEncodeHeader.addIncludeLocal("svPacketData.h");
		svDecodeHeader.addIncludeLocal("svPacketData.h");
		gseEncodeHeader.addIncludeLocal("gseEncodeBasic.h");
		gseEncodeHeader.addIncludeLocal("gsePacketData.h");
		gseDecodeHeader.addIncludeLocal("gsePacketData.h");
		gseDecodeHeader.addIncludeLocal(dataTypesHeader);
		svHeader.addIncludeLocal(svEncodeHeader);
		svHeader.addIncludeLocal(svDecodeHeader);
		svHeader.addIncludeLocal("svPacketData.h");
		gseHeader.addIncludeLocal(gseEncodeHeader);
		gseHeader.addIncludeLocal(gseDecodeHeader);
		gseHeader.addIncludeLocal("gsePacketData.h");
		iedHeader.addIncludeLocal(dataTypesHeader);
		iedHeader.addIncludeLocal(svHeader);
		iedHeader.addIncludeLocal(gseHeader);
		interfaceHeader.addIncludeLocal("iec61850.h");
		interfaceHeader.addIncludeLocal("interface.h");
		
		// initialise C source files
		CSource svEncodeSource = new CSource("svEncode.c");
		CSource svDecodeSource = new CSource("svDecode.c");
		CSource gseEncodeSource = new CSource("gseEncode.c");
		CSource gseDecodeSource = new CSource("gseDecode.c");
		CSource svSource = new CSource("sv.c");
		CSource gseSource = new CSource("gse.c");
		CSource iedSource = new CSource("ied.c");
		CSource dataTypesSource = new CSource("datatypes.c");
		CSource interfaceSource = new CSource("interfaceSendPacket.c");
		CSource jsonDataModelIndexSource = new CSource("dataModelIndex.c");

		svEncodeSource.addIncludeLocal("svEncodeBasic.h");
		svEncodeSource.addIncludeLocal(iedHeader);
		svEncodeSource.addIncludeLocal(svEncodeHeader);

		svDecodeSource.addIncludeLocal(svHeader);
		svDecodeSource.addIncludeLocal("svDecodeBasic.h");
		svDecodeSource.addIncludeLocal(iedHeader);
		svDecodeSource.addIncludeLocal(svDecodeHeader);

		gseEncodeSource.addIncludeLocal("gseEncodeBasic.h");
		gseEncodeSource.addIncludeLocal(iedHeader);
		gseEncodeSource.addIncludeLocal(gseEncodeHeader);

		gseDecodeSource.addIncludeLocal("gseDecodeBasic.h");
		gseDecodeSource.addIncludeLocal(gseHeader);
		gseDecodeSource.addIncludeLocal(iedHeader);
		gseDecodeSource.addIncludeLocal(gseDecodeHeader);

		svSource.addIncludeLocal(iedHeader);
		svSource.addIncludeLocal(svHeader);
		svSource.addIncludeLocal("svPacketData.h");
		svSource.addIncludeLocal(svDecodeHeader);
		svSource.addIncludeLocal(svEncodeHeader);

		gseSource.addIncludeLocal(iedHeader);
		gseSource.addIncludeLocal("gsePacketData.h");
		gseSource.addIncludeLocal(gseDecodeHeader);
		gseSource.addIncludeLocal(gseEncodeHeader);

		iedSource.addIncludeLocal(iedHeader);
		iedSource.addIncludeLocal(dataTypesHeader);

		dataTypesSource.addIncludeLocal("ctypes.h");
		dataTypesSource.addIncludeLocal(dataTypesHeader);
		dataTypesSource.addIncludeLocal(iedHeader);
		dataTypesSource.addIncludeSystem("stdlib.h");

		jsonDataModelIndexSource.addIncludeLocal("ctypes.h");
		jsonDataModelIndexSource.addIncludeLocal(dataTypesHeader);
		jsonDataModelIndexSource.addIncludeLocal(iedHeader);
		jsonDataModelIndexSource.addIncludeSystem("stdlib.h");
		jsonDataModelIndexSource.addIncludeLocal("dataModelIndex.h");
		
		interfaceSource.addIncludeLocal(interfaceHeader);
		

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

				dataTypesHeader.appendDatatypes("\t" + enumType.getId().toUpperCase().replaceAll("[^A-Za-z0-9]", "_") + "_" + enumVal.getValue().toUpperCase().replaceAll("[^A-Za-z0-9]", "_") + "_" + enumVal.getOrd().toString().replaceAll("[^A-Za-z0-9]", "_") + " = " + enumVal.getOrd().intValue());
				
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
			gseEncodeSource.appendFunctionObject(new CFunctionGSELengthCoder(daType, CoderType.ENCODER, map));
			gseEncodeSource.appendFunctionObject(new CFunctionGSECoder(daType, CoderType.ENCODER, map));
			gseDecodeSource.appendFunctionObject(new CFunctionGSECoder(daType, CoderType.DECODER, map));
			svEncodeSource.appendFunctionObject(new CFunctionSVCoder(daType, CoderType.ENCODER, map));
			svDecodeSource.appendFunctionObject(new CFunctionSVCoder(daType, CoderType.DECODER, map));
			
			Iterator <TBDA> bdaTypes = daType.getBDA().iterator();

			dataTypesSource.appendFunctions("void init_" + daType.getId() + "(struct " + daType.getId() + " *" + daType.getId() + ") {\n");
			
			while (bdaTypes.hasNext()) {
				TBDA bdaType = bdaTypes.next();
				String bda = map.getPrintedType(bdaType) + " " + bdaType.getName() + ";";

				dataTypesHeader.appendDatatypes("\n\t" + bda);
				
				// create initialise function, and add to list
				Iterator<TVal> vals = bdaType.getVal().iterator();
				while (vals.hasNext()) {
					TVal val = vals.next();
					
					dataTypesSource.appendFunctions(initAbstractDataAttribute(daType.getId(), bdaType, val, true));
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
			gseEncodeSource.appendFunctionObject(new CFunctionGSELengthCoder(doType, CoderType.ENCODER, map));
			gseEncodeSource.appendFunctionObject(new CFunctionGSECoder(doType, CoderType.ENCODER, map));
			gseDecodeSource.appendFunctionObject(new CFunctionGSECoder(doType, CoderType.DECODER, map));
			svEncodeSource.appendFunctionObject(new CFunctionSVCoder(doType, CoderType.ENCODER, map));
			svDecodeSource.appendFunctionObject(new CFunctionSVCoder(doType, CoderType.DECODER, map));
			
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
				String daString = map.getPrintedType(da) + " " + da.getName() + ";";

				dataTypesHeader.appendDatatypes("\n\t" + daString);
				
				Iterator<TVal> vals = da.getVal().iterator();
				while (vals.hasNext()) {
					TVal val = vals.next();
					
					// create initialise function, and add to list
					dataTypesSource.appendFunctions(initAbstractDataAttribute(doType.getId(), da, val, true));
					initDOTypes.add(doType.getId());
				}
			}
			dataTypesSource.appendFunctions("}\n");
			
			
			dataTypesHeader.appendDatatypes("\n};");
			if (doTypes.hasNext()) {
				dataTypesHeader.appendDatatypes("\n");
			}
		}
		
		
		// process IEDs
		Iterator<TIED> ieds = root.getSCL().getIED().iterator();
		
		dataTypesHeader.appendDatatypes("\n\n// datasets");
		dataTypesSource.appendFunctions("void init_datatypes() {\n");
		jsonDataModelIndexSource.appendFunctions("void init_data_model_index() {\n");
		boolean svExists = false;

		// create IED-to-JSON database
		String databaseName = "dataModelIndex";
		JSONDatabaseManager iedJSON = new JSONDatabaseManager(databaseName);
		int numberOfIEDs = root.getSCL().getIED().size();
		jsonDataModelIndexSource.appendInstances("#if JSON_INTERFACE == 1\n\n");
		jsonDataModelIndexSource.appendInstances("Item " + databaseName + " = {\"root\", BASIC_TYPE_CONSTRUCTED, \"\", NULL, " + numberOfIEDs + "};");
		jsonDataModelIndexSource.appendFunctions("\t" + databaseName + ".items = (Item*) calloc(" + numberOfIEDs + ", sizeof(Item)); // IEDs\n");
//		jsonDatabaseSource.appendFunctions("\t" + databaseName + ".numberOfItems = " + numberOfIEDs + ";\n");
//		iedJSON.addLayer();	// IEDs
		
		while (ieds.hasNext()) {
			TIED ied = ieds.next();
			String iedName = ied.getName();
			
			iedHeader.appendDatatypes("struct " +  iedName + "_t {\n");
			

			jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".objectRef = \"" + iedName + "\";\n");
			jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".type = BASIC_TYPE_CONSTRUCTED;\n");
			jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".typeSCL = \"IED\";\n");
			jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".data = &" + iedName + ";\n");
			
			
			if (ied.getAccessPoint() != null) {
				Iterator<TAccessPoint> aps = ied.getAccessPoint().iterator();
				
//				JSONDatabaseManager iedJSON = new JSONDatabaseManager(iedName);
//				jsonDatabaseSource.appendInstances("Item " + iedJSON.getPath() + "_database = {\"" + iedName + "\", &" + iedName + ", " + ied.getAccessPoint().size() + "};\n");
				jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".items = (Item*) calloc(" + ied.getAccessPoint().size() + ", sizeof(Item)); // APs+Servers\n");
				jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".numberOfItems = " + ied.getAccessPoint().size() + ";\n");
				iedJSON.addLayer();
				
				while (aps.hasNext()) {
					TAccessPoint ap = aps.next();
					String apName = ap.getName();
					
					iedHeader.appendDatatypes("\tstruct {\n");
					
					jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".objectRef = \"" + apName + "\";\n");
					jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".type = BASIC_TYPE_CONSTRUCTED;\n");
					jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".typeSCL = \"AccessPoint\";\n");
					jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".data = &" + iedName + "." + apName + ";\n");
					
					if (ap.getServer() != null && ap.getServer().getLDevice().size() > 0) {
						Iterator<TLDevice> lds = ap.getServer().getLDevice().iterator();
						
						jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".items = (Item*) calloc(" + ap.getServer().getLDevice().size() + ", sizeof(Item)); // LDs\n");
						jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".numberOfItems = " + ap.getServer().getLDevice().size() + ";\n");
						iedJSON.addLayer();
						
						while (lds.hasNext()) {
							TLDevice ld = lds.next();
							String ldName = ld.getInst();

							iedHeader.appendDatatypes("\t\tstruct {\n");
							
							jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".objectRef = \"" + ldName + "\";\n");
							jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".type = BASIC_TYPE_CONSTRUCTED;\n");
							jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".typeSCL = \"LogicalDevice\";\n");
							jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".data = &" + iedName + "." + apName + "." + ldName + ";\n");
//							iedJSON.addItem();
							
							Iterator<TLN> lns = ld.getLN().iterator();
							
							int numberOfLNs = ld.getLN().size();
							if (ld.getLN0() != null) {
								numberOfLNs++;
							}
							jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".items = (Item*) calloc(" + numberOfLNs + ", sizeof(Item)); // LNs\n");
							jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".numberOfItems = " + numberOfLNs + ";\n");
							iedJSON.addLayer();
							
							// generate SV and GOOSE dataset encoders
							if (ld.getLN0() != null) {
								// add LLN0 to IED definition
								TLN0 ln0 = ld.getLN0();
								String ln0Name = ln0.getLnType().replaceAll("[^A-Za-z0-9]", "_");
								iedHeader.appendDatatypes("\t\t\tstruct {\n");
								iedHeader.appendDatatypes("\t\t\t\tstruct " + ln0Name + " LLN0;\n");
								

//								jsonDatabaseSource.appendFunctions("\t" + iedJSON.getPath() + ".objectRef = \"" + ln0.getLnType() + "\";\n");
//								jsonDatabaseSource.appendFunctions("\t" + iedJSON.getPath() + ".type = BASIC_TYPE_CONSTRUCTED;\n");
//								jsonDatabaseSource.appendFunctions("\t" + iedJSON.getPath() + ".typeSCL = \"" + ln0.getLnType() + "\";\n");
//								jsonDatabaseSource.appendFunctions("\t" + iedJSON.getPath() + ".data = &" + iedName + "." + apName + "." + ldName + ".LN0.LLN0" + ";\n");
//								iedJSON.addItem();
								
								
								// initialise LN0 data hierarchy
								Iterator<TDO> ln0Dos = getLNTypeDOs(dataTypeTemplates, ln0.getLnType()).iterator();
								StringBuilder accumulatedName = new StringBuilder(iedName + "." + apName + "." + ldName + "." + ln0Name + ".LLN0.");

								jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".objectRef = \"" + ln0Name + "\";\n");
								jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".type = BASIC_TYPE_CONSTRUCTED;\n");
								jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".typeSCL = \"" + ln0.getLnType() + "\";\n");
								jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".lnClass = \"" + ln0.getLnClass().toString() + "\";\n");
								jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".data = &" + iedName + "." + apName + "." + ldName + "." + "LN0" + ".LLN0;\n");
								
								
								int numberOfDOs = getLNTypeDOs(dataTypeTemplates, ln0.getLnType()).size();
								jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".items = (Item*) calloc(" + numberOfDOs + ", sizeof(Item)); // DOs\n");
								jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".numberOfItems = " + numberOfDOs + ";\n");
								iedJSON.addLayer();
								
								// look up lists of DOs and DAs and initialise if required
								while (ln0Dos.hasNext()) {
									TDO dataObject = ln0Dos.next();

									jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".objectRef = \"" + dataObject.getName() + "\";\n");
									jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".type = BASIC_TYPE_CONSTRUCTED;\n");
									jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".typeSCL = \"" + dataObject.getType() + "\";\n");
									jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".CDC = \"" + getDOTypeCDC(dataTypeTemplates, dataObject.getType()) + "\";\n");
									jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".data = &" + iedName + "." + apName + "." + ldName + "." + "LN0" + ".LLN0." + dataObject.getName() + ";\n");

									int numberOfDAsAndSDOs = getDOTypeDAs(dataTypeTemplates, dataObject.getType()).size() + getDOTypeSDOs(dataTypeTemplates, dataObject.getType()).size();
									jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".items = (Item*) calloc(" + numberOfDAsAndSDOs + ", sizeof(Item)); // DAs (top level)\n");
									jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".numberOfItems = " + numberOfDAsAndSDOs + ";\n");
									iedJSON.addLayer();
									
									processDO(dataTypeTemplates, dataTypesSource, initDOTypes, initDATypes, accumulatedName, dataObject.getType(), dataObject.getName(), jsonDataModelIndexSource, iedJSON);
									
									iedJSON.popLayer();
									
									if (ln0Dos.hasNext()) {
										iedJSON.addItem();
									}
								}
								
								iedJSON.popLayer();
								iedJSON.addItem();
								
								
								if (ld.getLN0().getDataSet() != null) {
									Iterator<TDataSet> datasets = ld.getLN0().getDataSet().iterator();
									
									while (datasets.hasNext()) {
										TDataSet dataset = datasets.next();
										
										gseEncodeSource.appendFunctionObject(new CFunctionGSELengthCoder(dataset, CoderType.ENCODER, map));
										gseDecodeSource.appendFunctionObject((new CFunctionGSECoder(dataset, CoderType.DECODER, map)));
										gseEncodeSource.appendFunctionObject((new CFunctionGSECoder(dataset, CoderType.ENCODER, map)));
										svDecodeSource.appendFunctionObject((new CFunctionSVCoder(dataset, CoderType.DECODER, map)));
										svEncodeSource.appendFunctionObject((new CFunctionSVCoder(dataset, CoderType.ENCODER, map)));

										dataTypesHeader.appendDatatypes("\nstruct " + ied.getName() + "_" + ld.getInst() + "_" + dataset.getName() + " {\n");
										
										Iterator<TFCDA> fcdas = dataset.getFCDA().iterator();
										
										while (fcdas.hasNext()) {
											TFCDA fcda = fcdas.next();
											String name = fcda.getLdInst() + "_" + fcda.getPrefix() + fcda.getLnClass() + "_" + fcda.getLnInst() + "_" + fcda.getDoName();
											
											if (fcda.getDaName() != null && !fcda.getDaName().equals("")) {
												name = name + "_" + fcda.getDaName();
											}
											
											dataTypesHeader.appendDatatypes("\t" + /*fcda.getPrintedType()*/map.getPrintedType(map.getDataAttribute(fcda)) + " " + name + ";\n");
										}
										
										dataTypesHeader.appendDatatypes("};");
										
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
												
												if (initDOTypes.contains(dataObject.getType())) {
													dataTypesSource.appendFunctions("\tinit_" + dataObject.getType() + "(&" + iedName + "." + apName + "." + ldName + ".LN0.LLN0"/* + lnName*/ + "." + dataObject.getName() + ");\n");
												}
												
												if (getDOTypeDAs(dataTypeTemplates, dataObject.getType()) != null) {
													Iterator<TDA> das = getDOTypeDAs(dataTypeTemplates, dataObject.getType()).iterator();
													
													if (das != null) {
														while (das.hasNext()) {
															TDA da = das.next();
															
															if (initDATypes.contains(da.getType())) {
																dataTypesSource.appendFunctions("\tinit_" + da.getType() + "(&" + iedName + "." + apName + "." + ldName + ".LN0.LNN0"/* + lnName*/ + "." + dataObject.getName() + "." + da.getName().toString() + ");\n");
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
													svEncodeSource.appendFunctionObject(new CFunctionControl(svControl, CommsType.SV, map));
													
													String svName = svControl.getName()/* + "_" + svControl.getSmvID()*/;
													String svPath = ied.getName() + "." + ap.getName() + "." + ld.getInst() + ".LN0.";
													
													iedHeader.appendDatatypes("\t\t\t\tstruct svControl " + svName + ";\n");

													svPacketDataInit.append("\t" + svPath + svName + ".noASDU = " + svControl.getNofASDU() + ";\n");
													
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
																	svPacketDataInit.append("\t" + svPath + svName + ".ethHeaderData.destMACAddress[" + i + "] = 0x" + macSplit[i] + ";\n");	// must be big-endian
																}
															}
														}
														else if (p.getType().toString().equals("APPID")) {
															svPacketDataInit.append("\t" + svPath + svName + ".ethHeaderData.APPID = 0x" + p.getValue() + ";\n");
														}
														else if (p.getType().toString().equals("VLAN-ID")) {
															svPacketDataInit.append("\t" + svPath + svName + ".ethHeaderData.VLAN_ID = 0x" + p.getValue() + ";\n");
															useDefaultVlanID = false;
														}
														else if (p.getType().toString().equals("VLAN-PRIORITY")) {
															svPacketDataInit.append("\t" + svPath + svName + ".ethHeaderData.VLAN_PRIORITY = 0x" + p.getValue() + ";\n");
															useDefaultVlanPriority = false;
														}
													}

													// default values specified in 9-2, 5.3.3
													if (useDefaultVlanPriority) {
														svPacketDataInit.append("\t" + svPath + svName + ".ethHeaderData.VLAN_PRIORITY = 4;\n");
													}
													if (useDefaultVlanID) {
														svPacketDataInit.append("\t" + svPath + svName + ".ethHeaderData.VLAN_ID = 0;\n");
													}
													
													svPacketDataInit.append("\t" + svPath + svName + ".ASDU = (struct ASDU *) calloc(" + svControl.getNofASDU() + ", sizeof(struct ASDU));\n");
													
													// assume all ASDUs refer to the same dataset
													svPacketDataInit.append("\tfor (i = 0; i < " + svControl.getNofASDU() + "; i++) {\n");
													svPacketDataInit.append("\t\t" + svPath + svName + ".ASDU[i].svID = (unsigned char *) calloc(1, " + (svControl.getSmvID().length() + 1) + ");\n");
													svPacketDataInit.append("\t\tstrncpy((char *) " + svPath + svName + ".ASDU[i].svID, \"" + svControl.getSmvID() + "\\0\", " + (svControl.getSmvID().length() + 1) + ");\n");
													svPacketDataInit.append("\t\t" + svPath + svName + ".ASDU[i].datset = (unsigned char *) calloc(1, " + (dataset.getName().length() + 1) + ");\n");
													svPacketDataInit.append("\t\tstrncpy((char *) " + svPath + svName + ".ASDU[i].datset, \"" + dataset.getName() + "\\0\", " + (dataset.getName().length() + 1) + ");\n");
													svPacketDataInit.append("\t\t" + svPath + svName + ".ASDU[i].smpCnt = 0;\n");
													svPacketDataInit.append("\t\t" + svPath + svName + ".ASDU[i].confRev = " + svControl.getConfRev() + ";\n");
													
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
													svPacketDataInit.append("\t\t" + svPath + svName + ".ASDU[i].smpSynch = " + smpSynch + ";\n");
													svPacketDataInit.append("\t\t" + svPath + svName + ".ASDU[i].showRefrTm = " + showRefrTm + ";\n");
													svPacketDataInit.append("\t\t" + svPath + svName + ".ASDU[i].showDatset = " + showDatset + ";\n");
													svPacketDataInit.append("\t\t" + svPath + svName + ".ASDU[i].showSmpRate = " + showSmpRate + ";\n");
													svPacketDataInit.append("\t\t" + svPath + svName + ".ASDU[i].smpRate = " + svControl.getSmpRate() + ";\n");
													svPacketDataInit.append("\t\t" + svPath + svName + ".ASDU[i].data.size = 0;\n");
													
													svPacketDataInit.append("\t}\n");

													svPacketDataInit.append("\t" + svPath + svName + ".ASDUCount = 0;\n");
													svPacketDataInit.append("\t" + svPath + svName + ".update = &sv_update_" + ied.getName() + "_" + ld.getInst() + "_" + svName + ";\n");

													if (svControls.hasNext()) {
														svPacketDataInit.append("\n");
													}
													
													// update SV values function (which sends packet if noASDU reached)
													String svUpdateFunctionPrototype = "int sv_update_" + ied.getName() + "_" + ld.getInst() + "_" + svName + "(unsigned char *buf)";
													svHeader.appendFunctionPrototypes(svUpdateFunctionPrototype + ";\n");
													
													svSource.appendFunctions("\n// returns 1 if buf contains valid packet data");
													svSource.appendFunctions("\n" + svUpdateFunctionPrototype + " {\n");
													svSource.appendFunctions("\tint size = encode_control_" + ied.getName() + "_" + ld.getInst() + "_" + svName + "(" + svPath + svName + ".ASDU[" + svPath + svName + ".ASDUCount].data.data);\n");
													svSource.appendFunctions("\t" + svPath + svName + ".ASDU[" + svPath + svName + ".ASDUCount].data.size = size;\n\n");

													svSource.appendFunctions("\t" + svPath + svName + ".ASDU[" + svPath + svName + ".ASDUCount].smpCnt = " + svPath + svName + ".sampleCountMaster;\n");
													svSource.appendFunctions("\t" + svPath + svName + ".sampleCountMaster++;\n\n");

													svSource.appendFunctions("\tif (" + svPath + svName + ".sampleCountMaster == " + svPath + svName + ".ASDU[" + svPath + svName + ".ASDUCount].smpRate) {\n");
													svSource.appendFunctions("\t\t" + svPath + svName + ".sampleCountMaster = 0;\n");
													svSource.appendFunctions("\t}\n\n");
													
													svSource.appendFunctions("\tif (++" + svPath + svName + ".ASDUCount == " + svPath + svName + ".noASDU) {\n");
													svSource.appendFunctions("\t\t" + svPath + svName + ".ASDUCount = 0;\n");
													svSource.appendFunctions("\t\treturn svEncodePacket(&" + svPath + svName + ", buf);\n");
													svSource.appendFunctions("\t}\n");
													svSource.appendFunctions("\n\treturn 0;\n");
													svSource.appendFunctions("}\n");
													
													// repeat for interface functions
													String svUpdateFunctionPrototypeBuf = "int interface_sv_update_" + ied.getName() + "_" + ld.getInst() + "_" + svName + "()";
													interfaceHeader.appendFunctionPrototypes(svUpdateFunctionPrototypeBuf + ";\n");
													
													interfaceSource.appendFunctions("\n" + svUpdateFunctionPrototypeBuf + " {\n");
													interfaceSource.appendFunctions("\tint len = sv_update_" + ied.getName() + "_" + ld.getInst() + "_" + svName + "(bufOut);\n\n");
													interfaceSource.appendFunctions("\tif (len > 0) {\n");
													interfaceSource.appendFunctions("\t\tpcap_sendpacket(fp, bufOut, len);\n");
													interfaceSource.appendFunctions("\t}\n\n");
													interfaceSource.appendFunctions("\treturn len;\n");
													interfaceSource.appendFunctions("}\n");
												}
											}
										}
										
										if (ld.getLN0().getGSEControl() != null) {
											Iterator<TGSEControl> gseControls = ld.getLN0().getGSEControl().iterator();
											
											while (gseControls.hasNext()) {
												TGSEControl gseControl = gseControls.next();
												
												// find GSE datasets
												if (gseControl.getDatSet() != null && gseControl.getDatSet().equals(dataset.getName())) {
													gseEncodeSource.appendFunctionObject(new CFunctionControl(gseControl, CommsType.GSE, map));
													
													String gseName = gseControl.getName()/* + "_" + gseControl.getAppID()*/;
													String gsePath = ied.getName() + "." + ap.getName() + "." + ld.getInst() + ".LN0.";
													
													iedHeader.appendDatatypes("\t\t\t\tstruct gseControl " + gseName + ";\n");
													
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
																	gsePacketDataInit.append("\t" + gsePath + gseName + ".ethHeaderData.destMACAddress[" + i + "] = 0x" + macSplit[i] + ";\n");	// must be big-endian
																}
															}
														}
														else if (p.getType().toString().equals("APPID")) {
															gsePacketDataInit.append("\t" + gsePath + gseName + ".ethHeaderData.APPID = 0x" + p.getValue() + ";\n");
														}
														else if (p.getType().toString().equals("VLAN-ID")) {
															gsePacketDataInit.append("\t" + gsePath + gseName + ".ethHeaderData.VLAN_ID = 0x" + p.getValue() + ";\n");
															useDefaultVlanID = false;
														}
														else if (p.getType().toString().equals("VLAN-PRIORITY")) {
															gsePacketDataInit.append("\t" + gsePath + gseName + ".ethHeaderData.VLAN_PRIORITY = 0x" + p.getValue() + ";\n");
															useDefaultVlanPriority = false;
														}
													}
													
													// default values specified in 8-1, Annex C
													if (useDefaultVlanPriority) {
														gsePacketDataInit.append("\t" + gsePath + gseName + ".ethHeaderData.VLAN_PRIORITY = 4;\n");
													}
													if (useDefaultVlanID) {
														gsePacketDataInit.append("\t" + gsePath + gseName + ".ethHeaderData.VLAN_ID = 0;\n");
													}
	
													gsePacketDataInit.append("\t" + gsePath + gseName + ".goID = (unsigned char *) calloc(1, " + (gseControl.getAppID().length() + 1) + ");\n");
													gsePacketDataInit.append("\tstrncpy((char *) " + gsePath + gseName + ".goID, \"" + gseControl.getAppID() + "\\0\", " + (gseControl.getAppID().length() + 1) + ");\n");
	
													gsePacketDataInit.append("\t" + gsePath + gseName + ".t = 0;\n");
													
													String gocbRef = iedName + ld.getInst() + "/" + ld.getLN0().getLnClass().toString() + "$GO$" + gseControl.getName();
													if (gocbRef.length() > 65) {
														gocbRef = gocbRef.substring(0, 64);
													}
													gsePacketDataInit.append("\t" + gsePath + gseName + ".gocbRef = (unsigned char *) calloc(1, " + (gocbRef.length() + 1) + ");\n");
													gsePacketDataInit.append("\tstrncpy((char *) " + gsePath + gseName + ".gocbRef, \"" + gocbRef + "\\0\", " + (gocbRef.length() + 1) + ");\n");
													
													String datSet = iedName + ld.getInst() + "/" + ld.getLN0().getLnClass().toString() + "$" + gseControl.getDatSet();
													if (datSet.length() > 65) {
														datSet = datSet.substring(0, 64);
													}
													gsePacketDataInit.append("\t" + gsePath + gseName + ".datSet = (unsigned char *) calloc(1, " + (datSet.length() + 1) + ");\n");
													gsePacketDataInit.append("\tstrncpy((char *) " + gsePath + gseName + ".datSet, \"" + datSet + "\\0\", " + (datSet.length() + 1) + ");\n");
	
													gsePacketDataInit.append("\t" + gsePath + gseName + ".timeAllowedToLive = 0;\n");
													gsePacketDataInit.append("\t" + gsePath + gseName + ".stNum = 1;\n");
													gsePacketDataInit.append("\t" + gsePath + gseName + ".sqNum = 0;\n");
													gsePacketDataInit.append("\t" + gsePath + gseName + ".test = 0;\n");
													gsePacketDataInit.append("\t" + gsePath + gseName + ".confRev = " + gseControl.getConfRev() + ";\n");
													gsePacketDataInit.append("\t" + gsePath + gseName + ".ndsCom = 0;\n");
													gsePacketDataInit.append("\t" + gsePath + gseName + ".numDatSetEntries = " + dataset.getFCDA().size() + ";\n");
													gsePacketDataInit.append("\t" + gsePath + gseName + ".encodeDataset = &ber_encode_" + getUniqueDatasetName(dataset) + ";\n");
													gsePacketDataInit.append("\t" + gsePath + gseName + ".getDatasetLength = &ber_get_length_" + getUniqueDatasetName(dataset) + ";\n");
													gsePacketDataInit.append("\t" + gsePath + gseName + ".send = &gse_send_" + ied.getName() + "_" + ld.getInst() + "_" + gseName + ";\n");
													
													// send GSE function
													String gseUpdateFunctionPrototype = "int gse_send_" + ied.getName() + "_" + ld.getInst() + "_" + gseName + "(unsigned char *buf, CTYPE_BOOLEAN statusChange, CTYPE_INT32U timeAllowedToLive)";
													gseHeader.appendFunctionPrototypes(gseUpdateFunctionPrototype + ";\n");
													
													gseSource.appendFunctions("\n// returns 1 if buf contains valid packet data");
													gseSource.appendFunctions("\n" + gseUpdateFunctionPrototype + " {\n");
													
													gseSource.appendFunctions("\t" + gsePath + gseName + ".timeAllowedToLive = timeAllowedToLive;\n\n");
													gseSource.appendFunctions("\tif (statusChange) {\n");
													gseSource.appendFunctions("\t\t" + gsePath + gseName + ".stNum++;\n");
													gseSource.appendFunctions("\t\tif (" + gsePath + gseName + ".stNum == 0) {\n");
													gseSource.appendFunctions("\t\t\t" + gsePath + gseName + ".stNum = 1;\n");
													gseSource.appendFunctions("\t\t}\n");
													gseSource.appendFunctions("\t\t" + gsePath + gseName + ".sqNum = 0;\n");
													gseSource.appendFunctions("\t}\n");
													gseSource.appendFunctions("\telse {\n");
													gseSource.appendFunctions("\t\t" + gsePath + gseName + ".sqNum++;\n");
													gseSource.appendFunctions("\t\tif (" + gsePath + gseName + ".sqNum == 0) {\n");
													gseSource.appendFunctions("\t\t\t" + gsePath + gseName + ".sqNum = 1;\n");
													gseSource.appendFunctions("\t\t}\n\t}\n\n");
													
													gseSource.appendFunctions("\treturn gseEncodePacket(&" + gsePath + gseName + ", buf);\n");
													gseSource.appendFunctions("}\n");
													
													// repeat for interface functions
													String gseUpdateFunctionPrototypeBuf = "int interface_gse_send_" + ied.getName() + "_" + ld.getInst() + "_" + gseName + "(int statusChange, int timeAllowedToLive)";
													interfaceHeader.appendFunctionPrototypes(gseUpdateFunctionPrototypeBuf + ";\n");
													
													interfaceSource.appendFunctions("\n" + gseUpdateFunctionPrototypeBuf + " {\n");
													interfaceSource.appendFunctions("\tint len = gse_send_" + ied.getName() + "_" + ld.getInst() + "_" + gseName + "(bufOut, (CTYPE_BOOLEAN) statusChange, (CTYPE_INT32U) timeAllowedToLive);\n\n");
													interfaceSource.appendFunctions("\tif (len > 0) {\n");
													interfaceSource.appendFunctions("\t\tpcap_sendpacket(fp, bufOut, len);\n");
													interfaceSource.appendFunctions("\t}\n\n");
													interfaceSource.appendFunctions("\treturn len;\n");
													interfaceSource.appendFunctions("}\n");
												}
											}
										}
									}
								}
								iedHeader.appendDatatypes("\t\t\t} LN0;\n");
							}
							
//							Iterator<TLN> lns = ld.getLN().iterator();
//							
//							jsonDatabaseSource.appendFunctions("\t" + iedJSON.getPath() + ".items = (Item*) calloc(" + (ld.getLN().size() + 1) + ", sizeof(Item));\n");
//							iedJSON.addLayer();
							
							while (lns.hasNext()) {
								TLN ln = lns.next();
								StringBuilder lnName = new StringBuilder();
								
								if (ln.getPrefix() != null) {
									lnName.append(ln.getPrefix());
								}
								
								lnName.append(ln.getLnType().replaceAll("[^A-Za-z0-9]", "_") + "_" + ln.getInst());	// multiple LN instances are given the C name: "[<Prefix>]<LN class>_<instance number>"
								
								iedHeader.appendDatatypes("\t\t\tstruct " + ln.getLnType().replaceAll("[^A-Za-z0-9]", "_") + " " + lnName + ";\n");
								
								// initialise LN data
								Iterator<TDO> dos = getLNTypeDOs(dataTypeTemplates, ln.getLnType()).iterator();
								StringBuilder accumulatedName = new StringBuilder(iedName + "." + apName + "." + ldName + "." + lnName + ".");


								jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".objectRef = \"" + lnName + "\";\n");
								jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".type = BASIC_TYPE_CONSTRUCTED;\n");
								jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".typeSCL = \"" + ln.getLnType() + "\";\n");
								jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".lnClass = \"" + ln.getLnClass().toString() + "\";\n");
								jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".data = &" + iedName + "." + apName + "." + ldName + "." + lnName + ";\n");
								
								int numberOfDOs = getLNTypeDOs(dataTypeTemplates, ln.getLnType()).size();
								jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".items = (Item*) calloc(" + numberOfDOs + ", sizeof(Item)); // DOs\n");
								jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".numberOfItems = " + numberOfDOs + ";\n");
								iedJSON.addLayer();
								
								// look up lists of DOs and DAs and initialise if required
								while (dos.hasNext()) {
									TDO dataObject = dos.next();
									
									jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".objectRef = \"" + dataObject.getName() + "\";\n");
									jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".type = BASIC_TYPE_CONSTRUCTED;\n");
									jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".typeSCL = \"" + dataObject.getType() + "\";\n");
									jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".CDC = \"" + getDOTypeCDC(dataTypeTemplates, dataObject.getType()) + "\";\n");
									jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".data = &" + iedName + "." + apName + "." + ldName + "." + lnName + "." + dataObject.getName() + ";\n");
									

									int numberOfDAsAndSDOs = getDOTypeDAs(dataTypeTemplates, dataObject.getType()).size() + getDOTypeSDOs(dataTypeTemplates, dataObject.getType()).size();
									jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".items = (Item*) calloc(" + numberOfDAsAndSDOs + ", sizeof(Item)); // DAs (top level)\n");
									jsonDataModelIndexSource.appendFunctions("\t" + iedJSON.getPath() + ".numberOfItems = " + numberOfDAsAndSDOs + ";\n");
									iedJSON.addLayer();
									
									processDO(dataTypeTemplates, dataTypesSource, initDOTypes, initDATypes, accumulatedName, dataObject.getType(), dataObject.getName(), jsonDataModelIndexSource, iedJSON);
									
									iedJSON.popLayer();
									iedJSON.addItem();
								}
								
								iedJSON.popLayer();
								iedJSON.addItem();
								
								// override specific LN data
								Iterator<TDOI> dois = ln.getDOI().iterator();
								accumulatedName = new StringBuilder(iedName + "." + apName + "." + ldName + "." + lnName + ".");
								
								while (dois.hasNext()) {
									TDOI doi = dois.next();
									processDOIorSDI(map, dataTypeTemplates, dataTypesSource, initDOTypes, initDATypes, new StringBuilder(accumulatedName + doi.getName() + "."), doi.getSDI(), doi.getDAI(), doi.getName());
								}
								
							}
							iedJSON.popLayer();

							iedHeader.appendDatatypes("\t\t} " + ldName + ";\n");
						}

						iedJSON.popLayer();
					}
					
					iedHeader.appendDatatypes("\t} " +  apName + ";\n");
					
					iedJSON.popLayer();
				}
			}

			iedHeader.appendDatatypes("};\n");

			if (ieds.hasNext()) {
				iedHeader.appendDatatypes("\n");
			}

			iedSource.appendInstances("struct " + iedName + "_t " + iedName + ";\n");
			iedHeader.appendExtern("extern struct " + iedName + "_t " + iedName + ";\n");

			iedJSON.addItem();	// IEDs
		}
		
//		iedJSON.popLayer();	// IEDs

		
		
		dataTypesSource.appendFunctions("}\n");
		jsonDataModelIndexSource.appendFunctions("}\n\n");

		for (int i = 0; i < numberOfIEDs; i++) {
			jsonDataModelIndexSource.appendFunctions("ACSIServer *server" + (i + 1) + ";\n");
		}

		jsonDataModelIndexSource.appendFunctions("\nvoid init_webservers(mg_handler_t handler, void *(*serve)(void *)) {\n");
		int iedNumber = 1;
		ieds = root.getSCL().getIED().iterator();
		while (ieds.hasNext()) {
			TIED ied = ieds.next();

			// TODO does not handle multiple APs; see get(0)
			// TODO do not set to root of data model index

			jsonDataModelIndexSource.appendFunctions("\tserver" + iedNumber + " = calloc(1, sizeof(ACSIServer));\n");
			jsonDataModelIndexSource.appendFunctions("\tserver" + iedNumber + "->iedName = \"" + ied.getName()  + "\";\n");
			jsonDataModelIndexSource.appendFunctions("\tserver" + iedNumber + "->apName = \"" + ied.getAccessPoint().get(0).getName()  + "\";\n");
			jsonDataModelIndexSource.appendFunctions("\tserver" + iedNumber + "->mg = mg_create_server((void *) server" + iedNumber + ");\n");
			jsonDataModelIndexSource.appendFunctions("#ifndef USE_SSL\n");
			jsonDataModelIndexSource.appendFunctions("\tmg_set_option(server" + iedNumber + "->mg, \"listening_port\", \"" + (JSON_WEB_SERVER_START_PORT + iedNumber - 1) + "\");\n");
			jsonDataModelIndexSource.appendFunctions("#else\n");
			jsonDataModelIndexSource.appendFunctions("\tmg_set_option(server" + iedNumber + "->mg, \"listening_port\", \"" + (JSON_WEB_SERVER_START_PORT + iedNumber - 1) + "s\");\n");
			jsonDataModelIndexSource.appendFunctions("\tmg_set_option(server" + iedNumber + "->mg, \"ssl_certificate\", \"ssl_cert.pem\");\n");
			jsonDataModelIndexSource.appendFunctions("\tmg_set_option(server" + iedNumber + "->mg, \"auth_domain\", \"localhost\");\n");
			jsonDataModelIndexSource.appendFunctions("#endif\n");
			jsonDataModelIndexSource.appendFunctions("\tmg_add_uri_handler(server" + iedNumber + "->mg, \"/\", handler);\n");
			jsonDataModelIndexSource.appendFunctions("\tmg_start_thread(serve, server" + iedNumber + "->mg);\n");
			
			
			if (ieds.hasNext()) {
				jsonDataModelIndexSource.appendFunctions("\n");
			}
			
			iedNumber++;
		}
		jsonDataModelIndexSource.appendFunctions("}\n");
		jsonDataModelIndexSource.appendInstances("\n#endif // JSON_INTERFACE\n");
		
		
		
		// process Logical Node Types
		Iterator<TLNodeType> lnTypes = dataTypeTemplates.getLNodeType().iterator();
		dataTypesHeader.appendDatatypes("\n\n// logical nodes\n");
		svDecodeDatasetFunction.append("void svDecodeDataset(unsigned char *dataset, int datasetLength, int ASDU, unsigned char *svID, int svIDLength, CTYPE_INT16U smpCnt) {\n");
		gseDecodeDatasetFunction.append("void gseDecodeDataset(unsigned char *dataset, CTYPE_INT16U datasetLength, unsigned char *gocbRef, CTYPE_INT16U gocbRefLength, CTYPE_INT32U timeAllowedToLive, CTYPE_TIMESTAMP T, CTYPE_INT32U stNum, CTYPE_INT32U sqNum) {\n");
		
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
			ieds = root.getSCL().getIED().iterator();
			
			while (ieds.hasNext()) {
				TIED ied = ieds.next();
				
				if (ied.getAccessPoint() != null) {
					Iterator<TAccessPoint> aps = ied.getAccessPoint().iterator();
					
					while (aps.hasNext()) {
						TAccessPoint ap = aps.next();
						
						if (ap.getServer() != null && ap.getServer().getLDevice().size() > 0) {
							Iterator<TLDevice> lds = ap.getServer().getLDevice().iterator();
							List<String> svControlConsumed = new ArrayList<String>();
							List<String> gseControlConsumed = new ArrayList<String>();
							
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
												Iterator<TDataSet> datasets = map.getDatasets(extRef);
												
												while (datasets.hasNext()) {
													TDataSet dataset = datasets.next();
													String datasetName = getUniqueDatasetName(dataset);
													
													Iterator<TControl> controls = map.getControls(dataset);
													
													while (controls.hasNext()) {
														TControl control = controls.next();
		
														if (control.eClass() == SclPackage.eINSTANCE.getTSampledValueControl()) {
															TSampledValueControl svControl = (TSampledValueControl) control;
															long noASDU = svControl.getNofASDU();
															String noASDUString = "";
															String ASDUIndex = "";
															
															if (noASDU > 1) {
																noASDUString = "[" + noASDU + "]"; 
																ASDUIndex = "[ASDU]";
															}
															
															if (!svControlConsumed.contains(svControl.getName())) {
																svControlConsumed.add(svControl.getName());
																//System.out.println("\tadding sv control: " + svControl.getName() + " size: " + svControlConsumed.size());
																
																String inputsPath = ied.getName() + "." + ap.getName() + "." + ld.getInst() + "." + ln.getLnType().replaceAll("[^A-Za-z0-9]", "_") + "_" + ln.getInst() + ".sv_inputs_" + svControl.getName() + ".";

																svDecodeDatasetFunction.append("\n\tif (svIDLength == " + svControl.getSmvID().length() + " && strncmp((const char *) svID, \"" + svControl.getSmvID() + "\", svIDLength) == 0) {");
																svDecodeDatasetFunction.append("\n\t\tdecode_" + datasetName + "(dataset, smpCnt, &" + inputsPath + datasetName + ASDUIndex + ");");
																svDecodeDatasetFunction.append("\n\t\t" + inputsPath + "smpCnt = smpCnt;");
																svDecodeDatasetFunction.append("\n\t\tif (" + inputsPath + "datasetDecodeDone != NULL) {");
																svDecodeDatasetFunction.append("\n\t\t\t" + inputsPath + "datasetDecodeDone(smpCnt);");
																svDecodeDatasetFunction.append("\n\t\t}");
																svDecodeDatasetFunction.append("\n\t}");

																dataTypesHeader.appendDatatypes("\n\tstruct {");
																dataTypesHeader.appendDatatypes("\n\t\tstruct " + datasetName + " " + datasetName + noASDUString + ";");
																dataTypesHeader.appendDatatypes("\n\t\tvoid (*datasetDecodeDone)(CTYPE_INT16U smpCnt);");
																dataTypesHeader.appendDatatypes("\n\t\tCTYPE_INT16U smpCnt;");
																dataTypesHeader.appendDatatypes("\n\t} sv_inputs_" + svControl.getName() + ";");
															}
														}
														else if (control.eClass() == SclPackage.eINSTANCE.getTGSEControl()) {
															TGSEControl gseControl = (TGSEControl) control;
															// GSE dataset decode functions
															if (!gseControlConsumed.contains(gseControl.getName())) {
																gseControlConsumed.add(gseControl.getName());
																//System.out.println("\tadding gse control: " + gseControl.getName() + ", size: " + gseControlConsumed.size());
																
																// TODO this finds the local LLN0 lnClass value, not the external value
																String gocbRef = extRef.getIedName() + extRef.getLdInst() + "/" + ld.getLN0().getLnClass().toString() + "$GO$" + gseControl.getName();
																String inputsPath = ied.getName() + "." + ap.getName() + "." + ld.getInst() + "." + ((ln.getPrefix() == null) ? "" : ln.getPrefix()) + ln.getLnType().replaceAll("[^A-Za-z0-9]", "_") + "_" + ln.getInst() + ".gse_inputs_" + gseControl.getName() + ".";

																gseDecodeDatasetFunction.append("\n\tif (gocbRefLength == " + gocbRef.length() + " && strncmp((const char *) gocbRef, \"" + gocbRef + "\", gocbRefLength) == 0) {");
																gseDecodeDatasetFunction.append("\n\t\tif (stNum != " + inputsPath + "stNum) {");
																gseDecodeDatasetFunction.append("\n\t\t\tber_decode_" + datasetName + "(dataset, &" + inputsPath + datasetName + ");");
																gseDecodeDatasetFunction.append("\n\t\t}");
																gseDecodeDatasetFunction.append("\n\t\t" + inputsPath + "timeAllowedToLive = timeAllowedToLive;");
																gseDecodeDatasetFunction.append("\n\t\t" + inputsPath + "T = T;");
																gseDecodeDatasetFunction.append("\n\t\t" + inputsPath + "stNum = stNum;");
																gseDecodeDatasetFunction.append("\n\t\t" + inputsPath + "sqNum = sqNum;");
																gseDecodeDatasetFunction.append("\n\t\tif (" + inputsPath + "datasetDecodeDone != NULL) {");
																gseDecodeDatasetFunction.append("\n\t\t\t" + inputsPath + "datasetDecodeDone(timeAllowedToLive, T, stNum, sqNum);");
																gseDecodeDatasetFunction.append("\n\t\t}");
																gseDecodeDatasetFunction.append("\n\t}");

																dataTypesHeader.appendDatatypes("\n\tstruct {");
																dataTypesHeader.appendDatatypes("\n\t\tstruct " + datasetName + " " + datasetName + ";");
																dataTypesHeader.appendDatatypes("\n\t\tvoid (*datasetDecodeDone)(CTYPE_INT32U timeAllowedToLive, CTYPE_TIMESTAMP T, CTYPE_INT32U stNum, CTYPE_INT32U sqNum);");
																dataTypesHeader.appendDatatypes("\n\t\tCTYPE_INT32U timeAllowedToLive;");
																dataTypesHeader.appendDatatypes("\n\t\tCTYPE_TIMESTAMP T;");
																dataTypesHeader.appendDatatypes("\n\t\tCTYPE_INT32U stNum;");
																dataTypesHeader.appendDatatypes("\n\t\tCTYPE_INT32U sqNum;");
																dataTypesHeader.appendDatatypes("\n\t} gse_inputs_" + gseControl.getName() + ";");
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
				}
			}
			
			dataTypesHeader.appendDatatypes("\n};");
			if (lnTypes.hasNext()) {
				dataTypesHeader.appendDatatypes("\n");
			}
		}
		
		
//		try {
//			RandomAccessFile f = new RandomAccessFile(Main.PATH_TO_SOURCE + Main.SCD_FILENAME, "r");
//			byte[] bytes = new byte[(int)f.length()];
//			f.read(bytes);
//			
//			StringBuilder sb = new StringBuilder();
////			for (int i = 0; i < bytes.length; i++) {
//			for (byte b : bytes) {
////				switch ((char) b[i]) {
////					case '"':
////					case '\'':
////					case '\\':
////							sb.append('\\');
////							sb.append((char) b[i]);
////							break;
////					case '\t':
////						sb.append('\t');
////						break;
////					case '\n':
////						sb.append('\n');
////						break;
////					case '\r':
////						sb.append('\r');
////						break;
////					case '\f':
////						sb.append('\f');
////						break;
////					case '\b':
////						sb.append('\b');
////						break;
////					default:
////						sb.append((char) b[i]);
////						break;
////				}
//				sb.append(String.format("0x" + "%02X", b) + ",");
////				System.out.println("\'" + (char) b[i] + "\'");
//            }
//			
//			jsonDataModelIndexSource.appendFunctions("\nconst unsigned char scd_file[] = {" + sb + "0x00};\n");
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		dataTypesHeader.appendFunctionPrototypes("void init_datatypes();\n");
		svDecodeDatasetFunction.append("\n}\n\n");
		svDecodeSource.appendFunctions(svDecodeDatasetFunction);
		gseDecodeDatasetFunction.append("\n}\n\n");
		gseDecodeSource.appendFunctions(gseDecodeDatasetFunction);

		
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
		gseDecodeHeader.appendFunctionPrototypes("\nvoid gseDecodeDataset(unsigned char *dataset, CTYPE_INT16U datasetLength, unsigned char *gocbRef, CTYPE_INT16U gocbRefLength, CTYPE_INT32U timeAllowedToLive, CTYPE_TIMESTAMP T, CTYPE_INT32U stNum, CTYPE_INT32U sqNum);");
		svEncodeHeader.appendFunctionPrototypes("\nint svEncodePacket(struct svControl *svControl, unsigned char *buf);");
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
		interfaceSource.saveFile();
		jsonDataModelIndexSource.saveFile("json" + File.separator);

		svEncodeHeader.saveFile();
		svDecodeHeader.saveFile();
		gseEncodeHeader.saveFile();
		gseDecodeHeader.saveFile();
		svHeader.saveFile();
		gseHeader.saveFile();
		iedHeader.saveFile();
		dataTypesHeader.saveFile();
		interfaceHeader.saveFile();
	}

	private void processDOIorSDI(SCDAdditionalMappings map, TDataTypeTemplates dataTypeTemplates, CSource dataTypesSource, List<String> initDOTypes, List<String> initDATypes, StringBuilder accumulatedName, List<TSDI> sdiList, List<TDAI> daiList, String name) {
		Iterator<TDAI> dais = null;
		Iterator<TSDI> sdis = null;
		
		if (daiList != null) {
			dais = daiList.iterator();
		}

		if (sdiList != null) {
			sdis = sdiList.iterator();
		}
		
		while (dais != null && dais.hasNext()) {
			TDAI dai = dais.next();
			Iterator<TVal> vals = dai.getVal().iterator();
			
			// only supports single values
			if (dai.getVal().size() == 1) {
				while (vals.hasNext()) {
					TVal val = vals.next();
				
					//dataTypesSource.appendFunctions("\t" + accumulatedName.toString() + dai.getName().toString() + " = " + val.getValue() + ";\n");
					dataTypesSource.appendFunctions(initDAI(map, accumulatedName.toString(), dai, val));
				}
			}
		}
		
		while (sdis != null && sdis.hasNext()) {
			TSDI sdiNext = sdis.next();
			
			processDOIorSDI(map, dataTypeTemplates, dataTypesSource, initDOTypes, initDATypes, new StringBuilder(accumulatedName + sdiNext.getName().toString() + "."), sdiNext.getSDI(), sdiNext.getDAI(), sdiNext.getName().toString());//(sdiNext, new StringBuilder(accumulatedName + sdiNext.getName().toString() + "."), dataTypesSource);
		}
	}
	
	private void processDA(TDataTypeTemplates dataTypeTemplates, CSource dataTypesSource, StringBuilder accumulatedName, String type, String name, CSource jsonDatabaseSource, JSONDatabaseManager iedJSON) {
//		System.out.println("Struct DA: " + accumulatedName + ", " + type + ", " + name);
		
		List<TBDA> daTypeDAs = getDATypeDAs(dataTypeTemplates, type);
		if (daTypeDAs != null) {
			int numberOfDAs = daTypeDAs.size();
			jsonDatabaseSource.appendFunctions("\t" + iedJSON.getPath() + ".items = (Item*) calloc(" + numberOfDAs + ", sizeof(Item)); // DAs\n");
			jsonDatabaseSource.appendFunctions("\t" + iedJSON.getPath() + ".numberOfItems = " + numberOfDAs + ";\n");
			iedJSON.addLayer();
			
			Iterator<TBDA> bdas = getDATypeDAs(dataTypeTemplates, type).iterator();
			while (bdas.hasNext()) {
				TBDA bda = bdas.next();
	//			System.out.println("    BDA: " + bda.getType() + ", " + bda.getBType());
				
				if (bda.getType() != null) {
	//				System.out.println("    recursing; name: " + name + ", bda.getName(): " + bda.getName().toString() + ", type: " + type + ", bda.getType(): " + bda.getType() + ", bda.getBType().toString(): " + bda.getBType().toString());
					jsonDatabaseSource.appendFunctions("\t" + iedJSON.getPath() + ".objectRef = \"" + bda.getName().toString() + "\"; // BDA\n");
					jsonDatabaseSource.appendFunctions("\t" + iedJSON.getPath() + ".type = BASIC_TYPE_CONSTRUCTED;\n");
					jsonDatabaseSource.appendFunctions("\t" + iedJSON.getPath() + ".typeSCL = \"" + bda.getType() + "\";\n");
					jsonDatabaseSource.appendFunctions("\t" + iedJSON.getPath() + ".data = &" + accumulatedName + name + "." + bda.getName().toString() + ";\n");
					
					processDA(dataTypeTemplates, dataTypesSource, new StringBuilder(accumulatedName.toString() + name + "."), bda.getType(), bda.getName().toString(), jsonDatabaseSource, iedJSON);
					
					if (bdas.hasNext()) {
						iedJSON.addItem();
					}
				}
				else {
					String ref = "";
					if (!isStringBasicType(bda.getBType().toString())) {
						ref = "&";
					}
					
					// add bda to database
					jsonDatabaseSource.appendFunctions("\t" + iedJSON.getPath() + ".objectRef = \"" + bda.getName() + "\";\n");
					jsonDatabaseSource.appendFunctions("\t" + iedJSON.getPath() + ".type = " + mapSCLTypeToBasicType(bda.getBType().toString()) + ";\n");
					jsonDatabaseSource.appendFunctions("\t" + iedJSON.getPath() + ".typeSCL = \"" + bda.getBType().toString() + "\";\n");
					jsonDatabaseSource.appendFunctions("\t" + iedJSON.getPath() + ".data = " + ref + accumulatedName.toString() + name + "." + bda.getName() + ";\n");
					
					if (bdas.hasNext()) {
						iedJSON.addItem();
					}
				}
			}
			
			iedJSON.popLayer();
	//		iedJSON.addItem();
		}
	}

	/**
	 * Initialises a DO instance. The DOType for this DO may contain DAs, and SDOs (which may contain further DAs and SDOs).
	 * @param dataTypeTemplates
	 * @param dataTypesSource
	 * @param initDOTypes
	 * @param initDATypes
	 * @param accumulatedName
	 * @param type
	 * @param name
	 */
	private void processDO(TDataTypeTemplates dataTypeTemplates, CSource dataTypesSource, List<String> initDOTypes, List<String> initDATypes, StringBuilder accumulatedName, String type, String name, CSource jsonDatabaseSource, JSONDatabaseManager iedJSON) {
		if (initDOTypes.contains(type)) {
			dataTypesSource.appendFunctions("\tinit_" + type + "(&" + accumulatedName.toString() + name + ");\n");
		}

		List<TDA> dasList = getDOTypeDAs(dataTypeTemplates, type);
		
		if (dasList != null) {
			Iterator<TDA> das = dasList.iterator();
			
			while (das.hasNext()) {
				TDA da = das.next();
				
				if (initDATypes.contains(da.getType())) {
					dataTypesSource.appendFunctions("\tinit_" + da.getType() + "(&" + accumulatedName.toString() + name + "." + da.getName().toString() + ");\n");
				}
				
				Object bType = da.getBType();
				String basicType = "BASIC_TYPE_CONSTRUCTED";
				if (bType != null && bType.toString().compareTo("Struct") != 0) {
//					System.out.println("bType: " + bType.toString());
					basicType = mapSCLTypeToBasicType(bType.toString());
					
					String ref = "";
					if (!isStringBasicType(bType.toString())) {
						ref = "&";
					}
					
					jsonDatabaseSource.appendFunctions("\t" + iedJSON.getPath() + ".objectRef = \"" + da.getName().toString() + "\";\n");
					jsonDatabaseSource.appendFunctions("\t" + iedJSON.getPath() + ".type = " + basicType + ";\n");
					jsonDatabaseSource.appendFunctions("\t" + iedJSON.getPath() + ".typeSCL = \"" + da.getBType() + "\";\n");
					jsonDatabaseSource.appendFunctions("\t" + iedJSON.getPath() + ".FC = \"" + da.getFc().getLiteral() + "\";\n");
					String dchg = "NOT_SPECIFIED";
					if (da.isSetDchg()) {
						if (da.isDchg()) {
							dchg = "TRUE";
						}
						else {
							dchg = "FALSE";
						}
					}
					jsonDatabaseSource.appendFunctions("\t" + iedJSON.getPath() + ".dchg = TRIGGER_OPTION_" + dchg + ";\n");
					String qchg = "NOT_SPECIFIED";
					if (da.isSetQchg()) {
						if (da.isQchg()) {
							qchg = "TRUE";
						}
						else {
							qchg = "FALSE";
						}
					}
					jsonDatabaseSource.appendFunctions("\t" + iedJSON.getPath() + ".qchg = TRIGGER_OPTION_" + qchg + ";\n");
					jsonDatabaseSource.appendFunctions("\t" + iedJSON.getPath() + ".data = " + ref + accumulatedName.toString() + name + "." + da.getName().toString() + ";\n");
				}
				else {
					jsonDatabaseSource.appendFunctions("\t" + iedJSON.getPath() + ".objectRef = \"" + da.getName().toString() + "\";\n");
					jsonDatabaseSource.appendFunctions("\t" + iedJSON.getPath() + ".type = " + basicType + ";\n");
					jsonDatabaseSource.appendFunctions("\t" + iedJSON.getPath() + ".typeSCL = \"" + da.getType() + "\";\n");
					jsonDatabaseSource.appendFunctions("\t" + iedJSON.getPath() + ".FC = \"" + da.getFc().getLiteral() + "\";\n");
					String dchg = "NOT_SPECIFIED";
					if (da.isSetDchg()) {
						if (da.isDchg()) {
							dchg = "TRUE";
						}
						else {
							dchg = "FALSE";
						}
					}
					jsonDatabaseSource.appendFunctions("\t" + iedJSON.getPath() + ".dchg = TRIGGER_OPTION_" + dchg + ";\n");
					String qchg = "NOT_SPECIFIED";
					if (da.isSetQchg()) {
						if (da.isQchg()) {
							qchg = "TRUE";
						}
						else {
							qchg = "FALSE";
						}
					}
					jsonDatabaseSource.appendFunctions("\t" + iedJSON.getPath() + ".qchg = TRIGGER_OPTION_" + qchg + ";\n");
					jsonDatabaseSource.appendFunctions("\t" + iedJSON.getPath() + ".data = &" + accumulatedName.toString() + name + "." + da.getName().toString() + ";\n");
					
					processDA(dataTypeTemplates, dataTypesSource, new StringBuilder(accumulatedName.toString() + name + "."), da.getType(), da.getName().toString(), jsonDatabaseSource, iedJSON);
				}
				
				// TODO need this condition every time?
				if (das.hasNext()) {
					iedJSON.addItem();
				}
			}
			
			// recursively initialise all SDOs
			Iterator<TSDO> sdos = getDOTypeSDOs(dataTypeTemplates, type).iterator();		
			while (sdos.hasNext()) {
				TSDO sdo = sdos.next();
				StringBuilder sdoName = new StringBuilder(accumulatedName + name + ".");
//				System.out.println("SDO:    name: " + name + ", sdo.getName(): " + sdo.getName());

				jsonDatabaseSource.appendFunctions("\t" + iedJSON.getPath() + ".objectRef = \"" + sdo.getName() + "\"; // SDO\n");
				jsonDatabaseSource.appendFunctions("\t" + iedJSON.getPath() + ".type = BASIC_TYPE_CONSTRUCTED;\n");
				jsonDatabaseSource.appendFunctions("\t" + iedJSON.getPath() + ".typeSCL = \"" + sdo.getType() + "\";\n");
				jsonDatabaseSource.appendFunctions("\t" + iedJSON.getPath() + ".data = &" + sdoName + sdo.getName() + ";\n");
				
				int numberOfDAs = getDOTypeDAs(dataTypeTemplates, sdo.getType()).size();
				jsonDatabaseSource.appendFunctions("\t" + iedJSON.getPath() + ".items = (Item*) calloc(" + numberOfDAs + ", sizeof(Item)); // DAs within SDO\n");
				jsonDatabaseSource.appendFunctions("\t" + iedJSON.getPath() + ".numberOfItems = " + numberOfDAs + ";\n");
				iedJSON.addLayer();
				
				processDO(dataTypeTemplates, dataTypesSource, initDOTypes, initDATypes, sdoName, sdo.getType(), sdo.getName(), jsonDatabaseSource, iedJSON);

				iedJSON.popLayer();
				
				if (sdos.hasNext()) {
					iedJSON.addItem();
				}
			}
		}
	}
	
	
	
	/* 
	 <xs:enumeration value="Tcmd"/> 
	 <xs:enumeration value="Struct"/> 
	 <xs:enumeration value="EntryTime"/> 
	 <xs:enumeration value="Check"/> 
	 <xs:enumeration value="ObjRef"/> 
	 <xs:enumeration value="PhyComAddr"/> 
	 <xs:enumeration value="TrgOps"/> 
	 <xs:enumeration value="OptFlds"/> 
	 <xs:enumeration value="SvOptFlds"/>
	 
	 to

	COMPOUND,
	BOOLEAN,
	INT8,
	INT16,
	INT32,
	INT64,
	INT8U,
	INT16U,
	INT24U,
	INT32U,
	FLOAT32,
	FLOAT64,
	ENUMERATED,
	CODED_ENUM,
	OCTET_STRING,
	VISIBLE_STRING,
	UNICODE_STRING,
	CURRENCY
	*/
	/*
	 * In IEC 61850-6, see Section 9.5.4.2 for basic types (source) and Table 45 (target).
	 */
	private static String mapSCLTypeToBasicType(String bType) {
		// TODO verify and add more types
		
		if (bType.compareTo("Struct") == 0) {
			System.out.println("WARNING: struct as basic type");
			return "BASIC_TYPE_INT16U";
		}
		
		if (bType.compareTo("Quality") == 0) {
			return "BASIC_TYPE_INT16U";
		}
		else if (bType.compareTo("Enum") == 0) {
			return "BASIC_TYPE_ENUMERATED";
		}
		else if (bType.compareTo("Currency") == 0) {
			return "BASIC_TYPE_CURRENCY";
		}
		else if (bType.compareTo("Timestamp") == 0) {
			return "BASIC_TYPE_INT24U";
		}
		else if (bType.compareTo("Dbpos") == 0) {
			return "BASIC_TYPE_CODED_ENUM";
		}
		else if (bType.contains("VisString")) {
			return "BASIC_TYPE_VISIBLE_STRING";
		}
		else if (bType.contains("Unicode")) {
			return "BASIC_TYPE_UNICODE_STRING";
		}
		else if (bType.contains("Octet")) {
			return "BASIC_TYPE_OCTET_STRING";
		}
		
		return "BASIC_TYPE_" + bType;
	}
	

	private static boolean isStringBasicType(String bType) {
		if (bType.contains("VisString")) {
			return true;
		}
		else if (bType.contains("Unicode")) {
			return true;
		}
		else if (bType.contains("Octet")) {
			return true;
		}
		
		return false;
	}

	public static String initDAI(SCDAdditionalMappings map, String accumulatedName, TDAI dai, TVal val) {
		TAbstractDataAttribute datatype = map.getDAFromDAI(dai);
		
		return initAbstractDataAttribute(accumulatedName, datatype, val, false);
	}
	
	public static String initAbstractDataAttribute(String id, TAbstractDataAttribute da, TVal val, boolean pointer) {
		String initCode = "";
		String assignment = "";
		int valSize = val.getValue().length() + 1;
		
		if (pointer == true) {
			assignment = "->";
		}
		
		if (da != null) {
			// valid types defined in Table 45 in IEC 61850-6
			if (da.getBType().toString().contains("VisString")) {	// assume string length is within allowed size
				// free memory that may have been allocated by data type initialisation
				initCode = initCode.concat("\tif (" + id + assignment + da.getName().toString() + " != NULL) {\n");
				initCode = initCode.concat("\t\tfree(" + id + assignment + da.getName().toString() + ");\n");
				initCode = initCode.concat("\t}\n");
				
				initCode = initCode.concat("\t" + id + assignment + da.getName().toString() + " = (CTYPE_VISSTRING255) calloc(1, " + valSize + ");\n");
				initCode = initCode.concat("\tstrncpy(" + id + assignment + da.getName().toString() + ", \"" + val.getValue() + "\\0\", " + valSize + ");\n");
			}
			else if (da.getBType().toString().contains("FLOAT")) {
				initCode = initCode.concat("\t" + id + assignment + da.getName().toString() + " = " + val.getValue() + ";\n");
			}
			else if (da.getBType().toString().contains("INT")) {
				initCode = initCode.concat("\t" + id + assignment + da.getName().toString() + " = " + val.getValue() + ";\n");
			}
			else if (da.getBType().toString().equals("BOOLEAN")) {
				int value = 0;
				if (val.getValue().toLowerCase().equals("true") || val.getValue().equals("1")) {
					value = 1;
				}
				
				initCode = initCode.concat("\t" + id + assignment + da.getName().toString() + " = " + value + ";\n");
			}
		}
		
		return initCode;
	}
	
	/**
	 * Gets a list of all DOs from the specified LN type.
	 * @param dataTypeTemplates
	 * @param doTypeName
	 * @return
	 */
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

	/**
	 * Gets a list of all DAs from the specified DO type.
	 * @param dataTypeTemplates
	 * @param doTypeName
	 * @return
	 */
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

	/**
	 * Gets CDC of the specified DO type.
	 * @param dataTypeTemplates
	 * @param doTypeName
	 * @return
	 */
	public static String getDOTypeCDC(TDataTypeTemplates dataTypeTemplates, String doTypeName) {
		Iterator<TDOType> doTypes = dataTypeTemplates.getDOType().iterator();
		
		while (doTypes.hasNext()) {
			TDOType doType = doTypes.next();
			
			if (doType.getId().equals(doTypeName)) {
				return doType.getCdc().toString();
			}
		}
		
		return "";
	}

	/**
	 * Gets a list of all sub-DAs from the specified DA type.
	 * @param dataTypeTemplates
	 * @param daTypeName
	 * @return
	 */
	public static List<TBDA> getDATypeDAs(TDataTypeTemplates dataTypeTemplates, String daTypeName) {
		Iterator<TDAType> daTypes = dataTypeTemplates.getDAType().iterator();
		
		while (daTypes.hasNext()) {
			TDAType daType = daTypes.next();
			
			if (daType.getId().equals(daTypeName)) {
				return daType.getBDA();
			}
		}
		
		return null;
	}

	/**
	 * Gets a list of all SDOs from the specified DO type.
	 * @param dataTypeTemplates
	 * @param doTypeName
	 * @return
	 */
	public static List<TSDO> getDOTypeSDOs(TDataTypeTemplates dataTypeTemplates, String doTypeName) {
		Iterator<TDOType> doTypes = dataTypeTemplates.getDOType().iterator();
		
		while (doTypes.hasNext()) {
			TDOType doType = doTypes.next();
			
			if (doType.getId().equals(doTypeName)) {
				return doType.getSDO();
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

	public static TSMV getCommunicationSMV(TCommunication comms, String iedName, String apName, String ldName, String cbName) {
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

	/**
	 * Gets a unique (per-SCD) identifier for the specified Dataset.
	 * @param dataset
	 * @return
	 */
	public static String getUniqueDatasetName(TDataSet dataset) {
		String iedName = ((TIED) dataset.eContainer().eContainer().eContainer().eContainer().eContainer()).getName();
		String ldInst = ((TLDevice) dataset.eContainer().eContainer()).getInst();
		
		return iedName + "_" + ldInst + "_" + dataset.getName();
	}
}
