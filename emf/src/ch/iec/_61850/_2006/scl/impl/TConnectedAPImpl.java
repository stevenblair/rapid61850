/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TAddress;
import ch.iec._61850._2006.scl.TConnectedAP;
import ch.iec._61850._2006.scl.TGSE;
import ch.iec._61850._2006.scl.TPhysConn;
import ch.iec._61850._2006.scl.TSMV;

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
 * An implementation of the model object '<em><b>TConnected AP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TConnectedAPImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TConnectedAPImpl#getGSE <em>GSE</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TConnectedAPImpl#getSMV <em>SMV</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TConnectedAPImpl#getPhysConn <em>Phys Conn</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TConnectedAPImpl#getApName <em>Ap Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TConnectedAPImpl#getIedName <em>Ied Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TConnectedAPImpl extends TUnNamingImpl implements TConnectedAP {
	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected TAddress address;

	/**
	 * The cached value of the '{@link #getGSE() <em>GSE</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGSE()
	 * @generated
	 * @ordered
	 */
	protected EList<TGSE> gSE;

	/**
	 * The cached value of the '{@link #getSMV() <em>SMV</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSMV()
	 * @generated
	 * @ordered
	 */
	protected EList<TSMV> sMV;

	/**
	 * The cached value of the '{@link #getPhysConn() <em>Phys Conn</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysConn()
	 * @generated
	 * @ordered
	 */
	protected EList<TPhysConn> physConn;

	/**
	 * The default value of the '{@link #getApName() <em>Ap Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApName()
	 * @generated
	 * @ordered
	 */
	protected static final String AP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApName() <em>Ap Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApName()
	 * @generated
	 * @ordered
	 */
	protected String apName = AP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIedName() <em>Ied Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIedName()
	 * @generated
	 * @ordered
	 */
	protected static final String IED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIedName() <em>Ied Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIedName()
	 * @generated
	 * @ordered
	 */
	protected String iedName = IED_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TConnectedAPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTConnectedAP();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAddress getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(TAddress newAddress, NotificationChain msgs) {
		TAddress oldAddress = address;
		address = newAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TCONNECTED_AP__ADDRESS, oldAddress, newAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(TAddress newAddress) {
		if (newAddress != address) {
			NotificationChain msgs = null;
			if (address != null)
				msgs = ((InternalEObject)address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TCONNECTED_AP__ADDRESS, null, msgs);
			if (newAddress != null)
				msgs = ((InternalEObject)newAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TCONNECTED_AP__ADDRESS, null, msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TCONNECTED_AP__ADDRESS, newAddress, newAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TGSE> getGSE() {
		if (gSE == null) {
			gSE = new EObjectContainmentEList<TGSE>(TGSE.class, this, SclPackage.TCONNECTED_AP__GSE);
		}
		return gSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TSMV> getSMV() {
		if (sMV == null) {
			sMV = new EObjectContainmentEList<TSMV>(TSMV.class, this, SclPackage.TCONNECTED_AP__SMV);
		}
		return sMV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TPhysConn> getPhysConn() {
		if (physConn == null) {
			physConn = new EObjectContainmentEList<TPhysConn>(TPhysConn.class, this, SclPackage.TCONNECTED_AP__PHYS_CONN);
		}
		return physConn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApName() {
		return apName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApName(String newApName) {
		String oldApName = apName;
		apName = newApName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TCONNECTED_AP__AP_NAME, oldApName, apName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIedName() {
		return iedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIedName(String newIedName) {
		String oldIedName = iedName;
		iedName = newIedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TCONNECTED_AP__IED_NAME, oldIedName, iedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SclPackage.TCONNECTED_AP__ADDRESS:
				return basicSetAddress(null, msgs);
			case SclPackage.TCONNECTED_AP__GSE:
				return ((InternalEList<?>)getGSE()).basicRemove(otherEnd, msgs);
			case SclPackage.TCONNECTED_AP__SMV:
				return ((InternalEList<?>)getSMV()).basicRemove(otherEnd, msgs);
			case SclPackage.TCONNECTED_AP__PHYS_CONN:
				return ((InternalEList<?>)getPhysConn()).basicRemove(otherEnd, msgs);
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
			case SclPackage.TCONNECTED_AP__ADDRESS:
				return getAddress();
			case SclPackage.TCONNECTED_AP__GSE:
				return getGSE();
			case SclPackage.TCONNECTED_AP__SMV:
				return getSMV();
			case SclPackage.TCONNECTED_AP__PHYS_CONN:
				return getPhysConn();
			case SclPackage.TCONNECTED_AP__AP_NAME:
				return getApName();
			case SclPackage.TCONNECTED_AP__IED_NAME:
				return getIedName();
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
			case SclPackage.TCONNECTED_AP__ADDRESS:
				setAddress((TAddress)newValue);
				return;
			case SclPackage.TCONNECTED_AP__GSE:
				getGSE().clear();
				getGSE().addAll((Collection<? extends TGSE>)newValue);
				return;
			case SclPackage.TCONNECTED_AP__SMV:
				getSMV().clear();
				getSMV().addAll((Collection<? extends TSMV>)newValue);
				return;
			case SclPackage.TCONNECTED_AP__PHYS_CONN:
				getPhysConn().clear();
				getPhysConn().addAll((Collection<? extends TPhysConn>)newValue);
				return;
			case SclPackage.TCONNECTED_AP__AP_NAME:
				setApName((String)newValue);
				return;
			case SclPackage.TCONNECTED_AP__IED_NAME:
				setIedName((String)newValue);
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
			case SclPackage.TCONNECTED_AP__ADDRESS:
				setAddress((TAddress)null);
				return;
			case SclPackage.TCONNECTED_AP__GSE:
				getGSE().clear();
				return;
			case SclPackage.TCONNECTED_AP__SMV:
				getSMV().clear();
				return;
			case SclPackage.TCONNECTED_AP__PHYS_CONN:
				getPhysConn().clear();
				return;
			case SclPackage.TCONNECTED_AP__AP_NAME:
				setApName(AP_NAME_EDEFAULT);
				return;
			case SclPackage.TCONNECTED_AP__IED_NAME:
				setIedName(IED_NAME_EDEFAULT);
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
			case SclPackage.TCONNECTED_AP__ADDRESS:
				return address != null;
			case SclPackage.TCONNECTED_AP__GSE:
				return gSE != null && !gSE.isEmpty();
			case SclPackage.TCONNECTED_AP__SMV:
				return sMV != null && !sMV.isEmpty();
			case SclPackage.TCONNECTED_AP__PHYS_CONN:
				return physConn != null && !physConn.isEmpty();
			case SclPackage.TCONNECTED_AP__AP_NAME:
				return AP_NAME_EDEFAULT == null ? apName != null : !AP_NAME_EDEFAULT.equals(apName);
			case SclPackage.TCONNECTED_AP__IED_NAME:
				return IED_NAME_EDEFAULT == null ? iedName != null : !IED_NAME_EDEFAULT.equals(iedName);
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
		result.append(" (apName: ");
		result.append(apName);
		result.append(", iedName: ");
		result.append(iedName);
		result.append(')');
		return result.toString();
	}

} //TConnectedAPImpl
