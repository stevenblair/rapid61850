/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TDA;
import ch.iec._61850._2006.scl.TFCEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TDA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TDAImpl#isDchg <em>Dchg</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TDAImpl#isDupd <em>Dupd</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TDAImpl#getFc <em>Fc</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TDAImpl#isQchg <em>Qchg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TDAImpl extends TAbstractDataAttributeImpl implements TDA {
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
	 * The default value of the '{@link #getFc() <em>Fc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFc()
	 * @generated
	 * @ordered
	 */
	protected static final TFCEnum FC_EDEFAULT = TFCEnum.ST;

	/**
	 * The cached value of the '{@link #getFc() <em>Fc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFc()
	 * @generated
	 * @ordered
	 */
	protected TFCEnum fc = FC_EDEFAULT;

	/**
	 * This is true if the Fc attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fcESet;

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
	protected TDAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTDA();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TDA__DCHG, oldDchg, dchg, !oldDchgESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TDA__DCHG, oldDchg, DCHG_EDEFAULT, oldDchgESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TDA__DUPD, oldDupd, dupd, !oldDupdESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TDA__DUPD, oldDupd, DUPD_EDEFAULT, oldDupdESet));
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
	public TFCEnum getFc() {
		return fc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFc(TFCEnum newFc) {
		TFCEnum oldFc = fc;
		fc = newFc == null ? FC_EDEFAULT : newFc;
		boolean oldFcESet = fcESet;
		fcESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TDA__FC, oldFc, fc, !oldFcESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFc() {
		TFCEnum oldFc = fc;
		boolean oldFcESet = fcESet;
		fc = FC_EDEFAULT;
		fcESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TDA__FC, oldFc, FC_EDEFAULT, oldFcESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFc() {
		return fcESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TDA__QCHG, oldQchg, qchg, !oldQchgESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TDA__QCHG, oldQchg, QCHG_EDEFAULT, oldQchgESet));
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
			case SclPackage.TDA__DCHG:
				return isDchg();
			case SclPackage.TDA__DUPD:
				return isDupd();
			case SclPackage.TDA__FC:
				return getFc();
			case SclPackage.TDA__QCHG:
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
			case SclPackage.TDA__DCHG:
				setDchg((Boolean)newValue);
				return;
			case SclPackage.TDA__DUPD:
				setDupd((Boolean)newValue);
				return;
			case SclPackage.TDA__FC:
				setFc((TFCEnum)newValue);
				return;
			case SclPackage.TDA__QCHG:
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
			case SclPackage.TDA__DCHG:
				unsetDchg();
				return;
			case SclPackage.TDA__DUPD:
				unsetDupd();
				return;
			case SclPackage.TDA__FC:
				unsetFc();
				return;
			case SclPackage.TDA__QCHG:
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
			case SclPackage.TDA__DCHG:
				return isSetDchg();
			case SclPackage.TDA__DUPD:
				return isSetDupd();
			case SclPackage.TDA__FC:
				return isSetFc();
			case SclPackage.TDA__QCHG:
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
		result.append(", fc: ");
		if (fcESet) result.append(fc); else result.append("<unset>");
		result.append(", qchg: ");
		if (qchgESet) result.append(qchg); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TDAImpl
