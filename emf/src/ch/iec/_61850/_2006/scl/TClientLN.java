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
 * A representation of the model object '<em><b>TClient LN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TClientLN#getIedName <em>Ied Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TClientLN#getLdInst <em>Ld Inst</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TClientLN#getLnClass <em>Ln Class</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TClientLN#getLnInst <em>Ln Inst</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TClientLN#getPrefix <em>Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTClientLN()
 * @model extendedMetaData="name='tClientLN' kind='empty'"
 * @generated
 */
public interface TClientLN extends EObject {
	/**
	 * Returns the value of the '<em><b>Ied Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ied Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ied Name</em>' attribute.
	 * @see #setIedName(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTClientLN_IedName()
	 * @model dataType="ch.iec._61850._2006.scl.TName" required="true"
	 *        extendedMetaData="kind='attribute' name='iedName'"
	 * @generated
	 */
	String getIedName();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TClientLN#getIedName <em>Ied Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ied Name</em>' attribute.
	 * @see #getIedName()
	 * @generated
	 */
	void setIedName(String value);

	/**
	 * Returns the value of the '<em><b>Ld Inst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ld Inst</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ld Inst</em>' attribute.
	 * @see #setLdInst(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTClientLN_LdInst()
	 * @model dataType="ch.iec._61850._2006.scl.TName" required="true"
	 *        extendedMetaData="kind='attribute' name='ldInst'"
	 * @generated
	 */
	String getLdInst();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TClientLN#getLdInst <em>Ld Inst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ld Inst</em>' attribute.
	 * @see #getLdInst()
	 * @generated
	 */
	void setLdInst(String value);

	/**
	 * Returns the value of the '<em><b>Ln Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ln Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ln Class</em>' attribute.
	 * @see #setLnClass(Object)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTClientLN_LnClass()
	 * @model dataType="ch.iec._61850._2006.scl.TLNClassEnum" required="true"
	 *        extendedMetaData="kind='attribute' name='lnClass'"
	 * @generated
	 */
	Object getLnClass();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TClientLN#getLnClass <em>Ln Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ln Class</em>' attribute.
	 * @see #getLnClass()
	 * @generated
	 */
	void setLnClass(Object value);

	/**
	 * Returns the value of the '<em><b>Ln Inst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ln Inst</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ln Inst</em>' attribute.
	 * @see #setLnInst(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTClientLN_LnInst()
	 * @model dataType="ch.iec._61850._2006.scl.TAnyName" required="true"
	 *        extendedMetaData="kind='attribute' name='lnInst'"
	 * @generated
	 */
	String getLnInst();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TClientLN#getLnInst <em>Ln Inst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ln Inst</em>' attribute.
	 * @see #getLnInst()
	 * @generated
	 */
	void setLnInst(String value);

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTClientLN_Prefix()
	 * @model dataType="ch.iec._61850._2006.scl.TAnyName"
	 *        extendedMetaData="kind='attribute' name='prefix'"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TClientLN#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

} // TClientLN
