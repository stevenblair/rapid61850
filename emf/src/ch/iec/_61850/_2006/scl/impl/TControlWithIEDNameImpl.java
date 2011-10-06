/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TControlWithIEDName;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TControl With IED Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TControlWithIEDNameImpl#getIEDName <em>IED Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TControlWithIEDNameImpl#getConfRev <em>Conf Rev</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TControlWithIEDNameImpl extends TControlImpl implements TControlWithIEDName {
	/**
	 * The cached value of the '{@link #getIEDName() <em>IED Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIEDName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> iEDName;

	/**
	 * The default value of the '{@link #getConfRev() <em>Conf Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfRev()
	 * @generated
	 * @ordered
	 */
	protected static final long CONF_REV_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getConfRev() <em>Conf Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfRev()
	 * @generated
	 * @ordered
	 */
	protected long confRev = CONF_REV_EDEFAULT;

	/**
	 * This is true if the Conf Rev attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean confRevESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TControlWithIEDNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTControlWithIEDName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getIEDName() {
		if (iEDName == null) {
			iEDName = new EDataTypeEList<String>(String.class, this, SclPackage.TCONTROL_WITH_IED_NAME__IED_NAME);
		}
		return iEDName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getConfRev() {
		return confRev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfRev(long newConfRev) {
		long oldConfRev = confRev;
		confRev = newConfRev;
		boolean oldConfRevESet = confRevESet;
		confRevESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TCONTROL_WITH_IED_NAME__CONF_REV, oldConfRev, confRev, !oldConfRevESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConfRev() {
		long oldConfRev = confRev;
		boolean oldConfRevESet = confRevESet;
		confRev = CONF_REV_EDEFAULT;
		confRevESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TCONTROL_WITH_IED_NAME__CONF_REV, oldConfRev, CONF_REV_EDEFAULT, oldConfRevESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConfRev() {
		return confRevESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SclPackage.TCONTROL_WITH_IED_NAME__IED_NAME:
				return getIEDName();
			case SclPackage.TCONTROL_WITH_IED_NAME__CONF_REV:
				return getConfRev();
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
			case SclPackage.TCONTROL_WITH_IED_NAME__IED_NAME:
				getIEDName().clear();
				getIEDName().addAll((Collection<? extends String>)newValue);
				return;
			case SclPackage.TCONTROL_WITH_IED_NAME__CONF_REV:
				setConfRev((Long)newValue);
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
			case SclPackage.TCONTROL_WITH_IED_NAME__IED_NAME:
				getIEDName().clear();
				return;
			case SclPackage.TCONTROL_WITH_IED_NAME__CONF_REV:
				unsetConfRev();
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
			case SclPackage.TCONTROL_WITH_IED_NAME__IED_NAME:
				return iEDName != null && !iEDName.isEmpty();
			case SclPackage.TCONTROL_WITH_IED_NAME__CONF_REV:
				return isSetConfRev();
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
		result.append(" (iEDName: ");
		result.append(iEDName);
		result.append(", confRev: ");
		if (confRevESet) result.append(confRev); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TControlWithIEDNameImpl
