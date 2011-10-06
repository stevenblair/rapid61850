/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.THitem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>THitem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.THitemImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.THitemImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.THitemImpl#getWhat <em>What</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.THitemImpl#getWhen <em>When</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.THitemImpl#getWho <em>Who</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.THitemImpl#getWhy <em>Why</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class THitemImpl extends TAnyContentFromOtherNamespaceImpl implements THitem {
	/**
	 * The default value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected static final String REVISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected String revision = REVISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getWhat() <em>What</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhat()
	 * @generated
	 * @ordered
	 */
	protected static final String WHAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhat() <em>What</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhat()
	 * @generated
	 * @ordered
	 */
	protected String what = WHAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWhen() <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected static final String WHEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected String when = WHEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getWho() <em>Who</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWho()
	 * @generated
	 * @ordered
	 */
	protected static final String WHO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWho() <em>Who</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWho()
	 * @generated
	 * @ordered
	 */
	protected String who = WHO_EDEFAULT;

	/**
	 * The default value of the '{@link #getWhy() <em>Why</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhy()
	 * @generated
	 * @ordered
	 */
	protected static final String WHY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhy() <em>Why</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhy()
	 * @generated
	 * @ordered
	 */
	protected String why = WHY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected THitemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTHitem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRevision() {
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevision(String newRevision) {
		String oldRevision = revision;
		revision = newRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.THITEM__REVISION, oldRevision, revision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.THITEM__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWhat() {
		return what;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhat(String newWhat) {
		String oldWhat = what;
		what = newWhat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.THITEM__WHAT, oldWhat, what));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWhen() {
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhen(String newWhen) {
		String oldWhen = when;
		when = newWhen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.THITEM__WHEN, oldWhen, when));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWho() {
		return who;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWho(String newWho) {
		String oldWho = who;
		who = newWho;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.THITEM__WHO, oldWho, who));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWhy() {
		return why;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhy(String newWhy) {
		String oldWhy = why;
		why = newWhy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.THITEM__WHY, oldWhy, why));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SclPackage.THITEM__REVISION:
				return getRevision();
			case SclPackage.THITEM__VERSION:
				return getVersion();
			case SclPackage.THITEM__WHAT:
				return getWhat();
			case SclPackage.THITEM__WHEN:
				return getWhen();
			case SclPackage.THITEM__WHO:
				return getWho();
			case SclPackage.THITEM__WHY:
				return getWhy();
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
			case SclPackage.THITEM__REVISION:
				setRevision((String)newValue);
				return;
			case SclPackage.THITEM__VERSION:
				setVersion((String)newValue);
				return;
			case SclPackage.THITEM__WHAT:
				setWhat((String)newValue);
				return;
			case SclPackage.THITEM__WHEN:
				setWhen((String)newValue);
				return;
			case SclPackage.THITEM__WHO:
				setWho((String)newValue);
				return;
			case SclPackage.THITEM__WHY:
				setWhy((String)newValue);
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
			case SclPackage.THITEM__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case SclPackage.THITEM__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case SclPackage.THITEM__WHAT:
				setWhat(WHAT_EDEFAULT);
				return;
			case SclPackage.THITEM__WHEN:
				setWhen(WHEN_EDEFAULT);
				return;
			case SclPackage.THITEM__WHO:
				setWho(WHO_EDEFAULT);
				return;
			case SclPackage.THITEM__WHY:
				setWhy(WHY_EDEFAULT);
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
			case SclPackage.THITEM__REVISION:
				return REVISION_EDEFAULT == null ? revision != null : !REVISION_EDEFAULT.equals(revision);
			case SclPackage.THITEM__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case SclPackage.THITEM__WHAT:
				return WHAT_EDEFAULT == null ? what != null : !WHAT_EDEFAULT.equals(what);
			case SclPackage.THITEM__WHEN:
				return WHEN_EDEFAULT == null ? when != null : !WHEN_EDEFAULT.equals(when);
			case SclPackage.THITEM__WHO:
				return WHO_EDEFAULT == null ? who != null : !WHO_EDEFAULT.equals(who);
			case SclPackage.THITEM__WHY:
				return WHY_EDEFAULT == null ? why != null : !WHY_EDEFAULT.equals(why);
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
		result.append(" (revision: ");
		result.append(revision);
		result.append(", version: ");
		result.append(version);
		result.append(", what: ");
		result.append(what);
		result.append(", when: ");
		result.append(when);
		result.append(", who: ");
		result.append(who);
		result.append(", why: ");
		result.append(why);
		result.append(')');
		return result.toString();
	}

} //THitemImpl
