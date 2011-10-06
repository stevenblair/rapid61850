/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.LN0Type;
import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TAccessControl;
import ch.iec._61850._2006.scl.TLDevice;
import ch.iec._61850._2006.scl.TLN;

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
 * An implementation of the model object '<em><b>TL Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TLDeviceImpl#getLN0 <em>LN0</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TLDeviceImpl#getLN <em>LN</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TLDeviceImpl#getAccessControl <em>Access Control</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TLDeviceImpl#getInst <em>Inst</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TLDeviceImpl#getLdName <em>Ld Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TLDeviceImpl extends TUnNamingImpl implements TLDevice {
	/**
	 * The cached value of the '{@link #getLN0() <em>LN0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLN0()
	 * @generated
	 * @ordered
	 */
	protected LN0Type lN0;

	/**
	 * The cached value of the '{@link #getLN() <em>LN</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLN()
	 * @generated
	 * @ordered
	 */
	protected EList<TLN> lN;

	/**
	 * The cached value of the '{@link #getAccessControl() <em>Access Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessControl()
	 * @generated
	 * @ordered
	 */
	protected TAccessControl accessControl;

	/**
	 * The default value of the '{@link #getInst() <em>Inst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInst()
	 * @generated
	 * @ordered
	 */
	protected static final String INST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInst() <em>Inst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInst()
	 * @generated
	 * @ordered
	 */
	protected String inst = INST_EDEFAULT;

	/**
	 * The default value of the '{@link #getLdName() <em>Ld Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLdName()
	 * @generated
	 * @ordered
	 */
	protected static final String LD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLdName() <em>Ld Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLdName()
	 * @generated
	 * @ordered
	 */
	protected String ldName = LD_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TLDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTLDevice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LN0Type getLN0() {
		return lN0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLN0(LN0Type newLN0, NotificationChain msgs) {
		LN0Type oldLN0 = lN0;
		lN0 = newLN0;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TL_DEVICE__LN0, oldLN0, newLN0);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLN0(LN0Type newLN0) {
		if (newLN0 != lN0) {
			NotificationChain msgs = null;
			if (lN0 != null)
				msgs = ((InternalEObject)lN0).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TL_DEVICE__LN0, null, msgs);
			if (newLN0 != null)
				msgs = ((InternalEObject)newLN0).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TL_DEVICE__LN0, null, msgs);
			msgs = basicSetLN0(newLN0, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TL_DEVICE__LN0, newLN0, newLN0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TLN> getLN() {
		if (lN == null) {
			lN = new EObjectContainmentEList<TLN>(TLN.class, this, SclPackage.TL_DEVICE__LN);
		}
		return lN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAccessControl getAccessControl() {
		return accessControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccessControl(TAccessControl newAccessControl, NotificationChain msgs) {
		TAccessControl oldAccessControl = accessControl;
		accessControl = newAccessControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TL_DEVICE__ACCESS_CONTROL, oldAccessControl, newAccessControl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessControl(TAccessControl newAccessControl) {
		if (newAccessControl != accessControl) {
			NotificationChain msgs = null;
			if (accessControl != null)
				msgs = ((InternalEObject)accessControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TL_DEVICE__ACCESS_CONTROL, null, msgs);
			if (newAccessControl != null)
				msgs = ((InternalEObject)newAccessControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TL_DEVICE__ACCESS_CONTROL, null, msgs);
			msgs = basicSetAccessControl(newAccessControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TL_DEVICE__ACCESS_CONTROL, newAccessControl, newAccessControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInst() {
		return inst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInst(String newInst) {
		String oldInst = inst;
		inst = newInst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TL_DEVICE__INST, oldInst, inst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLdName() {
		return ldName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLdName(String newLdName) {
		String oldLdName = ldName;
		ldName = newLdName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TL_DEVICE__LD_NAME, oldLdName, ldName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SclPackage.TL_DEVICE__LN0:
				return basicSetLN0(null, msgs);
			case SclPackage.TL_DEVICE__LN:
				return ((InternalEList<?>)getLN()).basicRemove(otherEnd, msgs);
			case SclPackage.TL_DEVICE__ACCESS_CONTROL:
				return basicSetAccessControl(null, msgs);
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
			case SclPackage.TL_DEVICE__LN0:
				return getLN0();
			case SclPackage.TL_DEVICE__LN:
				return getLN();
			case SclPackage.TL_DEVICE__ACCESS_CONTROL:
				return getAccessControl();
			case SclPackage.TL_DEVICE__INST:
				return getInst();
			case SclPackage.TL_DEVICE__LD_NAME:
				return getLdName();
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
			case SclPackage.TL_DEVICE__LN0:
				setLN0((LN0Type)newValue);
				return;
			case SclPackage.TL_DEVICE__LN:
				getLN().clear();
				getLN().addAll((Collection<? extends TLN>)newValue);
				return;
			case SclPackage.TL_DEVICE__ACCESS_CONTROL:
				setAccessControl((TAccessControl)newValue);
				return;
			case SclPackage.TL_DEVICE__INST:
				setInst((String)newValue);
				return;
			case SclPackage.TL_DEVICE__LD_NAME:
				setLdName((String)newValue);
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
			case SclPackage.TL_DEVICE__LN0:
				setLN0((LN0Type)null);
				return;
			case SclPackage.TL_DEVICE__LN:
				getLN().clear();
				return;
			case SclPackage.TL_DEVICE__ACCESS_CONTROL:
				setAccessControl((TAccessControl)null);
				return;
			case SclPackage.TL_DEVICE__INST:
				setInst(INST_EDEFAULT);
				return;
			case SclPackage.TL_DEVICE__LD_NAME:
				setLdName(LD_NAME_EDEFAULT);
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
			case SclPackage.TL_DEVICE__LN0:
				return lN0 != null;
			case SclPackage.TL_DEVICE__LN:
				return lN != null && !lN.isEmpty();
			case SclPackage.TL_DEVICE__ACCESS_CONTROL:
				return accessControl != null;
			case SclPackage.TL_DEVICE__INST:
				return INST_EDEFAULT == null ? inst != null : !INST_EDEFAULT.equals(inst);
			case SclPackage.TL_DEVICE__LD_NAME:
				return LD_NAME_EDEFAULT == null ? ldName != null : !LD_NAME_EDEFAULT.equals(ldName);
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
		result.append(" (inst: ");
		result.append(inst);
		result.append(", ldName: ");
		result.append(ldName);
		result.append(')');
		return result.toString();
	}

} //TLDeviceImpl
