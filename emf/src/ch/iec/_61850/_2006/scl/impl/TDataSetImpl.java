/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TControl;
import ch.iec._61850._2006.scl.TDataSet;
import ch.iec._61850._2006.scl.TExtRef;
import ch.iec._61850._2006.scl.TFCCB;
import ch.iec._61850._2006.scl.TFCDA;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TData Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TDataSetImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TDataSetImpl#getFCDA <em>FCDA</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TDataSetImpl#getFCCB <em>FCCB</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TDataSetImpl#getControl <em>Control</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TDataSetImpl#getExtRef <em>Ext Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TDataSetImpl extends TNamingImpl implements TDataSet {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The cached value of the '{@link #getControl() <em>Control</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl()
	 * @generated
	 * @ordered
	 */
	protected EList<TControl> control;

	/**
	 * The cached value of the '{@link #getExtRef() <em>Ext Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtRef()
	 * @generated
	 * @ordered
	 */
	protected EList<TExtRef> extRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TDataSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTDataSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, SclPackage.TDATA_SET__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TFCDA> getFCDA() {
		return getGroup().list(SclPackage.eINSTANCE.getTDataSet_FCDA());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TFCCB> getFCCB() {
		return getGroup().list(SclPackage.eINSTANCE.getTDataSet_FCCB());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TControl> getControl() {
		if (control == null) {
			control = new EObjectWithInverseResolvingEList<TControl>(TControl.class, this, SclPackage.TDATA_SET__CONTROL, SclPackage.TCONTROL__DATA_SET_REF);
		}
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TExtRef> getExtRef() {
		if (extRef == null) {
			extRef = new EObjectWithInverseResolvingEList<TExtRef>(TExtRef.class, this, SclPackage.TDATA_SET__EXT_REF, SclPackage.TEXT_REF__DATA_SET);
		}
		return extRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SclPackage.TDATA_SET__CONTROL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControl()).basicAdd(otherEnd, msgs);
			case SclPackage.TDATA_SET__EXT_REF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtRef()).basicAdd(otherEnd, msgs);
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
			case SclPackage.TDATA_SET__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case SclPackage.TDATA_SET__FCDA:
				return ((InternalEList<?>)getFCDA()).basicRemove(otherEnd, msgs);
			case SclPackage.TDATA_SET__FCCB:
				return ((InternalEList<?>)getFCCB()).basicRemove(otherEnd, msgs);
			case SclPackage.TDATA_SET__CONTROL:
				return ((InternalEList<?>)getControl()).basicRemove(otherEnd, msgs);
			case SclPackage.TDATA_SET__EXT_REF:
				return ((InternalEList<?>)getExtRef()).basicRemove(otherEnd, msgs);
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
			case SclPackage.TDATA_SET__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case SclPackage.TDATA_SET__FCDA:
				return getFCDA();
			case SclPackage.TDATA_SET__FCCB:
				return getFCCB();
			case SclPackage.TDATA_SET__CONTROL:
				return getControl();
			case SclPackage.TDATA_SET__EXT_REF:
				return getExtRef();
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
			case SclPackage.TDATA_SET__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case SclPackage.TDATA_SET__FCDA:
				getFCDA().clear();
				getFCDA().addAll((Collection<? extends TFCDA>)newValue);
				return;
			case SclPackage.TDATA_SET__FCCB:
				getFCCB().clear();
				getFCCB().addAll((Collection<? extends TFCCB>)newValue);
				return;
			case SclPackage.TDATA_SET__CONTROL:
				getControl().clear();
				getControl().addAll((Collection<? extends TControl>)newValue);
				return;
			case SclPackage.TDATA_SET__EXT_REF:
				getExtRef().clear();
				getExtRef().addAll((Collection<? extends TExtRef>)newValue);
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
			case SclPackage.TDATA_SET__GROUP:
				getGroup().clear();
				return;
			case SclPackage.TDATA_SET__FCDA:
				getFCDA().clear();
				return;
			case SclPackage.TDATA_SET__FCCB:
				getFCCB().clear();
				return;
			case SclPackage.TDATA_SET__CONTROL:
				getControl().clear();
				return;
			case SclPackage.TDATA_SET__EXT_REF:
				getExtRef().clear();
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
			case SclPackage.TDATA_SET__GROUP:
				return group != null && !group.isEmpty();
			case SclPackage.TDATA_SET__FCDA:
				return !getFCDA().isEmpty();
			case SclPackage.TDATA_SET__FCCB:
				return !getFCCB().isEmpty();
			case SclPackage.TDATA_SET__CONTROL:
				return control != null && !control.isEmpty();
			case SclPackage.TDATA_SET__EXT_REF:
				return extRef != null && !extRef.isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //TDataSetImpl
