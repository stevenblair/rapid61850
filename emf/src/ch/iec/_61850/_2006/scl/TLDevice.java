/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TL Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TLDevice#getLN0 <em>LN0</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TLDevice#getLN <em>LN</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TLDevice#getAccessControl <em>Access Control</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TLDevice#getInst <em>Inst</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TLDevice#getLdName <em>Ld Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTLDevice()
 * @model extendedMetaData="name='tLDevice' kind='elementOnly'"
 * @generated
 */
public interface TLDevice extends TUnNaming {
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
	 * @see ch.iec._61850._2006.scl.SclPackage#getTLDevice_LN0()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LN0' namespace='##targetNamespace'"
	 * @generated
	 */
	LN0Type getLN0();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TLDevice#getLN0 <em>LN0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LN0</em>' containment reference.
	 * @see #getLN0()
	 * @generated
	 */
	void setLN0(LN0Type value);

	/**
	 * Returns the value of the '<em><b>LN</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TLN}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LN</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LN</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTLDevice_LN()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LN' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TLN> getLN();

	/**
	 * Returns the value of the '<em><b>Access Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Control</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Control</em>' containment reference.
	 * @see #setAccessControl(TAccessControl)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTLDevice_AccessControl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AccessControl' namespace='##targetNamespace'"
	 * @generated
	 */
	TAccessControl getAccessControl();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TLDevice#getAccessControl <em>Access Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Control</em>' containment reference.
	 * @see #getAccessControl()
	 * @generated
	 */
	void setAccessControl(TAccessControl value);

	/**
	 * Returns the value of the '<em><b>Inst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inst</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inst</em>' attribute.
	 * @see #setInst(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTLDevice_Inst()
	 * @model dataType="ch.iec._61850._2006.scl.TName" required="true"
	 *        extendedMetaData="kind='attribute' name='inst'"
	 * @generated
	 */
	String getInst();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TLDevice#getInst <em>Inst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inst</em>' attribute.
	 * @see #getInst()
	 * @generated
	 */
	void setInst(String value);

	/**
	 * Returns the value of the '<em><b>Ld Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ld Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ld Name</em>' attribute.
	 * @see #setLdName(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTLDevice_LdName()
	 * @model dataType="ch.iec._61850._2006.scl.TRestrLdName"
	 *        extendedMetaData="kind='attribute' name='ldName'"
	 * @generated
	 */
	String getLdName();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TLDevice#getLdName <em>Ld Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ld Name</em>' attribute.
	 * @see #getLdName()
	 * @generated
	 */
	void setLdName(String value);

} // TLDevice
