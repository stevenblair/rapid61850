/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.SmvOptsType;
import ch.iec._61850._2006.scl.TSampledValueControl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TSampled Value Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TSampledValueControlImpl#getSmvOpts <em>Smv Opts</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TSampledValueControlImpl#isMulticast <em>Multicast</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TSampledValueControlImpl#getNofASDU <em>Nof ASDU</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TSampledValueControlImpl#getSmpRate <em>Smp Rate</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TSampledValueControlImpl#getSmvID <em>Smv ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TSampledValueControlImpl extends TControlWithIEDNameImpl implements TSampledValueControl {
	/**
	 * The cached value of the '{@link #getSmvOpts() <em>Smv Opts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmvOpts()
	 * @generated
	 * @ordered
	 */
	protected SmvOptsType smvOpts;

	/**
	 * The default value of the '{@link #isMulticast() <em>Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMulticast()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTICAST_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isMulticast() <em>Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMulticast()
	 * @generated
	 * @ordered
	 */
	protected boolean multicast = MULTICAST_EDEFAULT;

	/**
	 * This is true if the Multicast attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean multicastESet;

	/**
	 * The default value of the '{@link #getNofASDU() <em>Nof ASDU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNofASDU()
	 * @generated
	 * @ordered
	 */
	protected static final long NOF_ASDU_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNofASDU() <em>Nof ASDU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNofASDU()
	 * @generated
	 * @ordered
	 */
	protected long nofASDU = NOF_ASDU_EDEFAULT;

	/**
	 * This is true if the Nof ASDU attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nofASDUESet;

	/**
	 * The default value of the '{@link #getSmpRate() <em>Smp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmpRate()
	 * @generated
	 * @ordered
	 */
	protected static final long SMP_RATE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSmpRate() <em>Smp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmpRate()
	 * @generated
	 * @ordered
	 */
	protected long smpRate = SMP_RATE_EDEFAULT;

	/**
	 * This is true if the Smp Rate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean smpRateESet;

	/**
	 * The default value of the '{@link #getSmvID() <em>Smv ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmvID()
	 * @generated
	 * @ordered
	 */
	protected static final String SMV_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSmvID() <em>Smv ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmvID()
	 * @generated
	 * @ordered
	 */
	protected String smvID = SMV_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TSampledValueControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTSampledValueControl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmvOptsType getSmvOpts() {
		return smvOpts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSmvOpts(SmvOptsType newSmvOpts, NotificationChain msgs) {
		SmvOptsType oldSmvOpts = smvOpts;
		smvOpts = newSmvOpts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TSAMPLED_VALUE_CONTROL__SMV_OPTS, oldSmvOpts, newSmvOpts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmvOpts(SmvOptsType newSmvOpts) {
		if (newSmvOpts != smvOpts) {
			NotificationChain msgs = null;
			if (smvOpts != null)
				msgs = ((InternalEObject)smvOpts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSAMPLED_VALUE_CONTROL__SMV_OPTS, null, msgs);
			if (newSmvOpts != null)
				msgs = ((InternalEObject)newSmvOpts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSAMPLED_VALUE_CONTROL__SMV_OPTS, null, msgs);
			msgs = basicSetSmvOpts(newSmvOpts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSAMPLED_VALUE_CONTROL__SMV_OPTS, newSmvOpts, newSmvOpts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMulticast() {
		return multicast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMulticast(boolean newMulticast) {
		boolean oldMulticast = multicast;
		multicast = newMulticast;
		boolean oldMulticastESet = multicastESet;
		multicastESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSAMPLED_VALUE_CONTROL__MULTICAST, oldMulticast, multicast, !oldMulticastESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMulticast() {
		boolean oldMulticast = multicast;
		boolean oldMulticastESet = multicastESet;
		multicast = MULTICAST_EDEFAULT;
		multicastESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TSAMPLED_VALUE_CONTROL__MULTICAST, oldMulticast, MULTICAST_EDEFAULT, oldMulticastESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMulticast() {
		return multicastESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNofASDU() {
		return nofASDU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNofASDU(long newNofASDU) {
		long oldNofASDU = nofASDU;
		nofASDU = newNofASDU;
		boolean oldNofASDUESet = nofASDUESet;
		nofASDUESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSAMPLED_VALUE_CONTROL__NOF_ASDU, oldNofASDU, nofASDU, !oldNofASDUESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNofASDU() {
		long oldNofASDU = nofASDU;
		boolean oldNofASDUESet = nofASDUESet;
		nofASDU = NOF_ASDU_EDEFAULT;
		nofASDUESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TSAMPLED_VALUE_CONTROL__NOF_ASDU, oldNofASDU, NOF_ASDU_EDEFAULT, oldNofASDUESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNofASDU() {
		return nofASDUESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSmpRate() {
		return smpRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmpRate(long newSmpRate) {
		long oldSmpRate = smpRate;
		smpRate = newSmpRate;
		boolean oldSmpRateESet = smpRateESet;
		smpRateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSAMPLED_VALUE_CONTROL__SMP_RATE, oldSmpRate, smpRate, !oldSmpRateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSmpRate() {
		long oldSmpRate = smpRate;
		boolean oldSmpRateESet = smpRateESet;
		smpRate = SMP_RATE_EDEFAULT;
		smpRateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TSAMPLED_VALUE_CONTROL__SMP_RATE, oldSmpRate, SMP_RATE_EDEFAULT, oldSmpRateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSmpRate() {
		return smpRateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSmvID() {
		return smvID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmvID(String newSmvID) {
		String oldSmvID = smvID;
		smvID = newSmvID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSAMPLED_VALUE_CONTROL__SMV_ID, oldSmvID, smvID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SclPackage.TSAMPLED_VALUE_CONTROL__SMV_OPTS:
				return basicSetSmvOpts(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SclPackage.TSAMPLED_VALUE_CONTROL__SMV_OPTS:
				return getSmvOpts();
			case SclPackage.TSAMPLED_VALUE_CONTROL__MULTICAST:
				return isMulticast();
			case SclPackage.TSAMPLED_VALUE_CONTROL__NOF_ASDU:
				return getNofASDU();
			case SclPackage.TSAMPLED_VALUE_CONTROL__SMP_RATE:
				return getSmpRate();
			case SclPackage.TSAMPLED_VALUE_CONTROL__SMV_ID:
				return getSmvID();
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
			case SclPackage.TSAMPLED_VALUE_CONTROL__SMV_OPTS:
				setSmvOpts((SmvOptsType)newValue);
				return;
			case SclPackage.TSAMPLED_VALUE_CONTROL__MULTICAST:
				setMulticast((Boolean)newValue);
				return;
			case SclPackage.TSAMPLED_VALUE_CONTROL__NOF_ASDU:
				setNofASDU((Long)newValue);
				return;
			case SclPackage.TSAMPLED_VALUE_CONTROL__SMP_RATE:
				setSmpRate((Long)newValue);
				return;
			case SclPackage.TSAMPLED_VALUE_CONTROL__SMV_ID:
				setSmvID((String)newValue);
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
			case SclPackage.TSAMPLED_VALUE_CONTROL__SMV_OPTS:
				setSmvOpts((SmvOptsType)null);
				return;
			case SclPackage.TSAMPLED_VALUE_CONTROL__MULTICAST:
				unsetMulticast();
				return;
			case SclPackage.TSAMPLED_VALUE_CONTROL__NOF_ASDU:
				unsetNofASDU();
				return;
			case SclPackage.TSAMPLED_VALUE_CONTROL__SMP_RATE:
				unsetSmpRate();
				return;
			case SclPackage.TSAMPLED_VALUE_CONTROL__SMV_ID:
				setSmvID(SMV_ID_EDEFAULT);
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
			case SclPackage.TSAMPLED_VALUE_CONTROL__SMV_OPTS:
				return smvOpts != null;
			case SclPackage.TSAMPLED_VALUE_CONTROL__MULTICAST:
				return isSetMulticast();
			case SclPackage.TSAMPLED_VALUE_CONTROL__NOF_ASDU:
				return isSetNofASDU();
			case SclPackage.TSAMPLED_VALUE_CONTROL__SMP_RATE:
				return isSetSmpRate();
			case SclPackage.TSAMPLED_VALUE_CONTROL__SMV_ID:
				return SMV_ID_EDEFAULT == null ? smvID != null : !SMV_ID_EDEFAULT.equals(smvID);
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
		result.append(" (multicast: ");
		if (multicastESet) result.append(multicast); else result.append("<unset>");
		result.append(", nofASDU: ");
		if (nofASDUESet) result.append(nofASDU); else result.append("<unset>");
		result.append(", smpRate: ");
		if (smpRateESet) result.append(smpRate); else result.append("<unset>");
		result.append(", smvID: ");
		result.append(smvID);
		result.append(')');
		return result.toString();
	}

} //TSampledValueControlImpl
