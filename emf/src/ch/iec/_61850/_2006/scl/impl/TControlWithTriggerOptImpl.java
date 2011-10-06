/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TControlWithTriggerOpt;
import ch.iec._61850._2006.scl.TTrgOps;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TControl With Trigger Opt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TControlWithTriggerOptImpl#getTrgOps <em>Trg Ops</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TControlWithTriggerOptImpl#getIntgPd <em>Intg Pd</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TControlWithTriggerOptImpl extends TControlImpl implements TControlWithTriggerOpt {
	/**
	 * The cached value of the '{@link #getTrgOps() <em>Trg Ops</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrgOps()
	 * @generated
	 * @ordered
	 */
	protected TTrgOps trgOps;

	/**
	 * The default value of the '{@link #getIntgPd() <em>Intg Pd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntgPd()
	 * @generated
	 * @ordered
	 */
	protected static final long INTG_PD_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getIntgPd() <em>Intg Pd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntgPd()
	 * @generated
	 * @ordered
	 */
	protected long intgPd = INTG_PD_EDEFAULT;

	/**
	 * This is true if the Intg Pd attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean intgPdESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TControlWithTriggerOptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTControlWithTriggerOpt();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTrgOps getTrgOps() {
		return trgOps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrgOps(TTrgOps newTrgOps, NotificationChain msgs) {
		TTrgOps oldTrgOps = trgOps;
		trgOps = newTrgOps;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TCONTROL_WITH_TRIGGER_OPT__TRG_OPS, oldTrgOps, newTrgOps);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrgOps(TTrgOps newTrgOps) {
		if (newTrgOps != trgOps) {
			NotificationChain msgs = null;
			if (trgOps != null)
				msgs = ((InternalEObject)trgOps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TCONTROL_WITH_TRIGGER_OPT__TRG_OPS, null, msgs);
			if (newTrgOps != null)
				msgs = ((InternalEObject)newTrgOps).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TCONTROL_WITH_TRIGGER_OPT__TRG_OPS, null, msgs);
			msgs = basicSetTrgOps(newTrgOps, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TCONTROL_WITH_TRIGGER_OPT__TRG_OPS, newTrgOps, newTrgOps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getIntgPd() {
		return intgPd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntgPd(long newIntgPd) {
		long oldIntgPd = intgPd;
		intgPd = newIntgPd;
		boolean oldIntgPdESet = intgPdESet;
		intgPdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TCONTROL_WITH_TRIGGER_OPT__INTG_PD, oldIntgPd, intgPd, !oldIntgPdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIntgPd() {
		long oldIntgPd = intgPd;
		boolean oldIntgPdESet = intgPdESet;
		intgPd = INTG_PD_EDEFAULT;
		intgPdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TCONTROL_WITH_TRIGGER_OPT__INTG_PD, oldIntgPd, INTG_PD_EDEFAULT, oldIntgPdESet));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SclPackage.TCONTROL_WITH_TRIGGER_OPT__TRG_OPS:
				return basicSetTrgOps(null, msgs);
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
			case SclPackage.TCONTROL_WITH_TRIGGER_OPT__TRG_OPS:
				return getTrgOps();
			case SclPackage.TCONTROL_WITH_TRIGGER_OPT__INTG_PD:
				return getIntgPd();
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
			case SclPackage.TCONTROL_WITH_TRIGGER_OPT__TRG_OPS:
				setTrgOps((TTrgOps)newValue);
				return;
			case SclPackage.TCONTROL_WITH_TRIGGER_OPT__INTG_PD:
				setIntgPd((Long)newValue);
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
			case SclPackage.TCONTROL_WITH_TRIGGER_OPT__TRG_OPS:
				setTrgOps((TTrgOps)null);
				return;
			case SclPackage.TCONTROL_WITH_TRIGGER_OPT__INTG_PD:
				unsetIntgPd();
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
			case SclPackage.TCONTROL_WITH_TRIGGER_OPT__TRG_OPS:
				return trgOps != null;
			case SclPackage.TCONTROL_WITH_TRIGGER_OPT__INTG_PD:
				return isSetIntgPd();
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
		result.append(')');
		return result.toString();
	}

} //TControlWithTriggerOptImpl
