/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TBitRateInMbPerSec;
import ch.iec._61850._2006.scl.TConnectedAP;
import ch.iec._61850._2006.scl.TSubNetwork;

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
 * An implementation of the model object '<em><b>TSub Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TSubNetworkImpl#getBitRate <em>Bit Rate</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TSubNetworkImpl#getConnectedAP <em>Connected AP</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TSubNetworkImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TSubNetworkImpl extends TNamingImpl implements TSubNetwork {
	/**
	 * The cached value of the '{@link #getBitRate() <em>Bit Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitRate()
	 * @generated
	 * @ordered
	 */
	protected TBitRateInMbPerSec bitRate;

	/**
	 * The cached value of the '{@link #getConnectedAP() <em>Connected AP</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedAP()
	 * @generated
	 * @ordered
	 */
	protected EList<TConnectedAP> connectedAP;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TSubNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTSubNetwork();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBitRateInMbPerSec getBitRate() {
		return bitRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBitRate(TBitRateInMbPerSec newBitRate, NotificationChain msgs) {
		TBitRateInMbPerSec oldBitRate = bitRate;
		bitRate = newBitRate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TSUB_NETWORK__BIT_RATE, oldBitRate, newBitRate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitRate(TBitRateInMbPerSec newBitRate) {
		if (newBitRate != bitRate) {
			NotificationChain msgs = null;
			if (bitRate != null)
				msgs = ((InternalEObject)bitRate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSUB_NETWORK__BIT_RATE, null, msgs);
			if (newBitRate != null)
				msgs = ((InternalEObject)newBitRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSUB_NETWORK__BIT_RATE, null, msgs);
			msgs = basicSetBitRate(newBitRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSUB_NETWORK__BIT_RATE, newBitRate, newBitRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TConnectedAP> getConnectedAP() {
		if (connectedAP == null) {
			connectedAP = new EObjectContainmentEList<TConnectedAP>(TConnectedAP.class, this, SclPackage.TSUB_NETWORK__CONNECTED_AP);
		}
		return connectedAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSUB_NETWORK__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SclPackage.TSUB_NETWORK__BIT_RATE:
				return basicSetBitRate(null, msgs);
			case SclPackage.TSUB_NETWORK__CONNECTED_AP:
				return ((InternalEList<?>)getConnectedAP()).basicRemove(otherEnd, msgs);
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
			case SclPackage.TSUB_NETWORK__BIT_RATE:
				return getBitRate();
			case SclPackage.TSUB_NETWORK__CONNECTED_AP:
				return getConnectedAP();
			case SclPackage.TSUB_NETWORK__TYPE:
				return getType();
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
			case SclPackage.TSUB_NETWORK__BIT_RATE:
				setBitRate((TBitRateInMbPerSec)newValue);
				return;
			case SclPackage.TSUB_NETWORK__CONNECTED_AP:
				getConnectedAP().clear();
				getConnectedAP().addAll((Collection<? extends TConnectedAP>)newValue);
				return;
			case SclPackage.TSUB_NETWORK__TYPE:
				setType((String)newValue);
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
			case SclPackage.TSUB_NETWORK__BIT_RATE:
				setBitRate((TBitRateInMbPerSec)null);
				return;
			case SclPackage.TSUB_NETWORK__CONNECTED_AP:
				getConnectedAP().clear();
				return;
			case SclPackage.TSUB_NETWORK__TYPE:
				setType(TYPE_EDEFAULT);
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
			case SclPackage.TSUB_NETWORK__BIT_RATE:
				return bitRate != null;
			case SclPackage.TSUB_NETWORK__CONNECTED_AP:
				return connectedAP != null && !connectedAP.isEmpty();
			case SclPackage.TSUB_NETWORK__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //TSubNetworkImpl
