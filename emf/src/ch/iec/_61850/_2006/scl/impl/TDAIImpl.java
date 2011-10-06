/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TDAI;
import ch.iec._61850._2006.scl.TVal;
import ch.iec._61850._2006.scl.TValKindEnum;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TDAI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TDAIImpl#getVal <em>Val</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TDAIImpl#getIx <em>Ix</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TDAIImpl#getName <em>Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TDAIImpl#getSAddr <em>SAddr</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TDAIImpl#getValKind <em>Val Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TDAIImpl extends TUnNamingImpl implements TDAI {
	/**
	 * The cached value of the '{@link #getVal() <em>Val</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVal()
	 * @generated
	 * @ordered
	 */
	protected EList<TVal> val;

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
	protected static final Object NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Object name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSAddr() <em>SAddr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAddr()
	 * @generated
	 * @ordered
	 */
	protected static final String SADDR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSAddr() <em>SAddr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAddr()
	 * @generated
	 * @ordered
	 */
	protected String sAddr = SADDR_EDEFAULT;

	/**
	 * The default value of the '{@link #getValKind() <em>Val Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValKind()
	 * @generated
	 * @ordered
	 */
	protected static final TValKindEnum VAL_KIND_EDEFAULT = TValKindEnum.SET;

	/**
	 * The cached value of the '{@link #getValKind() <em>Val Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValKind()
	 * @generated
	 * @ordered
	 */
	protected TValKindEnum valKind = VAL_KIND_EDEFAULT;

	/**
	 * This is true if the Val Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valKindESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TDAIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTDAI();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TVal> getVal() {
		if (val == null) {
			val = new EObjectContainmentEList<TVal>(TVal.class, this, SclPackage.TDAI__VAL);
		}
		return val;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TDAI__IX, oldIx, ix, !oldIxESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TDAI__IX, oldIx, IX_EDEFAULT, oldIxESet));
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
	public Object getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Object newName) {
		Object oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TDAI__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSAddr() {
		return sAddr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAddr(String newSAddr) {
		String oldSAddr = sAddr;
		sAddr = newSAddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TDAI__SADDR, oldSAddr, sAddr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TValKindEnum getValKind() {
		return valKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValKind(TValKindEnum newValKind) {
		TValKindEnum oldValKind = valKind;
		valKind = newValKind == null ? VAL_KIND_EDEFAULT : newValKind;
		boolean oldValKindESet = valKindESet;
		valKindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TDAI__VAL_KIND, oldValKind, valKind, !oldValKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValKind() {
		TValKindEnum oldValKind = valKind;
		boolean oldValKindESet = valKindESet;
		valKind = VAL_KIND_EDEFAULT;
		valKindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TDAI__VAL_KIND, oldValKind, VAL_KIND_EDEFAULT, oldValKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValKind() {
		return valKindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SclPackage.TDAI__VAL:
				return ((InternalEList<?>)getVal()).basicRemove(otherEnd, msgs);
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
			case SclPackage.TDAI__VAL:
				return getVal();
			case SclPackage.TDAI__IX:
				return getIx();
			case SclPackage.TDAI__NAME:
				return getName();
			case SclPackage.TDAI__SADDR:
				return getSAddr();
			case SclPackage.TDAI__VAL_KIND:
				return getValKind();
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
			case SclPackage.TDAI__VAL:
				getVal().clear();
				getVal().addAll((Collection<? extends TVal>)newValue);
				return;
			case SclPackage.TDAI__IX:
				setIx((Long)newValue);
				return;
			case SclPackage.TDAI__NAME:
				setName(newValue);
				return;
			case SclPackage.TDAI__SADDR:
				setSAddr((String)newValue);
				return;
			case SclPackage.TDAI__VAL_KIND:
				setValKind((TValKindEnum)newValue);
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
			case SclPackage.TDAI__VAL:
				getVal().clear();
				return;
			case SclPackage.TDAI__IX:
				unsetIx();
				return;
			case SclPackage.TDAI__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SclPackage.TDAI__SADDR:
				setSAddr(SADDR_EDEFAULT);
				return;
			case SclPackage.TDAI__VAL_KIND:
				unsetValKind();
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
			case SclPackage.TDAI__VAL:
				return val != null && !val.isEmpty();
			case SclPackage.TDAI__IX:
				return isSetIx();
			case SclPackage.TDAI__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SclPackage.TDAI__SADDR:
				return SADDR_EDEFAULT == null ? sAddr != null : !SADDR_EDEFAULT.equals(sAddr);
			case SclPackage.TDAI__VAL_KIND:
				return isSetValKind();
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
		result.append(" (ix: ");
		if (ixESet) result.append(ix); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", sAddr: ");
		result.append(sAddr);
		result.append(", valKind: ");
		if (valKindESet) result.append(valKind); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TDAIImpl
