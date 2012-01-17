/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;

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
 * COPYRIGHT IEC, 2005. Version 1.4. Release 2005/09/11.
 * COPYRIGHT IEC, 2005. Version 1.4. Release 2005/09/11.
 * COPYRIGHT IEC, 2005. Version 1.4. Release 2005/09/11.
 * <!-- end-model-doc -->
 * @see ch.iec._61850._2006.scl.SclFactory
 * @model kind="package"
 * @generated
 */
public interface SclPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.iec.ch/61850/2006/SCL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "scl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SclPackage eINSTANCE = ch.iec._61850._2006.scl.impl.SclPackageImpl.init();

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.AuthenticationTypeImpl <em>Authentication Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.AuthenticationTypeImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getAuthenticationType()
	 * @generated
	 */
	int AUTHENTICATION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Certificate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_TYPE__CERTIFICATE = 0;

	/**
	 * The feature id for the '<em><b>None</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_TYPE__NONE = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_TYPE__PASSWORD = 2;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_TYPE__STRONG = 3;

	/**
	 * The feature id for the '<em><b>Weak</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_TYPE__WEAK = 4;

	/**
	 * The number of structural features of the '<em>Authentication Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.DocumentRootImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getDocumentRoot()
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
	 * The feature id for the '<em><b>Communication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMMUNICATION = 3;

	/**
	 * The feature id for the '<em><b>Data Type Templates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_TYPE_TEMPLATES = 4;

	/**
	 * The feature id for the '<em><b>IED</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IED = 5;

	/**
	 * The feature id for the '<em><b>LN</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LN = 6;

	/**
	 * The feature id for the '<em><b>LN0</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LN0 = 7;

	/**
	 * The feature id for the '<em><b>SCL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCL = 8;

	/**
	 * The feature id for the '<em><b>Substation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUBSTATION = 9;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.HistoryTypeImpl <em>History Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.HistoryTypeImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getHistoryType()
	 * @generated
	 */
	int HISTORY_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Hitem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_TYPE__HITEM = 0;

	/**
	 * The number of structural features of the '<em>History Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TBaseElementImpl <em>TBase Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TBaseElementImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTBaseElement()
	 * @generated
	 */
	int TBASE_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBASE_ELEMENT__ANY = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBASE_ELEMENT__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBASE_ELEMENT__PRIVATE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBASE_ELEMENT__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>TBase Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBASE_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TUnNamingImpl <em>TUn Naming</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TUnNamingImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTUnNaming()
	 * @generated
	 */
	int TUN_NAMING = 115;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUN_NAMING__ANY = TBASE_ELEMENT__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUN_NAMING__TEXT = TBASE_ELEMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUN_NAMING__PRIVATE = TBASE_ELEMENT__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUN_NAMING__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUN_NAMING__DESC = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TUn Naming</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUN_NAMING_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TAnyLNImpl <em>TAny LN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TAnyLNImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTAnyLN()
	 * @generated
	 */
	int TANY_LN = 14;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANY_LN__ANY = TUN_NAMING__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANY_LN__TEXT = TUN_NAMING__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANY_LN__PRIVATE = TUN_NAMING__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANY_LN__ANY_ATTRIBUTE = TUN_NAMING__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANY_LN__DESC = TUN_NAMING__DESC;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANY_LN__DATA_SET = TUN_NAMING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Report Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANY_LN__REPORT_CONTROL = TUN_NAMING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Log Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANY_LN__LOG_CONTROL = TUN_NAMING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>DOI</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANY_LN__DOI = TUN_NAMING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANY_LN__INPUTS = TUN_NAMING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ln Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANY_LN__LN_TYPE = TUN_NAMING_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>TAny LN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANY_LN_FEATURE_COUNT = TUN_NAMING_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TLN0Impl <em>TLN0</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TLN0Impl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTLN0()
	 * @generated
	 */
	int TLN0 = 60;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLN0__ANY = TANY_LN__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLN0__TEXT = TANY_LN__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLN0__PRIVATE = TANY_LN__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLN0__ANY_ATTRIBUTE = TANY_LN__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLN0__DESC = TANY_LN__DESC;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLN0__DATA_SET = TANY_LN__DATA_SET;

	/**
	 * The feature id for the '<em><b>Report Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLN0__REPORT_CONTROL = TANY_LN__REPORT_CONTROL;

	/**
	 * The feature id for the '<em><b>Log Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLN0__LOG_CONTROL = TANY_LN__LOG_CONTROL;

	/**
	 * The feature id for the '<em><b>DOI</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLN0__DOI = TANY_LN__DOI;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLN0__INPUTS = TANY_LN__INPUTS;

	/**
	 * The feature id for the '<em><b>Ln Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLN0__LN_TYPE = TANY_LN__LN_TYPE;

	/**
	 * The feature id for the '<em><b>GSE Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLN0__GSE_CONTROL = TANY_LN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sampled Value Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLN0__SAMPLED_VALUE_CONTROL = TANY_LN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Setting Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLN0__SETTING_CONTROL = TANY_LN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>SCL Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLN0__SCL_CONTROL = TANY_LN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Log</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLN0__LOG = TANY_LN_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Inst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLN0__INST = TANY_LN_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ln Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLN0__LN_CLASS = TANY_LN_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>TLN0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLN0_FEATURE_COUNT = TANY_LN_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.LN0TypeImpl <em>LN0 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.LN0TypeImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getLN0Type()
	 * @generated
	 */
	int LN0_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LN0_TYPE__ANY = TLN0__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LN0_TYPE__TEXT = TLN0__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LN0_TYPE__PRIVATE = TLN0__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LN0_TYPE__ANY_ATTRIBUTE = TLN0__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LN0_TYPE__DESC = TLN0__DESC;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LN0_TYPE__DATA_SET = TLN0__DATA_SET;

	/**
	 * The feature id for the '<em><b>Report Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LN0_TYPE__REPORT_CONTROL = TLN0__REPORT_CONTROL;

	/**
	 * The feature id for the '<em><b>Log Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LN0_TYPE__LOG_CONTROL = TLN0__LOG_CONTROL;

	/**
	 * The feature id for the '<em><b>DOI</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LN0_TYPE__DOI = TLN0__DOI;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LN0_TYPE__INPUTS = TLN0__INPUTS;

	/**
	 * The feature id for the '<em><b>Ln Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LN0_TYPE__LN_TYPE = TLN0__LN_TYPE;

	/**
	 * The feature id for the '<em><b>GSE Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LN0_TYPE__GSE_CONTROL = TLN0__GSE_CONTROL;

	/**
	 * The feature id for the '<em><b>Sampled Value Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LN0_TYPE__SAMPLED_VALUE_CONTROL = TLN0__SAMPLED_VALUE_CONTROL;

	/**
	 * The feature id for the '<em><b>Setting Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LN0_TYPE__SETTING_CONTROL = TLN0__SETTING_CONTROL;

	/**
	 * The feature id for the '<em><b>SCL Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LN0_TYPE__SCL_CONTROL = TLN0__SCL_CONTROL;

	/**
	 * The feature id for the '<em><b>Log</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LN0_TYPE__LOG = TLN0__LOG;

	/**
	 * The feature id for the '<em><b>Inst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LN0_TYPE__INST = TLN0__INST;

	/**
	 * The feature id for the '<em><b>Ln Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LN0_TYPE__LN_CLASS = TLN0__LN_CLASS;

	/**
	 * The number of structural features of the '<em>LN0 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LN0_TYPE_FEATURE_COUNT = TLN0_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.OptFieldsTypeImpl <em>Opt Fields Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.OptFieldsTypeImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getOptFieldsType()
	 * @generated
	 */
	int OPT_FIELDS_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Buf Ovfl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT_FIELDS_TYPE__BUF_OVFL = 0;

	/**
	 * The feature id for the '<em><b>Config Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT_FIELDS_TYPE__CONFIG_REF = 1;

	/**
	 * The feature id for the '<em><b>Data Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT_FIELDS_TYPE__DATA_REF = 2;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT_FIELDS_TYPE__DATA_SET = 3;

	/**
	 * The feature id for the '<em><b>Entry ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT_FIELDS_TYPE__ENTRY_ID = 4;

	/**
	 * The feature id for the '<em><b>Reason Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT_FIELDS_TYPE__REASON_CODE = 5;

	/**
	 * The feature id for the '<em><b>Seq Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT_FIELDS_TYPE__SEQ_NUM = 6;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT_FIELDS_TYPE__TIME_STAMP = 7;

	/**
	 * The number of structural features of the '<em>Opt Fields Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT_FIELDS_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.SCLTypeImpl <em>SCL Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.SCLTypeImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getSCLType()
	 * @generated
	 */
	int SCL_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCL_TYPE__ANY = TBASE_ELEMENT__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCL_TYPE__TEXT = TBASE_ELEMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCL_TYPE__PRIVATE = TBASE_ELEMENT__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCL_TYPE__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCL_TYPE__HEADER = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Substation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCL_TYPE__SUBSTATION = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Communication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCL_TYPE__COMMUNICATION = TBASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>IED</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCL_TYPE__IED = TBASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Type Templates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCL_TYPE__DATA_TYPE_TEMPLATES = TBASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>SCL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCL_TYPE_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.SettingGroupsTypeImpl <em>Setting Groups Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.SettingGroupsTypeImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getSettingGroupsType()
	 * @generated
	 */
	int SETTING_GROUPS_TYPE = 6;

	/**
	 * The feature id for the '<em><b>SG Edit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_GROUPS_TYPE__SG_EDIT = 0;

	/**
	 * The feature id for the '<em><b>Conf SG</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_GROUPS_TYPE__CONF_SG = 1;

	/**
	 * The number of structural features of the '<em>Setting Groups Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_GROUPS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.SmvOptsTypeImpl <em>Smv Opts Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.SmvOptsTypeImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getSmvOptsType()
	 * @generated
	 */
	int SMV_OPTS_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMV_OPTS_TYPE__DATA_SET = 0;

	/**
	 * The feature id for the '<em><b>Refresh Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMV_OPTS_TYPE__REFRESH_TIME = 1;

	/**
	 * The feature id for the '<em><b>Sample Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMV_OPTS_TYPE__SAMPLE_RATE = 2;

	/**
	 * The feature id for the '<em><b>Sample Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMV_OPTS_TYPE__SAMPLE_SYNCHRONIZED = 3;

	/**
	 * The feature id for the '<em><b>Security</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMV_OPTS_TYPE__SECURITY = 4;

	/**
	 * The number of structural features of the '<em>Smv Opts Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMV_OPTS_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TNamingImpl <em>TNaming</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TNamingImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTNaming()
	 * @generated
	 */
	int TNAMING = 67;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNAMING__ANY = TBASE_ELEMENT__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNAMING__TEXT = TBASE_ELEMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNAMING__PRIVATE = TBASE_ELEMENT__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNAMING__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNAMING__DESC = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNAMING__NAME = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TNaming</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNAMING_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TLNodeContainerImpl <em>TL Node Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TLNodeContainerImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTLNodeContainer()
	 * @generated
	 */
	int TL_NODE_CONTAINER = 62;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_NODE_CONTAINER__ANY = TNAMING__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_NODE_CONTAINER__TEXT = TNAMING__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_NODE_CONTAINER__PRIVATE = TNAMING__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_NODE_CONTAINER__ANY_ATTRIBUTE = TNAMING__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_NODE_CONTAINER__DESC = TNAMING__DESC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_NODE_CONTAINER__NAME = TNAMING__NAME;

	/**
	 * The feature id for the '<em><b>LNode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_NODE_CONTAINER__LNODE = TNAMING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TL Node Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_NODE_CONTAINER_FEATURE_COUNT = TNAMING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TPowerSystemResourceImpl <em>TPower System Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TPowerSystemResourceImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPowerSystemResource()
	 * @generated
	 */
	int TPOWER_SYSTEM_RESOURCE = 83;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOWER_SYSTEM_RESOURCE__ANY = TL_NODE_CONTAINER__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOWER_SYSTEM_RESOURCE__TEXT = TL_NODE_CONTAINER__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOWER_SYSTEM_RESOURCE__PRIVATE = TL_NODE_CONTAINER__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOWER_SYSTEM_RESOURCE__ANY_ATTRIBUTE = TL_NODE_CONTAINER__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOWER_SYSTEM_RESOURCE__DESC = TL_NODE_CONTAINER__DESC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOWER_SYSTEM_RESOURCE__NAME = TL_NODE_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>LNode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOWER_SYSTEM_RESOURCE__LNODE = TL_NODE_CONTAINER__LNODE;

	/**
	 * The number of structural features of the '<em>TPower System Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOWER_SYSTEM_RESOURCE_FEATURE_COUNT = TL_NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TEquipmentImpl <em>TEquipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TEquipmentImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTEquipment()
	 * @generated
	 */
	int TEQUIPMENT = 43;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEQUIPMENT__ANY = TPOWER_SYSTEM_RESOURCE__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEQUIPMENT__TEXT = TPOWER_SYSTEM_RESOURCE__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEQUIPMENT__PRIVATE = TPOWER_SYSTEM_RESOURCE__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEQUIPMENT__ANY_ATTRIBUTE = TPOWER_SYSTEM_RESOURCE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEQUIPMENT__DESC = TPOWER_SYSTEM_RESOURCE__DESC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEQUIPMENT__NAME = TPOWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>LNode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEQUIPMENT__LNODE = TPOWER_SYSTEM_RESOURCE__LNODE;

	/**
	 * The feature id for the '<em><b>Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEQUIPMENT__VIRTUAL = TPOWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TEquipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEQUIPMENT_FEATURE_COUNT = TPOWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TAbstractConductingEquipmentImpl <em>TAbstract Conducting Equipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TAbstractConductingEquipmentImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTAbstractConductingEquipment()
	 * @generated
	 */
	int TABSTRACT_CONDUCTING_EQUIPMENT = 8;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_CONDUCTING_EQUIPMENT__ANY = TEQUIPMENT__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_CONDUCTING_EQUIPMENT__TEXT = TEQUIPMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_CONDUCTING_EQUIPMENT__PRIVATE = TEQUIPMENT__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_CONDUCTING_EQUIPMENT__ANY_ATTRIBUTE = TEQUIPMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_CONDUCTING_EQUIPMENT__DESC = TEQUIPMENT__DESC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_CONDUCTING_EQUIPMENT__NAME = TEQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>LNode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_CONDUCTING_EQUIPMENT__LNODE = TEQUIPMENT__LNODE;

	/**
	 * The feature id for the '<em><b>Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_CONDUCTING_EQUIPMENT__VIRTUAL = TEQUIPMENT__VIRTUAL;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_CONDUCTING_EQUIPMENT__TERMINAL = TEQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Equipment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_CONDUCTING_EQUIPMENT__SUB_EQUIPMENT = TEQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TAbstract Conducting Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_CONDUCTING_EQUIPMENT_FEATURE_COUNT = TEQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TAbstractDataAttributeImpl <em>TAbstract Data Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TAbstractDataAttributeImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTAbstractDataAttribute()
	 * @generated
	 */
	int TABSTRACT_DATA_ATTRIBUTE = 9;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_DATA_ATTRIBUTE__ANY = TUN_NAMING__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_DATA_ATTRIBUTE__TEXT = TUN_NAMING__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_DATA_ATTRIBUTE__PRIVATE = TUN_NAMING__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_DATA_ATTRIBUTE__ANY_ATTRIBUTE = TUN_NAMING__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_DATA_ATTRIBUTE__DESC = TUN_NAMING__DESC;

	/**
	 * The feature id for the '<em><b>Val</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_DATA_ATTRIBUTE__VAL = TUN_NAMING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>BType</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_DATA_ATTRIBUTE__BTYPE = TUN_NAMING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_DATA_ATTRIBUTE__COUNT = TUN_NAMING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_DATA_ATTRIBUTE__NAME = TUN_NAMING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>SAddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_DATA_ATTRIBUTE__SADDR = TUN_NAMING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_DATA_ATTRIBUTE__TYPE = TUN_NAMING_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Val Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_DATA_ATTRIBUTE__VAL_KIND = TUN_NAMING_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Printed Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_DATA_ATTRIBUTE__PRINTED_TYPE = TUN_NAMING_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Coder Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_DATA_ATTRIBUTE__CODER_TYPE = TUN_NAMING_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>TAbstract Data Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABSTRACT_DATA_ATTRIBUTE_FEATURE_COUNT = TUN_NAMING_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TAnyContentFromOtherNamespaceImpl <em>TAny Content From Other Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TAnyContentFromOtherNamespaceImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTAnyContentFromOtherNamespace()
	 * @generated
	 */
	int TANY_CONTENT_FROM_OTHER_NAMESPACE = 13;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANY_CONTENT_FROM_OTHER_NAMESPACE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANY_CONTENT_FROM_OTHER_NAMESPACE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANY_CONTENT_FROM_OTHER_NAMESPACE__ANY = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANY_CONTENT_FROM_OTHER_NAMESPACE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>TAny Content From Other Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANY_CONTENT_FROM_OTHER_NAMESPACE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TAccessControlImpl <em>TAccess Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TAccessControlImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTAccessControl()
	 * @generated
	 */
	int TACCESS_CONTROL = 10;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACCESS_CONTROL__MIXED = TANY_CONTENT_FROM_OTHER_NAMESPACE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACCESS_CONTROL__GROUP = TANY_CONTENT_FROM_OTHER_NAMESPACE__GROUP;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACCESS_CONTROL__ANY = TANY_CONTENT_FROM_OTHER_NAMESPACE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACCESS_CONTROL__ANY_ATTRIBUTE = TANY_CONTENT_FROM_OTHER_NAMESPACE__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>TAccess Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACCESS_CONTROL_FEATURE_COUNT = TANY_CONTENT_FROM_OTHER_NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TAccessPointImpl <em>TAccess Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TAccessPointImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTAccessPoint()
	 * @generated
	 */
	int TACCESS_POINT = 11;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACCESS_POINT__ANY = TNAMING__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACCESS_POINT__TEXT = TNAMING__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACCESS_POINT__PRIVATE = TNAMING__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACCESS_POINT__ANY_ATTRIBUTE = TNAMING__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACCESS_POINT__DESC = TNAMING__DESC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACCESS_POINT__NAME = TNAMING__NAME;

	/**
	 * The feature id for the '<em><b>Server</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACCESS_POINT__SERVER = TNAMING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>LN</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACCESS_POINT__LN = TNAMING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACCESS_POINT__CLOCK = TNAMING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Router</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACCESS_POINT__ROUTER = TNAMING_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TAccess Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACCESS_POINT_FEATURE_COUNT = TNAMING_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TAddressImpl <em>TAddress</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TAddressImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTAddress()
	 * @generated
	 */
	int TADDRESS = 12;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TADDRESS__P = 0;

	/**
	 * The number of structural features of the '<em>TAddress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TADDRESS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TAssociationImpl <em>TAssociation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TAssociationImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTAssociation()
	 * @generated
	 */
	int TASSOCIATION = 15;

	/**
	 * The feature id for the '<em><b>Association ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION__ASSOCIATION_ID = 0;

	/**
	 * The feature id for the '<em><b>Ied Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION__IED_NAME = 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION__KIND = 2;

	/**
	 * The feature id for the '<em><b>Ld Inst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION__LD_INST = 3;

	/**
	 * The feature id for the '<em><b>Ln Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION__LN_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Ln Inst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION__LN_INST = 5;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION__PREFIX = 6;

	/**
	 * The number of structural features of the '<em>TAssociation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TEquipmentContainerImpl <em>TEquipment Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TEquipmentContainerImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTEquipmentContainer()
	 * @generated
	 */
	int TEQUIPMENT_CONTAINER = 44;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEQUIPMENT_CONTAINER__ANY = TPOWER_SYSTEM_RESOURCE__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEQUIPMENT_CONTAINER__TEXT = TPOWER_SYSTEM_RESOURCE__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEQUIPMENT_CONTAINER__PRIVATE = TPOWER_SYSTEM_RESOURCE__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEQUIPMENT_CONTAINER__ANY_ATTRIBUTE = TPOWER_SYSTEM_RESOURCE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEQUIPMENT_CONTAINER__DESC = TPOWER_SYSTEM_RESOURCE__DESC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEQUIPMENT_CONTAINER__NAME = TPOWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>LNode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEQUIPMENT_CONTAINER__LNODE = TPOWER_SYSTEM_RESOURCE__LNODE;

	/**
	 * The feature id for the '<em><b>Power Transformer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEQUIPMENT_CONTAINER__POWER_TRANSFORMER = TPOWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>General Equipment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEQUIPMENT_CONTAINER__GENERAL_EQUIPMENT = TPOWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TEquipment Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEQUIPMENT_CONTAINER_FEATURE_COUNT = TPOWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TBayImpl <em>TBay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TBayImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTBay()
	 * @generated
	 */
	int TBAY = 17;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBAY__ANY = TEQUIPMENT_CONTAINER__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBAY__TEXT = TEQUIPMENT_CONTAINER__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBAY__PRIVATE = TEQUIPMENT_CONTAINER__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBAY__ANY_ATTRIBUTE = TEQUIPMENT_CONTAINER__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBAY__DESC = TEQUIPMENT_CONTAINER__DESC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBAY__NAME = TEQUIPMENT_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>LNode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBAY__LNODE = TEQUIPMENT_CONTAINER__LNODE;

	/**
	 * The feature id for the '<em><b>Power Transformer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBAY__POWER_TRANSFORMER = TEQUIPMENT_CONTAINER__POWER_TRANSFORMER;

	/**
	 * The feature id for the '<em><b>General Equipment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBAY__GENERAL_EQUIPMENT = TEQUIPMENT_CONTAINER__GENERAL_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Conducting Equipment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBAY__CONDUCTING_EQUIPMENT = TEQUIPMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connectivity Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBAY__CONNECTIVITY_NODE = TEQUIPMENT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TBay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBAY_FEATURE_COUNT = TEQUIPMENT_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TBDAImpl <em>TBDA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TBDAImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTBDA()
	 * @generated
	 */
	int TBDA = 18;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBDA__ANY = TABSTRACT_DATA_ATTRIBUTE__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBDA__TEXT = TABSTRACT_DATA_ATTRIBUTE__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBDA__PRIVATE = TABSTRACT_DATA_ATTRIBUTE__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBDA__ANY_ATTRIBUTE = TABSTRACT_DATA_ATTRIBUTE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBDA__DESC = TABSTRACT_DATA_ATTRIBUTE__DESC;

	/**
	 * The feature id for the '<em><b>Val</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBDA__VAL = TABSTRACT_DATA_ATTRIBUTE__VAL;

	/**
	 * The feature id for the '<em><b>BType</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBDA__BTYPE = TABSTRACT_DATA_ATTRIBUTE__BTYPE;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBDA__COUNT = TABSTRACT_DATA_ATTRIBUTE__COUNT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBDA__NAME = TABSTRACT_DATA_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>SAddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBDA__SADDR = TABSTRACT_DATA_ATTRIBUTE__SADDR;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBDA__TYPE = TABSTRACT_DATA_ATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Val Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBDA__VAL_KIND = TABSTRACT_DATA_ATTRIBUTE__VAL_KIND;

	/**
	 * The feature id for the '<em><b>Printed Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBDA__PRINTED_TYPE = TABSTRACT_DATA_ATTRIBUTE__PRINTED_TYPE;

	/**
	 * The feature id for the '<em><b>Coder Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBDA__CODER_TYPE = TABSTRACT_DATA_ATTRIBUTE__CODER_TYPE;

	/**
	 * The number of structural features of the '<em>TBDA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBDA_FEATURE_COUNT = TABSTRACT_DATA_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TValueWithUnitImpl <em>TValue With Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TValueWithUnitImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTValueWithUnit()
	 * @generated
	 */
	int TVALUE_WITH_UNIT = 117;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVALUE_WITH_UNIT__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVALUE_WITH_UNIT__MULTIPLIER = 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVALUE_WITH_UNIT__UNIT = 2;

	/**
	 * The number of structural features of the '<em>TValue With Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVALUE_WITH_UNIT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TBitRateInMbPerSecImpl <em>TBit Rate In Mb Per Sec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TBitRateInMbPerSecImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTBitRateInMbPerSec()
	 * @generated
	 */
	int TBIT_RATE_IN_MB_PER_SEC = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBIT_RATE_IN_MB_PER_SEC__VALUE = TVALUE_WITH_UNIT__VALUE;

	/**
	 * The feature id for the '<em><b>Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBIT_RATE_IN_MB_PER_SEC__MULTIPLIER = TVALUE_WITH_UNIT__MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBIT_RATE_IN_MB_PER_SEC__UNIT = TVALUE_WITH_UNIT__UNIT;

	/**
	 * The number of structural features of the '<em>TBit Rate In Mb Per Sec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBIT_RATE_IN_MB_PER_SEC_FEATURE_COUNT = TVALUE_WITH_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TClientLNImpl <em>TClient LN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TClientLNImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTClientLN()
	 * @generated
	 */
	int TCLIENT_LN = 20;

	/**
	 * The feature id for the '<em><b>Ied Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLIENT_LN__IED_NAME = 0;

	/**
	 * The feature id for the '<em><b>Ld Inst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLIENT_LN__LD_INST = 1;

	/**
	 * The feature id for the '<em><b>Ln Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLIENT_LN__LN_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Ln Inst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLIENT_LN__LN_INST = 3;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLIENT_LN__PREFIX = 4;

	/**
	 * The number of structural features of the '<em>TClient LN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLIENT_LN_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TClientServicesImpl <em>TClient Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TClientServicesImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTClientServices()
	 * @generated
	 */
	int TCLIENT_SERVICES = 21;

	/**
	 * The feature id for the '<em><b>Buf Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLIENT_SERVICES__BUF_REPORT = 0;

	/**
	 * The feature id for the '<em><b>Goose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLIENT_SERVICES__GOOSE = 1;

	/**
	 * The feature id for the '<em><b>Gsse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLIENT_SERVICES__GSSE = 2;

	/**
	 * The feature id for the '<em><b>Read Log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLIENT_SERVICES__READ_LOG = 3;

	/**
	 * The feature id for the '<em><b>Unbuf Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLIENT_SERVICES__UNBUF_REPORT = 4;

	/**
	 * The number of structural features of the '<em>TClient Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCLIENT_SERVICES_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TCommunicationImpl <em>TCommunication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TCommunicationImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTCommunication()
	 * @generated
	 */
	int TCOMMUNICATION = 22;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMMUNICATION__ANY = TUN_NAMING__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMMUNICATION__TEXT = TUN_NAMING__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMMUNICATION__PRIVATE = TUN_NAMING__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMMUNICATION__ANY_ATTRIBUTE = TUN_NAMING__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMMUNICATION__DESC = TUN_NAMING__DESC;

	/**
	 * The feature id for the '<em><b>Sub Network</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMMUNICATION__SUB_NETWORK = TUN_NAMING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TCommunication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMMUNICATION_FEATURE_COUNT = TUN_NAMING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TConductingEquipmentImpl <em>TConducting Equipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TConductingEquipmentImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTConductingEquipment()
	 * @generated
	 */
	int TCONDUCTING_EQUIPMENT = 23;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDUCTING_EQUIPMENT__ANY = TABSTRACT_CONDUCTING_EQUIPMENT__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDUCTING_EQUIPMENT__TEXT = TABSTRACT_CONDUCTING_EQUIPMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDUCTING_EQUIPMENT__PRIVATE = TABSTRACT_CONDUCTING_EQUIPMENT__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDUCTING_EQUIPMENT__ANY_ATTRIBUTE = TABSTRACT_CONDUCTING_EQUIPMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDUCTING_EQUIPMENT__DESC = TABSTRACT_CONDUCTING_EQUIPMENT__DESC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDUCTING_EQUIPMENT__NAME = TABSTRACT_CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>LNode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDUCTING_EQUIPMENT__LNODE = TABSTRACT_CONDUCTING_EQUIPMENT__LNODE;

	/**
	 * The feature id for the '<em><b>Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDUCTING_EQUIPMENT__VIRTUAL = TABSTRACT_CONDUCTING_EQUIPMENT__VIRTUAL;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDUCTING_EQUIPMENT__TERMINAL = TABSTRACT_CONDUCTING_EQUIPMENT__TERMINAL;

	/**
	 * The feature id for the '<em><b>Sub Equipment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDUCTING_EQUIPMENT__SUB_EQUIPMENT = TABSTRACT_CONDUCTING_EQUIPMENT__SUB_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDUCTING_EQUIPMENT__TYPE = TABSTRACT_CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TConducting Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDUCTING_EQUIPMENT_FEATURE_COUNT = TABSTRACT_CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TConfLNsImpl <em>TConf LNs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TConfLNsImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTConfLNs()
	 * @generated
	 */
	int TCONF_LNS = 24;

	/**
	 * The feature id for the '<em><b>Fix Ln Inst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONF_LNS__FIX_LN_INST = 0;

	/**
	 * The feature id for the '<em><b>Fix Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONF_LNS__FIX_PREFIX = 1;

	/**
	 * The number of structural features of the '<em>TConf LNs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONF_LNS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TConnectedAPImpl <em>TConnected AP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TConnectedAPImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTConnectedAP()
	 * @generated
	 */
	int TCONNECTED_AP = 25;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONNECTED_AP__ANY = TUN_NAMING__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONNECTED_AP__TEXT = TUN_NAMING__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONNECTED_AP__PRIVATE = TUN_NAMING__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONNECTED_AP__ANY_ATTRIBUTE = TUN_NAMING__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONNECTED_AP__DESC = TUN_NAMING__DESC;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONNECTED_AP__ADDRESS = TUN_NAMING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>GSE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONNECTED_AP__GSE = TUN_NAMING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>SMV</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONNECTED_AP__SMV = TUN_NAMING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Phys Conn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONNECTED_AP__PHYS_CONN = TUN_NAMING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ap Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONNECTED_AP__AP_NAME = TUN_NAMING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ied Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONNECTED_AP__IED_NAME = TUN_NAMING_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>TConnected AP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONNECTED_AP_FEATURE_COUNT = TUN_NAMING_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TConnectivityNodeImpl <em>TConnectivity Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TConnectivityNodeImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTConnectivityNode()
	 * @generated
	 */
	int TCONNECTIVITY_NODE = 26;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONNECTIVITY_NODE__ANY = TL_NODE_CONTAINER__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONNECTIVITY_NODE__TEXT = TL_NODE_CONTAINER__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONNECTIVITY_NODE__PRIVATE = TL_NODE_CONTAINER__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONNECTIVITY_NODE__ANY_ATTRIBUTE = TL_NODE_CONTAINER__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONNECTIVITY_NODE__DESC = TL_NODE_CONTAINER__DESC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONNECTIVITY_NODE__NAME = TL_NODE_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>LNode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONNECTIVITY_NODE__LNODE = TL_NODE_CONTAINER__LNODE;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONNECTIVITY_NODE__PATH_NAME = TL_NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TConnectivity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONNECTIVITY_NODE_FEATURE_COUNT = TL_NODE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TControlImpl <em>TControl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TControlImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTControl()
	 * @generated
	 */
	int TCONTROL = 27;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL__ANY = TNAMING__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL__TEXT = TNAMING__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL__PRIVATE = TNAMING__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL__ANY_ATTRIBUTE = TNAMING__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL__DESC = TNAMING__DESC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL__NAME = TNAMING__NAME;

	/**
	 * The feature id for the '<em><b>Dat Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL__DAT_SET = TNAMING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Control Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL__CONTROL_BLOCK = TNAMING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Set Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL__DATA_SET_REF = TNAMING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TControl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL_FEATURE_COUNT = TNAMING_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TControlBlockImpl <em>TControl Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TControlBlockImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTControlBlock()
	 * @generated
	 */
	int TCONTROL_BLOCK = 28;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL_BLOCK__ANY = TUN_NAMING__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL_BLOCK__TEXT = TUN_NAMING__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL_BLOCK__PRIVATE = TUN_NAMING__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL_BLOCK__ANY_ATTRIBUTE = TUN_NAMING__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL_BLOCK__DESC = TUN_NAMING__DESC;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL_BLOCK__ADDRESS = TUN_NAMING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cb Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL_BLOCK__CB_NAME = TUN_NAMING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ld Inst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL_BLOCK__LD_INST = TUN_NAMING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL_BLOCK__CONTROL = TUN_NAMING_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TControl Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL_BLOCK_FEATURE_COUNT = TUN_NAMING_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TControlWithIEDNameImpl <em>TControl With IED Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TControlWithIEDNameImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTControlWithIEDName()
	 * @generated
	 */
	int TCONTROL_WITH_IED_NAME = 29;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL_WITH_IED_NAME__ANY = TCONTROL__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL_WITH_IED_NAME__TEXT = TCONTROL__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL_WITH_IED_NAME__PRIVATE = TCONTROL__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL_WITH_IED_NAME__ANY_ATTRIBUTE = TCONTROL__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL_WITH_IED_NAME__DESC = TCONTROL__DESC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL_WITH_IED_NAME__NAME = TCONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Dat Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL_WITH_IED_NAME__DAT_SET = TCONTROL__DAT_SET;

	/**
	 * The feature id for the '<em><b>Control Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL_WITH_IED_NAME__CONTROL_BLOCK = TCONTROL__CONTROL_BLOCK;

	/**
	 * The feature id for the '<em><b>Data Set Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL_WITH_IED_NAME__DATA_SET_REF = TCONTROL__DATA_SET_REF;

	/**
	 * The feature id for the '<em><b>IED Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL_WITH_IED_NAME__IED_NAME = TCONTROL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conf Rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL_WITH_IED_NAME__CONF_REV = TCONTROL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TControl With IED Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL_WITH_IED_NAME_FEATURE_COUNT = TCONTROL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TControlWithTriggerOptImpl <em>TControl With Trigger Opt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TControlWithTriggerOptImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTControlWithTriggerOpt()
	 * @generated
	 */
	int TCONTROL_WITH_TRIGGER_OPT = 30;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL_WITH_TRIGGER_OPT__ANY = TCONTROL__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL_WITH_TRIGGER_OPT__TEXT = TCONTROL__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL_WITH_TRIGGER_OPT__PRIVATE = TCONTROL__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL_WITH_TRIGGER_OPT__ANY_ATTRIBUTE = TCONTROL__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL_WITH_TRIGGER_OPT__DESC = TCONTROL__DESC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL_WITH_TRIGGER_OPT__NAME = TCONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Dat Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL_WITH_TRIGGER_OPT__DAT_SET = TCONTROL__DAT_SET;

	/**
	 * The feature id for the '<em><b>Control Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL_WITH_TRIGGER_OPT__CONTROL_BLOCK = TCONTROL__CONTROL_BLOCK;

	/**
	 * The feature id for the '<em><b>Data Set Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL_WITH_TRIGGER_OPT__DATA_SET_REF = TCONTROL__DATA_SET_REF;

	/**
	 * The feature id for the '<em><b>Trg Ops</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL_WITH_TRIGGER_OPT__TRG_OPS = TCONTROL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Intg Pd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL_WITH_TRIGGER_OPT__INTG_PD = TCONTROL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TControl With Trigger Opt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTROL_WITH_TRIGGER_OPT_FEATURE_COUNT = TCONTROL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TDAImpl <em>TDA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TDAImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTDA()
	 * @generated
	 */
	int TDA = 31;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDA__ANY = TABSTRACT_DATA_ATTRIBUTE__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDA__TEXT = TABSTRACT_DATA_ATTRIBUTE__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDA__PRIVATE = TABSTRACT_DATA_ATTRIBUTE__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDA__ANY_ATTRIBUTE = TABSTRACT_DATA_ATTRIBUTE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDA__DESC = TABSTRACT_DATA_ATTRIBUTE__DESC;

	/**
	 * The feature id for the '<em><b>Val</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDA__VAL = TABSTRACT_DATA_ATTRIBUTE__VAL;

	/**
	 * The feature id for the '<em><b>BType</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDA__BTYPE = TABSTRACT_DATA_ATTRIBUTE__BTYPE;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDA__COUNT = TABSTRACT_DATA_ATTRIBUTE__COUNT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDA__NAME = TABSTRACT_DATA_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>SAddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDA__SADDR = TABSTRACT_DATA_ATTRIBUTE__SADDR;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDA__TYPE = TABSTRACT_DATA_ATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Val Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDA__VAL_KIND = TABSTRACT_DATA_ATTRIBUTE__VAL_KIND;

	/**
	 * The feature id for the '<em><b>Printed Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDA__PRINTED_TYPE = TABSTRACT_DATA_ATTRIBUTE__PRINTED_TYPE;

	/**
	 * The feature id for the '<em><b>Coder Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDA__CODER_TYPE = TABSTRACT_DATA_ATTRIBUTE__CODER_TYPE;

	/**
	 * The feature id for the '<em><b>Dchg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDA__DCHG = TABSTRACT_DATA_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dupd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDA__DUPD = TABSTRACT_DATA_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDA__FC = TABSTRACT_DATA_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Qchg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDA__QCHG = TABSTRACT_DATA_ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TDA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDA_FEATURE_COUNT = TABSTRACT_DATA_ATTRIBUTE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TDAIImpl <em>TDAI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TDAIImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTDAI()
	 * @generated
	 */
	int TDAI = 32;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDAI__ANY = TUN_NAMING__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDAI__TEXT = TUN_NAMING__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDAI__PRIVATE = TUN_NAMING__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDAI__ANY_ATTRIBUTE = TUN_NAMING__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDAI__DESC = TUN_NAMING__DESC;

	/**
	 * The feature id for the '<em><b>Val</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDAI__VAL = TUN_NAMING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDAI__IX = TUN_NAMING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDAI__NAME = TUN_NAMING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>SAddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDAI__SADDR = TUN_NAMING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Val Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDAI__VAL_KIND = TUN_NAMING_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TDAI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDAI_FEATURE_COUNT = TUN_NAMING_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TDataSetImpl <em>TData Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TDataSetImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTDataSet()
	 * @generated
	 */
	int TDATA_SET = 33;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_SET__ANY = TNAMING__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_SET__TEXT = TNAMING__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_SET__PRIVATE = TNAMING__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_SET__ANY_ATTRIBUTE = TNAMING__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_SET__DESC = TNAMING__DESC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_SET__NAME = TNAMING__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_SET__GROUP = TNAMING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>FCDA</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_SET__FCDA = TNAMING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>FCCB</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_SET__FCCB = TNAMING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Control</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_SET__CONTROL = TNAMING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ext Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_SET__EXT_REF = TNAMING_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TData Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_SET_FEATURE_COUNT = TNAMING_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TDataTypeTemplatesImpl <em>TData Type Templates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TDataTypeTemplatesImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTDataTypeTemplates()
	 * @generated
	 */
	int TDATA_TYPE_TEMPLATES = 34;

	/**
	 * The feature id for the '<em><b>LNode Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPE_TEMPLATES__LNODE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>DO Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPE_TEMPLATES__DO_TYPE = 1;

	/**
	 * The feature id for the '<em><b>DA Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPE_TEMPLATES__DA_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Enum Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPE_TEMPLATES__ENUM_TYPE = 3;

	/**
	 * The number of structural features of the '<em>TData Type Templates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_TYPE_TEMPLATES_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TIDNamingImpl <em>TID Naming</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TIDNamingImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTIDNaming()
	 * @generated
	 */
	int TID_NAMING = 55;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TID_NAMING__ANY = TBASE_ELEMENT__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TID_NAMING__TEXT = TBASE_ELEMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TID_NAMING__PRIVATE = TBASE_ELEMENT__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TID_NAMING__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TID_NAMING__DESC = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TID_NAMING__ID = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TID Naming</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TID_NAMING_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TDATypeImpl <em>TDA Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TDATypeImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTDAType()
	 * @generated
	 */
	int TDA_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDA_TYPE__ANY = TID_NAMING__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDA_TYPE__TEXT = TID_NAMING__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDA_TYPE__PRIVATE = TID_NAMING__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDA_TYPE__ANY_ATTRIBUTE = TID_NAMING__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDA_TYPE__DESC = TID_NAMING__DESC;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDA_TYPE__ID = TID_NAMING__ID;

	/**
	 * The feature id for the '<em><b>BDA</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDA_TYPE__BDA = TID_NAMING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ied Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDA_TYPE__IED_TYPE = TID_NAMING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ext Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDA_TYPE__EXT_REF = TID_NAMING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fcda</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDA_TYPE__FCDA = TID_NAMING_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TDA Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDA_TYPE_FEATURE_COUNT = TID_NAMING_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TDOImpl <em>TDO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TDOImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTDO()
	 * @generated
	 */
	int TDO = 36;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDO__ANY = TUN_NAMING__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDO__TEXT = TUN_NAMING__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDO__PRIVATE = TUN_NAMING__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDO__ANY_ATTRIBUTE = TUN_NAMING__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDO__DESC = TUN_NAMING__DESC;

	/**
	 * The feature id for the '<em><b>Access Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDO__ACCESS_CONTROL = TUN_NAMING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDO__NAME = TUN_NAMING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDO__TRANSIENT = TUN_NAMING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDO__TYPE = TUN_NAMING_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TDO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDO_FEATURE_COUNT = TUN_NAMING_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TDOIImpl <em>TDOI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TDOIImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTDOI()
	 * @generated
	 */
	int TDOI = 37;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOI__ANY = TUN_NAMING__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOI__TEXT = TUN_NAMING__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOI__PRIVATE = TUN_NAMING__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOI__ANY_ATTRIBUTE = TUN_NAMING__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOI__DESC = TUN_NAMING__DESC;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOI__GROUP = TUN_NAMING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>SDI</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOI__SDI = TUN_NAMING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>DAI</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOI__DAI = TUN_NAMING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Access Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOI__ACCESS_CONTROL = TUN_NAMING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOI__IX = TUN_NAMING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOI__NAME = TUN_NAMING_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>TDOI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOI_FEATURE_COUNT = TUN_NAMING_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TDOTypeImpl <em>TDO Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TDOTypeImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTDOType()
	 * @generated
	 */
	int TDO_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDO_TYPE__ANY = TID_NAMING__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDO_TYPE__TEXT = TID_NAMING__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDO_TYPE__PRIVATE = TID_NAMING__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDO_TYPE__ANY_ATTRIBUTE = TID_NAMING__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDO_TYPE__DESC = TID_NAMING__DESC;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDO_TYPE__ID = TID_NAMING__ID;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDO_TYPE__GROUP = TID_NAMING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>SDO</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDO_TYPE__SDO = TID_NAMING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>DA</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDO_TYPE__DA = TID_NAMING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cdc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDO_TYPE__CDC = TID_NAMING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ied Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDO_TYPE__IED_TYPE = TID_NAMING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ext Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDO_TYPE__EXT_REF = TID_NAMING_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fcda</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDO_TYPE__FCDA = TID_NAMING_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>TDO Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDO_TYPE_FEATURE_COUNT = TID_NAMING_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TDurationInMilliSecImpl <em>TDuration In Milli Sec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TDurationInMilliSecImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTDurationInMilliSec()
	 * @generated
	 */
	int TDURATION_IN_MILLI_SEC = 39;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDURATION_IN_MILLI_SEC__VALUE = TVALUE_WITH_UNIT__VALUE;

	/**
	 * The feature id for the '<em><b>Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDURATION_IN_MILLI_SEC__MULTIPLIER = TVALUE_WITH_UNIT__MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDURATION_IN_MILLI_SEC__UNIT = TVALUE_WITH_UNIT__UNIT;

	/**
	 * The number of structural features of the '<em>TDuration In Milli Sec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDURATION_IN_MILLI_SEC_FEATURE_COUNT = TVALUE_WITH_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TDurationInSecImpl <em>TDuration In Sec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TDurationInSecImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTDurationInSec()
	 * @generated
	 */
	int TDURATION_IN_SEC = 40;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDURATION_IN_SEC__VALUE = TVALUE_WITH_UNIT__VALUE;

	/**
	 * The feature id for the '<em><b>Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDURATION_IN_SEC__MULTIPLIER = TVALUE_WITH_UNIT__MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDURATION_IN_SEC__UNIT = TVALUE_WITH_UNIT__UNIT;

	/**
	 * The number of structural features of the '<em>TDuration In Sec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDURATION_IN_SEC_FEATURE_COUNT = TVALUE_WITH_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TEnumTypeImpl <em>TEnum Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TEnumTypeImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTEnumType()
	 * @generated
	 */
	int TENUM_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM_TYPE__ANY = TID_NAMING__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM_TYPE__TEXT = TID_NAMING__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM_TYPE__PRIVATE = TID_NAMING__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM_TYPE__ANY_ATTRIBUTE = TID_NAMING__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM_TYPE__DESC = TID_NAMING__DESC;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM_TYPE__ID = TID_NAMING__ID;

	/**
	 * The feature id for the '<em><b>Enum Val</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM_TYPE__ENUM_VAL = TID_NAMING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TEnum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM_TYPE_FEATURE_COUNT = TID_NAMING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TEnumValImpl <em>TEnum Val</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TEnumValImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTEnumVal()
	 * @generated
	 */
	int TENUM_VAL = 42;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM_VAL__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Ord</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM_VAL__ORD = 1;

	/**
	 * The number of structural features of the '<em>TEnum Val</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM_VAL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TExtRefImpl <em>TExt Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TExtRefImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTExtRef()
	 * @generated
	 */
	int TEXT_REF = 45;

	/**
	 * The feature id for the '<em><b>Da Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REF__DA_NAME = 0;

	/**
	 * The feature id for the '<em><b>Do Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REF__DO_NAME = 1;

	/**
	 * The feature id for the '<em><b>Ied Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REF__IED_NAME = 2;

	/**
	 * The feature id for the '<em><b>Int Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REF__INT_ADDR = 3;

	/**
	 * The feature id for the '<em><b>Ld Inst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REF__LD_INST = 4;

	/**
	 * The feature id for the '<em><b>Ln Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REF__LN_CLASS = 5;

	/**
	 * The feature id for the '<em><b>Ln Inst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REF__LN_INST = 6;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REF__PREFIX = 7;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REF__DATA_SET = 8;

	/**
	 * The feature id for the '<em><b>Do Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REF__DO_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Da Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REF__DA_TYPE = 10;

	/**
	 * The number of structural features of the '<em>TExt Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REF_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TFCCBImpl <em>TFCCB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TFCCBImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTFCCB()
	 * @generated
	 */
	int TFCCB = 46;

	/**
	 * The feature id for the '<em><b>Cb Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFCCB__CB_NAME = 0;

	/**
	 * The feature id for the '<em><b>Da Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFCCB__DA_NAME = 1;

	/**
	 * The feature id for the '<em><b>Fc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFCCB__FC = 2;

	/**
	 * The feature id for the '<em><b>Ld Inst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFCCB__LD_INST = 3;

	/**
	 * The feature id for the '<em><b>Ln Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFCCB__LN_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Ln Inst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFCCB__LN_INST = 5;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFCCB__PREFIX = 6;

	/**
	 * The number of structural features of the '<em>TFCCB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFCCB_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TFCDAImpl <em>TFCDA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TFCDAImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTFCDA()
	 * @generated
	 */
	int TFCDA = 47;

	/**
	 * The feature id for the '<em><b>Da Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFCDA__DA_NAME = 0;

	/**
	 * The feature id for the '<em><b>Do Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFCDA__DO_NAME = 1;

	/**
	 * The feature id for the '<em><b>Fc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFCDA__FC = 2;

	/**
	 * The feature id for the '<em><b>Ld Inst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFCDA__LD_INST = 3;

	/**
	 * The feature id for the '<em><b>Ln Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFCDA__LN_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Ln Inst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFCDA__LN_INST = 5;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFCDA__PREFIX = 6;

	/**
	 * The feature id for the '<em><b>Do Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFCDA__DO_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Da Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFCDA__DA_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Printed Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFCDA__PRINTED_TYPE = 9;

	/**
	 * The feature id for the '<em><b>BType</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFCDA__BTYPE = 10;

	/**
	 * The feature id for the '<em><b>Coder Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFCDA__CODER_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFCDA__VARIABLE_NAME = 12;

	/**
	 * The feature id for the '<em><b>Ln Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFCDA__LN_TYPE = 13;

	/**
	 * The number of structural features of the '<em>TFCDA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFCDA_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TFunctionImpl <em>TFunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TFunctionImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTFunction()
	 * @generated
	 */
	int TFUNCTION = 48;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION__ANY = TPOWER_SYSTEM_RESOURCE__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION__TEXT = TPOWER_SYSTEM_RESOURCE__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION__PRIVATE = TPOWER_SYSTEM_RESOURCE__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION__ANY_ATTRIBUTE = TPOWER_SYSTEM_RESOURCE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION__DESC = TPOWER_SYSTEM_RESOURCE__DESC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION__NAME = TPOWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>LNode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION__LNODE = TPOWER_SYSTEM_RESOURCE__LNODE;

	/**
	 * The feature id for the '<em><b>Sub Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION__SUB_FUNCTION = TPOWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>General Equipment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION__GENERAL_EQUIPMENT = TPOWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TFunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_FEATURE_COUNT = TPOWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TGeneralEquipmentImpl <em>TGeneral Equipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TGeneralEquipmentImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTGeneralEquipment()
	 * @generated
	 */
	int TGENERAL_EQUIPMENT = 49;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_EQUIPMENT__ANY = TEQUIPMENT__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_EQUIPMENT__TEXT = TEQUIPMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_EQUIPMENT__PRIVATE = TEQUIPMENT__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_EQUIPMENT__ANY_ATTRIBUTE = TEQUIPMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_EQUIPMENT__DESC = TEQUIPMENT__DESC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_EQUIPMENT__NAME = TEQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>LNode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_EQUIPMENT__LNODE = TEQUIPMENT__LNODE;

	/**
	 * The feature id for the '<em><b>Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_EQUIPMENT__VIRTUAL = TEQUIPMENT__VIRTUAL;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_EQUIPMENT__TYPE = TEQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TGeneral Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGENERAL_EQUIPMENT_FEATURE_COUNT = TEQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TGSEImpl <em>TGSE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TGSEImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTGSE()
	 * @generated
	 */
	int TGSE = 50;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGSE__ANY = TCONTROL_BLOCK__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGSE__TEXT = TCONTROL_BLOCK__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGSE__PRIVATE = TCONTROL_BLOCK__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGSE__ANY_ATTRIBUTE = TCONTROL_BLOCK__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGSE__DESC = TCONTROL_BLOCK__DESC;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGSE__ADDRESS = TCONTROL_BLOCK__ADDRESS;

	/**
	 * The feature id for the '<em><b>Cb Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGSE__CB_NAME = TCONTROL_BLOCK__CB_NAME;

	/**
	 * The feature id for the '<em><b>Ld Inst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGSE__LD_INST = TCONTROL_BLOCK__LD_INST;

	/**
	 * The feature id for the '<em><b>Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGSE__CONTROL = TCONTROL_BLOCK__CONTROL;

	/**
	 * The feature id for the '<em><b>Min Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGSE__MIN_TIME = TCONTROL_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGSE__MAX_TIME = TCONTROL_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TGSE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGSE_FEATURE_COUNT = TCONTROL_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TGSEControlImpl <em>TGSE Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TGSEControlImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTGSEControl()
	 * @generated
	 */
	int TGSE_CONTROL = 51;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGSE_CONTROL__ANY = TCONTROL_WITH_IED_NAME__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGSE_CONTROL__TEXT = TCONTROL_WITH_IED_NAME__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGSE_CONTROL__PRIVATE = TCONTROL_WITH_IED_NAME__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGSE_CONTROL__ANY_ATTRIBUTE = TCONTROL_WITH_IED_NAME__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGSE_CONTROL__DESC = TCONTROL_WITH_IED_NAME__DESC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGSE_CONTROL__NAME = TCONTROL_WITH_IED_NAME__NAME;

	/**
	 * The feature id for the '<em><b>Dat Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGSE_CONTROL__DAT_SET = TCONTROL_WITH_IED_NAME__DAT_SET;

	/**
	 * The feature id for the '<em><b>Control Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGSE_CONTROL__CONTROL_BLOCK = TCONTROL_WITH_IED_NAME__CONTROL_BLOCK;

	/**
	 * The feature id for the '<em><b>Data Set Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGSE_CONTROL__DATA_SET_REF = TCONTROL_WITH_IED_NAME__DATA_SET_REF;

	/**
	 * The feature id for the '<em><b>IED Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGSE_CONTROL__IED_NAME = TCONTROL_WITH_IED_NAME__IED_NAME;

	/**
	 * The feature id for the '<em><b>Conf Rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGSE_CONTROL__CONF_REV = TCONTROL_WITH_IED_NAME__CONF_REV;

	/**
	 * The feature id for the '<em><b>App ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGSE_CONTROL__APP_ID = TCONTROL_WITH_IED_NAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGSE_CONTROL__TYPE = TCONTROL_WITH_IED_NAME_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TGSE Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGSE_CONTROL_FEATURE_COUNT = TCONTROL_WITH_IED_NAME_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TServiceSettingsImpl <em>TService Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TServiceSettingsImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTServiceSettings()
	 * @generated
	 */
	int TSERVICE_SETTINGS = 97;

	/**
	 * The feature id for the '<em><b>Cb Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_SETTINGS__CB_NAME = 0;

	/**
	 * The feature id for the '<em><b>Dat Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_SETTINGS__DAT_SET = 1;

	/**
	 * The number of structural features of the '<em>TService Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_SETTINGS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TGSESettingsImpl <em>TGSE Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TGSESettingsImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTGSESettings()
	 * @generated
	 */
	int TGSE_SETTINGS = 52;

	/**
	 * The feature id for the '<em><b>Cb Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGSE_SETTINGS__CB_NAME = TSERVICE_SETTINGS__CB_NAME;

	/**
	 * The feature id for the '<em><b>Dat Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGSE_SETTINGS__DAT_SET = TSERVICE_SETTINGS__DAT_SET;

	/**
	 * The feature id for the '<em><b>App ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGSE_SETTINGS__APP_ID = TSERVICE_SETTINGS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGSE_SETTINGS__DATA_LABEL = TSERVICE_SETTINGS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TGSE Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGSE_SETTINGS_FEATURE_COUNT = TSERVICE_SETTINGS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.THeaderImpl <em>THeader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.THeaderImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTHeader()
	 * @generated
	 */
	int THEADER = 53;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEADER__TEXT = 0;

	/**
	 * The feature id for the '<em><b>History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEADER__HISTORY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEADER__ID = 2;

	/**
	 * The feature id for the '<em><b>Name Structure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEADER__NAME_STRUCTURE = 3;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEADER__REVISION = 4;

	/**
	 * The feature id for the '<em><b>Tool ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEADER__TOOL_ID = 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEADER__VERSION = 6;

	/**
	 * The number of structural features of the '<em>THeader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEADER_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.THitemImpl <em>THitem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.THitemImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTHitem()
	 * @generated
	 */
	int THITEM = 54;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THITEM__MIXED = TANY_CONTENT_FROM_OTHER_NAMESPACE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THITEM__GROUP = TANY_CONTENT_FROM_OTHER_NAMESPACE__GROUP;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THITEM__ANY = TANY_CONTENT_FROM_OTHER_NAMESPACE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THITEM__ANY_ATTRIBUTE = TANY_CONTENT_FROM_OTHER_NAMESPACE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THITEM__REVISION = TANY_CONTENT_FROM_OTHER_NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THITEM__VERSION = TANY_CONTENT_FROM_OTHER_NAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>What</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THITEM__WHAT = TANY_CONTENT_FROM_OTHER_NAMESPACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THITEM__WHEN = TANY_CONTENT_FROM_OTHER_NAMESPACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Who</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THITEM__WHO = TANY_CONTENT_FROM_OTHER_NAMESPACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Why</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THITEM__WHY = TANY_CONTENT_FROM_OTHER_NAMESPACE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>THitem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THITEM_FEATURE_COUNT = TANY_CONTENT_FROM_OTHER_NAMESPACE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TIEDImpl <em>TIED</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TIEDImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTIED()
	 * @generated
	 */
	int TIED = 56;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIED__ANY = TNAMING__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIED__TEXT = TNAMING__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIED__PRIVATE = TNAMING__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIED__ANY_ATTRIBUTE = TNAMING__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIED__DESC = TNAMING__DESC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIED__NAME = TNAMING__NAME;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIED__SERVICES = TNAMING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIED__ACCESS_POINT = TNAMING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Config Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIED__CONFIG_VERSION = TNAMING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIED__MANUFACTURER = TNAMING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIED__TYPE = TNAMING_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TIED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIED_FEATURE_COUNT = TNAMING_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TInputsImpl <em>TInputs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TInputsImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTInputs()
	 * @generated
	 */
	int TINPUTS = 57;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUTS__ANY = TUN_NAMING__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUTS__TEXT = TUN_NAMING__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUTS__PRIVATE = TUN_NAMING__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUTS__ANY_ATTRIBUTE = TUN_NAMING__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUTS__DESC = TUN_NAMING__DESC;

	/**
	 * The feature id for the '<em><b>Ext Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUTS__EXT_REF = TUN_NAMING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TInputs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUTS_FEATURE_COUNT = TUN_NAMING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TLDeviceImpl <em>TL Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TLDeviceImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTLDevice()
	 * @generated
	 */
	int TL_DEVICE = 58;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_DEVICE__ANY = TUN_NAMING__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_DEVICE__TEXT = TUN_NAMING__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_DEVICE__PRIVATE = TUN_NAMING__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_DEVICE__ANY_ATTRIBUTE = TUN_NAMING__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_DEVICE__DESC = TUN_NAMING__DESC;

	/**
	 * The feature id for the '<em><b>LN0</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_DEVICE__LN0 = TUN_NAMING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>LN</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_DEVICE__LN = TUN_NAMING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Access Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_DEVICE__ACCESS_CONTROL = TUN_NAMING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_DEVICE__INST = TUN_NAMING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ld Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_DEVICE__LD_NAME = TUN_NAMING_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TL Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_DEVICE_FEATURE_COUNT = TUN_NAMING_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TLNImpl <em>TLN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TLNImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTLN()
	 * @generated
	 */
	int TLN = 59;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLN__ANY = TANY_LN__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLN__TEXT = TANY_LN__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLN__PRIVATE = TANY_LN__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLN__ANY_ATTRIBUTE = TANY_LN__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLN__DESC = TANY_LN__DESC;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLN__DATA_SET = TANY_LN__DATA_SET;

	/**
	 * The feature id for the '<em><b>Report Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLN__REPORT_CONTROL = TANY_LN__REPORT_CONTROL;

	/**
	 * The feature id for the '<em><b>Log Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLN__LOG_CONTROL = TANY_LN__LOG_CONTROL;

	/**
	 * The feature id for the '<em><b>DOI</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLN__DOI = TANY_LN__DOI;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLN__INPUTS = TANY_LN__INPUTS;

	/**
	 * The feature id for the '<em><b>Ln Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLN__LN_TYPE = TANY_LN__LN_TYPE;

	/**
	 * The feature id for the '<em><b>Inst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLN__INST = TANY_LN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ln Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLN__LN_CLASS = TANY_LN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLN__PREFIX = TANY_LN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TLN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLN_FEATURE_COUNT = TANY_LN_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TLNodeImpl <em>TL Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TLNodeImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTLNode()
	 * @generated
	 */
	int TL_NODE = 61;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_NODE__ANY = TUN_NAMING__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_NODE__TEXT = TUN_NAMING__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_NODE__PRIVATE = TUN_NAMING__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_NODE__ANY_ATTRIBUTE = TUN_NAMING__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_NODE__DESC = TUN_NAMING__DESC;

	/**
	 * The feature id for the '<em><b>Ied Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_NODE__IED_NAME = TUN_NAMING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ld Inst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_NODE__LD_INST = TUN_NAMING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ln Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_NODE__LN_CLASS = TUN_NAMING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ln Inst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_NODE__LN_INST = TUN_NAMING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ln Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_NODE__LN_TYPE = TUN_NAMING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_NODE__PREFIX = TUN_NAMING_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>TL Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_NODE_FEATURE_COUNT = TUN_NAMING_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TLNodeTypeImpl <em>TL Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TLNodeTypeImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTLNodeType()
	 * @generated
	 */
	int TL_NODE_TYPE = 63;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_NODE_TYPE__ANY = TID_NAMING__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_NODE_TYPE__TEXT = TID_NAMING__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_NODE_TYPE__PRIVATE = TID_NAMING__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_NODE_TYPE__ANY_ATTRIBUTE = TID_NAMING__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_NODE_TYPE__DESC = TID_NAMING__DESC;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_NODE_TYPE__ID = TID_NAMING__ID;

	/**
	 * The feature id for the '<em><b>DO</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_NODE_TYPE__DO = TID_NAMING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ied Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_NODE_TYPE__IED_TYPE = TID_NAMING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ln Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_NODE_TYPE__LN_CLASS = TID_NAMING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TL Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_NODE_TYPE_FEATURE_COUNT = TID_NAMING_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TLogImpl <em>TLog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TLogImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTLog()
	 * @generated
	 */
	int TLOG = 64;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOG__MIXED = TANY_CONTENT_FROM_OTHER_NAMESPACE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOG__GROUP = TANY_CONTENT_FROM_OTHER_NAMESPACE__GROUP;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOG__ANY = TANY_CONTENT_FROM_OTHER_NAMESPACE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOG__ANY_ATTRIBUTE = TANY_CONTENT_FROM_OTHER_NAMESPACE__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>TLog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOG_FEATURE_COUNT = TANY_CONTENT_FROM_OTHER_NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TLogControlImpl <em>TLog Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TLogControlImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTLogControl()
	 * @generated
	 */
	int TLOG_CONTROL = 65;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOG_CONTROL__ANY = TCONTROL_WITH_TRIGGER_OPT__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOG_CONTROL__TEXT = TCONTROL_WITH_TRIGGER_OPT__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOG_CONTROL__PRIVATE = TCONTROL_WITH_TRIGGER_OPT__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOG_CONTROL__ANY_ATTRIBUTE = TCONTROL_WITH_TRIGGER_OPT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOG_CONTROL__DESC = TCONTROL_WITH_TRIGGER_OPT__DESC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOG_CONTROL__NAME = TCONTROL_WITH_TRIGGER_OPT__NAME;

	/**
	 * The feature id for the '<em><b>Dat Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOG_CONTROL__DAT_SET = TCONTROL_WITH_TRIGGER_OPT__DAT_SET;

	/**
	 * The feature id for the '<em><b>Control Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOG_CONTROL__CONTROL_BLOCK = TCONTROL_WITH_TRIGGER_OPT__CONTROL_BLOCK;

	/**
	 * The feature id for the '<em><b>Data Set Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOG_CONTROL__DATA_SET_REF = TCONTROL_WITH_TRIGGER_OPT__DATA_SET_REF;

	/**
	 * The feature id for the '<em><b>Trg Ops</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOG_CONTROL__TRG_OPS = TCONTROL_WITH_TRIGGER_OPT__TRG_OPS;

	/**
	 * The feature id for the '<em><b>Intg Pd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOG_CONTROL__INTG_PD = TCONTROL_WITH_TRIGGER_OPT__INTG_PD;

	/**
	 * The feature id for the '<em><b>Log Ena</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOG_CONTROL__LOG_ENA = TCONTROL_WITH_TRIGGER_OPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Log Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOG_CONTROL__LOG_NAME = TCONTROL_WITH_TRIGGER_OPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reason Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOG_CONTROL__REASON_CODE = TCONTROL_WITH_TRIGGER_OPT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TLog Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOG_CONTROL_FEATURE_COUNT = TCONTROL_WITH_TRIGGER_OPT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TLogSettingsImpl <em>TLog Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TLogSettingsImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTLogSettings()
	 * @generated
	 */
	int TLOG_SETTINGS = 66;

	/**
	 * The feature id for the '<em><b>Cb Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOG_SETTINGS__CB_NAME = TSERVICE_SETTINGS__CB_NAME;

	/**
	 * The feature id for the '<em><b>Dat Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOG_SETTINGS__DAT_SET = TSERVICE_SETTINGS__DAT_SET;

	/**
	 * The feature id for the '<em><b>Intg Pd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOG_SETTINGS__INTG_PD = TSERVICE_SETTINGS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Log Ena</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOG_SETTINGS__LOG_ENA = TSERVICE_SETTINGS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trg Ops</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOG_SETTINGS__TRG_OPS = TSERVICE_SETTINGS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TLog Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOG_SETTINGS_FEATURE_COUNT = TSERVICE_SETTINGS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TPImpl <em>TP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TPImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTP()
	 * @generated
	 */
	int TP = 68;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TP__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TP__TYPE = 1;

	/**
	 * The number of structural features of the '<em>TP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TPAPPIDImpl <em>TPAPPID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TPAPPIDImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPAPPID()
	 * @generated
	 */
	int TPAPPID = 69;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPAPPID__VALUE = TP__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPAPPID__TYPE = TP__TYPE;

	/**
	 * The number of structural features of the '<em>TPAPPID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPAPPID_FEATURE_COUNT = TP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TPhysConnImpl <em>TPhys Conn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TPhysConnImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPhysConn()
	 * @generated
	 */
	int TPHYS_CONN = 70;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPHYS_CONN__P = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPHYS_CONN__TYPE = 1;

	/**
	 * The number of structural features of the '<em>TPhys Conn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPHYS_CONN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TPIPImpl <em>TPIP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TPIPImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPIP()
	 * @generated
	 */
	int TPIP = 71;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPIP__VALUE = TP__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPIP__TYPE = TP__TYPE;

	/**
	 * The number of structural features of the '<em>TPIP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPIP_FEATURE_COUNT = TP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TPIPGATEWAYImpl <em>TPIPGATEWAY</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TPIPGATEWAYImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPIPGATEWAY()
	 * @generated
	 */
	int TPIPGATEWAY = 72;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPIPGATEWAY__VALUE = TP__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPIPGATEWAY__TYPE = TP__TYPE;

	/**
	 * The number of structural features of the '<em>TPIPGATEWAY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPIPGATEWAY_FEATURE_COUNT = TP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TPIPSUBNETImpl <em>TPIPSUBNET</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TPIPSUBNETImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPIPSUBNET()
	 * @generated
	 */
	int TPIPSUBNET = 73;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPIPSUBNET__VALUE = TP__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPIPSUBNET__TYPE = TP__TYPE;

	/**
	 * The number of structural features of the '<em>TPIPSUBNET</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPIPSUBNET_FEATURE_COUNT = TP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TPMACAddressImpl <em>TPMAC Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TPMACAddressImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPMACAddress()
	 * @generated
	 */
	int TPMAC_ADDRESS = 74;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPMAC_ADDRESS__VALUE = TP__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPMAC_ADDRESS__TYPE = TP__TYPE;

	/**
	 * The number of structural features of the '<em>TPMAC Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPMAC_ADDRESS_FEATURE_COUNT = TP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TPOSIAEInvokeImpl <em>TPOSIAE Invoke</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TPOSIAEInvokeImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPOSIAEInvoke()
	 * @generated
	 */
	int TPOSIAE_INVOKE = 75;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOSIAE_INVOKE__VALUE = TP__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOSIAE_INVOKE__TYPE = TP__TYPE;

	/**
	 * The number of structural features of the '<em>TPOSIAE Invoke</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOSIAE_INVOKE_FEATURE_COUNT = TP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TPOSIAEQualifierImpl <em>TPOSIAE Qualifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TPOSIAEQualifierImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPOSIAEQualifier()
	 * @generated
	 */
	int TPOSIAE_QUALIFIER = 76;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOSIAE_QUALIFIER__VALUE = TP__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOSIAE_QUALIFIER__TYPE = TP__TYPE;

	/**
	 * The number of structural features of the '<em>TPOSIAE Qualifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOSIAE_QUALIFIER_FEATURE_COUNT = TP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TPOSIAPInvokeImpl <em>TPOSIAP Invoke</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TPOSIAPInvokeImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPOSIAPInvoke()
	 * @generated
	 */
	int TPOSIAP_INVOKE = 77;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOSIAP_INVOKE__VALUE = TP__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOSIAP_INVOKE__TYPE = TP__TYPE;

	/**
	 * The number of structural features of the '<em>TPOSIAP Invoke</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOSIAP_INVOKE_FEATURE_COUNT = TP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TPOSIAPTitleImpl <em>TPOSIAP Title</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TPOSIAPTitleImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPOSIAPTitle()
	 * @generated
	 */
	int TPOSIAP_TITLE = 78;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOSIAP_TITLE__VALUE = TP__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOSIAP_TITLE__TYPE = TP__TYPE;

	/**
	 * The number of structural features of the '<em>TPOSIAP Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOSIAP_TITLE_FEATURE_COUNT = TP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TPOSINSAPImpl <em>TPOSINSAP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TPOSINSAPImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPOSINSAP()
	 * @generated
	 */
	int TPOSINSAP = 79;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOSINSAP__VALUE = TP__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOSINSAP__TYPE = TP__TYPE;

	/**
	 * The number of structural features of the '<em>TPOSINSAP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOSINSAP_FEATURE_COUNT = TP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TPOSIPSELImpl <em>TPOSIPSEL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TPOSIPSELImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPOSIPSEL()
	 * @generated
	 */
	int TPOSIPSEL = 80;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOSIPSEL__VALUE = TP__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOSIPSEL__TYPE = TP__TYPE;

	/**
	 * The number of structural features of the '<em>TPOSIPSEL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOSIPSEL_FEATURE_COUNT = TP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TPOSISSELImpl <em>TPOSISSEL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TPOSISSELImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPOSISSEL()
	 * @generated
	 */
	int TPOSISSEL = 81;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOSISSEL__VALUE = TP__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOSISSEL__TYPE = TP__TYPE;

	/**
	 * The number of structural features of the '<em>TPOSISSEL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOSISSEL_FEATURE_COUNT = TP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TPOSITSELImpl <em>TPOSITSEL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TPOSITSELImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPOSITSEL()
	 * @generated
	 */
	int TPOSITSEL = 82;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOSITSEL__VALUE = TP__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOSITSEL__TYPE = TP__TYPE;

	/**
	 * The number of structural features of the '<em>TPOSITSEL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOSITSEL_FEATURE_COUNT = TP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TPowerTransformerImpl <em>TPower Transformer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TPowerTransformerImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPowerTransformer()
	 * @generated
	 */
	int TPOWER_TRANSFORMER = 84;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOWER_TRANSFORMER__ANY = TEQUIPMENT__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOWER_TRANSFORMER__TEXT = TEQUIPMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOWER_TRANSFORMER__PRIVATE = TEQUIPMENT__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOWER_TRANSFORMER__ANY_ATTRIBUTE = TEQUIPMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOWER_TRANSFORMER__DESC = TEQUIPMENT__DESC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOWER_TRANSFORMER__NAME = TEQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>LNode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOWER_TRANSFORMER__LNODE = TEQUIPMENT__LNODE;

	/**
	 * The feature id for the '<em><b>Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOWER_TRANSFORMER__VIRTUAL = TEQUIPMENT__VIRTUAL;

	/**
	 * The feature id for the '<em><b>Transformer Winding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOWER_TRANSFORMER__TRANSFORMER_WINDING = TEQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOWER_TRANSFORMER__TYPE = TEQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TPower Transformer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOWER_TRANSFORMER_FEATURE_COUNT = TEQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TPrivateImpl <em>TPrivate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TPrivateImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPrivate()
	 * @generated
	 */
	int TPRIVATE = 85;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRIVATE__MIXED = TANY_CONTENT_FROM_OTHER_NAMESPACE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRIVATE__GROUP = TANY_CONTENT_FROM_OTHER_NAMESPACE__GROUP;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRIVATE__ANY = TANY_CONTENT_FROM_OTHER_NAMESPACE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRIVATE__ANY_ATTRIBUTE = TANY_CONTENT_FROM_OTHER_NAMESPACE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRIVATE__SOURCE = TANY_CONTENT_FROM_OTHER_NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRIVATE__TYPE = TANY_CONTENT_FROM_OTHER_NAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TPrivate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRIVATE_FEATURE_COUNT = TANY_CONTENT_FROM_OTHER_NAMESPACE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TPVLANIDImpl <em>TPVLANID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TPVLANIDImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPVLANID()
	 * @generated
	 */
	int TPVLANID = 86;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPVLANID__VALUE = TP__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPVLANID__TYPE = TP__TYPE;

	/**
	 * The number of structural features of the '<em>TPVLANID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPVLANID_FEATURE_COUNT = TP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TPVLANPRIORITYImpl <em>TPVLANPRIORITY</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TPVLANPRIORITYImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPVLANPRIORITY()
	 * @generated
	 */
	int TPVLANPRIORITY = 87;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPVLANPRIORITY__VALUE = TP__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPVLANPRIORITY__TYPE = TP__TYPE;

	/**
	 * The number of structural features of the '<em>TPVLANPRIORITY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPVLANPRIORITY_FEATURE_COUNT = TP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TReportControlImpl <em>TReport Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TReportControlImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTReportControl()
	 * @generated
	 */
	int TREPORT_CONTROL = 88;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPORT_CONTROL__ANY = TCONTROL_WITH_TRIGGER_OPT__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPORT_CONTROL__TEXT = TCONTROL_WITH_TRIGGER_OPT__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPORT_CONTROL__PRIVATE = TCONTROL_WITH_TRIGGER_OPT__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPORT_CONTROL__ANY_ATTRIBUTE = TCONTROL_WITH_TRIGGER_OPT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPORT_CONTROL__DESC = TCONTROL_WITH_TRIGGER_OPT__DESC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPORT_CONTROL__NAME = TCONTROL_WITH_TRIGGER_OPT__NAME;

	/**
	 * The feature id for the '<em><b>Dat Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPORT_CONTROL__DAT_SET = TCONTROL_WITH_TRIGGER_OPT__DAT_SET;

	/**
	 * The feature id for the '<em><b>Control Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPORT_CONTROL__CONTROL_BLOCK = TCONTROL_WITH_TRIGGER_OPT__CONTROL_BLOCK;

	/**
	 * The feature id for the '<em><b>Data Set Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPORT_CONTROL__DATA_SET_REF = TCONTROL_WITH_TRIGGER_OPT__DATA_SET_REF;

	/**
	 * The feature id for the '<em><b>Trg Ops</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPORT_CONTROL__TRG_OPS = TCONTROL_WITH_TRIGGER_OPT__TRG_OPS;

	/**
	 * The feature id for the '<em><b>Intg Pd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPORT_CONTROL__INTG_PD = TCONTROL_WITH_TRIGGER_OPT__INTG_PD;

	/**
	 * The feature id for the '<em><b>Opt Fields</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPORT_CONTROL__OPT_FIELDS = TCONTROL_WITH_TRIGGER_OPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rpt Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPORT_CONTROL__RPT_ENABLED = TCONTROL_WITH_TRIGGER_OPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Buffered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPORT_CONTROL__BUFFERED = TCONTROL_WITH_TRIGGER_OPT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Buf Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPORT_CONTROL__BUF_TIME = TCONTROL_WITH_TRIGGER_OPT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Conf Rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPORT_CONTROL__CONF_REV = TCONTROL_WITH_TRIGGER_OPT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rpt ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPORT_CONTROL__RPT_ID = TCONTROL_WITH_TRIGGER_OPT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>TReport Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPORT_CONTROL_FEATURE_COUNT = TCONTROL_WITH_TRIGGER_OPT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TReportSettingsImpl <em>TReport Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TReportSettingsImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTReportSettings()
	 * @generated
	 */
	int TREPORT_SETTINGS = 89;

	/**
	 * The feature id for the '<em><b>Cb Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPORT_SETTINGS__CB_NAME = TSERVICE_SETTINGS__CB_NAME;

	/**
	 * The feature id for the '<em><b>Dat Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPORT_SETTINGS__DAT_SET = TSERVICE_SETTINGS__DAT_SET;

	/**
	 * The feature id for the '<em><b>Buf Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPORT_SETTINGS__BUF_TIME = TSERVICE_SETTINGS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Intg Pd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPORT_SETTINGS__INTG_PD = TSERVICE_SETTINGS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Opt Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPORT_SETTINGS__OPT_FIELDS = TSERVICE_SETTINGS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rpt ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPORT_SETTINGS__RPT_ID = TSERVICE_SETTINGS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Trg Ops</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPORT_SETTINGS__TRG_OPS = TSERVICE_SETTINGS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TReport Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPORT_SETTINGS_FEATURE_COUNT = TSERVICE_SETTINGS_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TRptEnabledImpl <em>TRpt Enabled</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TRptEnabledImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTRptEnabled()
	 * @generated
	 */
	int TRPT_ENABLED = 90;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRPT_ENABLED__ANY = TUN_NAMING__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRPT_ENABLED__TEXT = TUN_NAMING__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRPT_ENABLED__PRIVATE = TUN_NAMING__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRPT_ENABLED__ANY_ATTRIBUTE = TUN_NAMING__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRPT_ENABLED__DESC = TUN_NAMING__DESC;

	/**
	 * The feature id for the '<em><b>Client LN</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRPT_ENABLED__CLIENT_LN = TUN_NAMING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRPT_ENABLED__MAX = TUN_NAMING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TRpt Enabled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRPT_ENABLED_FEATURE_COUNT = TUN_NAMING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TSampledValueControlImpl <em>TSampled Value Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TSampledValueControlImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTSampledValueControl()
	 * @generated
	 */
	int TSAMPLED_VALUE_CONTROL = 91;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSAMPLED_VALUE_CONTROL__ANY = TCONTROL_WITH_IED_NAME__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSAMPLED_VALUE_CONTROL__TEXT = TCONTROL_WITH_IED_NAME__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSAMPLED_VALUE_CONTROL__PRIVATE = TCONTROL_WITH_IED_NAME__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSAMPLED_VALUE_CONTROL__ANY_ATTRIBUTE = TCONTROL_WITH_IED_NAME__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSAMPLED_VALUE_CONTROL__DESC = TCONTROL_WITH_IED_NAME__DESC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSAMPLED_VALUE_CONTROL__NAME = TCONTROL_WITH_IED_NAME__NAME;

	/**
	 * The feature id for the '<em><b>Dat Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSAMPLED_VALUE_CONTROL__DAT_SET = TCONTROL_WITH_IED_NAME__DAT_SET;

	/**
	 * The feature id for the '<em><b>Control Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSAMPLED_VALUE_CONTROL__CONTROL_BLOCK = TCONTROL_WITH_IED_NAME__CONTROL_BLOCK;

	/**
	 * The feature id for the '<em><b>Data Set Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSAMPLED_VALUE_CONTROL__DATA_SET_REF = TCONTROL_WITH_IED_NAME__DATA_SET_REF;

	/**
	 * The feature id for the '<em><b>IED Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSAMPLED_VALUE_CONTROL__IED_NAME = TCONTROL_WITH_IED_NAME__IED_NAME;

	/**
	 * The feature id for the '<em><b>Conf Rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSAMPLED_VALUE_CONTROL__CONF_REV = TCONTROL_WITH_IED_NAME__CONF_REV;

	/**
	 * The feature id for the '<em><b>Smv Opts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSAMPLED_VALUE_CONTROL__SMV_OPTS = TCONTROL_WITH_IED_NAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multicast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSAMPLED_VALUE_CONTROL__MULTICAST = TCONTROL_WITH_IED_NAME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nof ASDU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSAMPLED_VALUE_CONTROL__NOF_ASDU = TCONTROL_WITH_IED_NAME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Smp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSAMPLED_VALUE_CONTROL__SMP_RATE = TCONTROL_WITH_IED_NAME_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Smv ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSAMPLED_VALUE_CONTROL__SMV_ID = TCONTROL_WITH_IED_NAME_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TSampled Value Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSAMPLED_VALUE_CONTROL_FEATURE_COUNT = TCONTROL_WITH_IED_NAME_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TSCLControlImpl <em>TSCL Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TSCLControlImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTSCLControl()
	 * @generated
	 */
	int TSCL_CONTROL = 92;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCL_CONTROL__ANY = TUN_NAMING__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCL_CONTROL__TEXT = TUN_NAMING__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCL_CONTROL__PRIVATE = TUN_NAMING__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCL_CONTROL__ANY_ATTRIBUTE = TUN_NAMING__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCL_CONTROL__DESC = TUN_NAMING__DESC;

	/**
	 * The number of structural features of the '<em>TSCL Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCL_CONTROL_FEATURE_COUNT = TUN_NAMING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TSDIImpl <em>TSDI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TSDIImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTSDI()
	 * @generated
	 */
	int TSDI = 93;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSDI__ANY = TUN_NAMING__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSDI__TEXT = TUN_NAMING__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSDI__PRIVATE = TUN_NAMING__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSDI__ANY_ATTRIBUTE = TUN_NAMING__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSDI__DESC = TUN_NAMING__DESC;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSDI__GROUP = TUN_NAMING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>SDI</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSDI__SDI = TUN_NAMING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>DAI</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSDI__DAI = TUN_NAMING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSDI__IX = TUN_NAMING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSDI__NAME = TUN_NAMING_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TSDI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSDI_FEATURE_COUNT = TUN_NAMING_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TSDOImpl <em>TSDO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TSDOImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTSDO()
	 * @generated
	 */
	int TSDO = 94;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSDO__ANY = TNAMING__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSDO__TEXT = TNAMING__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSDO__PRIVATE = TNAMING__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSDO__ANY_ATTRIBUTE = TNAMING__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSDO__DESC = TNAMING__DESC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSDO__NAME = TNAMING__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSDO__TYPE = TNAMING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TSDO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSDO_FEATURE_COUNT = TNAMING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TServerImpl <em>TServer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TServerImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTServer()
	 * @generated
	 */
	int TSERVER = 95;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVER__ANY = TUN_NAMING__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVER__TEXT = TUN_NAMING__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVER__PRIVATE = TUN_NAMING__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVER__ANY_ATTRIBUTE = TUN_NAMING__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVER__DESC = TUN_NAMING__DESC;

	/**
	 * The feature id for the '<em><b>Authentication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVER__AUTHENTICATION = TUN_NAMING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>LDevice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVER__LDEVICE = TUN_NAMING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVER__ASSOCIATION = TUN_NAMING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVER__TIMEOUT = TUN_NAMING_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TServer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVER_FEATURE_COUNT = TUN_NAMING_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TServicesImpl <em>TServices</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TServicesImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTServices()
	 * @generated
	 */
	int TSERVICES = 96;

	/**
	 * The feature id for the '<em><b>Dyn Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICES__DYN_ASSOCIATION = 0;

	/**
	 * The feature id for the '<em><b>Setting Groups</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICES__SETTING_GROUPS = 1;

	/**
	 * The feature id for the '<em><b>Get Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICES__GET_DIRECTORY = 2;

	/**
	 * The feature id for the '<em><b>Get Data Object Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICES__GET_DATA_OBJECT_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Data Object Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICES__DATA_OBJECT_DIRECTORY = 4;

	/**
	 * The feature id for the '<em><b>Get Data Set Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICES__GET_DATA_SET_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Set Data Set Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICES__SET_DATA_SET_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Data Set Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICES__DATA_SET_DIRECTORY = 7;

	/**
	 * The feature id for the '<em><b>Conf Data Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICES__CONF_DATA_SET = 8;

	/**
	 * The feature id for the '<em><b>Dyn Data Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICES__DYN_DATA_SET = 9;

	/**
	 * The feature id for the '<em><b>Read Write</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICES__READ_WRITE = 10;

	/**
	 * The feature id for the '<em><b>Timer Activated Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICES__TIMER_ACTIVATED_CONTROL = 11;

	/**
	 * The feature id for the '<em><b>Conf Report Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICES__CONF_REPORT_CONTROL = 12;

	/**
	 * The feature id for the '<em><b>Get CB Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICES__GET_CB_VALUES = 13;

	/**
	 * The feature id for the '<em><b>Conf Log Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICES__CONF_LOG_CONTROL = 14;

	/**
	 * The feature id for the '<em><b>Report Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICES__REPORT_SETTINGS = 15;

	/**
	 * The feature id for the '<em><b>Log Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICES__LOG_SETTINGS = 16;

	/**
	 * The feature id for the '<em><b>GSE Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICES__GSE_SETTINGS = 17;

	/**
	 * The feature id for the '<em><b>SMV Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICES__SMV_SETTINGS = 18;

	/**
	 * The feature id for the '<em><b>GSE Dir</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICES__GSE_DIR = 19;

	/**
	 * The feature id for the '<em><b>GOOSE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICES__GOOSE = 20;

	/**
	 * The feature id for the '<em><b>GSSE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICES__GSSE = 21;

	/**
	 * The feature id for the '<em><b>File Handling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICES__FILE_HANDLING = 22;

	/**
	 * The feature id for the '<em><b>Conf LNs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICES__CONF_LNS = 23;

	/**
	 * The feature id for the '<em><b>Client Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICES__CLIENT_SERVICES = 24;

	/**
	 * The number of structural features of the '<em>TServices</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICES_FEATURE_COUNT = 25;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TServiceWithMaxImpl <em>TService With Max</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TServiceWithMaxImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTServiceWithMax()
	 * @generated
	 */
	int TSERVICE_WITH_MAX = 98;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_WITH_MAX__MAX = 0;

	/**
	 * The number of structural features of the '<em>TService With Max</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_WITH_MAX_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TServiceWithMaxAndMaxAttributesImpl <em>TService With Max And Max Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TServiceWithMaxAndMaxAttributesImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTServiceWithMaxAndMaxAttributes()
	 * @generated
	 */
	int TSERVICE_WITH_MAX_AND_MAX_ATTRIBUTES = 99;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_WITH_MAX_AND_MAX_ATTRIBUTES__MAX = TSERVICE_WITH_MAX__MAX;

	/**
	 * The feature id for the '<em><b>Max Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_WITH_MAX_AND_MAX_ATTRIBUTES__MAX_ATTRIBUTES = TSERVICE_WITH_MAX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TService With Max And Max Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_WITH_MAX_AND_MAX_ATTRIBUTES_FEATURE_COUNT = TSERVICE_WITH_MAX_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TServiceWithMaxAndMaxAttributesAndModifyImpl <em>TService With Max And Max Attributes And Modify</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TServiceWithMaxAndMaxAttributesAndModifyImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTServiceWithMaxAndMaxAttributesAndModify()
	 * @generated
	 */
	int TSERVICE_WITH_MAX_AND_MAX_ATTRIBUTES_AND_MODIFY = 100;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_WITH_MAX_AND_MAX_ATTRIBUTES_AND_MODIFY__MAX = TSERVICE_WITH_MAX_AND_MAX_ATTRIBUTES__MAX;

	/**
	 * The feature id for the '<em><b>Max Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_WITH_MAX_AND_MAX_ATTRIBUTES_AND_MODIFY__MAX_ATTRIBUTES = TSERVICE_WITH_MAX_AND_MAX_ATTRIBUTES__MAX_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Modify</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_WITH_MAX_AND_MAX_ATTRIBUTES_AND_MODIFY__MODIFY = TSERVICE_WITH_MAX_AND_MAX_ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TService With Max And Max Attributes And Modify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_WITH_MAX_AND_MAX_ATTRIBUTES_AND_MODIFY_FEATURE_COUNT = TSERVICE_WITH_MAX_AND_MAX_ATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TServiceWithMaxAndModifyImpl <em>TService With Max And Modify</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TServiceWithMaxAndModifyImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTServiceWithMaxAndModify()
	 * @generated
	 */
	int TSERVICE_WITH_MAX_AND_MODIFY = 101;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_WITH_MAX_AND_MODIFY__MAX = TSERVICE_WITH_MAX__MAX;

	/**
	 * The feature id for the '<em><b>Modify</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_WITH_MAX_AND_MODIFY__MODIFY = TSERVICE_WITH_MAX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TService With Max And Modify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_WITH_MAX_AND_MODIFY_FEATURE_COUNT = TSERVICE_WITH_MAX_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TServiceYesNoImpl <em>TService Yes No</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TServiceYesNoImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTServiceYesNo()
	 * @generated
	 */
	int TSERVICE_YES_NO = 102;

	/**
	 * The number of structural features of the '<em>TService Yes No</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_YES_NO_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TSettingControlImpl <em>TSetting Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TSettingControlImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTSettingControl()
	 * @generated
	 */
	int TSETTING_CONTROL = 103;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSETTING_CONTROL__ANY = TUN_NAMING__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSETTING_CONTROL__TEXT = TUN_NAMING__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSETTING_CONTROL__PRIVATE = TUN_NAMING__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSETTING_CONTROL__ANY_ATTRIBUTE = TUN_NAMING__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSETTING_CONTROL__DESC = TUN_NAMING__DESC;

	/**
	 * The feature id for the '<em><b>Act SG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSETTING_CONTROL__ACT_SG = TUN_NAMING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Num Of SGs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSETTING_CONTROL__NUM_OF_SGS = TUN_NAMING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TSetting Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSETTING_CONTROL_FEATURE_COUNT = TUN_NAMING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TSMVImpl <em>TSMV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TSMVImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTSMV()
	 * @generated
	 */
	int TSMV = 104;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSMV__ANY = TCONTROL_BLOCK__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSMV__TEXT = TCONTROL_BLOCK__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSMV__PRIVATE = TCONTROL_BLOCK__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSMV__ANY_ATTRIBUTE = TCONTROL_BLOCK__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSMV__DESC = TCONTROL_BLOCK__DESC;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSMV__ADDRESS = TCONTROL_BLOCK__ADDRESS;

	/**
	 * The feature id for the '<em><b>Cb Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSMV__CB_NAME = TCONTROL_BLOCK__CB_NAME;

	/**
	 * The feature id for the '<em><b>Ld Inst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSMV__LD_INST = TCONTROL_BLOCK__LD_INST;

	/**
	 * The feature id for the '<em><b>Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSMV__CONTROL = TCONTROL_BLOCK__CONTROL;

	/**
	 * The number of structural features of the '<em>TSMV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSMV_FEATURE_COUNT = TCONTROL_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TSMVSettingsImpl <em>TSMV Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TSMVSettingsImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTSMVSettings()
	 * @generated
	 */
	int TSMV_SETTINGS = 105;

	/**
	 * The feature id for the '<em><b>Cb Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSMV_SETTINGS__CB_NAME = TSERVICE_SETTINGS__CB_NAME;

	/**
	 * The feature id for the '<em><b>Dat Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSMV_SETTINGS__DAT_SET = TSERVICE_SETTINGS__DAT_SET;

	/**
	 * The feature id for the '<em><b>Smp Rate</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSMV_SETTINGS__SMP_RATE = TSERVICE_SETTINGS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Opt Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSMV_SETTINGS__OPT_FIELDS = TSERVICE_SETTINGS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Smp Rate1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSMV_SETTINGS__SMP_RATE1 = TSERVICE_SETTINGS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sv ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSMV_SETTINGS__SV_ID = TSERVICE_SETTINGS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TSMV Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSMV_SETTINGS_FEATURE_COUNT = TSERVICE_SETTINGS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TSubEquipmentImpl <em>TSub Equipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TSubEquipmentImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTSubEquipment()
	 * @generated
	 */
	int TSUB_EQUIPMENT = 106;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_EQUIPMENT__ANY = TPOWER_SYSTEM_RESOURCE__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_EQUIPMENT__TEXT = TPOWER_SYSTEM_RESOURCE__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_EQUIPMENT__PRIVATE = TPOWER_SYSTEM_RESOURCE__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_EQUIPMENT__ANY_ATTRIBUTE = TPOWER_SYSTEM_RESOURCE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_EQUIPMENT__DESC = TPOWER_SYSTEM_RESOURCE__DESC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_EQUIPMENT__NAME = TPOWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>LNode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_EQUIPMENT__LNODE = TPOWER_SYSTEM_RESOURCE__LNODE;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_EQUIPMENT__PHASE = TPOWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_EQUIPMENT__VIRTUAL = TPOWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TSub Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_EQUIPMENT_FEATURE_COUNT = TPOWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TSubFunctionImpl <em>TSub Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TSubFunctionImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTSubFunction()
	 * @generated
	 */
	int TSUB_FUNCTION = 107;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_FUNCTION__ANY = TPOWER_SYSTEM_RESOURCE__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_FUNCTION__TEXT = TPOWER_SYSTEM_RESOURCE__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_FUNCTION__PRIVATE = TPOWER_SYSTEM_RESOURCE__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_FUNCTION__ANY_ATTRIBUTE = TPOWER_SYSTEM_RESOURCE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_FUNCTION__DESC = TPOWER_SYSTEM_RESOURCE__DESC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_FUNCTION__NAME = TPOWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>LNode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_FUNCTION__LNODE = TPOWER_SYSTEM_RESOURCE__LNODE;

	/**
	 * The feature id for the '<em><b>General Equipment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_FUNCTION__GENERAL_EQUIPMENT = TPOWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TSub Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_FUNCTION_FEATURE_COUNT = TPOWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TSubNetworkImpl <em>TSub Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TSubNetworkImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTSubNetwork()
	 * @generated
	 */
	int TSUB_NETWORK = 108;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_NETWORK__ANY = TNAMING__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_NETWORK__TEXT = TNAMING__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_NETWORK__PRIVATE = TNAMING__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_NETWORK__ANY_ATTRIBUTE = TNAMING__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_NETWORK__DESC = TNAMING__DESC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_NETWORK__NAME = TNAMING__NAME;

	/**
	 * The feature id for the '<em><b>Bit Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_NETWORK__BIT_RATE = TNAMING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connected AP</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_NETWORK__CONNECTED_AP = TNAMING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_NETWORK__TYPE = TNAMING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TSub Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_NETWORK_FEATURE_COUNT = TNAMING_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TSubstationImpl <em>TSubstation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TSubstationImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTSubstation()
	 * @generated
	 */
	int TSUBSTATION = 109;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUBSTATION__ANY = TEQUIPMENT_CONTAINER__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUBSTATION__TEXT = TEQUIPMENT_CONTAINER__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUBSTATION__PRIVATE = TEQUIPMENT_CONTAINER__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUBSTATION__ANY_ATTRIBUTE = TEQUIPMENT_CONTAINER__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUBSTATION__DESC = TEQUIPMENT_CONTAINER__DESC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUBSTATION__NAME = TEQUIPMENT_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>LNode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUBSTATION__LNODE = TEQUIPMENT_CONTAINER__LNODE;

	/**
	 * The feature id for the '<em><b>Power Transformer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUBSTATION__POWER_TRANSFORMER = TEQUIPMENT_CONTAINER__POWER_TRANSFORMER;

	/**
	 * The feature id for the '<em><b>General Equipment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUBSTATION__GENERAL_EQUIPMENT = TEQUIPMENT_CONTAINER__GENERAL_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Voltage Level</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUBSTATION__VOLTAGE_LEVEL = TEQUIPMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUBSTATION__FUNCTION = TEQUIPMENT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TSubstation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUBSTATION_FEATURE_COUNT = TEQUIPMENT_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TTapChangerImpl <em>TTap Changer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TTapChangerImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTTapChanger()
	 * @generated
	 */
	int TTAP_CHANGER = 110;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAP_CHANGER__ANY = TPOWER_SYSTEM_RESOURCE__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAP_CHANGER__TEXT = TPOWER_SYSTEM_RESOURCE__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAP_CHANGER__PRIVATE = TPOWER_SYSTEM_RESOURCE__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAP_CHANGER__ANY_ATTRIBUTE = TPOWER_SYSTEM_RESOURCE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAP_CHANGER__DESC = TPOWER_SYSTEM_RESOURCE__DESC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAP_CHANGER__NAME = TPOWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>LNode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAP_CHANGER__LNODE = TPOWER_SYSTEM_RESOURCE__LNODE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAP_CHANGER__TYPE = TPOWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAP_CHANGER__VIRTUAL = TPOWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TTap Changer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAP_CHANGER_FEATURE_COUNT = TPOWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TTerminalImpl <em>TTerminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TTerminalImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTTerminal()
	 * @generated
	 */
	int TTERMINAL = 111;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTERMINAL__ANY = TUN_NAMING__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTERMINAL__TEXT = TUN_NAMING__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTERMINAL__PRIVATE = TUN_NAMING__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTERMINAL__ANY_ATTRIBUTE = TUN_NAMING__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTERMINAL__DESC = TUN_NAMING__DESC;

	/**
	 * The feature id for the '<em><b>Bay Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTERMINAL__BAY_NAME = TUN_NAMING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CNode Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTERMINAL__CNODE_NAME = TUN_NAMING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connectivity Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTERMINAL__CONNECTIVITY_NODE = TUN_NAMING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTERMINAL__NAME = TUN_NAMING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Substation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTERMINAL__SUBSTATION_NAME = TUN_NAMING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Voltage Level Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTERMINAL__VOLTAGE_LEVEL_NAME = TUN_NAMING_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>TTerminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTERMINAL_FEATURE_COUNT = TUN_NAMING_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TTextImpl <em>TText</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TTextImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTText()
	 * @generated
	 */
	int TTEXT = 112;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT__MIXED = TANY_CONTENT_FROM_OTHER_NAMESPACE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT__GROUP = TANY_CONTENT_FROM_OTHER_NAMESPACE__GROUP;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT__ANY = TANY_CONTENT_FROM_OTHER_NAMESPACE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT__ANY_ATTRIBUTE = TANY_CONTENT_FROM_OTHER_NAMESPACE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT__SOURCE = TANY_CONTENT_FROM_OTHER_NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TText</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_FEATURE_COUNT = TANY_CONTENT_FROM_OTHER_NAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TTransformerWindingImpl <em>TTransformer Winding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TTransformerWindingImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTTransformerWinding()
	 * @generated
	 */
	int TTRANSFORMER_WINDING = 113;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSFORMER_WINDING__ANY = TABSTRACT_CONDUCTING_EQUIPMENT__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSFORMER_WINDING__TEXT = TABSTRACT_CONDUCTING_EQUIPMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSFORMER_WINDING__PRIVATE = TABSTRACT_CONDUCTING_EQUIPMENT__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSFORMER_WINDING__ANY_ATTRIBUTE = TABSTRACT_CONDUCTING_EQUIPMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSFORMER_WINDING__DESC = TABSTRACT_CONDUCTING_EQUIPMENT__DESC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSFORMER_WINDING__NAME = TABSTRACT_CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>LNode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSFORMER_WINDING__LNODE = TABSTRACT_CONDUCTING_EQUIPMENT__LNODE;

	/**
	 * The feature id for the '<em><b>Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSFORMER_WINDING__VIRTUAL = TABSTRACT_CONDUCTING_EQUIPMENT__VIRTUAL;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSFORMER_WINDING__TERMINAL = TABSTRACT_CONDUCTING_EQUIPMENT__TERMINAL;

	/**
	 * The feature id for the '<em><b>Sub Equipment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSFORMER_WINDING__SUB_EQUIPMENT = TABSTRACT_CONDUCTING_EQUIPMENT__SUB_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Tap Changer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSFORMER_WINDING__TAP_CHANGER = TABSTRACT_CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSFORMER_WINDING__TYPE = TABSTRACT_CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TTransformer Winding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSFORMER_WINDING_FEATURE_COUNT = TABSTRACT_CONDUCTING_EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TTrgOpsImpl <em>TTrg Ops</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TTrgOpsImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTTrgOps()
	 * @generated
	 */
	int TTRG_OPS = 114;

	/**
	 * The feature id for the '<em><b>Dchg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRG_OPS__DCHG = 0;

	/**
	 * The feature id for the '<em><b>Dupd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRG_OPS__DUPD = 1;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRG_OPS__PERIOD = 2;

	/**
	 * The feature id for the '<em><b>Qchg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRG_OPS__QCHG = 3;

	/**
	 * The number of structural features of the '<em>TTrg Ops</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRG_OPS_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TValImpl <em>TVal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TValImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTVal()
	 * @generated
	 */
	int TVAL = 116;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVAL__VALUE = 0;

	/**
	 * The feature id for the '<em><b>SGroup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVAL__SGROUP = 1;

	/**
	 * The number of structural features of the '<em>TVal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVAL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TVoltageImpl <em>TVoltage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TVoltageImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTVoltage()
	 * @generated
	 */
	int TVOLTAGE = 118;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVOLTAGE__VALUE = TVALUE_WITH_UNIT__VALUE;

	/**
	 * The feature id for the '<em><b>Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVOLTAGE__MULTIPLIER = TVALUE_WITH_UNIT__MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVOLTAGE__UNIT = TVALUE_WITH_UNIT__UNIT;

	/**
	 * The number of structural features of the '<em>TVoltage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVOLTAGE_FEATURE_COUNT = TVALUE_WITH_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.impl.TVoltageLevelImpl <em>TVoltage Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.impl.TVoltageLevelImpl
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTVoltageLevel()
	 * @generated
	 */
	int TVOLTAGE_LEVEL = 119;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVOLTAGE_LEVEL__ANY = TEQUIPMENT_CONTAINER__ANY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVOLTAGE_LEVEL__TEXT = TEQUIPMENT_CONTAINER__TEXT;

	/**
	 * The feature id for the '<em><b>Private</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVOLTAGE_LEVEL__PRIVATE = TEQUIPMENT_CONTAINER__PRIVATE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVOLTAGE_LEVEL__ANY_ATTRIBUTE = TEQUIPMENT_CONTAINER__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVOLTAGE_LEVEL__DESC = TEQUIPMENT_CONTAINER__DESC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVOLTAGE_LEVEL__NAME = TEQUIPMENT_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>LNode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVOLTAGE_LEVEL__LNODE = TEQUIPMENT_CONTAINER__LNODE;

	/**
	 * The feature id for the '<em><b>Power Transformer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVOLTAGE_LEVEL__POWER_TRANSFORMER = TEQUIPMENT_CONTAINER__POWER_TRANSFORMER;

	/**
	 * The feature id for the '<em><b>General Equipment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVOLTAGE_LEVEL__GENERAL_EQUIPMENT = TEQUIPMENT_CONTAINER__GENERAL_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Voltage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVOLTAGE_LEVEL__VOLTAGE = TEQUIPMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bay</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVOLTAGE_LEVEL__BAY = TEQUIPMENT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TVoltage Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVOLTAGE_LEVEL_FEATURE_COUNT = TEQUIPMENT_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.NameStructureType <em>Name Structure Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.NameStructureType
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getNameStructureType()
	 * @generated
	 */
	int NAME_STRUCTURE_TYPE = 120;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.TAssociationKindEnum <em>TAssociation Kind Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TAssociationKindEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTAssociationKindEnum()
	 * @generated
	 */
	int TASSOCIATION_KIND_ENUM = 121;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.TAuthenticationEnum <em>TAuthentication Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TAuthenticationEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTAuthenticationEnum()
	 * @generated
	 */
	int TAUTHENTICATION_ENUM = 122;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.TDomainLNGroupAEnum <em>TDomain LN Group AEnum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupAEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTDomainLNGroupAEnum()
	 * @generated
	 */
	int TDOMAIN_LN_GROUP_AENUM = 123;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.TDomainLNGroupCEnum <em>TDomain LN Group CEnum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupCEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTDomainLNGroupCEnum()
	 * @generated
	 */
	int TDOMAIN_LN_GROUP_CENUM = 124;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.TDomainLNGroupGEnum <em>TDomain LN Group GEnum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupGEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTDomainLNGroupGEnum()
	 * @generated
	 */
	int TDOMAIN_LN_GROUP_GENUM = 125;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.TDomainLNGroupIEnum <em>TDomain LN Group IEnum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupIEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTDomainLNGroupIEnum()
	 * @generated
	 */
	int TDOMAIN_LN_GROUP_IENUM = 126;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.TDomainLNGroupMEnum <em>TDomain LN Group MEnum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupMEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTDomainLNGroupMEnum()
	 * @generated
	 */
	int TDOMAIN_LN_GROUP_MENUM = 127;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.TDomainLNGroupPEnum <em>TDomain LN Group PEnum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupPEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTDomainLNGroupPEnum()
	 * @generated
	 */
	int TDOMAIN_LN_GROUP_PENUM = 128;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.TDomainLNGroupREnum <em>TDomain LN Group REnum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupREnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTDomainLNGroupREnum()
	 * @generated
	 */
	int TDOMAIN_LN_GROUP_RENUM = 129;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.TDomainLNGroupSEnum <em>TDomain LN Group SEnum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupSEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTDomainLNGroupSEnum()
	 * @generated
	 */
	int TDOMAIN_LN_GROUP_SENUM = 130;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.TDomainLNGroupTEnum <em>TDomain LN Group TEnum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupTEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTDomainLNGroupTEnum()
	 * @generated
	 */
	int TDOMAIN_LN_GROUP_TENUM = 131;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.TDomainLNGroupXEnum <em>TDomain LN Group XEnum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupXEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTDomainLNGroupXEnum()
	 * @generated
	 */
	int TDOMAIN_LN_GROUP_XENUM = 132;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.TDomainLNGroupYEnum <em>TDomain LN Group YEnum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupYEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTDomainLNGroupYEnum()
	 * @generated
	 */
	int TDOMAIN_LN_GROUP_YENUM = 133;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.TDomainLNGroupZEnum <em>TDomain LN Group ZEnum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupZEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTDomainLNGroupZEnum()
	 * @generated
	 */
	int TDOMAIN_LN_GROUP_ZENUM = 134;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.TFCEnum <em>TFC Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TFCEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTFCEnum()
	 * @generated
	 */
	int TFC_ENUM = 135;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.TGSEControlTypeEnum <em>TGSE Control Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TGSEControlTypeEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTGSEControlTypeEnum()
	 * @generated
	 */
	int TGSE_CONTROL_TYPE_ENUM = 136;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.TLLN0Enum <em>TLLN0 Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TLLN0Enum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTLLN0Enum()
	 * @generated
	 */
	int TLLN0_ENUM = 137;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.TLPHDEnum <em>TLPHD Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TLPHDEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTLPHDEnum()
	 * @generated
	 */
	int TLPHD_ENUM = 138;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.TPhaseEnum <em>TPhase Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TPhaseEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPhaseEnum()
	 * @generated
	 */
	int TPHASE_ENUM = 139;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.TPowerTransformerEnum <em>TPower Transformer Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TPowerTransformerEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPowerTransformerEnum()
	 * @generated
	 */
	int TPOWER_TRANSFORMER_ENUM = 140;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.TPredefinedAttributeNameEnum <em>TPredefined Attribute Name Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TPredefinedAttributeNameEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPredefinedAttributeNameEnum()
	 * @generated
	 */
	int TPREDEFINED_ATTRIBUTE_NAME_ENUM = 141;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.TPredefinedBasicTypeEnum <em>TPredefined Basic Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TPredefinedBasicTypeEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPredefinedBasicTypeEnum()
	 * @generated
	 */
	int TPREDEFINED_BASIC_TYPE_ENUM = 142;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.TPredefinedCDCEnum <em>TPredefined CDC Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TPredefinedCDCEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPredefinedCDCEnum()
	 * @generated
	 */
	int TPREDEFINED_CDC_ENUM = 143;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.TPredefinedCommonConductingEquipmentEnum <em>TPredefined Common Conducting Equipment Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TPredefinedCommonConductingEquipmentEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPredefinedCommonConductingEquipmentEnum()
	 * @generated
	 */
	int TPREDEFINED_COMMON_CONDUCTING_EQUIPMENT_ENUM = 144;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.TPredefinedGeneralEquipmentEnum <em>TPredefined General Equipment Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TPredefinedGeneralEquipmentEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPredefinedGeneralEquipmentEnum()
	 * @generated
	 */
	int TPREDEFINED_GENERAL_EQUIPMENT_ENUM = 145;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.TPredefinedPTypeEnum <em>TPredefined PType Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TPredefinedPTypeEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPredefinedPTypeEnum()
	 * @generated
	 */
	int TPREDEFINED_PTYPE_ENUM = 146;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.TServiceFCEnum <em>TService FC Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TServiceFCEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTServiceFCEnum()
	 * @generated
	 */
	int TSERVICE_FC_ENUM = 147;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.TServiceSettingsEnum <em>TService Settings Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TServiceSettingsEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTServiceSettingsEnum()
	 * @generated
	 */
	int TSERVICE_SETTINGS_ENUM = 148;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.TSIUnitEnum <em>TSI Unit Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TSIUnitEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTSIUnitEnum()
	 * @generated
	 */
	int TSI_UNIT_ENUM = 149;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.TTransformerWindingEnum <em>TTransformer Winding Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TTransformerWindingEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTTransformerWindingEnum()
	 * @generated
	 */
	int TTRANSFORMER_WINDING_ENUM = 150;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.TTrgOptControlEnum <em>TTrg Opt Control Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TTrgOptControlEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTTrgOptControlEnum()
	 * @generated
	 */
	int TTRG_OPT_CONTROL_ENUM = 151;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.TTrgOptEnum <em>TTrg Opt Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TTrgOptEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTTrgOptEnum()
	 * @generated
	 */
	int TTRG_OPT_ENUM = 152;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.TUnitMultiplierEnum <em>TUnit Multiplier Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TUnitMultiplierEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTUnitMultiplierEnum()
	 * @generated
	 */
	int TUNIT_MULTIPLIER_ENUM = 153;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.scl.TValKindEnum <em>TVal Kind Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TValKindEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTValKindEnum()
	 * @generated
	 */
	int TVAL_KIND_ENUM = 154;

	/**
	 * The meta object id for the '<em>Name Structure Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.NameStructureType
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getNameStructureTypeObject()
	 * @generated
	 */
	int NAME_STRUCTURE_TYPE_OBJECT = 155;

	/**
	 * The meta object id for the '<em>Smp Rate Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getSmpRateType()
	 * @generated
	 */
	int SMP_RATE_TYPE = 156;

	/**
	 * The meta object id for the '<em>TAny Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTAnyName()
	 * @generated
	 */
	int TANY_NAME = 157;

	/**
	 * The meta object id for the '<em>TAssociation Kind Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TAssociationKindEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTAssociationKindEnumObject()
	 * @generated
	 */
	int TASSOCIATION_KIND_ENUM_OBJECT = 158;

	/**
	 * The meta object id for the '<em>TAttribute Name Enum</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTAttributeNameEnum()
	 * @generated
	 */
	int TATTRIBUTE_NAME_ENUM = 159;

	/**
	 * The meta object id for the '<em>TAuthentication Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TAuthenticationEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTAuthenticationEnumObject()
	 * @generated
	 */
	int TAUTHENTICATION_ENUM_OBJECT = 160;

	/**
	 * The meta object id for the '<em>TBasic Type Enum</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTBasicTypeEnum()
	 * @generated
	 */
	int TBASIC_TYPE_ENUM = 161;

	/**
	 * The meta object id for the '<em>TCDC Enum</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTCDCEnum()
	 * @generated
	 */
	int TCDC_ENUM = 162;

	/**
	 * The meta object id for the '<em>TCommon Conducting Equipment Enum</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTCommonConductingEquipmentEnum()
	 * @generated
	 */
	int TCOMMON_CONDUCTING_EQUIPMENT_ENUM = 163;

	/**
	 * The meta object id for the '<em>TDomain LN Enum</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTDomainLNEnum()
	 * @generated
	 */
	int TDOMAIN_LN_ENUM = 164;

	/**
	 * The meta object id for the '<em>TDomain LN Group AEnum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupAEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTDomainLNGroupAEnumObject()
	 * @generated
	 */
	int TDOMAIN_LN_GROUP_AENUM_OBJECT = 165;

	/**
	 * The meta object id for the '<em>TDomain LN Group CEnum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupCEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTDomainLNGroupCEnumObject()
	 * @generated
	 */
	int TDOMAIN_LN_GROUP_CENUM_OBJECT = 166;

	/**
	 * The meta object id for the '<em>TDomain LN Group GEnum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupGEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTDomainLNGroupGEnumObject()
	 * @generated
	 */
	int TDOMAIN_LN_GROUP_GENUM_OBJECT = 167;

	/**
	 * The meta object id for the '<em>TDomain LN Group IEnum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupIEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTDomainLNGroupIEnumObject()
	 * @generated
	 */
	int TDOMAIN_LN_GROUP_IENUM_OBJECT = 168;

	/**
	 * The meta object id for the '<em>TDomain LN Group MEnum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupMEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTDomainLNGroupMEnumObject()
	 * @generated
	 */
	int TDOMAIN_LN_GROUP_MENUM_OBJECT = 169;

	/**
	 * The meta object id for the '<em>TDomain LN Group PEnum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupPEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTDomainLNGroupPEnumObject()
	 * @generated
	 */
	int TDOMAIN_LN_GROUP_PENUM_OBJECT = 170;

	/**
	 * The meta object id for the '<em>TDomain LN Group REnum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupREnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTDomainLNGroupREnumObject()
	 * @generated
	 */
	int TDOMAIN_LN_GROUP_RENUM_OBJECT = 171;

	/**
	 * The meta object id for the '<em>TDomain LN Group SEnum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupSEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTDomainLNGroupSEnumObject()
	 * @generated
	 */
	int TDOMAIN_LN_GROUP_SENUM_OBJECT = 172;

	/**
	 * The meta object id for the '<em>TDomain LN Group TEnum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupTEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTDomainLNGroupTEnumObject()
	 * @generated
	 */
	int TDOMAIN_LN_GROUP_TENUM_OBJECT = 173;

	/**
	 * The meta object id for the '<em>TDomain LN Group XEnum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupXEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTDomainLNGroupXEnumObject()
	 * @generated
	 */
	int TDOMAIN_LN_GROUP_XENUM_OBJECT = 174;

	/**
	 * The meta object id for the '<em>TDomain LN Group YEnum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupYEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTDomainLNGroupYEnumObject()
	 * @generated
	 */
	int TDOMAIN_LN_GROUP_YENUM_OBJECT = 175;

	/**
	 * The meta object id for the '<em>TDomain LN Group ZEnum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupZEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTDomainLNGroupZEnumObject()
	 * @generated
	 */
	int TDOMAIN_LN_GROUP_ZENUM_OBJECT = 176;

	/**
	 * The meta object id for the '<em>TEquipment Enum</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTEquipmentEnum()
	 * @generated
	 */
	int TEQUIPMENT_ENUM = 177;

	/**
	 * The meta object id for the '<em>TExtension Attribute Name Enum</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTExtensionAttributeNameEnum()
	 * @generated
	 */
	int TEXTENSION_ATTRIBUTE_NAME_ENUM = 178;

	/**
	 * The meta object id for the '<em>TExtension Basic Type Enum</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTExtensionBasicTypeEnum()
	 * @generated
	 */
	int TEXTENSION_BASIC_TYPE_ENUM = 179;

	/**
	 * The meta object id for the '<em>TExtension CDC Enum</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTExtensionCDCEnum()
	 * @generated
	 */
	int TEXTENSION_CDC_ENUM = 180;

	/**
	 * The meta object id for the '<em>TExtension Equipment Enum</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTExtensionEquipmentEnum()
	 * @generated
	 */
	int TEXTENSION_EQUIPMENT_ENUM = 181;

	/**
	 * The meta object id for the '<em>TExtension General Equipment Enum</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTExtensionGeneralEquipmentEnum()
	 * @generated
	 */
	int TEXTENSION_GENERAL_EQUIPMENT_ENUM = 182;

	/**
	 * The meta object id for the '<em>TExtension LN Class Enum</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTExtensionLNClassEnum()
	 * @generated
	 */
	int TEXTENSION_LN_CLASS_ENUM = 183;

	/**
	 * The meta object id for the '<em>TExtension PType Enum</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTExtensionPTypeEnum()
	 * @generated
	 */
	int TEXTENSION_PTYPE_ENUM = 184;

	/**
	 * The meta object id for the '<em>TFC Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TFCEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTFCEnumObject()
	 * @generated
	 */
	int TFC_ENUM_OBJECT = 185;

	/**
	 * The meta object id for the '<em>TGeneral Equipment Enum</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTGeneralEquipmentEnum()
	 * @generated
	 */
	int TGENERAL_EQUIPMENT_ENUM = 186;

	/**
	 * The meta object id for the '<em>TGSE Control Type Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TGSEControlTypeEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTGSEControlTypeEnumObject()
	 * @generated
	 */
	int TGSE_CONTROL_TYPE_ENUM_OBJECT = 187;

	/**
	 * The meta object id for the '<em>TLLN0 Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TLLN0Enum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTLLN0EnumObject()
	 * @generated
	 */
	int TLLN0_ENUM_OBJECT = 188;

	/**
	 * The meta object id for the '<em>TLN Class Enum</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTLNClassEnum()
	 * @generated
	 */
	int TLN_CLASS_ENUM = 189;

	/**
	 * The meta object id for the '<em>TLPHD Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TLPHDEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTLPHDEnumObject()
	 * @generated
	 */
	int TLPHD_ENUM_OBJECT = 190;

	/**
	 * The meta object id for the '<em>TName</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTName()
	 * @generated
	 */
	int TNAME = 191;

	/**
	 * The meta object id for the '<em>TP Addr</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPAddr()
	 * @generated
	 */
	int TP_ADDR = 192;

	/**
	 * The meta object id for the '<em>TPhase Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TPhaseEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPhaseEnumObject()
	 * @generated
	 */
	int TPHASE_ENUM_OBJECT = 193;

	/**
	 * The meta object id for the '<em>TPower Transformer Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TPowerTransformerEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPowerTransformerEnumObject()
	 * @generated
	 */
	int TPOWER_TRANSFORMER_ENUM_OBJECT = 194;

	/**
	 * The meta object id for the '<em>TPredefined Attribute Name Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TPredefinedAttributeNameEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPredefinedAttributeNameEnumObject()
	 * @generated
	 */
	int TPREDEFINED_ATTRIBUTE_NAME_ENUM_OBJECT = 195;

	/**
	 * The meta object id for the '<em>TPredefined Basic Type Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TPredefinedBasicTypeEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPredefinedBasicTypeEnumObject()
	 * @generated
	 */
	int TPREDEFINED_BASIC_TYPE_ENUM_OBJECT = 196;

	/**
	 * The meta object id for the '<em>TPredefined CDC Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TPredefinedCDCEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPredefinedCDCEnumObject()
	 * @generated
	 */
	int TPREDEFINED_CDC_ENUM_OBJECT = 197;

	/**
	 * The meta object id for the '<em>TPredefined Common Conducting Equipment Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TPredefinedCommonConductingEquipmentEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPredefinedCommonConductingEquipmentEnumObject()
	 * @generated
	 */
	int TPREDEFINED_COMMON_CONDUCTING_EQUIPMENT_ENUM_OBJECT = 198;

	/**
	 * The meta object id for the '<em>TPredefined Equipment Enum</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPredefinedEquipmentEnum()
	 * @generated
	 */
	int TPREDEFINED_EQUIPMENT_ENUM = 199;

	/**
	 * The meta object id for the '<em>TPredefined General Equipment Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TPredefinedGeneralEquipmentEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPredefinedGeneralEquipmentEnumObject()
	 * @generated
	 */
	int TPREDEFINED_GENERAL_EQUIPMENT_ENUM_OBJECT = 200;

	/**
	 * The meta object id for the '<em>TPredefined LN Class Enum</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPredefinedLNClassEnum()
	 * @generated
	 */
	int TPREDEFINED_LN_CLASS_ENUM = 201;

	/**
	 * The meta object id for the '<em>TPredefined PType Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TPredefinedPTypeEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPredefinedPTypeEnumObject()
	 * @generated
	 */
	int TPREDEFINED_PTYPE_ENUM_OBJECT = 202;

	/**
	 * The meta object id for the '<em>TP Type Enum</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTPTypeEnum()
	 * @generated
	 */
	int TP_TYPE_ENUM = 203;

	/**
	 * The meta object id for the '<em>TRef</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTRef()
	 * @generated
	 */
	int TREF = 204;

	/**
	 * The meta object id for the '<em>TRestr Ld Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTRestrLdName()
	 * @generated
	 */
	int TRESTR_LD_NAME = 205;

	/**
	 * The meta object id for the '<em>TRestr Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTRestrName()
	 * @generated
	 */
	int TRESTR_NAME = 206;

	/**
	 * The meta object id for the '<em>TRestr Name1st L</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTRestrName1stL()
	 * @generated
	 */
	int TRESTR_NAME1ST_L = 207;

	/**
	 * The meta object id for the '<em>TRestr Name1st U</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTRestrName1stU()
	 * @generated
	 */
	int TRESTR_NAME1ST_U = 208;

	/**
	 * The meta object id for the '<em>TService FC Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TServiceFCEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTServiceFCEnumObject()
	 * @generated
	 */
	int TSERVICE_FC_ENUM_OBJECT = 209;

	/**
	 * The meta object id for the '<em>TService Settings Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TServiceSettingsEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTServiceSettingsEnumObject()
	 * @generated
	 */
	int TSERVICE_SETTINGS_ENUM_OBJECT = 210;

	/**
	 * The meta object id for the '<em>TSI Unit Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TSIUnitEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTSIUnitEnumObject()
	 * @generated
	 */
	int TSI_UNIT_ENUM_OBJECT = 211;

	/**
	 * The meta object id for the '<em>TTransformer Winding Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TTransformerWindingEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTTransformerWindingEnumObject()
	 * @generated
	 */
	int TTRANSFORMER_WINDING_ENUM_OBJECT = 212;

	/**
	 * The meta object id for the '<em>TTrg Opt Control Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TTrgOptControlEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTTrgOptControlEnumObject()
	 * @generated
	 */
	int TTRG_OPT_CONTROL_ENUM_OBJECT = 213;

	/**
	 * The meta object id for the '<em>TTrg Opt Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TTrgOptEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTTrgOptEnumObject()
	 * @generated
	 */
	int TTRG_OPT_ENUM_OBJECT = 214;

	/**
	 * The meta object id for the '<em>TUnit Multiplier Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TUnitMultiplierEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTUnitMultiplierEnumObject()
	 * @generated
	 */
	int TUNIT_MULTIPLIER_ENUM_OBJECT = 215;

	/**
	 * The meta object id for the '<em>TVal Kind Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.scl.TValKindEnum
	 * @see ch.iec._61850._2006.scl.impl.SclPackageImpl#getTValKindEnumObject()
	 * @generated
	 */
	int TVAL_KIND_ENUM_OBJECT = 216;


	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.AuthenticationType <em>Authentication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication Type</em>'.
	 * @see ch.iec._61850._2006.scl.AuthenticationType
	 * @generated
	 */
	EClass getAuthenticationType();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.AuthenticationType#isCertificate <em>Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Certificate</em>'.
	 * @see ch.iec._61850._2006.scl.AuthenticationType#isCertificate()
	 * @see #getAuthenticationType()
	 * @generated
	 */
	EAttribute getAuthenticationType_Certificate();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.AuthenticationType#isNone <em>None</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>None</em>'.
	 * @see ch.iec._61850._2006.scl.AuthenticationType#isNone()
	 * @see #getAuthenticationType()
	 * @generated
	 */
	EAttribute getAuthenticationType_None();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.AuthenticationType#isPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see ch.iec._61850._2006.scl.AuthenticationType#isPassword()
	 * @see #getAuthenticationType()
	 * @generated
	 */
	EAttribute getAuthenticationType_Password();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.AuthenticationType#isStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strong</em>'.
	 * @see ch.iec._61850._2006.scl.AuthenticationType#isStrong()
	 * @see #getAuthenticationType()
	 * @generated
	 */
	EAttribute getAuthenticationType_Strong();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.AuthenticationType#isWeak <em>Weak</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weak</em>'.
	 * @see ch.iec._61850._2006.scl.AuthenticationType#isWeak()
	 * @see #getAuthenticationType()
	 * @generated
	 */
	EAttribute getAuthenticationType_Weak();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see ch.iec._61850._2006.scl.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link ch.iec._61850._2006.scl.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see ch.iec._61850._2006.scl.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link ch.iec._61850._2006.scl.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see ch.iec._61850._2006.scl.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link ch.iec._61850._2006.scl.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see ch.iec._61850._2006.scl.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.DocumentRoot#getCommunication <em>Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Communication</em>'.
	 * @see ch.iec._61850._2006.scl.DocumentRoot#getCommunication()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Communication();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.DocumentRoot#getDataTypeTemplates <em>Data Type Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type Templates</em>'.
	 * @see ch.iec._61850._2006.scl.DocumentRoot#getDataTypeTemplates()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DataTypeTemplates();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.DocumentRoot#getIED <em>IED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IED</em>'.
	 * @see ch.iec._61850._2006.scl.DocumentRoot#getIED()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IED();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.DocumentRoot#getLN <em>LN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LN</em>'.
	 * @see ch.iec._61850._2006.scl.DocumentRoot#getLN()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LN();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.DocumentRoot#getLN0 <em>LN0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LN0</em>'.
	 * @see ch.iec._61850._2006.scl.DocumentRoot#getLN0()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LN0();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.DocumentRoot#getSCL <em>SCL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SCL</em>'.
	 * @see ch.iec._61850._2006.scl.DocumentRoot#getSCL()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SCL();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.DocumentRoot#getSubstation <em>Substation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Substation</em>'.
	 * @see ch.iec._61850._2006.scl.DocumentRoot#getSubstation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Substation();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.HistoryType <em>History Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History Type</em>'.
	 * @see ch.iec._61850._2006.scl.HistoryType
	 * @generated
	 */
	EClass getHistoryType();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.HistoryType#getHitem <em>Hitem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hitem</em>'.
	 * @see ch.iec._61850._2006.scl.HistoryType#getHitem()
	 * @see #getHistoryType()
	 * @generated
	 */
	EReference getHistoryType_Hitem();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.LN0Type <em>LN0 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LN0 Type</em>'.
	 * @see ch.iec._61850._2006.scl.LN0Type
	 * @generated
	 */
	EClass getLN0Type();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.OptFieldsType <em>Opt Fields Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opt Fields Type</em>'.
	 * @see ch.iec._61850._2006.scl.OptFieldsType
	 * @generated
	 */
	EClass getOptFieldsType();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.OptFieldsType#isBufOvfl <em>Buf Ovfl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buf Ovfl</em>'.
	 * @see ch.iec._61850._2006.scl.OptFieldsType#isBufOvfl()
	 * @see #getOptFieldsType()
	 * @generated
	 */
	EAttribute getOptFieldsType_BufOvfl();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.OptFieldsType#isConfigRef <em>Config Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Ref</em>'.
	 * @see ch.iec._61850._2006.scl.OptFieldsType#isConfigRef()
	 * @see #getOptFieldsType()
	 * @generated
	 */
	EAttribute getOptFieldsType_ConfigRef();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.OptFieldsType#isDataRef <em>Data Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Ref</em>'.
	 * @see ch.iec._61850._2006.scl.OptFieldsType#isDataRef()
	 * @see #getOptFieldsType()
	 * @generated
	 */
	EAttribute getOptFieldsType_DataRef();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.OptFieldsType#isDataSet <em>Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Set</em>'.
	 * @see ch.iec._61850._2006.scl.OptFieldsType#isDataSet()
	 * @see #getOptFieldsType()
	 * @generated
	 */
	EAttribute getOptFieldsType_DataSet();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.OptFieldsType#isEntryID <em>Entry ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry ID</em>'.
	 * @see ch.iec._61850._2006.scl.OptFieldsType#isEntryID()
	 * @see #getOptFieldsType()
	 * @generated
	 */
	EAttribute getOptFieldsType_EntryID();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.OptFieldsType#isReasonCode <em>Reason Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason Code</em>'.
	 * @see ch.iec._61850._2006.scl.OptFieldsType#isReasonCode()
	 * @see #getOptFieldsType()
	 * @generated
	 */
	EAttribute getOptFieldsType_ReasonCode();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.OptFieldsType#isSeqNum <em>Seq Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seq Num</em>'.
	 * @see ch.iec._61850._2006.scl.OptFieldsType#isSeqNum()
	 * @see #getOptFieldsType()
	 * @generated
	 */
	EAttribute getOptFieldsType_SeqNum();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.OptFieldsType#isTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see ch.iec._61850._2006.scl.OptFieldsType#isTimeStamp()
	 * @see #getOptFieldsType()
	 * @generated
	 */
	EAttribute getOptFieldsType_TimeStamp();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.SCLType <em>SCL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SCL Type</em>'.
	 * @see ch.iec._61850._2006.scl.SCLType
	 * @generated
	 */
	EClass getSCLType();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.SCLType#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see ch.iec._61850._2006.scl.SCLType#getHeader()
	 * @see #getSCLType()
	 * @generated
	 */
	EReference getSCLType_Header();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.SCLType#getSubstation <em>Substation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Substation</em>'.
	 * @see ch.iec._61850._2006.scl.SCLType#getSubstation()
	 * @see #getSCLType()
	 * @generated
	 */
	EReference getSCLType_Substation();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.SCLType#getCommunication <em>Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Communication</em>'.
	 * @see ch.iec._61850._2006.scl.SCLType#getCommunication()
	 * @see #getSCLType()
	 * @generated
	 */
	EReference getSCLType_Communication();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.SCLType#getIED <em>IED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>IED</em>'.
	 * @see ch.iec._61850._2006.scl.SCLType#getIED()
	 * @see #getSCLType()
	 * @generated
	 */
	EReference getSCLType_IED();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.SCLType#getDataTypeTemplates <em>Data Type Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type Templates</em>'.
	 * @see ch.iec._61850._2006.scl.SCLType#getDataTypeTemplates()
	 * @see #getSCLType()
	 * @generated
	 */
	EReference getSCLType_DataTypeTemplates();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.SettingGroupsType <em>Setting Groups Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setting Groups Type</em>'.
	 * @see ch.iec._61850._2006.scl.SettingGroupsType
	 * @generated
	 */
	EClass getSettingGroupsType();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.SettingGroupsType#getSGEdit <em>SG Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SG Edit</em>'.
	 * @see ch.iec._61850._2006.scl.SettingGroupsType#getSGEdit()
	 * @see #getSettingGroupsType()
	 * @generated
	 */
	EReference getSettingGroupsType_SGEdit();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.SettingGroupsType#getConfSG <em>Conf SG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conf SG</em>'.
	 * @see ch.iec._61850._2006.scl.SettingGroupsType#getConfSG()
	 * @see #getSettingGroupsType()
	 * @generated
	 */
	EReference getSettingGroupsType_ConfSG();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.SmvOptsType <em>Smv Opts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smv Opts Type</em>'.
	 * @see ch.iec._61850._2006.scl.SmvOptsType
	 * @generated
	 */
	EClass getSmvOptsType();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.SmvOptsType#isDataSet <em>Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Set</em>'.
	 * @see ch.iec._61850._2006.scl.SmvOptsType#isDataSet()
	 * @see #getSmvOptsType()
	 * @generated
	 */
	EAttribute getSmvOptsType_DataSet();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.SmvOptsType#isRefreshTime <em>Refresh Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refresh Time</em>'.
	 * @see ch.iec._61850._2006.scl.SmvOptsType#isRefreshTime()
	 * @see #getSmvOptsType()
	 * @generated
	 */
	EAttribute getSmvOptsType_RefreshTime();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.SmvOptsType#isSampleRate <em>Sample Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sample Rate</em>'.
	 * @see ch.iec._61850._2006.scl.SmvOptsType#isSampleRate()
	 * @see #getSmvOptsType()
	 * @generated
	 */
	EAttribute getSmvOptsType_SampleRate();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.SmvOptsType#isSampleSynchronized <em>Sample Synchronized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sample Synchronized</em>'.
	 * @see ch.iec._61850._2006.scl.SmvOptsType#isSampleSynchronized()
	 * @see #getSmvOptsType()
	 * @generated
	 */
	EAttribute getSmvOptsType_SampleSynchronized();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.SmvOptsType#isSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security</em>'.
	 * @see ch.iec._61850._2006.scl.SmvOptsType#isSecurity()
	 * @see #getSmvOptsType()
	 * @generated
	 */
	EAttribute getSmvOptsType_Security();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TAbstractConductingEquipment <em>TAbstract Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAbstract Conducting Equipment</em>'.
	 * @see ch.iec._61850._2006.scl.TAbstractConductingEquipment
	 * @generated
	 */
	EClass getTAbstractConductingEquipment();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TAbstractConductingEquipment#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terminal</em>'.
	 * @see ch.iec._61850._2006.scl.TAbstractConductingEquipment#getTerminal()
	 * @see #getTAbstractConductingEquipment()
	 * @generated
	 */
	EReference getTAbstractConductingEquipment_Terminal();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TAbstractConductingEquipment#getSubEquipment <em>Sub Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Equipment</em>'.
	 * @see ch.iec._61850._2006.scl.TAbstractConductingEquipment#getSubEquipment()
	 * @see #getTAbstractConductingEquipment()
	 * @generated
	 */
	EReference getTAbstractConductingEquipment_SubEquipment();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TAbstractDataAttribute <em>TAbstract Data Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAbstract Data Attribute</em>'.
	 * @see ch.iec._61850._2006.scl.TAbstractDataAttribute
	 * @generated
	 */
	EClass getTAbstractDataAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TAbstractDataAttribute#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Val</em>'.
	 * @see ch.iec._61850._2006.scl.TAbstractDataAttribute#getVal()
	 * @see #getTAbstractDataAttribute()
	 * @generated
	 */
	EReference getTAbstractDataAttribute_Val();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TAbstractDataAttribute#getBType <em>BType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BType</em>'.
	 * @see ch.iec._61850._2006.scl.TAbstractDataAttribute#getBType()
	 * @see #getTAbstractDataAttribute()
	 * @generated
	 */
	EAttribute getTAbstractDataAttribute_BType();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TAbstractDataAttribute#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see ch.iec._61850._2006.scl.TAbstractDataAttribute#getCount()
	 * @see #getTAbstractDataAttribute()
	 * @generated
	 */
	EAttribute getTAbstractDataAttribute_Count();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TAbstractDataAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.iec._61850._2006.scl.TAbstractDataAttribute#getName()
	 * @see #getTAbstractDataAttribute()
	 * @generated
	 */
	EAttribute getTAbstractDataAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TAbstractDataAttribute#getSAddr <em>SAddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SAddr</em>'.
	 * @see ch.iec._61850._2006.scl.TAbstractDataAttribute#getSAddr()
	 * @see #getTAbstractDataAttribute()
	 * @generated
	 */
	EAttribute getTAbstractDataAttribute_SAddr();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TAbstractDataAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ch.iec._61850._2006.scl.TAbstractDataAttribute#getType()
	 * @see #getTAbstractDataAttribute()
	 * @generated
	 */
	EAttribute getTAbstractDataAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TAbstractDataAttribute#getValKind <em>Val Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val Kind</em>'.
	 * @see ch.iec._61850._2006.scl.TAbstractDataAttribute#getValKind()
	 * @see #getTAbstractDataAttribute()
	 * @generated
	 */
	EAttribute getTAbstractDataAttribute_ValKind();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TAbstractDataAttribute#getPrintedType <em>Printed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Printed Type</em>'.
	 * @see ch.iec._61850._2006.scl.TAbstractDataAttribute#getPrintedType()
	 * @see #getTAbstractDataAttribute()
	 * @generated
	 */
	EAttribute getTAbstractDataAttribute_PrintedType();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TAbstractDataAttribute#getCoderType <em>Coder Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coder Type</em>'.
	 * @see ch.iec._61850._2006.scl.TAbstractDataAttribute#getCoderType()
	 * @see #getTAbstractDataAttribute()
	 * @generated
	 */
	EAttribute getTAbstractDataAttribute_CoderType();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TAccessControl <em>TAccess Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAccess Control</em>'.
	 * @see ch.iec._61850._2006.scl.TAccessControl
	 * @generated
	 */
	EClass getTAccessControl();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TAccessPoint <em>TAccess Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAccess Point</em>'.
	 * @see ch.iec._61850._2006.scl.TAccessPoint
	 * @generated
	 */
	EClass getTAccessPoint();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TAccessPoint#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Server</em>'.
	 * @see ch.iec._61850._2006.scl.TAccessPoint#getServer()
	 * @see #getTAccessPoint()
	 * @generated
	 */
	EReference getTAccessPoint_Server();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TAccessPoint#getLN <em>LN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>LN</em>'.
	 * @see ch.iec._61850._2006.scl.TAccessPoint#getLN()
	 * @see #getTAccessPoint()
	 * @generated
	 */
	EReference getTAccessPoint_LN();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TAccessPoint#isClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clock</em>'.
	 * @see ch.iec._61850._2006.scl.TAccessPoint#isClock()
	 * @see #getTAccessPoint()
	 * @generated
	 */
	EAttribute getTAccessPoint_Clock();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TAccessPoint#isRouter <em>Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Router</em>'.
	 * @see ch.iec._61850._2006.scl.TAccessPoint#isRouter()
	 * @see #getTAccessPoint()
	 * @generated
	 */
	EAttribute getTAccessPoint_Router();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TAddress <em>TAddress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAddress</em>'.
	 * @see ch.iec._61850._2006.scl.TAddress
	 * @generated
	 */
	EClass getTAddress();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TAddress#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see ch.iec._61850._2006.scl.TAddress#getP()
	 * @see #getTAddress()
	 * @generated
	 */
	EReference getTAddress_P();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TAnyContentFromOtherNamespace <em>TAny Content From Other Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAny Content From Other Namespace</em>'.
	 * @see ch.iec._61850._2006.scl.TAnyContentFromOtherNamespace
	 * @generated
	 */
	EClass getTAnyContentFromOtherNamespace();

	/**
	 * Returns the meta object for the attribute list '{@link ch.iec._61850._2006.scl.TAnyContentFromOtherNamespace#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see ch.iec._61850._2006.scl.TAnyContentFromOtherNamespace#getMixed()
	 * @see #getTAnyContentFromOtherNamespace()
	 * @generated
	 */
	EAttribute getTAnyContentFromOtherNamespace_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link ch.iec._61850._2006.scl.TAnyContentFromOtherNamespace#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see ch.iec._61850._2006.scl.TAnyContentFromOtherNamespace#getGroup()
	 * @see #getTAnyContentFromOtherNamespace()
	 * @generated
	 */
	EAttribute getTAnyContentFromOtherNamespace_Group();

	/**
	 * Returns the meta object for the attribute list '{@link ch.iec._61850._2006.scl.TAnyContentFromOtherNamespace#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see ch.iec._61850._2006.scl.TAnyContentFromOtherNamespace#getAny()
	 * @see #getTAnyContentFromOtherNamespace()
	 * @generated
	 */
	EAttribute getTAnyContentFromOtherNamespace_Any();

	/**
	 * Returns the meta object for the attribute list '{@link ch.iec._61850._2006.scl.TAnyContentFromOtherNamespace#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see ch.iec._61850._2006.scl.TAnyContentFromOtherNamespace#getAnyAttribute()
	 * @see #getTAnyContentFromOtherNamespace()
	 * @generated
	 */
	EAttribute getTAnyContentFromOtherNamespace_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TAnyLN <em>TAny LN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAny LN</em>'.
	 * @see ch.iec._61850._2006.scl.TAnyLN
	 * @generated
	 */
	EClass getTAnyLN();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TAnyLN#getDataSet <em>Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Set</em>'.
	 * @see ch.iec._61850._2006.scl.TAnyLN#getDataSet()
	 * @see #getTAnyLN()
	 * @generated
	 */
	EReference getTAnyLN_DataSet();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TAnyLN#getReportControl <em>Report Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Report Control</em>'.
	 * @see ch.iec._61850._2006.scl.TAnyLN#getReportControl()
	 * @see #getTAnyLN()
	 * @generated
	 */
	EReference getTAnyLN_ReportControl();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TAnyLN#getLogControl <em>Log Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Log Control</em>'.
	 * @see ch.iec._61850._2006.scl.TAnyLN#getLogControl()
	 * @see #getTAnyLN()
	 * @generated
	 */
	EReference getTAnyLN_LogControl();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TAnyLN#getDOI <em>DOI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DOI</em>'.
	 * @see ch.iec._61850._2006.scl.TAnyLN#getDOI()
	 * @see #getTAnyLN()
	 * @generated
	 */
	EReference getTAnyLN_DOI();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TAnyLN#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inputs</em>'.
	 * @see ch.iec._61850._2006.scl.TAnyLN#getInputs()
	 * @see #getTAnyLN()
	 * @generated
	 */
	EReference getTAnyLN_Inputs();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TAnyLN#getLnType <em>Ln Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ln Type</em>'.
	 * @see ch.iec._61850._2006.scl.TAnyLN#getLnType()
	 * @see #getTAnyLN()
	 * @generated
	 */
	EAttribute getTAnyLN_LnType();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TAssociation <em>TAssociation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAssociation</em>'.
	 * @see ch.iec._61850._2006.scl.TAssociation
	 * @generated
	 */
	EClass getTAssociation();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TAssociation#getAssociationID <em>Association ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Association ID</em>'.
	 * @see ch.iec._61850._2006.scl.TAssociation#getAssociationID()
	 * @see #getTAssociation()
	 * @generated
	 */
	EAttribute getTAssociation_AssociationID();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TAssociation#getIedName <em>Ied Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ied Name</em>'.
	 * @see ch.iec._61850._2006.scl.TAssociation#getIedName()
	 * @see #getTAssociation()
	 * @generated
	 */
	EAttribute getTAssociation_IedName();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TAssociation#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see ch.iec._61850._2006.scl.TAssociation#getKind()
	 * @see #getTAssociation()
	 * @generated
	 */
	EAttribute getTAssociation_Kind();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TAssociation#getLdInst <em>Ld Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ld Inst</em>'.
	 * @see ch.iec._61850._2006.scl.TAssociation#getLdInst()
	 * @see #getTAssociation()
	 * @generated
	 */
	EAttribute getTAssociation_LdInst();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TAssociation#getLnClass <em>Ln Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ln Class</em>'.
	 * @see ch.iec._61850._2006.scl.TAssociation#getLnClass()
	 * @see #getTAssociation()
	 * @generated
	 */
	EAttribute getTAssociation_LnClass();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TAssociation#getLnInst <em>Ln Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ln Inst</em>'.
	 * @see ch.iec._61850._2006.scl.TAssociation#getLnInst()
	 * @see #getTAssociation()
	 * @generated
	 */
	EAttribute getTAssociation_LnInst();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TAssociation#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see ch.iec._61850._2006.scl.TAssociation#getPrefix()
	 * @see #getTAssociation()
	 * @generated
	 */
	EAttribute getTAssociation_Prefix();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TBaseElement <em>TBase Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TBase Element</em>'.
	 * @see ch.iec._61850._2006.scl.TBaseElement
	 * @generated
	 */
	EClass getTBaseElement();

	/**
	 * Returns the meta object for the attribute list '{@link ch.iec._61850._2006.scl.TBaseElement#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see ch.iec._61850._2006.scl.TBaseElement#getAny()
	 * @see #getTBaseElement()
	 * @generated
	 */
	EAttribute getTBaseElement_Any();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TBaseElement#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see ch.iec._61850._2006.scl.TBaseElement#getText()
	 * @see #getTBaseElement()
	 * @generated
	 */
	EReference getTBaseElement_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TBaseElement#getPrivate <em>Private</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Private</em>'.
	 * @see ch.iec._61850._2006.scl.TBaseElement#getPrivate()
	 * @see #getTBaseElement()
	 * @generated
	 */
	EReference getTBaseElement_Private();

	/**
	 * Returns the meta object for the attribute list '{@link ch.iec._61850._2006.scl.TBaseElement#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see ch.iec._61850._2006.scl.TBaseElement#getAnyAttribute()
	 * @see #getTBaseElement()
	 * @generated
	 */
	EAttribute getTBaseElement_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TBay <em>TBay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TBay</em>'.
	 * @see ch.iec._61850._2006.scl.TBay
	 * @generated
	 */
	EClass getTBay();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TBay#getConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conducting Equipment</em>'.
	 * @see ch.iec._61850._2006.scl.TBay#getConductingEquipment()
	 * @see #getTBay()
	 * @generated
	 */
	EReference getTBay_ConductingEquipment();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TBay#getConnectivityNode <em>Connectivity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectivity Node</em>'.
	 * @see ch.iec._61850._2006.scl.TBay#getConnectivityNode()
	 * @see #getTBay()
	 * @generated
	 */
	EReference getTBay_ConnectivityNode();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TBDA <em>TBDA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TBDA</em>'.
	 * @see ch.iec._61850._2006.scl.TBDA
	 * @generated
	 */
	EClass getTBDA();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TBitRateInMbPerSec <em>TBit Rate In Mb Per Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TBit Rate In Mb Per Sec</em>'.
	 * @see ch.iec._61850._2006.scl.TBitRateInMbPerSec
	 * @generated
	 */
	EClass getTBitRateInMbPerSec();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TClientLN <em>TClient LN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TClient LN</em>'.
	 * @see ch.iec._61850._2006.scl.TClientLN
	 * @generated
	 */
	EClass getTClientLN();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TClientLN#getIedName <em>Ied Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ied Name</em>'.
	 * @see ch.iec._61850._2006.scl.TClientLN#getIedName()
	 * @see #getTClientLN()
	 * @generated
	 */
	EAttribute getTClientLN_IedName();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TClientLN#getLdInst <em>Ld Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ld Inst</em>'.
	 * @see ch.iec._61850._2006.scl.TClientLN#getLdInst()
	 * @see #getTClientLN()
	 * @generated
	 */
	EAttribute getTClientLN_LdInst();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TClientLN#getLnClass <em>Ln Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ln Class</em>'.
	 * @see ch.iec._61850._2006.scl.TClientLN#getLnClass()
	 * @see #getTClientLN()
	 * @generated
	 */
	EAttribute getTClientLN_LnClass();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TClientLN#getLnInst <em>Ln Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ln Inst</em>'.
	 * @see ch.iec._61850._2006.scl.TClientLN#getLnInst()
	 * @see #getTClientLN()
	 * @generated
	 */
	EAttribute getTClientLN_LnInst();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TClientLN#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see ch.iec._61850._2006.scl.TClientLN#getPrefix()
	 * @see #getTClientLN()
	 * @generated
	 */
	EAttribute getTClientLN_Prefix();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TClientServices <em>TClient Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TClient Services</em>'.
	 * @see ch.iec._61850._2006.scl.TClientServices
	 * @generated
	 */
	EClass getTClientServices();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TClientServices#isBufReport <em>Buf Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buf Report</em>'.
	 * @see ch.iec._61850._2006.scl.TClientServices#isBufReport()
	 * @see #getTClientServices()
	 * @generated
	 */
	EAttribute getTClientServices_BufReport();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TClientServices#isGoose <em>Goose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goose</em>'.
	 * @see ch.iec._61850._2006.scl.TClientServices#isGoose()
	 * @see #getTClientServices()
	 * @generated
	 */
	EAttribute getTClientServices_Goose();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TClientServices#isGsse <em>Gsse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gsse</em>'.
	 * @see ch.iec._61850._2006.scl.TClientServices#isGsse()
	 * @see #getTClientServices()
	 * @generated
	 */
	EAttribute getTClientServices_Gsse();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TClientServices#isReadLog <em>Read Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Log</em>'.
	 * @see ch.iec._61850._2006.scl.TClientServices#isReadLog()
	 * @see #getTClientServices()
	 * @generated
	 */
	EAttribute getTClientServices_ReadLog();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TClientServices#isUnbufReport <em>Unbuf Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unbuf Report</em>'.
	 * @see ch.iec._61850._2006.scl.TClientServices#isUnbufReport()
	 * @see #getTClientServices()
	 * @generated
	 */
	EAttribute getTClientServices_UnbufReport();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TCommunication <em>TCommunication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCommunication</em>'.
	 * @see ch.iec._61850._2006.scl.TCommunication
	 * @generated
	 */
	EClass getTCommunication();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TCommunication#getSubNetwork <em>Sub Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Network</em>'.
	 * @see ch.iec._61850._2006.scl.TCommunication#getSubNetwork()
	 * @see #getTCommunication()
	 * @generated
	 */
	EReference getTCommunication_SubNetwork();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TConductingEquipment <em>TConducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TConducting Equipment</em>'.
	 * @see ch.iec._61850._2006.scl.TConductingEquipment
	 * @generated
	 */
	EClass getTConductingEquipment();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TConductingEquipment#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ch.iec._61850._2006.scl.TConductingEquipment#getType()
	 * @see #getTConductingEquipment()
	 * @generated
	 */
	EAttribute getTConductingEquipment_Type();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TConfLNs <em>TConf LNs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TConf LNs</em>'.
	 * @see ch.iec._61850._2006.scl.TConfLNs
	 * @generated
	 */
	EClass getTConfLNs();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TConfLNs#isFixLnInst <em>Fix Ln Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fix Ln Inst</em>'.
	 * @see ch.iec._61850._2006.scl.TConfLNs#isFixLnInst()
	 * @see #getTConfLNs()
	 * @generated
	 */
	EAttribute getTConfLNs_FixLnInst();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TConfLNs#isFixPrefix <em>Fix Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fix Prefix</em>'.
	 * @see ch.iec._61850._2006.scl.TConfLNs#isFixPrefix()
	 * @see #getTConfLNs()
	 * @generated
	 */
	EAttribute getTConfLNs_FixPrefix();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TConnectedAP <em>TConnected AP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TConnected AP</em>'.
	 * @see ch.iec._61850._2006.scl.TConnectedAP
	 * @generated
	 */
	EClass getTConnectedAP();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TConnectedAP#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see ch.iec._61850._2006.scl.TConnectedAP#getAddress()
	 * @see #getTConnectedAP()
	 * @generated
	 */
	EReference getTConnectedAP_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TConnectedAP#getGSE <em>GSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>GSE</em>'.
	 * @see ch.iec._61850._2006.scl.TConnectedAP#getGSE()
	 * @see #getTConnectedAP()
	 * @generated
	 */
	EReference getTConnectedAP_GSE();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TConnectedAP#getSMV <em>SMV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SMV</em>'.
	 * @see ch.iec._61850._2006.scl.TConnectedAP#getSMV()
	 * @see #getTConnectedAP()
	 * @generated
	 */
	EReference getTConnectedAP_SMV();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TConnectedAP#getPhysConn <em>Phys Conn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Phys Conn</em>'.
	 * @see ch.iec._61850._2006.scl.TConnectedAP#getPhysConn()
	 * @see #getTConnectedAP()
	 * @generated
	 */
	EReference getTConnectedAP_PhysConn();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TConnectedAP#getApName <em>Ap Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ap Name</em>'.
	 * @see ch.iec._61850._2006.scl.TConnectedAP#getApName()
	 * @see #getTConnectedAP()
	 * @generated
	 */
	EAttribute getTConnectedAP_ApName();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TConnectedAP#getIedName <em>Ied Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ied Name</em>'.
	 * @see ch.iec._61850._2006.scl.TConnectedAP#getIedName()
	 * @see #getTConnectedAP()
	 * @generated
	 */
	EAttribute getTConnectedAP_IedName();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TConnectivityNode <em>TConnectivity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TConnectivity Node</em>'.
	 * @see ch.iec._61850._2006.scl.TConnectivityNode
	 * @generated
	 */
	EClass getTConnectivityNode();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TConnectivityNode#getPathName <em>Path Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Name</em>'.
	 * @see ch.iec._61850._2006.scl.TConnectivityNode#getPathName()
	 * @see #getTConnectivityNode()
	 * @generated
	 */
	EAttribute getTConnectivityNode_PathName();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TControl <em>TControl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TControl</em>'.
	 * @see ch.iec._61850._2006.scl.TControl
	 * @generated
	 */
	EClass getTControl();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TControl#getDatSet <em>Dat Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dat Set</em>'.
	 * @see ch.iec._61850._2006.scl.TControl#getDatSet()
	 * @see #getTControl()
	 * @generated
	 */
	EAttribute getTControl_DatSet();

	/**
	 * Returns the meta object for the reference '{@link ch.iec._61850._2006.scl.TControl#getControlBlock <em>Control Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control Block</em>'.
	 * @see ch.iec._61850._2006.scl.TControl#getControlBlock()
	 * @see #getTControl()
	 * @generated
	 */
	EReference getTControl_ControlBlock();

	/**
	 * Returns the meta object for the reference '{@link ch.iec._61850._2006.scl.TControl#getDataSetRef <em>Data Set Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Set Ref</em>'.
	 * @see ch.iec._61850._2006.scl.TControl#getDataSetRef()
	 * @see #getTControl()
	 * @generated
	 */
	EReference getTControl_DataSetRef();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TControlBlock <em>TControl Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TControl Block</em>'.
	 * @see ch.iec._61850._2006.scl.TControlBlock
	 * @generated
	 */
	EClass getTControlBlock();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TControlBlock#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see ch.iec._61850._2006.scl.TControlBlock#getAddress()
	 * @see #getTControlBlock()
	 * @generated
	 */
	EReference getTControlBlock_Address();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TControlBlock#getCbName <em>Cb Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cb Name</em>'.
	 * @see ch.iec._61850._2006.scl.TControlBlock#getCbName()
	 * @see #getTControlBlock()
	 * @generated
	 */
	EAttribute getTControlBlock_CbName();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TControlBlock#getLdInst <em>Ld Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ld Inst</em>'.
	 * @see ch.iec._61850._2006.scl.TControlBlock#getLdInst()
	 * @see #getTControlBlock()
	 * @generated
	 */
	EAttribute getTControlBlock_LdInst();

	/**
	 * Returns the meta object for the reference '{@link ch.iec._61850._2006.scl.TControlBlock#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control</em>'.
	 * @see ch.iec._61850._2006.scl.TControlBlock#getControl()
	 * @see #getTControlBlock()
	 * @generated
	 */
	EReference getTControlBlock_Control();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TControlWithIEDName <em>TControl With IED Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TControl With IED Name</em>'.
	 * @see ch.iec._61850._2006.scl.TControlWithIEDName
	 * @generated
	 */
	EClass getTControlWithIEDName();

	/**
	 * Returns the meta object for the attribute list '{@link ch.iec._61850._2006.scl.TControlWithIEDName#getIEDName <em>IED Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>IED Name</em>'.
	 * @see ch.iec._61850._2006.scl.TControlWithIEDName#getIEDName()
	 * @see #getTControlWithIEDName()
	 * @generated
	 */
	EAttribute getTControlWithIEDName_IEDName();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TControlWithIEDName#getConfRev <em>Conf Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conf Rev</em>'.
	 * @see ch.iec._61850._2006.scl.TControlWithIEDName#getConfRev()
	 * @see #getTControlWithIEDName()
	 * @generated
	 */
	EAttribute getTControlWithIEDName_ConfRev();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TControlWithTriggerOpt <em>TControl With Trigger Opt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TControl With Trigger Opt</em>'.
	 * @see ch.iec._61850._2006.scl.TControlWithTriggerOpt
	 * @generated
	 */
	EClass getTControlWithTriggerOpt();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TControlWithTriggerOpt#getTrgOps <em>Trg Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trg Ops</em>'.
	 * @see ch.iec._61850._2006.scl.TControlWithTriggerOpt#getTrgOps()
	 * @see #getTControlWithTriggerOpt()
	 * @generated
	 */
	EReference getTControlWithTriggerOpt_TrgOps();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TControlWithTriggerOpt#getIntgPd <em>Intg Pd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intg Pd</em>'.
	 * @see ch.iec._61850._2006.scl.TControlWithTriggerOpt#getIntgPd()
	 * @see #getTControlWithTriggerOpt()
	 * @generated
	 */
	EAttribute getTControlWithTriggerOpt_IntgPd();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TDA <em>TDA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDA</em>'.
	 * @see ch.iec._61850._2006.scl.TDA
	 * @generated
	 */
	EClass getTDA();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TDA#isDchg <em>Dchg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dchg</em>'.
	 * @see ch.iec._61850._2006.scl.TDA#isDchg()
	 * @see #getTDA()
	 * @generated
	 */
	EAttribute getTDA_Dchg();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TDA#isDupd <em>Dupd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dupd</em>'.
	 * @see ch.iec._61850._2006.scl.TDA#isDupd()
	 * @see #getTDA()
	 * @generated
	 */
	EAttribute getTDA_Dupd();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TDA#getFc <em>Fc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fc</em>'.
	 * @see ch.iec._61850._2006.scl.TDA#getFc()
	 * @see #getTDA()
	 * @generated
	 */
	EAttribute getTDA_Fc();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TDA#isQchg <em>Qchg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qchg</em>'.
	 * @see ch.iec._61850._2006.scl.TDA#isQchg()
	 * @see #getTDA()
	 * @generated
	 */
	EAttribute getTDA_Qchg();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TDAI <em>TDAI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDAI</em>'.
	 * @see ch.iec._61850._2006.scl.TDAI
	 * @generated
	 */
	EClass getTDAI();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TDAI#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Val</em>'.
	 * @see ch.iec._61850._2006.scl.TDAI#getVal()
	 * @see #getTDAI()
	 * @generated
	 */
	EReference getTDAI_Val();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TDAI#getIx <em>Ix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ix</em>'.
	 * @see ch.iec._61850._2006.scl.TDAI#getIx()
	 * @see #getTDAI()
	 * @generated
	 */
	EAttribute getTDAI_Ix();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TDAI#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.iec._61850._2006.scl.TDAI#getName()
	 * @see #getTDAI()
	 * @generated
	 */
	EAttribute getTDAI_Name();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TDAI#getSAddr <em>SAddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SAddr</em>'.
	 * @see ch.iec._61850._2006.scl.TDAI#getSAddr()
	 * @see #getTDAI()
	 * @generated
	 */
	EAttribute getTDAI_SAddr();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TDAI#getValKind <em>Val Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val Kind</em>'.
	 * @see ch.iec._61850._2006.scl.TDAI#getValKind()
	 * @see #getTDAI()
	 * @generated
	 */
	EAttribute getTDAI_ValKind();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TDataSet <em>TData Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TData Set</em>'.
	 * @see ch.iec._61850._2006.scl.TDataSet
	 * @generated
	 */
	EClass getTDataSet();

	/**
	 * Returns the meta object for the attribute list '{@link ch.iec._61850._2006.scl.TDataSet#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see ch.iec._61850._2006.scl.TDataSet#getGroup()
	 * @see #getTDataSet()
	 * @generated
	 */
	EAttribute getTDataSet_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TDataSet#getFCDA <em>FCDA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>FCDA</em>'.
	 * @see ch.iec._61850._2006.scl.TDataSet#getFCDA()
	 * @see #getTDataSet()
	 * @generated
	 */
	EReference getTDataSet_FCDA();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TDataSet#getFCCB <em>FCCB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>FCCB</em>'.
	 * @see ch.iec._61850._2006.scl.TDataSet#getFCCB()
	 * @see #getTDataSet()
	 * @generated
	 */
	EReference getTDataSet_FCCB();

	/**
	 * Returns the meta object for the reference list '{@link ch.iec._61850._2006.scl.TDataSet#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Control</em>'.
	 * @see ch.iec._61850._2006.scl.TDataSet#getControl()
	 * @see #getTDataSet()
	 * @generated
	 */
	EReference getTDataSet_Control();

	/**
	 * Returns the meta object for the reference list '{@link ch.iec._61850._2006.scl.TDataSet#getExtRef <em>Ext Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ext Ref</em>'.
	 * @see ch.iec._61850._2006.scl.TDataSet#getExtRef()
	 * @see #getTDataSet()
	 * @generated
	 */
	EReference getTDataSet_ExtRef();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TDataTypeTemplates <em>TData Type Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TData Type Templates</em>'.
	 * @see ch.iec._61850._2006.scl.TDataTypeTemplates
	 * @generated
	 */
	EClass getTDataTypeTemplates();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TDataTypeTemplates#getLNodeType <em>LNode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>LNode Type</em>'.
	 * @see ch.iec._61850._2006.scl.TDataTypeTemplates#getLNodeType()
	 * @see #getTDataTypeTemplates()
	 * @generated
	 */
	EReference getTDataTypeTemplates_LNodeType();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TDataTypeTemplates#getDOType <em>DO Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DO Type</em>'.
	 * @see ch.iec._61850._2006.scl.TDataTypeTemplates#getDOType()
	 * @see #getTDataTypeTemplates()
	 * @generated
	 */
	EReference getTDataTypeTemplates_DOType();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TDataTypeTemplates#getDAType <em>DA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DA Type</em>'.
	 * @see ch.iec._61850._2006.scl.TDataTypeTemplates#getDAType()
	 * @see #getTDataTypeTemplates()
	 * @generated
	 */
	EReference getTDataTypeTemplates_DAType();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TDataTypeTemplates#getEnumType <em>Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum Type</em>'.
	 * @see ch.iec._61850._2006.scl.TDataTypeTemplates#getEnumType()
	 * @see #getTDataTypeTemplates()
	 * @generated
	 */
	EReference getTDataTypeTemplates_EnumType();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TDAType <em>TDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDA Type</em>'.
	 * @see ch.iec._61850._2006.scl.TDAType
	 * @generated
	 */
	EClass getTDAType();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TDAType#getBDA <em>BDA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>BDA</em>'.
	 * @see ch.iec._61850._2006.scl.TDAType#getBDA()
	 * @see #getTDAType()
	 * @generated
	 */
	EReference getTDAType_BDA();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TDAType#getIedType <em>Ied Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ied Type</em>'.
	 * @see ch.iec._61850._2006.scl.TDAType#getIedType()
	 * @see #getTDAType()
	 * @generated
	 */
	EAttribute getTDAType_IedType();

	/**
	 * Returns the meta object for the reference list '{@link ch.iec._61850._2006.scl.TDAType#getExtRef <em>Ext Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ext Ref</em>'.
	 * @see ch.iec._61850._2006.scl.TDAType#getExtRef()
	 * @see #getTDAType()
	 * @generated
	 */
	EReference getTDAType_ExtRef();

	/**
	 * Returns the meta object for the reference list '{@link ch.iec._61850._2006.scl.TDAType#getFcda <em>Fcda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fcda</em>'.
	 * @see ch.iec._61850._2006.scl.TDAType#getFcda()
	 * @see #getTDAType()
	 * @generated
	 */
	EReference getTDAType_Fcda();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TDO <em>TDO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDO</em>'.
	 * @see ch.iec._61850._2006.scl.TDO
	 * @generated
	 */
	EClass getTDO();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TDO#getAccessControl <em>Access Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Control</em>'.
	 * @see ch.iec._61850._2006.scl.TDO#getAccessControl()
	 * @see #getTDO()
	 * @generated
	 */
	EAttribute getTDO_AccessControl();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TDO#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.iec._61850._2006.scl.TDO#getName()
	 * @see #getTDO()
	 * @generated
	 */
	EAttribute getTDO_Name();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TDO#isTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see ch.iec._61850._2006.scl.TDO#isTransient()
	 * @see #getTDO()
	 * @generated
	 */
	EAttribute getTDO_Transient();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TDO#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ch.iec._61850._2006.scl.TDO#getType()
	 * @see #getTDO()
	 * @generated
	 */
	EAttribute getTDO_Type();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TDOI <em>TDOI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDOI</em>'.
	 * @see ch.iec._61850._2006.scl.TDOI
	 * @generated
	 */
	EClass getTDOI();

	/**
	 * Returns the meta object for the attribute list '{@link ch.iec._61850._2006.scl.TDOI#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see ch.iec._61850._2006.scl.TDOI#getGroup()
	 * @see #getTDOI()
	 * @generated
	 */
	EAttribute getTDOI_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TDOI#getSDI <em>SDI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SDI</em>'.
	 * @see ch.iec._61850._2006.scl.TDOI#getSDI()
	 * @see #getTDOI()
	 * @generated
	 */
	EReference getTDOI_SDI();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TDOI#getDAI <em>DAI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DAI</em>'.
	 * @see ch.iec._61850._2006.scl.TDOI#getDAI()
	 * @see #getTDOI()
	 * @generated
	 */
	EReference getTDOI_DAI();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TDOI#getAccessControl <em>Access Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Control</em>'.
	 * @see ch.iec._61850._2006.scl.TDOI#getAccessControl()
	 * @see #getTDOI()
	 * @generated
	 */
	EAttribute getTDOI_AccessControl();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TDOI#getIx <em>Ix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ix</em>'.
	 * @see ch.iec._61850._2006.scl.TDOI#getIx()
	 * @see #getTDOI()
	 * @generated
	 */
	EAttribute getTDOI_Ix();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TDOI#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.iec._61850._2006.scl.TDOI#getName()
	 * @see #getTDOI()
	 * @generated
	 */
	EAttribute getTDOI_Name();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TDOType <em>TDO Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDO Type</em>'.
	 * @see ch.iec._61850._2006.scl.TDOType
	 * @generated
	 */
	EClass getTDOType();

	/**
	 * Returns the meta object for the attribute list '{@link ch.iec._61850._2006.scl.TDOType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see ch.iec._61850._2006.scl.TDOType#getGroup()
	 * @see #getTDOType()
	 * @generated
	 */
	EAttribute getTDOType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TDOType#getSDO <em>SDO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SDO</em>'.
	 * @see ch.iec._61850._2006.scl.TDOType#getSDO()
	 * @see #getTDOType()
	 * @generated
	 */
	EReference getTDOType_SDO();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TDOType#getDA <em>DA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DA</em>'.
	 * @see ch.iec._61850._2006.scl.TDOType#getDA()
	 * @see #getTDOType()
	 * @generated
	 */
	EReference getTDOType_DA();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TDOType#getCdc <em>Cdc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cdc</em>'.
	 * @see ch.iec._61850._2006.scl.TDOType#getCdc()
	 * @see #getTDOType()
	 * @generated
	 */
	EAttribute getTDOType_Cdc();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TDOType#getIedType <em>Ied Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ied Type</em>'.
	 * @see ch.iec._61850._2006.scl.TDOType#getIedType()
	 * @see #getTDOType()
	 * @generated
	 */
	EAttribute getTDOType_IedType();

	/**
	 * Returns the meta object for the reference list '{@link ch.iec._61850._2006.scl.TDOType#getExtRef <em>Ext Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ext Ref</em>'.
	 * @see ch.iec._61850._2006.scl.TDOType#getExtRef()
	 * @see #getTDOType()
	 * @generated
	 */
	EReference getTDOType_ExtRef();

	/**
	 * Returns the meta object for the reference list '{@link ch.iec._61850._2006.scl.TDOType#getFcda <em>Fcda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fcda</em>'.
	 * @see ch.iec._61850._2006.scl.TDOType#getFcda()
	 * @see #getTDOType()
	 * @generated
	 */
	EReference getTDOType_Fcda();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TDurationInMilliSec <em>TDuration In Milli Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDuration In Milli Sec</em>'.
	 * @see ch.iec._61850._2006.scl.TDurationInMilliSec
	 * @generated
	 */
	EClass getTDurationInMilliSec();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TDurationInSec <em>TDuration In Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDuration In Sec</em>'.
	 * @see ch.iec._61850._2006.scl.TDurationInSec
	 * @generated
	 */
	EClass getTDurationInSec();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TEnumType <em>TEnum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEnum Type</em>'.
	 * @see ch.iec._61850._2006.scl.TEnumType
	 * @generated
	 */
	EClass getTEnumType();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TEnumType#getEnumVal <em>Enum Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum Val</em>'.
	 * @see ch.iec._61850._2006.scl.TEnumType#getEnumVal()
	 * @see #getTEnumType()
	 * @generated
	 */
	EReference getTEnumType_EnumVal();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TEnumVal <em>TEnum Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEnum Val</em>'.
	 * @see ch.iec._61850._2006.scl.TEnumVal
	 * @generated
	 */
	EClass getTEnumVal();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TEnumVal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ch.iec._61850._2006.scl.TEnumVal#getValue()
	 * @see #getTEnumVal()
	 * @generated
	 */
	EAttribute getTEnumVal_Value();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TEnumVal#getOrd <em>Ord</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ord</em>'.
	 * @see ch.iec._61850._2006.scl.TEnumVal#getOrd()
	 * @see #getTEnumVal()
	 * @generated
	 */
	EAttribute getTEnumVal_Ord();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TEquipment <em>TEquipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEquipment</em>'.
	 * @see ch.iec._61850._2006.scl.TEquipment
	 * @generated
	 */
	EClass getTEquipment();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TEquipment#isVirtual <em>Virtual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Virtual</em>'.
	 * @see ch.iec._61850._2006.scl.TEquipment#isVirtual()
	 * @see #getTEquipment()
	 * @generated
	 */
	EAttribute getTEquipment_Virtual();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TEquipmentContainer <em>TEquipment Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEquipment Container</em>'.
	 * @see ch.iec._61850._2006.scl.TEquipmentContainer
	 * @generated
	 */
	EClass getTEquipmentContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TEquipmentContainer#getPowerTransformer <em>Power Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Power Transformer</em>'.
	 * @see ch.iec._61850._2006.scl.TEquipmentContainer#getPowerTransformer()
	 * @see #getTEquipmentContainer()
	 * @generated
	 */
	EReference getTEquipmentContainer_PowerTransformer();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TEquipmentContainer#getGeneralEquipment <em>General Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>General Equipment</em>'.
	 * @see ch.iec._61850._2006.scl.TEquipmentContainer#getGeneralEquipment()
	 * @see #getTEquipmentContainer()
	 * @generated
	 */
	EReference getTEquipmentContainer_GeneralEquipment();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TExtRef <em>TExt Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TExt Ref</em>'.
	 * @see ch.iec._61850._2006.scl.TExtRef
	 * @generated
	 */
	EClass getTExtRef();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TExtRef#getDaName <em>Da Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Da Name</em>'.
	 * @see ch.iec._61850._2006.scl.TExtRef#getDaName()
	 * @see #getTExtRef()
	 * @generated
	 */
	EAttribute getTExtRef_DaName();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TExtRef#getDoName <em>Do Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Do Name</em>'.
	 * @see ch.iec._61850._2006.scl.TExtRef#getDoName()
	 * @see #getTExtRef()
	 * @generated
	 */
	EAttribute getTExtRef_DoName();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TExtRef#getIedName <em>Ied Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ied Name</em>'.
	 * @see ch.iec._61850._2006.scl.TExtRef#getIedName()
	 * @see #getTExtRef()
	 * @generated
	 */
	EAttribute getTExtRef_IedName();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TExtRef#getIntAddr <em>Int Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int Addr</em>'.
	 * @see ch.iec._61850._2006.scl.TExtRef#getIntAddr()
	 * @see #getTExtRef()
	 * @generated
	 */
	EAttribute getTExtRef_IntAddr();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TExtRef#getLdInst <em>Ld Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ld Inst</em>'.
	 * @see ch.iec._61850._2006.scl.TExtRef#getLdInst()
	 * @see #getTExtRef()
	 * @generated
	 */
	EAttribute getTExtRef_LdInst();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TExtRef#getLnClass <em>Ln Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ln Class</em>'.
	 * @see ch.iec._61850._2006.scl.TExtRef#getLnClass()
	 * @see #getTExtRef()
	 * @generated
	 */
	EAttribute getTExtRef_LnClass();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TExtRef#getLnInst <em>Ln Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ln Inst</em>'.
	 * @see ch.iec._61850._2006.scl.TExtRef#getLnInst()
	 * @see #getTExtRef()
	 * @generated
	 */
	EAttribute getTExtRef_LnInst();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TExtRef#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see ch.iec._61850._2006.scl.TExtRef#getPrefix()
	 * @see #getTExtRef()
	 * @generated
	 */
	EAttribute getTExtRef_Prefix();

	/**
	 * Returns the meta object for the reference '{@link ch.iec._61850._2006.scl.TExtRef#getDataSet <em>Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Set</em>'.
	 * @see ch.iec._61850._2006.scl.TExtRef#getDataSet()
	 * @see #getTExtRef()
	 * @generated
	 */
	EReference getTExtRef_DataSet();

	/**
	 * Returns the meta object for the reference '{@link ch.iec._61850._2006.scl.TExtRef#getDoType <em>Do Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Do Type</em>'.
	 * @see ch.iec._61850._2006.scl.TExtRef#getDoType()
	 * @see #getTExtRef()
	 * @generated
	 */
	EReference getTExtRef_DoType();

	/**
	 * Returns the meta object for the reference '{@link ch.iec._61850._2006.scl.TExtRef#getDaType <em>Da Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Da Type</em>'.
	 * @see ch.iec._61850._2006.scl.TExtRef#getDaType()
	 * @see #getTExtRef()
	 * @generated
	 */
	EReference getTExtRef_DaType();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TFCCB <em>TFCCB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TFCCB</em>'.
	 * @see ch.iec._61850._2006.scl.TFCCB
	 * @generated
	 */
	EClass getTFCCB();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TFCCB#getCbName <em>Cb Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cb Name</em>'.
	 * @see ch.iec._61850._2006.scl.TFCCB#getCbName()
	 * @see #getTFCCB()
	 * @generated
	 */
	EAttribute getTFCCB_CbName();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TFCCB#getDaName <em>Da Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Da Name</em>'.
	 * @see ch.iec._61850._2006.scl.TFCCB#getDaName()
	 * @see #getTFCCB()
	 * @generated
	 */
	EAttribute getTFCCB_DaName();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TFCCB#getFc <em>Fc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fc</em>'.
	 * @see ch.iec._61850._2006.scl.TFCCB#getFc()
	 * @see #getTFCCB()
	 * @generated
	 */
	EAttribute getTFCCB_Fc();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TFCCB#getLdInst <em>Ld Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ld Inst</em>'.
	 * @see ch.iec._61850._2006.scl.TFCCB#getLdInst()
	 * @see #getTFCCB()
	 * @generated
	 */
	EAttribute getTFCCB_LdInst();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TFCCB#getLnClass <em>Ln Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ln Class</em>'.
	 * @see ch.iec._61850._2006.scl.TFCCB#getLnClass()
	 * @see #getTFCCB()
	 * @generated
	 */
	EAttribute getTFCCB_LnClass();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TFCCB#getLnInst <em>Ln Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ln Inst</em>'.
	 * @see ch.iec._61850._2006.scl.TFCCB#getLnInst()
	 * @see #getTFCCB()
	 * @generated
	 */
	EAttribute getTFCCB_LnInst();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TFCCB#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see ch.iec._61850._2006.scl.TFCCB#getPrefix()
	 * @see #getTFCCB()
	 * @generated
	 */
	EAttribute getTFCCB_Prefix();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TFCDA <em>TFCDA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TFCDA</em>'.
	 * @see ch.iec._61850._2006.scl.TFCDA
	 * @generated
	 */
	EClass getTFCDA();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TFCDA#getDaName <em>Da Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Da Name</em>'.
	 * @see ch.iec._61850._2006.scl.TFCDA#getDaName()
	 * @see #getTFCDA()
	 * @generated
	 */
	EAttribute getTFCDA_DaName();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TFCDA#getDoName <em>Do Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Do Name</em>'.
	 * @see ch.iec._61850._2006.scl.TFCDA#getDoName()
	 * @see #getTFCDA()
	 * @generated
	 */
	EAttribute getTFCDA_DoName();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TFCDA#getFc <em>Fc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fc</em>'.
	 * @see ch.iec._61850._2006.scl.TFCDA#getFc()
	 * @see #getTFCDA()
	 * @generated
	 */
	EAttribute getTFCDA_Fc();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TFCDA#getLdInst <em>Ld Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ld Inst</em>'.
	 * @see ch.iec._61850._2006.scl.TFCDA#getLdInst()
	 * @see #getTFCDA()
	 * @generated
	 */
	EAttribute getTFCDA_LdInst();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TFCDA#getLnClass <em>Ln Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ln Class</em>'.
	 * @see ch.iec._61850._2006.scl.TFCDA#getLnClass()
	 * @see #getTFCDA()
	 * @generated
	 */
	EAttribute getTFCDA_LnClass();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TFCDA#getLnInst <em>Ln Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ln Inst</em>'.
	 * @see ch.iec._61850._2006.scl.TFCDA#getLnInst()
	 * @see #getTFCDA()
	 * @generated
	 */
	EAttribute getTFCDA_LnInst();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TFCDA#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see ch.iec._61850._2006.scl.TFCDA#getPrefix()
	 * @see #getTFCDA()
	 * @generated
	 */
	EAttribute getTFCDA_Prefix();

	/**
	 * Returns the meta object for the reference '{@link ch.iec._61850._2006.scl.TFCDA#getDoType <em>Do Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Do Type</em>'.
	 * @see ch.iec._61850._2006.scl.TFCDA#getDoType()
	 * @see #getTFCDA()
	 * @generated
	 */
	EReference getTFCDA_DoType();

	/**
	 * Returns the meta object for the reference '{@link ch.iec._61850._2006.scl.TFCDA#getDaType <em>Da Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Da Type</em>'.
	 * @see ch.iec._61850._2006.scl.TFCDA#getDaType()
	 * @see #getTFCDA()
	 * @generated
	 */
	EReference getTFCDA_DaType();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TFCDA#getPrintedType <em>Printed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Printed Type</em>'.
	 * @see ch.iec._61850._2006.scl.TFCDA#getPrintedType()
	 * @see #getTFCDA()
	 * @generated
	 */
	EAttribute getTFCDA_PrintedType();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TFCDA#getBType <em>BType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BType</em>'.
	 * @see ch.iec._61850._2006.scl.TFCDA#getBType()
	 * @see #getTFCDA()
	 * @generated
	 */
	EAttribute getTFCDA_BType();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TFCDA#getCoderType <em>Coder Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coder Type</em>'.
	 * @see ch.iec._61850._2006.scl.TFCDA#getCoderType()
	 * @see #getTFCDA()
	 * @generated
	 */
	EAttribute getTFCDA_CoderType();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TFCDA#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see ch.iec._61850._2006.scl.TFCDA#getVariableName()
	 * @see #getTFCDA()
	 * @generated
	 */
	EAttribute getTFCDA_VariableName();

	/**
	 * Returns the meta object for the reference '{@link ch.iec._61850._2006.scl.TFCDA#getLnType <em>Ln Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ln Type</em>'.
	 * @see ch.iec._61850._2006.scl.TFCDA#getLnType()
	 * @see #getTFCDA()
	 * @generated
	 */
	EReference getTFCDA_LnType();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TFunction <em>TFunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TFunction</em>'.
	 * @see ch.iec._61850._2006.scl.TFunction
	 * @generated
	 */
	EClass getTFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TFunction#getSubFunction <em>Sub Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Function</em>'.
	 * @see ch.iec._61850._2006.scl.TFunction#getSubFunction()
	 * @see #getTFunction()
	 * @generated
	 */
	EReference getTFunction_SubFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TFunction#getGeneralEquipment <em>General Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>General Equipment</em>'.
	 * @see ch.iec._61850._2006.scl.TFunction#getGeneralEquipment()
	 * @see #getTFunction()
	 * @generated
	 */
	EReference getTFunction_GeneralEquipment();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TGeneralEquipment <em>TGeneral Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TGeneral Equipment</em>'.
	 * @see ch.iec._61850._2006.scl.TGeneralEquipment
	 * @generated
	 */
	EClass getTGeneralEquipment();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TGeneralEquipment#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ch.iec._61850._2006.scl.TGeneralEquipment#getType()
	 * @see #getTGeneralEquipment()
	 * @generated
	 */
	EAttribute getTGeneralEquipment_Type();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TGSE <em>TGSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TGSE</em>'.
	 * @see ch.iec._61850._2006.scl.TGSE
	 * @generated
	 */
	EClass getTGSE();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TGSE#getMinTime <em>Min Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Time</em>'.
	 * @see ch.iec._61850._2006.scl.TGSE#getMinTime()
	 * @see #getTGSE()
	 * @generated
	 */
	EReference getTGSE_MinTime();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TGSE#getMaxTime <em>Max Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Time</em>'.
	 * @see ch.iec._61850._2006.scl.TGSE#getMaxTime()
	 * @see #getTGSE()
	 * @generated
	 */
	EReference getTGSE_MaxTime();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TGSEControl <em>TGSE Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TGSE Control</em>'.
	 * @see ch.iec._61850._2006.scl.TGSEControl
	 * @generated
	 */
	EClass getTGSEControl();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TGSEControl#getAppID <em>App ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App ID</em>'.
	 * @see ch.iec._61850._2006.scl.TGSEControl#getAppID()
	 * @see #getTGSEControl()
	 * @generated
	 */
	EAttribute getTGSEControl_AppID();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TGSEControl#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ch.iec._61850._2006.scl.TGSEControl#getType()
	 * @see #getTGSEControl()
	 * @generated
	 */
	EAttribute getTGSEControl_Type();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TGSESettings <em>TGSE Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TGSE Settings</em>'.
	 * @see ch.iec._61850._2006.scl.TGSESettings
	 * @generated
	 */
	EClass getTGSESettings();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TGSESettings#getAppID <em>App ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App ID</em>'.
	 * @see ch.iec._61850._2006.scl.TGSESettings#getAppID()
	 * @see #getTGSESettings()
	 * @generated
	 */
	EAttribute getTGSESettings_AppID();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TGSESettings#getDataLabel <em>Data Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Label</em>'.
	 * @see ch.iec._61850._2006.scl.TGSESettings#getDataLabel()
	 * @see #getTGSESettings()
	 * @generated
	 */
	EAttribute getTGSESettings_DataLabel();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.THeader <em>THeader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>THeader</em>'.
	 * @see ch.iec._61850._2006.scl.THeader
	 * @generated
	 */
	EClass getTHeader();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.THeader#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see ch.iec._61850._2006.scl.THeader#getText()
	 * @see #getTHeader()
	 * @generated
	 */
	EReference getTHeader_Text();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.THeader#getHistory <em>History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>History</em>'.
	 * @see ch.iec._61850._2006.scl.THeader#getHistory()
	 * @see #getTHeader()
	 * @generated
	 */
	EReference getTHeader_History();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.THeader#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ch.iec._61850._2006.scl.THeader#getId()
	 * @see #getTHeader()
	 * @generated
	 */
	EAttribute getTHeader_Id();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.THeader#getNameStructure <em>Name Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Structure</em>'.
	 * @see ch.iec._61850._2006.scl.THeader#getNameStructure()
	 * @see #getTHeader()
	 * @generated
	 */
	EAttribute getTHeader_NameStructure();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.THeader#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see ch.iec._61850._2006.scl.THeader#getRevision()
	 * @see #getTHeader()
	 * @generated
	 */
	EAttribute getTHeader_Revision();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.THeader#getToolID <em>Tool ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tool ID</em>'.
	 * @see ch.iec._61850._2006.scl.THeader#getToolID()
	 * @see #getTHeader()
	 * @generated
	 */
	EAttribute getTHeader_ToolID();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.THeader#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see ch.iec._61850._2006.scl.THeader#getVersion()
	 * @see #getTHeader()
	 * @generated
	 */
	EAttribute getTHeader_Version();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.THitem <em>THitem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>THitem</em>'.
	 * @see ch.iec._61850._2006.scl.THitem
	 * @generated
	 */
	EClass getTHitem();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.THitem#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see ch.iec._61850._2006.scl.THitem#getRevision()
	 * @see #getTHitem()
	 * @generated
	 */
	EAttribute getTHitem_Revision();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.THitem#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see ch.iec._61850._2006.scl.THitem#getVersion()
	 * @see #getTHitem()
	 * @generated
	 */
	EAttribute getTHitem_Version();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.THitem#getWhat <em>What</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>What</em>'.
	 * @see ch.iec._61850._2006.scl.THitem#getWhat()
	 * @see #getTHitem()
	 * @generated
	 */
	EAttribute getTHitem_What();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.THitem#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When</em>'.
	 * @see ch.iec._61850._2006.scl.THitem#getWhen()
	 * @see #getTHitem()
	 * @generated
	 */
	EAttribute getTHitem_When();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.THitem#getWho <em>Who</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Who</em>'.
	 * @see ch.iec._61850._2006.scl.THitem#getWho()
	 * @see #getTHitem()
	 * @generated
	 */
	EAttribute getTHitem_Who();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.THitem#getWhy <em>Why</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Why</em>'.
	 * @see ch.iec._61850._2006.scl.THitem#getWhy()
	 * @see #getTHitem()
	 * @generated
	 */
	EAttribute getTHitem_Why();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TIDNaming <em>TID Naming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TID Naming</em>'.
	 * @see ch.iec._61850._2006.scl.TIDNaming
	 * @generated
	 */
	EClass getTIDNaming();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TIDNaming#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see ch.iec._61850._2006.scl.TIDNaming#getDesc()
	 * @see #getTIDNaming()
	 * @generated
	 */
	EAttribute getTIDNaming_Desc();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TIDNaming#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ch.iec._61850._2006.scl.TIDNaming#getId()
	 * @see #getTIDNaming()
	 * @generated
	 */
	EAttribute getTIDNaming_Id();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TIED <em>TIED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TIED</em>'.
	 * @see ch.iec._61850._2006.scl.TIED
	 * @generated
	 */
	EClass getTIED();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TIED#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Services</em>'.
	 * @see ch.iec._61850._2006.scl.TIED#getServices()
	 * @see #getTIED()
	 * @generated
	 */
	EReference getTIED_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TIED#getAccessPoint <em>Access Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Access Point</em>'.
	 * @see ch.iec._61850._2006.scl.TIED#getAccessPoint()
	 * @see #getTIED()
	 * @generated
	 */
	EReference getTIED_AccessPoint();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TIED#getConfigVersion <em>Config Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Version</em>'.
	 * @see ch.iec._61850._2006.scl.TIED#getConfigVersion()
	 * @see #getTIED()
	 * @generated
	 */
	EAttribute getTIED_ConfigVersion();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TIED#getManufacturer <em>Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturer</em>'.
	 * @see ch.iec._61850._2006.scl.TIED#getManufacturer()
	 * @see #getTIED()
	 * @generated
	 */
	EAttribute getTIED_Manufacturer();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TIED#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ch.iec._61850._2006.scl.TIED#getType()
	 * @see #getTIED()
	 * @generated
	 */
	EAttribute getTIED_Type();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TInputs <em>TInputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TInputs</em>'.
	 * @see ch.iec._61850._2006.scl.TInputs
	 * @generated
	 */
	EClass getTInputs();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TInputs#getExtRef <em>Ext Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ext Ref</em>'.
	 * @see ch.iec._61850._2006.scl.TInputs#getExtRef()
	 * @see #getTInputs()
	 * @generated
	 */
	EReference getTInputs_ExtRef();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TLDevice <em>TL Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TL Device</em>'.
	 * @see ch.iec._61850._2006.scl.TLDevice
	 * @generated
	 */
	EClass getTLDevice();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TLDevice#getLN0 <em>LN0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LN0</em>'.
	 * @see ch.iec._61850._2006.scl.TLDevice#getLN0()
	 * @see #getTLDevice()
	 * @generated
	 */
	EReference getTLDevice_LN0();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TLDevice#getLN <em>LN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>LN</em>'.
	 * @see ch.iec._61850._2006.scl.TLDevice#getLN()
	 * @see #getTLDevice()
	 * @generated
	 */
	EReference getTLDevice_LN();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TLDevice#getAccessControl <em>Access Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access Control</em>'.
	 * @see ch.iec._61850._2006.scl.TLDevice#getAccessControl()
	 * @see #getTLDevice()
	 * @generated
	 */
	EReference getTLDevice_AccessControl();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TLDevice#getInst <em>Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inst</em>'.
	 * @see ch.iec._61850._2006.scl.TLDevice#getInst()
	 * @see #getTLDevice()
	 * @generated
	 */
	EAttribute getTLDevice_Inst();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TLDevice#getLdName <em>Ld Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ld Name</em>'.
	 * @see ch.iec._61850._2006.scl.TLDevice#getLdName()
	 * @see #getTLDevice()
	 * @generated
	 */
	EAttribute getTLDevice_LdName();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TLN <em>TLN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TLN</em>'.
	 * @see ch.iec._61850._2006.scl.TLN
	 * @generated
	 */
	EClass getTLN();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TLN#getInst <em>Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inst</em>'.
	 * @see ch.iec._61850._2006.scl.TLN#getInst()
	 * @see #getTLN()
	 * @generated
	 */
	EAttribute getTLN_Inst();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TLN#getLnClass <em>Ln Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ln Class</em>'.
	 * @see ch.iec._61850._2006.scl.TLN#getLnClass()
	 * @see #getTLN()
	 * @generated
	 */
	EAttribute getTLN_LnClass();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TLN#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see ch.iec._61850._2006.scl.TLN#getPrefix()
	 * @see #getTLN()
	 * @generated
	 */
	EAttribute getTLN_Prefix();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TLN0 <em>TLN0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TLN0</em>'.
	 * @see ch.iec._61850._2006.scl.TLN0
	 * @generated
	 */
	EClass getTLN0();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TLN0#getGSEControl <em>GSE Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>GSE Control</em>'.
	 * @see ch.iec._61850._2006.scl.TLN0#getGSEControl()
	 * @see #getTLN0()
	 * @generated
	 */
	EReference getTLN0_GSEControl();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TLN0#getSampledValueControl <em>Sampled Value Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sampled Value Control</em>'.
	 * @see ch.iec._61850._2006.scl.TLN0#getSampledValueControl()
	 * @see #getTLN0()
	 * @generated
	 */
	EReference getTLN0_SampledValueControl();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TLN0#getSettingControl <em>Setting Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Setting Control</em>'.
	 * @see ch.iec._61850._2006.scl.TLN0#getSettingControl()
	 * @see #getTLN0()
	 * @generated
	 */
	EReference getTLN0_SettingControl();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TLN0#getSCLControl <em>SCL Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SCL Control</em>'.
	 * @see ch.iec._61850._2006.scl.TLN0#getSCLControl()
	 * @see #getTLN0()
	 * @generated
	 */
	EReference getTLN0_SCLControl();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TLN0#getLog <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Log</em>'.
	 * @see ch.iec._61850._2006.scl.TLN0#getLog()
	 * @see #getTLN0()
	 * @generated
	 */
	EReference getTLN0_Log();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TLN0#getInst <em>Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inst</em>'.
	 * @see ch.iec._61850._2006.scl.TLN0#getInst()
	 * @see #getTLN0()
	 * @generated
	 */
	EAttribute getTLN0_Inst();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TLN0#getLnClass <em>Ln Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ln Class</em>'.
	 * @see ch.iec._61850._2006.scl.TLN0#getLnClass()
	 * @see #getTLN0()
	 * @generated
	 */
	EAttribute getTLN0_LnClass();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TLNode <em>TL Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TL Node</em>'.
	 * @see ch.iec._61850._2006.scl.TLNode
	 * @generated
	 */
	EClass getTLNode();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TLNode#getIedName <em>Ied Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ied Name</em>'.
	 * @see ch.iec._61850._2006.scl.TLNode#getIedName()
	 * @see #getTLNode()
	 * @generated
	 */
	EAttribute getTLNode_IedName();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TLNode#getLdInst <em>Ld Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ld Inst</em>'.
	 * @see ch.iec._61850._2006.scl.TLNode#getLdInst()
	 * @see #getTLNode()
	 * @generated
	 */
	EAttribute getTLNode_LdInst();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TLNode#getLnClass <em>Ln Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ln Class</em>'.
	 * @see ch.iec._61850._2006.scl.TLNode#getLnClass()
	 * @see #getTLNode()
	 * @generated
	 */
	EAttribute getTLNode_LnClass();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TLNode#getLnInst <em>Ln Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ln Inst</em>'.
	 * @see ch.iec._61850._2006.scl.TLNode#getLnInst()
	 * @see #getTLNode()
	 * @generated
	 */
	EAttribute getTLNode_LnInst();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TLNode#getLnType <em>Ln Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ln Type</em>'.
	 * @see ch.iec._61850._2006.scl.TLNode#getLnType()
	 * @see #getTLNode()
	 * @generated
	 */
	EAttribute getTLNode_LnType();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TLNode#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see ch.iec._61850._2006.scl.TLNode#getPrefix()
	 * @see #getTLNode()
	 * @generated
	 */
	EAttribute getTLNode_Prefix();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TLNodeContainer <em>TL Node Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TL Node Container</em>'.
	 * @see ch.iec._61850._2006.scl.TLNodeContainer
	 * @generated
	 */
	EClass getTLNodeContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TLNodeContainer#getLNode <em>LNode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>LNode</em>'.
	 * @see ch.iec._61850._2006.scl.TLNodeContainer#getLNode()
	 * @see #getTLNodeContainer()
	 * @generated
	 */
	EReference getTLNodeContainer_LNode();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TLNodeType <em>TL Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TL Node Type</em>'.
	 * @see ch.iec._61850._2006.scl.TLNodeType
	 * @generated
	 */
	EClass getTLNodeType();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TLNodeType#getDO <em>DO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DO</em>'.
	 * @see ch.iec._61850._2006.scl.TLNodeType#getDO()
	 * @see #getTLNodeType()
	 * @generated
	 */
	EReference getTLNodeType_DO();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TLNodeType#getIedType <em>Ied Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ied Type</em>'.
	 * @see ch.iec._61850._2006.scl.TLNodeType#getIedType()
	 * @see #getTLNodeType()
	 * @generated
	 */
	EAttribute getTLNodeType_IedType();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TLNodeType#getLnClass <em>Ln Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ln Class</em>'.
	 * @see ch.iec._61850._2006.scl.TLNodeType#getLnClass()
	 * @see #getTLNodeType()
	 * @generated
	 */
	EAttribute getTLNodeType_LnClass();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TLog <em>TLog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TLog</em>'.
	 * @see ch.iec._61850._2006.scl.TLog
	 * @generated
	 */
	EClass getTLog();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TLogControl <em>TLog Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TLog Control</em>'.
	 * @see ch.iec._61850._2006.scl.TLogControl
	 * @generated
	 */
	EClass getTLogControl();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TLogControl#isLogEna <em>Log Ena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Ena</em>'.
	 * @see ch.iec._61850._2006.scl.TLogControl#isLogEna()
	 * @see #getTLogControl()
	 * @generated
	 */
	EAttribute getTLogControl_LogEna();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TLogControl#getLogName <em>Log Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Name</em>'.
	 * @see ch.iec._61850._2006.scl.TLogControl#getLogName()
	 * @see #getTLogControl()
	 * @generated
	 */
	EAttribute getTLogControl_LogName();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TLogControl#isReasonCode <em>Reason Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason Code</em>'.
	 * @see ch.iec._61850._2006.scl.TLogControl#isReasonCode()
	 * @see #getTLogControl()
	 * @generated
	 */
	EAttribute getTLogControl_ReasonCode();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TLogSettings <em>TLog Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TLog Settings</em>'.
	 * @see ch.iec._61850._2006.scl.TLogSettings
	 * @generated
	 */
	EClass getTLogSettings();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TLogSettings#getIntgPd <em>Intg Pd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intg Pd</em>'.
	 * @see ch.iec._61850._2006.scl.TLogSettings#getIntgPd()
	 * @see #getTLogSettings()
	 * @generated
	 */
	EAttribute getTLogSettings_IntgPd();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TLogSettings#getLogEna <em>Log Ena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Ena</em>'.
	 * @see ch.iec._61850._2006.scl.TLogSettings#getLogEna()
	 * @see #getTLogSettings()
	 * @generated
	 */
	EAttribute getTLogSettings_LogEna();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TLogSettings#getTrgOps <em>Trg Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trg Ops</em>'.
	 * @see ch.iec._61850._2006.scl.TLogSettings#getTrgOps()
	 * @see #getTLogSettings()
	 * @generated
	 */
	EAttribute getTLogSettings_TrgOps();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TNaming <em>TNaming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TNaming</em>'.
	 * @see ch.iec._61850._2006.scl.TNaming
	 * @generated
	 */
	EClass getTNaming();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TNaming#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see ch.iec._61850._2006.scl.TNaming#getDesc()
	 * @see #getTNaming()
	 * @generated
	 */
	EAttribute getTNaming_Desc();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TNaming#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.iec._61850._2006.scl.TNaming#getName()
	 * @see #getTNaming()
	 * @generated
	 */
	EAttribute getTNaming_Name();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TP <em>TP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TP</em>'.
	 * @see ch.iec._61850._2006.scl.TP
	 * @generated
	 */
	EClass getTP();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TP#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ch.iec._61850._2006.scl.TP#getValue()
	 * @see #getTP()
	 * @generated
	 */
	EAttribute getTP_Value();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TP#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ch.iec._61850._2006.scl.TP#getType()
	 * @see #getTP()
	 * @generated
	 */
	EAttribute getTP_Type();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TPAPPID <em>TPAPPID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPAPPID</em>'.
	 * @see ch.iec._61850._2006.scl.TPAPPID
	 * @generated
	 */
	EClass getTPAPPID();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TPhysConn <em>TPhys Conn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPhys Conn</em>'.
	 * @see ch.iec._61850._2006.scl.TPhysConn
	 * @generated
	 */
	EClass getTPhysConn();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TPhysConn#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see ch.iec._61850._2006.scl.TPhysConn#getP()
	 * @see #getTPhysConn()
	 * @generated
	 */
	EReference getTPhysConn_P();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TPhysConn#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ch.iec._61850._2006.scl.TPhysConn#getType()
	 * @see #getTPhysConn()
	 * @generated
	 */
	EAttribute getTPhysConn_Type();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TPIP <em>TPIP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPIP</em>'.
	 * @see ch.iec._61850._2006.scl.TPIP
	 * @generated
	 */
	EClass getTPIP();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TPIPGATEWAY <em>TPIPGATEWAY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPIPGATEWAY</em>'.
	 * @see ch.iec._61850._2006.scl.TPIPGATEWAY
	 * @generated
	 */
	EClass getTPIPGATEWAY();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TPIPSUBNET <em>TPIPSUBNET</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPIPSUBNET</em>'.
	 * @see ch.iec._61850._2006.scl.TPIPSUBNET
	 * @generated
	 */
	EClass getTPIPSUBNET();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TPMACAddress <em>TPMAC Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPMAC Address</em>'.
	 * @see ch.iec._61850._2006.scl.TPMACAddress
	 * @generated
	 */
	EClass getTPMACAddress();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TPOSIAEInvoke <em>TPOSIAE Invoke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPOSIAE Invoke</em>'.
	 * @see ch.iec._61850._2006.scl.TPOSIAEInvoke
	 * @generated
	 */
	EClass getTPOSIAEInvoke();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TPOSIAEQualifier <em>TPOSIAE Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPOSIAE Qualifier</em>'.
	 * @see ch.iec._61850._2006.scl.TPOSIAEQualifier
	 * @generated
	 */
	EClass getTPOSIAEQualifier();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TPOSIAPInvoke <em>TPOSIAP Invoke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPOSIAP Invoke</em>'.
	 * @see ch.iec._61850._2006.scl.TPOSIAPInvoke
	 * @generated
	 */
	EClass getTPOSIAPInvoke();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TPOSIAPTitle <em>TPOSIAP Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPOSIAP Title</em>'.
	 * @see ch.iec._61850._2006.scl.TPOSIAPTitle
	 * @generated
	 */
	EClass getTPOSIAPTitle();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TPOSINSAP <em>TPOSINSAP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPOSINSAP</em>'.
	 * @see ch.iec._61850._2006.scl.TPOSINSAP
	 * @generated
	 */
	EClass getTPOSINSAP();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TPOSIPSEL <em>TPOSIPSEL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPOSIPSEL</em>'.
	 * @see ch.iec._61850._2006.scl.TPOSIPSEL
	 * @generated
	 */
	EClass getTPOSIPSEL();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TPOSISSEL <em>TPOSISSEL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPOSISSEL</em>'.
	 * @see ch.iec._61850._2006.scl.TPOSISSEL
	 * @generated
	 */
	EClass getTPOSISSEL();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TPOSITSEL <em>TPOSITSEL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPOSITSEL</em>'.
	 * @see ch.iec._61850._2006.scl.TPOSITSEL
	 * @generated
	 */
	EClass getTPOSITSEL();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TPowerSystemResource <em>TPower System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPower System Resource</em>'.
	 * @see ch.iec._61850._2006.scl.TPowerSystemResource
	 * @generated
	 */
	EClass getTPowerSystemResource();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TPowerTransformer <em>TPower Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPower Transformer</em>'.
	 * @see ch.iec._61850._2006.scl.TPowerTransformer
	 * @generated
	 */
	EClass getTPowerTransformer();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TPowerTransformer#getTransformerWinding <em>Transformer Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformer Winding</em>'.
	 * @see ch.iec._61850._2006.scl.TPowerTransformer#getTransformerWinding()
	 * @see #getTPowerTransformer()
	 * @generated
	 */
	EReference getTPowerTransformer_TransformerWinding();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TPowerTransformer#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ch.iec._61850._2006.scl.TPowerTransformer#getType()
	 * @see #getTPowerTransformer()
	 * @generated
	 */
	EAttribute getTPowerTransformer_Type();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TPrivate <em>TPrivate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPrivate</em>'.
	 * @see ch.iec._61850._2006.scl.TPrivate
	 * @generated
	 */
	EClass getTPrivate();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TPrivate#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see ch.iec._61850._2006.scl.TPrivate#getSource()
	 * @see #getTPrivate()
	 * @generated
	 */
	EAttribute getTPrivate_Source();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TPrivate#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ch.iec._61850._2006.scl.TPrivate#getType()
	 * @see #getTPrivate()
	 * @generated
	 */
	EAttribute getTPrivate_Type();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TPVLANID <em>TPVLANID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPVLANID</em>'.
	 * @see ch.iec._61850._2006.scl.TPVLANID
	 * @generated
	 */
	EClass getTPVLANID();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TPVLANPRIORITY <em>TPVLANPRIORITY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPVLANPRIORITY</em>'.
	 * @see ch.iec._61850._2006.scl.TPVLANPRIORITY
	 * @generated
	 */
	EClass getTPVLANPRIORITY();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TReportControl <em>TReport Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TReport Control</em>'.
	 * @see ch.iec._61850._2006.scl.TReportControl
	 * @generated
	 */
	EClass getTReportControl();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TReportControl#getOptFields <em>Opt Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Opt Fields</em>'.
	 * @see ch.iec._61850._2006.scl.TReportControl#getOptFields()
	 * @see #getTReportControl()
	 * @generated
	 */
	EReference getTReportControl_OptFields();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TReportControl#getRptEnabled <em>Rpt Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rpt Enabled</em>'.
	 * @see ch.iec._61850._2006.scl.TReportControl#getRptEnabled()
	 * @see #getTReportControl()
	 * @generated
	 */
	EReference getTReportControl_RptEnabled();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TReportControl#isBuffered <em>Buffered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buffered</em>'.
	 * @see ch.iec._61850._2006.scl.TReportControl#isBuffered()
	 * @see #getTReportControl()
	 * @generated
	 */
	EAttribute getTReportControl_Buffered();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TReportControl#getBufTime <em>Buf Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buf Time</em>'.
	 * @see ch.iec._61850._2006.scl.TReportControl#getBufTime()
	 * @see #getTReportControl()
	 * @generated
	 */
	EAttribute getTReportControl_BufTime();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TReportControl#getConfRev <em>Conf Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conf Rev</em>'.
	 * @see ch.iec._61850._2006.scl.TReportControl#getConfRev()
	 * @see #getTReportControl()
	 * @generated
	 */
	EAttribute getTReportControl_ConfRev();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TReportControl#getRptID <em>Rpt ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rpt ID</em>'.
	 * @see ch.iec._61850._2006.scl.TReportControl#getRptID()
	 * @see #getTReportControl()
	 * @generated
	 */
	EAttribute getTReportControl_RptID();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TReportSettings <em>TReport Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TReport Settings</em>'.
	 * @see ch.iec._61850._2006.scl.TReportSettings
	 * @generated
	 */
	EClass getTReportSettings();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TReportSettings#getBufTime <em>Buf Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buf Time</em>'.
	 * @see ch.iec._61850._2006.scl.TReportSettings#getBufTime()
	 * @see #getTReportSettings()
	 * @generated
	 */
	EAttribute getTReportSettings_BufTime();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TReportSettings#getIntgPd <em>Intg Pd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intg Pd</em>'.
	 * @see ch.iec._61850._2006.scl.TReportSettings#getIntgPd()
	 * @see #getTReportSettings()
	 * @generated
	 */
	EAttribute getTReportSettings_IntgPd();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TReportSettings#getOptFields <em>Opt Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opt Fields</em>'.
	 * @see ch.iec._61850._2006.scl.TReportSettings#getOptFields()
	 * @see #getTReportSettings()
	 * @generated
	 */
	EAttribute getTReportSettings_OptFields();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TReportSettings#getRptID <em>Rpt ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rpt ID</em>'.
	 * @see ch.iec._61850._2006.scl.TReportSettings#getRptID()
	 * @see #getTReportSettings()
	 * @generated
	 */
	EAttribute getTReportSettings_RptID();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TReportSettings#getTrgOps <em>Trg Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trg Ops</em>'.
	 * @see ch.iec._61850._2006.scl.TReportSettings#getTrgOps()
	 * @see #getTReportSettings()
	 * @generated
	 */
	EAttribute getTReportSettings_TrgOps();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TRptEnabled <em>TRpt Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRpt Enabled</em>'.
	 * @see ch.iec._61850._2006.scl.TRptEnabled
	 * @generated
	 */
	EClass getTRptEnabled();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TRptEnabled#getClientLN <em>Client LN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Client LN</em>'.
	 * @see ch.iec._61850._2006.scl.TRptEnabled#getClientLN()
	 * @see #getTRptEnabled()
	 * @generated
	 */
	EReference getTRptEnabled_ClientLN();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TRptEnabled#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see ch.iec._61850._2006.scl.TRptEnabled#getMax()
	 * @see #getTRptEnabled()
	 * @generated
	 */
	EAttribute getTRptEnabled_Max();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TSampledValueControl <em>TSampled Value Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSampled Value Control</em>'.
	 * @see ch.iec._61850._2006.scl.TSampledValueControl
	 * @generated
	 */
	EClass getTSampledValueControl();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TSampledValueControl#getSmvOpts <em>Smv Opts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Smv Opts</em>'.
	 * @see ch.iec._61850._2006.scl.TSampledValueControl#getSmvOpts()
	 * @see #getTSampledValueControl()
	 * @generated
	 */
	EReference getTSampledValueControl_SmvOpts();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TSampledValueControl#isMulticast <em>Multicast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multicast</em>'.
	 * @see ch.iec._61850._2006.scl.TSampledValueControl#isMulticast()
	 * @see #getTSampledValueControl()
	 * @generated
	 */
	EAttribute getTSampledValueControl_Multicast();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TSampledValueControl#getNofASDU <em>Nof ASDU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nof ASDU</em>'.
	 * @see ch.iec._61850._2006.scl.TSampledValueControl#getNofASDU()
	 * @see #getTSampledValueControl()
	 * @generated
	 */
	EAttribute getTSampledValueControl_NofASDU();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TSampledValueControl#getSmpRate <em>Smp Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Smp Rate</em>'.
	 * @see ch.iec._61850._2006.scl.TSampledValueControl#getSmpRate()
	 * @see #getTSampledValueControl()
	 * @generated
	 */
	EAttribute getTSampledValueControl_SmpRate();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TSampledValueControl#getSmvID <em>Smv ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Smv ID</em>'.
	 * @see ch.iec._61850._2006.scl.TSampledValueControl#getSmvID()
	 * @see #getTSampledValueControl()
	 * @generated
	 */
	EAttribute getTSampledValueControl_SmvID();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TSCLControl <em>TSCL Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSCL Control</em>'.
	 * @see ch.iec._61850._2006.scl.TSCLControl
	 * @generated
	 */
	EClass getTSCLControl();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TSDI <em>TSDI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSDI</em>'.
	 * @see ch.iec._61850._2006.scl.TSDI
	 * @generated
	 */
	EClass getTSDI();

	/**
	 * Returns the meta object for the attribute list '{@link ch.iec._61850._2006.scl.TSDI#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see ch.iec._61850._2006.scl.TSDI#getGroup()
	 * @see #getTSDI()
	 * @generated
	 */
	EAttribute getTSDI_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TSDI#getSDI <em>SDI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SDI</em>'.
	 * @see ch.iec._61850._2006.scl.TSDI#getSDI()
	 * @see #getTSDI()
	 * @generated
	 */
	EReference getTSDI_SDI();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TSDI#getDAI <em>DAI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DAI</em>'.
	 * @see ch.iec._61850._2006.scl.TSDI#getDAI()
	 * @see #getTSDI()
	 * @generated
	 */
	EReference getTSDI_DAI();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TSDI#getIx <em>Ix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ix</em>'.
	 * @see ch.iec._61850._2006.scl.TSDI#getIx()
	 * @see #getTSDI()
	 * @generated
	 */
	EAttribute getTSDI_Ix();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TSDI#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.iec._61850._2006.scl.TSDI#getName()
	 * @see #getTSDI()
	 * @generated
	 */
	EAttribute getTSDI_Name();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TSDO <em>TSDO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSDO</em>'.
	 * @see ch.iec._61850._2006.scl.TSDO
	 * @generated
	 */
	EClass getTSDO();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TSDO#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ch.iec._61850._2006.scl.TSDO#getType()
	 * @see #getTSDO()
	 * @generated
	 */
	EAttribute getTSDO_Type();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TServer <em>TServer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TServer</em>'.
	 * @see ch.iec._61850._2006.scl.TServer
	 * @generated
	 */
	EClass getTServer();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TServer#getAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authentication</em>'.
	 * @see ch.iec._61850._2006.scl.TServer#getAuthentication()
	 * @see #getTServer()
	 * @generated
	 */
	EReference getTServer_Authentication();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TServer#getLDevice <em>LDevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>LDevice</em>'.
	 * @see ch.iec._61850._2006.scl.TServer#getLDevice()
	 * @see #getTServer()
	 * @generated
	 */
	EReference getTServer_LDevice();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TServer#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Association</em>'.
	 * @see ch.iec._61850._2006.scl.TServer#getAssociation()
	 * @see #getTServer()
	 * @generated
	 */
	EReference getTServer_Association();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TServer#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see ch.iec._61850._2006.scl.TServer#getTimeout()
	 * @see #getTServer()
	 * @generated
	 */
	EAttribute getTServer_Timeout();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TServices <em>TServices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TServices</em>'.
	 * @see ch.iec._61850._2006.scl.TServices
	 * @generated
	 */
	EClass getTServices();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TServices#getDynAssociation <em>Dyn Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dyn Association</em>'.
	 * @see ch.iec._61850._2006.scl.TServices#getDynAssociation()
	 * @see #getTServices()
	 * @generated
	 */
	EReference getTServices_DynAssociation();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TServices#getSettingGroups <em>Setting Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Setting Groups</em>'.
	 * @see ch.iec._61850._2006.scl.TServices#getSettingGroups()
	 * @see #getTServices()
	 * @generated
	 */
	EReference getTServices_SettingGroups();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TServices#getGetDirectory <em>Get Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Directory</em>'.
	 * @see ch.iec._61850._2006.scl.TServices#getGetDirectory()
	 * @see #getTServices()
	 * @generated
	 */
	EReference getTServices_GetDirectory();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TServices#getGetDataObjectDefinition <em>Get Data Object Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Data Object Definition</em>'.
	 * @see ch.iec._61850._2006.scl.TServices#getGetDataObjectDefinition()
	 * @see #getTServices()
	 * @generated
	 */
	EReference getTServices_GetDataObjectDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TServices#getDataObjectDirectory <em>Data Object Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Object Directory</em>'.
	 * @see ch.iec._61850._2006.scl.TServices#getDataObjectDirectory()
	 * @see #getTServices()
	 * @generated
	 */
	EReference getTServices_DataObjectDirectory();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TServices#getGetDataSetValue <em>Get Data Set Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Data Set Value</em>'.
	 * @see ch.iec._61850._2006.scl.TServices#getGetDataSetValue()
	 * @see #getTServices()
	 * @generated
	 */
	EReference getTServices_GetDataSetValue();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TServices#getSetDataSetValue <em>Set Data Set Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set Data Set Value</em>'.
	 * @see ch.iec._61850._2006.scl.TServices#getSetDataSetValue()
	 * @see #getTServices()
	 * @generated
	 */
	EReference getTServices_SetDataSetValue();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TServices#getDataSetDirectory <em>Data Set Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Set Directory</em>'.
	 * @see ch.iec._61850._2006.scl.TServices#getDataSetDirectory()
	 * @see #getTServices()
	 * @generated
	 */
	EReference getTServices_DataSetDirectory();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TServices#getConfDataSet <em>Conf Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conf Data Set</em>'.
	 * @see ch.iec._61850._2006.scl.TServices#getConfDataSet()
	 * @see #getTServices()
	 * @generated
	 */
	EReference getTServices_ConfDataSet();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TServices#getDynDataSet <em>Dyn Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dyn Data Set</em>'.
	 * @see ch.iec._61850._2006.scl.TServices#getDynDataSet()
	 * @see #getTServices()
	 * @generated
	 */
	EReference getTServices_DynDataSet();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TServices#getReadWrite <em>Read Write</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Read Write</em>'.
	 * @see ch.iec._61850._2006.scl.TServices#getReadWrite()
	 * @see #getTServices()
	 * @generated
	 */
	EReference getTServices_ReadWrite();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TServices#getTimerActivatedControl <em>Timer Activated Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timer Activated Control</em>'.
	 * @see ch.iec._61850._2006.scl.TServices#getTimerActivatedControl()
	 * @see #getTServices()
	 * @generated
	 */
	EReference getTServices_TimerActivatedControl();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TServices#getConfReportControl <em>Conf Report Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conf Report Control</em>'.
	 * @see ch.iec._61850._2006.scl.TServices#getConfReportControl()
	 * @see #getTServices()
	 * @generated
	 */
	EReference getTServices_ConfReportControl();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TServices#getGetCBValues <em>Get CB Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get CB Values</em>'.
	 * @see ch.iec._61850._2006.scl.TServices#getGetCBValues()
	 * @see #getTServices()
	 * @generated
	 */
	EReference getTServices_GetCBValues();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TServices#getConfLogControl <em>Conf Log Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conf Log Control</em>'.
	 * @see ch.iec._61850._2006.scl.TServices#getConfLogControl()
	 * @see #getTServices()
	 * @generated
	 */
	EReference getTServices_ConfLogControl();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TServices#getReportSettings <em>Report Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Report Settings</em>'.
	 * @see ch.iec._61850._2006.scl.TServices#getReportSettings()
	 * @see #getTServices()
	 * @generated
	 */
	EReference getTServices_ReportSettings();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TServices#getLogSettings <em>Log Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Log Settings</em>'.
	 * @see ch.iec._61850._2006.scl.TServices#getLogSettings()
	 * @see #getTServices()
	 * @generated
	 */
	EReference getTServices_LogSettings();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TServices#getGSESettings <em>GSE Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GSE Settings</em>'.
	 * @see ch.iec._61850._2006.scl.TServices#getGSESettings()
	 * @see #getTServices()
	 * @generated
	 */
	EReference getTServices_GSESettings();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TServices#getSMVSettings <em>SMV Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SMV Settings</em>'.
	 * @see ch.iec._61850._2006.scl.TServices#getSMVSettings()
	 * @see #getTServices()
	 * @generated
	 */
	EReference getTServices_SMVSettings();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TServices#getGSEDir <em>GSE Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GSE Dir</em>'.
	 * @see ch.iec._61850._2006.scl.TServices#getGSEDir()
	 * @see #getTServices()
	 * @generated
	 */
	EReference getTServices_GSEDir();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TServices#getGOOSE <em>GOOSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GOOSE</em>'.
	 * @see ch.iec._61850._2006.scl.TServices#getGOOSE()
	 * @see #getTServices()
	 * @generated
	 */
	EReference getTServices_GOOSE();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TServices#getGSSE <em>GSSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GSSE</em>'.
	 * @see ch.iec._61850._2006.scl.TServices#getGSSE()
	 * @see #getTServices()
	 * @generated
	 */
	EReference getTServices_GSSE();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TServices#getFileHandling <em>File Handling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File Handling</em>'.
	 * @see ch.iec._61850._2006.scl.TServices#getFileHandling()
	 * @see #getTServices()
	 * @generated
	 */
	EReference getTServices_FileHandling();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TServices#getConfLNs <em>Conf LNs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conf LNs</em>'.
	 * @see ch.iec._61850._2006.scl.TServices#getConfLNs()
	 * @see #getTServices()
	 * @generated
	 */
	EReference getTServices_ConfLNs();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TServices#getClientServices <em>Client Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Client Services</em>'.
	 * @see ch.iec._61850._2006.scl.TServices#getClientServices()
	 * @see #getTServices()
	 * @generated
	 */
	EReference getTServices_ClientServices();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TServiceSettings <em>TService Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TService Settings</em>'.
	 * @see ch.iec._61850._2006.scl.TServiceSettings
	 * @generated
	 */
	EClass getTServiceSettings();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TServiceSettings#getCbName <em>Cb Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cb Name</em>'.
	 * @see ch.iec._61850._2006.scl.TServiceSettings#getCbName()
	 * @see #getTServiceSettings()
	 * @generated
	 */
	EAttribute getTServiceSettings_CbName();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TServiceSettings#getDatSet <em>Dat Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dat Set</em>'.
	 * @see ch.iec._61850._2006.scl.TServiceSettings#getDatSet()
	 * @see #getTServiceSettings()
	 * @generated
	 */
	EAttribute getTServiceSettings_DatSet();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TServiceWithMax <em>TService With Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TService With Max</em>'.
	 * @see ch.iec._61850._2006.scl.TServiceWithMax
	 * @generated
	 */
	EClass getTServiceWithMax();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TServiceWithMax#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see ch.iec._61850._2006.scl.TServiceWithMax#getMax()
	 * @see #getTServiceWithMax()
	 * @generated
	 */
	EAttribute getTServiceWithMax_Max();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TServiceWithMaxAndMaxAttributes <em>TService With Max And Max Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TService With Max And Max Attributes</em>'.
	 * @see ch.iec._61850._2006.scl.TServiceWithMaxAndMaxAttributes
	 * @generated
	 */
	EClass getTServiceWithMaxAndMaxAttributes();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TServiceWithMaxAndMaxAttributes#getMaxAttributes <em>Max Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Attributes</em>'.
	 * @see ch.iec._61850._2006.scl.TServiceWithMaxAndMaxAttributes#getMaxAttributes()
	 * @see #getTServiceWithMaxAndMaxAttributes()
	 * @generated
	 */
	EAttribute getTServiceWithMaxAndMaxAttributes_MaxAttributes();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TServiceWithMaxAndMaxAttributesAndModify <em>TService With Max And Max Attributes And Modify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TService With Max And Max Attributes And Modify</em>'.
	 * @see ch.iec._61850._2006.scl.TServiceWithMaxAndMaxAttributesAndModify
	 * @generated
	 */
	EClass getTServiceWithMaxAndMaxAttributesAndModify();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TServiceWithMaxAndMaxAttributesAndModify#isModify <em>Modify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modify</em>'.
	 * @see ch.iec._61850._2006.scl.TServiceWithMaxAndMaxAttributesAndModify#isModify()
	 * @see #getTServiceWithMaxAndMaxAttributesAndModify()
	 * @generated
	 */
	EAttribute getTServiceWithMaxAndMaxAttributesAndModify_Modify();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TServiceWithMaxAndModify <em>TService With Max And Modify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TService With Max And Modify</em>'.
	 * @see ch.iec._61850._2006.scl.TServiceWithMaxAndModify
	 * @generated
	 */
	EClass getTServiceWithMaxAndModify();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TServiceWithMaxAndModify#isModify <em>Modify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modify</em>'.
	 * @see ch.iec._61850._2006.scl.TServiceWithMaxAndModify#isModify()
	 * @see #getTServiceWithMaxAndModify()
	 * @generated
	 */
	EAttribute getTServiceWithMaxAndModify_Modify();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TServiceYesNo <em>TService Yes No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TService Yes No</em>'.
	 * @see ch.iec._61850._2006.scl.TServiceYesNo
	 * @generated
	 */
	EClass getTServiceYesNo();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TSettingControl <em>TSetting Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSetting Control</em>'.
	 * @see ch.iec._61850._2006.scl.TSettingControl
	 * @generated
	 */
	EClass getTSettingControl();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TSettingControl#getActSG <em>Act SG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Act SG</em>'.
	 * @see ch.iec._61850._2006.scl.TSettingControl#getActSG()
	 * @see #getTSettingControl()
	 * @generated
	 */
	EAttribute getTSettingControl_ActSG();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TSettingControl#getNumOfSGs <em>Num Of SGs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Of SGs</em>'.
	 * @see ch.iec._61850._2006.scl.TSettingControl#getNumOfSGs()
	 * @see #getTSettingControl()
	 * @generated
	 */
	EAttribute getTSettingControl_NumOfSGs();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TSMV <em>TSMV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSMV</em>'.
	 * @see ch.iec._61850._2006.scl.TSMV
	 * @generated
	 */
	EClass getTSMV();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TSMVSettings <em>TSMV Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSMV Settings</em>'.
	 * @see ch.iec._61850._2006.scl.TSMVSettings
	 * @generated
	 */
	EClass getTSMVSettings();

	/**
	 * Returns the meta object for the attribute list '{@link ch.iec._61850._2006.scl.TSMVSettings#getSmpRate <em>Smp Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Smp Rate</em>'.
	 * @see ch.iec._61850._2006.scl.TSMVSettings#getSmpRate()
	 * @see #getTSMVSettings()
	 * @generated
	 */
	EAttribute getTSMVSettings_SmpRate();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TSMVSettings#getOptFields <em>Opt Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opt Fields</em>'.
	 * @see ch.iec._61850._2006.scl.TSMVSettings#getOptFields()
	 * @see #getTSMVSettings()
	 * @generated
	 */
	EAttribute getTSMVSettings_OptFields();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TSMVSettings#getSmpRate1 <em>Smp Rate1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Smp Rate1</em>'.
	 * @see ch.iec._61850._2006.scl.TSMVSettings#getSmpRate1()
	 * @see #getTSMVSettings()
	 * @generated
	 */
	EAttribute getTSMVSettings_SmpRate1();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TSMVSettings#getSvID <em>Sv ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sv ID</em>'.
	 * @see ch.iec._61850._2006.scl.TSMVSettings#getSvID()
	 * @see #getTSMVSettings()
	 * @generated
	 */
	EAttribute getTSMVSettings_SvID();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TSubEquipment <em>TSub Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSub Equipment</em>'.
	 * @see ch.iec._61850._2006.scl.TSubEquipment
	 * @generated
	 */
	EClass getTSubEquipment();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TSubEquipment#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase</em>'.
	 * @see ch.iec._61850._2006.scl.TSubEquipment#getPhase()
	 * @see #getTSubEquipment()
	 * @generated
	 */
	EAttribute getTSubEquipment_Phase();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TSubEquipment#isVirtual <em>Virtual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Virtual</em>'.
	 * @see ch.iec._61850._2006.scl.TSubEquipment#isVirtual()
	 * @see #getTSubEquipment()
	 * @generated
	 */
	EAttribute getTSubEquipment_Virtual();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TSubFunction <em>TSub Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSub Function</em>'.
	 * @see ch.iec._61850._2006.scl.TSubFunction
	 * @generated
	 */
	EClass getTSubFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TSubFunction#getGeneralEquipment <em>General Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>General Equipment</em>'.
	 * @see ch.iec._61850._2006.scl.TSubFunction#getGeneralEquipment()
	 * @see #getTSubFunction()
	 * @generated
	 */
	EReference getTSubFunction_GeneralEquipment();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TSubNetwork <em>TSub Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSub Network</em>'.
	 * @see ch.iec._61850._2006.scl.TSubNetwork
	 * @generated
	 */
	EClass getTSubNetwork();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TSubNetwork#getBitRate <em>Bit Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bit Rate</em>'.
	 * @see ch.iec._61850._2006.scl.TSubNetwork#getBitRate()
	 * @see #getTSubNetwork()
	 * @generated
	 */
	EReference getTSubNetwork_BitRate();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TSubNetwork#getConnectedAP <em>Connected AP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connected AP</em>'.
	 * @see ch.iec._61850._2006.scl.TSubNetwork#getConnectedAP()
	 * @see #getTSubNetwork()
	 * @generated
	 */
	EReference getTSubNetwork_ConnectedAP();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TSubNetwork#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ch.iec._61850._2006.scl.TSubNetwork#getType()
	 * @see #getTSubNetwork()
	 * @generated
	 */
	EAttribute getTSubNetwork_Type();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TSubstation <em>TSubstation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSubstation</em>'.
	 * @see ch.iec._61850._2006.scl.TSubstation
	 * @generated
	 */
	EClass getTSubstation();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TSubstation#getVoltageLevel <em>Voltage Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Voltage Level</em>'.
	 * @see ch.iec._61850._2006.scl.TSubstation#getVoltageLevel()
	 * @see #getTSubstation()
	 * @generated
	 */
	EReference getTSubstation_VoltageLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TSubstation#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function</em>'.
	 * @see ch.iec._61850._2006.scl.TSubstation#getFunction()
	 * @see #getTSubstation()
	 * @generated
	 */
	EReference getTSubstation_Function();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TTapChanger <em>TTap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTap Changer</em>'.
	 * @see ch.iec._61850._2006.scl.TTapChanger
	 * @generated
	 */
	EClass getTTapChanger();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TTapChanger#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ch.iec._61850._2006.scl.TTapChanger#getType()
	 * @see #getTTapChanger()
	 * @generated
	 */
	EAttribute getTTapChanger_Type();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TTapChanger#isVirtual <em>Virtual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Virtual</em>'.
	 * @see ch.iec._61850._2006.scl.TTapChanger#isVirtual()
	 * @see #getTTapChanger()
	 * @generated
	 */
	EAttribute getTTapChanger_Virtual();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TTerminal <em>TTerminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTerminal</em>'.
	 * @see ch.iec._61850._2006.scl.TTerminal
	 * @generated
	 */
	EClass getTTerminal();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TTerminal#getBayName <em>Bay Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bay Name</em>'.
	 * @see ch.iec._61850._2006.scl.TTerminal#getBayName()
	 * @see #getTTerminal()
	 * @generated
	 */
	EAttribute getTTerminal_BayName();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TTerminal#getCNodeName <em>CNode Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CNode Name</em>'.
	 * @see ch.iec._61850._2006.scl.TTerminal#getCNodeName()
	 * @see #getTTerminal()
	 * @generated
	 */
	EAttribute getTTerminal_CNodeName();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TTerminal#getConnectivityNode <em>Connectivity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connectivity Node</em>'.
	 * @see ch.iec._61850._2006.scl.TTerminal#getConnectivityNode()
	 * @see #getTTerminal()
	 * @generated
	 */
	EAttribute getTTerminal_ConnectivityNode();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TTerminal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.iec._61850._2006.scl.TTerminal#getName()
	 * @see #getTTerminal()
	 * @generated
	 */
	EAttribute getTTerminal_Name();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TTerminal#getSubstationName <em>Substation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Substation Name</em>'.
	 * @see ch.iec._61850._2006.scl.TTerminal#getSubstationName()
	 * @see #getTTerminal()
	 * @generated
	 */
	EAttribute getTTerminal_SubstationName();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TTerminal#getVoltageLevelName <em>Voltage Level Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage Level Name</em>'.
	 * @see ch.iec._61850._2006.scl.TTerminal#getVoltageLevelName()
	 * @see #getTTerminal()
	 * @generated
	 */
	EAttribute getTTerminal_VoltageLevelName();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TText <em>TText</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TText</em>'.
	 * @see ch.iec._61850._2006.scl.TText
	 * @generated
	 */
	EClass getTText();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TText#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see ch.iec._61850._2006.scl.TText#getSource()
	 * @see #getTText()
	 * @generated
	 */
	EAttribute getTText_Source();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TTransformerWinding <em>TTransformer Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTransformer Winding</em>'.
	 * @see ch.iec._61850._2006.scl.TTransformerWinding
	 * @generated
	 */
	EClass getTTransformerWinding();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TTransformerWinding#getTapChanger <em>Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tap Changer</em>'.
	 * @see ch.iec._61850._2006.scl.TTransformerWinding#getTapChanger()
	 * @see #getTTransformerWinding()
	 * @generated
	 */
	EReference getTTransformerWinding_TapChanger();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TTransformerWinding#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ch.iec._61850._2006.scl.TTransformerWinding#getType()
	 * @see #getTTransformerWinding()
	 * @generated
	 */
	EAttribute getTTransformerWinding_Type();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TTrgOps <em>TTrg Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTrg Ops</em>'.
	 * @see ch.iec._61850._2006.scl.TTrgOps
	 * @generated
	 */
	EClass getTTrgOps();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TTrgOps#isDchg <em>Dchg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dchg</em>'.
	 * @see ch.iec._61850._2006.scl.TTrgOps#isDchg()
	 * @see #getTTrgOps()
	 * @generated
	 */
	EAttribute getTTrgOps_Dchg();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TTrgOps#isDupd <em>Dupd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dupd</em>'.
	 * @see ch.iec._61850._2006.scl.TTrgOps#isDupd()
	 * @see #getTTrgOps()
	 * @generated
	 */
	EAttribute getTTrgOps_Dupd();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TTrgOps#isPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see ch.iec._61850._2006.scl.TTrgOps#isPeriod()
	 * @see #getTTrgOps()
	 * @generated
	 */
	EAttribute getTTrgOps_Period();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TTrgOps#isQchg <em>Qchg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qchg</em>'.
	 * @see ch.iec._61850._2006.scl.TTrgOps#isQchg()
	 * @see #getTTrgOps()
	 * @generated
	 */
	EAttribute getTTrgOps_Qchg();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TUnNaming <em>TUn Naming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TUn Naming</em>'.
	 * @see ch.iec._61850._2006.scl.TUnNaming
	 * @generated
	 */
	EClass getTUnNaming();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TUnNaming#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see ch.iec._61850._2006.scl.TUnNaming#getDesc()
	 * @see #getTUnNaming()
	 * @generated
	 */
	EAttribute getTUnNaming_Desc();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TVal <em>TVal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TVal</em>'.
	 * @see ch.iec._61850._2006.scl.TVal
	 * @generated
	 */
	EClass getTVal();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TVal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ch.iec._61850._2006.scl.TVal#getValue()
	 * @see #getTVal()
	 * @generated
	 */
	EAttribute getTVal_Value();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TVal#getSGroup <em>SGroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SGroup</em>'.
	 * @see ch.iec._61850._2006.scl.TVal#getSGroup()
	 * @see #getTVal()
	 * @generated
	 */
	EAttribute getTVal_SGroup();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TValueWithUnit <em>TValue With Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TValue With Unit</em>'.
	 * @see ch.iec._61850._2006.scl.TValueWithUnit
	 * @generated
	 */
	EClass getTValueWithUnit();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TValueWithUnit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ch.iec._61850._2006.scl.TValueWithUnit#getValue()
	 * @see #getTValueWithUnit()
	 * @generated
	 */
	EAttribute getTValueWithUnit_Value();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TValueWithUnit#getMultiplier <em>Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplier</em>'.
	 * @see ch.iec._61850._2006.scl.TValueWithUnit#getMultiplier()
	 * @see #getTValueWithUnit()
	 * @generated
	 */
	EAttribute getTValueWithUnit_Multiplier();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.scl.TValueWithUnit#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see ch.iec._61850._2006.scl.TValueWithUnit#getUnit()
	 * @see #getTValueWithUnit()
	 * @generated
	 */
	EAttribute getTValueWithUnit_Unit();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TVoltage <em>TVoltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TVoltage</em>'.
	 * @see ch.iec._61850._2006.scl.TVoltage
	 * @generated
	 */
	EClass getTVoltage();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.scl.TVoltageLevel <em>TVoltage Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TVoltage Level</em>'.
	 * @see ch.iec._61850._2006.scl.TVoltageLevel
	 * @generated
	 */
	EClass getTVoltageLevel();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.scl.TVoltageLevel#getVoltage <em>Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Voltage</em>'.
	 * @see ch.iec._61850._2006.scl.TVoltageLevel#getVoltage()
	 * @see #getTVoltageLevel()
	 * @generated
	 */
	EReference getTVoltageLevel_Voltage();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.iec._61850._2006.scl.TVoltageLevel#getBay <em>Bay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bay</em>'.
	 * @see ch.iec._61850._2006.scl.TVoltageLevel#getBay()
	 * @see #getTVoltageLevel()
	 * @generated
	 */
	EReference getTVoltageLevel_Bay();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.scl.NameStructureType <em>Name Structure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Name Structure Type</em>'.
	 * @see ch.iec._61850._2006.scl.NameStructureType
	 * @generated
	 */
	EEnum getNameStructureType();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.scl.TAssociationKindEnum <em>TAssociation Kind Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TAssociation Kind Enum</em>'.
	 * @see ch.iec._61850._2006.scl.TAssociationKindEnum
	 * @generated
	 */
	EEnum getTAssociationKindEnum();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.scl.TAuthenticationEnum <em>TAuthentication Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TAuthentication Enum</em>'.
	 * @see ch.iec._61850._2006.scl.TAuthenticationEnum
	 * @generated
	 */
	EEnum getTAuthenticationEnum();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.scl.TDomainLNGroupAEnum <em>TDomain LN Group AEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TDomain LN Group AEnum</em>'.
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupAEnum
	 * @generated
	 */
	EEnum getTDomainLNGroupAEnum();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.scl.TDomainLNGroupCEnum <em>TDomain LN Group CEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TDomain LN Group CEnum</em>'.
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupCEnum
	 * @generated
	 */
	EEnum getTDomainLNGroupCEnum();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.scl.TDomainLNGroupGEnum <em>TDomain LN Group GEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TDomain LN Group GEnum</em>'.
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupGEnum
	 * @generated
	 */
	EEnum getTDomainLNGroupGEnum();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.scl.TDomainLNGroupIEnum <em>TDomain LN Group IEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TDomain LN Group IEnum</em>'.
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupIEnum
	 * @generated
	 */
	EEnum getTDomainLNGroupIEnum();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.scl.TDomainLNGroupMEnum <em>TDomain LN Group MEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TDomain LN Group MEnum</em>'.
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupMEnum
	 * @generated
	 */
	EEnum getTDomainLNGroupMEnum();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.scl.TDomainLNGroupPEnum <em>TDomain LN Group PEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TDomain LN Group PEnum</em>'.
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupPEnum
	 * @generated
	 */
	EEnum getTDomainLNGroupPEnum();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.scl.TDomainLNGroupREnum <em>TDomain LN Group REnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TDomain LN Group REnum</em>'.
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupREnum
	 * @generated
	 */
	EEnum getTDomainLNGroupREnum();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.scl.TDomainLNGroupSEnum <em>TDomain LN Group SEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TDomain LN Group SEnum</em>'.
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupSEnum
	 * @generated
	 */
	EEnum getTDomainLNGroupSEnum();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.scl.TDomainLNGroupTEnum <em>TDomain LN Group TEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TDomain LN Group TEnum</em>'.
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupTEnum
	 * @generated
	 */
	EEnum getTDomainLNGroupTEnum();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.scl.TDomainLNGroupXEnum <em>TDomain LN Group XEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TDomain LN Group XEnum</em>'.
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupXEnum
	 * @generated
	 */
	EEnum getTDomainLNGroupXEnum();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.scl.TDomainLNGroupYEnum <em>TDomain LN Group YEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TDomain LN Group YEnum</em>'.
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupYEnum
	 * @generated
	 */
	EEnum getTDomainLNGroupYEnum();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.scl.TDomainLNGroupZEnum <em>TDomain LN Group ZEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TDomain LN Group ZEnum</em>'.
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupZEnum
	 * @generated
	 */
	EEnum getTDomainLNGroupZEnum();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.scl.TFCEnum <em>TFC Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TFC Enum</em>'.
	 * @see ch.iec._61850._2006.scl.TFCEnum
	 * @generated
	 */
	EEnum getTFCEnum();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.scl.TGSEControlTypeEnum <em>TGSE Control Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TGSE Control Type Enum</em>'.
	 * @see ch.iec._61850._2006.scl.TGSEControlTypeEnum
	 * @generated
	 */
	EEnum getTGSEControlTypeEnum();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.scl.TLLN0Enum <em>TLLN0 Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TLLN0 Enum</em>'.
	 * @see ch.iec._61850._2006.scl.TLLN0Enum
	 * @generated
	 */
	EEnum getTLLN0Enum();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.scl.TLPHDEnum <em>TLPHD Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TLPHD Enum</em>'.
	 * @see ch.iec._61850._2006.scl.TLPHDEnum
	 * @generated
	 */
	EEnum getTLPHDEnum();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.scl.TPhaseEnum <em>TPhase Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TPhase Enum</em>'.
	 * @see ch.iec._61850._2006.scl.TPhaseEnum
	 * @generated
	 */
	EEnum getTPhaseEnum();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.scl.TPowerTransformerEnum <em>TPower Transformer Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TPower Transformer Enum</em>'.
	 * @see ch.iec._61850._2006.scl.TPowerTransformerEnum
	 * @generated
	 */
	EEnum getTPowerTransformerEnum();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.scl.TPredefinedAttributeNameEnum <em>TPredefined Attribute Name Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TPredefined Attribute Name Enum</em>'.
	 * @see ch.iec._61850._2006.scl.TPredefinedAttributeNameEnum
	 * @generated
	 */
	EEnum getTPredefinedAttributeNameEnum();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.scl.TPredefinedBasicTypeEnum <em>TPredefined Basic Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TPredefined Basic Type Enum</em>'.
	 * @see ch.iec._61850._2006.scl.TPredefinedBasicTypeEnum
	 * @generated
	 */
	EEnum getTPredefinedBasicTypeEnum();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.scl.TPredefinedCDCEnum <em>TPredefined CDC Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TPredefined CDC Enum</em>'.
	 * @see ch.iec._61850._2006.scl.TPredefinedCDCEnum
	 * @generated
	 */
	EEnum getTPredefinedCDCEnum();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.scl.TPredefinedCommonConductingEquipmentEnum <em>TPredefined Common Conducting Equipment Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TPredefined Common Conducting Equipment Enum</em>'.
	 * @see ch.iec._61850._2006.scl.TPredefinedCommonConductingEquipmentEnum
	 * @generated
	 */
	EEnum getTPredefinedCommonConductingEquipmentEnum();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.scl.TPredefinedGeneralEquipmentEnum <em>TPredefined General Equipment Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TPredefined General Equipment Enum</em>'.
	 * @see ch.iec._61850._2006.scl.TPredefinedGeneralEquipmentEnum
	 * @generated
	 */
	EEnum getTPredefinedGeneralEquipmentEnum();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.scl.TPredefinedPTypeEnum <em>TPredefined PType Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TPredefined PType Enum</em>'.
	 * @see ch.iec._61850._2006.scl.TPredefinedPTypeEnum
	 * @generated
	 */
	EEnum getTPredefinedPTypeEnum();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.scl.TServiceFCEnum <em>TService FC Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TService FC Enum</em>'.
	 * @see ch.iec._61850._2006.scl.TServiceFCEnum
	 * @generated
	 */
	EEnum getTServiceFCEnum();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.scl.TServiceSettingsEnum <em>TService Settings Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TService Settings Enum</em>'.
	 * @see ch.iec._61850._2006.scl.TServiceSettingsEnum
	 * @generated
	 */
	EEnum getTServiceSettingsEnum();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.scl.TSIUnitEnum <em>TSI Unit Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TSI Unit Enum</em>'.
	 * @see ch.iec._61850._2006.scl.TSIUnitEnum
	 * @generated
	 */
	EEnum getTSIUnitEnum();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.scl.TTransformerWindingEnum <em>TTransformer Winding Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TTransformer Winding Enum</em>'.
	 * @see ch.iec._61850._2006.scl.TTransformerWindingEnum
	 * @generated
	 */
	EEnum getTTransformerWindingEnum();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.scl.TTrgOptControlEnum <em>TTrg Opt Control Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TTrg Opt Control Enum</em>'.
	 * @see ch.iec._61850._2006.scl.TTrgOptControlEnum
	 * @generated
	 */
	EEnum getTTrgOptControlEnum();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.scl.TTrgOptEnum <em>TTrg Opt Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TTrg Opt Enum</em>'.
	 * @see ch.iec._61850._2006.scl.TTrgOptEnum
	 * @generated
	 */
	EEnum getTTrgOptEnum();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.scl.TUnitMultiplierEnum <em>TUnit Multiplier Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TUnit Multiplier Enum</em>'.
	 * @see ch.iec._61850._2006.scl.TUnitMultiplierEnum
	 * @generated
	 */
	EEnum getTUnitMultiplierEnum();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.scl.TValKindEnum <em>TVal Kind Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TVal Kind Enum</em>'.
	 * @see ch.iec._61850._2006.scl.TValKindEnum
	 * @generated
	 */
	EEnum getTValKindEnum();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.scl.NameStructureType <em>Name Structure Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Structure Type Object</em>'.
	 * @see ch.iec._61850._2006.scl.NameStructureType
	 * @model instanceClass="ch.iec._61850._2006.scl.NameStructureType"
	 *        extendedMetaData="name='nameStructure_._type:Object' baseType='nameStructure_._type'"
	 * @generated
	 */
	EDataType getNameStructureTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Smp Rate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Smp Rate Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='SmpRate_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minInclusive='0'"
	 * @generated
	 */
	EDataType getSmpRateType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>TAny Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TAny Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='tAnyName' baseType='http://www.eclipse.org/emf/2003/XMLType#normalizedString'"
	 * @generated
	 */
	EDataType getTAnyName();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.scl.TAssociationKindEnum <em>TAssociation Kind Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TAssociation Kind Enum Object</em>'.
	 * @see ch.iec._61850._2006.scl.TAssociationKindEnum
	 * @model instanceClass="ch.iec._61850._2006.scl.TAssociationKindEnum"
	 *        extendedMetaData="name='tAssociationKindEnum:Object' baseType='tAssociationKindEnum'"
	 * @generated
	 */
	EDataType getTAssociationKindEnumObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>TAttribute Name Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TAttribute Name Enum</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='tAttributeNameEnum' memberTypes='tPredefinedAttributeNameEnum tExtensionAttributeNameEnum'"
	 * @generated
	 */
	EDataType getTAttributeNameEnum();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.scl.TAuthenticationEnum <em>TAuthentication Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TAuthentication Enum Object</em>'.
	 * @see ch.iec._61850._2006.scl.TAuthenticationEnum
	 * @model instanceClass="ch.iec._61850._2006.scl.TAuthenticationEnum"
	 *        extendedMetaData="name='tAuthenticationEnum:Object' baseType='tAuthenticationEnum'"
	 * @generated
	 */
	EDataType getTAuthenticationEnumObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>TBasic Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TBasic Type Enum</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='tBasicTypeEnum' memberTypes='tPredefinedBasicTypeEnum tExtensionBasicTypeEnum'"
	 * @generated
	 */
	EDataType getTBasicTypeEnum();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>TCDC Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TCDC Enum</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='tCDCEnum' memberTypes='tPredefinedCDCEnum tExtensionCDCEnum'"
	 * @generated
	 */
	EDataType getTCDCEnum();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>TCommon Conducting Equipment Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TCommon Conducting Equipment Enum</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='tCommonConductingEquipmentEnum' memberTypes='tPredefinedCommonConductingEquipmentEnum tExtensionEquipmentEnum'"
	 * @generated
	 */
	EDataType getTCommonConductingEquipmentEnum();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>TDomain LN Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TDomain LN Enum</em>'.
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @model instanceClass="org.eclipse.emf.common.util.Enumerator"
	 *        extendedMetaData="name='tDomainLNEnum' memberTypes='tDomainLNGroupAEnum tDomainLNGroupCEnum tDomainLNGroupGEnum tDomainLNGroupIEnum tDomainLNGroupMEnum tDomainLNGroupPEnum tDomainLNGroupREnum tDomainLNGroupSEnum tDomainLNGroupTEnum tDomainLNGroupXEnum tDomainLNGroupYEnum tDomainLNGroupZEnum'"
	 * @generated
	 */
	EDataType getTDomainLNEnum();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.scl.TDomainLNGroupAEnum <em>TDomain LN Group AEnum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TDomain LN Group AEnum Object</em>'.
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupAEnum
	 * @model instanceClass="ch.iec._61850._2006.scl.TDomainLNGroupAEnum"
	 *        extendedMetaData="name='tDomainLNGroupAEnum:Object' baseType='tDomainLNGroupAEnum'"
	 * @generated
	 */
	EDataType getTDomainLNGroupAEnumObject();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.scl.TDomainLNGroupCEnum <em>TDomain LN Group CEnum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TDomain LN Group CEnum Object</em>'.
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupCEnum
	 * @model instanceClass="ch.iec._61850._2006.scl.TDomainLNGroupCEnum"
	 *        extendedMetaData="name='tDomainLNGroupCEnum:Object' baseType='tDomainLNGroupCEnum'"
	 * @generated
	 */
	EDataType getTDomainLNGroupCEnumObject();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.scl.TDomainLNGroupGEnum <em>TDomain LN Group GEnum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TDomain LN Group GEnum Object</em>'.
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupGEnum
	 * @model instanceClass="ch.iec._61850._2006.scl.TDomainLNGroupGEnum"
	 *        extendedMetaData="name='tDomainLNGroupGEnum:Object' baseType='tDomainLNGroupGEnum'"
	 * @generated
	 */
	EDataType getTDomainLNGroupGEnumObject();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.scl.TDomainLNGroupIEnum <em>TDomain LN Group IEnum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TDomain LN Group IEnum Object</em>'.
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupIEnum
	 * @model instanceClass="ch.iec._61850._2006.scl.TDomainLNGroupIEnum"
	 *        extendedMetaData="name='tDomainLNGroupIEnum:Object' baseType='tDomainLNGroupIEnum'"
	 * @generated
	 */
	EDataType getTDomainLNGroupIEnumObject();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.scl.TDomainLNGroupMEnum <em>TDomain LN Group MEnum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TDomain LN Group MEnum Object</em>'.
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupMEnum
	 * @model instanceClass="ch.iec._61850._2006.scl.TDomainLNGroupMEnum"
	 *        extendedMetaData="name='tDomainLNGroupMEnum:Object' baseType='tDomainLNGroupMEnum'"
	 * @generated
	 */
	EDataType getTDomainLNGroupMEnumObject();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.scl.TDomainLNGroupPEnum <em>TDomain LN Group PEnum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TDomain LN Group PEnum Object</em>'.
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupPEnum
	 * @model instanceClass="ch.iec._61850._2006.scl.TDomainLNGroupPEnum"
	 *        extendedMetaData="name='tDomainLNGroupPEnum:Object' baseType='tDomainLNGroupPEnum'"
	 * @generated
	 */
	EDataType getTDomainLNGroupPEnumObject();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.scl.TDomainLNGroupREnum <em>TDomain LN Group REnum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TDomain LN Group REnum Object</em>'.
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupREnum
	 * @model instanceClass="ch.iec._61850._2006.scl.TDomainLNGroupREnum"
	 *        extendedMetaData="name='tDomainLNGroupREnum:Object' baseType='tDomainLNGroupREnum'"
	 * @generated
	 */
	EDataType getTDomainLNGroupREnumObject();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.scl.TDomainLNGroupSEnum <em>TDomain LN Group SEnum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TDomain LN Group SEnum Object</em>'.
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupSEnum
	 * @model instanceClass="ch.iec._61850._2006.scl.TDomainLNGroupSEnum"
	 *        extendedMetaData="name='tDomainLNGroupSEnum:Object' baseType='tDomainLNGroupSEnum'"
	 * @generated
	 */
	EDataType getTDomainLNGroupSEnumObject();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.scl.TDomainLNGroupTEnum <em>TDomain LN Group TEnum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TDomain LN Group TEnum Object</em>'.
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupTEnum
	 * @model instanceClass="ch.iec._61850._2006.scl.TDomainLNGroupTEnum"
	 *        extendedMetaData="name='tDomainLNGroupTEnum:Object' baseType='tDomainLNGroupTEnum'"
	 * @generated
	 */
	EDataType getTDomainLNGroupTEnumObject();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.scl.TDomainLNGroupXEnum <em>TDomain LN Group XEnum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TDomain LN Group XEnum Object</em>'.
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupXEnum
	 * @model instanceClass="ch.iec._61850._2006.scl.TDomainLNGroupXEnum"
	 *        extendedMetaData="name='tDomainLNGroupXEnum:Object' baseType='tDomainLNGroupXEnum'"
	 * @generated
	 */
	EDataType getTDomainLNGroupXEnumObject();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.scl.TDomainLNGroupYEnum <em>TDomain LN Group YEnum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TDomain LN Group YEnum Object</em>'.
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupYEnum
	 * @model instanceClass="ch.iec._61850._2006.scl.TDomainLNGroupYEnum"
	 *        extendedMetaData="name='tDomainLNGroupYEnum:Object' baseType='tDomainLNGroupYEnum'"
	 * @generated
	 */
	EDataType getTDomainLNGroupYEnumObject();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.scl.TDomainLNGroupZEnum <em>TDomain LN Group ZEnum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TDomain LN Group ZEnum Object</em>'.
	 * @see ch.iec._61850._2006.scl.TDomainLNGroupZEnum
	 * @model instanceClass="ch.iec._61850._2006.scl.TDomainLNGroupZEnum"
	 *        extendedMetaData="name='tDomainLNGroupZEnum:Object' baseType='tDomainLNGroupZEnum'"
	 * @generated
	 */
	EDataType getTDomainLNGroupZEnumObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>TEquipment Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TEquipment Enum</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='tEquipmentEnum' memberTypes='tPredefinedEquipmentEnum tExtensionEquipmentEnum'"
	 * @generated
	 */
	EDataType getTEquipmentEnum();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>TExtension Attribute Name Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TExtension Attribute Name Enum</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='tExtensionAttributeNameEnum' baseType='tRestrName1stL'"
	 * @generated
	 */
	EDataType getTExtensionAttributeNameEnum();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>TExtension Basic Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TExtension Basic Type Enum</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='tExtensionBasicTypeEnum' baseType='http://www.eclipse.org/emf/2003/XMLType#Name' pattern='\\p{Lu}[\\p{L},\\d]*'"
	 * @generated
	 */
	EDataType getTExtensionBasicTypeEnum();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>TExtension CDC Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TExtension CDC Enum</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='tExtensionCDCEnum' baseType='http://www.eclipse.org/emf/2003/XMLType#Name' minLength='1' pattern='\\p{Lu}+'"
	 * @generated
	 */
	EDataType getTExtensionCDCEnum();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>TExtension Equipment Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TExtension Equipment Enum</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='tExtensionEquipmentEnum' baseType='http://www.eclipse.org/emf/2003/XMLType#Name' pattern='E\\p{Lu}*'"
	 * @generated
	 */
	EDataType getTExtensionEquipmentEnum();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>TExtension General Equipment Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TExtension General Equipment Enum</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='tExtensionGeneralEquipmentEnum' baseType='http://www.eclipse.org/emf/2003/XMLType#Name' pattern='E\\p{Lu}*'"
	 * @generated
	 */
	EDataType getTExtensionGeneralEquipmentEnum();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>TExtension LN Class Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TExtension LN Class Enum</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='tExtensionLNClassEnum' baseType='http://www.eclipse.org/emf/2003/XMLType#Name' minLength='1' pattern='\\p{Lu}+'"
	 * @generated
	 */
	EDataType getTExtensionLNClassEnum();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>TExtension PType Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TExtension PType Enum</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='tExtensionPTypeEnum' baseType='http://www.eclipse.org/emf/2003/XMLType#normalizedString' pattern='\\p{Lu}[\\d,\\p{L},\\-]*'"
	 * @generated
	 */
	EDataType getTExtensionPTypeEnum();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.scl.TFCEnum <em>TFC Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TFC Enum Object</em>'.
	 * @see ch.iec._61850._2006.scl.TFCEnum
	 * @model instanceClass="ch.iec._61850._2006.scl.TFCEnum"
	 *        extendedMetaData="name='tFCEnum:Object' baseType='tFCEnum'"
	 * @generated
	 */
	EDataType getTFCEnumObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>TGeneral Equipment Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TGeneral Equipment Enum</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='tGeneralEquipmentEnum' memberTypes='tPredefinedGeneralEquipmentEnum tExtensionGeneralEquipmentEnum'"
	 * @generated
	 */
	EDataType getTGeneralEquipmentEnum();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.scl.TGSEControlTypeEnum <em>TGSE Control Type Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TGSE Control Type Enum Object</em>'.
	 * @see ch.iec._61850._2006.scl.TGSEControlTypeEnum
	 * @model instanceClass="ch.iec._61850._2006.scl.TGSEControlTypeEnum"
	 *        extendedMetaData="name='tGSEControlTypeEnum:Object' baseType='tGSEControlTypeEnum'"
	 * @generated
	 */
	EDataType getTGSEControlTypeEnumObject();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.scl.TLLN0Enum <em>TLLN0 Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TLLN0 Enum Object</em>'.
	 * @see ch.iec._61850._2006.scl.TLLN0Enum
	 * @model instanceClass="ch.iec._61850._2006.scl.TLLN0Enum"
	 *        extendedMetaData="name='tLLN0Enum:Object' baseType='tLLN0Enum'"
	 * @generated
	 */
	EDataType getTLLN0EnumObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>TLN Class Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TLN Class Enum</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='tLNClassEnum' memberTypes='tPredefinedLNClassEnum tExtensionLNClassEnum'"
	 * @generated
	 */
	EDataType getTLNClassEnum();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.scl.TLPHDEnum <em>TLPHD Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TLPHD Enum Object</em>'.
	 * @see ch.iec._61850._2006.scl.TLPHDEnum
	 * @model instanceClass="ch.iec._61850._2006.scl.TLPHDEnum"
	 *        extendedMetaData="name='tLPHDEnum:Object' baseType='tLPHDEnum'"
	 * @generated
	 */
	EDataType getTLPHDEnumObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>TName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TName</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='tName' baseType='tAnyName' minLength='1'"
	 * @generated
	 */
	EDataType getTName();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>TP Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TP Addr</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='tPAddr' baseType='http://www.eclipse.org/emf/2003/XMLType#normalizedString' minLength='1'"
	 * @generated
	 */
	EDataType getTPAddr();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.scl.TPhaseEnum <em>TPhase Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TPhase Enum Object</em>'.
	 * @see ch.iec._61850._2006.scl.TPhaseEnum
	 * @model instanceClass="ch.iec._61850._2006.scl.TPhaseEnum"
	 *        extendedMetaData="name='tPhaseEnum:Object' baseType='tPhaseEnum'"
	 * @generated
	 */
	EDataType getTPhaseEnumObject();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.scl.TPowerTransformerEnum <em>TPower Transformer Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TPower Transformer Enum Object</em>'.
	 * @see ch.iec._61850._2006.scl.TPowerTransformerEnum
	 * @model instanceClass="ch.iec._61850._2006.scl.TPowerTransformerEnum"
	 *        extendedMetaData="name='tPowerTransformerEnum:Object' baseType='tPowerTransformerEnum'"
	 * @generated
	 */
	EDataType getTPowerTransformerEnumObject();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.scl.TPredefinedAttributeNameEnum <em>TPredefined Attribute Name Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TPredefined Attribute Name Enum Object</em>'.
	 * @see ch.iec._61850._2006.scl.TPredefinedAttributeNameEnum
	 * @model instanceClass="ch.iec._61850._2006.scl.TPredefinedAttributeNameEnum"
	 *        extendedMetaData="name='tPredefinedAttributeNameEnum:Object' baseType='tPredefinedAttributeNameEnum'"
	 * @generated
	 */
	EDataType getTPredefinedAttributeNameEnumObject();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.scl.TPredefinedBasicTypeEnum <em>TPredefined Basic Type Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TPredefined Basic Type Enum Object</em>'.
	 * @see ch.iec._61850._2006.scl.TPredefinedBasicTypeEnum
	 * @model instanceClass="ch.iec._61850._2006.scl.TPredefinedBasicTypeEnum"
	 *        extendedMetaData="name='tPredefinedBasicTypeEnum:Object' baseType='tPredefinedBasicTypeEnum'"
	 * @generated
	 */
	EDataType getTPredefinedBasicTypeEnumObject();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.scl.TPredefinedCDCEnum <em>TPredefined CDC Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TPredefined CDC Enum Object</em>'.
	 * @see ch.iec._61850._2006.scl.TPredefinedCDCEnum
	 * @model instanceClass="ch.iec._61850._2006.scl.TPredefinedCDCEnum"
	 *        extendedMetaData="name='tPredefinedCDCEnum:Object' baseType='tPredefinedCDCEnum'"
	 * @generated
	 */
	EDataType getTPredefinedCDCEnumObject();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.scl.TPredefinedCommonConductingEquipmentEnum <em>TPredefined Common Conducting Equipment Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TPredefined Common Conducting Equipment Enum Object</em>'.
	 * @see ch.iec._61850._2006.scl.TPredefinedCommonConductingEquipmentEnum
	 * @model instanceClass="ch.iec._61850._2006.scl.TPredefinedCommonConductingEquipmentEnum"
	 *        extendedMetaData="name='tPredefinedCommonConductingEquipmentEnum:Object' baseType='tPredefinedCommonConductingEquipmentEnum'"
	 * @generated
	 */
	EDataType getTPredefinedCommonConductingEquipmentEnumObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>TPredefined Equipment Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TPredefined Equipment Enum</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='tPredefinedEquipmentEnum' memberTypes='tCommonConductingEquipmentEnum tPowerTransformerEnum tTransformerWindingEnum'"
	 * @generated
	 */
	EDataType getTPredefinedEquipmentEnum();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.scl.TPredefinedGeneralEquipmentEnum <em>TPredefined General Equipment Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TPredefined General Equipment Enum Object</em>'.
	 * @see ch.iec._61850._2006.scl.TPredefinedGeneralEquipmentEnum
	 * @model instanceClass="ch.iec._61850._2006.scl.TPredefinedGeneralEquipmentEnum"
	 *        extendedMetaData="name='tPredefinedGeneralEquipmentEnum:Object' baseType='tPredefinedGeneralEquipmentEnum'"
	 * @generated
	 */
	EDataType getTPredefinedGeneralEquipmentEnumObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>TPredefined LN Class Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TPredefined LN Class Enum</em>'.
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @model instanceClass="org.eclipse.emf.common.util.Enumerator"
	 *        extendedMetaData="name='tPredefinedLNClassEnum' memberTypes='tLPHDEnum tLLN0Enum tDomainLNEnum'"
	 * @generated
	 */
	EDataType getTPredefinedLNClassEnum();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.scl.TPredefinedPTypeEnum <em>TPredefined PType Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TPredefined PType Enum Object</em>'.
	 * @see ch.iec._61850._2006.scl.TPredefinedPTypeEnum
	 * @model instanceClass="ch.iec._61850._2006.scl.TPredefinedPTypeEnum"
	 *        extendedMetaData="name='tPredefinedPTypeEnum:Object' baseType='tPredefinedPTypeEnum'"
	 * @generated
	 */
	EDataType getTPredefinedPTypeEnumObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>TP Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TP Type Enum</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='tPTypeEnum' memberTypes='tPredefinedPTypeEnum tExtensionPTypeEnum'"
	 * @generated
	 */
	EDataType getTPTypeEnum();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>TRef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TRef</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='tRef' baseType='http://www.eclipse.org/emf/2003/XMLType#normalizedString' pattern='.+/.+/.+/.+'"
	 * @generated
	 */
	EDataType getTRef();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>TRestr Ld Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TRestr Ld Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='tRestrLdName' baseType='http://www.eclipse.org/emf/2003/XMLType#Name' maxLength='64' pattern='\\p{L}[\\d,\\p{L}]*'"
	 * @generated
	 */
	EDataType getTRestrLdName();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>TRestr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TRestr Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='tRestrName' baseType='http://www.eclipse.org/emf/2003/XMLType#Name' pattern='[\\d,\\p{L}]+'"
	 * @generated
	 */
	EDataType getTRestrName();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>TRestr Name1st L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TRestr Name1st L</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='tRestrName1stL' baseType='http://www.eclipse.org/emf/2003/XMLType#Name' pattern='\\p{Ll}[\\d,\\p{L}]*'"
	 * @generated
	 */
	EDataType getTRestrName1stL();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>TRestr Name1st U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TRestr Name1st U</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='tRestrName1stU' baseType='http://www.eclipse.org/emf/2003/XMLType#Name' pattern='\\p{Lu}[\\d,\\p{L}]*'"
	 * @generated
	 */
	EDataType getTRestrName1stU();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.scl.TServiceFCEnum <em>TService FC Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TService FC Enum Object</em>'.
	 * @see ch.iec._61850._2006.scl.TServiceFCEnum
	 * @model instanceClass="ch.iec._61850._2006.scl.TServiceFCEnum"
	 *        extendedMetaData="name='tServiceFCEnum:Object' baseType='tServiceFCEnum'"
	 * @generated
	 */
	EDataType getTServiceFCEnumObject();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.scl.TServiceSettingsEnum <em>TService Settings Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TService Settings Enum Object</em>'.
	 * @see ch.iec._61850._2006.scl.TServiceSettingsEnum
	 * @model instanceClass="ch.iec._61850._2006.scl.TServiceSettingsEnum"
	 *        extendedMetaData="name='tServiceSettingsEnum:Object' baseType='tServiceSettingsEnum'"
	 * @generated
	 */
	EDataType getTServiceSettingsEnumObject();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.scl.TSIUnitEnum <em>TSI Unit Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TSI Unit Enum Object</em>'.
	 * @see ch.iec._61850._2006.scl.TSIUnitEnum
	 * @model instanceClass="ch.iec._61850._2006.scl.TSIUnitEnum"
	 *        extendedMetaData="name='tSIUnitEnum:Object' baseType='tSIUnitEnum'"
	 * @generated
	 */
	EDataType getTSIUnitEnumObject();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.scl.TTransformerWindingEnum <em>TTransformer Winding Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TTransformer Winding Enum Object</em>'.
	 * @see ch.iec._61850._2006.scl.TTransformerWindingEnum
	 * @model instanceClass="ch.iec._61850._2006.scl.TTransformerWindingEnum"
	 *        extendedMetaData="name='tTransformerWindingEnum:Object' baseType='tTransformerWindingEnum'"
	 * @generated
	 */
	EDataType getTTransformerWindingEnumObject();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.scl.TTrgOptControlEnum <em>TTrg Opt Control Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TTrg Opt Control Enum Object</em>'.
	 * @see ch.iec._61850._2006.scl.TTrgOptControlEnum
	 * @model instanceClass="ch.iec._61850._2006.scl.TTrgOptControlEnum"
	 *        extendedMetaData="name='tTrgOptControlEnum:Object' baseType='tTrgOptControlEnum'"
	 * @generated
	 */
	EDataType getTTrgOptControlEnumObject();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.scl.TTrgOptEnum <em>TTrg Opt Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TTrg Opt Enum Object</em>'.
	 * @see ch.iec._61850._2006.scl.TTrgOptEnum
	 * @model instanceClass="ch.iec._61850._2006.scl.TTrgOptEnum"
	 *        extendedMetaData="name='tTrgOptEnum:Object' baseType='tTrgOptEnum'"
	 * @generated
	 */
	EDataType getTTrgOptEnumObject();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.scl.TUnitMultiplierEnum <em>TUnit Multiplier Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TUnit Multiplier Enum Object</em>'.
	 * @see ch.iec._61850._2006.scl.TUnitMultiplierEnum
	 * @model instanceClass="ch.iec._61850._2006.scl.TUnitMultiplierEnum"
	 *        extendedMetaData="name='tUnitMultiplierEnum:Object' baseType='tUnitMultiplierEnum'"
	 * @generated
	 */
	EDataType getTUnitMultiplierEnumObject();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.scl.TValKindEnum <em>TVal Kind Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TVal Kind Enum Object</em>'.
	 * @see ch.iec._61850._2006.scl.TValKindEnum
	 * @model instanceClass="ch.iec._61850._2006.scl.TValKindEnum"
	 *        extendedMetaData="name='tValKindEnum:Object' baseType='tValKindEnum'"
	 * @generated
	 */
	EDataType getTValKindEnumObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SclFactory getSclFactory();

} //SclPackage
