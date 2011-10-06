/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TL Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TLNode#getIedName <em>Ied Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TLNode#getLdInst <em>Ld Inst</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TLNode#getLnClass <em>Ln Class</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TLNode#getLnInst <em>Ln Inst</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TLNode#getLnType <em>Ln Type</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TLNode#getPrefix <em>Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTLNode()
 * @model extendedMetaData="name='tLNode' kind='elementOnly'"
 * @generated
 */
public interface TLNode extends TUnNaming {
	/**
	 * Returns the value of the '<em><b>Ied Name</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ied Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ied Name</em>' attribute.
	 * @see #isSetIedName()
	 * @see #unsetIedName()
	 * @see #setIedName(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTLNode_IedName()
	 * @model default="None" unsettable="true" dataType="ch.iec._61850._2006.scl.TName"
	 *        extendedMetaData="kind='attribute' name='iedName'"
	 * @generated
	 */
	String getIedName();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TLNode#getIedName <em>Ied Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ied Name</em>' attribute.
	 * @see #isSetIedName()
	 * @see #unsetIedName()
	 * @see #getIedName()
	 * @generated
	 */
	void setIedName(String value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TLNode#getIedName <em>Ied Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIedName()
	 * @see #getIedName()
	 * @see #setIedName(String)
	 * @generated
	 */
	void unsetIedName();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TLNode#getIedName <em>Ied Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ied Name</em>' attribute is set.
	 * @see #unsetIedName()
	 * @see #getIedName()
	 * @see #setIedName(String)
	 * @generated
	 */
	boolean isSetIedName();

	/**
	 * Returns the value of the '<em><b>Ld Inst</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ld Inst</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ld Inst</em>' attribute.
	 * @see #isSetLdInst()
	 * @see #unsetLdInst()
	 * @see #setLdInst(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTLNode_LdInst()
	 * @model default="" unsettable="true" dataType="ch.iec._61850._2006.scl.TAnyName"
	 *        extendedMetaData="kind='attribute' name='ldInst'"
	 * @generated
	 */
	String getLdInst();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TLNode#getLdInst <em>Ld Inst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ld Inst</em>' attribute.
	 * @see #isSetLdInst()
	 * @see #unsetLdInst()
	 * @see #getLdInst()
	 * @generated
	 */
	void setLdInst(String value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TLNode#getLdInst <em>Ld Inst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLdInst()
	 * @see #getLdInst()
	 * @see #setLdInst(String)
	 * @generated
	 */
	void unsetLdInst();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TLNode#getLdInst <em>Ld Inst</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ld Inst</em>' attribute is set.
	 * @see #unsetLdInst()
	 * @see #getLdInst()
	 * @see #setLdInst(String)
	 * @generated
	 */
	boolean isSetLdInst();

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
	 * @see ch.iec._61850._2006.scl.SclPackage#getTLNode_LnClass()
	 * @model dataType="ch.iec._61850._2006.scl.TLNClassEnum" required="true"
	 *        extendedMetaData="kind='attribute' name='lnClass'"
	 * @generated
	 */
	Object getLnClass();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TLNode#getLnClass <em>Ln Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ln Class</em>' attribute.
	 * @see #getLnClass()
	 * @generated
	 */
	void setLnClass(Object value);

	/**
	 * Returns the value of the '<em><b>Ln Inst</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ln Inst</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ln Inst</em>' attribute.
	 * @see #isSetLnInst()
	 * @see #unsetLnInst()
	 * @see #setLnInst(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTLNode_LnInst()
	 * @model default="" unsettable="true" dataType="ch.iec._61850._2006.scl.TAnyName"
	 *        extendedMetaData="kind='attribute' name='lnInst'"
	 * @generated
	 */
	String getLnInst();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TLNode#getLnInst <em>Ln Inst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ln Inst</em>' attribute.
	 * @see #isSetLnInst()
	 * @see #unsetLnInst()
	 * @see #getLnInst()
	 * @generated
	 */
	void setLnInst(String value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TLNode#getLnInst <em>Ln Inst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLnInst()
	 * @see #getLnInst()
	 * @see #setLnInst(String)
	 * @generated
	 */
	void unsetLnInst();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TLNode#getLnInst <em>Ln Inst</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ln Inst</em>' attribute is set.
	 * @see #unsetLnInst()
	 * @see #getLnInst()
	 * @see #setLnInst(String)
	 * @generated
	 */
	boolean isSetLnInst();

	/**
	 * Returns the value of the '<em><b>Ln Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ln Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ln Type</em>' attribute.
	 * @see #setLnType(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTLNode_LnType()
	 * @model dataType="ch.iec._61850._2006.scl.TName"
	 *        extendedMetaData="kind='attribute' name='lnType'"
	 * @generated
	 */
	String getLnType();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TLNode#getLnType <em>Ln Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ln Type</em>' attribute.
	 * @see #getLnType()
	 * @generated
	 */
	void setLnType(String value);

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #isSetPrefix()
	 * @see #unsetPrefix()
	 * @see #setPrefix(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTLNode_Prefix()
	 * @model default="" unsettable="true" dataType="ch.iec._61850._2006.scl.TAnyName"
	 *        extendedMetaData="kind='attribute' name='prefix'"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TLNode#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #isSetPrefix()
	 * @see #unsetPrefix()
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TLNode#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrefix()
	 * @see #getPrefix()
	 * @see #setPrefix(String)
	 * @generated
	 */
	void unsetPrefix();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TLNode#getPrefix <em>Prefix</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Prefix</em>' attribute is set.
	 * @see #unsetPrefix()
	 * @see #getPrefix()
	 * @see #setPrefix(String)
	 * @generated
	 */
	boolean isSetPrefix();

} // TLNode
