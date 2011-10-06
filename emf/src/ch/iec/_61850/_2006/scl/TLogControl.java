/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TLog Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TLogControl#isLogEna <em>Log Ena</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TLogControl#getLogName <em>Log Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TLogControl#isReasonCode <em>Reason Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTLogControl()
 * @model extendedMetaData="name='tLogControl' kind='elementOnly'"
 * @generated
 */
public interface TLogControl extends TControlWithTriggerOpt {
	/**
	 * Returns the value of the '<em><b>Log Ena</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Ena</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Ena</em>' attribute.
	 * @see #isSetLogEna()
	 * @see #unsetLogEna()
	 * @see #setLogEna(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTLogControl_LogEna()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='logEna'"
	 * @generated
	 */
	boolean isLogEna();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TLogControl#isLogEna <em>Log Ena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Ena</em>' attribute.
	 * @see #isSetLogEna()
	 * @see #unsetLogEna()
	 * @see #isLogEna()
	 * @generated
	 */
	void setLogEna(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TLogControl#isLogEna <em>Log Ena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLogEna()
	 * @see #isLogEna()
	 * @see #setLogEna(boolean)
	 * @generated
	 */
	void unsetLogEna();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TLogControl#isLogEna <em>Log Ena</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Log Ena</em>' attribute is set.
	 * @see #unsetLogEna()
	 * @see #isLogEna()
	 * @see #setLogEna(boolean)
	 * @generated
	 */
	boolean isSetLogEna();

	/**
	 * Returns the value of the '<em><b>Log Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Name</em>' attribute.
	 * @see #setLogName(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTLogControl_LogName()
	 * @model dataType="ch.iec._61850._2006.scl.TName" required="true"
	 *        extendedMetaData="kind='attribute' name='logName'"
	 * @generated
	 */
	String getLogName();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TLogControl#getLogName <em>Log Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Name</em>' attribute.
	 * @see #getLogName()
	 * @generated
	 */
	void setLogName(String value);

	/**
	 * Returns the value of the '<em><b>Reason Code</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Code</em>' attribute.
	 * @see #isSetReasonCode()
	 * @see #unsetReasonCode()
	 * @see #setReasonCode(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTLogControl_ReasonCode()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='reasonCode'"
	 * @generated
	 */
	boolean isReasonCode();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TLogControl#isReasonCode <em>Reason Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason Code</em>' attribute.
	 * @see #isSetReasonCode()
	 * @see #unsetReasonCode()
	 * @see #isReasonCode()
	 * @generated
	 */
	void setReasonCode(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TLogControl#isReasonCode <em>Reason Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReasonCode()
	 * @see #isReasonCode()
	 * @see #setReasonCode(boolean)
	 * @generated
	 */
	void unsetReasonCode();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TLogControl#isReasonCode <em>Reason Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reason Code</em>' attribute is set.
	 * @see #unsetReasonCode()
	 * @see #isReasonCode()
	 * @see #setReasonCode(boolean)
	 * @generated
	 */
	boolean isSetReasonCode();

} // TLogControl
