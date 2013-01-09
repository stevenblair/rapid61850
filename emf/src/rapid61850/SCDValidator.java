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

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.query.conditions.ObjectInstanceCondition;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.eclipse.emf.query.conditions.eobjects.EObjectTypeRelationCondition;
import org.eclipse.emf.query.conditions.eobjects.structuralfeatures.EObjectAttributeValueCondition;
import org.eclipse.emf.query.conditions.numbers.NumberCondition;
import org.eclipse.emf.query.conditions.strings.StringValue;
import org.eclipse.emf.query.handlers.PruneHandler;
import org.eclipse.emf.query.statements.FROM;
import org.eclipse.emf.query.statements.IQueryResult;
import org.eclipse.emf.query.statements.SELECT;
import org.eclipse.emf.query.statements.WHERE;

import ch.iec._61850._2006.scl.DocumentRoot;
import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TAbstractDataAttribute;
import ch.iec._61850._2006.scl.TAccessPoint;
import ch.iec._61850._2006.scl.TBDA;
import ch.iec._61850._2006.scl.TControl;
import ch.iec._61850._2006.scl.TDA;
import ch.iec._61850._2006.scl.TDAI;
import ch.iec._61850._2006.scl.TDAType;
import ch.iec._61850._2006.scl.TDO;
import ch.iec._61850._2006.scl.TDOI;
import ch.iec._61850._2006.scl.TDOType;
import ch.iec._61850._2006.scl.TDataSet;
import ch.iec._61850._2006.scl.TEnumType;
import ch.iec._61850._2006.scl.TExtRef;
import ch.iec._61850._2006.scl.TFCDA;
import ch.iec._61850._2006.scl.TIDNaming;
import ch.iec._61850._2006.scl.TIED;
import ch.iec._61850._2006.scl.TLDevice;
import ch.iec._61850._2006.scl.TLN;
import ch.iec._61850._2006.scl.TLNodeType;
import ch.iec._61850._2006.scl.TPredefinedBasicTypeEnum;
import ch.iec._61850._2006.scl.TSDI;
import ch.iec._61850._2006.scl.TSDO;
import ch.iec._61850._2006.scl.TVal;

public class SCDValidator {

	public void validate(DocumentRoot root) {
		validate(root, null);
	}

	public void validate(DocumentRoot root, SCDAdditionalMappings map) {
		checkForDuplicateNames(root);
		checkForCircularSDOReferences(root);
		checkDataTypeOrder(root);
		checkControlHasControlBlock(root);
		
		setPrintedType(root, map);
		mapDataSetToControl(root, map);
		mapExtRefToDataSet(root, map);
		mapFCDAToDataType(root, map);
		mapDAIToDA(root, map);
		checkDAIAndDATypes(root, map);
	}
	
	private void checkDAIAndDATypes(DocumentRoot root, SCDAdditionalMappings map) {
		final EObjectCondition isVal = new EObjectTypeRelationCondition(
			SclPackage.eINSTANCE.getTVal()
		);

		IQueryResult ValResult = new SELECT(
			new FROM(root),
			new WHERE(isVal)
		).execute();
		
		for (Object o : ValResult) {
			TVal val = (TVal) o;
			
			if (val.eContainer().eClass() == SclPackage.eINSTANCE.getTBDA() || val.eContainer().eClass() == SclPackage.eINSTANCE.getTDA()) {
				// check Val elements within data types
				TAbstractDataAttribute type = (TAbstractDataAttribute) val.eContainer();

				verifyValData(type.getBType().toString(), val.getValue());
			}
			else if (val.eContainer().eClass() == SclPackage.eINSTANCE.getTDAI()) {
				// check Val elements of DAIs
				TDAI dai = (TDAI) val.eContainer();
				TAbstractDataAttribute type = map.getDAFromDAI(dai);
				
				//System.out.println("dai: " + dai.getName() + ", " + type);
				if (type != null) {
					verifyValData(type.getBType().toString(), val.getValue());
				}
			}
		}
	}

	private void verifyValData(String bType, String value) {
		if (bType.contains("INT")) {
			try {
				int intValue = Integer.parseInt(value);
				
				// check integer size is valid
				if (bType.equals("INT16")) {
					if (intValue < -32768 || intValue > 32767) {
						error("invalid size of 16-bit Val integer with value: " + value);
					}
				}
				else if (bType.equals("INT8")) {
					if (intValue < -128 || intValue > 127) {
						error("invalid size of 8-bit Val integer with value: " + value);
					}
				}
				else if (bType.equals("INT16U")) {
					if (intValue < 0 || intValue > 65535) {
						error("invalid size of unsigned 16-bit Val integer with value: " + value);
					}
				}
				else if (bType.equals("INT8U")) {
					if (intValue < 0 || intValue > 255) {
						error("invalid size of unsigned 8-bit Val integer with value: " + value);
					}
				}
			}
			catch (NumberFormatException e) {
				error("cannot parse Val integer element with value: " + value);
			}
		}
		else if (bType.contains("FLOAT")) {
			try {
				Float.parseFloat(value);
			}
			catch (NumberFormatException e) {
				error("cannot parse Val float element with value: " + value);
			}
		}
		else if (bType.contains("BOOLEAN")) {
			if (value.toLowerCase().equals("true") || value.toLowerCase().equals("false") || value.equals("1") || value.equals("0")) {
				
			}
			else {
				error("cannot parse Val Boolean element with value: " + value);
			}
		}
	}

	private void mapDAIToDA(DocumentRoot root, SCDAdditionalMappings map) {
		Iterator<TIED> ieds = root.getSCL().getIED().iterator();
		
		while (ieds.hasNext()) {
			TIED ied = ieds.next();
			
			if (ied.getAccessPoint() != null) {
				Iterator<TAccessPoint> aps = ied.getAccessPoint().iterator();
				
				while (aps.hasNext()) {
					TAccessPoint ap = aps.next();
					
					if (ap.getServer() != null && ap.getServer().getLDevice().size() > 0) {
						Iterator<TLDevice> lds = ap.getServer().getLDevice().iterator();
						
						while (lds.hasNext()) {
							TLDevice ld = lds.next();
							Iterator<TLN> lns = ld.getLN().iterator();
							
							while (lns.hasNext()) {
								TLN ln = lns.next();
								String lnType = ln.getLnType();
								
								final EObjectCondition isLNodeType = new EObjectTypeRelationCondition(
									SclPackage.eINSTANCE.getTLNodeType()
								);
								
								final EObjectCondition isThisLNodeType = new EObjectAttributeValueCondition(
									SclPackage.eINSTANCE.getTIDNaming_Id(),
									new StringValue(lnType)
								);
								
								IQueryResult LNResult = new SELECT(
									new FROM(root),
									new WHERE(isLNodeType.AND(isThisLNodeType))
								).execute();
								
								if (LNResult.size() == 1) {
									TIDNaming type = (TIDNaming) LNResult.iterator().next();
									TLNodeType typeAsLNodeType = (TLNodeType) type;
									Iterator<TDOI> dois = ln.getDOI().iterator();
									
									while (dois.hasNext()) {
										TDOI doi = dois.next();
										String name = doi.getName();
										
										Iterator<TDO> dos = typeAsLNodeType.getDO().iterator();
										
										while (dos.hasNext()) {
											TDO dataObject = dos.next();
											
											if (dataObject.getName().equals(doi.getName())) {
												final EObjectCondition isDOType = new EObjectTypeRelationCondition(
													SclPackage.eINSTANCE.getTDOType()
												);
												
												final EObjectCondition isThisDOType = new EObjectAttributeValueCondition(
													SclPackage.eINSTANCE.getTIDNaming_Id(),
													new StringValue(dataObject.getType())
												);
												
												IQueryResult DOResult = new SELECT(
													new FROM(root),
													new WHERE(isDOType.AND(isThisDOType))
												).execute();
												
												if (DOResult.size() == 1) {
													TIDNaming doType = (TIDNaming) DOResult.iterator().next();
													
													mapSDIandDAI(root, map, name, doType, doi.getSDI(), doi.getDAI());
													break;
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

	private void mapSDIandDAI(DocumentRoot root, SCDAdditionalMappings map, String name, TIDNaming type, EList<TSDI> sdiList, EList<TDAI> daiList) {
		if (daiList != null) {
			Iterator<TDAI> dais = daiList.iterator();
			while (dais.hasNext()) {
				// if DAI
					// find its name in "type"
						// map to this DA or BDA (should NOT be a Struct; could be enum or primitive type)
				TDAI dai = dais.next();
				
				if (type.eClass() == SclPackage.eINSTANCE.getTDOType()) {
					TDOType doType = (TDOType) type;
					Iterator<TDA> das = doType.getDA().iterator();
					
					while (das.hasNext()) {
						TDA da = das.next();
						if (da.getName().toString().equals(dai.getName())) {
							if (map != null) {
								map.setDAI(dai, da);
							}
							//System.out.println("mapping " + dai.getName().toString() + " to DA " + da.getName() + " (with type '" + da.getBType() + "')");
						}
					}
				}
				else if (type.eClass() == SclPackage.eINSTANCE.getTDAType()) {
					TDAType daType = (TDAType) type;
					Iterator<TBDA> bdas = daType.getBDA().iterator();
					
					while (bdas.hasNext()) {
						TBDA bda = bdas.next();
						if (bda.getName().toString().equals(dai.getName())) {
							if (map != null) {
								map.setDAI(dai, bda);
							}
							//System.out.println("mapping " + dai.getName().toString() + " to BDA " + bda.getName() + " (with type '" + bda.getBType() + "')");
						}
					}
				}
				else {
					error("unknown data type node for DAI: " + dai.getName().toString());
				}
			}
		}
		
		if (sdiList != null) {
			Iterator<TSDI> sdis = sdiList.iterator();
			while (sdis.hasNext()) {
				// if SDI
					// find its name in "type" - need to check SDOs, DAs, and BDAs
						// find type of this item and recurse
				TSDI sdi = sdis.next();
				String sdiName = sdi.getName().toString();
				
				if (type.eClass() == SclPackage.eINSTANCE.getTDOType()) {
					TDOType doType = (TDOType) type;
					
					// first look through SDOs
					Iterator<TSDO> sdos = doType.getSDO().iterator();
					
					while (sdos.hasNext()) {
						TSDO sdo = sdos.next();
						
						if (sdo.getName().equals(sdiName)) {
							final EObjectCondition isDOType = new EObjectTypeRelationCondition(
								SclPackage.eINSTANCE.getTDOType()
							);
							
							final EObjectCondition isThisDOType = new EObjectAttributeValueCondition(
								SclPackage.eINSTANCE.getTIDNaming_Id(),
								new StringValue(sdo.getType())
							);
							
							IQueryResult DOResult = new SELECT(
								new FROM(root),
								new WHERE(isDOType.AND(isThisDOType))
							).execute();
							
							if (DOResult.size() == 1) {
								TIDNaming targetDOType = (TIDNaming) DOResult.iterator().next();
								mapSDIandDAI(root, map, name, targetDOType, sdi.getSDI(), sdi.getDAI());
								//System.out.println("recursive call SDI: " + sdi.getName().toString() + " for SDO " + sdo.getName() + " (with type '" + sdo.getType() + "')");
							}
							else {
								error(DOResult.size() + " DOs match SDO type: " + sdo.getType());
							}
						}
					}
					
					// now search through DAs
					Iterator<TDA> das = doType.getDA().iterator();
					
					while (das.hasNext()) {
						TDA da = das.next();
						
						if (da.getName().equals(sdiName)) {
							final EObjectCondition isDAType = new EObjectTypeRelationCondition(
								SclPackage.eINSTANCE.getTDAType()
							);
							
							final EObjectCondition isThisDAType = new EObjectAttributeValueCondition(
								SclPackage.eINSTANCE.getTIDNaming_Id(),
								new StringValue(da.getType())
							);
							
							IQueryResult DAResult = new SELECT(
								new FROM(root),
								new WHERE(isDAType.AND(isThisDAType))
							).execute();
							
							if (DAResult.size() == 1) {
								TIDNaming daType = (TIDNaming) DAResult.iterator().next();
								mapSDIandDAI(root, map, name, daType, sdi.getSDI(), sdi.getDAI());
								//System.out.println("recursive call SDI: " + sdi.getName().toString() + " for DA " + da.getName() + " (with type '" + da.getType() + "')");
							}
							else {
								error(DAResult.size() + " DAs match DA type: " + da.getType());
							}
						}
					}
				}
				else if (type.eClass() == SclPackage.eINSTANCE.getTDAType()) {
					TDAType daType = (TDAType) type;
					Iterator<TBDA> das = daType.getBDA().iterator();
					
					while (das.hasNext()) {
						TBDA bda = das.next();
						if (bda.getName().equals(sdiName)) {
							final EObjectCondition isDAType = new EObjectTypeRelationCondition(
								SclPackage.eINSTANCE.getTDAType()
							);
							
							final EObjectCondition isThisDAType = new EObjectAttributeValueCondition(
								SclPackage.eINSTANCE.getTIDNaming_Id(),
								new StringValue(bda.getType())
							);
							
							IQueryResult DAResult = new SELECT(
								new FROM(root),
								new WHERE(isDAType.AND(isThisDAType))
							).execute();
							
							if (DAResult.size() == 1) {
								TIDNaming bdaType = (TIDNaming) DAResult.iterator().next();
								mapSDIandDAI(root, map, name, bdaType, sdi.getSDI(), sdi.getDAI());
								//System.out.println("recursive call SDI: " + sdi.getName().toString() + " for BDA " + bda.getName() + " (with type '" + bda.getType() + "')");
							}
							else {
								error(DAResult.size() + " DAs match BDA type: " + bda.getType());
							}
						}
					}
				}
				else {
					error("unknown data type node for SDI");
				}
			}
		}
	}

	public static void warning(String warning) {
		System.out.println("Warning: " + warning);
	}
	
	public void error(String error) {
		System.err.println("Error: " + error);
		System.exit(1);
	}
	
	/**
	 * Checks that all data type definitions are in an order that will ensure valid C code.
	 * Also ensures that DAs, SDOs, and BDA map to a valid types that exist in the SCD file. 
	 * 
	 * @param root
	 */
	public void checkDataTypeOrder(DocumentRoot root) {
		EList<String> daTypeList = new BasicEList<String>();
		EList<String> doTypeList = new BasicEList<String>();
		String endOfError = "; the SCD datatype templates may need to be corrected or reordered for correct C code to be generated";
		
		// check DATypes
		Iterator<TDAType> daTypeResult = root.getSCL().getDataTypeTemplates().getDAType().iterator(); 
		
		while (daTypeResult.hasNext()) {
			TDAType daType = daTypeResult.next();
			daTypeList.add(daType.getId());
			
			Iterator<TBDA> bdaList = daType.getBDA().iterator();
			
			while (bdaList.hasNext()) {
				TBDA bda = bdaList.next();
				
				if (bda.getBType().toString().equals("Struct") && !daTypeList.contains(bda.getType())) {
					error("cannot find DAType for BDA '" + bda.getType() + "'" + endOfError);
				}
			}
		}
		
		// check DOTypes
		Iterator<TDOType> doTypeResult = root.getSCL().getDataTypeTemplates().getDOType().iterator();
		
		while (doTypeResult.hasNext()) {
			TDOType doType = doTypeResult.next();
			doTypeList.add(doType.getId());
			
			// DA components
			Iterator<TDA> daList = doType.getDA().iterator();
			
			while (daList.hasNext()) {
				TDA da = daList.next();
				
				if (da.getBType().toString().equals("Struct") && !daTypeList.contains(da.getType())) {
					error("cannot find DAType for DA '" + da.getType() + "' in DOType '" + doType.getId() + "'" + endOfError);
				}
			}
			
			// SDO components
			Iterator<TSDO> sdoList = doType.getSDO().iterator();
			
			while (sdoList.hasNext()) {
				TSDO sdo = sdoList.next();
				
				if (!doTypeList.contains(sdo.getType())) {
					error("cannot find DOType for SDO '" + sdo.getType() + "'" + endOfError);
				}
			}
		}
	}

	/**
	 * Ensures that all IED names, LNs, data type IDs are unique.
	 * 
	 * @param root
	 */
	public void checkForDuplicateNames(DocumentRoot root) {
		// check IED names
		final EObjectCondition isIED = new EObjectTypeRelationCondition(
			SclPackage.eINSTANCE.getTIED()
		);
		
		IQueryResult iedResult = new SELECT(
			new FROM(root),
			new WHERE(isIED)
		).execute();
		
		for (Object o : iedResult) {
			TIED ied = (TIED) o;
			String iedName = ied.getName();
			
			final EObjectCondition isIEDName = new EObjectAttributeValueCondition(
				SclPackage.eINSTANCE.getTNaming_Name(),
				new StringValue(iedName)
			);
			
			IQueryResult sameIEDNameResult = new SELECT(
				new FROM(root),
				new WHERE(isIED.AND(isIEDName))
			).execute();
			
			if (sameIEDNameResult.size() > 1) {
				error("more than one IED named '" + iedName + "'");
			}
			
			// check that LNs within this IED are unique
			final EObjectCondition isLN = new EObjectTypeRelationCondition(
				SclPackage.eINSTANCE.getTLN()
			);
			
			IQueryResult lnResult = new SELECT(
				new FROM(ied),
				new WHERE(isLN)
			).execute();
			
			for (Object oLN : lnResult) {
				TLN ln = (TLN) oLN;
				String lnType = ln.getLnType();
				String lnPrefix = ln.getPrefix();
				Long lnInst = ln.getInst();
				
				final EObjectCondition isLNType = new EObjectAttributeValueCondition(
					SclPackage.eINSTANCE.getTAnyLN_LnType(),
					new StringValue(lnType)
				);
				
				final EObjectCondition isLNInst = new EObjectAttributeValueCondition(
					SclPackage.eINSTANCE.getTLN_Inst(),
					new NumberCondition.LongValue(lnInst)
				);
				
				final EObjectCondition isLNPrefix = new EObjectAttributeValueCondition(
					SclPackage.eINSTANCE.getTLN_Prefix(),
					new StringValue(lnPrefix)
				);
				
				IQueryResult sameLNResult = new SELECT(
					new FROM(ied),
					new WHERE(isLN.AND(isLNType).AND(isLNInst).AND(isLNPrefix))
				).execute();
				
				if (sameLNResult.size() > 1) {
					error("more than one LN in IED '" + iedName + "' with type '" + lnType + "', instance value '" + lnInst + "', and prefix '" + lnPrefix + "'");
				}
			}
			
			// check that DataSet names within this IED are unique
			Iterator<TAccessPoint> aps = ied.getAccessPoint().iterator();
			
			while (aps.hasNext()) {
				TAccessPoint ap = aps.next();
				
				if (ap != null && ap.getServer() != null) {
					Iterator<TLDevice> lds = ap.getServer().getLDevice().iterator();
					
					while (lds.hasNext()) {
						TLDevice ld = lds.next();
						
						final EObjectCondition isDataSet = new EObjectTypeRelationCondition(
							SclPackage.eINSTANCE.getTDataSet()
						);
						
						IQueryResult dataSetResult = new SELECT(
							new FROM(ld),
							new WHERE(isDataSet)
						).execute();
						
						for (Object oDataset : dataSetResult) {
							TDataSet dataset = (TDataSet) oDataset;
							
							final EObjectCondition isThisDataSetNAME = new EObjectAttributeValueCondition(
								SclPackage.eINSTANCE.getTNaming_Name(),
								new StringValue(dataset.getName())
							);
			
							IQueryResult dataSetDuplicateResult = new SELECT(
								new FROM(ld),
								new WHERE(isDataSet.AND(isThisDataSetNAME))
							).execute();
							
							if (dataSetDuplicateResult.size() > 1) {
								error("more than one DataSet in IED '" + iedName + "' with name '" + dataset.getName() + "'");
							}
						}
					}
				}
			}
		}

		// check DOType IDs
		final EObjectCondition isDOType = new EObjectTypeRelationCondition(
			SclPackage.eINSTANCE.getTDOType()
		);
		
		IQueryResult doTypeResult = new SELECT(
			new FROM(root),
			new WHERE(isDOType)
		).execute();
		
		for (Object o : doTypeResult) {
			TDOType doType = (TDOType) o;
			String doTypeName = doType.getId();
			
			final EObjectCondition isDoTypeId = new EObjectAttributeValueCondition(
				SclPackage.eINSTANCE.getTIDNaming_Id(),
				new StringValue(doTypeName)
			);
			
			IQueryResult sameDoNameResult = new SELECT(
				new FROM(root),
				new WHERE(isDOType.AND(isDoTypeId))
			).execute();
			
			if (sameDoNameResult.size() > 1) {
				error("more than one DOType with id '" + doTypeName + "'");
			}
		}

		// check DAType IDs
		final EObjectCondition isDAType = new EObjectTypeRelationCondition(
			SclPackage.eINSTANCE.getTDAType()
		);
		
		IQueryResult daTypeResult = new SELECT(
			new FROM(root),
			new WHERE(isDAType)
		).execute();
		
		for (Object o : daTypeResult) {
			TDAType daType = (TDAType) o;
			String daTypeName = daType.getId();
			
			final EObjectCondition isDaTypeId = new EObjectAttributeValueCondition(
				SclPackage.eINSTANCE.getTIDNaming_Id(),
				new StringValue(daTypeName)
			);
			
			IQueryResult sameDaNameResult = new SELECT(
				new FROM(root),
				new WHERE(isDAType.AND(isDaTypeId))
			).execute();
			
			if (sameDaNameResult.size() > 1) {
				error("more than one DAType with id '" + daTypeName + "'");
			}
		}

		// check Enum IDs
		final EObjectCondition isEnumType = new EObjectTypeRelationCondition(
			SclPackage.eINSTANCE.getTEnumType()
		);
		
		IQueryResult enumTypeResult = new SELECT(
			new FROM(root),
			new WHERE(isEnumType)
		).execute();
		
		for (Object o : enumTypeResult) {
			TEnumType enumType = (TEnumType) o;
			String enumTypeName = enumType.getId();
			
			final EObjectCondition isEnumTypeId = new EObjectAttributeValueCondition(
				SclPackage.eINSTANCE.getTIDNaming_Id(),
				new StringValue(enumTypeName)
			);
			
			IQueryResult sameEnumNameResult = new SELECT(
				new FROM(root),
				new WHERE(isEnumType.AND(isEnumTypeId))
			).execute();
			
			if (sameEnumNameResult.size() > 1) {
				error("more than one EnumType with id '" + enumTypeName + "'");
			}
		}
	}

	/**
	 * Pre-calculates the type of all DAs and BDAs, as a string of C code.
	 * 
	 * @param root
	 */
	public void setPrintedType(DocumentRoot root, SCDAdditionalMappings map) {
		// find DAs and BDAs
		final EObjectCondition isDA = new EObjectTypeRelationCondition(
			SclPackage.eINSTANCE.getTDA()
		);
		final EObjectCondition isBDA = new EObjectTypeRelationCondition(
			SclPackage.eINSTANCE.getTBDA()
		);
		
		IQueryResult daResult = new SELECT(
			new FROM(root),
			new WHERE(isDA.OR(isBDA))
		).execute();

		//System.out.println("daResult: " + daResult.size());
		
		if (daResult.size() >= 1) {
			for (Object o : daResult) {
				TAbstractDataAttribute da = (TAbstractDataAttribute) o;
				TPredefinedBasicTypeEnum bTypePredefined = TPredefinedBasicTypeEnum.getByName(da.getBType().toString());
				String bType = da.getBType().toString();
				String printedType = "";
				String coderType = "";
				
				if (bType.equals("Struct")) {
					printedType = "struct " + da.getType();
					coderType = da.getType();
					//System.out.println("\tvalid Struct type: '" + printedType + "'");
				}
				else if (bType.equals("Enum")) {
					// ensure the EnumType exists
					final EObjectCondition isEnumType = new EObjectTypeRelationCondition(
						SclPackage.eINSTANCE.getTEnumType()
					);
					
					final EObjectCondition isEnumTypeId = new EObjectAttributeValueCondition(
						SclPackage.eINSTANCE.getTIDNaming_Id(),
						new StringValue(da.getType())
					);
					
					IQueryResult enumResult = new SELECT(
						new FROM(root),
						new WHERE(isEnumType.AND(isEnumTypeId))
					).execute();
					
					if (enumResult.size() == 1) {
						printedType = "enum " + da.getType();
						coderType = "CTYPE_ENUM";
						//System.out.println("\tvalid Enum type: '" + printedType + "'");
					}
					else {
						error("EnumType with ID '" + da.getType() + "' does not exist");
					}
				}
				else if (bTypePredefined != null) {
					printedType = "CTYPE_" + bTypePredefined.getName().toUpperCase();
					coderType = printedType;
					//System.out.println("\tvalid basic type: '" + printedType + "'");
				}
				else {
					error("unknown bType attribute '" + da.getBType().toString() + "', for DA: '" + da + "'");
				}
				if (map != null) {
					map.setPrintedType(da, new String(printedType));
					map.setCoderType(da, new String(coderType));
				}
			}
		}
		

		final EObjectCondition isDOType = new EObjectTypeRelationCondition(
			SclPackage.eINSTANCE.getTDOType()
		);
		
		IQueryResult doTypeResult = new SELECT(
			new FROM(root),
			new WHERE(isDOType)
		).execute();

		for (Object o : doTypeResult) {
			TDOType doType = (TDOType) o;

			if (map != null) {
				map.setPrintedType(doType, new String("struct " + doType.getId()));
				map.setCoderType(doType, new String(doType.getId()));
			}
		}
	}

	/**
	 * Ensures that the definition of a DOType does not contain an instance of itself.
	 * 
	 * @param root
	 */
	public void checkForCircularSDOReferences(DocumentRoot root) {
		final EObjectCondition isSDO = new EObjectTypeRelationCondition(
			SclPackage.eINSTANCE.getTSDO()
		);
		
		IQueryResult sdoResult = new SELECT(
			new FROM(root),
			new WHERE(isSDO)
		).execute();
		
		for (Object o : sdoResult) {
			TSDO sdo = (TSDO) o;

			if (sdo.eContainer().eClass() == SclPackage.eINSTANCE.getTDOType()) {
				TDOType container = (TDOType) sdo.eContainer();
				
				if (sdo.getType().equals(container.getId())) {
					error("SDO named '" + sdo.getName() + "' with type '" + sdo.getType() + "' is a cicular reference");
				}
			}
		}
	}

	public void mapFCDAToDataType(DocumentRoot root, SCDAdditionalMappings map) {
		final EObjectCondition isFCDA = new EObjectTypeRelationCondition(
			SclPackage.eINSTANCE.getTFCDA()
		);
		
		IQueryResult fcdaResult = new SELECT(
			new FROM(root),
			new WHERE(isFCDA)
		).execute();
		
		//System.out.println("fcdaResult: " + fcdaResult.size());
		for (Object nextFCDA : fcdaResult) {
			final TFCDA fcda = (TFCDA) nextFCDA;
			TIED ied = getIEDFromFCDA(root, fcda);
			
			// filter out invalid LDs
			PruneHandler pruner = new PruneHandler() {
				public boolean shouldPrune(EObject object) {
					if (object.eClass() == SclPackage.eINSTANCE.getTLDevice()) {
		            	TLDevice found = (TLDevice) object;
		            	
		            	if (!found.getInst().equals(fcda.getLdInst())) {
				            return true;
		            	}
		            }
		        	
		        	return false;
		        }
			};
			
			final EObjectCondition isLN = new EObjectTypeRelationCondition(
				SclPackage.eINSTANCE.getTLN(),
				pruner
			);
			final EObjectCondition isLNInst = new EObjectAttributeValueCondition(
				SclPackage.eINSTANCE.getTLN_Inst(),
				new NumberCondition.LongValue(Long.parseLong(fcda.getLnInst()))
			);
			ObjectInstanceCondition sc = new ObjectInstanceCondition(fcda.getLnClass()) {
				@Override
				public boolean isSatisfied(Object obj) {
					return getObject().toString().equals(obj.toString());
				}
			};
			final EObjectCondition isLNClass = new EObjectAttributeValueCondition(
				SclPackage.eINSTANCE.getTLN_LnClass(),
				sc
			);
			
			IQueryResult lnResult = new SELECT(
				new FROM(ied),
				new WHERE(isLN.AND(isLNInst).AND(isLNClass))
			).execute();

			//System.out.println("\tlnResult: " + lnResult.size() + ", LN prefix: '" + ((TLN)lnResult.iterator().next()).getPrefix() + "', FCDA prefx: '" + fcda.getPrefix() + "'");
			
			if (lnResult.size() == 0) {
				error("no Logical Node with class '" + fcda.getLnClass().toString() + "' for FCDA: " + fcda.toString());
			}
			else if (lnResult.size() >= 1) {
				boolean found = false;
				String lnPrefix = "";
				TLN ln = null;
				
				// find first matching prefix, noting that ln.getPrefix() may be null if not specified in SCD file
				for (Object o : lnResult) {
					if (!found) {
						ln =  (TLN) o;
						
						if (ln.getPrefix() != null) {
							lnPrefix = ln.getPrefix();
						}
	
						if (fcda.getPrefix().equals(lnPrefix)) {
							ln.setPrefix(lnPrefix);
							found = true;
							break;
						}
					}
				}
				
				if (!found) {
					error("no Logical Node with class '" + fcda.getLnClass().toString() + "' and prefix '" + lnPrefix + "' for FCDA: " + fcda.toString());
				}
				
				final EObjectCondition isLNType = new EObjectTypeRelationCondition(
					SclPackage.eINSTANCE.getTLNodeType()
				);
				
				final EObjectCondition isLNTypeValue = new EObjectAttributeValueCondition(
					SclPackage.eINSTANCE.getTIDNaming_Id(),
					new StringValue(ln.getLnType())
				);
				
				IQueryResult lnTypeResult = new SELECT(
					new FROM(root),
					new WHERE(isLNType.AND(isLNTypeValue))
				).execute();
				
				//System.out.println("\t\tLNodeType: " + ((TLNodeType) lnTypeResult.iterator().next()).getId());
				
				if (lnTypeResult.size() == 1) {
					TLNodeType lnType = ((TLNodeType) lnTypeResult.toArray()[0]);
					String fcdaDOName = fcda.getDoName();
					
					if (fcdaDOName.contains(".") || fcdaDOName.contains("(") || fcdaDOName.contains(")")) {
						error("FCDA doName values do not support '.' syntax, or arrays, for `" + fcdaDOName + "' in dataset '" + ((TDataSet) fcda.eContainer()).getName() + "' in IED '" + ied.getName() + "'");
					}
					else {
						final EObjectCondition isDO = new EObjectTypeRelationCondition(
							SclPackage.eINSTANCE.getTDO()
						);
						
						ObjectInstanceCondition sc3 = new ObjectInstanceCondition((Object) fcdaDOName) {
							@Override
							public boolean isSatisfied(Object obj) {
								return getObject().equals(obj.toString());
							}
						};
						final EObjectCondition isDOName = new EObjectAttributeValueCondition(
							SclPackage.eINSTANCE.getTDO_Name(),
							sc3
						);
						
						IQueryResult doTypeResult = new SELECT(
							new FROM(lnType),
							new WHERE(isDO.AND(isDOName))
						).execute();
						
						if (doTypeResult.size() >= 1) {
							//System.out.println("doTypeResult.size(): " + doTypeResult.size());
							TDO dataObject = ((TDO) doTypeResult.iterator().next());
							
							//System.out.println("\t\t\tDO: " + ((TDO) doTypeResult.iterator().next()).getType());
							
							final EObjectCondition isDOType = new EObjectTypeRelationCondition(
								SclPackage.eINSTANCE.getTDOType()
							);
							final EObjectCondition isDOTypeName = new EObjectAttributeValueCondition(
								SclPackage.eINSTANCE.getTIDNaming_Id(),
								new StringValue(dataObject.getType())
							);
							
							IQueryResult doTypeObjectResult = new SELECT(
								new FROM(root),
								new WHERE(isDOType.AND(isDOTypeName))
							).execute();
							
							if (doTypeObjectResult.size() == 1) {
								TDOType doType = ((TDOType) doTypeObjectResult.iterator().next());
								String fcdaVariableName = fcda.getLdInst() + "_" + fcda.getPrefix() + /*ln.getLnType()*/fcda.getLnClass() + "_" + ln.getInst() + "_" + fcda.getDoName();
								//System.out.println("\tDOType: " + doType.getId() + ", looking for FCDA DA: " + fcda.getDaName());
	
								if (map != null) {
									map.setLN(fcda, ln);
								}
								
								// set reference to DOType or DAType
								if (fcda.getDaName() == null || fcda.getDaName().equals("")) {
									if (map != null) {
										map.setDataAttribute(fcda, doType);
										map.setVariableName(fcda, new String(fcdaVariableName));
									}
									//System.out.println("\tvalid DO type: '" + fcda.getType() + "'");
								}
								else {
									// TODO: extend with support for FCDA daName="da.da.da(3)" (or ix="3"? see Tissue 302, and p. 75 of -6) syntax
									String fcdaDAName = fcda.getDaName();
									
									if (fcdaDAName.contains(".") || fcdaDAName.contains("(") || fcdaDAName.contains(")")) {
										error("FCDA daName values do not support '.' syntax, or arrays, for `" + fcdaDAName + "' in dataset '" + ((TDataSet) fcda.eContainer()).getName() + "' in IED '" + ied.getName() + "'");
									}
									else {
										final EObjectCondition isDA = new EObjectTypeRelationCondition(
											SclPackage.eINSTANCE.getTDA()
										);
										ObjectInstanceCondition sc2 = new ObjectInstanceCondition((Object) fcda.getDaName()) {
											@Override
											public boolean isSatisfied(Object obj) {
												return getObject().toString().equals(obj.toString());
											}
										};
										final EObjectCondition isDAName = new EObjectAttributeValueCondition(
											SclPackage.eINSTANCE.getTAbstractDataAttribute_Name(),
											sc2
										);
										
										IQueryResult daResult = new SELECT(
											new FROM(doType),
											new WHERE(isDA.AND(isDAName))
										).execute();
			
										//System.out.println("daResult: " + daResult.size() + ", fcda.getDaName(): " + fcda.getDaName());
										
										if (daResult.size() == 1) {
											TDA da = ((TDA) daResult.iterator().next());
		
											if (map != null) {
												// get type string from DA
												if (map.getPrintedType(da) == null || map.getPrintedType(da).equals("")) {
													warning("unknown printedType for DA '" + da.getName().toString() + "'");
												}
												else {
													String coderType = map.getCoderType(da);
													if (coderType.contains("struct")) {
														coderType = coderType.replace("struct ", "");
													}
													else if (coderType.contains("enum")) {
														coderType = coderType.replace("enum ", "");
													}
													map.setDataAttribute(fcda, da);
													map.setVariableName(fcda, new String(fcdaVariableName + "_" + fcda.getDaName()));
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


	public TIED getIEDFromFCDA(DocumentRoot root, TFCDA fcda) {
		EObject next = fcda;
		
		while (next != null) {
			next = next.eContainer();
			
			if (next.eClass() == SclPackage.eINSTANCE.getTIED()) {
				//System.out.println("found IED: " + (TIED) next);
				return (TIED) next;
			}
		}
		
		return null;
	}


	public void checkControlHasControlBlock(DocumentRoot root/*, SCDAdditionalMappings map*/) {
		final EObjectCondition isGSEControl = new EObjectTypeRelationCondition(
			SclPackage.eINSTANCE.getTGSEControl()
		);
		final EObjectCondition isSVControl = new EObjectTypeRelationCondition(
			SclPackage.eINSTANCE.getTSampledValueControl()
		);
		
		IQueryResult result = new SELECT(
			new FROM(root),
			new WHERE(isGSEControl.OR(isSVControl))
		).execute();
	
		//System.out.println("results: " + result.size());
		for (Object next : result) {
			//System.out.println(next.toString());
			TControl control = (TControl) next;

			final EObjectCondition isGSE = new EObjectTypeRelationCondition(
				SclPackage.eINSTANCE.getTGSE()
			);
			final EObjectCondition isSMV = new EObjectTypeRelationCondition(
				SclPackage.eINSTANCE.getTSMV()
			);
			final EObjectCondition isControlBlockForControl = new EObjectAttributeValueCondition(
				SclPackage.eINSTANCE.getTControlBlock_CbName(),
				new StringValue(control.getName())
			);

			IQueryResult resultMapped = new SELECT(
				new FROM(root),
				new WHERE((isGSE.OR(isSMV)).AND(isControlBlockForControl))
			).execute();
			
			//System.out.println("\tresults: " + resultMapped.size() + " (for '" + control.getName() + "')");
			//for (Object nextMapped : resultMapped) {
				//System.out.println("\t\t" + nextMapped.toString());
			//}
			if (resultMapped.getException() == null) {
				if (resultMapped.size() == 0) {
					error("no ControlBlock for " + control.eClass().getName() + " '" + control.getName() + "'");
				}
				else {
					if (resultMapped.size() == 1) {
//						TControlBlock cb = ((TControlBlock) resultMapped.toArray()[0]);
//						if (control.getControlBlock() == null) {
//							control.setControlBlock(cb);
//						}
						//map.setControlBlock(control, cb);
						//System.out.println("number of controls per dataset: " + dataSet.getControl().size());
					}
					else {
						error("more than one ControlBlock for " + control.eClass().getName() + " '" + control.getName() + "'");
					}
				}
			}
		}
	}

	public void mapDataSetToControl(DocumentRoot root, SCDAdditionalMappings map) {
		
		final EObjectCondition isGSEControl = new EObjectTypeRelationCondition(
			SclPackage.eINSTANCE.getTGSEControl()
		);
		final EObjectCondition isSVControl = new EObjectTypeRelationCondition(
			SclPackage.eINSTANCE.getTSampledValueControl()
		);
		
		IQueryResult result = new SELECT(
			new FROM(root),
			new WHERE(isGSEControl.OR(isSVControl))
		).execute();
	
		//System.out.println("results: " + result.size());
		for (Object next : result) {
			//System.out.println(next.toString());
			TControl control = (TControl) next;
			
			if (control.getDatSet() == null) {
				warning("Control '" + control.eClass().getName() + "' with name '" + control.getName() + "' is not configured with a dataset");
			}
			else {
				final EObjectCondition isDataSet = new EObjectTypeRelationCondition(
					SclPackage.eINSTANCE.getTDataSet()
				);
				final EObjectCondition isDataSetForControl = new EObjectAttributeValueCondition(
					SclPackage.eINSTANCE.getTNaming_Name(),
					new StringValue(control.getDatSet())
				);
	
				IQueryResult resultMapped = new SELECT(
					new FROM(root),
					new WHERE(isDataSet.AND(isDataSetForControl))
				).execute();
				
				//System.out.println("\tresults: " + resultMapped.size() + " (for '" + control.getName() + "')");
				//for (Object nextMapped : resultMapped) {
					//System.out.println("\t\t" + nextMapped.toString());
				//}
				if (resultMapped.getException() == null) {
					if (resultMapped.size() == 0) {
						error("no dataset named '" + control.getDatSet() + "' for " + control.eClass().getName() + " '" + control.getName() + "'");
					}
					else {
						if (resultMapped.size() == 1) {
							TDataSet dataSet = ((TDataSet) resultMapped.toArray()[0]);
							if (map != null) {
								map.setDataset(control, dataSet);
							}
							//System.out.println("number of controls per dataset: " + dataSet.getControl().size());
						}
						else {
							error(resultMapped.size() + " datasets named '" + control.getDatSet() + "' (for " + control.eClass().getName() + " '" + control.getName() + "')");
						}
					}
				}
			}
		}
	}
	

	public void mapExtRefToDataSet(DocumentRoot root, SCDAdditionalMappings map) {
		// find all ExtRefs
		final EObjectCondition isExtRef = new EObjectTypeRelationCondition(
			SclPackage.eINSTANCE.getTExtRef()
		);
		IQueryResult extRefs = new SELECT(
			new FROM(root),
			new WHERE(isExtRef)
		).execute();
		
		for (EObject object : extRefs) {
			final TExtRef extRef = (TExtRef) object;
			
			// filter out invalid IEDs
			PruneHandler pruner = new PruneHandler() {
				public boolean shouldPrune(EObject object) {
					if (object.eClass() == SclPackage.eINSTANCE.getTIED()) {
		            	TIED found = (TIED) object;
		            	
		            	if (!found.getName().equals(extRef.getIedName())) {
				            return true;
		            	}
		            }
		        	
		        	return false;
		        }
			};
			final EObjectCondition isFCDA = new EObjectTypeRelationCondition(
				SclPackage.eINSTANCE.getTFCDA(),
				pruner
			);
			final EObjectCondition isLdInst = new EObjectAttributeValueCondition(
				SclPackage.eINSTANCE.getTFCDA_LdInst(),
				new StringValue(extRef.getLdInst())
			);
			final EObjectCondition isPrefix = new EObjectAttributeValueCondition(
				SclPackage.eINSTANCE.getTFCDA_Prefix(),
				new StringValue(extRef.getPrefix())
			);
			ObjectInstanceCondition sc = new ObjectInstanceCondition((Object) extRef.getLnClass()) {
				@Override
				public boolean isSatisfied(Object obj) {
					return getObject().toString().equals(obj.toString());
				}
			};
			final EObjectCondition isLnClass = new EObjectAttributeValueCondition(
				SclPackage.eINSTANCE.getTFCDA_LnClass(),
				sc
			);
			final EObjectCondition isLnInst = new EObjectAttributeValueCondition(
				SclPackage.eINSTANCE.getTFCDA_LnInst(),
				new StringValue(extRef.getLnInst())
			);
			final EObjectCondition isDOName = new EObjectAttributeValueCondition(
				SclPackage.eINSTANCE.getTFCDA_DoName(),
				new StringValue(extRef.getDoName())
			);
	
			// find DO name, then extract DO type. Do not need to check daName in ExtRef, because DA should be included within DO
			IQueryResult result = new SELECT(
				new FROM(root),
				new WHERE(isFCDA.AND(isLdInst).AND(isPrefix).AND(isLnClass).AND(isLnInst).AND(isDOName))
			).execute();
	
			if (result.getException() != null) {
				return;
			} else {
				if (result.size() == 0) {
					error("no dataset satisfies ExtRef: LD Inst: " + extRef.getLdInst() + ", Prefix: " + extRef.getPrefix() + ", LN Class: " + extRef.getLnClass() + ", LN Inst: " + extRef.getLnInst() + ", DO name: " + extRef.getDoName() + ", DA name: " + extRef.getDaName());
				}
				else {
					if (result.size() > 1) {
						warning(result.size() + " datasets satisfy ExtRef: LD Inst: " + extRef.getLdInst() + ", Prefix: " + extRef.getPrefix() + ", LN Class: " + extRef.getLnClass() + ", LN Inst: " + extRef.getLnInst() + ", DO name: " + extRef.getDoName() + ", DA name: " + extRef.getDaName());
					}
					Iterator<EObject> fcdas = result.iterator();

					// map ExtRef to the DataSets of the FCDAs in results
					ArrayList<TDataSet> datasets = new ArrayList<TDataSet>();
					while (fcdas.hasNext()) {
						TFCDA fcda = (TFCDA) fcdas.next();
						datasets.add((TDataSet) fcda.eContainer());
					}
					if (map != null) {
						map.setDatasets(extRef, datasets);
					}
				}
			}
		}
	}
}
