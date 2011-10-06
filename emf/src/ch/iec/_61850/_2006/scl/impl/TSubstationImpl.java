/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TFunction;
import ch.iec._61850._2006.scl.TSubstation;
import ch.iec._61850._2006.scl.TVoltageLevel;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TSubstation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TSubstationImpl#getVoltageLevel <em>Voltage Level</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TSubstationImpl#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TSubstationImpl extends TEquipmentContainerImpl implements TSubstation {
	/**
	 * The cached value of the '{@link #getVoltageLevel() <em>Voltage Level</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<TVoltageLevel> voltageLevel;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<TFunction> function;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TSubstationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTSubstation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TVoltageLevel> getVoltageLevel() {
		if (voltageLevel == null) {
			voltageLevel = new EObjectContainmentEList<TVoltageLevel>(TVoltageLevel.class, this, SclPackage.TSUBSTATION__VOLTAGE_LEVEL);
		}
		return voltageLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TFunction> getFunction() {
		if (function == null) {
			function = new EObjectContainmentEList<TFunction>(TFunction.class, this, SclPackage.TSUBSTATION__FUNCTION);
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SclPackage.TSUBSTATION__VOLTAGE_LEVEL:
				return ((InternalEList<?>)getVoltageLevel()).basicRemove(otherEnd, msgs);
			case SclPackage.TSUBSTATION__FUNCTION:
				return ((InternalEList<?>)getFunction()).basicRemove(otherEnd, msgs);
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
			case SclPackage.TSUBSTATION__VOLTAGE_LEVEL:
				return getVoltageLevel();
			case SclPackage.TSUBSTATION__FUNCTION:
				return getFunction();
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
			case SclPackage.TSUBSTATION__VOLTAGE_LEVEL:
				getVoltageLevel().clear();
				getVoltageLevel().addAll((Collection<? extends TVoltageLevel>)newValue);
				return;
			case SclPackage.TSUBSTATION__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection<? extends TFunction>)newValue);
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
			case SclPackage.TSUBSTATION__VOLTAGE_LEVEL:
				getVoltageLevel().clear();
				return;
			case SclPackage.TSUBSTATION__FUNCTION:
				getFunction().clear();
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
			case SclPackage.TSUBSTATION__VOLTAGE_LEVEL:
				return voltageLevel != null && !voltageLevel.isEmpty();
			case SclPackage.TSUBSTATION__FUNCTION:
				return function != null && !function.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TSubstationImpl
