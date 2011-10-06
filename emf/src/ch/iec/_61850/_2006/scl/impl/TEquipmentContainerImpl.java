/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TEquipmentContainer;
import ch.iec._61850._2006.scl.TGeneralEquipment;
import ch.iec._61850._2006.scl.TPowerTransformer;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TEquipment Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TEquipmentContainerImpl#getPowerTransformer <em>Power Transformer</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TEquipmentContainerImpl#getGeneralEquipment <em>General Equipment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TEquipmentContainerImpl extends TPowerSystemResourceImpl implements TEquipmentContainer {
	/**
	 * The cached value of the '{@link #getPowerTransformer() <em>Power Transformer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerTransformer()
	 * @generated
	 * @ordered
	 */
	protected EList<TPowerTransformer> powerTransformer;

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
	protected TEquipmentContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTEquipmentContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TPowerTransformer> getPowerTransformer() {
		if (powerTransformer == null) {
			powerTransformer = new EObjectContainmentEList<TPowerTransformer>(TPowerTransformer.class, this, SclPackage.TEQUIPMENT_CONTAINER__POWER_TRANSFORMER);
		}
		return powerTransformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TGeneralEquipment> getGeneralEquipment() {
		if (generalEquipment == null) {
			generalEquipment = new EObjectContainmentEList<TGeneralEquipment>(TGeneralEquipment.class, this, SclPackage.TEQUIPMENT_CONTAINER__GENERAL_EQUIPMENT);
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
			case SclPackage.TEQUIPMENT_CONTAINER__POWER_TRANSFORMER:
				return ((InternalEList<?>)getPowerTransformer()).basicRemove(otherEnd, msgs);
			case SclPackage.TEQUIPMENT_CONTAINER__GENERAL_EQUIPMENT:
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
			case SclPackage.TEQUIPMENT_CONTAINER__POWER_TRANSFORMER:
				return getPowerTransformer();
			case SclPackage.TEQUIPMENT_CONTAINER__GENERAL_EQUIPMENT:
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
			case SclPackage.TEQUIPMENT_CONTAINER__POWER_TRANSFORMER:
				getPowerTransformer().clear();
				getPowerTransformer().addAll((Collection<? extends TPowerTransformer>)newValue);
				return;
			case SclPackage.TEQUIPMENT_CONTAINER__GENERAL_EQUIPMENT:
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
			case SclPackage.TEQUIPMENT_CONTAINER__POWER_TRANSFORMER:
				getPowerTransformer().clear();
				return;
			case SclPackage.TEQUIPMENT_CONTAINER__GENERAL_EQUIPMENT:
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
			case SclPackage.TEQUIPMENT_CONTAINER__POWER_TRANSFORMER:
				return powerTransformer != null && !powerTransformer.isEmpty();
			case SclPackage.TEQUIPMENT_CONTAINER__GENERAL_EQUIPMENT:
				return generalEquipment != null && !generalEquipment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TEquipmentContainerImpl
