/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.DocumentRoot#getCommunication <em>Communication</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.DocumentRoot#getDataTypeTemplates <em>Data Type Templates</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.DocumentRoot#getIED <em>IED</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.DocumentRoot#getLN <em>LN</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.DocumentRoot#getLN0 <em>LN0</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.DocumentRoot#getSubstation <em>Substation</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.DocumentRoot#getSCL <em>SCL</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see ch.iec._61850._2006.scl.SclPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see ch.iec._61850._2006.scl.SclPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Communication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication</em>' containment reference.
	 * @see #setCommunication(TCommunication)
	 * @see ch.iec._61850._2006.scl.SclPackage#getDocumentRoot_Communication()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Communication' namespace='##targetNamespace'"
	 * @generated
	 */
	TCommunication getCommunication();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.DocumentRoot#getCommunication <em>Communication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication</em>' containment reference.
	 * @see #getCommunication()
	 * @generated
	 */
	void setCommunication(TCommunication value);

	/**
	 * Returns the value of the '<em><b>Data Type Templates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type Templates</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type Templates</em>' containment reference.
	 * @see #setDataTypeTemplates(TDataTypeTemplates)
	 * @see ch.iec._61850._2006.scl.SclPackage#getDocumentRoot_DataTypeTemplates()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DataTypeTemplates' namespace='##targetNamespace'"
	 * @generated
	 */
	TDataTypeTemplates getDataTypeTemplates();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.DocumentRoot#getDataTypeTemplates <em>Data Type Templates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type Templates</em>' containment reference.
	 * @see #getDataTypeTemplates()
	 * @generated
	 */
	void setDataTypeTemplates(TDataTypeTemplates value);

	/**
	 * Returns the value of the '<em><b>IED</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IED</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IED</em>' containment reference.
	 * @see #setIED(TIED)
	 * @see ch.iec._61850._2006.scl.SclPackage#getDocumentRoot_IED()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IED' namespace='##targetNamespace'"
	 * @generated
	 */
	TIED getIED();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.DocumentRoot#getIED <em>IED</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IED</em>' containment reference.
	 * @see #getIED()
	 * @generated
	 */
	void setIED(TIED value);

	/**
	 * Returns the value of the '<em><b>LN</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LN</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LN</em>' containment reference.
	 * @see #setLN(TLN)
	 * @see ch.iec._61850._2006.scl.SclPackage#getDocumentRoot_LN()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LN' namespace='##targetNamespace'"
	 * @generated
	 */
	TLN getLN();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.DocumentRoot#getLN <em>LN</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LN</em>' containment reference.
	 * @see #getLN()
	 * @generated
	 */
	void setLN(TLN value);

	/**
	 * Returns the value of the '<em><b>LN0</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LN0</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LN0</em>' containment reference.
	 * @see #setLN0(LN0Type)
	 * @see ch.iec._61850._2006.scl.SclPackage#getDocumentRoot_LN0()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LN0' namespace='##targetNamespace'"
	 * @generated
	 */
	LN0Type getLN0();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.DocumentRoot#getLN0 <em>LN0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LN0</em>' containment reference.
	 * @see #getLN0()
	 * @generated
	 */
	void setLN0(LN0Type value);

	/**
	 * Returns the value of the '<em><b>Substation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substation</em>' containment reference.
	 * @see #setSubstation(TSubstation)
	 * @see ch.iec._61850._2006.scl.SclPackage#getDocumentRoot_Substation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Substation' namespace='##targetNamespace'"
	 * @generated
	 */
	TSubstation getSubstation();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.DocumentRoot#getSubstation <em>Substation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substation</em>' containment reference.
	 * @see #getSubstation()
	 * @generated
	 */
	void setSubstation(TSubstation value);

	/**
	 * Returns the value of the '<em><b>SCL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SCL</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SCL</em>' containment reference.
	 * @see #setSCL(SCLType)
	 * @see ch.iec._61850._2006.scl.SclPackage#getDocumentRoot_SCL()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SCL' namespace='##targetNamespace'"
	 * @generated
	 */
	SCLType getSCL();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.DocumentRoot#getSCL <em>SCL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SCL</em>' containment reference.
	 * @see #getSCL()
	 * @generated
	 */
	void setSCL(SCLType value);

} // DocumentRoot
