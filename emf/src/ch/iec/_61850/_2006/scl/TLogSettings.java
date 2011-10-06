/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TLog Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TLogSettings#getIntgPd <em>Intg Pd</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TLogSettings#getLogEna <em>Log Ena</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TLogSettings#getTrgOps <em>Trg Ops</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTLogSettings()
 * @model extendedMetaData="name='tLogSettings' kind='empty'"
 * @generated
 */
public interface TLogSettings extends TServiceSettings {
	/**
	 * Returns the value of the '<em><b>Intg Pd</b></em>' attribute.
	 * The default value is <code>"Fix"</code>.
	 * The literals are from the enumeration {@link ch.iec._61850._2006.scl.TServiceSettingsEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intg Pd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intg Pd</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TServiceSettingsEnum
	 * @see #isSetIntgPd()
	 * @see #unsetIntgPd()
	 * @see #setIntgPd(TServiceSettingsEnum)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTLogSettings_IntgPd()
	 * @model default="Fix" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='intgPd'"
	 * @generated
	 */
	TServiceSettingsEnum getIntgPd();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TLogSettings#getIntgPd <em>Intg Pd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intg Pd</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TServiceSettingsEnum
	 * @see #isSetIntgPd()
	 * @see #unsetIntgPd()
	 * @see #getIntgPd()
	 * @generated
	 */
	void setIntgPd(TServiceSettingsEnum value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TLogSettings#getIntgPd <em>Intg Pd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIntgPd()
	 * @see #getIntgPd()
	 * @see #setIntgPd(TServiceSettingsEnum)
	 * @generated
	 */
	void unsetIntgPd();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TLogSettings#getIntgPd <em>Intg Pd</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Intg Pd</em>' attribute is set.
	 * @see #unsetIntgPd()
	 * @see #getIntgPd()
	 * @see #setIntgPd(TServiceSettingsEnum)
	 * @generated
	 */
	boolean isSetIntgPd();

	/**
	 * Returns the value of the '<em><b>Log Ena</b></em>' attribute.
	 * The default value is <code>"Fix"</code>.
	 * The literals are from the enumeration {@link ch.iec._61850._2006.scl.TServiceSettingsEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Ena</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Ena</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TServiceSettingsEnum
	 * @see #isSetLogEna()
	 * @see #unsetLogEna()
	 * @see #setLogEna(TServiceSettingsEnum)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTLogSettings_LogEna()
	 * @model default="Fix" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='logEna'"
	 * @generated
	 */
	TServiceSettingsEnum getLogEna();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TLogSettings#getLogEna <em>Log Ena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Ena</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TServiceSettingsEnum
	 * @see #isSetLogEna()
	 * @see #unsetLogEna()
	 * @see #getLogEna()
	 * @generated
	 */
	void setLogEna(TServiceSettingsEnum value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TLogSettings#getLogEna <em>Log Ena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLogEna()
	 * @see #getLogEna()
	 * @see #setLogEna(TServiceSettingsEnum)
	 * @generated
	 */
	void unsetLogEna();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TLogSettings#getLogEna <em>Log Ena</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Log Ena</em>' attribute is set.
	 * @see #unsetLogEna()
	 * @see #getLogEna()
	 * @see #setLogEna(TServiceSettingsEnum)
	 * @generated
	 */
	boolean isSetLogEna();

	/**
	 * Returns the value of the '<em><b>Trg Ops</b></em>' attribute.
	 * The default value is <code>"Fix"</code>.
	 * The literals are from the enumeration {@link ch.iec._61850._2006.scl.TServiceSettingsEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trg Ops</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trg Ops</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TServiceSettingsEnum
	 * @see #isSetTrgOps()
	 * @see #unsetTrgOps()
	 * @see #setTrgOps(TServiceSettingsEnum)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTLogSettings_TrgOps()
	 * @model default="Fix" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='trgOps'"
	 * @generated
	 */
	TServiceSettingsEnum getTrgOps();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TLogSettings#getTrgOps <em>Trg Ops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trg Ops</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TServiceSettingsEnum
	 * @see #isSetTrgOps()
	 * @see #unsetTrgOps()
	 * @see #getTrgOps()
	 * @generated
	 */
	void setTrgOps(TServiceSettingsEnum value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TLogSettings#getTrgOps <em>Trg Ops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTrgOps()
	 * @see #getTrgOps()
	 * @see #setTrgOps(TServiceSettingsEnum)
	 * @generated
	 */
	void unsetTrgOps();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TLogSettings#getTrgOps <em>Trg Ops</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Trg Ops</em>' attribute is set.
	 * @see #unsetTrgOps()
	 * @see #getTrgOps()
	 * @see #setTrgOps(TServiceSettingsEnum)
	 * @generated
	 */
	boolean isSetTrgOps();

} // TLogSettings
