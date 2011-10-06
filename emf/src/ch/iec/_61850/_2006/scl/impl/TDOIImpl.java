/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TDAI;
import ch.iec._61850._2006.scl.TDOI;
import ch.iec._61850._2006.scl.TSDI;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TDOI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TDOIImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TDOIImpl#getSDI <em>SDI</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TDOIImpl#getDAI <em>DAI</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TDOIImpl#getAccessControl <em>Access Control</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TDOIImpl#getIx <em>Ix</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TDOIImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TDOIImpl extends TUnNamingImpl implements TDOI {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getAccessControl() <em>Access Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessControl()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_CONTROL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessControl() <em>Access Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessControl()
	 * @generated
	 * @ordered
	 */
	protected String accessControl = ACCESS_CONTROL_EDEFAULT;

	/**
	 * The default value of the '{@link #getIx() <em>Ix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIx()
	 * @generated
	 * @ordered
	 */
	protected static final long IX_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getIx() <em>Ix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIx()
	 * @generated
	 * @ordered
	 */
	protected long ix = IX_EDEFAULT;

	/**
	 * This is true if the Ix attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ixESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TDOIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTDOI();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, SclPackage.TDOI__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TSDI> getSDI() {
		return getGroup().list(SclPackage.eINSTANCE.getTDOI_SDI());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TDAI> getDAI() {
		return getGroup().list(SclPackage.eINSTANCE.getTDOI_DAI());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccessControl() {
		return accessControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessControl(String newAccessControl) {
		String oldAccessControl = accessControl;
		accessControl = newAccessControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TDOI__ACCESS_CONTROL, oldAccessControl, accessControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getIx() {
		return ix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIx(long newIx) {
		long oldIx = ix;
		ix = newIx;
		boolean oldIxESet = ixESet;
		ixESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TDOI__IX, oldIx, ix, !oldIxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIx() {
		long oldIx = ix;
		boolean oldIxESet = ixESet;
		ix = IX_EDEFAULT;
		ixESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TDOI__IX, oldIx, IX_EDEFAULT, oldIxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIx() {
		return ixESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TDOI__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SclPackage.TDOI__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case SclPackage.TDOI__SDI:
				return ((InternalEList<?>)getSDI()).basicRemove(otherEnd, msgs);
			case SclPackage.TDOI__DAI:
				return ((InternalEList<?>)getDAI()).basicRemove(otherEnd, msgs);
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
			case SclPackage.TDOI__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case SclPackage.TDOI__SDI:
				return getSDI();
			case SclPackage.TDOI__DAI:
				return getDAI();
			case SclPackage.TDOI__ACCESS_CONTROL:
				return getAccessControl();
			case SclPackage.TDOI__IX:
				return getIx();
			case SclPackage.TDOI__NAME:
				return getName();
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
			case SclPackage.TDOI__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case SclPackage.TDOI__SDI:
				getSDI().clear();
				getSDI().addAll((Collection<? extends TSDI>)newValue);
				return;
			case SclPackage.TDOI__DAI:
				getDAI().clear();
				getDAI().addAll((Collection<? extends TDAI>)newValue);
				return;
			case SclPackage.TDOI__ACCESS_CONTROL:
				setAccessControl((String)newValue);
				return;
			case SclPackage.TDOI__IX:
				setIx((Long)newValue);
				return;
			case SclPackage.TDOI__NAME:
				setName((String)newValue);
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
			case SclPackage.TDOI__GROUP:
				getGroup().clear();
				return;
			case SclPackage.TDOI__SDI:
				getSDI().clear();
				return;
			case SclPackage.TDOI__DAI:
				getDAI().clear();
				return;
			case SclPackage.TDOI__ACCESS_CONTROL:
				setAccessControl(ACCESS_CONTROL_EDEFAULT);
				return;
			case SclPackage.TDOI__IX:
				unsetIx();
				return;
			case SclPackage.TDOI__NAME:
				setName(NAME_EDEFAULT);
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
			case SclPackage.TDOI__GROUP:
				return group != null && !group.isEmpty();
			case SclPackage.TDOI__SDI:
				return !getSDI().isEmpty();
			case SclPackage.TDOI__DAI:
				return !getDAI().isEmpty();
			case SclPackage.TDOI__ACCESS_CONTROL:
				return ACCESS_CONTROL_EDEFAULT == null ? accessControl != null : !ACCESS_CONTROL_EDEFAULT.equals(accessControl);
			case SclPackage.TDOI__IX:
				return isSetIx();
			case SclPackage.TDOI__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (group: ");
		result.append(group);
		result.append(", accessControl: ");
		result.append(accessControl);
		result.append(", ix: ");
		if (ixESet) result.append(ix); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TDOIImpl
