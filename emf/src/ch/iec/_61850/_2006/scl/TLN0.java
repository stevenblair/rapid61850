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
 * A representation of the model object '<em><b>TLN0</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TLN0#getGSEControl <em>GSE Control</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TLN0#getSampledValueControl <em>Sampled Value Control</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TLN0#getSettingControl <em>Setting Control</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TLN0#getSCLControl <em>SCL Control</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TLN0#getLog <em>Log</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TLN0#getInst <em>Inst</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TLN0#getLnClass <em>Ln Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTLN0()
 * @model extendedMetaData="name='tLN0' kind='elementOnly'"
 * @generated
 */
public interface TLN0 extends TAnyLN {
	/**
	 * Returns the value of the '<em><b>GSE Control</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TGSEControl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GSE Control</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GSE Control</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTLN0_GSEControl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GSEControl' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TGSEControl> getGSEControl();

	/**
	 * Returns the value of the '<em><b>Sampled Value Control</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TSampledValueControl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampled Value Control</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sampled Value Control</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTLN0_SampledValueControl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SampledValueControl' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TSampledValueControl> getSampledValueControl();

	/**
	 * Returns the value of the '<em><b>Setting Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setting Control</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setting Control</em>' containment reference.
	 * @see #setSettingControl(TSettingControl)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTLN0_SettingControl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SettingControl' namespace='##targetNamespace'"
	 * @generated
	 */
	TSettingControl getSettingControl();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TLN0#getSettingControl <em>Setting Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setting Control</em>' containment reference.
	 * @see #getSettingControl()
	 * @generated
	 */
	void setSettingControl(TSettingControl value);

	/**
	 * Returns the value of the '<em><b>SCL Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SCL Control</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SCL Control</em>' containment reference.
	 * @see #setSCLControl(TSCLControl)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTLN0_SCLControl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SCLControl' namespace='##targetNamespace'"
	 * @generated
	 */
	TSCLControl getSCLControl();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TLN0#getSCLControl <em>SCL Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SCL Control</em>' containment reference.
	 * @see #getSCLControl()
	 * @generated
	 */
	void setSCLControl(TSCLControl value);

	/**
	 * Returns the value of the '<em><b>Log</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log</em>' containment reference.
	 * @see #setLog(TLog)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTLN0_Log()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Log' namespace='##targetNamespace'"
	 * @generated
	 */
	TLog getLog();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TLN0#getLog <em>Log</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log</em>' containment reference.
	 * @see #getLog()
	 * @generated
	 */
	void setLog(TLog value);

	/**
	 * Returns the value of the '<em><b>Inst</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inst</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inst</em>' attribute.
	 * @see #isSetInst()
	 * @see #unsetInst()
	 * @see #setInst(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTLN0_Inst()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.NormalizedString" required="true"
	 *        extendedMetaData="kind='attribute' name='inst'"
	 * @generated
	 */
	String getInst();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TLN0#getInst <em>Inst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inst</em>' attribute.
	 * @see #isSetInst()
	 * @see #unsetInst()
	 * @see #getInst()
	 * @generated
	 */
	void setInst(String value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TLN0#getInst <em>Inst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInst()
	 * @see #getInst()
	 * @see #setInst(String)
	 * @generated
	 */
	void unsetInst();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TLN0#getInst <em>Inst</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inst</em>' attribute is set.
	 * @see #unsetInst()
	 * @see #getInst()
	 * @see #setInst(String)
	 * @generated
	 */
	boolean isSetInst();

	/**
	 * Returns the value of the '<em><b>Ln Class</b></em>' attribute.
	 * The default value is <code>"LLN0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ln Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ln Class</em>' attribute.
	 * @see #isSetLnClass()
	 * @see #unsetLnClass()
	 * @see #setLnClass(Object)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTLN0_LnClass()
	 * @model default="LLN0" unsettable="true" dataType="ch.iec._61850._2006.scl.TLNClassEnum" required="true"
	 *        extendedMetaData="kind='attribute' name='lnClass'"
	 * @generated
	 */
	Object getLnClass();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TLN0#getLnClass <em>Ln Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ln Class</em>' attribute.
	 * @see #isSetLnClass()
	 * @see #unsetLnClass()
	 * @see #getLnClass()
	 * @generated
	 */
	void setLnClass(Object value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TLN0#getLnClass <em>Ln Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLnClass()
	 * @see #getLnClass()
	 * @see #setLnClass(Object)
	 * @generated
	 */
	void unsetLnClass();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TLN0#getLnClass <em>Ln Class</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ln Class</em>' attribute is set.
	 * @see #unsetLnClass()
	 * @see #getLnClass()
	 * @see #setLnClass(Object)
	 * @generated
	 */
	boolean isSetLnClass();

} // TLN0
