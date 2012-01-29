/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TLN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TLN#getInst <em>Inst</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TLN#getLnClass <em>Ln Class</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TLN#getPrefix <em>Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTLN()
 * @model extendedMetaData="name='tLN' kind='elementOnly'"
 * @generated
 */
public interface TLN extends TAnyLN {
	/**
	 * Returns the value of the '<em><b>Inst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inst</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inst</em>' attribute.
	 * @see #isSetInst()
	 * @see #unsetInst()
	 * @see #setInst(long)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTLN_Inst()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" required="true"
	 *        extendedMetaData="kind='attribute' name='inst'"
	 * @generated
	 */
	long getInst();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TLN#getInst <em>Inst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inst</em>' attribute.
	 * @see #isSetInst()
	 * @see #unsetInst()
	 * @see #getInst()
	 * @generated
	 */
	void setInst(long value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TLN#getInst <em>Inst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInst()
	 * @see #getInst()
	 * @see #setInst(long)
	 * @generated
	 */
	void unsetInst();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TLN#getInst <em>Inst</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inst</em>' attribute is set.
	 * @see #unsetInst()
	 * @see #getInst()
	 * @see #setInst(long)
	 * @generated
	 */
	boolean isSetInst();

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
	 * @see ch.iec._61850._2006.scl.SclPackage#getTLN_LnClass()
	 * @model dataType="ch.iec._61850._2006.scl.TLNClassEnum" required="true"
	 *        extendedMetaData="kind='attribute' name='lnClass'"
	 * @generated
	 */
	Object getLnClass();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TLN#getLnClass <em>Ln Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ln Class</em>' attribute.
	 * @see #getLnClass()
	 * @generated
	 */
	void setLnClass(Object value);

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
	 * @see ch.iec._61850._2006.scl.SclPackage#getTLN_Prefix()
	 * @model dataType="ch.iec._61850._2006.scl.TAnyName"
	 *        extendedMetaData="kind='attribute' name='prefix'"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TLN#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

} // TLN
