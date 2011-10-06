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
 * A representation of the model object '<em><b>TFCCB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TFCCB#getCbName <em>Cb Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TFCCB#getDaName <em>Da Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TFCCB#getFc <em>Fc</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TFCCB#getLdInst <em>Ld Inst</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TFCCB#getLnClass <em>Ln Class</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TFCCB#getLnInst <em>Ln Inst</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TFCCB#getPrefix <em>Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTFCCB()
 * @model extendedMetaData="name='tFCCB' kind='empty'"
 * @generated
 */
public interface TFCCB extends EObject {
	/**
	 * Returns the value of the '<em><b>Cb Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cb Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cb Name</em>' attribute.
	 * @see #setCbName(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTFCCB_CbName()
	 * @model dataType="ch.iec._61850._2006.scl.TName" required="true"
	 *        extendedMetaData="kind='attribute' name='cbName'"
	 * @generated
	 */
	String getCbName();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TFCCB#getCbName <em>Cb Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cb Name</em>' attribute.
	 * @see #getCbName()
	 * @generated
	 */
	void setCbName(String value);

	/**
	 * Returns the value of the '<em><b>Da Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Da Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Da Name</em>' attribute.
	 * @see #setDaName(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTFCCB_DaName()
	 * @model dataType="ch.iec._61850._2006.scl.TName"
	 *        extendedMetaData="kind='attribute' name='daName'"
	 * @generated
	 */
	String getDaName();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TFCCB#getDaName <em>Da Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Da Name</em>' attribute.
	 * @see #getDaName()
	 * @generated
	 */
	void setDaName(String value);

	/**
	 * Returns the value of the '<em><b>Fc</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.iec._61850._2006.scl.TServiceFCEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fc</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TServiceFCEnum
	 * @see #isSetFc()
	 * @see #unsetFc()
	 * @see #setFc(TServiceFCEnum)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTFCCB_Fc()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='fc'"
	 * @generated
	 */
	TServiceFCEnum getFc();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TFCCB#getFc <em>Fc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fc</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TServiceFCEnum
	 * @see #isSetFc()
	 * @see #unsetFc()
	 * @see #getFc()
	 * @generated
	 */
	void setFc(TServiceFCEnum value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TFCCB#getFc <em>Fc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFc()
	 * @see #getFc()
	 * @see #setFc(TServiceFCEnum)
	 * @generated
	 */
	void unsetFc();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TFCCB#getFc <em>Fc</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fc</em>' attribute is set.
	 * @see #unsetFc()
	 * @see #getFc()
	 * @see #setFc(TServiceFCEnum)
	 * @generated
	 */
	boolean isSetFc();

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
	 * @see ch.iec._61850._2006.scl.SclPackage#getTFCCB_LdInst()
	 * @model dataType="ch.iec._61850._2006.scl.TName" required="true"
	 *        extendedMetaData="kind='attribute' name='ldInst'"
	 * @generated
	 */
	String getLdInst();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TFCCB#getLdInst <em>Ld Inst</em>}' attribute.
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
	 * @see ch.iec._61850._2006.scl.SclPackage#getTFCCB_LnClass()
	 * @model dataType="ch.iec._61850._2006.scl.TLNClassEnum" required="true"
	 *        extendedMetaData="kind='attribute' name='lnClass'"
	 * @generated
	 */
	Object getLnClass();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TFCCB#getLnClass <em>Ln Class</em>}' attribute.
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
	 * @see ch.iec._61850._2006.scl.SclPackage#getTFCCB_LnInst()
	 * @model dataType="ch.iec._61850._2006.scl.TName"
	 *        extendedMetaData="kind='attribute' name='lnInst'"
	 * @generated
	 */
	String getLnInst();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TFCCB#getLnInst <em>Ln Inst</em>}' attribute.
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
	 * @see ch.iec._61850._2006.scl.SclPackage#getTFCCB_Prefix()
	 * @model dataType="ch.iec._61850._2006.scl.TAnyName"
	 *        extendedMetaData="kind='attribute' name='prefix'"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TFCCB#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

} // TFCCB
