/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TBay;
import ch.iec._61850._2006.scl.TConductingEquipment;
import ch.iec._61850._2006.scl.TConnectivityNode;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TBay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TBayImpl#getConductingEquipment <em>Conducting Equipment</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TBayImpl#getConnectivityNode <em>Connectivity Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TBayImpl extends TEquipmentContainerImpl implements TBay {
	/**
	 * The cached value of the '{@link #getConductingEquipment() <em>Conducting Equipment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductingEquipment()
	 * @generated
	 * @ordered
	 */
	protected EList<TConductingEquipment> conductingEquipment;

	/**
	 * The cached value of the '{@link #getConnectivityNode() <em>Connectivity Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivityNode()
	 * @generated
	 * @ordered
	 */
	protected EList<TConnectivityNode> connectivityNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TBayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTBay();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TConductingEquipment> getConductingEquipment() {
		if (conductingEquipment == null) {
			conductingEquipment = new EObjectContainmentEList<TConductingEquipment>(TConductingEquipment.class, this, SclPackage.TBAY__CONDUCTING_EQUIPMENT);
		}
		return conductingEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TConnectivityNode> getConnectivityNode() {
		if (connectivityNode == null) {
			connectivityNode = new EObjectContainmentEList<TConnectivityNode>(TConnectivityNode.class, this, SclPackage.TBAY__CONNECTIVITY_NODE);
		}
		return connectivityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SclPackage.TBAY__CONDUCTING_EQUIPMENT:
				return ((InternalEList<?>)getConductingEquipment()).basicRemove(otherEnd, msgs);
			case SclPackage.TBAY__CONNECTIVITY_NODE:
				return ((InternalEList<?>)getConnectivityNode()).basicRemove(otherEnd, msgs);
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
			case SclPackage.TBAY__CONDUCTING_EQUIPMENT:
				return getConductingEquipment();
			case SclPackage.TBAY__CONNECTIVITY_NODE:
				return getConnectivityNode();
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
			case SclPackage.TBAY__CONDUCTING_EQUIPMENT:
				getConductingEquipment().clear();
				getConductingEquipment().addAll((Collection<? extends TConductingEquipment>)newValue);
				return;
			case SclPackage.TBAY__CONNECTIVITY_NODE:
				getConnectivityNode().clear();
				getConnectivityNode().addAll((Collection<? extends TConnectivityNode>)newValue);
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
			case SclPackage.TBAY__CONDUCTING_EQUIPMENT:
				getConductingEquipment().clear();
				return;
			case SclPackage.TBAY__CONNECTIVITY_NODE:
				getConnectivityNode().clear();
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
			case SclPackage.TBAY__CONDUCTING_EQUIPMENT:
				return conductingEquipment != null && !conductingEquipment.isEmpty();
			case SclPackage.TBAY__CONNECTIVITY_NODE:
				return connectivityNode != null && !connectivityNode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TBayImpl
