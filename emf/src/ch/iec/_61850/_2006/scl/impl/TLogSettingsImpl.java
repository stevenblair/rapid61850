/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TLogSettings;
import ch.iec._61850._2006.scl.TServiceSettingsEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TLog Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TLogSettingsImpl#getIntgPd <em>Intg Pd</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TLogSettingsImpl#getLogEna <em>Log Ena</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TLogSettingsImpl#getTrgOps <em>Trg Ops</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TLogSettingsImpl extends TServiceSettingsImpl implements TLogSettings {
	/**
	 * The default value of the '{@link #getIntgPd() <em>Intg Pd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntgPd()
	 * @generated
	 * @ordered
	 */
	protected static final TServiceSettingsEnum INTG_PD_EDEFAULT = TServiceSettingsEnum.FIX;

	/**
	 * The cached value of the '{@link #getIntgPd() <em>Intg Pd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntgPd()
	 * @generated
	 * @ordered
	 */
	protected TServiceSettingsEnum intgPd = INTG_PD_EDEFAULT;

	/**
	 * This is true if the Intg Pd attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean intgPdESet;

	/**
	 * The default value of the '{@link #getLogEna() <em>Log Ena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogEna()
	 * @generated
	 * @ordered
	 */
	protected static final TServiceSettingsEnum LOG_ENA_EDEFAULT = TServiceSettingsEnum.FIX;

	/**
	 * The cached value of the '{@link #getLogEna() <em>Log Ena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogEna()
	 * @generated
	 * @ordered
	 */
	protected TServiceSettingsEnum logEna = LOG_ENA_EDEFAULT;

	/**
	 * This is true if the Log Ena attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean logEnaESet;

	/**
	 * The default value of the '{@link #getTrgOps() <em>Trg Ops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrgOps()
	 * @generated
	 * @ordered
	 */
	protected static final TServiceSettingsEnum TRG_OPS_EDEFAULT = TServiceSettingsEnum.FIX;

	/**
	 * The cached value of the '{@link #getTrgOps() <em>Trg Ops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrgOps()
	 * @generated
	 * @ordered
	 */
	protected TServiceSettingsEnum trgOps = TRG_OPS_EDEFAULT;

	/**
	 * This is true if the Trg Ops attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean trgOpsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TLogSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTLogSettings();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceSettingsEnum getIntgPd() {
		return intgPd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntgPd(TServiceSettingsEnum newIntgPd) {
		TServiceSettingsEnum oldIntgPd = intgPd;
		intgPd = newIntgPd == null ? INTG_PD_EDEFAULT : newIntgPd;
		boolean oldIntgPdESet = intgPdESet;
		intgPdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TLOG_SETTINGS__INTG_PD, oldIntgPd, intgPd, !oldIntgPdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIntgPd() {
		TServiceSettingsEnum oldIntgPd = intgPd;
		boolean oldIntgPdESet = intgPdESet;
		intgPd = INTG_PD_EDEFAULT;
		intgPdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TLOG_SETTINGS__INTG_PD, oldIntgPd, INTG_PD_EDEFAULT, oldIntgPdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIntgPd() {
		return intgPdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceSettingsEnum getLogEna() {
		return logEna;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogEna(TServiceSettingsEnum newLogEna) {
		TServiceSettingsEnum oldLogEna = logEna;
		logEna = newLogEna == null ? LOG_ENA_EDEFAULT : newLogEna;
		boolean oldLogEnaESet = logEnaESet;
		logEnaESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TLOG_SETTINGS__LOG_ENA, oldLogEna, logEna, !oldLogEnaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLogEna() {
		TServiceSettingsEnum oldLogEna = logEna;
		boolean oldLogEnaESet = logEnaESet;
		logEna = LOG_ENA_EDEFAULT;
		logEnaESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TLOG_SETTINGS__LOG_ENA, oldLogEna, LOG_ENA_EDEFAULT, oldLogEnaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLogEna() {
		return logEnaESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceSettingsEnum getTrgOps() {
		return trgOps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrgOps(TServiceSettingsEnum newTrgOps) {
		TServiceSettingsEnum oldTrgOps = trgOps;
		trgOps = newTrgOps == null ? TRG_OPS_EDEFAULT : newTrgOps;
		boolean oldTrgOpsESet = trgOpsESet;
		trgOpsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TLOG_SETTINGS__TRG_OPS, oldTrgOps, trgOps, !oldTrgOpsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTrgOps() {
		TServiceSettingsEnum oldTrgOps = trgOps;
		boolean oldTrgOpsESet = trgOpsESet;
		trgOps = TRG_OPS_EDEFAULT;
		trgOpsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TLOG_SETTINGS__TRG_OPS, oldTrgOps, TRG_OPS_EDEFAULT, oldTrgOpsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTrgOps() {
		return trgOpsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SclPackage.TLOG_SETTINGS__INTG_PD:
				return getIntgPd();
			case SclPackage.TLOG_SETTINGS__LOG_ENA:
				return getLogEna();
			case SclPackage.TLOG_SETTINGS__TRG_OPS:
				return getTrgOps();
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
			case SclPackage.TLOG_SETTINGS__INTG_PD:
				setIntgPd((TServiceSettingsEnum)newValue);
				return;
			case SclPackage.TLOG_SETTINGS__LOG_ENA:
				setLogEna((TServiceSettingsEnum)newValue);
				return;
			case SclPackage.TLOG_SETTINGS__TRG_OPS:
				setTrgOps((TServiceSettingsEnum)newValue);
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
			case SclPackage.TLOG_SETTINGS__INTG_PD:
				unsetIntgPd();
				return;
			case SclPackage.TLOG_SETTINGS__LOG_ENA:
				unsetLogEna();
				return;
			case SclPackage.TLOG_SETTINGS__TRG_OPS:
				unsetTrgOps();
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
			case SclPackage.TLOG_SETTINGS__INTG_PD:
				return isSetIntgPd();
			case SclPackage.TLOG_SETTINGS__LOG_ENA:
				return isSetLogEna();
			case SclPackage.TLOG_SETTINGS__TRG_OPS:
				return isSetTrgOps();
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
		result.append(" (intgPd: ");
		if (intgPdESet) result.append(intgPd); else result.append("<unset>");
		result.append(", logEna: ");
		if (logEnaESet) result.append(logEna); else result.append("<unset>");
		result.append(", trgOps: ");
		if (trgOpsESet) result.append(trgOps); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TLogSettingsImpl
