/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TAccessPoint;
import ch.iec._61850._2006.scl.TIED;
import ch.iec._61850._2006.scl.TServices;

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
 * An implementation of the model object '<em><b>TIED</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TIEDImpl#getServices <em>Services</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TIEDImpl#getAccessPoint <em>Access Point</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TIEDImpl#getConfigVersion <em>Config Version</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TIEDImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TIEDImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TIEDImpl extends TNamingImpl implements TIED {
	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected TServices services;

	/**
	 * The cached value of the '{@link #getAccessPoint() <em>Access Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<TAccessPoint> accessPoint;

	/**
	 * The default value of the '{@link #getConfigVersion() <em>Config Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigVersion() <em>Config Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigVersion()
	 * @generated
	 * @ordered
	 */
	protected String configVersion = CONFIG_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected static final String MANUFACTURER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected String manufacturer = MANUFACTURER_EDEFAULT;

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
	protected TIEDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTIED();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServices getServices() {
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServices(TServices newServices, NotificationChain msgs) {
		TServices oldServices = services;
		services = newServices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TIED__SERVICES, oldServices, newServices);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServices(TServices newServices) {
		if (newServices != services) {
			NotificationChain msgs = null;
			if (services != null)
				msgs = ((InternalEObject)services).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TIED__SERVICES, null, msgs);
			if (newServices != null)
				msgs = ((InternalEObject)newServices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TIED__SERVICES, null, msgs);
			msgs = basicSetServices(newServices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TIED__SERVICES, newServices, newServices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TAccessPoint> getAccessPoint() {
		if (accessPoint == null) {
			accessPoint = new EObjectContainmentEList<TAccessPoint>(TAccessPoint.class, this, SclPackage.TIED__ACCESS_POINT);
		}
		return accessPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigVersion() {
		return configVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigVersion(String newConfigVersion) {
		String oldConfigVersion = configVersion;
		configVersion = newConfigVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TIED__CONFIG_VERSION, oldConfigVersion, configVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturer(String newManufacturer) {
		String oldManufacturer = manufacturer;
		manufacturer = newManufacturer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TIED__MANUFACTURER, oldManufacturer, manufacturer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TIED__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SclPackage.TIED__SERVICES:
				return basicSetServices(null, msgs);
			case SclPackage.TIED__ACCESS_POINT:
				return ((InternalEList<?>)getAccessPoint()).basicRemove(otherEnd, msgs);
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
			case SclPackage.TIED__SERVICES:
				return getServices();
			case SclPackage.TIED__ACCESS_POINT:
				return getAccessPoint();
			case SclPackage.TIED__CONFIG_VERSION:
				return getConfigVersion();
			case SclPackage.TIED__MANUFACTURER:
				return getManufacturer();
			case SclPackage.TIED__TYPE:
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
			case SclPackage.TIED__SERVICES:
				setServices((TServices)newValue);
				return;
			case SclPackage.TIED__ACCESS_POINT:
				getAccessPoint().clear();
				getAccessPoint().addAll((Collection<? extends TAccessPoint>)newValue);
				return;
			case SclPackage.TIED__CONFIG_VERSION:
				setConfigVersion((String)newValue);
				return;
			case SclPackage.TIED__MANUFACTURER:
				setManufacturer((String)newValue);
				return;
			case SclPackage.TIED__TYPE:
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
			case SclPackage.TIED__SERVICES:
				setServices((TServices)null);
				return;
			case SclPackage.TIED__ACCESS_POINT:
				getAccessPoint().clear();
				return;
			case SclPackage.TIED__CONFIG_VERSION:
				setConfigVersion(CONFIG_VERSION_EDEFAULT);
				return;
			case SclPackage.TIED__MANUFACTURER:
				setManufacturer(MANUFACTURER_EDEFAULT);
				return;
			case SclPackage.TIED__TYPE:
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
			case SclPackage.TIED__SERVICES:
				return services != null;
			case SclPackage.TIED__ACCESS_POINT:
				return accessPoint != null && !accessPoint.isEmpty();
			case SclPackage.TIED__CONFIG_VERSION:
				return CONFIG_VERSION_EDEFAULT == null ? configVersion != null : !CONFIG_VERSION_EDEFAULT.equals(configVersion);
			case SclPackage.TIED__MANUFACTURER:
				return MANUFACTURER_EDEFAULT == null ? manufacturer != null : !MANUFACTURER_EDEFAULT.equals(manufacturer);
			case SclPackage.TIED__TYPE:
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
		result.append(" (configVersion: ");
		result.append(configVersion);
		result.append(", manufacturer: ");
		result.append(manufacturer);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //TIEDImpl
