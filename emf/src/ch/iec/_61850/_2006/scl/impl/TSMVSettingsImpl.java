/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TSMVSettings;
import ch.iec._61850._2006.scl.TServiceSettingsEnum;

import java.math.BigDecimal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TSMV Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TSMVSettingsImpl#getSmpRate <em>Smp Rate</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TSMVSettingsImpl#getOptFields <em>Opt Fields</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TSMVSettingsImpl#getSmpRate1 <em>Smp Rate1</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TSMVSettingsImpl#getSvID <em>Sv ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TSMVSettingsImpl extends TServiceSettingsImpl implements TSMVSettings {
	/**
	 * The cached value of the '{@link #getSmpRate() <em>Smp Rate</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmpRate()
	 * @generated
	 * @ordered
	 */
	protected EList<BigDecimal> smpRate;

	/**
	 * The default value of the '{@link #getOptFields() <em>Opt Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptFields()
	 * @generated
	 * @ordered
	 */
	protected static final TServiceSettingsEnum OPT_FIELDS_EDEFAULT = TServiceSettingsEnum.FIX;

	/**
	 * The cached value of the '{@link #getOptFields() <em>Opt Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptFields()
	 * @generated
	 * @ordered
	 */
	protected TServiceSettingsEnum optFields = OPT_FIELDS_EDEFAULT;

	/**
	 * This is true if the Opt Fields attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean optFieldsESet;

	/**
	 * The default value of the '{@link #getSmpRate1() <em>Smp Rate1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmpRate1()
	 * @generated
	 * @ordered
	 */
	protected static final TServiceSettingsEnum SMP_RATE1_EDEFAULT = TServiceSettingsEnum.FIX;

	/**
	 * The cached value of the '{@link #getSmpRate1() <em>Smp Rate1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmpRate1()
	 * @generated
	 * @ordered
	 */
	protected TServiceSettingsEnum smpRate1 = SMP_RATE1_EDEFAULT;

	/**
	 * This is true if the Smp Rate1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean smpRate1ESet;

	/**
	 * The default value of the '{@link #getSvID() <em>Sv ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSvID()
	 * @generated
	 * @ordered
	 */
	protected static final TServiceSettingsEnum SV_ID_EDEFAULT = TServiceSettingsEnum.FIX;

	/**
	 * The cached value of the '{@link #getSvID() <em>Sv ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSvID()
	 * @generated
	 * @ordered
	 */
	protected TServiceSettingsEnum svID = SV_ID_EDEFAULT;

	/**
	 * This is true if the Sv ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean svIDESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TSMVSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTSMVSettings();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BigDecimal> getSmpRate() {
		if (smpRate == null) {
			smpRate = new EDataTypeEList<BigDecimal>(BigDecimal.class, this, SclPackage.TSMV_SETTINGS__SMP_RATE);
		}
		return smpRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceSettingsEnum getOptFields() {
		return optFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptFields(TServiceSettingsEnum newOptFields) {
		TServiceSettingsEnum oldOptFields = optFields;
		optFields = newOptFields == null ? OPT_FIELDS_EDEFAULT : newOptFields;
		boolean oldOptFieldsESet = optFieldsESet;
		optFieldsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSMV_SETTINGS__OPT_FIELDS, oldOptFields, optFields, !oldOptFieldsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOptFields() {
		TServiceSettingsEnum oldOptFields = optFields;
		boolean oldOptFieldsESet = optFieldsESet;
		optFields = OPT_FIELDS_EDEFAULT;
		optFieldsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TSMV_SETTINGS__OPT_FIELDS, oldOptFields, OPT_FIELDS_EDEFAULT, oldOptFieldsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOptFields() {
		return optFieldsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceSettingsEnum getSmpRate1() {
		return smpRate1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmpRate1(TServiceSettingsEnum newSmpRate1) {
		TServiceSettingsEnum oldSmpRate1 = smpRate1;
		smpRate1 = newSmpRate1 == null ? SMP_RATE1_EDEFAULT : newSmpRate1;
		boolean oldSmpRate1ESet = smpRate1ESet;
		smpRate1ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSMV_SETTINGS__SMP_RATE1, oldSmpRate1, smpRate1, !oldSmpRate1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSmpRate1() {
		TServiceSettingsEnum oldSmpRate1 = smpRate1;
		boolean oldSmpRate1ESet = smpRate1ESet;
		smpRate1 = SMP_RATE1_EDEFAULT;
		smpRate1ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TSMV_SETTINGS__SMP_RATE1, oldSmpRate1, SMP_RATE1_EDEFAULT, oldSmpRate1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSmpRate1() {
		return smpRate1ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceSettingsEnum getSvID() {
		return svID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSvID(TServiceSettingsEnum newSvID) {
		TServiceSettingsEnum oldSvID = svID;
		svID = newSvID == null ? SV_ID_EDEFAULT : newSvID;
		boolean oldSvIDESet = svIDESet;
		svIDESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSMV_SETTINGS__SV_ID, oldSvID, svID, !oldSvIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSvID() {
		TServiceSettingsEnum oldSvID = svID;
		boolean oldSvIDESet = svIDESet;
		svID = SV_ID_EDEFAULT;
		svIDESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TSMV_SETTINGS__SV_ID, oldSvID, SV_ID_EDEFAULT, oldSvIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSvID() {
		return svIDESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SclPackage.TSMV_SETTINGS__SMP_RATE:
				return getSmpRate();
			case SclPackage.TSMV_SETTINGS__OPT_FIELDS:
				return getOptFields();
			case SclPackage.TSMV_SETTINGS__SMP_RATE1:
				return getSmpRate1();
			case SclPackage.TSMV_SETTINGS__SV_ID:
				return getSvID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SclPackage.TSMV_SETTINGS__SMP_RATE:
				getSmpRate().clear();
				getSmpRate().addAll((Collection<? extends BigDecimal>)newValue);
				return;
			case SclPackage.TSMV_SETTINGS__OPT_FIELDS:
				setOptFields((TServiceSettingsEnum)newValue);
				return;
			case SclPackage.TSMV_SETTINGS__SMP_RATE1:
				setSmpRate1((TServiceSettingsEnum)newValue);
				return;
			case SclPackage.TSMV_SETTINGS__SV_ID:
				setSvID((TServiceSettingsEnum)newValue);
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
			case SclPackage.TSMV_SETTINGS__SMP_RATE:
				getSmpRate().clear();
				return;
			case SclPackage.TSMV_SETTINGS__OPT_FIELDS:
				unsetOptFields();
				return;
			case SclPackage.TSMV_SETTINGS__SMP_RATE1:
				unsetSmpRate1();
				return;
			case SclPackage.TSMV_SETTINGS__SV_ID:
				unsetSvID();
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
			case SclPackage.TSMV_SETTINGS__SMP_RATE:
				return smpRate != null && !smpRate.isEmpty();
			case SclPackage.TSMV_SETTINGS__OPT_FIELDS:
				return isSetOptFields();
			case SclPackage.TSMV_SETTINGS__SMP_RATE1:
				return isSetSmpRate1();
			case SclPackage.TSMV_SETTINGS__SV_ID:
				return isSetSvID();
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
		result.append(" (smpRate: ");
		result.append(smpRate);
		result.append(", optFields: ");
		if (optFieldsESet) result.append(optFields); else result.append("<unset>");
		result.append(", smpRate1: ");
		if (smpRate1ESet) result.append(smpRate1); else result.append("<unset>");
		result.append(", svID: ");
		if (svIDESet) result.append(svID); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TSMVSettingsImpl
