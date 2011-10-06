/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TTrg Ops</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TTrgOps#isDchg <em>Dchg</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TTrgOps#isDupd <em>Dupd</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TTrgOps#isPeriod <em>Period</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TTrgOps#isQchg <em>Qchg</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTTrgOps()
 * @model extendedMetaData="name='tTrgOps' kind='empty'"
 * @generated
 */
public interface TTrgOps extends EObject {
	/**
	 * Returns the value of the '<em><b>Dchg</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dchg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dchg</em>' attribute.
	 * @see #isSetDchg()
	 * @see #unsetDchg()
	 * @see #setDchg(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTTrgOps_Dchg()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='dchg'"
	 * @generated
	 */
	boolean isDchg();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TTrgOps#isDchg <em>Dchg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dchg</em>' attribute.
	 * @see #isSetDchg()
	 * @see #unsetDchg()
	 * @see #isDchg()
	 * @generated
	 */
	void setDchg(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TTrgOps#isDchg <em>Dchg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDchg()
	 * @see #isDchg()
	 * @see #setDchg(boolean)
	 * @generated
	 */
	void unsetDchg();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TTrgOps#isDchg <em>Dchg</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dchg</em>' attribute is set.
	 * @see #unsetDchg()
	 * @see #isDchg()
	 * @see #setDchg(boolean)
	 * @generated
	 */
	boolean isSetDchg();

	/**
	 * Returns the value of the '<em><b>Dupd</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dupd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dupd</em>' attribute.
	 * @see #isSetDupd()
	 * @see #unsetDupd()
	 * @see #setDupd(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTTrgOps_Dupd()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='dupd'"
	 * @generated
	 */
	boolean isDupd();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TTrgOps#isDupd <em>Dupd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dupd</em>' attribute.
	 * @see #isSetDupd()
	 * @see #unsetDupd()
	 * @see #isDupd()
	 * @generated
	 */
	void setDupd(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TTrgOps#isDupd <em>Dupd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDupd()
	 * @see #isDupd()
	 * @see #setDupd(boolean)
	 * @generated
	 */
	void unsetDupd();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TTrgOps#isDupd <em>Dupd</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dupd</em>' attribute is set.
	 * @see #unsetDupd()
	 * @see #isDupd()
	 * @see #setDupd(boolean)
	 * @generated
	 */
	boolean isSetDupd();

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #isSetPeriod()
	 * @see #unsetPeriod()
	 * @see #setPeriod(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTTrgOps_Period()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='period'"
	 * @generated
	 */
	boolean isPeriod();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TTrgOps#isPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #isSetPeriod()
	 * @see #unsetPeriod()
	 * @see #isPeriod()
	 * @generated
	 */
	void setPeriod(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TTrgOps#isPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPeriod()
	 * @see #isPeriod()
	 * @see #setPeriod(boolean)
	 * @generated
	 */
	void unsetPeriod();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TTrgOps#isPeriod <em>Period</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Period</em>' attribute is set.
	 * @see #unsetPeriod()
	 * @see #isPeriod()
	 * @see #setPeriod(boolean)
	 * @generated
	 */
	boolean isSetPeriod();

	/**
	 * Returns the value of the '<em><b>Qchg</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qchg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qchg</em>' attribute.
	 * @see #isSetQchg()
	 * @see #unsetQchg()
	 * @see #setQchg(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTTrgOps_Qchg()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='qchg'"
	 * @generated
	 */
	boolean isQchg();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TTrgOps#isQchg <em>Qchg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qchg</em>' attribute.
	 * @see #isSetQchg()
	 * @see #unsetQchg()
	 * @see #isQchg()
	 * @generated
	 */
	void setQchg(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TTrgOps#isQchg <em>Qchg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQchg()
	 * @see #isQchg()
	 * @see #setQchg(boolean)
	 * @generated
	 */
	void unsetQchg();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TTrgOps#isQchg <em>Qchg</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Qchg</em>' attribute is set.
	 * @see #unsetQchg()
	 * @see #isQchg()
	 * @see #setQchg(boolean)
	 * @generated
	 */
	boolean isSetQchg();

} // TTrgOps
