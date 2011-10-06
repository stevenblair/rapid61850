/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TBay;
import ch.iec._61850._2006.scl.TVoltage;
import ch.iec._61850._2006.scl.TVoltageLevel;

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
 * An implementation of the model object '<em><b>TVoltage Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TVoltageLevelImpl#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TVoltageLevelImpl#getBay <em>Bay</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TVoltageLevelImpl extends TEquipmentContainerImpl implements TVoltageLevel {
	/**
	 * The cached value of the '{@link #getVoltage() <em>Voltage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage()
	 * @generated
	 * @ordered
	 */
	protected TVoltage voltage;

	/**
	 * The cached value of the '{@link #getBay() <em>Bay</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBay()
	 * @generated
	 * @ordered
	 */
	protected EList<TBay> bay;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TVoltageLevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTVoltageLevel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TVoltage getVoltage() {
		return voltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVoltage(TVoltage newVoltage, NotificationChain msgs) {
		TVoltage oldVoltage = voltage;
		voltage = newVoltage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TVOLTAGE_LEVEL__VOLTAGE, oldVoltage, newVoltage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage(TVoltage newVoltage) {
		if (newVoltage != voltage) {
			NotificationChain msgs = null;
			if (voltage != null)
				msgs = ((InternalEObject)voltage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TVOLTAGE_LEVEL__VOLTAGE, null, msgs);
			if (newVoltage != null)
				msgs = ((InternalEObject)newVoltage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TVOLTAGE_LEVEL__VOLTAGE, null, msgs);
			msgs = basicSetVoltage(newVoltage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TVOLTAGE_LEVEL__VOLTAGE, newVoltage, newVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TBay> getBay() {
		if (bay == null) {
			bay = new EObjectContainmentEList<TBay>(TBay.class, this, SclPackage.TVOLTAGE_LEVEL__BAY);
		}
		return bay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SclPackage.TVOLTAGE_LEVEL__VOLTAGE:
				return basicSetVoltage(null, msgs);
			case SclPackage.TVOLTAGE_LEVEL__BAY:
				return ((InternalEList<?>)getBay()).basicRemove(otherEnd, msgs);
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
			case SclPackage.TVOLTAGE_LEVEL__VOLTAGE:
				return getVoltage();
			case SclPackage.TVOLTAGE_LEVEL__BAY:
				return getBay();
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
			case SclPackage.TVOLTAGE_LEVEL__VOLTAGE:
				setVoltage((TVoltage)newValue);
				return;
			case SclPackage.TVOLTAGE_LEVEL__BAY:
				getBay().clear();
				getBay().addAll((Collection<? extends TBay>)newValue);
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
			case SclPackage.TVOLTAGE_LEVEL__VOLTAGE:
				setVoltage((TVoltage)null);
				return;
			case SclPackage.TVOLTAGE_LEVEL__BAY:
				getBay().clear();
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
			case SclPackage.TVOLTAGE_LEVEL__VOLTAGE:
				return voltage != null;
			case SclPackage.TVOLTAGE_LEVEL__BAY:
				return bay != null && !bay.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TVoltageLevelImpl
