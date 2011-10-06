/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TAccessPoint;
import ch.iec._61850._2006.scl.TLN;
import ch.iec._61850._2006.scl.TServer;

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
 * An implementation of the model object '<em><b>TAccess Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TAccessPointImpl#getServer <em>Server</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TAccessPointImpl#getLN <em>LN</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TAccessPointImpl#isClock <em>Clock</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TAccessPointImpl#isRouter <em>Router</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TAccessPointImpl extends TNamingImpl implements TAccessPoint {
	/**
	 * The cached value of the '{@link #getServer() <em>Server</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected TServer server;

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
	 * The default value of the '{@link #isClock() <em>Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClock()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLOCK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isClock() <em>Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClock()
	 * @generated
	 * @ordered
	 */
	protected boolean clock = CLOCK_EDEFAULT;

	/**
	 * This is true if the Clock attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean clockESet;

	/**
	 * The default value of the '{@link #isRouter() <em>Router</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRouter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ROUTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRouter() <em>Router</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRouter()
	 * @generated
	 * @ordered
	 */
	protected boolean router = ROUTER_EDEFAULT;

	/**
	 * This is true if the Router attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean routerESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TAccessPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTAccessPoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServer getServer() {
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServer(TServer newServer, NotificationChain msgs) {
		TServer oldServer = server;
		server = newServer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TACCESS_POINT__SERVER, oldServer, newServer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer(TServer newServer) {
		if (newServer != server) {
			NotificationChain msgs = null;
			if (server != null)
				msgs = ((InternalEObject)server).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TACCESS_POINT__SERVER, null, msgs);
			if (newServer != null)
				msgs = ((InternalEObject)newServer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TACCESS_POINT__SERVER, null, msgs);
			msgs = basicSetServer(newServer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TACCESS_POINT__SERVER, newServer, newServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TLN> getLN() {
		if (lN == null) {
			lN = new EObjectContainmentEList<TLN>(TLN.class, this, SclPackage.TACCESS_POINT__LN);
		}
		return lN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isClock() {
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClock(boolean newClock) {
		boolean oldClock = clock;
		clock = newClock;
		boolean oldClockESet = clockESet;
		clockESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TACCESS_POINT__CLOCK, oldClock, clock, !oldClockESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClock() {
		boolean oldClock = clock;
		boolean oldClockESet = clockESet;
		clock = CLOCK_EDEFAULT;
		clockESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TACCESS_POINT__CLOCK, oldClock, CLOCK_EDEFAULT, oldClockESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClock() {
		return clockESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRouter() {
		return router;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouter(boolean newRouter) {
		boolean oldRouter = router;
		router = newRouter;
		boolean oldRouterESet = routerESet;
		routerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TACCESS_POINT__ROUTER, oldRouter, router, !oldRouterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRouter() {
		boolean oldRouter = router;
		boolean oldRouterESet = routerESet;
		router = ROUTER_EDEFAULT;
		routerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TACCESS_POINT__ROUTER, oldRouter, ROUTER_EDEFAULT, oldRouterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRouter() {
		return routerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SclPackage.TACCESS_POINT__SERVER:
				return basicSetServer(null, msgs);
			case SclPackage.TACCESS_POINT__LN:
				return ((InternalEList<?>)getLN()).basicRemove(otherEnd, msgs);
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
			case SclPackage.TACCESS_POINT__SERVER:
				return getServer();
			case SclPackage.TACCESS_POINT__LN:
				return getLN();
			case SclPackage.TACCESS_POINT__CLOCK:
				return isClock();
			case SclPackage.TACCESS_POINT__ROUTER:
				return isRouter();
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
			case SclPackage.TACCESS_POINT__SERVER:
				setServer((TServer)newValue);
				return;
			case SclPackage.TACCESS_POINT__LN:
				getLN().clear();
				getLN().addAll((Collection<? extends TLN>)newValue);
				return;
			case SclPackage.TACCESS_POINT__CLOCK:
				setClock((Boolean)newValue);
				return;
			case SclPackage.TACCESS_POINT__ROUTER:
				setRouter((Boolean)newValue);
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
			case SclPackage.TACCESS_POINT__SERVER:
				setServer((TServer)null);
				return;
			case SclPackage.TACCESS_POINT__LN:
				getLN().clear();
				return;
			case SclPackage.TACCESS_POINT__CLOCK:
				unsetClock();
				return;
			case SclPackage.TACCESS_POINT__ROUTER:
				unsetRouter();
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
			case SclPackage.TACCESS_POINT__SERVER:
				return server != null;
			case SclPackage.TACCESS_POINT__LN:
				return lN != null && !lN.isEmpty();
			case SclPackage.TACCESS_POINT__CLOCK:
				return isSetClock();
			case SclPackage.TACCESS_POINT__ROUTER:
				return isSetRouter();
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
		result.append(" (clock: ");
		if (clockESet) result.append(clock); else result.append("<unset>");
		result.append(", router: ");
		if (routerESet) result.append(router); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TAccessPointImpl
