/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TAnyLN;
import ch.iec._61850._2006.scl.TDOI;
import ch.iec._61850._2006.scl.TDataSet;
import ch.iec._61850._2006.scl.TInputs;
import ch.iec._61850._2006.scl.TLogControl;
import ch.iec._61850._2006.scl.TReportControl;

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
 * An implementation of the model object '<em><b>TAny LN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TAnyLNImpl#getDataSet <em>Data Set</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TAnyLNImpl#getReportControl <em>Report Control</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TAnyLNImpl#getLogControl <em>Log Control</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TAnyLNImpl#getDOI <em>DOI</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TAnyLNImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TAnyLNImpl#getLnType <em>Ln Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TAnyLNImpl extends TUnNamingImpl implements TAnyLN {
	/**
	 * The cached value of the '{@link #getDataSet() <em>Data Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSet()
	 * @generated
	 * @ordered
	 */
	protected EList<TDataSet> dataSet;

	/**
	 * The cached value of the '{@link #getReportControl() <em>Report Control</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportControl()
	 * @generated
	 * @ordered
	 */
	protected EList<TReportControl> reportControl;

	/**
	 * The cached value of the '{@link #getLogControl() <em>Log Control</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogControl()
	 * @generated
	 * @ordered
	 */
	protected EList<TLogControl> logControl;

	/**
	 * The cached value of the '{@link #getDOI() <em>DOI</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDOI()
	 * @generated
	 * @ordered
	 */
	protected EList<TDOI> dOI;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected TInputs inputs;

	/**
	 * The default value of the '{@link #getLnType() <em>Ln Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLnType()
	 * @generated
	 * @ordered
	 */
	protected static final String LN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLnType() <em>Ln Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLnType()
	 * @generated
	 * @ordered
	 */
	protected String lnType = LN_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TAnyLNImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTAnyLN();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TDataSet> getDataSet() {
		if (dataSet == null) {
			dataSet = new EObjectContainmentEList<TDataSet>(TDataSet.class, this, SclPackage.TANY_LN__DATA_SET);
		}
		return dataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TReportControl> getReportControl() {
		if (reportControl == null) {
			reportControl = new EObjectContainmentEList<TReportControl>(TReportControl.class, this, SclPackage.TANY_LN__REPORT_CONTROL);
		}
		return reportControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TLogControl> getLogControl() {
		if (logControl == null) {
			logControl = new EObjectContainmentEList<TLogControl>(TLogControl.class, this, SclPackage.TANY_LN__LOG_CONTROL);
		}
		return logControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TDOI> getDOI() {
		if (dOI == null) {
			dOI = new EObjectContainmentEList<TDOI>(TDOI.class, this, SclPackage.TANY_LN__DOI);
		}
		return dOI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TInputs getInputs() {
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputs(TInputs newInputs, NotificationChain msgs) {
		TInputs oldInputs = inputs;
		inputs = newInputs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TANY_LN__INPUTS, oldInputs, newInputs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputs(TInputs newInputs) {
		if (newInputs != inputs) {
			NotificationChain msgs = null;
			if (inputs != null)
				msgs = ((InternalEObject)inputs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TANY_LN__INPUTS, null, msgs);
			if (newInputs != null)
				msgs = ((InternalEObject)newInputs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TANY_LN__INPUTS, null, msgs);
			msgs = basicSetInputs(newInputs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TANY_LN__INPUTS, newInputs, newInputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLnType() {
		return lnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLnType(String newLnType) {
		String oldLnType = lnType;
		lnType = newLnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TANY_LN__LN_TYPE, oldLnType, lnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SclPackage.TANY_LN__DATA_SET:
				return ((InternalEList<?>)getDataSet()).basicRemove(otherEnd, msgs);
			case SclPackage.TANY_LN__REPORT_CONTROL:
				return ((InternalEList<?>)getReportControl()).basicRemove(otherEnd, msgs);
			case SclPackage.TANY_LN__LOG_CONTROL:
				return ((InternalEList<?>)getLogControl()).basicRemove(otherEnd, msgs);
			case SclPackage.TANY_LN__DOI:
				return ((InternalEList<?>)getDOI()).basicRemove(otherEnd, msgs);
			case SclPackage.TANY_LN__INPUTS:
				return basicSetInputs(null, msgs);
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
			case SclPackage.TANY_LN__DATA_SET:
				return getDataSet();
			case SclPackage.TANY_LN__REPORT_CONTROL:
				return getReportControl();
			case SclPackage.TANY_LN__LOG_CONTROL:
				return getLogControl();
			case SclPackage.TANY_LN__DOI:
				return getDOI();
			case SclPackage.TANY_LN__INPUTS:
				return getInputs();
			case SclPackage.TANY_LN__LN_TYPE:
				return getLnType();
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
			case SclPackage.TANY_LN__DATA_SET:
				getDataSet().clear();
				getDataSet().addAll((Collection<? extends TDataSet>)newValue);
				return;
			case SclPackage.TANY_LN__REPORT_CONTROL:
				getReportControl().clear();
				getReportControl().addAll((Collection<? extends TReportControl>)newValue);
				return;
			case SclPackage.TANY_LN__LOG_CONTROL:
				getLogControl().clear();
				getLogControl().addAll((Collection<? extends TLogControl>)newValue);
				return;
			case SclPackage.TANY_LN__DOI:
				getDOI().clear();
				getDOI().addAll((Collection<? extends TDOI>)newValue);
				return;
			case SclPackage.TANY_LN__INPUTS:
				setInputs((TInputs)newValue);
				return;
			case SclPackage.TANY_LN__LN_TYPE:
				setLnType((String)newValue);
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
			case SclPackage.TANY_LN__DATA_SET:
				getDataSet().clear();
				return;
			case SclPackage.TANY_LN__REPORT_CONTROL:
				getReportControl().clear();
				return;
			case SclPackage.TANY_LN__LOG_CONTROL:
				getLogControl().clear();
				return;
			case SclPackage.TANY_LN__DOI:
				getDOI().clear();
				return;
			case SclPackage.TANY_LN__INPUTS:
				setInputs((TInputs)null);
				return;
			case SclPackage.TANY_LN__LN_TYPE:
				setLnType(LN_TYPE_EDEFAULT);
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
			case SclPackage.TANY_LN__DATA_SET:
				return dataSet != null && !dataSet.isEmpty();
			case SclPackage.TANY_LN__REPORT_CONTROL:
				return reportControl != null && !reportControl.isEmpty();
			case SclPackage.TANY_LN__LOG_CONTROL:
				return logControl != null && !logControl.isEmpty();
			case SclPackage.TANY_LN__DOI:
				return dOI != null && !dOI.isEmpty();
			case SclPackage.TANY_LN__INPUTS:
				return inputs != null;
			case SclPackage.TANY_LN__LN_TYPE:
				return LN_TYPE_EDEFAULT == null ? lnType != null : !LN_TYPE_EDEFAULT.equals(lnType);
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
		result.append(" (lnType: ");
		result.append(lnType);
		result.append(')');
		return result.toString();
	}

} //TAnyLNImpl
