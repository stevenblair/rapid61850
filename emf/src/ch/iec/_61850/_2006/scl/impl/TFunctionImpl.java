/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TFunction;
import ch.iec._61850._2006.scl.TGeneralEquipment;
import ch.iec._61850._2006.scl.TSubFunction;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TFunction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TFunctionImpl#getSubFunction <em>Sub Function</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TFunctionImpl#getGeneralEquipment <em>General Equipment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TFunctionImpl extends TPowerSystemResourceImpl implements TFunction {
	/**
	 * The cached value of the '{@link #getSubFunction() <em>Sub Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<TSubFunction> subFunction;

	/**
	 * The cached value of the '{@link #getGeneralEquipment() <em>General Equipment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralEquipment()
	 * @generated
	 * @ordered
	 */
	protected EList<TGeneralEquipment> generalEquipment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTFunction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TSubFunction> getSubFunction() {
		if (subFunction == null) {
			subFunction = new EObjectContainmentEList<TSubFunction>(TSubFunction.class, this, SclPackage.TFUNCTION__SUB_FUNCTION);
		}
		return subFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TGeneralEquipment> getGeneralEquipment() {
		if (generalEquipment == null) {
			generalEquipment = new EObjectContainmentEList<TGeneralEquipment>(TGeneralEquipment.class, this, SclPackage.TFUNCTION__GENERAL_EQUIPMENT);
		}
		return generalEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SclPackage.TFUNCTION__SUB_FUNCTION:
				return ((InternalEList<?>)getSubFunction()).basicRemove(otherEnd, msgs);
			case SclPackage.TFUNCTION__GENERAL_EQUIPMENT:
				return ((InternalEList<?>)getGeneralEquipment()).basicRemove(otherEnd, msgs);
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
			case SclPackage.TFUNCTION__SUB_FUNCTION:
				return getSubFunction();
			case SclPackage.TFUNCTION__GENERAL_EQUIPMENT:
				return getGeneralEquipment();
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
			case SclPackage.TFUNCTION__SUB_FUNCTION:
				getSubFunction().clear();
				getSubFunction().addAll((Collection<? extends TSubFunction>)newValue);
				return;
			case SclPackage.TFUNCTION__GENERAL_EQUIPMENT:
				getGeneralEquipment().clear();
				getGeneralEquipment().addAll((Collection<? extends TGeneralEquipment>)newValue);
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
			case SclPackage.TFUNCTION__SUB_FUNCTION:
				getSubFunction().clear();
				return;
			case SclPackage.TFUNCTION__GENERAL_EQUIPMENT:
				getGeneralEquipment().clear();
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
			case SclPackage.TFUNCTION__SUB_FUNCTION:
				return subFunction != null && !subFunction.isEmpty();
			case SclPackage.TFUNCTION__GENERAL_EQUIPMENT:
				return generalEquipment != null && !generalEquipment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TFunctionImpl
