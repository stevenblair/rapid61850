/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TFCCB;
import ch.iec._61850._2006.scl.TServiceFCEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TFCCB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TFCCBImpl#getCbName <em>Cb Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TFCCBImpl#getDaName <em>Da Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TFCCBImpl#getFc <em>Fc</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TFCCBImpl#getLdInst <em>Ld Inst</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TFCCBImpl#getLnClass <em>Ln Class</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TFCCBImpl#getLnInst <em>Ln Inst</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TFCCBImpl#getPrefix <em>Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TFCCBImpl extends EObjectImpl implements TFCCB {
	/**
	 * The default value of the '{@link #getCbName() <em>Cb Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCbName()
	 * @generated
	 * @ordered
	 */
	protected static final String CB_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCbName() <em>Cb Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCbName()
	 * @generated
	 * @ordered
	 */
	protected String cbName = CB_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getFc() <em>Fc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFc()
	 * @generated
	 * @ordered
	 */
	protected static final TServiceFCEnum FC_EDEFAULT = TServiceFCEnum.SG;

	/**
	 * The cached value of the '{@link #getFc() <em>Fc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFc()
	 * @generated
	 * @ordered
	 */
	protected TServiceFCEnum fc = FC_EDEFAULT;

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
	protected TFCCBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTFCCB();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCbName() {
		return cbName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCbName(String newCbName) {
		String oldCbName = cbName;
		cbName = newCbName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TFCCB__CB_NAME, oldCbName, cbName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TFCCB__DA_NAME, oldDaName, daName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceFCEnum getFc() {
		return fc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFc(TServiceFCEnum newFc) {
		TServiceFCEnum oldFc = fc;
		fc = newFc == null ? FC_EDEFAULT : newFc;
		boolean oldFcESet = fcESet;
		fcESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TFCCB__FC, oldFc, fc, !oldFcESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFc() {
		TServiceFCEnum oldFc = fc;
		boolean oldFcESet = fcESet;
		fc = FC_EDEFAULT;
		fcESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TFCCB__FC, oldFc, FC_EDEFAULT, oldFcESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TFCCB__LD_INST, oldLdInst, ldInst));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TFCCB__LN_CLASS, oldLnClass, lnClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TFCCB__LN_INST, oldLnInst, lnInst));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TFCCB__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SclPackage.TFCCB__CB_NAME:
				return getCbName();
			case SclPackage.TFCCB__DA_NAME:
				return getDaName();
			case SclPackage.TFCCB__FC:
				return getFc();
			case SclPackage.TFCCB__LD_INST:
				return getLdInst();
			case SclPackage.TFCCB__LN_CLASS:
				return getLnClass();
			case SclPackage.TFCCB__LN_INST:
				return getLnInst();
			case SclPackage.TFCCB__PREFIX:
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
			case SclPackage.TFCCB__CB_NAME:
				setCbName((String)newValue);
				return;
			case SclPackage.TFCCB__DA_NAME:
				setDaName((String)newValue);
				return;
			case SclPackage.TFCCB__FC:
				setFc((TServiceFCEnum)newValue);
				return;
			case SclPackage.TFCCB__LD_INST:
				setLdInst((String)newValue);
				return;
			case SclPackage.TFCCB__LN_CLASS:
				setLnClass(newValue);
				return;
			case SclPackage.TFCCB__LN_INST:
				setLnInst((String)newValue);
				return;
			case SclPackage.TFCCB__PREFIX:
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
			case SclPackage.TFCCB__CB_NAME:
				setCbName(CB_NAME_EDEFAULT);
				return;
			case SclPackage.TFCCB__DA_NAME:
				setDaName(DA_NAME_EDEFAULT);
				return;
			case SclPackage.TFCCB__FC:
				unsetFc();
				return;
			case SclPackage.TFCCB__LD_INST:
				setLdInst(LD_INST_EDEFAULT);
				return;
			case SclPackage.TFCCB__LN_CLASS:
				setLnClass(LN_CLASS_EDEFAULT);
				return;
			case SclPackage.TFCCB__LN_INST:
				setLnInst(LN_INST_EDEFAULT);
				return;
			case SclPackage.TFCCB__PREFIX:
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
			case SclPackage.TFCCB__CB_NAME:
				return CB_NAME_EDEFAULT == null ? cbName != null : !CB_NAME_EDEFAULT.equals(cbName);
			case SclPackage.TFCCB__DA_NAME:
				return DA_NAME_EDEFAULT == null ? daName != null : !DA_NAME_EDEFAULT.equals(daName);
			case SclPackage.TFCCB__FC:
				return isSetFc();
			case SclPackage.TFCCB__LD_INST:
				return LD_INST_EDEFAULT == null ? ldInst != null : !LD_INST_EDEFAULT.equals(ldInst);
			case SclPackage.TFCCB__LN_CLASS:
				return LN_CLASS_EDEFAULT == null ? lnClass != null : !LN_CLASS_EDEFAULT.equals(lnClass);
			case SclPackage.TFCCB__LN_INST:
				return LN_INST_EDEFAULT == null ? lnInst != null : !LN_INST_EDEFAULT.equals(lnInst);
			case SclPackage.TFCCB__PREFIX:
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
		result.append(" (cbName: ");
		result.append(cbName);
		result.append(", daName: ");
		result.append(daName);
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

} //TFCCBImpl
