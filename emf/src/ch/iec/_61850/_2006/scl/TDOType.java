/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TDO Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TDOType#getGroup <em>Group</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TDOType#getSDO <em>SDO</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TDOType#getDA <em>DA</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TDOType#getCdc <em>Cdc</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TDOType#getIedType <em>Ied Type</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TDOType#getExtRef <em>Ext Ref</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TDOType#getFcda <em>Fcda</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTDOType()
 * @model extendedMetaData="name='tDOType' kind='elementOnly'"
 * @generated
 */
public interface TDOType extends TIDNaming {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTDOType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:6'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>SDO</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TSDO}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SDO</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SDO</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTDOType_SDO()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SDO' namespace='##targetNamespace' group='#group:6'"
	 * @generated
	 */
	EList<TSDO> getSDO();

	/**
	 * Returns the value of the '<em><b>DA</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TDA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DA</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DA</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTDOType_DA()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DA' namespace='##targetNamespace' group='#group:6'"
	 * @generated
	 */
	EList<TDA> getDA();

	/**
	 * Returns the value of the '<em><b>Cdc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cdc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cdc</em>' attribute.
	 * @see #setCdc(Object)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTDOType_Cdc()
	 * @model dataType="ch.iec._61850._2006.scl.TCDCEnum" required="true"
	 *        extendedMetaData="kind='attribute' name='cdc'"
	 * @generated
	 */
	Object getCdc();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TDOType#getCdc <em>Cdc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cdc</em>' attribute.
	 * @see #getCdc()
	 * @generated
	 */
	void setCdc(Object value);

	/**
	 * Returns the value of the '<em><b>Ied Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ied Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ied Type</em>' attribute.
	 * @see #isSetIedType()
	 * @see #unsetIedType()
	 * @see #setIedType(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTDOType_IedType()
	 * @model default="" unsettable="true" dataType="ch.iec._61850._2006.scl.TAnyName"
	 *        extendedMetaData="kind='attribute' name='iedType'"
	 * @generated
	 */
	String getIedType();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TDOType#getIedType <em>Ied Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ied Type</em>' attribute.
	 * @see #isSetIedType()
	 * @see #unsetIedType()
	 * @see #getIedType()
	 * @generated
	 */
	void setIedType(String value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TDOType#getIedType <em>Ied Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIedType()
	 * @see #getIedType()
	 * @see #setIedType(String)
	 * @generated
	 */
	void unsetIedType();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TDOType#getIedType <em>Ied Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ied Type</em>' attribute is set.
	 * @see #unsetIedType()
	 * @see #getIedType()
	 * @see #setIedType(String)
	 * @generated
	 */
	boolean isSetIedType();

	/**
	 * Returns the value of the '<em><b>Ext Ref</b></em>' reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TExtRef}.
	 * It is bidirectional and its opposite is '{@link ch.iec._61850._2006.scl.TExtRef#getDoType <em>Do Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ext Ref</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ext Ref</em>' reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTDOType_ExtRef()
	 * @see ch.iec._61850._2006.scl.TExtRef#getDoType
	 * @model opposite="doType"
	 * @generated
	 */
	EList<TExtRef> getExtRef();

	/**
	 * Returns the value of the '<em><b>Fcda</b></em>' reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TFCDA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fcda</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fcda</em>' reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTDOType_Fcda()
	 * @model
	 * @generated
	 */
	EList<TFCDA> getFcda();

} // TDOType
