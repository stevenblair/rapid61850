/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TDAType;
import ch.iec._61850._2006.scl.TDOType;
import ch.iec._61850._2006.scl.TFCDA;
import ch.iec._61850._2006.scl.TFCEnum;

import ch.iec._61850._2006.scl.TLN;
import ch.iec._61850._2006.scl.TPredefinedBasicTypeEnum;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TFCDA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TFCDAImpl#getDaName <em>Da Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TFCDAImpl#getDoName <em>Do Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TFCDAImpl#getFc <em>Fc</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TFCDAImpl#getLdInst <em>Ld Inst</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TFCDAImpl#getLnClass <em>Ln Class</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TFCDAImpl#getLnInst <em>Ln Inst</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TFCDAImpl#getPrefix <em>Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TFCDAImpl extends EObjectImpl implements TFCDA {
	/**
	 * The default value of the '{@link #getDaName() <em>Da Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaName()
	 * @generated
	 * @ordered
	 */
	protected static final String DA_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDaName() <em>Da Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaName()
	 * @generated
	 * @ordered
	 */
	protected String daName = DA_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDoName() <em>Do Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoName()
	 * @generated
	 * @ordered
	 */
	protected static final String DO_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDoName() <em>Do Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoName()
	 * @generated
	 * @ordered
	 */
	protected String doName = DO_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFc() <em>Fc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFc()
	 * @generated
	 * @ordered
	 */
	protected static final TFCEnum FC_EDEFAULT = TFCEnum.ST;

	/**
	 * The cached value of the '{@link #getFc() <em>Fc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFc()
	 * @generated
	 * @ordered
	 */
	protected TFCEnum fc = FC_EDEFAULT;

	/**
	 * This is true if the Fc attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fcESet;

	/**
	 * The default value of the '{@link #getLdInst() <em>Ld Inst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLdInst()
	 * @generated
	 * @ordered
	 */
	protected static final String LD_INST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLdInst() <em>Ld Inst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLdInst()
	 * @generated
	 * @ordered
	 */
	protected String ldInst = LD_INST_EDEFAULT;

	/**
	 * The default value of the '{@link #getLnClass() <em>Ln Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLnClass()
	 * @generated
	 * @ordered
	 */
	protected static final Object LN_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLnClass() <em>Ln Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLnClass()
	 * @generated
	 * @ordered
	 */
	protected Object lnClass = LN_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLnInst() <em>Ln Inst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLnInst()
	 * @generated
	 * @ordered
	 */
	protected static final String LN_INST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLnInst() <em>Ln Inst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLnInst()
	 * @generated
	 * @ordered
	 */
	protected String lnInst = LN_INST_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TFCDAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTFCDA();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDaName() {
		return daName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDaName(String newDaName) {
		String oldDaName = daName;
		daName = newDaName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TFCDA__DA_NAME, oldDaName, daName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDoName() {
		return doName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoName(String newDoName) {
		String oldDoName = doName;
		doName = newDoName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TFCDA__DO_NAME, oldDoName, doName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFCEnum getFc() {
		return fc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFc(TFCEnum newFc) {
		TFCEnum oldFc = fc;
		fc = newFc == null ? FC_EDEFAULT : newFc;
		boolean oldFcESet = fcESet;
		fcESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TFCDA__FC, oldFc, fc, !oldFcESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFc() {
		TFCEnum oldFc = fc;
		boolean oldFcESet = fcESet;
		fc = FC_EDEFAULT;
		fcESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TFCDA__FC, oldFc, FC_EDEFAULT, oldFcESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFc() {
		return fcESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLdInst() {
		return ldInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLdInst(String newLdInst) {
		String oldLdInst = ldInst;
		ldInst = newLdInst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TFCDA__LD_INST, oldLdInst, ldInst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLnClass() {
		return lnClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLnClass(Object newLnClass) {
		Object oldLnClass = lnClass;
		lnClass = newLnClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TFCDA__LN_CLASS, oldLnClass, lnClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLnInst() {
		return lnInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLnInst(String newLnInst) {
		String oldLnInst = lnInst;
		lnInst = newLnInst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TFCDA__LN_INST, oldLnInst, lnInst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TFCDA__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SclPackage.TFCDA__DA_NAME:
				return getDaName();
			case SclPackage.TFCDA__DO_NAME:
				return getDoName();
			case SclPackage.TFCDA__FC:
				return getFc();
			case SclPackage.TFCDA__LD_INST:
				return getLdInst();
			case SclPackage.TFCDA__LN_CLASS:
				return getLnClass();
			case SclPackage.TFCDA__LN_INST:
				return getLnInst();
			case SclPackage.TFCDA__PREFIX:
				return getPrefix();
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
			case SclPackage.TFCDA__DA_NAME:
				setDaName((String)newValue);
				return;
			case SclPackage.TFCDA__DO_NAME:
				setDoName((String)newValue);
				return;
			case SclPackage.TFCDA__FC:
				setFc((TFCEnum)newValue);
				return;
			case SclPackage.TFCDA__LD_INST:
				setLdInst((String)newValue);
				return;
			case SclPackage.TFCDA__LN_CLASS:
				setLnClass(newValue);
				return;
			case SclPackage.TFCDA__LN_INST:
				setLnInst((String)newValue);
				return;
			case SclPackage.TFCDA__PREFIX:
				setPrefix((String)newValue);
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
			case SclPackage.TFCDA__DA_NAME:
				setDaName(DA_NAME_EDEFAULT);
				return;
			case SclPackage.TFCDA__DO_NAME:
				setDoName(DO_NAME_EDEFAULT);
				return;
			case SclPackage.TFCDA__FC:
				unsetFc();
				return;
			case SclPackage.TFCDA__LD_INST:
				setLdInst(LD_INST_EDEFAULT);
				return;
			case SclPackage.TFCDA__LN_CLASS:
				setLnClass(LN_CLASS_EDEFAULT);
				return;
			case SclPackage.TFCDA__LN_INST:
				setLnInst(LN_INST_EDEFAULT);
				return;
			case SclPackage.TFCDA__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
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
			case SclPackage.TFCDA__DA_NAME:
				return DA_NAME_EDEFAULT == null ? daName != null : !DA_NAME_EDEFAULT.equals(daName);
			case SclPackage.TFCDA__DO_NAME:
				return DO_NAME_EDEFAULT == null ? doName != null : !DO_NAME_EDEFAULT.equals(doName);
			case SclPackage.TFCDA__FC:
				return isSetFc();
			case SclPackage.TFCDA__LD_INST:
				return LD_INST_EDEFAULT == null ? ldInst != null : !LD_INST_EDEFAULT.equals(ldInst);
			case SclPackage.TFCDA__LN_CLASS:
				return LN_CLASS_EDEFAULT == null ? lnClass != null : !LN_CLASS_EDEFAULT.equals(lnClass);
			case SclPackage.TFCDA__LN_INST:
				return LN_INST_EDEFAULT == null ? lnInst != null : !LN_INST_EDEFAULT.equals(lnInst);
			case SclPackage.TFCDA__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
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
		result.append(" (daName: ");
		result.append(daName);
		result.append(", doName: ");
		result.append(doName);
		result.append(", fc: ");
		if (fcESet) result.append(fc); else result.append("<unset>");
		result.append(", ldInst: ");
		result.append(ldInst);
		result.append(", lnClass: ");
		result.append(lnClass);
		result.append(", lnInst: ");
		result.append(lnInst);
		result.append(", prefix: ");
		result.append(prefix);
		result.append(')');
		return result.toString();
	}

} //TFCDAImpl
