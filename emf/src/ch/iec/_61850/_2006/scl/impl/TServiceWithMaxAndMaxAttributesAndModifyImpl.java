/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TServiceWithMaxAndMaxAttributesAndModify;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TService With Max And Max Attributes And Modify</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TServiceWithMaxAndMaxAttributesAndModifyImpl#isModify <em>Modify</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TServiceWithMaxAndMaxAttributesAndModifyImpl extends TServiceWithMaxAndMaxAttributesImpl implements TServiceWithMaxAndMaxAttributesAndModify {
	/**
	 * The default value of the '{@link #isModify() <em>Modify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModify()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MODIFY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isModify() <em>Modify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModify()
	 * @generated
	 * @ordered
	 */
	protected boolean modify = MODIFY_EDEFAULT;

	/**
	 * This is true if the Modify attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modifyESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TServiceWithMaxAndMaxAttributesAndModifyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTServiceWithMaxAndMaxAttributesAndModify();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isModify() {
		return modify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModify(boolean newModify) {
		boolean oldModify = modify;
		modify = newModify;
		boolean oldModifyESet = modifyESet;
		modifyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICE_WITH_MAX_AND_MAX_ATTRIBUTES_AND_MODIFY__MODIFY, oldModify, modify, !oldModifyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetModify() {
		boolean oldModify = modify;
		boolean oldModifyESet = modifyESet;
		modify = MODIFY_EDEFAULT;
		modifyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TSERVICE_WITH_MAX_AND_MAX_ATTRIBUTES_AND_MODIFY__MODIFY, oldModify, MODIFY_EDEFAULT, oldModifyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetModify() {
		return modifyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SclPackage.TSERVICE_WITH_MAX_AND_MAX_ATTRIBUTES_AND_MODIFY__MODIFY:
				return isModify();
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
			case SclPackage.TSERVICE_WITH_MAX_AND_MAX_ATTRIBUTES_AND_MODIFY__MODIFY:
				setModify((Boolean)newValue);
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
			case SclPackage.TSERVICE_WITH_MAX_AND_MAX_ATTRIBUTES_AND_MODIFY__MODIFY:
				unsetModify();
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
			case SclPackage.TSERVICE_WITH_MAX_AND_MAX_ATTRIBUTES_AND_MODIFY__MODIFY:
				return isSetModify();
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
		result.append(" (modify: ");
		if (modifyESet) result.append(modify); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TServiceWithMaxAndMaxAttributesAndModifyImpl
