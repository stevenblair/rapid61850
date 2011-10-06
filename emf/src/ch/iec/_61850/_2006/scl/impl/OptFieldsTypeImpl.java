/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.OptFieldsType;
import ch.iec._61850._2006.scl.SclPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opt Fields Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.OptFieldsTypeImpl#isBufOvfl <em>Buf Ovfl</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.OptFieldsTypeImpl#isConfigRef <em>Config Ref</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.OptFieldsTypeImpl#isDataRef <em>Data Ref</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.OptFieldsTypeImpl#isDataSet <em>Data Set</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.OptFieldsTypeImpl#isEntryID <em>Entry ID</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.OptFieldsTypeImpl#isReasonCode <em>Reason Code</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.OptFieldsTypeImpl#isSeqNum <em>Seq Num</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.OptFieldsTypeImpl#isTimeStamp <em>Time Stamp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OptFieldsTypeImpl extends EObjectImpl implements OptFieldsType {
	/**
	 * The default value of the '{@link #isBufOvfl() <em>Buf Ovfl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBufOvfl()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BUF_OVFL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBufOvfl() <em>Buf Ovfl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBufOvfl()
	 * @generated
	 * @ordered
	 */
	protected boolean bufOvfl = BUF_OVFL_EDEFAULT;

	/**
	 * This is true if the Buf Ovfl attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bufOvflESet;

	/**
	 * The default value of the '{@link #isConfigRef() <em>Config Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConfigRef()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONFIG_REF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConfigRef() <em>Config Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConfigRef()
	 * @generated
	 * @ordered
	 */
	protected boolean configRef = CONFIG_REF_EDEFAULT;

	/**
	 * This is true if the Config Ref attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean configRefESet;

	/**
	 * The default value of the '{@link #isDataRef() <em>Data Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDataRef()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DATA_REF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDataRef() <em>Data Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDataRef()
	 * @generated
	 * @ordered
	 */
	protected boolean dataRef = DATA_REF_EDEFAULT;

	/**
	 * This is true if the Data Ref attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataRefESet;

	/**
	 * The default value of the '{@link #isDataSet() <em>Data Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDataSet()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DATA_SET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDataSet() <em>Data Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDataSet()
	 * @generated
	 * @ordered
	 */
	protected boolean dataSet = DATA_SET_EDEFAULT;

	/**
	 * This is true if the Data Set attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataSetESet;

	/**
	 * The default value of the '{@link #isEntryID() <em>Entry ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEntryID()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENTRY_ID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEntryID() <em>Entry ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEntryID()
	 * @generated
	 * @ordered
	 */
	protected boolean entryID = ENTRY_ID_EDEFAULT;

	/**
	 * This is true if the Entry ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean entryIDESet;

	/**
	 * The default value of the '{@link #isReasonCode() <em>Reason Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReasonCode()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REASON_CODE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReasonCode() <em>Reason Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReasonCode()
	 * @generated
	 * @ordered
	 */
	protected boolean reasonCode = REASON_CODE_EDEFAULT;

	/**
	 * This is true if the Reason Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reasonCodeESet;

	/**
	 * The default value of the '{@link #isSeqNum() <em>Seq Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSeqNum()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SEQ_NUM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSeqNum() <em>Seq Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSeqNum()
	 * @generated
	 * @ordered
	 */
	protected boolean seqNum = SEQ_NUM_EDEFAULT;

	/**
	 * This is true if the Seq Num attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean seqNumESet;

	/**
	 * The default value of the '{@link #isTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TIME_STAMP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected boolean timeStamp = TIME_STAMP_EDEFAULT;

	/**
	 * This is true if the Time Stamp attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean timeStampESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptFieldsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getOptFieldsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBufOvfl() {
		return bufOvfl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBufOvfl(boolean newBufOvfl) {
		boolean oldBufOvfl = bufOvfl;
		bufOvfl = newBufOvfl;
		boolean oldBufOvflESet = bufOvflESet;
		bufOvflESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.OPT_FIELDS_TYPE__BUF_OVFL, oldBufOvfl, bufOvfl, !oldBufOvflESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBufOvfl() {
		boolean oldBufOvfl = bufOvfl;
		boolean oldBufOvflESet = bufOvflESet;
		bufOvfl = BUF_OVFL_EDEFAULT;
		bufOvflESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.OPT_FIELDS_TYPE__BUF_OVFL, oldBufOvfl, BUF_OVFL_EDEFAULT, oldBufOvflESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBufOvfl() {
		return bufOvflESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConfigRef() {
		return configRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigRef(boolean newConfigRef) {
		boolean oldConfigRef = configRef;
		configRef = newConfigRef;
		boolean oldConfigRefESet = configRefESet;
		configRefESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.OPT_FIELDS_TYPE__CONFIG_REF, oldConfigRef, configRef, !oldConfigRefESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConfigRef() {
		boolean oldConfigRef = configRef;
		boolean oldConfigRefESet = configRefESet;
		configRef = CONFIG_REF_EDEFAULT;
		configRefESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.OPT_FIELDS_TYPE__CONFIG_REF, oldConfigRef, CONFIG_REF_EDEFAULT, oldConfigRefESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConfigRef() {
		return configRefESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDataRef() {
		return dataRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataRef(boolean newDataRef) {
		boolean oldDataRef = dataRef;
		dataRef = newDataRef;
		boolean oldDataRefESet = dataRefESet;
		dataRefESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.OPT_FIELDS_TYPE__DATA_REF, oldDataRef, dataRef, !oldDataRefESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataRef() {
		boolean oldDataRef = dataRef;
		boolean oldDataRefESet = dataRefESet;
		dataRef = DATA_REF_EDEFAULT;
		dataRefESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.OPT_FIELDS_TYPE__DATA_REF, oldDataRef, DATA_REF_EDEFAULT, oldDataRefESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataRef() {
		return dataRefESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDataSet() {
		return dataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSet(boolean newDataSet) {
		boolean oldDataSet = dataSet;
		dataSet = newDataSet;
		boolean oldDataSetESet = dataSetESet;
		dataSetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.OPT_FIELDS_TYPE__DATA_SET, oldDataSet, dataSet, !oldDataSetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataSet() {
		boolean oldDataSet = dataSet;
		boolean oldDataSetESet = dataSetESet;
		dataSet = DATA_SET_EDEFAULT;
		dataSetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.OPT_FIELDS_TYPE__DATA_SET, oldDataSet, DATA_SET_EDEFAULT, oldDataSetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataSet() {
		return dataSetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEntryID() {
		return entryID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryID(boolean newEntryID) {
		boolean oldEntryID = entryID;
		entryID = newEntryID;
		boolean oldEntryIDESet = entryIDESet;
		entryIDESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.OPT_FIELDS_TYPE__ENTRY_ID, oldEntryID, entryID, !oldEntryIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEntryID() {
		boolean oldEntryID = entryID;
		boolean oldEntryIDESet = entryIDESet;
		entryID = ENTRY_ID_EDEFAULT;
		entryIDESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.OPT_FIELDS_TYPE__ENTRY_ID, oldEntryID, ENTRY_ID_EDEFAULT, oldEntryIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEntryID() {
		return entryIDESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReasonCode() {
		return reasonCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReasonCode(boolean newReasonCode) {
		boolean oldReasonCode = reasonCode;
		reasonCode = newReasonCode;
		boolean oldReasonCodeESet = reasonCodeESet;
		reasonCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.OPT_FIELDS_TYPE__REASON_CODE, oldReasonCode, reasonCode, !oldReasonCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReasonCode() {
		boolean oldReasonCode = reasonCode;
		boolean oldReasonCodeESet = reasonCodeESet;
		reasonCode = REASON_CODE_EDEFAULT;
		reasonCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.OPT_FIELDS_TYPE__REASON_CODE, oldReasonCode, REASON_CODE_EDEFAULT, oldReasonCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReasonCode() {
		return reasonCodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSeqNum() {
		return seqNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeqNum(boolean newSeqNum) {
		boolean oldSeqNum = seqNum;
		seqNum = newSeqNum;
		boolean oldSeqNumESet = seqNumESet;
		seqNumESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.OPT_FIELDS_TYPE__SEQ_NUM, oldSeqNum, seqNum, !oldSeqNumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSeqNum() {
		boolean oldSeqNum = seqNum;
		boolean oldSeqNumESet = seqNumESet;
		seqNum = SEQ_NUM_EDEFAULT;
		seqNumESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.OPT_FIELDS_TYPE__SEQ_NUM, oldSeqNum, SEQ_NUM_EDEFAULT, oldSeqNumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSeqNum() {
		return seqNumESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTimeStamp() {
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeStamp(boolean newTimeStamp) {
		boolean oldTimeStamp = timeStamp;
		timeStamp = newTimeStamp;
		boolean oldTimeStampESet = timeStampESet;
		timeStampESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.OPT_FIELDS_TYPE__TIME_STAMP, oldTimeStamp, timeStamp, !oldTimeStampESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTimeStamp() {
		boolean oldTimeStamp = timeStamp;
		boolean oldTimeStampESet = timeStampESet;
		timeStamp = TIME_STAMP_EDEFAULT;
		timeStampESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.OPT_FIELDS_TYPE__TIME_STAMP, oldTimeStamp, TIME_STAMP_EDEFAULT, oldTimeStampESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTimeStamp() {
		return timeStampESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SclPackage.OPT_FIELDS_TYPE__BUF_OVFL:
				return isBufOvfl();
			case SclPackage.OPT_FIELDS_TYPE__CONFIG_REF:
				return isConfigRef();
			case SclPackage.OPT_FIELDS_TYPE__DATA_REF:
				return isDataRef();
			case SclPackage.OPT_FIELDS_TYPE__DATA_SET:
				return isDataSet();
			case SclPackage.OPT_FIELDS_TYPE__ENTRY_ID:
				return isEntryID();
			case SclPackage.OPT_FIELDS_TYPE__REASON_CODE:
				return isReasonCode();
			case SclPackage.OPT_FIELDS_TYPE__SEQ_NUM:
				return isSeqNum();
			case SclPackage.OPT_FIELDS_TYPE__TIME_STAMP:
				return isTimeStamp();
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
			case SclPackage.OPT_FIELDS_TYPE__BUF_OVFL:
				setBufOvfl((Boolean)newValue);
				return;
			case SclPackage.OPT_FIELDS_TYPE__CONFIG_REF:
				setConfigRef((Boolean)newValue);
				return;
			case SclPackage.OPT_FIELDS_TYPE__DATA_REF:
				setDataRef((Boolean)newValue);
				return;
			case SclPackage.OPT_FIELDS_TYPE__DATA_SET:
				setDataSet((Boolean)newValue);
				return;
			case SclPackage.OPT_FIELDS_TYPE__ENTRY_ID:
				setEntryID((Boolean)newValue);
				return;
			case SclPackage.OPT_FIELDS_TYPE__REASON_CODE:
				setReasonCode((Boolean)newValue);
				return;
			case SclPackage.OPT_FIELDS_TYPE__SEQ_NUM:
				setSeqNum((Boolean)newValue);
				return;
			case SclPackage.OPT_FIELDS_TYPE__TIME_STAMP:
				setTimeStamp((Boolean)newValue);
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
			case SclPackage.OPT_FIELDS_TYPE__BUF_OVFL:
				unsetBufOvfl();
				return;
			case SclPackage.OPT_FIELDS_TYPE__CONFIG_REF:
				unsetConfigRef();
				return;
			case SclPackage.OPT_FIELDS_TYPE__DATA_REF:
				unsetDataRef();
				return;
			case SclPackage.OPT_FIELDS_TYPE__DATA_SET:
				unsetDataSet();
				return;
			case SclPackage.OPT_FIELDS_TYPE__ENTRY_ID:
				unsetEntryID();
				return;
			case SclPackage.OPT_FIELDS_TYPE__REASON_CODE:
				unsetReasonCode();
				return;
			case SclPackage.OPT_FIELDS_TYPE__SEQ_NUM:
				unsetSeqNum();
				return;
			case SclPackage.OPT_FIELDS_TYPE__TIME_STAMP:
				unsetTimeStamp();
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
			case SclPackage.OPT_FIELDS_TYPE__BUF_OVFL:
				return isSetBufOvfl();
			case SclPackage.OPT_FIELDS_TYPE__CONFIG_REF:
				return isSetConfigRef();
			case SclPackage.OPT_FIELDS_TYPE__DATA_REF:
				return isSetDataRef();
			case SclPackage.OPT_FIELDS_TYPE__DATA_SET:
				return isSetDataSet();
			case SclPackage.OPT_FIELDS_TYPE__ENTRY_ID:
				return isSetEntryID();
			case SclPackage.OPT_FIELDS_TYPE__REASON_CODE:
				return isSetReasonCode();
			case SclPackage.OPT_FIELDS_TYPE__SEQ_NUM:
				return isSetSeqNum();
			case SclPackage.OPT_FIELDS_TYPE__TIME_STAMP:
				return isSetTimeStamp();
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
		result.append(" (bufOvfl: ");
		if (bufOvflESet) result.append(bufOvfl); else result.append("<unset>");
		result.append(", configRef: ");
		if (configRefESet) result.append(configRef); else result.append("<unset>");
		result.append(", dataRef: ");
		if (dataRefESet) result.append(dataRef); else result.append("<unset>");
		result.append(", dataSet: ");
		if (dataSetESet) result.append(dataSet); else result.append("<unset>");
		result.append(", entryID: ");
		if (entryIDESet) result.append(entryID); else result.append("<unset>");
		result.append(", reasonCode: ");
		if (reasonCodeESet) result.append(reasonCode); else result.append("<unset>");
		result.append(", seqNum: ");
		if (seqNumESet) result.append(seqNum); else result.append("<unset>");
		result.append(", timeStamp: ");
		if (timeStampESet) result.append(timeStamp); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //OptFieldsTypeImpl
