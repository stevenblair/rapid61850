/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TReport Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TReportSettings#getBufTime <em>Buf Time</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TReportSettings#getIntgPd <em>Intg Pd</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TReportSettings#getOptFields <em>Opt Fields</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TReportSettings#getRptID <em>Rpt ID</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TReportSettings#getTrgOps <em>Trg Ops</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTReportSettings()
 * @model extendedMetaData="name='tReportSettings' kind='empty'"
 * @generated
 */
public interface TReportSettings extends TServiceSettings {
	/**
	 * Returns the value of the '<em><b>Buf Time</b></em>' attribute.
	 * The default value is <code>"Fix"</code>.
	 * The literals are from the enumeration {@link ch.iec._61850._2006.scl.TServiceSettingsEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buf Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buf Time</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TServiceSettingsEnum
	 * @see #isSetBufTime()
	 * @see #unsetBufTime()
	 * @see #setBufTime(TServiceSettingsEnum)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTReportSettings_BufTime()
	 * @model default="Fix" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='bufTime'"
	 * @generated
	 */
	TServiceSettingsEnum getBufTime();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TReportSettings#getBufTime <em>Buf Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buf Time</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TServiceSettingsEnum
	 * @see #isSetBufTime()
	 * @see #unsetBufTime()
	 * @see #getBufTime()
	 * @generated
	 */
	void setBufTime(TServiceSettingsEnum value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TReportSettings#getBufTime <em>Buf Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBufTime()
	 * @see #getBufTime()
	 * @see #setBufTime(TServiceSettingsEnum)
	 * @generated
	 */
	void unsetBufTime();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TReportSettings#getBufTime <em>Buf Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Buf Time</em>' attribute is set.
	 * @see #unsetBufTime()
	 * @see #getBufTime()
	 * @see #setBufTime(TServiceSettingsEnum)
	 * @generated
	 */
	boolean isSetBufTime();

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
	 * @see ch.iec._61850._2006.scl.SclPackage#getTReportSettings_IntgPd()
	 * @model default="Fix" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='intgPd'"
	 * @generated
	 */
	TServiceSettingsEnum getIntgPd();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TReportSettings#getIntgPd <em>Intg Pd</em>}' attribute.
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
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TReportSettings#getIntgPd <em>Intg Pd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIntgPd()
	 * @see #getIntgPd()
	 * @see #setIntgPd(TServiceSettingsEnum)
	 * @generated
	 */
	void unsetIntgPd();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TReportSettings#getIntgPd <em>Intg Pd</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Opt Fields</b></em>' attribute.
	 * The default value is <code>"Fix"</code>.
	 * The literals are from the enumeration {@link ch.iec._61850._2006.scl.TServiceSettingsEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opt Fields</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opt Fields</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TServiceSettingsEnum
	 * @see #isSetOptFields()
	 * @see #unsetOptFields()
	 * @see #setOptFields(TServiceSettingsEnum)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTReportSettings_OptFields()
	 * @model default="Fix" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='optFields'"
	 * @generated
	 */
	TServiceSettingsEnum getOptFields();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TReportSettings#getOptFields <em>Opt Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opt Fields</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TServiceSettingsEnum
	 * @see #isSetOptFields()
	 * @see #unsetOptFields()
	 * @see #getOptFields()
	 * @generated
	 */
	void setOptFields(TServiceSettingsEnum value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TReportSettings#getOptFields <em>Opt Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOptFields()
	 * @see #getOptFields()
	 * @see #setOptFields(TServiceSettingsEnum)
	 * @generated
	 */
	void unsetOptFields();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TReportSettings#getOptFields <em>Opt Fields</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Opt Fields</em>' attribute is set.
	 * @see #unsetOptFields()
	 * @see #getOptFields()
	 * @see #setOptFields(TServiceSettingsEnum)
	 * @generated
	 */
	boolean isSetOptFields();

	/**
	 * Returns the value of the '<em><b>Rpt ID</b></em>' attribute.
	 * The default value is <code>"Fix"</code>.
	 * The literals are from the enumeration {@link ch.iec._61850._2006.scl.TServiceSettingsEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rpt ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rpt ID</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TServiceSettingsEnum
	 * @see #isSetRptID()
	 * @see #unsetRptID()
	 * @see #setRptID(TServiceSettingsEnum)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTReportSettings_RptID()
	 * @model default="Fix" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='rptID'"
	 * @generated
	 */
	TServiceSettingsEnum getRptID();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TReportSettings#getRptID <em>Rpt ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rpt ID</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TServiceSettingsEnum
	 * @see #isSetRptID()
	 * @see #unsetRptID()
	 * @see #getRptID()
	 * @generated
	 */
	void setRptID(TServiceSettingsEnum value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TReportSettings#getRptID <em>Rpt ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRptID()
	 * @see #getRptID()
	 * @see #setRptID(TServiceSettingsEnum)
	 * @generated
	 */
	void unsetRptID();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TReportSettings#getRptID <em>Rpt ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rpt ID</em>' attribute is set.
	 * @see #unsetRptID()
	 * @see #getRptID()
	 * @see #setRptID(TServiceSettingsEnum)
	 * @generated
	 */
	boolean isSetRptID();

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
	 * @see ch.iec._61850._2006.scl.SclPackage#getTReportSettings_TrgOps()
	 * @model default="Fix" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='trgOps'"
	 * @generated
	 */
	TServiceSettingsEnum getTrgOps();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TReportSettings#getTrgOps <em>Trg Ops</em>}' attribute.
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
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TReportSettings#getTrgOps <em>Trg Ops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTrgOps()
	 * @see #getTrgOps()
	 * @see #setTrgOps(TServiceSettingsEnum)
	 * @generated
	 */
	void unsetTrgOps();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TReportSettings#getTrgOps <em>Trg Ops</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Trg Ops</em>' attribute is set.
	 * @see #unsetTrgOps()
	 * @see #getTrgOps()
	 * @see #setTrgOps(TServiceSettingsEnum)
	 * @generated
	 */
	boolean isSetTrgOps();

} // TReportSettings
