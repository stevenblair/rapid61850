/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TServiceSettings;
import ch.iec._61850._2006.scl.TServiceSettingsEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TService Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TServiceSettingsImpl#getCbName <em>Cb Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TServiceSettingsImpl#getDatSet <em>Dat Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TServiceSettingsImpl extends EObjectImpl implements TServiceSettings {
	/**
	 * The default value of the '{@link #getCbName() <em>Cb Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCbName()
	 * @generated
	 * @ordered
	 */
	protected static final TServiceSettingsEnum CB_NAME_EDEFAULT = TServiceSettingsEnum.FIX;

	/**
	 * The cached value of the '{@link #getCbName() <em>Cb Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCbName()
	 * @generated
	 * @ordered
	 */
	protected TServiceSettingsEnum cbName = CB_NAME_EDEFAULT;

	/**
	 * This is true if the Cb Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cbNameESet;

	/**
	 * The default value of the '{@link #getDatSet() <em>Dat Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatSet()
	 * @generated
	 * @ordered
	 */
	protected static final TServiceSettingsEnum DAT_SET_EDEFAULT = TServiceSettingsEnum.FIX;

	/**
	 * The cached value of the '{@link #getDatSet() <em>Dat Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatSet()
	 * @generated
	 * @ordered
	 */
	protected TServiceSettingsEnum datSet = DAT_SET_EDEFAULT;

	/**
	 * This is true if the Dat Set attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean datSetESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TServiceSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTServiceSettings();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceSettingsEnum getCbName() {
		return cbName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCbName(TServiceSettingsEnum newCbName) {
		TServiceSettingsEnum oldCbName = cbName;
		cbName = newCbName == null ? CB_NAME_EDEFAULT : newCbName;
		boolean oldCbNameESet = cbNameESet;
		cbNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICE_SETTINGS__CB_NAME, oldCbName, cbName, !oldCbNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCbName() {
		TServiceSettingsEnum oldCbName = cbName;
		boolean oldCbNameESet = cbNameESet;
		cbName = CB_NAME_EDEFAULT;
		cbNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TSERVICE_SETTINGS__CB_NAME, oldCbName, CB_NAME_EDEFAULT, oldCbNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCbName() {
		return cbNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceSettingsEnum getDatSet() {
		return datSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatSet(TServiceSettingsEnum newDatSet) {
		TServiceSettingsEnum oldDatSet = datSet;
		datSet = newDatSet == null ? DAT_SET_EDEFAULT : newDatSet;
		boolean oldDatSetESet = datSetESet;
		datSetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICE_SETTINGS__DAT_SET, oldDatSet, datSet, !oldDatSetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDatSet() {
		TServiceSettingsEnum oldDatSet = datSet;
		boolean oldDatSetESet = datSetESet;
		datSet = DAT_SET_EDEFAULT;
		datSetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TSERVICE_SETTINGS__DAT_SET, oldDatSet, DAT_SET_EDEFAULT, oldDatSetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDatSet() {
		return datSetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SclPackage.TSERVICE_SETTINGS__CB_NAME:
				return getCbName();
			case SclPackage.TSERVICE_SETTINGS__DAT_SET:
				return getDatSet();
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
			case SclPackage.TSERVICE_SETTINGS__CB_NAME:
				setCbName((TServiceSettingsEnum)newValue);
				return;
			case SclPackage.TSERVICE_SETTINGS__DAT_SET:
				setDatSet((TServiceSettingsEnum)newValue);
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
			case SclPackage.TSERVICE_SETTINGS__CB_NAME:
				unsetCbName();
				return;
			case SclPackage.TSERVICE_SETTINGS__DAT_SET:
				unsetDatSet();
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
			case SclPackage.TSERVICE_SETTINGS__CB_NAME:
				return isSetCbName();
			case SclPackage.TSERVICE_SETTINGS__DAT_SET:
				return isSetDatSet();
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
		result.append(" (cbName: ");
		if (cbNameESet) result.append(cbName); else result.append("<unset>");
		result.append(", datSet: ");
		if (datSetESet) result.append(datSet); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TServiceSettingsImpl
