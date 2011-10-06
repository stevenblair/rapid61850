/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.AuthenticationType;
import ch.iec._61850._2006.scl.SclPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authentication Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.AuthenticationTypeImpl#isCertificate <em>Certificate</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.AuthenticationTypeImpl#isNone <em>None</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.AuthenticationTypeImpl#isPassword <em>Password</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.AuthenticationTypeImpl#isStrong <em>Strong</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.AuthenticationTypeImpl#isWeak <em>Weak</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuthenticationTypeImpl extends EObjectImpl implements AuthenticationType {
	/**
	 * The default value of the '{@link #isCertificate() <em>Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCertificate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CERTIFICATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCertificate() <em>Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCertificate()
	 * @generated
	 * @ordered
	 */
	protected boolean certificate = CERTIFICATE_EDEFAULT;

	/**
	 * This is true if the Certificate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean certificateESet;

	/**
	 * The default value of the '{@link #isNone() <em>None</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNone()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NONE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isNone() <em>None</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNone()
	 * @generated
	 * @ordered
	 */
	protected boolean none = NONE_EDEFAULT;

	/**
	 * This is true if the None attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean noneESet;

	/**
	 * The default value of the '{@link #isPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPassword()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PASSWORD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPassword()
	 * @generated
	 * @ordered
	 */
	protected boolean password = PASSWORD_EDEFAULT;

	/**
	 * This is true if the Password attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean passwordESet;

	/**
	 * The default value of the '{@link #isStrong() <em>Strong</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrong()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STRONG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStrong() <em>Strong</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrong()
	 * @generated
	 * @ordered
	 */
	protected boolean strong = STRONG_EDEFAULT;

	/**
	 * This is true if the Strong attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strongESet;

	/**
	 * The default value of the '{@link #isWeak() <em>Weak</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWeak()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WEAK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWeak() <em>Weak</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWeak()
	 * @generated
	 * @ordered
	 */
	protected boolean weak = WEAK_EDEFAULT;

	/**
	 * This is true if the Weak attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean weakESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthenticationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getAuthenticationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCertificate() {
		return certificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCertificate(boolean newCertificate) {
		boolean oldCertificate = certificate;
		certificate = newCertificate;
		boolean oldCertificateESet = certificateESet;
		certificateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.AUTHENTICATION_TYPE__CERTIFICATE, oldCertificate, certificate, !oldCertificateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCertificate() {
		boolean oldCertificate = certificate;
		boolean oldCertificateESet = certificateESet;
		certificate = CERTIFICATE_EDEFAULT;
		certificateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.AUTHENTICATION_TYPE__CERTIFICATE, oldCertificate, CERTIFICATE_EDEFAULT, oldCertificateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCertificate() {
		return certificateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNone() {
		return none;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNone(boolean newNone) {
		boolean oldNone = none;
		none = newNone;
		boolean oldNoneESet = noneESet;
		noneESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.AUTHENTICATION_TYPE__NONE, oldNone, none, !oldNoneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNone() {
		boolean oldNone = none;
		boolean oldNoneESet = noneESet;
		none = NONE_EDEFAULT;
		noneESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.AUTHENTICATION_TYPE__NONE, oldNone, NONE_EDEFAULT, oldNoneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNone() {
		return noneESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(boolean newPassword) {
		boolean oldPassword = password;
		password = newPassword;
		boolean oldPasswordESet = passwordESet;
		passwordESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.AUTHENTICATION_TYPE__PASSWORD, oldPassword, password, !oldPasswordESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPassword() {
		boolean oldPassword = password;
		boolean oldPasswordESet = passwordESet;
		password = PASSWORD_EDEFAULT;
		passwordESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.AUTHENTICATION_TYPE__PASSWORD, oldPassword, PASSWORD_EDEFAULT, oldPasswordESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPassword() {
		return passwordESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStrong() {
		return strong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrong(boolean newStrong) {
		boolean oldStrong = strong;
		strong = newStrong;
		boolean oldStrongESet = strongESet;
		strongESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.AUTHENTICATION_TYPE__STRONG, oldStrong, strong, !oldStrongESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrong() {
		boolean oldStrong = strong;
		boolean oldStrongESet = strongESet;
		strong = STRONG_EDEFAULT;
		strongESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.AUTHENTICATION_TYPE__STRONG, oldStrong, STRONG_EDEFAULT, oldStrongESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrong() {
		return strongESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWeak() {
		return weak;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeak(boolean newWeak) {
		boolean oldWeak = weak;
		weak = newWeak;
		boolean oldWeakESet = weakESet;
		weakESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.AUTHENTICATION_TYPE__WEAK, oldWeak, weak, !oldWeakESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWeak() {
		boolean oldWeak = weak;
		boolean oldWeakESet = weakESet;
		weak = WEAK_EDEFAULT;
		weakESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.AUTHENTICATION_TYPE__WEAK, oldWeak, WEAK_EDEFAULT, oldWeakESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWeak() {
		return weakESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SclPackage.AUTHENTICATION_TYPE__CERTIFICATE:
				return isCertificate();
			case SclPackage.AUTHENTICATION_TYPE__NONE:
				return isNone();
			case SclPackage.AUTHENTICATION_TYPE__PASSWORD:
				return isPassword();
			case SclPackage.AUTHENTICATION_TYPE__STRONG:
				return isStrong();
			case SclPackage.AUTHENTICATION_TYPE__WEAK:
				return isWeak();
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
			case SclPackage.AUTHENTICATION_TYPE__CERTIFICATE:
				setCertificate((Boolean)newValue);
				return;
			case SclPackage.AUTHENTICATION_TYPE__NONE:
				setNone((Boolean)newValue);
				return;
			case SclPackage.AUTHENTICATION_TYPE__PASSWORD:
				setPassword((Boolean)newValue);
				return;
			case SclPackage.AUTHENTICATION_TYPE__STRONG:
				setStrong((Boolean)newValue);
				return;
			case SclPackage.AUTHENTICATION_TYPE__WEAK:
				setWeak((Boolean)newValue);
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
			case SclPackage.AUTHENTICATION_TYPE__CERTIFICATE:
				unsetCertificate();
				return;
			case SclPackage.AUTHENTICATION_TYPE__NONE:
				unsetNone();
				return;
			case SclPackage.AUTHENTICATION_TYPE__PASSWORD:
				unsetPassword();
				return;
			case SclPackage.AUTHENTICATION_TYPE__STRONG:
				unsetStrong();
				return;
			case SclPackage.AUTHENTICATION_TYPE__WEAK:
				unsetWeak();
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
			case SclPackage.AUTHENTICATION_TYPE__CERTIFICATE:
				return isSetCertificate();
			case SclPackage.AUTHENTICATION_TYPE__NONE:
				return isSetNone();
			case SclPackage.AUTHENTICATION_TYPE__PASSWORD:
				return isSetPassword();
			case SclPackage.AUTHENTICATION_TYPE__STRONG:
				return isSetStrong();
			case SclPackage.AUTHENTICATION_TYPE__WEAK:
				return isSetWeak();
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
		result.append(" (certificate: ");
		if (certificateESet) result.append(certificate); else result.append("<unset>");
		result.append(", none: ");
		if (noneESet) result.append(none); else result.append("<unset>");
		result.append(", password: ");
		if (passwordESet) result.append(password); else result.append("<unset>");
		result.append(", strong: ");
		if (strongESet) result.append(strong); else result.append("<unset>");
		result.append(", weak: ");
		if (weakESet) result.append(weak); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AuthenticationTypeImpl
