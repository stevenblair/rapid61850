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
import ch.iec._61850._2006.scl.TDataSet;
import ch.iec._61850._2006.scl.TExtRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TExt Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TExtRefImpl#getDaName <em>Da Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TExtRefImpl#getDoName <em>Do Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TExtRefImpl#getIedName <em>Ied Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TExtRefImpl#getIntAddr <em>Int Addr</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TExtRefImpl#getLdInst <em>Ld Inst</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TExtRefImpl#getLnClass <em>Ln Class</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TExtRefImpl#getLnInst <em>Ln Inst</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TExtRefImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TExtRefImpl#getDataSet <em>Data Set</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TExtRefImpl#getDoType <em>Do Type</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TExtRefImpl#getDaType <em>Da Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TExtRefImpl extends EObjectImpl implements TExtRef {
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
	 * The default value of the '{@link #getIedName() <em>Ied Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIedName()
	 * @generated
	 * @ordered
	 */
	protected static final String IED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIedName() <em>Ied Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIedName()
	 * @generated
	 * @ordered
	 */
	protected String iedName = IED_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntAddr() <em>Int Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntAddr()
	 * @generated
	 * @ordered
	 */
	protected static final String INT_ADDR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntAddr() <em>Int Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntAddr()
	 * @generated
	 * @ordered
	 */
	protected String intAddr = INT_ADDR_EDEFAULT;

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
	 * The cached value of the '{@link #getDataSet() <em>Data Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSet()
	 * @generated
	 * @ordered
	 */
	protected TDataSet dataSet;

	/**
	 * The cached value of the '{@link #getDoType() <em>Do Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoType()
	 * @generated
	 * @ordered
	 */
	protected TDOType doType;

	/**
	 * The cached value of the '{@link #getDaType() <em>Da Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaType()
	 * @generated
	 * @ordered
	 */
	protected TDAType daType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TExtRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTExtRef();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TEXT_REF__DA_NAME, oldDaName, daName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TEXT_REF__DO_NAME, oldDoName, doName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIedName() {
		return iedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIedName(String newIedName) {
		String oldIedName = iedName;
		iedName = newIedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TEXT_REF__IED_NAME, oldIedName, iedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntAddr() {
		return intAddr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntAddr(String newIntAddr) {
		String oldIntAddr = intAddr;
		intAddr = newIntAddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TEXT_REF__INT_ADDR, oldIntAddr, intAddr));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TEXT_REF__LD_INST, oldLdInst, ldInst));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TEXT_REF__LN_CLASS, oldLnClass, lnClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TEXT_REF__LN_INST, oldLnInst, lnInst));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TEXT_REF__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDataSet getDataSet() {
		if (dataSet != null && dataSet.eIsProxy()) {
			InternalEObject oldDataSet = (InternalEObject)dataSet;
			dataSet = (TDataSet)eResolveProxy(oldDataSet);
			if (dataSet != oldDataSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SclPackage.TEXT_REF__DATA_SET, oldDataSet, dataSet));
			}
		}
		return dataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDataSet basicGetDataSet() {
		return dataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSet(TDataSet newDataSet, NotificationChain msgs) {
		TDataSet oldDataSet = dataSet;
		dataSet = newDataSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TEXT_REF__DATA_SET, oldDataSet, newDataSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSet(TDataSet newDataSet) {
		if (newDataSet != dataSet) {
			NotificationChain msgs = null;
			if (dataSet != null)
				msgs = ((InternalEObject)dataSet).eInverseRemove(this, SclPackage.TDATA_SET__EXT_REF, TDataSet.class, msgs);
			if (newDataSet != null)
				msgs = ((InternalEObject)newDataSet).eInverseAdd(this, SclPackage.TDATA_SET__EXT_REF, TDataSet.class, msgs);
			msgs = basicSetDataSet(newDataSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TEXT_REF__DATA_SET, newDataSet, newDataSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDOType getDoType() {
		if (doType != null && doType.eIsProxy()) {
			InternalEObject oldDoType = (InternalEObject)doType;
			doType = (TDOType)eResolveProxy(oldDoType);
			if (doType != oldDoType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SclPackage.TEXT_REF__DO_TYPE, oldDoType, doType));
			}
		}
		return doType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDOType basicGetDoType() {
		return doType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoType(TDOType newDoType, NotificationChain msgs) {
		TDOType oldDoType = doType;
		doType = newDoType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TEXT_REF__DO_TYPE, oldDoType, newDoType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoType(TDOType newDoType) {
		if (newDoType != doType) {
			NotificationChain msgs = null;
			if (doType != null)
				msgs = ((InternalEObject)doType).eInverseRemove(this, SclPackage.TDO_TYPE__EXT_REF, TDOType.class, msgs);
			if (newDoType != null)
				msgs = ((InternalEObject)newDoType).eInverseAdd(this, SclPackage.TDO_TYPE__EXT_REF, TDOType.class, msgs);
			msgs = basicSetDoType(newDoType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TEXT_REF__DO_TYPE, newDoType, newDoType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDAType getDaType() {
		if (daType != null && daType.eIsProxy()) {
			InternalEObject oldDaType = (InternalEObject)daType;
			daType = (TDAType)eResolveProxy(oldDaType);
			if (daType != oldDaType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SclPackage.TEXT_REF__DA_TYPE, oldDaType, daType));
			}
		}
		return daType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDAType basicGetDaType() {
		return daType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDaType(TDAType newDaType, NotificationChain msgs) {
		TDAType oldDaType = daType;
		daType = newDaType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TEXT_REF__DA_TYPE, oldDaType, newDaType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDaType(TDAType newDaType) {
		if (newDaType != daType) {
			NotificationChain msgs = null;
			if (daType != null)
				msgs = ((InternalEObject)daType).eInverseRemove(this, SclPackage.TDA_TYPE__EXT_REF, TDAType.class, msgs);
			if (newDaType != null)
				msgs = ((InternalEObject)newDaType).eInverseAdd(this, SclPackage.TDA_TYPE__EXT_REF, TDAType.class, msgs);
			msgs = basicSetDaType(newDaType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TEXT_REF__DA_TYPE, newDaType, newDaType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SclPackage.TEXT_REF__DATA_SET:
				if (dataSet != null)
					msgs = ((InternalEObject)dataSet).eInverseRemove(this, SclPackage.TDATA_SET__EXT_REF, TDataSet.class, msgs);
				return basicSetDataSet((TDataSet)otherEnd, msgs);
			case SclPackage.TEXT_REF__DO_TYPE:
				if (doType != null)
					msgs = ((InternalEObject)doType).eInverseRemove(this, SclPackage.TDO_TYPE__EXT_REF, TDOType.class, msgs);
				return basicSetDoType((TDOType)otherEnd, msgs);
			case SclPackage.TEXT_REF__DA_TYPE:
				if (daType != null)
					msgs = ((InternalEObject)daType).eInverseRemove(this, SclPackage.TDA_TYPE__EXT_REF, TDAType.class, msgs);
				return basicSetDaType((TDAType)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SclPackage.TEXT_REF__DATA_SET:
				return basicSetDataSet(null, msgs);
			case SclPackage.TEXT_REF__DO_TYPE:
				return basicSetDoType(null, msgs);
			case SclPackage.TEXT_REF__DA_TYPE:
				return basicSetDaType(null, msgs);
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
			case SclPackage.TEXT_REF__DA_NAME:
				return getDaName();
			case SclPackage.TEXT_REF__DO_NAME:
				return getDoName();
			case SclPackage.TEXT_REF__IED_NAME:
				return getIedName();
			case SclPackage.TEXT_REF__INT_ADDR:
				return getIntAddr();
			case SclPackage.TEXT_REF__LD_INST:
				return getLdInst();
			case SclPackage.TEXT_REF__LN_CLASS:
				return getLnClass();
			case SclPackage.TEXT_REF__LN_INST:
				return getLnInst();
			case SclPackage.TEXT_REF__PREFIX:
				return getPrefix();
			case SclPackage.TEXT_REF__DATA_SET:
				if (resolve) return getDataSet();
				return basicGetDataSet();
			case SclPackage.TEXT_REF__DO_TYPE:
				if (resolve) return getDoType();
				return basicGetDoType();
			case SclPackage.TEXT_REF__DA_TYPE:
				if (resolve) return getDaType();
				return basicGetDaType();
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
			case SclPackage.TEXT_REF__DA_NAME:
				setDaName((String)newValue);
				return;
			case SclPackage.TEXT_REF__DO_NAME:
				setDoName((String)newValue);
				return;
			case SclPackage.TEXT_REF__IED_NAME:
				setIedName((String)newValue);
				return;
			case SclPackage.TEXT_REF__INT_ADDR:
				setIntAddr((String)newValue);
				return;
			case SclPackage.TEXT_REF__LD_INST:
				setLdInst((String)newValue);
				return;
			case SclPackage.TEXT_REF__LN_CLASS:
				setLnClass(newValue);
				return;
			case SclPackage.TEXT_REF__LN_INST:
				setLnInst((String)newValue);
				return;
			case SclPackage.TEXT_REF__PREFIX:
				setPrefix((String)newValue);
				return;
			case SclPackage.TEXT_REF__DATA_SET:
				setDataSet((TDataSet)newValue);
				return;
			case SclPackage.TEXT_REF__DO_TYPE:
				setDoType((TDOType)newValue);
				return;
			case SclPackage.TEXT_REF__DA_TYPE:
				setDaType((TDAType)newValue);
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
			case SclPackage.TEXT_REF__DA_NAME:
				setDaName(DA_NAME_EDEFAULT);
				return;
			case SclPackage.TEXT_REF__DO_NAME:
				setDoName(DO_NAME_EDEFAULT);
				return;
			case SclPackage.TEXT_REF__IED_NAME:
				setIedName(IED_NAME_EDEFAULT);
				return;
			case SclPackage.TEXT_REF__INT_ADDR:
				setIntAddr(INT_ADDR_EDEFAULT);
				return;
			case SclPackage.TEXT_REF__LD_INST:
				setLdInst(LD_INST_EDEFAULT);
				return;
			case SclPackage.TEXT_REF__LN_CLASS:
				setLnClass(LN_CLASS_EDEFAULT);
				return;
			case SclPackage.TEXT_REF__LN_INST:
				setLnInst(LN_INST_EDEFAULT);
				return;
			case SclPackage.TEXT_REF__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case SclPackage.TEXT_REF__DATA_SET:
				setDataSet((TDataSet)null);
				return;
			case SclPackage.TEXT_REF__DO_TYPE:
				setDoType((TDOType)null);
				return;
			case SclPackage.TEXT_REF__DA_TYPE:
				setDaType((TDAType)null);
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
			case SclPackage.TEXT_REF__DA_NAME:
				return DA_NAME_EDEFAULT == null ? daName != null : !DA_NAME_EDEFAULT.equals(daName);
			case SclPackage.TEXT_REF__DO_NAME:
				return DO_NAME_EDEFAULT == null ? doName != null : !DO_NAME_EDEFAULT.equals(doName);
			case SclPackage.TEXT_REF__IED_NAME:
				return IED_NAME_EDEFAULT == null ? iedName != null : !IED_NAME_EDEFAULT.equals(iedName);
			case SclPackage.TEXT_REF__INT_ADDR:
				return INT_ADDR_EDEFAULT == null ? intAddr != null : !INT_ADDR_EDEFAULT.equals(intAddr);
			case SclPackage.TEXT_REF__LD_INST:
				return LD_INST_EDEFAULT == null ? ldInst != null : !LD_INST_EDEFAULT.equals(ldInst);
			case SclPackage.TEXT_REF__LN_CLASS:
				return LN_CLASS_EDEFAULT == null ? lnClass != null : !LN_CLASS_EDEFAULT.equals(lnClass);
			case SclPackage.TEXT_REF__LN_INST:
				return LN_INST_EDEFAULT == null ? lnInst != null : !LN_INST_EDEFAULT.equals(lnInst);
			case SclPackage.TEXT_REF__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case SclPackage.TEXT_REF__DATA_SET:
				return dataSet != null;
			case SclPackage.TEXT_REF__DO_TYPE:
				return doType != null;
			case SclPackage.TEXT_REF__DA_TYPE:
				return daType != null;
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
		result.append(", iedName: ");
		result.append(iedName);
		result.append(", intAddr: ");
		result.append(intAddr);
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

} //TExtRefImpl
