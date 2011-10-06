package sclToC;

/**
 * <copyright>
 *
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id$
 */

import java.io.File;
import java.util.Iterator;

import org.eclipse.emf.ecore.resource.Resource;

import sclToCHelper.BDA;

import ch.iec._61850._2006.scl.DocumentRoot;
import ch.iec._61850._2006.scl.TBDA;
import ch.iec._61850._2006.scl.TDAType;
import ch.iec._61850._2006.scl.TDataTypeTemplates;
import ch.iec._61850._2006.scl.util.SclXMLProcessor;

public class Validator {

	public static void main(String[] args)
	{
		String xmlFile = "src\\RunSCL\\scd.xml";
		SclXMLProcessor processor = null;
		Resource resource = null;
		try
		{
			processor = new SclXMLProcessor();
			resource = processor.load(new File(xmlFile).getAbsolutePath(), null);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		/*EObjectSource source = new EObjectSource(resource.getContents());
		
		EPackage ePackage = SclPackage.eINSTANCE;*/
		/*System.out.println("package " + ePackage.getNsURI());
		
		for (Iterator i = 
			ePackage.getEClassifiers().iterator(); i.hasNext(); )
		{
			//
			EClassifier eClassifier = (EClassifier)i.next();
			if (eClassifier instanceof EClass)
			{
				//
				EClass eClass = (EClass)eClassifier;
				System.out.println(" class " + eClass.getName());
				for (Iterator j = 
					eClass.getEStructuralFeatures().iterator(); j.hasNext(); )
				{
					//
					EStructuralFeature eStructuralFeature = (EStructuralFeature)j.next();
					if (eStructuralFeature instanceof EReference)
					{
						EReference eReference = (EReference)eStructuralFeature;
						System.out.println
						("  reference " + eReference.getName() + ":" + eReference.getEReferenceType().getName());
					}
					else
					{
						EAttribute eAttribute = (EAttribute)eStructuralFeature;
						System.out.println
						("  attribute " + eAttribute.getName() + ":" + eAttribute.getEAttributeType().getName());
					}
				}
			}
			else
			{
				EDataType eDataType = (EDataType)eClassifier;
				System.out.println(" data type " + eDataType.getName());
			}
		}*/
		
		
		
		// query that doesn't work yet
		/*EObjectCondition condition = new EObjectReferenceValueCondition(
				new EObjectTypeRelationCondition(
						SclPackage.eINSTANCE.getTIED()
				),
				SclPackage.eINSTANCE.getSCLType_IED(),
				new EObjectAttributeValueCondition(
						SclPackage.eINSTANCE.getTNaming_Name(),
						new StringValue("E1Q1SB1")
				)
		);
		
		// Build the select query statement
		SELECT statement = new SELECT(
				new FROM(resource.getContents()), 
				new WHERE(condition));

		Collection<EObject> result = statement.execute();
		System.out.println(result.size());

		Iterator<EObject> iter = result.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next().toString());
		}*/
		
		
		// get "root" EObject and walk
		/*EList<TIED> ieds = ((DocumentRoot) resource.getContents().get(0)).getSCL().getIED();
		Iterator<TIED> iter = ieds.iterator();
		while (iter.hasNext()) {
			TIED ied = iter.next();
			TServer server = ied.getAccessPoint().get(0).getServer();
			if (server != null) {
				EList<TDataSet> datasets = server.getLDevice().get(0).getLN0().getDataSet();
				
				System.out.println("IED " + ied.getName() + ", with " + datasets.size() + " datasets");
				
				Iterator<TDataSet> iterDatasets = datasets.iterator();
				while (iterDatasets.hasNext()) {
					TDataSet dataset = iterDatasets.next();
					System.out.println("\tdataset " + dataset.getName());
					
					Iterator<TFCDA> iterFCDA = dataset.getFCDA().iterator();
					while (iterFCDA.hasNext()) {
						TFCDA fcda = iterFCDA.next();
						System.out.println("\t\tDO: " + fcda.getDoName() + "\tDA: " + fcda.getDaName() + "\tLNClass: " + fcda.getLnClass() + "\tFCname: " + fcda.getFc().getName());
					}
				}
			}
		}*/
		
		// create JET instances
		BDA bdaJET = new BDA();
		
		
		TDataTypeTemplates dataTypeTemplates = ((DocumentRoot) resource.getContents().get(0)).getSCL().getDataTypeTemplates();
		Iterator<TDAType> daTypes = dataTypeTemplates.getDAType().iterator();
		
		while (daTypes.hasNext()) {
			TDAType daType = daTypes.next();
			System.out.println("struct " + daType.getId() + " {");
			
			Iterator <TBDA> bdaTypes = daType.getBDA().iterator();
			
			while (bdaTypes.hasNext()) {
				TBDA bdaType = bdaTypes.next();
				
				String bda = bdaJET.generate(bdaType);

				//System.out.println("\tBDA: " + bdaType.getBType() + ", " + bdaType.getType());
				System.out.println("\t" + bda);
			}
			
			System.out.println("}");
		}
		
		
		// manual iterative walk
		/*Iterator i = resource.getContents().iterator();
		while (i.hasNext()) {
			EObject o = (EObject) i.next();
			System.out.println(o.toString());
			
			if (o.eContents() != null) {
				Iterator i2 = o.eContents().iterator();
				while (i2.hasNext()) {
					EObject o2 = (EObject) i2.next();
					System.out.println("   " + o2.toString());
					
					EStructuralFeature feature = o2.eClass().getEStructuralFeature(SclPackage.SCL_TYPE);
					
					if (feature != null) {
						System.out.println("found: " + feature.getName() + ", " + o2.eClass().getName() + ", " + ((SCLTypeImpl) o2).getIED().get(0).getName());
					}

					if ((o2.eClass() instanceof SCLTypeImpl)) {
						((SCLTypeImpl) o2).eGet(SclPackage.SCL_TYPE__TEXT, false, false);
					}
				}
			}
		}*/
		
		
		//System.out.println(source.getClass());
		
		//Condition iedName = new SubStringValue("E1Q1SB1");
		
		//EObjectCondition isIED = new EObjectAttributeValueCondition(SclPackage.TIED__NAME, iedName);
		

		/*StringAdapter adapter = new StringAdapter() {
			public String getString(Object object) {
				return (String) object;
			}
		};
		StringCondition sc = new StringCondition(adapter) {
			public boolean isSatisfied(String str) {
				return (new String("E1")).equals(str);
			}
		};*/

		/*EObjectAttributeValueCondition condition = new EObjectAttributeValueCondition(
				SclPackage.eINSTANCE.getTLNode_LdInst(),
				new NumberCondition.IntegerValue(new Integer(0), new Integer(Integer.MAX_VALUE)));

		SELECT statement =
			new SELECT(
					new FROM(source),
					new WHERE(condition)
			);

		IQueryResult result = null;

		try {
			//result = statement.execute();
		}
		catch (Exception e) {
			e.printStackTrace();
		}*/
		//System.out.println(result.toString());

		//TreeIterator<EObject> contents = resource.getAllContents();

		// Print the contents of the resource to System.out.
		/*try {
		resource.save(System.out, Collections.EMPTY_MAP);
	}
	catch (IOException e) {

	}*/

		/*EObject document = (EObject)resource.getContents().get(0);
      EObject feed = (EObject)document.eGet(document.eClass().getEStructuralFeature("SCL")); 

      Diagnostician validator = Diagnostician.INSTANCE;

      // Validate the feed and inspect the resulting diagnostic.
      Diagnostic diagnostic = validator.validate(feed);
      printDiagnostic(diagnostic, 0);*/
	}

	/*private static void printDiagnostic(Diagnostic diagnostic, int depth) {
		String message = null;
		switch (diagnostic.getSeverity()) {
		case Diagnostic.OK:
			message = "OK";
			break;
		case Diagnostic.ERROR:
			message = "ERROR: " + diagnostic.getMessage();
			break;
		case Diagnostic.INFO:
			message = "INFO: " + diagnostic.getMessage();
			break;
		}

		for (int i = 0; i < depth; i++) {
			System.out.print(i == depth - 1 ? "-> " : "   ");
		}
		System.out.println(message);

		for (Iterator i = diagnostic.getChildren().iterator(); i.hasNext();) {
			printDiagnostic((Diagnostic) i.next(), depth + 1);
		}
	}*/

}