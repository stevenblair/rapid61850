/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TSettingControl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TSetting Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TSettingControlImpl#getActSG <em>Act SG</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TSettingControlImpl#getNumOfSGs <em>Num Of SGs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TSettingControlImpl extends TUnNamingImpl implements TSettingControl {
	/**
	 * The default value of the '{@link #getActSG() <em>Act SG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActSG()
	 * @generated
	 * @ordered
	 */
	protected static final long ACT_SG_EDEFAULT = 1L;

	/**
	 * The cached value of the '{@link #getActSG() <em>Act SG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActSG()
	 * @generated
	 * @ordered
	 */
	protected long actSG = ACT_SG_EDEFAULT;

	/**
	 * This is true if the Act SG attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actSGESet;

	/**
	 * The default value of the '{@link #getNumOfSGs() <em>Num Of SGs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfSGs()
	 * @generated
	 * @ordered
	 */
	protected static final long NUM_OF_SGS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumOfSGs() <em>Num Of SGs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfSGs()
	 * @generated
	 * @ordered
	 */
	protected long numOfSGs = NUM_OF_SGS_EDEFAULT;

	/**
	 * This is true if the Num Of SGs attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numOfSGsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TSettingControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTSettingControl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getActSG() {
		return actSG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActSG(long newActSG) {
		long oldActSG = actSG;
		actSG = newActSG;
		boolean oldActSGESet = actSGESet;
		actSGESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSETTING_CONTROL__ACT_SG, oldActSG, actSG, !oldActSGESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActSG() {
		long oldActSG = actSG;
		boolean oldActSGESet = actSGESet;
		actSG = ACT_SG_EDEFAULT;
		actSGESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TSETTING_CONTROL__ACT_SG, oldActSG, ACT_SG_EDEFAULT, oldActSGESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActSG() {
		return actSGESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumOfSGs() {
		return numOfSGs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumOfSGs(long newNumOfSGs) {
		long oldNumOfSGs = numOfSGs;
		numOfSGs = newNumOfSGs;
		boolean oldNumOfSGsESet = numOfSGsESet;
		numOfSGsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSETTING_CONTROL__NUM_OF_SGS, oldNumOfSGs, numOfSGs, !oldNumOfSGsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumOfSGs() {
		long oldNumOfSGs = numOfSGs;
		boolean oldNumOfSGsESet = numOfSGsESet;
		numOfSGs = NUM_OF_SGS_EDEFAULT;
		numOfSGsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TSETTING_CONTROL__NUM_OF_SGS, oldNumOfSGs, NUM_OF_SGS_EDEFAULT, oldNumOfSGsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumOfSGs() {
		return numOfSGsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SclPackage.TSETTING_CONTROL__ACT_SG:
				return getActSG();
			case SclPackage.TSETTING_CONTROL__NUM_OF_SGS:
				return getNumOfSGs();
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
			case SclPackage.TSETTING_CONTROL__ACT_SG:
				setActSG((Long)newValue);
				return;
			case SclPackage.TSETTING_CONTROL__NUM_OF_SGS:
				setNumOfSGs((Long)newValue);
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
			case SclPackage.TSETTING_CONTROL__ACT_SG:
				unsetActSG();
				return;
			case SclPackage.TSETTING_CONTROL__NUM_OF_SGS:
				unsetNumOfSGs();
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
			case SclPackage.TSETTING_CONTROL__ACT_SG:
				return isSetActSG();
			case SclPackage.TSETTING_CONTROL__NUM_OF_SGS:
				return isSetNumOfSGs();
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
		result.append(" (actSG: ");
		if (actSGESet) result.append(actSG); else result.append("<unset>");
		result.append(", numOfSGs: ");
		if (numOfSGsESet) result.append(numOfSGs); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TSettingControlImpl
