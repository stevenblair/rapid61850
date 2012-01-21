/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TControl;
import ch.iec._61850._2006.scl.TControlBlock;
import ch.iec._61850._2006.scl.TDataSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TControl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TControlImpl#getDatSet <em>Dat Set</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TControlImpl#getControlBlock <em>Control Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TControlImpl extends TNamingImpl implements TControl {
	/**
	 * The default value of the '{@link #getDatSet() <em>Dat Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatSet()
	 * @generated
	 * @ordered
	 */
	protected static final String DAT_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatSet() <em>Dat Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatSet()
	 * @generated
	 * @ordered
	 */
	protected String datSet = DAT_SET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getControlBlock() <em>Control Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlBlock()
	 * @generated
	 * @ordered
	 */
	protected TControlBlock controlBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTControl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatSet() {
		return datSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatSet(String newDatSet) {
		String oldDatSet = datSet;
		datSet = newDatSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TCONTROL__DAT_SET, oldDatSet, datSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TControlBlock getControlBlock() {
		if (controlBlock != null && controlBlock.eIsProxy()) {
			InternalEObject oldControlBlock = (InternalEObject)controlBlock;
			controlBlock = (TControlBlock)eResolveProxy(oldControlBlock);
			if (controlBlock != oldControlBlock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SclPackage.TCONTROL__CONTROL_BLOCK, oldControlBlock, controlBlock));
			}
		}
		return controlBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TControlBlock basicGetControlBlock() {
		return controlBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlBlock(TControlBlock newControlBlock, NotificationChain msgs) {
		TControlBlock oldControlBlock = controlBlock;
		controlBlock = newControlBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TCONTROL__CONTROL_BLOCK, oldControlBlock, newControlBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlBlock(TControlBlock newControlBlock) {
		if (newControlBlock != controlBlock) {
			NotificationChain msgs = null;
			if (controlBlock != null)
				msgs = ((InternalEObject)controlBlock).eInverseRemove(this, SclPackage.TCONTROL_BLOCK__CONTROL, TControlBlock.class, msgs);
			if (newControlBlock != null)
				msgs = ((InternalEObject)newControlBlock).eInverseAdd(this, SclPackage.TCONTROL_BLOCK__CONTROL, TControlBlock.class, msgs);
			msgs = basicSetControlBlock(newControlBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TCONTROL__CONTROL_BLOCK, newControlBlock, newControlBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SclPackage.TCONTROL__CONTROL_BLOCK:
				if (controlBlock != null)
					msgs = ((InternalEObject)controlBlock).eInverseRemove(this, SclPackage.TCONTROL_BLOCK__CONTROL, TControlBlock.class, msgs);
				return basicSetControlBlock((TControlBlock)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SclPackage.TCONTROL__CONTROL_BLOCK:
				return basicSetControlBlock(null, msgs);
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
			case SclPackage.TCONTROL__DAT_SET:
				return getDatSet();
			case SclPackage.TCONTROL__CONTROL_BLOCK:
				if (resolve) return getControlBlock();
				return basicGetControlBlock();
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
			case SclPackage.TCONTROL__DAT_SET:
				setDatSet((String)newValue);
				return;
			case SclPackage.TCONTROL__CONTROL_BLOCK:
				setControlBlock((TControlBlock)newValue);
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
			case SclPackage.TCONTROL__DAT_SET:
				setDatSet(DAT_SET_EDEFAULT);
				return;
			case SclPackage.TCONTROL__CONTROL_BLOCK:
				setControlBlock((TControlBlock)null);
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
			case SclPackage.TCONTROL__DAT_SET:
				return DAT_SET_EDEFAULT == null ? datSet != null : !DAT_SET_EDEFAULT.equals(datSet);
			case SclPackage.TCONTROL__CONTROL_BLOCK:
				return controlBlock != null;
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
		result.append(" (datSet: ");
		result.append(datSet);
		result.append(')');
		return result.toString();
	}

} //TControlImpl
