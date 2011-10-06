/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.sc.lmaintenance.impl;

import ch.iec._61850._2006.sc.lmaintenance.CondDescType;
import ch.iec._61850._2006.sc.lmaintenance.LmaintenancePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cond Desc Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.sc.lmaintenance.impl.CondDescTypeImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link ch.iec._61850._2006.sc.lmaintenance.impl.CondDescTypeImpl#getMop <em>Mop</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CondDescTypeImpl extends EObjectImpl implements CondDescType {
	/**
	 * The default value of the '{@link #getDesc() <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesc() <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesc()
	 * @generated
	 * @ordered
	 */
	protected String desc = DESC_EDEFAULT;

	/**
	 * The default value of the '{@link #getMop() <em>Mop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMop()
	 * @generated
	 * @ordered
	 */
	protected static final Object MOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMop() <em>Mop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMop()
	 * @generated
	 * @ordered
	 */
	protected Object mop = MOP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CondDescTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LmaintenancePackage.Literals.COND_DESC_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesc(String newDesc) {
		String oldDesc = desc;
		desc = newDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LmaintenancePackage.COND_DESC_TYPE__DESC, oldDesc, desc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMop() {
		return mop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMop(Object newMop) {
		Object oldMop = mop;
		mop = newMop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LmaintenancePackage.COND_DESC_TYPE__MOP, oldMop, mop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LmaintenancePackage.COND_DESC_TYPE__DESC:
				return getDesc();
			case LmaintenancePackage.COND_DESC_TYPE__MOP:
				return getMop();
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
			case LmaintenancePackage.COND_DESC_TYPE__DESC:
				setDesc((String)newValue);
				return;
			case LmaintenancePackage.COND_DESC_TYPE__MOP:
				setMop(newValue);
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
			case LmaintenancePackage.COND_DESC_TYPE__DESC:
				setDesc(DESC_EDEFAULT);
				return;
			case LmaintenancePackage.COND_DESC_TYPE__MOP:
				setMop(MOP_EDEFAULT);
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
			case LmaintenancePackage.COND_DESC_TYPE__DESC:
				return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT.equals(desc);
			case LmaintenancePackage.COND_DESC_TYPE__MOP:
				return MOP_EDEFAULT == null ? mop != null : !MOP_EDEFAULT.equals(mop);
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
		result.append(" (desc: ");
		result.append(desc);
		result.append(", mop: ");
		result.append(mop);
		result.append(')');
		return result.toString();
	}

} //CondDescTypeImpl
