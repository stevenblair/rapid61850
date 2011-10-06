/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.sc.lmaintenance.impl;

import ch.iec._61850._2006.sc.lcoordinates.LcoordinatesPackage;

import ch.iec._61850._2006.sc.lcoordinates.impl.LcoordinatesPackageImpl;

import ch.iec._61850._2006.sc.lmaintenance.CondDescType;
import ch.iec._61850._2006.sc.lmaintenance.DocumentRoot;
import ch.iec._61850._2006.sc.lmaintenance.LmaintenanceFactory;
import ch.iec._61850._2006.sc.lmaintenance.LmaintenancePackage;
import ch.iec._61850._2006.sc.lmaintenance.TMopEnum;

import ch.iec._61850._2006.sc.lmaintenance.util.LmaintenanceValidator;

import ch.iec._61850._2006.scl.SclPackage;

import ch.iec._61850._2006.scl.impl.SclPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LmaintenancePackageImpl extends EPackageImpl implements LmaintenancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass condDescTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tMopEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tExtensionMopEnumEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tmopEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tMopEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tRestrName1stLEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ch.iec._61850._2006.sc.lmaintenance.LmaintenancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LmaintenancePackageImpl() {
		super(eNS_URI, LmaintenanceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link LmaintenancePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LmaintenancePackage init() {
		if (isInited) return (LmaintenancePackage)EPackage.Registry.INSTANCE.getEPackage(LmaintenancePackage.eNS_URI);

		// Obtain or create and register package
		LmaintenancePackageImpl theLmaintenancePackage = (LmaintenancePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LmaintenancePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LmaintenancePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		SclPackageImpl theSclPackage = (SclPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI) instanceof SclPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI) : SclPackage.eINSTANCE);
		LcoordinatesPackageImpl theLcoordinatesPackage = (LcoordinatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LcoordinatesPackage.eNS_URI) instanceof LcoordinatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LcoordinatesPackage.eNS_URI) : LcoordinatesPackage.eINSTANCE);

		// Load packages
		theSclPackage.loadPackage();

		// Create package meta-data objects
		theLmaintenancePackage.createPackageContents();
		theLcoordinatesPackage.createPackageContents();

		// Initialize created meta-data
		theLmaintenancePackage.initializePackageContents();
		theLcoordinatesPackage.initializePackageContents();

		// Fix loaded packages
		theSclPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theLmaintenancePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return LmaintenanceValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theLmaintenancePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LmaintenancePackage.eNS_URI, theLmaintenancePackage);
		return theLmaintenancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondDescType() {
		return condDescTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondDescType_Desc() {
		return (EAttribute)condDescTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondDescType_Mop() {
		return (EAttribute)condDescTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CondDesc() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTMopEnum() {
		return tMopEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTExtensionMopEnum() {
		return tExtensionMopEnumEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTMOP() {
		return tmopEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTMopEnumObject() {
		return tMopEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTRestrName1stL() {
		return tRestrName1stLEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LmaintenanceFactory getLmaintenanceFactory() {
		return (LmaintenanceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		condDescTypeEClass = createEClass(COND_DESC_TYPE);
		createEAttribute(condDescTypeEClass, COND_DESC_TYPE__DESC);
		createEAttribute(condDescTypeEClass, COND_DESC_TYPE__MOP);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COND_DESC);

		// Create enums
		tMopEnumEEnum = createEEnum(TMOP_ENUM);

		// Create data types
		tExtensionMopEnumEDataType = createEDataType(TEXTENSION_MOP_ENUM);
		tmopEDataType = createEDataType(TMOP);
		tMopEnumObjectEDataType = createEDataType(TMOP_ENUM_OBJECT);
		tRestrName1stLEDataType = createEDataType(TRESTR_NAME1ST_L);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(condDescTypeEClass, CondDescType.class, "CondDescType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondDescType_Desc(), theXMLTypePackage.getString(), "desc", null, 1, 1, CondDescType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCondDescType_Mop(), this.getTMOP(), "mop", null, 1, 1, CondDescType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CondDesc(), this.getCondDescType(), null, "condDesc", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tMopEnumEEnum, TMopEnum.class, "TMopEnum");
		addEEnumLiteral(tMopEnumEEnum, TMopEnum.M);
		addEEnumLiteral(tMopEnumEEnum, TMopEnum.O);
		addEEnumLiteral(tMopEnumEEnum, TMopEnum.P);
		addEEnumLiteral(tMopEnumEEnum, TMopEnum.C);
		addEEnumLiteral(tMopEnumEEnum, TMopEnum.C1);
		addEEnumLiteral(tMopEnumEEnum, TMopEnum.C2);

		// Initialize data types
		initEDataType(tExtensionMopEnumEDataType, String.class, "TExtensionMopEnum", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tmopEDataType, Object.class, "TMOP", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tMopEnumObjectEDataType, TMopEnum.class, "TMopEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tRestrName1stLEDataType, String.class, "TRestrName1stL", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";			
		addAnnotation
		  (condDescTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CondDesc_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getCondDescType_Desc(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "desc"
		   });		
		addAnnotation
		  (getCondDescType_Mop(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mop"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_CondDesc(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CondDesc",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (tExtensionMopEnumEDataType, 
		   source, 
		   new String[] {
			 "name", "tExtensionMopEnum",
			 "baseType", "tRestrName1stL"
		   });		
		addAnnotation
		  (tmopEDataType, 
		   source, 
		   new String[] {
			 "name", "tMOP",
			 "memberTypes", "tMopEnum tExtensionMopEnum"
		   });		
		addAnnotation
		  (tMopEnumEEnum, 
		   source, 
		   new String[] {
			 "name", "tMopEnum"
		   });		
		addAnnotation
		  (tMopEnumObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "tMopEnum:Object",
			 "baseType", "tMopEnum"
		   });		
		addAnnotation
		  (tRestrName1stLEDataType, 
		   source, 
		   new String[] {
			 "name", "tRestrName1stL",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#Name",
			 "pattern", "\\p{Ll}[\\d,\\p{L},_]*"
		   });
	}

} //LmaintenancePackageImpl
