/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TClientServices;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TClient Services</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TClientServicesImpl#isBufReport <em>Buf Report</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TClientServicesImpl#isGoose <em>Goose</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TClientServicesImpl#isGsse <em>Gsse</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TClientServicesImpl#isReadLog <em>Read Log</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TClientServicesImpl#isUnbufReport <em>Unbuf Report</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TClientServicesImpl extends EObjectImpl implements TClientServices {
	/**
	 * The default value of the '{@link #isBufReport() <em>Buf Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBufReport()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BUF_REPORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBufReport() <em>Buf Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBufReport()
	 * @generated
	 * @ordered
	 */
	protected boolean bufReport = BUF_REPORT_EDEFAULT;

	/**
	 * This is true if the Buf Report attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bufReportESet;

	/**
	 * The default value of the '{@link #isGoose() <em>Goose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGoose()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GOOSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGoose() <em>Goose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGoose()
	 * @generated
	 * @ordered
	 */
	protected boolean goose = GOOSE_EDEFAULT;

	/**
	 * This is true if the Goose attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gooseESet;

	/**
	 * The default value of the '{@link #isGsse() <em>Gsse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGsse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GSSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGsse() <em>Gsse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGsse()
	 * @generated
	 * @ordered
	 */
	protected boolean gsse = GSSE_EDEFAULT;

	/**
	 * This is true if the Gsse attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gsseESet;

	/**
	 * The default value of the '{@link #isReadLog() <em>Read Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadLog()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_LOG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadLog() <em>Read Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadLog()
	 * @generated
	 * @ordered
	 */
	protected boolean readLog = READ_LOG_EDEFAULT;

	/**
	 * This is true if the Read Log attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean readLogESet;

	/**
	 * The default value of the '{@link #isUnbufReport() <em>Unbuf Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnbufReport()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNBUF_REPORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnbufReport() <em>Unbuf Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnbufReport()
	 * @generated
	 * @ordered
	 */
	protected boolean unbufReport = UNBUF_REPORT_EDEFAULT;

	/**
	 * This is true if the Unbuf Report attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unbufReportESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TClientServicesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTClientServices();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBufReport() {
		return bufReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBufReport(boolean newBufReport) {
		boolean oldBufReport = bufReport;
		bufReport = newBufReport;
		boolean oldBufReportESet = bufReportESet;
		bufReportESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TCLIENT_SERVICES__BUF_REPORT, oldBufReport, bufReport, !oldBufReportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBufReport() {
		boolean oldBufReport = bufReport;
		boolean oldBufReportESet = bufReportESet;
		bufReport = BUF_REPORT_EDEFAULT;
		bufReportESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TCLIENT_SERVICES__BUF_REPORT, oldBufReport, BUF_REPORT_EDEFAULT, oldBufReportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBufReport() {
		return bufReportESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGoose() {
		return goose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoose(boolean newGoose) {
		boolean oldGoose = goose;
		goose = newGoose;
		boolean oldGooseESet = gooseESet;
		gooseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TCLIENT_SERVICES__GOOSE, oldGoose, goose, !oldGooseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGoose() {
		boolean oldGoose = goose;
		boolean oldGooseESet = gooseESet;
		goose = GOOSE_EDEFAULT;
		gooseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TCLIENT_SERVICES__GOOSE, oldGoose, GOOSE_EDEFAULT, oldGooseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGoose() {
		return gooseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGsse() {
		return gsse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGsse(boolean newGsse) {
		boolean oldGsse = gsse;
		gsse = newGsse;
		boolean oldGsseESet = gsseESet;
		gsseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TCLIENT_SERVICES__GSSE, oldGsse, gsse, !oldGsseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGsse() {
		boolean oldGsse = gsse;
		boolean oldGsseESet = gsseESet;
		gsse = GSSE_EDEFAULT;
		gsseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TCLIENT_SERVICES__GSSE, oldGsse, GSSE_EDEFAULT, oldGsseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGsse() {
		return gsseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadLog() {
		return readLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadLog(boolean newReadLog) {
		boolean oldReadLog = readLog;
		readLog = newReadLog;
		boolean oldReadLogESet = readLogESet;
		readLogESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TCLIENT_SERVICES__READ_LOG, oldReadLog, readLog, !oldReadLogESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReadLog() {
		boolean oldReadLog = readLog;
		boolean oldReadLogESet = readLogESet;
		readLog = READ_LOG_EDEFAULT;
		readLogESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TCLIENT_SERVICES__READ_LOG, oldReadLog, READ_LOG_EDEFAULT, oldReadLogESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReadLog() {
		return readLogESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnbufReport() {
		return unbufReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnbufReport(boolean newUnbufReport) {
		boolean oldUnbufReport = unbufReport;
		unbufReport = newUnbufReport;
		boolean oldUnbufReportESet = unbufReportESet;
		unbufReportESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TCLIENT_SERVICES__UNBUF_REPORT, oldUnbufReport, unbufReport, !oldUnbufReportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnbufReport() {
		boolean oldUnbufReport = unbufReport;
		boolean oldUnbufReportESet = unbufReportESet;
		unbufReport = UNBUF_REPORT_EDEFAULT;
		unbufReportESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TCLIENT_SERVICES__UNBUF_REPORT, oldUnbufReport, UNBUF_REPORT_EDEFAULT, oldUnbufReportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnbufReport() {
		return unbufReportESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SclPackage.TCLIENT_SERVICES__BUF_REPORT:
				return isBufReport();
			case SclPackage.TCLIENT_SERVICES__GOOSE:
				return isGoose();
			case SclPackage.TCLIENT_SERVICES__GSSE:
				return isGsse();
			case SclPackage.TCLIENT_SERVICES__READ_LOG:
				return isReadLog();
			case SclPackage.TCLIENT_SERVICES__UNBUF_REPORT:
				return isUnbufReport();
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
			case SclPackage.TCLIENT_SERVICES__BUF_REPORT:
				setBufReport((Boolean)newValue);
				return;
			case SclPackage.TCLIENT_SERVICES__GOOSE:
				setGoose((Boolean)newValue);
				return;
			case SclPackage.TCLIENT_SERVICES__GSSE:
				setGsse((Boolean)newValue);
				return;
			case SclPackage.TCLIENT_SERVICES__READ_LOG:
				setReadLog((Boolean)newValue);
				return;
			case SclPackage.TCLIENT_SERVICES__UNBUF_REPORT:
				setUnbufReport((Boolean)newValue);
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
			case SclPackage.TCLIENT_SERVICES__BUF_REPORT:
				unsetBufReport();
				return;
			case SclPackage.TCLIENT_SERVICES__GOOSE:
				unsetGoose();
				return;
			case SclPackage.TCLIENT_SERVICES__GSSE:
				unsetGsse();
				return;
			case SclPackage.TCLIENT_SERVICES__READ_LOG:
				unsetReadLog();
				return;
			case SclPackage.TCLIENT_SERVICES__UNBUF_REPORT:
				unsetUnbufReport();
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
			case SclPackage.TCLIENT_SERVICES__BUF_REPORT:
				return isSetBufReport();
			case SclPackage.TCLIENT_SERVICES__GOOSE:
				return isSetGoose();
			case SclPackage.TCLIENT_SERVICES__GSSE:
				return isSetGsse();
			case SclPackage.TCLIENT_SERVICES__READ_LOG:
				return isSetReadLog();
			case SclPackage.TCLIENT_SERVICES__UNBUF_REPORT:
				return isSetUnbufReport();
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
		result.append(" (bufReport: ");
		if (bufReportESet) result.append(bufReport); else result.append("<unset>");
		result.append(", goose: ");
		if (gooseESet) result.append(goose); else result.append("<unset>");
		result.append(", gsse: ");
		if (gsseESet) result.append(gsse); else result.append("<unset>");
		result.append(", readLog: ");
		if (readLogESet) result.append(readLog); else result.append("<unset>");
		result.append(", unbufReport: ");
		if (unbufReportESet) result.append(unbufReport); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TClientServicesImpl
