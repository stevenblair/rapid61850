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
 * A representation of the model object '<em><b>TSDI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TSDI#getGroup <em>Group</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TSDI#getSDI <em>SDI</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TSDI#getDAI <em>DAI</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TSDI#getIx <em>Ix</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TSDI#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTSDI()
 * @model extendedMetaData="name='tSDI' kind='elementOnly'"
 * @generated
 */
public interface TSDI extends TUnNaming {
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
	 * @see ch.iec._61850._2006.scl.SclPackage#getTSDI_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:5'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>SDI</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TSDI}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SDI</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SDI</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTSDI_SDI()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SDI' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<TSDI> getSDI();

	/**
	 * Returns the value of the '<em><b>DAI</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TDAI}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DAI</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DAI</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTSDI_DAI()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DAI' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<TDAI> getDAI();

	/**
	 * Returns the value of the '<em><b>Ix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ix</em>' attribute.
	 * @see #isSetIx()
	 * @see #unsetIx()
	 * @see #setIx(long)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTSDI_Ix()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='attribute' name='ix'"
	 * @generated
	 */
	long getIx();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TSDI#getIx <em>Ix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ix</em>' attribute.
	 * @see #isSetIx()
	 * @see #unsetIx()
	 * @see #getIx()
	 * @generated
	 */
	void setIx(long value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TSDI#getIx <em>Ix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIx()
	 * @see #getIx()
	 * @see #setIx(long)
	 * @generated
	 */
	void unsetIx();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TSDI#getIx <em>Ix</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ix</em>' attribute is set.
	 * @see #unsetIx()
	 * @see #getIx()
	 * @see #setIx(long)
	 * @generated
	 */
	boolean isSetIx();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(Object)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTSDI_Name()
	 * @model dataType="ch.iec._61850._2006.scl.TAttributeNameEnum" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	Object getName();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TSDI#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(Object value);

} // TSDI
