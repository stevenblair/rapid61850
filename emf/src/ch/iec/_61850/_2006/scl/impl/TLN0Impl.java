/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclFactory;
import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TGSEControl;
import ch.iec._61850._2006.scl.TLN0;
import ch.iec._61850._2006.scl.TLog;
import ch.iec._61850._2006.scl.TSCLControl;
import ch.iec._61850._2006.scl.TSampledValueControl;
import ch.iec._61850._2006.scl.TSettingControl;

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
 * An implementation of the model object '<em><b>TLN0</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TLN0Impl#getGSEControl <em>GSE Control</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TLN0Impl#getSampledValueControl <em>Sampled Value Control</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TLN0Impl#getSettingControl <em>Setting Control</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TLN0Impl#getSCLControl <em>SCL Control</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TLN0Impl#getLog <em>Log</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TLN0Impl#getInst <em>Inst</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TLN0Impl#getLnClass <em>Ln Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TLN0Impl extends TAnyLNImpl implements TLN0 {
	/**
	 * The cached value of the '{@link #getGSEControl() <em>GSE Control</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGSEControl()
	 * @generated
	 * @ordered
	 */
	protected EList<TGSEControl> gSEControl;

	/**
	 * The cached value of the '{@link #getSampledValueControl() <em>Sampled Value Control</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampledValueControl()
	 * @generated
	 * @ordered
	 */
	protected EList<TSampledValueControl> sampledValueControl;

	/**
	 * The cached value of the '{@link #getSettingControl() <em>Setting Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettingControl()
	 * @generated
	 * @ordered
	 */
	protected TSettingControl settingControl;

	/**
	 * The cached value of the '{@link #getSCLControl() <em>SCL Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCLControl()
	 * @generated
	 * @ordered
	 */
	protected TSCLControl sCLControl;

	/**
	 * The cached value of the '{@link #getLog() <em>Log</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLog()
	 * @generated
	 * @ordered
	 */
	protected TLog log;

	/**
	 * The default value of the '{@link #getInst() <em>Inst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInst()
	 * @generated
	 * @ordered
	 */
	protected static final String INST_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getInst() <em>Inst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInst()
	 * @generated
	 * @ordered
	 */
	protected String inst = INST_EDEFAULT;

	/**
	 * This is true if the Inst attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean instESet;

	/**
	 * The default value of the '{@link #getLnClass() <em>Ln Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLnClass()
	 * @generated
	 * @ordered
	 */
	protected static final Object LN_CLASS_EDEFAULT = SclFactory.eINSTANCE.createFromString(SclPackage.eINSTANCE.getTLNClassEnum(), "LLN0");

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
	 * This is true if the Ln Class attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lnClassESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TLN0Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTLN0();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TGSEControl> getGSEControl() {
		if (gSEControl == null) {
			gSEControl = new EObjectContainmentEList<TGSEControl>(TGSEControl.class, this, SclPackage.TLN0__GSE_CONTROL);
		}
		return gSEControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TSampledValueControl> getSampledValueControl() {
		if (sampledValueControl == null) {
			sampledValueControl = new EObjectContainmentEList<TSampledValueControl>(TSampledValueControl.class, this, SclPackage.TLN0__SAMPLED_VALUE_CONTROL);
		}
		return sampledValueControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSettingControl getSettingControl() {
		return settingControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSettingControl(TSettingControl newSettingControl, NotificationChain msgs) {
		TSettingControl oldSettingControl = settingControl;
		settingControl = newSettingControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TLN0__SETTING_CONTROL, oldSettingControl, newSettingControl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSettingControl(TSettingControl newSettingControl) {
		if (newSettingControl != settingControl) {
			NotificationChain msgs = null;
			if (settingControl != null)
				msgs = ((InternalEObject)settingControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TLN0__SETTING_CONTROL, null, msgs);
			if (newSettingControl != null)
				msgs = ((InternalEObject)newSettingControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TLN0__SETTING_CONTROL, null, msgs);
			msgs = basicSetSettingControl(newSettingControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TLN0__SETTING_CONTROL, newSettingControl, newSettingControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSCLControl getSCLControl() {
		return sCLControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSCLControl(TSCLControl newSCLControl, NotificationChain msgs) {
		TSCLControl oldSCLControl = sCLControl;
		sCLControl = newSCLControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TLN0__SCL_CONTROL, oldSCLControl, newSCLControl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSCLControl(TSCLControl newSCLControl) {
		if (newSCLControl != sCLControl) {
			NotificationChain msgs = null;
			if (sCLControl != null)
				msgs = ((InternalEObject)sCLControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TLN0__SCL_CONTROL, null, msgs);
			if (newSCLControl != null)
				msgs = ((InternalEObject)newSCLControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TLN0__SCL_CONTROL, null, msgs);
			msgs = basicSetSCLControl(newSCLControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TLN0__SCL_CONTROL, newSCLControl, newSCLControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLog getLog() {
		return log;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLog(TLog newLog, NotificationChain msgs) {
		TLog oldLog = log;
		log = newLog;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TLN0__LOG, oldLog, newLog);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLog(TLog newLog) {
		if (newLog != log) {
			NotificationChain msgs = null;
			if (log != null)
				msgs = ((InternalEObject)log).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TLN0__LOG, null, msgs);
			if (newLog != null)
				msgs = ((InternalEObject)newLog).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TLN0__LOG, null, msgs);
			msgs = basicSetLog(newLog, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TLN0__LOG, newLog, newLog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInst() {
		return inst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInst(String newInst) {
		String oldInst = inst;
		inst = newInst;
		boolean oldInstESet = instESet;
		instESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TLN0__INST, oldInst, inst, !oldInstESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInst() {
		String oldInst = inst;
		boolean oldInstESet = instESet;
		inst = INST_EDEFAULT;
		instESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TLN0__INST, oldInst, INST_EDEFAULT, oldInstESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInst() {
		return instESet;
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
		boolean oldLnClassESet = lnClassESet;
		lnClassESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TLN0__LN_CLASS, oldLnClass, lnClass, !oldLnClassESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLnClass() {
		Object oldLnClass = lnClass;
		boolean oldLnClassESet = lnClassESet;
		lnClass = LN_CLASS_EDEFAULT;
		lnClassESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TLN0__LN_CLASS, oldLnClass, LN_CLASS_EDEFAULT, oldLnClassESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLnClass() {
		return lnClassESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SclPackage.TLN0__GSE_CONTROL:
				return ((InternalEList<?>)getGSEControl()).basicRemove(otherEnd, msgs);
			case SclPackage.TLN0__SAMPLED_VALUE_CONTROL:
				return ((InternalEList<?>)getSampledValueControl()).basicRemove(otherEnd, msgs);
			case SclPackage.TLN0__SETTING_CONTROL:
				return basicSetSettingControl(null, msgs);
			case SclPackage.TLN0__SCL_CONTROL:
				return basicSetSCLControl(null, msgs);
			case SclPackage.TLN0__LOG:
				return basicSetLog(null, msgs);
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
			case SclPackage.TLN0__GSE_CONTROL:
				return getGSEControl();
			case SclPackage.TLN0__SAMPLED_VALUE_CONTROL:
				return getSampledValueControl();
			case SclPackage.TLN0__SETTING_CONTROL:
				return getSettingControl();
			case SclPackage.TLN0__SCL_CONTROL:
				return getSCLControl();
			case SclPackage.TLN0__LOG:
				return getLog();
			case SclPackage.TLN0__INST:
				return getInst();
			case SclPackage.TLN0__LN_CLASS:
				return getLnClass();
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
			case SclPackage.TLN0__GSE_CONTROL:
				getGSEControl().clear();
				getGSEControl().addAll((Collection<? extends TGSEControl>)newValue);
				return;
			case SclPackage.TLN0__SAMPLED_VALUE_CONTROL:
				getSampledValueControl().clear();
				getSampledValueControl().addAll((Collection<? extends TSampledValueControl>)newValue);
				return;
			case SclPackage.TLN0__SETTING_CONTROL:
				setSettingControl((TSettingControl)newValue);
				return;
			case SclPackage.TLN0__SCL_CONTROL:
				setSCLControl((TSCLControl)newValue);
				return;
			case SclPackage.TLN0__LOG:
				setLog((TLog)newValue);
				return;
			case SclPackage.TLN0__INST:
				setInst((String)newValue);
				return;
			case SclPackage.TLN0__LN_CLASS:
				setLnClass(newValue);
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
			case SclPackage.TLN0__GSE_CONTROL:
				getGSEControl().clear();
				return;
			case SclPackage.TLN0__SAMPLED_VALUE_CONTROL:
				getSampledValueControl().clear();
				return;
			case SclPackage.TLN0__SETTING_CONTROL:
				setSettingControl((TSettingControl)null);
				return;
			case SclPackage.TLN0__SCL_CONTROL:
				setSCLControl((TSCLControl)null);
				return;
			case SclPackage.TLN0__LOG:
				setLog((TLog)null);
				return;
			case SclPackage.TLN0__INST:
				unsetInst();
				return;
			case SclPackage.TLN0__LN_CLASS:
				unsetLnClass();
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
			case SclPackage.TLN0__GSE_CONTROL:
				return gSEControl != null && !gSEControl.isEmpty();
			case SclPackage.TLN0__SAMPLED_VALUE_CONTROL:
				return sampledValueControl != null && !sampledValueControl.isEmpty();
			case SclPackage.TLN0__SETTING_CONTROL:
				return settingControl != null;
			case SclPackage.TLN0__SCL_CONTROL:
				return sCLControl != null;
			case SclPackage.TLN0__LOG:
				return log != null;
			case SclPackage.TLN0__INST:
				return isSetInst();
			case SclPackage.TLN0__LN_CLASS:
				return isSetLnClass();
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
		result.append(" (inst: ");
		if (instESet) result.append(inst); else result.append("<unset>");
		result.append(", lnClass: ");
		if (lnClassESet) result.append(lnClass); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TLN0Impl
