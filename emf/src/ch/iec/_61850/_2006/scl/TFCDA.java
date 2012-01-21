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
 * A representation of the model object '<em><b>TFCDA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TFCDA#getDaName <em>Da Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TFCDA#getDoName <em>Do Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TFCDA#getFc <em>Fc</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TFCDA#getLdInst <em>Ld Inst</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TFCDA#getLnClass <em>Ln Class</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TFCDA#getLnInst <em>Ln Inst</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TFCDA#getPrefix <em>Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTFCDA()
 * @model extendedMetaData="name='tFCDA' kind='empty'"
 * @generated
 */
public interface TFCDA extends EObject {
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
	 * @see ch.iec._61850._2006.scl.SclPackage#getTFCDA_DaName()
	 * @model dataType="ch.iec._61850._2006.scl.TName"
	 *        extendedMetaData="kind='attribute' name='daName'"
	 * @generated
	 */
	String getDaName();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TFCDA#getDaName <em>Da Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Da Name</em>' attribute.
	 * @see #getDaName()
	 * @generated
	 */
	void setDaName(String value);

	/**
	 * Returns the value of the '<em><b>Do Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do Name</em>' attribute.
	 * @see #setDoName(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTFCDA_DoName()
	 * @model dataType="ch.iec._61850._2006.scl.TName"
	 *        extendedMetaData="kind='attribute' name='doName'"
	 * @generated
	 */
	String getDoName();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TFCDA#getDoName <em>Do Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Name</em>' attribute.
	 * @see #getDoName()
	 * @generated
	 */
	void setDoName(String value);

	/**
	 * Returns the value of the '<em><b>Fc</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.iec._61850._2006.scl.TFCEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fc</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TFCEnum
	 * @see #isSetFc()
	 * @see #unsetFc()
	 * @see #setFc(TFCEnum)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTFCDA_Fc()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='fc'"
	 * @generated
	 */
	TFCEnum getFc();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TFCDA#getFc <em>Fc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fc</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TFCEnum
	 * @see #isSetFc()
	 * @see #unsetFc()
	 * @see #getFc()
	 * @generated
	 */
	void setFc(TFCEnum value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TFCDA#getFc <em>Fc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFc()
	 * @see #getFc()
	 * @see #setFc(TFCEnum)
	 * @generated
	 */
	void unsetFc();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TFCDA#getFc <em>Fc</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fc</em>' attribute is set.
	 * @see #unsetFc()
	 * @see #getFc()
	 * @see #setFc(TFCEnum)
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
	 * @see ch.iec._61850._2006.scl.SclPackage#getTFCDA_LdInst()
	 * @model dataType="ch.iec._61850._2006.scl.TName"
	 *        extendedMetaData="kind='attribute' name='ldInst'"
	 * @generated
	 */
	String getLdInst();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TFCDA#getLdInst <em>Ld Inst</em>}' attribute.
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
	 * @see ch.iec._61850._2006.scl.SclPackage#getTFCDA_LnClass()
	 * @model dataType="ch.iec._61850._2006.scl.TLNClassEnum"
	 *        extendedMetaData="kind='attribute' name='lnClass'"
	 * @generated
	 */
	Object getLnClass();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TFCDA#getLnClass <em>Ln Class</em>}' attribute.
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
	 * @see ch.iec._61850._2006.scl.SclPackage#getTFCDA_LnInst()
	 * @model dataType="ch.iec._61850._2006.scl.TName"
	 *        extendedMetaData="kind='attribute' name='lnInst'"
	 * @generated
	 */
	String getLnInst();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TFCDA#getLnInst <em>Ln Inst</em>}' attribute.
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
	 * @see ch.iec._61850._2006.scl.SclPackage#getTFCDA_Prefix()
	 * @model dataType="ch.iec._61850._2006.scl.TAnyName"
	 *        extendedMetaData="kind='attribute' name='prefix'"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TFCDA#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

} // TFCDA
