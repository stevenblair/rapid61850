/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TDO;
import ch.iec._61850._2006.scl.TLNodeType;

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
 * An implementation of the model object '<em><b>TL Node Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TLNodeTypeImpl#getDO <em>DO</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TLNodeTypeImpl#getIedType <em>Ied Type</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TLNodeTypeImpl#getLnClass <em>Ln Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TLNodeTypeImpl extends TIDNamingImpl implements TLNodeType {
	/**
	 * The cached value of the '{@link #getDO() <em>DO</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDO()
	 * @generated
	 * @ordered
	 */
	protected EList<TDO> dO;

	/**
	 * The default value of the '{@link #getIedType() <em>Ied Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIedType()
	 * @generated
	 * @ordered
	 */
	protected static final String IED_TYPE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getIedType() <em>Ied Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIedType()
	 * @generated
	 * @ordered
	 */
	protected String iedType = IED_TYPE_EDEFAULT;

	/**
	 * This is true if the Ied Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iedTypeESet;

	/**
	 * The default value of the '{@link #getLnClass() <em>Ln Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLnClass()
	 * @generated
	 * @ordered
	 */
	protected static final Object LN_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLnClass() <em>Ln Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLnClass()
	 * @generated
	 * @ordered
	 */
	protected Object lnClass = LN_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TLNodeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTLNodeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TDO> getDO() {
		if (dO == null) {
			dO = new EObjectContainmentEList<TDO>(TDO.class, this, SclPackage.TL_NODE_TYPE__DO);
		}
		return dO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIedType() {
		return iedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIedType(String newIedType) {
		String oldIedType = iedType;
		iedType = newIedType;
		boolean oldIedTypeESet = iedTypeESet;
		iedTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TL_NODE_TYPE__IED_TYPE, oldIedType, iedType, !oldIedTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIedType() {
		String oldIedType = iedType;
		boolean oldIedTypeESet = iedTypeESet;
		iedType = IED_TYPE_EDEFAULT;
		iedTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TL_NODE_TYPE__IED_TYPE, oldIedType, IED_TYPE_EDEFAULT, oldIedTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIedType() {
		return iedTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLnClass() {
		return lnClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLnClass(Object newLnClass) {
		Object oldLnClass = lnClass;
		lnClass = newLnClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TL_NODE_TYPE__LN_CLASS, oldLnClass, lnClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SclPackage.TL_NODE_TYPE__DO:
				return ((InternalEList<?>)getDO()).basicRemove(otherEnd, msgs);
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
			case SclPackage.TL_NODE_TYPE__DO:
				return getDO();
			case SclPackage.TL_NODE_TYPE__IED_TYPE:
				return getIedType();
			case SclPackage.TL_NODE_TYPE__LN_CLASS:
				return getLnClass();
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
			case SclPackage.TL_NODE_TYPE__DO:
				getDO().clear();
				getDO().addAll((Collection<? extends TDO>)newValue);
				return;
			case SclPackage.TL_NODE_TYPE__IED_TYPE:
				setIedType((String)newValue);
				return;
			case SclPackage.TL_NODE_TYPE__LN_CLASS:
				setLnClass(newValue);
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
			case SclPackage.TL_NODE_TYPE__DO:
				getDO().clear();
				return;
			case SclPackage.TL_NODE_TYPE__IED_TYPE:
				unsetIedType();
				return;
			case SclPackage.TL_NODE_TYPE__LN_CLASS:
				setLnClass(LN_CLASS_EDEFAULT);
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
			case SclPackage.TL_NODE_TYPE__DO:
				return dO != null && !dO.isEmpty();
			case SclPackage.TL_NODE_TYPE__IED_TYPE:
				return isSetIedType();
			case SclPackage.TL_NODE_TYPE__LN_CLASS:
				return LN_CLASS_EDEFAULT == null ? lnClass != null : !LN_CLASS_EDEFAULT.equals(lnClass);
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
		result.append(" (iedType: ");
		if (iedTypeESet) result.append(iedType); else result.append("<unset>");
		result.append(", lnClass: ");
		result.append(lnClass);
		result.append(')');
		return result.toString();
	}

} //TLNodeTypeImpl
