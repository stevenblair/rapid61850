/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TGSE Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TGSESettings#getAppID <em>App ID</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TGSESettings#getDataLabel <em>Data Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTGSESettings()
 * @model extendedMetaData="name='tGSESettings' kind='empty'"
 * @generated
 */
public interface TGSESettings extends TServiceSettings {
	/**
	 * Returns the value of the '<em><b>App ID</b></em>' attribute.
	 * The default value is <code>"Fix"</code>.
	 * The literals are from the enumeration {@link ch.iec._61850._2006.scl.TServiceSettingsEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App ID</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TServiceSettingsEnum
	 * @see #isSetAppID()
	 * @see #unsetAppID()
	 * @see #setAppID(TServiceSettingsEnum)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTGSESettings_AppID()
	 * @model default="Fix" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='appID'"
	 * @generated
	 */
	TServiceSettingsEnum getAppID();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TGSESettings#getAppID <em>App ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App ID</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TServiceSettingsEnum
	 * @see #isSetAppID()
	 * @see #unsetAppID()
	 * @see #getAppID()
	 * @generated
	 */
	void setAppID(TServiceSettingsEnum value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TGSESettings#getAppID <em>App ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAppID()
	 * @see #getAppID()
	 * @see #setAppID(TServiceSettingsEnum)
	 * @generated
	 */
	void unsetAppID();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TGSESettings#getAppID <em>App ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>App ID</em>' attribute is set.
	 * @see #unsetAppID()
	 * @see #getAppID()
	 * @see #setAppID(TServiceSettingsEnum)
	 * @generated
	 */
	boolean isSetAppID();

	/**
	 * Returns the value of the '<em><b>Data Label</b></em>' attribute.
	 * The default value is <code>"Fix"</code>.
	 * The literals are from the enumeration {@link ch.iec._61850._2006.scl.TServiceSettingsEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Label</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TServiceSettingsEnum
	 * @see #isSetDataLabel()
	 * @see #unsetDataLabel()
	 * @see #setDataLabel(TServiceSettingsEnum)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTGSESettings_DataLabel()
	 * @model default="Fix" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='dataLabel'"
	 * @generated
	 */
	TServiceSettingsEnum getDataLabel();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TGSESettings#getDataLabel <em>Data Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Label</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TServiceSettingsEnum
	 * @see #isSetDataLabel()
	 * @see #unsetDataLabel()
	 * @see #getDataLabel()
	 * @generated
	 */
	void setDataLabel(TServiceSettingsEnum value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TGSESettings#getDataLabel <em>Data Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataLabel()
	 * @see #getDataLabel()
	 * @see #setDataLabel(TServiceSettingsEnum)
	 * @generated
	 */
	void unsetDataLabel();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TGSESettings#getDataLabel <em>Data Label</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Label</em>' attribute is set.
	 * @see #unsetDataLabel()
	 * @see #getDataLabel()
	 * @see #setDataLabel(TServiceSettingsEnum)
	 * @generated
	 */
	boolean isSetDataLabel();

} // TGSESettings
