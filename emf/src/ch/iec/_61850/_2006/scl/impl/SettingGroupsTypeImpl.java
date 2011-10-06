/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.SettingGroupsType;
import ch.iec._61850._2006.scl.TServiceYesNo;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Setting Groups Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.SettingGroupsTypeImpl#getSGEdit <em>SG Edit</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.SettingGroupsTypeImpl#getConfSG <em>Conf SG</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SettingGroupsTypeImpl extends EObjectImpl implements SettingGroupsType {
	/**
	 * The cached value of the '{@link #getSGEdit() <em>SG Edit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSGEdit()
	 * @generated
	 * @ordered
	 */
	protected TServiceYesNo sGEdit;

	/**
	 * The cached value of the '{@link #getConfSG() <em>Conf SG</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfSG()
	 * @generated
	 * @ordered
	 */
	protected TServiceYesNo confSG;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SettingGroupsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getSettingGroupsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceYesNo getSGEdit() {
		return sGEdit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSGEdit(TServiceYesNo newSGEdit, NotificationChain msgs) {
		TServiceYesNo oldSGEdit = sGEdit;
		sGEdit = newSGEdit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SETTING_GROUPS_TYPE__SG_EDIT, oldSGEdit, newSGEdit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSGEdit(TServiceYesNo newSGEdit) {
		if (newSGEdit != sGEdit) {
			NotificationChain msgs = null;
			if (sGEdit != null)
				msgs = ((InternalEObject)sGEdit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SETTING_GROUPS_TYPE__SG_EDIT, null, msgs);
			if (newSGEdit != null)
				msgs = ((InternalEObject)newSGEdit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.SETTING_GROUPS_TYPE__SG_EDIT, null, msgs);
			msgs = basicSetSGEdit(newSGEdit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SETTING_GROUPS_TYPE__SG_EDIT, newSGEdit, newSGEdit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceYesNo getConfSG() {
		return confSG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfSG(TServiceYesNo newConfSG, NotificationChain msgs) {
		TServiceYesNo oldConfSG = confSG;
		confSG = newConfSG;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SETTING_GROUPS_TYPE__CONF_SG, oldConfSG, newConfSG);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfSG(TServiceYesNo newConfSG) {
		if (newConfSG != confSG) {
			NotificationChain msgs = null;
			if (confSG != null)
				msgs = ((InternalEObject)confSG).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SETTING_GROUPS_TYPE__CONF_SG, null, msgs);
			if (newConfSG != null)
				msgs = ((InternalEObject)newConfSG).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.SETTING_GROUPS_TYPE__CONF_SG, null, msgs);
			msgs = basicSetConfSG(newConfSG, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SETTING_GROUPS_TYPE__CONF_SG, newConfSG, newConfSG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SclPackage.SETTING_GROUPS_TYPE__SG_EDIT:
				return basicSetSGEdit(null, msgs);
			case SclPackage.SETTING_GROUPS_TYPE__CONF_SG:
				return basicSetConfSG(null, msgs);
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
			case SclPackage.SETTING_GROUPS_TYPE__SG_EDIT:
				return getSGEdit();
			case SclPackage.SETTING_GROUPS_TYPE__CONF_SG:
				return getConfSG();
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
			case SclPackage.SETTING_GROUPS_TYPE__SG_EDIT:
				setSGEdit((TServiceYesNo)newValue);
				return;
			case SclPackage.SETTING_GROUPS_TYPE__CONF_SG:
				setConfSG((TServiceYesNo)newValue);
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
			case SclPackage.SETTING_GROUPS_TYPE__SG_EDIT:
				setSGEdit((TServiceYesNo)null);
				return;
			case SclPackage.SETTING_GROUPS_TYPE__CONF_SG:
				setConfSG((TServiceYesNo)null);
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
			case SclPackage.SETTING_GROUPS_TYPE__SG_EDIT:
				return sGEdit != null;
			case SclPackage.SETTING_GROUPS_TYPE__CONF_SG:
				return confSG != null;
		}
		return super.eIsSet(featureID);
	}

} //SettingGroupsTypeImpl
