/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.sc.lmaintenance;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * COPYRIGHT IEC, 2005. Version 1.4. Release 2005/09/11.
 * <!-- end-model-doc -->
 * @see ch.iec._61850._2006.sc.lmaintenance.LmaintenanceFactory
 * @model kind="package"
 * @generated
 */
public interface LmaintenancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lmaintenance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.iec.ch/61850/2006/SCLmaintenance";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lmaintenance";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LmaintenancePackage eINSTANCE = ch.iec._61850._2006.sc.lmaintenance.impl.LmaintenancePackageImpl.init();

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.sc.lmaintenance.impl.CondDescTypeImpl <em>Cond Desc Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.sc.lmaintenance.impl.CondDescTypeImpl
	 * @see ch.iec._61850._2006.sc.lmaintenance.impl.LmaintenancePackageImpl#getCondDescType()
	 * @generated
	 */
	int COND_DESC_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND_DESC_TYPE__DESC = 0;

	/**
	 * The feature id for the '<em><b>Mop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND_DESC_TYPE__MOP = 1;

	/**
	 * The number of structural features of the '<em>Cond Desc Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND_DESC_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.sc.lmaintenance.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.sc.lmaintenance.impl.DocumentRootImpl
	 * @see ch.iec._61850._2006.sc.lmaintenance.impl.LmaintenancePackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Cond Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COND_DESC = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.sc.lmaintenance.TMopEnum <em>TMop Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.sc.lmaintenance.TMopEnum
	 * @see ch.iec._61850._2006.sc.lmaintenance.impl.LmaintenancePackageImpl#getTMopEnum()
	 * @generated
	 */
	int TMOP_ENUM = 2;

	/**
	 * The meta object id for the '<em>TExtension Mop Enum</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ch.iec._61850._2006.sc.lmaintenance.impl.LmaintenancePackageImpl#getTExtensionMopEnum()
	 * @generated
	 */
	int TEXTENSION_MOP_ENUM = 3;

	/**
	 * The meta object id for the '<em>TMOP</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see ch.iec._61850._2006.sc.lmaintenance.impl.LmaintenancePackageImpl#getTMOP()
	 * @generated
	 */
	int TMOP = 4;

	/**
	 * The meta object id for the '<em>TMop Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.sc.lmaintenance.TMopEnum
	 * @see ch.iec._61850._2006.sc.lmaintenance.impl.LmaintenancePackageImpl#getTMopEnumObject()
	 * @generated
	 */
	int TMOP_ENUM_OBJECT = 5;

	/**
	 * The meta object id for the '<em>TRestr Name1st L</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ch.iec._61850._2006.sc.lmaintenance.impl.LmaintenancePackageImpl#getTRestrName1stL()
	 * @generated
	 */
	int TRESTR_NAME1ST_L = 6;


	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.sc.lmaintenance.CondDescType <em>Cond Desc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cond Desc Type</em>'.
	 * @see ch.iec._61850._2006.sc.lmaintenance.CondDescType
	 * @generated
	 */
	EClass getCondDescType();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.sc.lmaintenance.CondDescType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see ch.iec._61850._2006.sc.lmaintenance.CondDescType#getDesc()
	 * @see #getCondDescType()
	 * @generated
	 */
	EAttribute getCondDescType_Desc();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.sc.lmaintenance.CondDescType#getMop <em>Mop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mop</em>'.
	 * @see ch.iec._61850._2006.sc.lmaintenance.CondDescType#getMop()
	 * @see #getCondDescType()
	 * @generated
	 */
	EAttribute getCondDescType_Mop();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.sc.lmaintenance.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see ch.iec._61850._2006.sc.lmaintenance.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link ch.iec._61850._2006.sc.lmaintenance.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see ch.iec._61850._2006.sc.lmaintenance.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link ch.iec._61850._2006.sc.lmaintenance.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see ch.iec._61850._2006.sc.lmaintenance.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link ch.iec._61850._2006.sc.lmaintenance.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see ch.iec._61850._2006.sc.lmaintenance.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.sc.lmaintenance.DocumentRoot#getCondDesc <em>Cond Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cond Desc</em>'.
	 * @see ch.iec._61850._2006.sc.lmaintenance.DocumentRoot#getCondDesc()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CondDesc();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.sc.lmaintenance.TMopEnum <em>TMop Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TMop Enum</em>'.
	 * @see ch.iec._61850._2006.sc.lmaintenance.TMopEnum
	 * @generated
	 */
	EEnum getTMopEnum();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>TExtension Mop Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TExtension Mop Enum</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='tExtensionMopEnum' baseType='tRestrName1stL'"
	 * @generated
	 */
	EDataType getTExtensionMopEnum();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>TMOP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TMOP</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='tMOP' memberTypes='tMopEnum tExtensionMopEnum'"
	 * @generated
	 */
	EDataType getTMOP();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.sc.lmaintenance.TMopEnum <em>TMop Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TMop Enum Object</em>'.
	 * @see ch.iec._61850._2006.sc.lmaintenance.TMopEnum
	 * @model instanceClass="ch.iec._61850._2006.sc.lmaintenance.TMopEnum"
	 *        extendedMetaData="name='tMopEnum:Object' baseType='tMopEnum'"
	 * @generated
	 */
	EDataType getTMopEnumObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>TRestr Name1st L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TRestr Name1st L</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='tRestrName1stL' baseType='http://www.eclipse.org/emf/2003/XMLType#Name' pattern='\\p{Ll}[\\d,\\p{L},_]*'"
	 * @generated
	 */
	EDataType getTRestrName1stL();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LmaintenanceFactory getLmaintenanceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ch.iec._61850._2006.sc.lmaintenance.impl.CondDescTypeImpl <em>Cond Desc Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.iec._61850._2006.sc.lmaintenance.impl.CondDescTypeImpl
		 * @see ch.iec._61850._2006.sc.lmaintenance.impl.LmaintenancePackageImpl#getCondDescType()
		 * @generated
		 */
		EClass COND_DESC_TYPE = eINSTANCE.getCondDescType();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COND_DESC_TYPE__DESC = eINSTANCE.getCondDescType_Desc();

		/**
		 * The meta object literal for the '<em><b>Mop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COND_DESC_TYPE__MOP = eINSTANCE.getCondDescType_Mop();

		/**
		 * The meta object literal for the '{@link ch.iec._61850._2006.sc.lmaintenance.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.iec._61850._2006.sc.lmaintenance.impl.DocumentRootImpl
		 * @see ch.iec._61850._2006.sc.lmaintenance.impl.LmaintenancePackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Cond Desc</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COND_DESC = eINSTANCE.getDocumentRoot_CondDesc();

		/**
		 * The meta object literal for the '{@link ch.iec._61850._2006.sc.lmaintenance.TMopEnum <em>TMop Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.iec._61850._2006.sc.lmaintenance.TMopEnum
		 * @see ch.iec._61850._2006.sc.lmaintenance.impl.LmaintenancePackageImpl#getTMopEnum()
		 * @generated
		 */
		EEnum TMOP_ENUM = eINSTANCE.getTMopEnum();

		/**
		 * The meta object literal for the '<em>TExtension Mop Enum</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see ch.iec._61850._2006.sc.lmaintenance.impl.LmaintenancePackageImpl#getTExtensionMopEnum()
		 * @generated
		 */
		EDataType TEXTENSION_MOP_ENUM = eINSTANCE.getTExtensionMopEnum();

		/**
		 * The meta object literal for the '<em>TMOP</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see ch.iec._61850._2006.sc.lmaintenance.impl.LmaintenancePackageImpl#getTMOP()
		 * @generated
		 */
		EDataType TMOP = eINSTANCE.getTMOP();

		/**
		 * The meta object literal for the '<em>TMop Enum Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.iec._61850._2006.sc.lmaintenance.TMopEnum
		 * @see ch.iec._61850._2006.sc.lmaintenance.impl.LmaintenancePackageImpl#getTMopEnumObject()
		 * @generated
		 */
		EDataType TMOP_ENUM_OBJECT = eINSTANCE.getTMopEnumObject();

		/**
		 * The meta object literal for the '<em>TRestr Name1st L</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see ch.iec._61850._2006.sc.lmaintenance.impl.LmaintenancePackageImpl#getTRestrName1stL()
		 * @generated
		 */
		EDataType TRESTR_NAME1ST_L = eINSTANCE.getTRestrName1stL();

	}

} //LmaintenancePackage
