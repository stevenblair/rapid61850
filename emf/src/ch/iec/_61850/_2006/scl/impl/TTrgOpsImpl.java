/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TTrgOps;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TTrg Ops</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TTrgOpsImpl#isDchg <em>Dchg</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TTrgOpsImpl#isDupd <em>Dupd</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TTrgOpsImpl#isPeriod <em>Period</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TTrgOpsImpl#isQchg <em>Qchg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TTrgOpsImpl extends EObjectImpl implements TTrgOps {
	/**
	 * The default value of the '{@link #isDchg() <em>Dchg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDchg()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DCHG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDchg() <em>Dchg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDchg()
	 * @generated
	 * @ordered
	 */
	protected boolean dchg = DCHG_EDEFAULT;

	/**
	 * This is true if the Dchg attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dchgESet;

	/**
	 * The default value of the '{@link #isDupd() <em>Dupd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDupd()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DUPD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDupd() <em>Dupd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDupd()
	 * @generated
	 * @ordered
	 */
	protected boolean dupd = DUPD_EDEFAULT;

	/**
	 * This is true if the Dupd attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dupdESet;

	/**
	 * The default value of the '{@link #isPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PERIOD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPeriod()
	 * @generated
	 * @ordered
	 */
	protected boolean period = PERIOD_EDEFAULT;

	/**
	 * This is true if the Period attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean periodESet;

	/**
	 * The default value of the '{@link #isQchg() <em>Qchg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isQchg()
	 * @generated
	 * @ordered
	 */
	protected static final boolean QCHG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isQchg() <em>Qchg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isQchg()
	 * @generated
	 * @ordered
	 */
	protected boolean qchg = QCHG_EDEFAULT;

	/**
	 * This is true if the Qchg attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qchgESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TTrgOpsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTTrgOps();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDchg() {
		return dchg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDchg(boolean newDchg) {
		boolean oldDchg = dchg;
		dchg = newDchg;
		boolean oldDchgESet = dchgESet;
		dchgESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TTRG_OPS__DCHG, oldDchg, dchg, !oldDchgESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDchg() {
		boolean oldDchg = dchg;
		boolean oldDchgESet = dchgESet;
		dchg = DCHG_EDEFAULT;
		dchgESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TTRG_OPS__DCHG, oldDchg, DCHG_EDEFAULT, oldDchgESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDchg() {
		return dchgESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDupd() {
		return dupd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDupd(boolean newDupd) {
		boolean oldDupd = dupd;
		dupd = newDupd;
		boolean oldDupdESet = dupdESet;
		dupdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TTRG_OPS__DUPD, oldDupd, dupd, !oldDupdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDupd() {
		boolean oldDupd = dupd;
		boolean oldDupdESet = dupdESet;
		dupd = DUPD_EDEFAULT;
		dupdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TTRG_OPS__DUPD, oldDupd, DUPD_EDEFAULT, oldDupdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDupd() {
		return dupdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(boolean newPeriod) {
		boolean oldPeriod = period;
		period = newPeriod;
		boolean oldPeriodESet = periodESet;
		periodESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TTRG_OPS__PERIOD, oldPeriod, period, !oldPeriodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPeriod() {
		boolean oldPeriod = period;
		boolean oldPeriodESet = periodESet;
		period = PERIOD_EDEFAULT;
		periodESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TTRG_OPS__PERIOD, oldPeriod, PERIOD_EDEFAULT, oldPeriodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPeriod() {
		return periodESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isQchg() {
		return qchg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQchg(boolean newQchg) {
		boolean oldQchg = qchg;
		qchg = newQchg;
		boolean oldQchgESet = qchgESet;
		qchgESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TTRG_OPS__QCHG, oldQchg, qchg, !oldQchgESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQchg() {
		boolean oldQchg = qchg;
		boolean oldQchgESet = qchgESet;
		qchg = QCHG_EDEFAULT;
		qchgESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TTRG_OPS__QCHG, oldQchg, QCHG_EDEFAULT, oldQchgESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQchg() {
		return qchgESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SclPackage.TTRG_OPS__DCHG:
				return isDchg();
			case SclPackage.TTRG_OPS__DUPD:
				return isDupd();
			case SclPackage.TTRG_OPS__PERIOD:
				return isPeriod();
			case SclPackage.TTRG_OPS__QCHG:
				return isQchg();
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
			case SclPackage.TTRG_OPS__DCHG:
				setDchg((Boolean)newValue);
				return;
			case SclPackage.TTRG_OPS__DUPD:
				setDupd((Boolean)newValue);
				return;
			case SclPackage.TTRG_OPS__PERIOD:
				setPeriod((Boolean)newValue);
				return;
			case SclPackage.TTRG_OPS__QCHG:
				setQchg((Boolean)newValue);
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
			case SclPackage.TTRG_OPS__DCHG:
				unsetDchg();
				return;
			case SclPackage.TTRG_OPS__DUPD:
				unsetDupd();
				return;
			case SclPackage.TTRG_OPS__PERIOD:
				unsetPeriod();
				return;
			case SclPackage.TTRG_OPS__QCHG:
				unsetQchg();
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
			case SclPackage.TTRG_OPS__DCHG:
				return isSetDchg();
			case SclPackage.TTRG_OPS__DUPD:
				return isSetDupd();
			case SclPackage.TTRG_OPS__PERIOD:
				return isSetPeriod();
			case SclPackage.TTRG_OPS__QCHG:
				return isSetQchg();
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
		result.append(" (dchg: ");
		if (dchgESet) result.append(dchg); else result.append("<unset>");
		result.append(", dupd: ");
		if (dupdESet) result.append(dupd); else result.append("<unset>");
		result.append(", period: ");
		if (periodESet) result.append(period); else result.append("<unset>");
		result.append(", qchg: ");
		if (qchgESet) result.append(qchg); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TTrgOpsImpl
