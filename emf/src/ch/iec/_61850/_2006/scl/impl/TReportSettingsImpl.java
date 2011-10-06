/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TReportSettings;
import ch.iec._61850._2006.scl.TServiceSettingsEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TReport Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TReportSettingsImpl#getBufTime <em>Buf Time</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TReportSettingsImpl#getIntgPd <em>Intg Pd</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TReportSettingsImpl#getOptFields <em>Opt Fields</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TReportSettingsImpl#getRptID <em>Rpt ID</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TReportSettingsImpl#getTrgOps <em>Trg Ops</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TReportSettingsImpl extends TServiceSettingsImpl implements TReportSettings {
	/**
	 * The default value of the '{@link #getBufTime() <em>Buf Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufTime()
	 * @generated
	 * @ordered
	 */
	protected static final TServiceSettingsEnum BUF_TIME_EDEFAULT = TServiceSettingsEnum.FIX;

	/**
	 * The cached value of the '{@link #getBufTime() <em>Buf Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufTime()
	 * @generated
	 * @ordered
	 */
	protected TServiceSettingsEnum bufTime = BUF_TIME_EDEFAULT;

	/**
	 * This is true if the Buf Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bufTimeESet;

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
	 * The default value of the '{@link #getRptID() <em>Rpt ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRptID()
	 * @generated
	 * @ordered
	 */
	protected static final TServiceSettingsEnum RPT_ID_EDEFAULT = TServiceSettingsEnum.FIX;

	/**
	 * The cached value of the '{@link #getRptID() <em>Rpt ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRptID()
	 * @generated
	 * @ordered
	 */
	protected TServiceSettingsEnum rptID = RPT_ID_EDEFAULT;

	/**
	 * This is true if the Rpt ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rptIDESet;

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
	protected TReportSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTReportSettings();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceSettingsEnum getBufTime() {
		return bufTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBufTime(TServiceSettingsEnum newBufTime) {
		TServiceSettingsEnum oldBufTime = bufTime;
		bufTime = newBufTime == null ? BUF_TIME_EDEFAULT : newBufTime;
		boolean oldBufTimeESet = bufTimeESet;
		bufTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TREPORT_SETTINGS__BUF_TIME, oldBufTime, bufTime, !oldBufTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBufTime() {
		TServiceSettingsEnum oldBufTime = bufTime;
		boolean oldBufTimeESet = bufTimeESet;
		bufTime = BUF_TIME_EDEFAULT;
		bufTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TREPORT_SETTINGS__BUF_TIME, oldBufTime, BUF_TIME_EDEFAULT, oldBufTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBufTime() {
		return bufTimeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TREPORT_SETTINGS__INTG_PD, oldIntgPd, intgPd, !oldIntgPdESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TREPORT_SETTINGS__INTG_PD, oldIntgPd, INTG_PD_EDEFAULT, oldIntgPdESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TREPORT_SETTINGS__OPT_FIELDS, oldOptFields, optFields, !oldOptFieldsESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TREPORT_SETTINGS__OPT_FIELDS, oldOptFields, OPT_FIELDS_EDEFAULT, oldOptFieldsESet));
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
	public TServiceSettingsEnum getRptID() {
		return rptID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRptID(TServiceSettingsEnum newRptID) {
		TServiceSettingsEnum oldRptID = rptID;
		rptID = newRptID == null ? RPT_ID_EDEFAULT : newRptID;
		boolean oldRptIDESet = rptIDESet;
		rptIDESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TREPORT_SETTINGS__RPT_ID, oldRptID, rptID, !oldRptIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRptID() {
		TServiceSettingsEnum oldRptID = rptID;
		boolean oldRptIDESet = rptIDESet;
		rptID = RPT_ID_EDEFAULT;
		rptIDESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TREPORT_SETTINGS__RPT_ID, oldRptID, RPT_ID_EDEFAULT, oldRptIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRptID() {
		return rptIDESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TREPORT_SETTINGS__TRG_OPS, oldTrgOps, trgOps, !oldTrgOpsESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TREPORT_SETTINGS__TRG_OPS, oldTrgOps, TRG_OPS_EDEFAULT, oldTrgOpsESet));
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
			case SclPackage.TREPORT_SETTINGS__BUF_TIME:
				return getBufTime();
			case SclPackage.TREPORT_SETTINGS__INTG_PD:
				return getIntgPd();
			case SclPackage.TREPORT_SETTINGS__OPT_FIELDS:
				return getOptFields();
			case SclPackage.TREPORT_SETTINGS__RPT_ID:
				return getRptID();
			case SclPackage.TREPORT_SETTINGS__TRG_OPS:
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
			case SclPackage.TREPORT_SETTINGS__BUF_TIME:
				setBufTime((TServiceSettingsEnum)newValue);
				return;
			case SclPackage.TREPORT_SETTINGS__INTG_PD:
				setIntgPd((TServiceSettingsEnum)newValue);
				return;
			case SclPackage.TREPORT_SETTINGS__OPT_FIELDS:
				setOptFields((TServiceSettingsEnum)newValue);
				return;
			case SclPackage.TREPORT_SETTINGS__RPT_ID:
				setRptID((TServiceSettingsEnum)newValue);
				return;
			case SclPackage.TREPORT_SETTINGS__TRG_OPS:
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
			case SclPackage.TREPORT_SETTINGS__BUF_TIME:
				unsetBufTime();
				return;
			case SclPackage.TREPORT_SETTINGS__INTG_PD:
				unsetIntgPd();
				return;
			case SclPackage.TREPORT_SETTINGS__OPT_FIELDS:
				unsetOptFields();
				return;
			case SclPackage.TREPORT_SETTINGS__RPT_ID:
				unsetRptID();
				return;
			case SclPackage.TREPORT_SETTINGS__TRG_OPS:
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
			case SclPackage.TREPORT_SETTINGS__BUF_TIME:
				return isSetBufTime();
			case SclPackage.TREPORT_SETTINGS__INTG_PD:
				return isSetIntgPd();
			case SclPackage.TREPORT_SETTINGS__OPT_FIELDS:
				return isSetOptFields();
			case SclPackage.TREPORT_SETTINGS__RPT_ID:
				return isSetRptID();
			case SclPackage.TREPORT_SETTINGS__TRG_OPS:
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
		result.append(" (bufTime: ");
		if (bufTimeESet) result.append(bufTime); else result.append("<unset>");
		result.append(", intgPd: ");
		if (intgPdESet) result.append(intgPd); else result.append("<unset>");
		result.append(", optFields: ");
		if (optFieldsESet) result.append(optFields); else result.append("<unset>");
		result.append(", rptID: ");
		if (rptIDESet) result.append(rptID); else result.append("<unset>");
		result.append(", trgOps: ");
		if (trgOpsESet) result.append(trgOps); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TReportSettingsImpl
