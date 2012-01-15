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
import ch.iec._61850._2006.scl.TBDA;
import ch.iec._61850._2006.scl.TControl;
import ch.iec._61850._2006.scl.TControlBlock;
import ch.iec._61850._2006.scl.TDA;
import ch.iec._61850._2006.scl.TDAType;
import ch.iec._61850._2006.scl.TDO;
import ch.iec._61850._2006.scl.TDOType;
import ch.iec._61850._2006.scl.TDataSet;
import ch.iec._61850._2006.scl.TEnumType;
import ch.iec._61850._2006.scl.TExtRef;
import ch.iec._61850._2006.scl.TFCDA;
import ch.iec._61850._2006.scl.TIED;
import ch.iec._61850._2006.scl.TLDevice;
import ch.iec._61850._2006.scl.TLN;
import ch.iec._61850._2006.scl.TLNodeType;
import ch.iec._61850._2006.scl.TPredefinedBasicTypeEnum;
import ch.iec._61850._2006.scl.TSDO;

public class SCDValidator {

	public void validate(DocumentRoot root) {
		checkForDuplicateNames(root);
		checkForCircularSDOReferences(root);
		checkDataTypeOrder(root);
		
		setPrintedType(root);
		mapDataSetToControl(root);
		mapExtRefToDataSet(root);
		mapControlToControlBlock(root);
		mapFCDAToDataType(root);
	}
	
	public void warning(String warning) {
		System.out.println("Warning: " + warning);
	}
	
	public void error(String error) {
		System.err.println("Error: " + error);
		System.exit(1);
	}
	
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
			
			// check LNs within this IED are unique
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
				Long lnInst = ln.getInst();
				
				final EObjectCondition isLNType = new EObjectAttributeValueCondition(
					SclPackage.eINSTANCE.getTAnyLN_LnType(),
					new StringValue(lnType)
				);
				
				final EObjectCondition isLNInst = new EObjectAttributeValueCondition(
					SclPackage.eINSTANCE.getTLN_Inst(),
					new NumberCondition.LongValue(lnInst)
				);
				
				IQueryResult sameLNResult = new SELECT(
					new FROM(ied),
					new WHERE(isLN.AND(isLNType).AND(isLNInst))
				).execute();
				
				if (sameLNResult.size() > 1) {
					error("more than one LN in IED '" + iedName + "' with type '" + lnType + "' and instance value '" + lnInst + "'");
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


	public void setPrintedType(DocumentRoot root) {
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
				String finalType = "";
				
				if (bType.equals("Struct")) {
					finalType = "struct " + da.getType();
					//System.out.println("\tvalid Struct type: '" + finalType + "'");
				}
				else if (bType.equals("Enum")) {
					finalType = "enum " + da.getType();
					//System.out.println("\tvalid Enum type: '" + finalType + "'");
				}
				else if (bTypePredefined != null) {
					finalType = "CTYPE_" + bTypePredefined.getName().toUpperCase();
					//System.out.println("\tvalid basic type: '" + finalType + "'");
				}
				else {
					error("unknown bType attribute for DA: '" + da + "'");
				}
				da.setPrintedType(finalType);
			}
		}
	}

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

	public void mapFCDAToDataType(DocumentRoot root) {
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
			final EObjectCondition isLNPrefix = new EObjectAttributeValueCondition(
				SclPackage.eINSTANCE.getTLN_Prefix(),
				new StringValue(fcda.getPrefix())
			);
			
			IQueryResult lnResult = new SELECT(
				new FROM(ied),
				new WHERE(isLN.AND(isLNInst).AND(isLNClass).AND(isLNPrefix))
			).execute();
			
			//System.out.println("\tlnResult: " + lnResult.size() + ", LN prefix: '" + ((TLN)lnResult.iterator().next()).getPrefix() + "', FCDA prefx: '" + fcda.getPrefix() + "'");
			if (lnResult.size() == 0) {
				warning("no Logical Node with class '" + fcda.getLnClass().toString() + "' for FCDA: " + fcda.toString());
			}
			else if (lnResult.size() == 1) {
				if (lnResult.size() > 1) {
					warning("more than one Logical Node with class '" + fcda.getLnClass().toString() + "' for FCDA: " + fcda.toString());
				}
				TLN ln = ((TLN) lnResult.toArray()[0]);
				
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
				
				if (lnTypeResult.size() >= 1) {
					TLNodeType lnType = ((TLNodeType) lnTypeResult.toArray()[0]);
					
					final EObjectCondition isDO = new EObjectTypeRelationCondition(
						SclPackage.eINSTANCE.getTDO()
					);
					
					ObjectInstanceCondition sc3 = new ObjectInstanceCondition((Object) fcda.getDoName()) {
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
						
						if (doTypeObjectResult.size() >= 1) {
							TDOType doType = ((TDOType) doTypeObjectResult.iterator().next());
							//System.out.println("\tDOType: " + doType.getId() + ", looking for FCDA DA: " + fcda.getDaName());
							
							// set reference to DOType or DAType
							if (fcda.getDaName() == null || fcda.getDaName().equals("")) {
								fcda.setDoType(doType);
								fcda.setPrintedType("struct " + doType.getId());
								//System.out.println("\tvalid DO type: '" + fcda.getType() + "'");
							}
							else {
								// TODO: extend with support for FCDA daName="da.da.da(3)" (or ix="3"? see Tissue 302, and p. 75 of -6) syntax
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
								
								if (daResult.size() >= 1) {
									TDA da = ((TDA) daResult.iterator().next());

									// get type string from DA
									if (da.getPrintedType() == null || da.getPrintedType().equals("")) {
										warning("unknown printedType for DA '" + da.getType() + "'");
									}
									else {
										fcda.setPrintedType(da.getPrintedType());
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


	public void mapControlToControlBlock(DocumentRoot root) {
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
					warning("no ControlBlock for " + control.eClass().getName() + " '" + control.getName() + "'");
				}
				else {
					if (resultMapped.size() == 1) {
						TControlBlock cb = ((TControlBlock) resultMapped.toArray()[0]);
						if (control.getControlBlock() == null) {
							control.setControlBlock(cb);
						}
						//System.out.println("number of controls per dataset: " + dataSet.getControl().size());
					}
					else {
						warning("more than one ControlBlock for " + control.eClass().getName() + " '" + control.getName() + "'");
					}
				}
			}
		}
	}

	public void mapDataSetToControl(DocumentRoot root) {
		
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
					warning("no dataset named '" + control.getDatSet() + "' for " + control.eClass().getName() + " '" + control.getName() + "'");
				}
				else {
					if (resultMapped.size() == 1) {
						TDataSet dataSet = ((TDataSet) resultMapped.toArray()[0]);
						control.setDataSetRef(dataSet);
						//System.out.println("number of controls per dataset: " + dataSet.getControl().size());
					}
					else {
						warning("more than one dataset named '" + control.getDatSet() + "' (for " + control.eClass().getName() + " '" + control.getName() + "')");
					}
				}
			}
		}
	}
	

	public void mapExtRefToDataSet(DocumentRoot root) {
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
			final EObjectCondition isDAName = new EObjectAttributeValueCondition(
				SclPackage.eINSTANCE.getTFCDA_DaName(),
				new StringValue(extRef.getDaName())
			);
			EObjectCondition isDOAndDA = isDOName;
			if (extRef.getDaName() != null) {
				isDOAndDA = isDOAndDA.AND(isDAName);
			}
	
			// find DO name, then extract DO type
			IQueryResult result = new SELECT(
				new FROM(root),
				new WHERE(isFCDA.AND(isLdInst).AND(isPrefix).AND(isLnClass).AND(isLnInst).AND(isDOAndDA))
			).execute();
	
			if (result.getException() != null) {
				return;
			} else {
				if (result.size() == 0) {
					warning("no dataset satisfies ExtRef: LD Inst: " + extRef.getLdInst() + ", Prefix: " + extRef.getPrefix() + ", LN Class: " + extRef.getLnClass() + ", LN Inst: " + extRef.getLnInst() + ", DO name: " + extRef.getDoName() + ", DA name: " + extRef.getDaName());
				}
				else {
					if (result.size() > 1) {
						warning("more than dataset satisfies ExtRef: LD Inst: " + extRef.getLdInst() + ", Prefix: " + extRef.getPrefix() + ", LN Class: " + extRef.getLnClass() + ", LN Inst: " + extRef.getLnInst() + ", DO name: " + extRef.getDoName() + ", DA name: " + extRef.getDaName());
					}
					
					// map ExtRef to the DataSet of the first FCDA in results
					extRef.setDataSet((TDataSet) ((TFCDA) result.toArray()[0]).eContainer());
				}
			}
		}
	}
}
