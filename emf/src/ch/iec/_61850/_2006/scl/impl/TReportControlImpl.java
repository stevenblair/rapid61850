/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.OptFieldsType;
import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TReportControl;
import ch.iec._61850._2006.scl.TRptEnabled;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TReport Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TReportControlImpl#getOptFields <em>Opt Fields</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TReportControlImpl#getRptEnabled <em>Rpt Enabled</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TReportControlImpl#isBuffered <em>Buffered</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TReportControlImpl#getBufTime <em>Buf Time</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TReportControlImpl#getConfRev <em>Conf Rev</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TReportControlImpl#getRptID <em>Rpt ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TReportControlImpl extends TControlWithTriggerOptImpl implements TReportControl {
	/**
	 * The cached value of the '{@link #getOptFields() <em>Opt Fields</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptFields()
	 * @generated
	 * @ordered
	 */
	protected OptFieldsType optFields;

	/**
	 * The cached value of the '{@link #getRptEnabled() <em>Rpt Enabled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRptEnabled()
	 * @generated
	 * @ordered
	 */
	protected TRptEnabled rptEnabled;

	/**
	 * The default value of the '{@link #isBuffered() <em>Buffered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBuffered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BUFFERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBuffered() <em>Buffered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBuffered()
	 * @generated
	 * @ordered
	 */
	protected boolean buffered = BUFFERED_EDEFAULT;

	/**
	 * This is true if the Buffered attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bufferedESet;

	/**
	 * The default value of the '{@link #getBufTime() <em>Buf Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufTime()
	 * @generated
	 * @ordered
	 */
	protected static final long BUF_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getBufTime() <em>Buf Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufTime()
	 * @generated
	 * @ordered
	 */
	protected long bufTime = BUF_TIME_EDEFAULT;

	/**
	 * This is true if the Buf Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bufTimeESet;

	/**
	 * The default value of the '{@link #getConfRev() <em>Conf Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfRev()
	 * @generated
	 * @ordered
	 */
	protected static final long CONF_REV_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getConfRev() <em>Conf Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfRev()
	 * @generated
	 * @ordered
	 */
	protected long confRev = CONF_REV_EDEFAULT;

	/**
	 * This is true if the Conf Rev attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean confRevESet;

	/**
	 * The default value of the '{@link #getRptID() <em>Rpt ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRptID()
	 * @generated
	 * @ordered
	 */
	protected static final String RPT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRptID() <em>Rpt ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRptID()
	 * @generated
	 * @ordered
	 */
	protected String rptID = RPT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TReportControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTReportControl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptFieldsType getOptFields() {
		return optFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptFields(OptFieldsType newOptFields, NotificationChain msgs) {
		OptFieldsType oldOptFields = optFields;
		optFields = newOptFields;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TREPORT_CONTROL__OPT_FIELDS, oldOptFields, newOptFields);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptFields(OptFieldsType newOptFields) {
		if (newOptFields != optFields) {
			NotificationChain msgs = null;
			if (optFields != null)
				msgs = ((InternalEObject)optFields).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TREPORT_CONTROL__OPT_FIELDS, null, msgs);
			if (newOptFields != null)
				msgs = ((InternalEObject)newOptFields).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TREPORT_CONTROL__OPT_FIELDS, null, msgs);
			msgs = basicSetOptFields(newOptFields, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TREPORT_CONTROL__OPT_FIELDS, newOptFields, newOptFields));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRptEnabled getRptEnabled() {
		return rptEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRptEnabled(TRptEnabled newRptEnabled, NotificationChain msgs) {
		TRptEnabled oldRptEnabled = rptEnabled;
		rptEnabled = newRptEnabled;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TREPORT_CONTROL__RPT_ENABLED, oldRptEnabled, newRptEnabled);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRptEnabled(TRptEnabled newRptEnabled) {
		if (newRptEnabled != rptEnabled) {
			NotificationChain msgs = null;
			if (rptEnabled != null)
				msgs = ((InternalEObject)rptEnabled).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TREPORT_CONTROL__RPT_ENABLED, null, msgs);
			if (newRptEnabled != null)
				msgs = ((InternalEObject)newRptEnabled).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TREPORT_CONTROL__RPT_ENABLED, null, msgs);
			msgs = basicSetRptEnabled(newRptEnabled, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TREPORT_CONTROL__RPT_ENABLED, newRptEnabled, newRptEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBuffered() {
		return buffered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuffered(boolean newBuffered) {
		boolean oldBuffered = buffered;
		buffered = newBuffered;
		boolean oldBufferedESet = bufferedESet;
		bufferedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TREPORT_CONTROL__BUFFERED, oldBuffered, buffered, !oldBufferedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBuffered() {
		boolean oldBuffered = buffered;
		boolean oldBufferedESet = bufferedESet;
		buffered = BUFFERED_EDEFAULT;
		bufferedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TREPORT_CONTROL__BUFFERED, oldBuffered, BUFFERED_EDEFAULT, oldBufferedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBuffered() {
		return bufferedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getBufTime() {
		return bufTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBufTime(long newBufTime) {
		long oldBufTime = bufTime;
		bufTime = newBufTime;
		boolean oldBufTimeESet = bufTimeESet;
		bufTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TREPORT_CONTROL__BUF_TIME, oldBufTime, bufTime, !oldBufTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBufTime() {
		long oldBufTime = bufTime;
		boolean oldBufTimeESet = bufTimeESet;
		bufTime = BUF_TIME_EDEFAULT;
		bufTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TREPORT_CONTROL__BUF_TIME, oldBufTime, BUF_TIME_EDEFAULT, oldBufTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBufTime() {
		return bufTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getConfRev() {
		return confRev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfRev(long newConfRev) {
		long oldConfRev = confRev;
		confRev = newConfRev;
		boolean oldConfRevESet = confRevESet;
		confRevESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TREPORT_CONTROL__CONF_REV, oldConfRev, confRev, !oldConfRevESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConfRev() {
		long oldConfRev = confRev;
		boolean oldConfRevESet = confRevESet;
		confRev = CONF_REV_EDEFAULT;
		confRevESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TREPORT_CONTROL__CONF_REV, oldConfRev, CONF_REV_EDEFAULT, oldConfRevESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConfRev() {
		return confRevESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRptID() {
		return rptID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRptID(String newRptID) {
		String oldRptID = rptID;
		rptID = newRptID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TREPORT_CONTROL__RPT_ID, oldRptID, rptID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SclPackage.TREPORT_CONTROL__OPT_FIELDS:
				return basicSetOptFields(null, msgs);
			case SclPackage.TREPORT_CONTROL__RPT_ENABLED:
				return basicSetRptEnabled(null, msgs);
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
			case SclPackage.TREPORT_CONTROL__OPT_FIELDS:
				return getOptFields();
			case SclPackage.TREPORT_CONTROL__RPT_ENABLED:
				return getRptEnabled();
			case SclPackage.TREPORT_CONTROL__BUFFERED:
				return isBuffered();
			case SclPackage.TREPORT_CONTROL__BUF_TIME:
				return getBufTime();
			case SclPackage.TREPORT_CONTROL__CONF_REV:
				return getConfRev();
			case SclPackage.TREPORT_CONTROL__RPT_ID:
				return getRptID();
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
			case SclPackage.TREPORT_CONTROL__OPT_FIELDS:
				setOptFields((OptFieldsType)newValue);
				return;
			case SclPackage.TREPORT_CONTROL__RPT_ENABLED:
				setRptEnabled((TRptEnabled)newValue);
				return;
			case SclPackage.TREPORT_CONTROL__BUFFERED:
				setBuffered((Boolean)newValue);
				return;
			case SclPackage.TREPORT_CONTROL__BUF_TIME:
				setBufTime((Long)newValue);
				return;
			case SclPackage.TREPORT_CONTROL__CONF_REV:
				setConfRev((Long)newValue);
				return;
			case SclPackage.TREPORT_CONTROL__RPT_ID:
				setRptID((String)newValue);
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
			case SclPackage.TREPORT_CONTROL__OPT_FIELDS:
				setOptFields((OptFieldsType)null);
				return;
			case SclPackage.TREPORT_CONTROL__RPT_ENABLED:
				setRptEnabled((TRptEnabled)null);
				return;
			case SclPackage.TREPORT_CONTROL__BUFFERED:
				unsetBuffered();
				return;
			case SclPackage.TREPORT_CONTROL__BUF_TIME:
				unsetBufTime();
				return;
			case SclPackage.TREPORT_CONTROL__CONF_REV:
				unsetConfRev();
				return;
			case SclPackage.TREPORT_CONTROL__RPT_ID:
				setRptID(RPT_ID_EDEFAULT);
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
			case SclPackage.TREPORT_CONTROL__OPT_FIELDS:
				return optFields != null;
			case SclPackage.TREPORT_CONTROL__RPT_ENABLED:
				return rptEnabled != null;
			case SclPackage.TREPORT_CONTROL__BUFFERED:
				return isSetBuffered();
			case SclPackage.TREPORT_CONTROL__BUF_TIME:
				return isSetBufTime();
			case SclPackage.TREPORT_CONTROL__CONF_REV:
				return isSetConfRev();
			case SclPackage.TREPORT_CONTROL__RPT_ID:
				return RPT_ID_EDEFAULT == null ? rptID != null : !RPT_ID_EDEFAULT.equals(rptID);
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
		result.append(" (buffered: ");
		if (bufferedESet) result.append(buffered); else result.append("<unset>");
		result.append(", bufTime: ");
		if (bufTimeESet) result.append(bufTime); else result.append("<unset>");
		result.append(", confRev: ");
		if (confRevESet) result.append(confRev); else result.append("<unset>");
		result.append(", rptID: ");
		result.append(rptID);
		result.append(')');
		return result.toString();
	}

} //TReportControlImpl
