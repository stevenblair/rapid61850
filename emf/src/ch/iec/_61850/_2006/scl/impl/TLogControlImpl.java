/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TLogControl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TLog Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TLogControlImpl#isLogEna <em>Log Ena</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TLogControlImpl#getLogName <em>Log Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TLogControlImpl#isReasonCode <em>Reason Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TLogControlImpl extends TControlWithTriggerOptImpl implements TLogControl {
	/**
	 * The default value of the '{@link #isLogEna() <em>Log Ena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLogEna()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOG_ENA_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isLogEna() <em>Log Ena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLogEna()
	 * @generated
	 * @ordered
	 */
	protected boolean logEna = LOG_ENA_EDEFAULT;

	/**
	 * This is true if the Log Ena attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean logEnaESet;

	/**
	 * The default value of the '{@link #getLogName() <em>Log Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogName()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogName() <em>Log Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogName()
	 * @generated
	 * @ordered
	 */
	protected String logName = LOG_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isReasonCode() <em>Reason Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReasonCode()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REASON_CODE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isReasonCode() <em>Reason Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReasonCode()
	 * @generated
	 * @ordered
	 */
	protected boolean reasonCode = REASON_CODE_EDEFAULT;

	/**
	 * This is true if the Reason Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reasonCodeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TLogControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTLogControl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLogEna() {
		return logEna;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogEna(boolean newLogEna) {
		boolean oldLogEna = logEna;
		logEna = newLogEna;
		boolean oldLogEnaESet = logEnaESet;
		logEnaESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TLOG_CONTROL__LOG_ENA, oldLogEna, logEna, !oldLogEnaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLogEna() {
		boolean oldLogEna = logEna;
		boolean oldLogEnaESet = logEnaESet;
		logEna = LOG_ENA_EDEFAULT;
		logEnaESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TLOG_CONTROL__LOG_ENA, oldLogEna, LOG_ENA_EDEFAULT, oldLogEnaESet));
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
	public String getLogName() {
		return logName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogName(String newLogName) {
		String oldLogName = logName;
		logName = newLogName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TLOG_CONTROL__LOG_NAME, oldLogName, logName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReasonCode() {
		return reasonCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReasonCode(boolean newReasonCode) {
		boolean oldReasonCode = reasonCode;
		reasonCode = newReasonCode;
		boolean oldReasonCodeESet = reasonCodeESet;
		reasonCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TLOG_CONTROL__REASON_CODE, oldReasonCode, reasonCode, !oldReasonCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReasonCode() {
		boolean oldReasonCode = reasonCode;
		boolean oldReasonCodeESet = reasonCodeESet;
		reasonCode = REASON_CODE_EDEFAULT;
		reasonCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TLOG_CONTROL__REASON_CODE, oldReasonCode, REASON_CODE_EDEFAULT, oldReasonCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReasonCode() {
		return reasonCodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SclPackage.TLOG_CONTROL__LOG_ENA:
				return isLogEna();
			case SclPackage.TLOG_CONTROL__LOG_NAME:
				return getLogName();
			case SclPackage.TLOG_CONTROL__REASON_CODE:
				return isReasonCode();
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
			case SclPackage.TLOG_CONTROL__LOG_ENA:
				setLogEna((Boolean)newValue);
				return;
			case SclPackage.TLOG_CONTROL__LOG_NAME:
				setLogName((String)newValue);
				return;
			case SclPackage.TLOG_CONTROL__REASON_CODE:
				setReasonCode((Boolean)newValue);
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
			case SclPackage.TLOG_CONTROL__LOG_ENA:
				unsetLogEna();
				return;
			case SclPackage.TLOG_CONTROL__LOG_NAME:
				setLogName(LOG_NAME_EDEFAULT);
				return;
			case SclPackage.TLOG_CONTROL__REASON_CODE:
				unsetReasonCode();
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
			case SclPackage.TLOG_CONTROL__LOG_ENA:
				return isSetLogEna();
			case SclPackage.TLOG_CONTROL__LOG_NAME:
				return LOG_NAME_EDEFAULT == null ? logName != null : !LOG_NAME_EDEFAULT.equals(logName);
			case SclPackage.TLOG_CONTROL__REASON_CODE:
				return isSetReasonCode();
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
		result.append(" (logEna: ");
		if (logEnaESet) result.append(logEna); else result.append("<unset>");
		result.append(", logName: ");
		result.append(logName);
		result.append(", reasonCode: ");
		if (reasonCodeESet) result.append(reasonCode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TLogControlImpl
