/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.SmvOptsType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Smv Opts Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.SmvOptsTypeImpl#isDataSet <em>Data Set</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.SmvOptsTypeImpl#isRefreshTime <em>Refresh Time</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.SmvOptsTypeImpl#isSampleRate <em>Sample Rate</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.SmvOptsTypeImpl#isSampleSynchronized <em>Sample Synchronized</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.SmvOptsTypeImpl#isSecurity <em>Security</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SmvOptsTypeImpl extends EObjectImpl implements SmvOptsType {
	/**
	 * The default value of the '{@link #isDataSet() <em>Data Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDataSet()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DATA_SET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDataSet() <em>Data Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDataSet()
	 * @generated
	 * @ordered
	 */
	protected boolean dataSet = DATA_SET_EDEFAULT;

	/**
	 * This is true if the Data Set attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataSetESet;

	/**
	 * The default value of the '{@link #isRefreshTime() <em>Refresh Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRefreshTime()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REFRESH_TIME_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRefreshTime() <em>Refresh Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRefreshTime()
	 * @generated
	 * @ordered
	 */
	protected boolean refreshTime = REFRESH_TIME_EDEFAULT;

	/**
	 * This is true if the Refresh Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean refreshTimeESet;

	/**
	 * The default value of the '{@link #isSampleRate() <em>Sample Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSampleRate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SAMPLE_RATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSampleRate() <em>Sample Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSampleRate()
	 * @generated
	 * @ordered
	 */
	protected boolean sampleRate = SAMPLE_RATE_EDEFAULT;

	/**
	 * This is true if the Sample Rate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sampleRateESet;

	/**
	 * The default value of the '{@link #isSampleSynchronized() <em>Sample Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSampleSynchronized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SAMPLE_SYNCHRONIZED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSampleSynchronized() <em>Sample Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSampleSynchronized()
	 * @generated
	 * @ordered
	 */
	protected boolean sampleSynchronized = SAMPLE_SYNCHRONIZED_EDEFAULT;

	/**
	 * This is true if the Sample Synchronized attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sampleSynchronizedESet;

	/**
	 * The default value of the '{@link #isSecurity() <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSecurity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SECURITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSecurity() <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSecurity()
	 * @generated
	 * @ordered
	 */
	protected boolean security = SECURITY_EDEFAULT;

	/**
	 * This is true if the Security attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean securityESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmvOptsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getSmvOptsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDataSet() {
		return dataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSet(boolean newDataSet) {
		boolean oldDataSet = dataSet;
		dataSet = newDataSet;
		boolean oldDataSetESet = dataSetESet;
		dataSetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SMV_OPTS_TYPE__DATA_SET, oldDataSet, dataSet, !oldDataSetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataSet() {
		boolean oldDataSet = dataSet;
		boolean oldDataSetESet = dataSetESet;
		dataSet = DATA_SET_EDEFAULT;
		dataSetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SMV_OPTS_TYPE__DATA_SET, oldDataSet, DATA_SET_EDEFAULT, oldDataSetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataSet() {
		return dataSetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRefreshTime() {
		return refreshTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefreshTime(boolean newRefreshTime) {
		boolean oldRefreshTime = refreshTime;
		refreshTime = newRefreshTime;
		boolean oldRefreshTimeESet = refreshTimeESet;
		refreshTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SMV_OPTS_TYPE__REFRESH_TIME, oldRefreshTime, refreshTime, !oldRefreshTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRefreshTime() {
		boolean oldRefreshTime = refreshTime;
		boolean oldRefreshTimeESet = refreshTimeESet;
		refreshTime = REFRESH_TIME_EDEFAULT;
		refreshTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SMV_OPTS_TYPE__REFRESH_TIME, oldRefreshTime, REFRESH_TIME_EDEFAULT, oldRefreshTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRefreshTime() {
		return refreshTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSampleRate() {
		return sampleRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSampleRate(boolean newSampleRate) {
		boolean oldSampleRate = sampleRate;
		sampleRate = newSampleRate;
		boolean oldSampleRateESet = sampleRateESet;
		sampleRateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SMV_OPTS_TYPE__SAMPLE_RATE, oldSampleRate, sampleRate, !oldSampleRateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSampleRate() {
		boolean oldSampleRate = sampleRate;
		boolean oldSampleRateESet = sampleRateESet;
		sampleRate = SAMPLE_RATE_EDEFAULT;
		sampleRateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SMV_OPTS_TYPE__SAMPLE_RATE, oldSampleRate, SAMPLE_RATE_EDEFAULT, oldSampleRateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSampleRate() {
		return sampleRateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSampleSynchronized() {
		return sampleSynchronized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSampleSynchronized(boolean newSampleSynchronized) {
		boolean oldSampleSynchronized = sampleSynchronized;
		sampleSynchronized = newSampleSynchronized;
		boolean oldSampleSynchronizedESet = sampleSynchronizedESet;
		sampleSynchronizedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SMV_OPTS_TYPE__SAMPLE_SYNCHRONIZED, oldSampleSynchronized, sampleSynchronized, !oldSampleSynchronizedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSampleSynchronized() {
		boolean oldSampleSynchronized = sampleSynchronized;
		boolean oldSampleSynchronizedESet = sampleSynchronizedESet;
		sampleSynchronized = SAMPLE_SYNCHRONIZED_EDEFAULT;
		sampleSynchronizedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SMV_OPTS_TYPE__SAMPLE_SYNCHRONIZED, oldSampleSynchronized, SAMPLE_SYNCHRONIZED_EDEFAULT, oldSampleSynchronizedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSampleSynchronized() {
		return sampleSynchronizedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSecurity() {
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurity(boolean newSecurity) {
		boolean oldSecurity = security;
		security = newSecurity;
		boolean oldSecurityESet = securityESet;
		securityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SMV_OPTS_TYPE__SECURITY, oldSecurity, security, !oldSecurityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSecurity() {
		boolean oldSecurity = security;
		boolean oldSecurityESet = securityESet;
		security = SECURITY_EDEFAULT;
		securityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SMV_OPTS_TYPE__SECURITY, oldSecurity, SECURITY_EDEFAULT, oldSecurityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSecurity() {
		return securityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SclPackage.SMV_OPTS_TYPE__DATA_SET:
				return isDataSet();
			case SclPackage.SMV_OPTS_TYPE__REFRESH_TIME:
				return isRefreshTime();
			case SclPackage.SMV_OPTS_TYPE__SAMPLE_RATE:
				return isSampleRate();
			case SclPackage.SMV_OPTS_TYPE__SAMPLE_SYNCHRONIZED:
				return isSampleSynchronized();
			case SclPackage.SMV_OPTS_TYPE__SECURITY:
				return isSecurity();
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
			case SclPackage.SMV_OPTS_TYPE__DATA_SET:
				setDataSet((Boolean)newValue);
				return;
			case SclPackage.SMV_OPTS_TYPE__REFRESH_TIME:
				setRefreshTime((Boolean)newValue);
				return;
			case SclPackage.SMV_OPTS_TYPE__SAMPLE_RATE:
				setSampleRate((Boolean)newValue);
				return;
			case SclPackage.SMV_OPTS_TYPE__SAMPLE_SYNCHRONIZED:
				setSampleSynchronized((Boolean)newValue);
				return;
			case SclPackage.SMV_OPTS_TYPE__SECURITY:
				setSecurity((Boolean)newValue);
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
			case SclPackage.SMV_OPTS_TYPE__DATA_SET:
				unsetDataSet();
				return;
			case SclPackage.SMV_OPTS_TYPE__REFRESH_TIME:
				unsetRefreshTime();
				return;
			case SclPackage.SMV_OPTS_TYPE__SAMPLE_RATE:
				unsetSampleRate();
				return;
			case SclPackage.SMV_OPTS_TYPE__SAMPLE_SYNCHRONIZED:
				unsetSampleSynchronized();
				return;
			case SclPackage.SMV_OPTS_TYPE__SECURITY:
				unsetSecurity();
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
			case SclPackage.SMV_OPTS_TYPE__DATA_SET:
				return isSetDataSet();
			case SclPackage.SMV_OPTS_TYPE__REFRESH_TIME:
				return isSetRefreshTime();
			case SclPackage.SMV_OPTS_TYPE__SAMPLE_RATE:
				return isSetSampleRate();
			case SclPackage.SMV_OPTS_TYPE__SAMPLE_SYNCHRONIZED:
				return isSetSampleSynchronized();
			case SclPackage.SMV_OPTS_TYPE__SECURITY:
				return isSetSecurity();
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
		result.append(" (dataSet: ");
		if (dataSetESet) result.append(dataSet); else result.append("<unset>");
		result.append(", refreshTime: ");
		if (refreshTimeESet) result.append(refreshTime); else result.append("<unset>");
		result.append(", sampleRate: ");
		if (sampleRateESet) result.append(sampleRate); else result.append("<unset>");
		result.append(", sampleSynchronized: ");
		if (sampleSynchronizedESet) result.append(sampleSynchronized); else result.append("<unset>");
		result.append(", security: ");
		if (securityESet) result.append(security); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SmvOptsTypeImpl
