/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TConfLNs;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TConf LNs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TConfLNsImpl#isFixLnInst <em>Fix Ln Inst</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TConfLNsImpl#isFixPrefix <em>Fix Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TConfLNsImpl extends EObjectImpl implements TConfLNs {
	/**
	 * The default value of the '{@link #isFixLnInst() <em>Fix Ln Inst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFixLnInst()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIX_LN_INST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFixLnInst() <em>Fix Ln Inst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFixLnInst()
	 * @generated
	 * @ordered
	 */
	protected boolean fixLnInst = FIX_LN_INST_EDEFAULT;

	/**
	 * This is true if the Fix Ln Inst attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fixLnInstESet;

	/**
	 * The default value of the '{@link #isFixPrefix() <em>Fix Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFixPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIX_PREFIX_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFixPrefix() <em>Fix Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFixPrefix()
	 * @generated
	 * @ordered
	 */
	protected boolean fixPrefix = FIX_PREFIX_EDEFAULT;

	/**
	 * This is true if the Fix Prefix attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fixPrefixESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TConfLNsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTConfLNs();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFixLnInst() {
		return fixLnInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixLnInst(boolean newFixLnInst) {
		boolean oldFixLnInst = fixLnInst;
		fixLnInst = newFixLnInst;
		boolean oldFixLnInstESet = fixLnInstESet;
		fixLnInstESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TCONF_LNS__FIX_LN_INST, oldFixLnInst, fixLnInst, !oldFixLnInstESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFixLnInst() {
		boolean oldFixLnInst = fixLnInst;
		boolean oldFixLnInstESet = fixLnInstESet;
		fixLnInst = FIX_LN_INST_EDEFAULT;
		fixLnInstESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TCONF_LNS__FIX_LN_INST, oldFixLnInst, FIX_LN_INST_EDEFAULT, oldFixLnInstESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFixLnInst() {
		return fixLnInstESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFixPrefix() {
		return fixPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixPrefix(boolean newFixPrefix) {
		boolean oldFixPrefix = fixPrefix;
		fixPrefix = newFixPrefix;
		boolean oldFixPrefixESet = fixPrefixESet;
		fixPrefixESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TCONF_LNS__FIX_PREFIX, oldFixPrefix, fixPrefix, !oldFixPrefixESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFixPrefix() {
		boolean oldFixPrefix = fixPrefix;
		boolean oldFixPrefixESet = fixPrefixESet;
		fixPrefix = FIX_PREFIX_EDEFAULT;
		fixPrefixESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TCONF_LNS__FIX_PREFIX, oldFixPrefix, FIX_PREFIX_EDEFAULT, oldFixPrefixESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFixPrefix() {
		return fixPrefixESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SclPackage.TCONF_LNS__FIX_LN_INST:
				return isFixLnInst();
			case SclPackage.TCONF_LNS__FIX_PREFIX:
				return isFixPrefix();
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
			case SclPackage.TCONF_LNS__FIX_LN_INST:
				setFixLnInst((Boolean)newValue);
				return;
			case SclPackage.TCONF_LNS__FIX_PREFIX:
				setFixPrefix((Boolean)newValue);
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
			case SclPackage.TCONF_LNS__FIX_LN_INST:
				unsetFixLnInst();
				return;
			case SclPackage.TCONF_LNS__FIX_PREFIX:
				unsetFixPrefix();
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
			case SclPackage.TCONF_LNS__FIX_LN_INST:
				return isSetFixLnInst();
			case SclPackage.TCONF_LNS__FIX_PREFIX:
				return isSetFixPrefix();
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
		result.append(" (fixLnInst: ");
		if (fixLnInstESet) result.append(fixLnInst); else result.append("<unset>");
		result.append(", fixPrefix: ");
		if (fixPrefixESet) result.append(fixPrefix); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TConfLNsImpl
