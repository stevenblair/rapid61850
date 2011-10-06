/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TServiceWithMaxAndMaxAttributes;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TService With Max And Max Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TServiceWithMaxAndMaxAttributesImpl#getMaxAttributes <em>Max Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TServiceWithMaxAndMaxAttributesImpl extends TServiceWithMaxImpl implements TServiceWithMaxAndMaxAttributes {
	/**
	 * The default value of the '{@link #getMaxAttributes() <em>Max Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAttributes()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_ATTRIBUTES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxAttributes() <em>Max Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAttributes()
	 * @generated
	 * @ordered
	 */
	protected long maxAttributes = MAX_ATTRIBUTES_EDEFAULT;

	/**
	 * This is true if the Max Attributes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxAttributesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TServiceWithMaxAndMaxAttributesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTServiceWithMaxAndMaxAttributes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMaxAttributes() {
		return maxAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxAttributes(long newMaxAttributes) {
		long oldMaxAttributes = maxAttributes;
		maxAttributes = newMaxAttributes;
		boolean oldMaxAttributesESet = maxAttributesESet;
		maxAttributesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICE_WITH_MAX_AND_MAX_ATTRIBUTES__MAX_ATTRIBUTES, oldMaxAttributes, maxAttributes, !oldMaxAttributesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxAttributes() {
		long oldMaxAttributes = maxAttributes;
		boolean oldMaxAttributesESet = maxAttributesESet;
		maxAttributes = MAX_ATTRIBUTES_EDEFAULT;
		maxAttributesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TSERVICE_WITH_MAX_AND_MAX_ATTRIBUTES__MAX_ATTRIBUTES, oldMaxAttributes, MAX_ATTRIBUTES_EDEFAULT, oldMaxAttributesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxAttributes() {
		return maxAttributesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SclPackage.TSERVICE_WITH_MAX_AND_MAX_ATTRIBUTES__MAX_ATTRIBUTES:
				return getMaxAttributes();
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
			case SclPackage.TSERVICE_WITH_MAX_AND_MAX_ATTRIBUTES__MAX_ATTRIBUTES:
				setMaxAttributes((Long)newValue);
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
			case SclPackage.TSERVICE_WITH_MAX_AND_MAX_ATTRIBUTES__MAX_ATTRIBUTES:
				unsetMaxAttributes();
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
			case SclPackage.TSERVICE_WITH_MAX_AND_MAX_ATTRIBUTES__MAX_ATTRIBUTES:
				return isSetMaxAttributes();
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
		result.append(" (maxAttributes: ");
		if (maxAttributesESet) result.append(maxAttributes); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TServiceWithMaxAndMaxAttributesImpl
