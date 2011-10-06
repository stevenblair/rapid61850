/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TGSESettings;
import ch.iec._61850._2006.scl.TServiceSettingsEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TGSE Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TGSESettingsImpl#getAppID <em>App ID</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TGSESettingsImpl#getDataLabel <em>Data Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TGSESettingsImpl extends TServiceSettingsImpl implements TGSESettings {
	/**
	 * The default value of the '{@link #getAppID() <em>App ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppID()
	 * @generated
	 * @ordered
	 */
	protected static final TServiceSettingsEnum APP_ID_EDEFAULT = TServiceSettingsEnum.FIX;

	/**
	 * The cached value of the '{@link #getAppID() <em>App ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppID()
	 * @generated
	 * @ordered
	 */
	protected TServiceSettingsEnum appID = APP_ID_EDEFAULT;

	/**
	 * This is true if the App ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean appIDESet;

	/**
	 * The default value of the '{@link #getDataLabel() <em>Data Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataLabel()
	 * @generated
	 * @ordered
	 */
	protected static final TServiceSettingsEnum DATA_LABEL_EDEFAULT = TServiceSettingsEnum.FIX;

	/**
	 * The cached value of the '{@link #getDataLabel() <em>Data Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataLabel()
	 * @generated
	 * @ordered
	 */
	protected TServiceSettingsEnum dataLabel = DATA_LABEL_EDEFAULT;

	/**
	 * This is true if the Data Label attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataLabelESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TGSESettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTGSESettings();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceSettingsEnum getAppID() {
		return appID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppID(TServiceSettingsEnum newAppID) {
		TServiceSettingsEnum oldAppID = appID;
		appID = newAppID == null ? APP_ID_EDEFAULT : newAppID;
		boolean oldAppIDESet = appIDESet;
		appIDESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TGSE_SETTINGS__APP_ID, oldAppID, appID, !oldAppIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAppID() {
		TServiceSettingsEnum oldAppID = appID;
		boolean oldAppIDESet = appIDESet;
		appID = APP_ID_EDEFAULT;
		appIDESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TGSE_SETTINGS__APP_ID, oldAppID, APP_ID_EDEFAULT, oldAppIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAppID() {
		return appIDESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceSettingsEnum getDataLabel() {
		return dataLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataLabel(TServiceSettingsEnum newDataLabel) {
		TServiceSettingsEnum oldDataLabel = dataLabel;
		dataLabel = newDataLabel == null ? DATA_LABEL_EDEFAULT : newDataLabel;
		boolean oldDataLabelESet = dataLabelESet;
		dataLabelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TGSE_SETTINGS__DATA_LABEL, oldDataLabel, dataLabel, !oldDataLabelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataLabel() {
		TServiceSettingsEnum oldDataLabel = dataLabel;
		boolean oldDataLabelESet = dataLabelESet;
		dataLabel = DATA_LABEL_EDEFAULT;
		dataLabelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TGSE_SETTINGS__DATA_LABEL, oldDataLabel, DATA_LABEL_EDEFAULT, oldDataLabelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataLabel() {
		return dataLabelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SclPackage.TGSE_SETTINGS__APP_ID:
				return getAppID();
			case SclPackage.TGSE_SETTINGS__DATA_LABEL:
				return getDataLabel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SclPackage.TGSE_SETTINGS__APP_ID:
				setAppID((TServiceSettingsEnum)newValue);
				return;
			case SclPackage.TGSE_SETTINGS__DATA_LABEL:
				setDataLabel((TServiceSettingsEnum)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SclPackage.TGSE_SETTINGS__APP_ID:
				unsetAppID();
				return;
			case SclPackage.TGSE_SETTINGS__DATA_LABEL:
				unsetDataLabel();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SclPackage.TGSE_SETTINGS__APP_ID:
				return isSetAppID();
			case SclPackage.TGSE_SETTINGS__DATA_LABEL:
				return isSetDataLabel();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (appID: ");
		if (appIDESet) result.append(appID); else result.append("<unset>");
		result.append(", dataLabel: ");
		if (dataLabelESet) result.append(dataLabel); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TGSESettingsImpl
