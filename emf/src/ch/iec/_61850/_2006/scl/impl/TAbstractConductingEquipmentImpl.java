/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TAbstractConductingEquipment;
import ch.iec._61850._2006.scl.TSubEquipment;
import ch.iec._61850._2006.scl.TTerminal;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TAbstract Conducting Equipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TAbstractConductingEquipmentImpl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TAbstractConductingEquipmentImpl#getSubEquipment <em>Sub Equipment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TAbstractConductingEquipmentImpl extends TEquipmentImpl implements TAbstractConductingEquipment {
	/**
	 * The cached value of the '{@link #getTerminal() <em>Terminal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminal()
	 * @generated
	 * @ordered
	 */
	protected EList<TTerminal> terminal;

	/**
	 * The cached value of the '{@link #getSubEquipment() <em>Sub Equipment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubEquipment()
	 * @generated
	 * @ordered
	 */
	protected EList<TSubEquipment> subEquipment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TAbstractConductingEquipmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTAbstractConductingEquipment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TTerminal> getTerminal() {
		if (terminal == null) {
			terminal = new EObjectContainmentEList<TTerminal>(TTerminal.class, this, SclPackage.TABSTRACT_CONDUCTING_EQUIPMENT__TERMINAL);
		}
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TSubEquipment> getSubEquipment() {
		if (subEquipment == null) {
			subEquipment = new EObjectContainmentEList<TSubEquipment>(TSubEquipment.class, this, SclPackage.TABSTRACT_CONDUCTING_EQUIPMENT__SUB_EQUIPMENT);
		}
		return subEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SclPackage.TABSTRACT_CONDUCTING_EQUIPMENT__TERMINAL:
				return ((InternalEList<?>)getTerminal()).basicRemove(otherEnd, msgs);
			case SclPackage.TABSTRACT_CONDUCTING_EQUIPMENT__SUB_EQUIPMENT:
				return ((InternalEList<?>)getSubEquipment()).basicRemove(otherEnd, msgs);
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
			case SclPackage.TABSTRACT_CONDUCTING_EQUIPMENT__TERMINAL:
				return getTerminal();
			case SclPackage.TABSTRACT_CONDUCTING_EQUIPMENT__SUB_EQUIPMENT:
				return getSubEquipment();
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
			case SclPackage.TABSTRACT_CONDUCTING_EQUIPMENT__TERMINAL:
				getTerminal().clear();
				getTerminal().addAll((Collection<? extends TTerminal>)newValue);
				return;
			case SclPackage.TABSTRACT_CONDUCTING_EQUIPMENT__SUB_EQUIPMENT:
				getSubEquipment().clear();
				getSubEquipment().addAll((Collection<? extends TSubEquipment>)newValue);
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
			case SclPackage.TABSTRACT_CONDUCTING_EQUIPMENT__TERMINAL:
				getTerminal().clear();
				return;
			case SclPackage.TABSTRACT_CONDUCTING_EQUIPMENT__SUB_EQUIPMENT:
				getSubEquipment().clear();
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
			case SclPackage.TABSTRACT_CONDUCTING_EQUIPMENT__TERMINAL:
				return terminal != null && !terminal.isEmpty();
			case SclPackage.TABSTRACT_CONDUCTING_EQUIPMENT__SUB_EQUIPMENT:
				return subEquipment != null && !subEquipment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TAbstractConductingEquipmentImpl
