/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.SettingGroupsType;
import ch.iec._61850._2006.scl.TClientServices;
import ch.iec._61850._2006.scl.TConfLNs;
import ch.iec._61850._2006.scl.TGSESettings;
import ch.iec._61850._2006.scl.TLogSettings;
import ch.iec._61850._2006.scl.TReportSettings;
import ch.iec._61850._2006.scl.TSMVSettings;
import ch.iec._61850._2006.scl.TServiceWithMax;
import ch.iec._61850._2006.scl.TServiceWithMaxAndMaxAttributes;
import ch.iec._61850._2006.scl.TServiceWithMaxAndMaxAttributesAndModify;
import ch.iec._61850._2006.scl.TServiceYesNo;
import ch.iec._61850._2006.scl.TServices;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TServices</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TServicesImpl#getDynAssociation <em>Dyn Association</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TServicesImpl#getSettingGroups <em>Setting Groups</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TServicesImpl#getGetDirectory <em>Get Directory</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TServicesImpl#getGetDataObjectDefinition <em>Get Data Object Definition</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TServicesImpl#getDataObjectDirectory <em>Data Object Directory</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TServicesImpl#getGetDataSetValue <em>Get Data Set Value</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TServicesImpl#getSetDataSetValue <em>Set Data Set Value</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TServicesImpl#getDataSetDirectory <em>Data Set Directory</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TServicesImpl#getConfDataSet <em>Conf Data Set</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TServicesImpl#getDynDataSet <em>Dyn Data Set</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TServicesImpl#getReadWrite <em>Read Write</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TServicesImpl#getTimerActivatedControl <em>Timer Activated Control</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TServicesImpl#getConfReportControl <em>Conf Report Control</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TServicesImpl#getGetCBValues <em>Get CB Values</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TServicesImpl#getConfLogControl <em>Conf Log Control</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TServicesImpl#getReportSettings <em>Report Settings</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TServicesImpl#getLogSettings <em>Log Settings</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TServicesImpl#getGSESettings <em>GSE Settings</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TServicesImpl#getSMVSettings <em>SMV Settings</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TServicesImpl#getGSEDir <em>GSE Dir</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TServicesImpl#getGOOSE <em>GOOSE</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TServicesImpl#getGSSE <em>GSSE</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TServicesImpl#getFileHandling <em>File Handling</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TServicesImpl#getConfLNs <em>Conf LNs</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TServicesImpl#getClientServices <em>Client Services</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TServicesImpl extends EObjectImpl implements TServices {
	/**
	 * The cached value of the '{@link #getDynAssociation() <em>Dyn Association</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynAssociation()
	 * @generated
	 * @ordered
	 */
	protected TServiceYesNo dynAssociation;

	/**
	 * The cached value of the '{@link #getSettingGroups() <em>Setting Groups</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettingGroups()
	 * @generated
	 * @ordered
	 */
	protected SettingGroupsType settingGroups;

	/**
	 * The cached value of the '{@link #getGetDirectory() <em>Get Directory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetDirectory()
	 * @generated
	 * @ordered
	 */
	protected TServiceYesNo getDirectory;

	/**
	 * The cached value of the '{@link #getGetDataObjectDefinition() <em>Get Data Object Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetDataObjectDefinition()
	 * @generated
	 * @ordered
	 */
	protected TServiceYesNo getDataObjectDefinition;

	/**
	 * The cached value of the '{@link #getDataObjectDirectory() <em>Data Object Directory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataObjectDirectory()
	 * @generated
	 * @ordered
	 */
	protected TServiceYesNo dataObjectDirectory;

	/**
	 * The cached value of the '{@link #getGetDataSetValue() <em>Get Data Set Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetDataSetValue()
	 * @generated
	 * @ordered
	 */
	protected TServiceYesNo getDataSetValue;

	/**
	 * The cached value of the '{@link #getSetDataSetValue() <em>Set Data Set Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetDataSetValue()
	 * @generated
	 * @ordered
	 */
	protected TServiceYesNo setDataSetValue;

	/**
	 * The cached value of the '{@link #getDataSetDirectory() <em>Data Set Directory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSetDirectory()
	 * @generated
	 * @ordered
	 */
	protected TServiceYesNo dataSetDirectory;

	/**
	 * The cached value of the '{@link #getConfDataSet() <em>Conf Data Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfDataSet()
	 * @generated
	 * @ordered
	 */
	protected TServiceWithMaxAndMaxAttributesAndModify confDataSet;

	/**
	 * The cached value of the '{@link #getDynDataSet() <em>Dyn Data Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynDataSet()
	 * @generated
	 * @ordered
	 */
	protected TServiceWithMaxAndMaxAttributes dynDataSet;

	/**
	 * The cached value of the '{@link #getReadWrite() <em>Read Write</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadWrite()
	 * @generated
	 * @ordered
	 */
	protected TServiceYesNo readWrite;

	/**
	 * The cached value of the '{@link #getTimerActivatedControl() <em>Timer Activated Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimerActivatedControl()
	 * @generated
	 * @ordered
	 */
	protected TServiceYesNo timerActivatedControl;

	/**
	 * The cached value of the '{@link #getConfReportControl() <em>Conf Report Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfReportControl()
	 * @generated
	 * @ordered
	 */
	protected TServiceWithMax confReportControl;

	/**
	 * The cached value of the '{@link #getGetCBValues() <em>Get CB Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetCBValues()
	 * @generated
	 * @ordered
	 */
	protected TServiceYesNo getCBValues;

	/**
	 * The cached value of the '{@link #getConfLogControl() <em>Conf Log Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfLogControl()
	 * @generated
	 * @ordered
	 */
	protected TServiceWithMax confLogControl;

	/**
	 * The cached value of the '{@link #getReportSettings() <em>Report Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportSettings()
	 * @generated
	 * @ordered
	 */
	protected TReportSettings reportSettings;

	/**
	 * The cached value of the '{@link #getLogSettings() <em>Log Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogSettings()
	 * @generated
	 * @ordered
	 */
	protected TLogSettings logSettings;

	/**
	 * The cached value of the '{@link #getGSESettings() <em>GSE Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGSESettings()
	 * @generated
	 * @ordered
	 */
	protected TGSESettings gSESettings;

	/**
	 * The cached value of the '{@link #getSMVSettings() <em>SMV Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSMVSettings()
	 * @generated
	 * @ordered
	 */
	protected TSMVSettings sMVSettings;

	/**
	 * The cached value of the '{@link #getGSEDir() <em>GSE Dir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGSEDir()
	 * @generated
	 * @ordered
	 */
	protected TServiceYesNo gSEDir;

	/**
	 * The cached value of the '{@link #getGOOSE() <em>GOOSE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGOOSE()
	 * @generated
	 * @ordered
	 */
	protected TServiceWithMax gOOSE;

	/**
	 * The cached value of the '{@link #getGSSE() <em>GSSE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGSSE()
	 * @generated
	 * @ordered
	 */
	protected TServiceWithMax gSSE;

	/**
	 * The cached value of the '{@link #getFileHandling() <em>File Handling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileHandling()
	 * @generated
	 * @ordered
	 */
	protected TServiceYesNo fileHandling;

	/**
	 * The cached value of the '{@link #getConfLNs() <em>Conf LNs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfLNs()
	 * @generated
	 * @ordered
	 */
	protected TConfLNs confLNs;

	/**
	 * The cached value of the '{@link #getClientServices() <em>Client Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientServices()
	 * @generated
	 * @ordered
	 */
	protected TClientServices clientServices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TServicesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTServices();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceYesNo getDynAssociation() {
		return dynAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDynAssociation(TServiceYesNo newDynAssociation, NotificationChain msgs) {
		TServiceYesNo oldDynAssociation = dynAssociation;
		dynAssociation = newDynAssociation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__DYN_ASSOCIATION, oldDynAssociation, newDynAssociation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynAssociation(TServiceYesNo newDynAssociation) {
		if (newDynAssociation != dynAssociation) {
			NotificationChain msgs = null;
			if (dynAssociation != null)
				msgs = ((InternalEObject)dynAssociation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__DYN_ASSOCIATION, null, msgs);
			if (newDynAssociation != null)
				msgs = ((InternalEObject)newDynAssociation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__DYN_ASSOCIATION, null, msgs);
			msgs = basicSetDynAssociation(newDynAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__DYN_ASSOCIATION, newDynAssociation, newDynAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SettingGroupsType getSettingGroups() {
		return settingGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSettingGroups(SettingGroupsType newSettingGroups, NotificationChain msgs) {
		SettingGroupsType oldSettingGroups = settingGroups;
		settingGroups = newSettingGroups;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__SETTING_GROUPS, oldSettingGroups, newSettingGroups);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSettingGroups(SettingGroupsType newSettingGroups) {
		if (newSettingGroups != settingGroups) {
			NotificationChain msgs = null;
			if (settingGroups != null)
				msgs = ((InternalEObject)settingGroups).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__SETTING_GROUPS, null, msgs);
			if (newSettingGroups != null)
				msgs = ((InternalEObject)newSettingGroups).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__SETTING_GROUPS, null, msgs);
			msgs = basicSetSettingGroups(newSettingGroups, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__SETTING_GROUPS, newSettingGroups, newSettingGroups));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceYesNo getGetDirectory() {
		return getDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetDirectory(TServiceYesNo newGetDirectory, NotificationChain msgs) {
		TServiceYesNo oldGetDirectory = getDirectory;
		getDirectory = newGetDirectory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__GET_DIRECTORY, oldGetDirectory, newGetDirectory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetDirectory(TServiceYesNo newGetDirectory) {
		if (newGetDirectory != getDirectory) {
			NotificationChain msgs = null;
			if (getDirectory != null)
				msgs = ((InternalEObject)getDirectory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__GET_DIRECTORY, null, msgs);
			if (newGetDirectory != null)
				msgs = ((InternalEObject)newGetDirectory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__GET_DIRECTORY, null, msgs);
			msgs = basicSetGetDirectory(newGetDirectory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__GET_DIRECTORY, newGetDirectory, newGetDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceYesNo getGetDataObjectDefinition() {
		return getDataObjectDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetDataObjectDefinition(TServiceYesNo newGetDataObjectDefinition, NotificationChain msgs) {
		TServiceYesNo oldGetDataObjectDefinition = getDataObjectDefinition;
		getDataObjectDefinition = newGetDataObjectDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__GET_DATA_OBJECT_DEFINITION, oldGetDataObjectDefinition, newGetDataObjectDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetDataObjectDefinition(TServiceYesNo newGetDataObjectDefinition) {
		if (newGetDataObjectDefinition != getDataObjectDefinition) {
			NotificationChain msgs = null;
			if (getDataObjectDefinition != null)
				msgs = ((InternalEObject)getDataObjectDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__GET_DATA_OBJECT_DEFINITION, null, msgs);
			if (newGetDataObjectDefinition != null)
				msgs = ((InternalEObject)newGetDataObjectDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__GET_DATA_OBJECT_DEFINITION, null, msgs);
			msgs = basicSetGetDataObjectDefinition(newGetDataObjectDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__GET_DATA_OBJECT_DEFINITION, newGetDataObjectDefinition, newGetDataObjectDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceYesNo getDataObjectDirectory() {
		return dataObjectDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataObjectDirectory(TServiceYesNo newDataObjectDirectory, NotificationChain msgs) {
		TServiceYesNo oldDataObjectDirectory = dataObjectDirectory;
		dataObjectDirectory = newDataObjectDirectory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__DATA_OBJECT_DIRECTORY, oldDataObjectDirectory, newDataObjectDirectory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataObjectDirectory(TServiceYesNo newDataObjectDirectory) {
		if (newDataObjectDirectory != dataObjectDirectory) {
			NotificationChain msgs = null;
			if (dataObjectDirectory != null)
				msgs = ((InternalEObject)dataObjectDirectory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__DATA_OBJECT_DIRECTORY, null, msgs);
			if (newDataObjectDirectory != null)
				msgs = ((InternalEObject)newDataObjectDirectory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__DATA_OBJECT_DIRECTORY, null, msgs);
			msgs = basicSetDataObjectDirectory(newDataObjectDirectory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__DATA_OBJECT_DIRECTORY, newDataObjectDirectory, newDataObjectDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceYesNo getGetDataSetValue() {
		return getDataSetValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetDataSetValue(TServiceYesNo newGetDataSetValue, NotificationChain msgs) {
		TServiceYesNo oldGetDataSetValue = getDataSetValue;
		getDataSetValue = newGetDataSetValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__GET_DATA_SET_VALUE, oldGetDataSetValue, newGetDataSetValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetDataSetValue(TServiceYesNo newGetDataSetValue) {
		if (newGetDataSetValue != getDataSetValue) {
			NotificationChain msgs = null;
			if (getDataSetValue != null)
				msgs = ((InternalEObject)getDataSetValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__GET_DATA_SET_VALUE, null, msgs);
			if (newGetDataSetValue != null)
				msgs = ((InternalEObject)newGetDataSetValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__GET_DATA_SET_VALUE, null, msgs);
			msgs = basicSetGetDataSetValue(newGetDataSetValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__GET_DATA_SET_VALUE, newGetDataSetValue, newGetDataSetValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceYesNo getSetDataSetValue() {
		return setDataSetValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetDataSetValue(TServiceYesNo newSetDataSetValue, NotificationChain msgs) {
		TServiceYesNo oldSetDataSetValue = setDataSetValue;
		setDataSetValue = newSetDataSetValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__SET_DATA_SET_VALUE, oldSetDataSetValue, newSetDataSetValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetDataSetValue(TServiceYesNo newSetDataSetValue) {
		if (newSetDataSetValue != setDataSetValue) {
			NotificationChain msgs = null;
			if (setDataSetValue != null)
				msgs = ((InternalEObject)setDataSetValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__SET_DATA_SET_VALUE, null, msgs);
			if (newSetDataSetValue != null)
				msgs = ((InternalEObject)newSetDataSetValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__SET_DATA_SET_VALUE, null, msgs);
			msgs = basicSetSetDataSetValue(newSetDataSetValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__SET_DATA_SET_VALUE, newSetDataSetValue, newSetDataSetValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceYesNo getDataSetDirectory() {
		return dataSetDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSetDirectory(TServiceYesNo newDataSetDirectory, NotificationChain msgs) {
		TServiceYesNo oldDataSetDirectory = dataSetDirectory;
		dataSetDirectory = newDataSetDirectory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__DATA_SET_DIRECTORY, oldDataSetDirectory, newDataSetDirectory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSetDirectory(TServiceYesNo newDataSetDirectory) {
		if (newDataSetDirectory != dataSetDirectory) {
			NotificationChain msgs = null;
			if (dataSetDirectory != null)
				msgs = ((InternalEObject)dataSetDirectory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__DATA_SET_DIRECTORY, null, msgs);
			if (newDataSetDirectory != null)
				msgs = ((InternalEObject)newDataSetDirectory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__DATA_SET_DIRECTORY, null, msgs);
			msgs = basicSetDataSetDirectory(newDataSetDirectory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__DATA_SET_DIRECTORY, newDataSetDirectory, newDataSetDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceWithMaxAndMaxAttributesAndModify getConfDataSet() {
		return confDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfDataSet(TServiceWithMaxAndMaxAttributesAndModify newConfDataSet, NotificationChain msgs) {
		TServiceWithMaxAndMaxAttributesAndModify oldConfDataSet = confDataSet;
		confDataSet = newConfDataSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__CONF_DATA_SET, oldConfDataSet, newConfDataSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfDataSet(TServiceWithMaxAndMaxAttributesAndModify newConfDataSet) {
		if (newConfDataSet != confDataSet) {
			NotificationChain msgs = null;
			if (confDataSet != null)
				msgs = ((InternalEObject)confDataSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__CONF_DATA_SET, null, msgs);
			if (newConfDataSet != null)
				msgs = ((InternalEObject)newConfDataSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__CONF_DATA_SET, null, msgs);
			msgs = basicSetConfDataSet(newConfDataSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__CONF_DATA_SET, newConfDataSet, newConfDataSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceWithMaxAndMaxAttributes getDynDataSet() {
		return dynDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDynDataSet(TServiceWithMaxAndMaxAttributes newDynDataSet, NotificationChain msgs) {
		TServiceWithMaxAndMaxAttributes oldDynDataSet = dynDataSet;
		dynDataSet = newDynDataSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__DYN_DATA_SET, oldDynDataSet, newDynDataSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynDataSet(TServiceWithMaxAndMaxAttributes newDynDataSet) {
		if (newDynDataSet != dynDataSet) {
			NotificationChain msgs = null;
			if (dynDataSet != null)
				msgs = ((InternalEObject)dynDataSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__DYN_DATA_SET, null, msgs);
			if (newDynDataSet != null)
				msgs = ((InternalEObject)newDynDataSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__DYN_DATA_SET, null, msgs);
			msgs = basicSetDynDataSet(newDynDataSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__DYN_DATA_SET, newDynDataSet, newDynDataSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceYesNo getReadWrite() {
		return readWrite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadWrite(TServiceYesNo newReadWrite, NotificationChain msgs) {
		TServiceYesNo oldReadWrite = readWrite;
		readWrite = newReadWrite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__READ_WRITE, oldReadWrite, newReadWrite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadWrite(TServiceYesNo newReadWrite) {
		if (newReadWrite != readWrite) {
			NotificationChain msgs = null;
			if (readWrite != null)
				msgs = ((InternalEObject)readWrite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__READ_WRITE, null, msgs);
			if (newReadWrite != null)
				msgs = ((InternalEObject)newReadWrite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__READ_WRITE, null, msgs);
			msgs = basicSetReadWrite(newReadWrite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__READ_WRITE, newReadWrite, newReadWrite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceYesNo getTimerActivatedControl() {
		return timerActivatedControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimerActivatedControl(TServiceYesNo newTimerActivatedControl, NotificationChain msgs) {
		TServiceYesNo oldTimerActivatedControl = timerActivatedControl;
		timerActivatedControl = newTimerActivatedControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__TIMER_ACTIVATED_CONTROL, oldTimerActivatedControl, newTimerActivatedControl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimerActivatedControl(TServiceYesNo newTimerActivatedControl) {
		if (newTimerActivatedControl != timerActivatedControl) {
			NotificationChain msgs = null;
			if (timerActivatedControl != null)
				msgs = ((InternalEObject)timerActivatedControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__TIMER_ACTIVATED_CONTROL, null, msgs);
			if (newTimerActivatedControl != null)
				msgs = ((InternalEObject)newTimerActivatedControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__TIMER_ACTIVATED_CONTROL, null, msgs);
			msgs = basicSetTimerActivatedControl(newTimerActivatedControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__TIMER_ACTIVATED_CONTROL, newTimerActivatedControl, newTimerActivatedControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceWithMax getConfReportControl() {
		return confReportControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfReportControl(TServiceWithMax newConfReportControl, NotificationChain msgs) {
		TServiceWithMax oldConfReportControl = confReportControl;
		confReportControl = newConfReportControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__CONF_REPORT_CONTROL, oldConfReportControl, newConfReportControl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfReportControl(TServiceWithMax newConfReportControl) {
		if (newConfReportControl != confReportControl) {
			NotificationChain msgs = null;
			if (confReportControl != null)
				msgs = ((InternalEObject)confReportControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__CONF_REPORT_CONTROL, null, msgs);
			if (newConfReportControl != null)
				msgs = ((InternalEObject)newConfReportControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__CONF_REPORT_CONTROL, null, msgs);
			msgs = basicSetConfReportControl(newConfReportControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__CONF_REPORT_CONTROL, newConfReportControl, newConfReportControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceYesNo getGetCBValues() {
		return getCBValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetCBValues(TServiceYesNo newGetCBValues, NotificationChain msgs) {
		TServiceYesNo oldGetCBValues = getCBValues;
		getCBValues = newGetCBValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__GET_CB_VALUES, oldGetCBValues, newGetCBValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetCBValues(TServiceYesNo newGetCBValues) {
		if (newGetCBValues != getCBValues) {
			NotificationChain msgs = null;
			if (getCBValues != null)
				msgs = ((InternalEObject)getCBValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__GET_CB_VALUES, null, msgs);
			if (newGetCBValues != null)
				msgs = ((InternalEObject)newGetCBValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__GET_CB_VALUES, null, msgs);
			msgs = basicSetGetCBValues(newGetCBValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__GET_CB_VALUES, newGetCBValues, newGetCBValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceWithMax getConfLogControl() {
		return confLogControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfLogControl(TServiceWithMax newConfLogControl, NotificationChain msgs) {
		TServiceWithMax oldConfLogControl = confLogControl;
		confLogControl = newConfLogControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__CONF_LOG_CONTROL, oldConfLogControl, newConfLogControl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfLogControl(TServiceWithMax newConfLogControl) {
		if (newConfLogControl != confLogControl) {
			NotificationChain msgs = null;
			if (confLogControl != null)
				msgs = ((InternalEObject)confLogControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__CONF_LOG_CONTROL, null, msgs);
			if (newConfLogControl != null)
				msgs = ((InternalEObject)newConfLogControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__CONF_LOG_CONTROL, null, msgs);
			msgs = basicSetConfLogControl(newConfLogControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__CONF_LOG_CONTROL, newConfLogControl, newConfLogControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TReportSettings getReportSettings() {
		return reportSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReportSettings(TReportSettings newReportSettings, NotificationChain msgs) {
		TReportSettings oldReportSettings = reportSettings;
		reportSettings = newReportSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__REPORT_SETTINGS, oldReportSettings, newReportSettings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReportSettings(TReportSettings newReportSettings) {
		if (newReportSettings != reportSettings) {
			NotificationChain msgs = null;
			if (reportSettings != null)
				msgs = ((InternalEObject)reportSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__REPORT_SETTINGS, null, msgs);
			if (newReportSettings != null)
				msgs = ((InternalEObject)newReportSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__REPORT_SETTINGS, null, msgs);
			msgs = basicSetReportSettings(newReportSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__REPORT_SETTINGS, newReportSettings, newReportSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLogSettings getLogSettings() {
		return logSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogSettings(TLogSettings newLogSettings, NotificationChain msgs) {
		TLogSettings oldLogSettings = logSettings;
		logSettings = newLogSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__LOG_SETTINGS, oldLogSettings, newLogSettings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogSettings(TLogSettings newLogSettings) {
		if (newLogSettings != logSettings) {
			NotificationChain msgs = null;
			if (logSettings != null)
				msgs = ((InternalEObject)logSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__LOG_SETTINGS, null, msgs);
			if (newLogSettings != null)
				msgs = ((InternalEObject)newLogSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__LOG_SETTINGS, null, msgs);
			msgs = basicSetLogSettings(newLogSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__LOG_SETTINGS, newLogSettings, newLogSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TGSESettings getGSESettings() {
		return gSESettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGSESettings(TGSESettings newGSESettings, NotificationChain msgs) {
		TGSESettings oldGSESettings = gSESettings;
		gSESettings = newGSESettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__GSE_SETTINGS, oldGSESettings, newGSESettings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGSESettings(TGSESettings newGSESettings) {
		if (newGSESettings != gSESettings) {
			NotificationChain msgs = null;
			if (gSESettings != null)
				msgs = ((InternalEObject)gSESettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__GSE_SETTINGS, null, msgs);
			if (newGSESettings != null)
				msgs = ((InternalEObject)newGSESettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__GSE_SETTINGS, null, msgs);
			msgs = basicSetGSESettings(newGSESettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__GSE_SETTINGS, newGSESettings, newGSESettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSMVSettings getSMVSettings() {
		return sMVSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSMVSettings(TSMVSettings newSMVSettings, NotificationChain msgs) {
		TSMVSettings oldSMVSettings = sMVSettings;
		sMVSettings = newSMVSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__SMV_SETTINGS, oldSMVSettings, newSMVSettings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSMVSettings(TSMVSettings newSMVSettings) {
		if (newSMVSettings != sMVSettings) {
			NotificationChain msgs = null;
			if (sMVSettings != null)
				msgs = ((InternalEObject)sMVSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__SMV_SETTINGS, null, msgs);
			if (newSMVSettings != null)
				msgs = ((InternalEObject)newSMVSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__SMV_SETTINGS, null, msgs);
			msgs = basicSetSMVSettings(newSMVSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__SMV_SETTINGS, newSMVSettings, newSMVSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceYesNo getGSEDir() {
		return gSEDir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGSEDir(TServiceYesNo newGSEDir, NotificationChain msgs) {
		TServiceYesNo oldGSEDir = gSEDir;
		gSEDir = newGSEDir;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__GSE_DIR, oldGSEDir, newGSEDir);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGSEDir(TServiceYesNo newGSEDir) {
		if (newGSEDir != gSEDir) {
			NotificationChain msgs = null;
			if (gSEDir != null)
				msgs = ((InternalEObject)gSEDir).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__GSE_DIR, null, msgs);
			if (newGSEDir != null)
				msgs = ((InternalEObject)newGSEDir).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__GSE_DIR, null, msgs);
			msgs = basicSetGSEDir(newGSEDir, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__GSE_DIR, newGSEDir, newGSEDir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceWithMax getGOOSE() {
		return gOOSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGOOSE(TServiceWithMax newGOOSE, NotificationChain msgs) {
		TServiceWithMax oldGOOSE = gOOSE;
		gOOSE = newGOOSE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__GOOSE, oldGOOSE, newGOOSE);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGOOSE(TServiceWithMax newGOOSE) {
		if (newGOOSE != gOOSE) {
			NotificationChain msgs = null;
			if (gOOSE != null)
				msgs = ((InternalEObject)gOOSE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__GOOSE, null, msgs);
			if (newGOOSE != null)
				msgs = ((InternalEObject)newGOOSE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__GOOSE, null, msgs);
			msgs = basicSetGOOSE(newGOOSE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__GOOSE, newGOOSE, newGOOSE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceWithMax getGSSE() {
		return gSSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGSSE(TServiceWithMax newGSSE, NotificationChain msgs) {
		TServiceWithMax oldGSSE = gSSE;
		gSSE = newGSSE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__GSSE, oldGSSE, newGSSE);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGSSE(TServiceWithMax newGSSE) {
		if (newGSSE != gSSE) {
			NotificationChain msgs = null;
			if (gSSE != null)
				msgs = ((InternalEObject)gSSE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__GSSE, null, msgs);
			if (newGSSE != null)
				msgs = ((InternalEObject)newGSSE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__GSSE, null, msgs);
			msgs = basicSetGSSE(newGSSE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__GSSE, newGSSE, newGSSE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceYesNo getFileHandling() {
		return fileHandling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileHandling(TServiceYesNo newFileHandling, NotificationChain msgs) {
		TServiceYesNo oldFileHandling = fileHandling;
		fileHandling = newFileHandling;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__FILE_HANDLING, oldFileHandling, newFileHandling);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileHandling(TServiceYesNo newFileHandling) {
		if (newFileHandling != fileHandling) {
			NotificationChain msgs = null;
			if (fileHandling != null)
				msgs = ((InternalEObject)fileHandling).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__FILE_HANDLING, null, msgs);
			if (newFileHandling != null)
				msgs = ((InternalEObject)newFileHandling).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__FILE_HANDLING, null, msgs);
			msgs = basicSetFileHandling(newFileHandling, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__FILE_HANDLING, newFileHandling, newFileHandling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TConfLNs getConfLNs() {
		return confLNs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfLNs(TConfLNs newConfLNs, NotificationChain msgs) {
		TConfLNs oldConfLNs = confLNs;
		confLNs = newConfLNs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__CONF_LNS, oldConfLNs, newConfLNs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfLNs(TConfLNs newConfLNs) {
		if (newConfLNs != confLNs) {
			NotificationChain msgs = null;
			if (confLNs != null)
				msgs = ((InternalEObject)confLNs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__CONF_LNS, null, msgs);
			if (newConfLNs != null)
				msgs = ((InternalEObject)newConfLNs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__CONF_LNS, null, msgs);
			msgs = basicSetConfLNs(newConfLNs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__CONF_LNS, newConfLNs, newConfLNs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClientServices getClientServices() {
		return clientServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClientServices(TClientServices newClientServices, NotificationChain msgs) {
		TClientServices oldClientServices = clientServices;
		clientServices = newClientServices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__CLIENT_SERVICES, oldClientServices, newClientServices);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientServices(TClientServices newClientServices) {
		if (newClientServices != clientServices) {
			NotificationChain msgs = null;
			if (clientServices != null)
				msgs = ((InternalEObject)clientServices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__CLIENT_SERVICES, null, msgs);
			if (newClientServices != null)
				msgs = ((InternalEObject)newClientServices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.TSERVICES__CLIENT_SERVICES, null, msgs);
			msgs = basicSetClientServices(newClientServices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TSERVICES__CLIENT_SERVICES, newClientServices, newClientServices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SclPackage.TSERVICES__DYN_ASSOCIATION:
				return basicSetDynAssociation(null, msgs);
			case SclPackage.TSERVICES__SETTING_GROUPS:
				return basicSetSettingGroups(null, msgs);
			case SclPackage.TSERVICES__GET_DIRECTORY:
				return basicSetGetDirectory(null, msgs);
			case SclPackage.TSERVICES__GET_DATA_OBJECT_DEFINITION:
				return basicSetGetDataObjectDefinition(null, msgs);
			case SclPackage.TSERVICES__DATA_OBJECT_DIRECTORY:
				return basicSetDataObjectDirectory(null, msgs);
			case SclPackage.TSERVICES__GET_DATA_SET_VALUE:
				return basicSetGetDataSetValue(null, msgs);
			case SclPackage.TSERVICES__SET_DATA_SET_VALUE:
				return basicSetSetDataSetValue(null, msgs);
			case SclPackage.TSERVICES__DATA_SET_DIRECTORY:
				return basicSetDataSetDirectory(null, msgs);
			case SclPackage.TSERVICES__CONF_DATA_SET:
				return basicSetConfDataSet(null, msgs);
			case SclPackage.TSERVICES__DYN_DATA_SET:
				return basicSetDynDataSet(null, msgs);
			case SclPackage.TSERVICES__READ_WRITE:
				return basicSetReadWrite(null, msgs);
			case SclPackage.TSERVICES__TIMER_ACTIVATED_CONTROL:
				return basicSetTimerActivatedControl(null, msgs);
			case SclPackage.TSERVICES__CONF_REPORT_CONTROL:
				return basicSetConfReportControl(null, msgs);
			case SclPackage.TSERVICES__GET_CB_VALUES:
				return basicSetGetCBValues(null, msgs);
			case SclPackage.TSERVICES__CONF_LOG_CONTROL:
				return basicSetConfLogControl(null, msgs);
			case SclPackage.TSERVICES__REPORT_SETTINGS:
				return basicSetReportSettings(null, msgs);
			case SclPackage.TSERVICES__LOG_SETTINGS:
				return basicSetLogSettings(null, msgs);
			case SclPackage.TSERVICES__GSE_SETTINGS:
				return basicSetGSESettings(null, msgs);
			case SclPackage.TSERVICES__SMV_SETTINGS:
				return basicSetSMVSettings(null, msgs);
			case SclPackage.TSERVICES__GSE_DIR:
				return basicSetGSEDir(null, msgs);
			case SclPackage.TSERVICES__GOOSE:
				return basicSetGOOSE(null, msgs);
			case SclPackage.TSERVICES__GSSE:
				return basicSetGSSE(null, msgs);
			case SclPackage.TSERVICES__FILE_HANDLING:
				return basicSetFileHandling(null, msgs);
			case SclPackage.TSERVICES__CONF_LNS:
				return basicSetConfLNs(null, msgs);
			case SclPackage.TSERVICES__CLIENT_SERVICES:
				return basicSetClientServices(null, msgs);
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
			case SclPackage.TSERVICES__DYN_ASSOCIATION:
				return getDynAssociation();
			case SclPackage.TSERVICES__SETTING_GROUPS:
				return getSettingGroups();
			case SclPackage.TSERVICES__GET_DIRECTORY:
				return getGetDirectory();
			case SclPackage.TSERVICES__GET_DATA_OBJECT_DEFINITION:
				return getGetDataObjectDefinition();
			case SclPackage.TSERVICES__DATA_OBJECT_DIRECTORY:
				return getDataObjectDirectory();
			case SclPackage.TSERVICES__GET_DATA_SET_VALUE:
				return getGetDataSetValue();
			case SclPackage.TSERVICES__SET_DATA_SET_VALUE:
				return getSetDataSetValue();
			case SclPackage.TSERVICES__DATA_SET_DIRECTORY:
				return getDataSetDirectory();
			case SclPackage.TSERVICES__CONF_DATA_SET:
				return getConfDataSet();
			case SclPackage.TSERVICES__DYN_DATA_SET:
				return getDynDataSet();
			case SclPackage.TSERVICES__READ_WRITE:
				return getReadWrite();
			case SclPackage.TSERVICES__TIMER_ACTIVATED_CONTROL:
				return getTimerActivatedControl();
			case SclPackage.TSERVICES__CONF_REPORT_CONTROL:
				return getConfReportControl();
			case SclPackage.TSERVICES__GET_CB_VALUES:
				return getGetCBValues();
			case SclPackage.TSERVICES__CONF_LOG_CONTROL:
				return getConfLogControl();
			case SclPackage.TSERVICES__REPORT_SETTINGS:
				return getReportSettings();
			case SclPackage.TSERVICES__LOG_SETTINGS:
				return getLogSettings();
			case SclPackage.TSERVICES__GSE_SETTINGS:
				return getGSESettings();
			case SclPackage.TSERVICES__SMV_SETTINGS:
				return getSMVSettings();
			case SclPackage.TSERVICES__GSE_DIR:
				return getGSEDir();
			case SclPackage.TSERVICES__GOOSE:
				return getGOOSE();
			case SclPackage.TSERVICES__GSSE:
				return getGSSE();
			case SclPackage.TSERVICES__FILE_HANDLING:
				return getFileHandling();
			case SclPackage.TSERVICES__CONF_LNS:
				return getConfLNs();
			case SclPackage.TSERVICES__CLIENT_SERVICES:
				return getClientServices();
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
			case SclPackage.TSERVICES__DYN_ASSOCIATION:
				setDynAssociation((TServiceYesNo)newValue);
				return;
			case SclPackage.TSERVICES__SETTING_GROUPS:
				setSettingGroups((SettingGroupsType)newValue);
				return;
			case SclPackage.TSERVICES__GET_DIRECTORY:
				setGetDirectory((TServiceYesNo)newValue);
				return;
			case SclPackage.TSERVICES__GET_DATA_OBJECT_DEFINITION:
				setGetDataObjectDefinition((TServiceYesNo)newValue);
				return;
			case SclPackage.TSERVICES__DATA_OBJECT_DIRECTORY:
				setDataObjectDirectory((TServiceYesNo)newValue);
				return;
			case SclPackage.TSERVICES__GET_DATA_SET_VALUE:
				setGetDataSetValue((TServiceYesNo)newValue);
				return;
			case SclPackage.TSERVICES__SET_DATA_SET_VALUE:
				setSetDataSetValue((TServiceYesNo)newValue);
				return;
			case SclPackage.TSERVICES__DATA_SET_DIRECTORY:
				setDataSetDirectory((TServiceYesNo)newValue);
				return;
			case SclPackage.TSERVICES__CONF_DATA_SET:
				setConfDataSet((TServiceWithMaxAndMaxAttributesAndModify)newValue);
				return;
			case SclPackage.TSERVICES__DYN_DATA_SET:
				setDynDataSet((TServiceWithMaxAndMaxAttributes)newValue);
				return;
			case SclPackage.TSERVICES__READ_WRITE:
				setReadWrite((TServiceYesNo)newValue);
				return;
			case SclPackage.TSERVICES__TIMER_ACTIVATED_CONTROL:
				setTimerActivatedControl((TServiceYesNo)newValue);
				return;
			case SclPackage.TSERVICES__CONF_REPORT_CONTROL:
				setConfReportControl((TServiceWithMax)newValue);
				return;
			case SclPackage.TSERVICES__GET_CB_VALUES:
				setGetCBValues((TServiceYesNo)newValue);
				return;
			case SclPackage.TSERVICES__CONF_LOG_CONTROL:
				setConfLogControl((TServiceWithMax)newValue);
				return;
			case SclPackage.TSERVICES__REPORT_SETTINGS:
				setReportSettings((TReportSettings)newValue);
				return;
			case SclPackage.TSERVICES__LOG_SETTINGS:
				setLogSettings((TLogSettings)newValue);
				return;
			case SclPackage.TSERVICES__GSE_SETTINGS:
				setGSESettings((TGSESettings)newValue);
				return;
			case SclPackage.TSERVICES__SMV_SETTINGS:
				setSMVSettings((TSMVSettings)newValue);
				return;
			case SclPackage.TSERVICES__GSE_DIR:
				setGSEDir((TServiceYesNo)newValue);
				return;
			case SclPackage.TSERVICES__GOOSE:
				setGOOSE((TServiceWithMax)newValue);
				return;
			case SclPackage.TSERVICES__GSSE:
				setGSSE((TServiceWithMax)newValue);
				return;
			case SclPackage.TSERVICES__FILE_HANDLING:
				setFileHandling((TServiceYesNo)newValue);
				return;
			case SclPackage.TSERVICES__CONF_LNS:
				setConfLNs((TConfLNs)newValue);
				return;
			case SclPackage.TSERVICES__CLIENT_SERVICES:
				setClientServices((TClientServices)newValue);
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
			case SclPackage.TSERVICES__DYN_ASSOCIATION:
				setDynAssociation((TServiceYesNo)null);
				return;
			case SclPackage.TSERVICES__SETTING_GROUPS:
				setSettingGroups((SettingGroupsType)null);
				return;
			case SclPackage.TSERVICES__GET_DIRECTORY:
				setGetDirectory((TServiceYesNo)null);
				return;
			case SclPackage.TSERVICES__GET_DATA_OBJECT_DEFINITION:
				setGetDataObjectDefinition((TServiceYesNo)null);
				return;
			case SclPackage.TSERVICES__DATA_OBJECT_DIRECTORY:
				setDataObjectDirectory((TServiceYesNo)null);
				return;
			case SclPackage.TSERVICES__GET_DATA_SET_VALUE:
				setGetDataSetValue((TServiceYesNo)null);
				return;
			case SclPackage.TSERVICES__SET_DATA_SET_VALUE:
				setSetDataSetValue((TServiceYesNo)null);
				return;
			case SclPackage.TSERVICES__DATA_SET_DIRECTORY:
				setDataSetDirectory((TServiceYesNo)null);
				return;
			case SclPackage.TSERVICES__CONF_DATA_SET:
				setConfDataSet((TServiceWithMaxAndMaxAttributesAndModify)null);
				return;
			case SclPackage.TSERVICES__DYN_DATA_SET:
				setDynDataSet((TServiceWithMaxAndMaxAttributes)null);
				return;
			case SclPackage.TSERVICES__READ_WRITE:
				setReadWrite((TServiceYesNo)null);
				return;
			case SclPackage.TSERVICES__TIMER_ACTIVATED_CONTROL:
				setTimerActivatedControl((TServiceYesNo)null);
				return;
			case SclPackage.TSERVICES__CONF_REPORT_CONTROL:
				setConfReportControl((TServiceWithMax)null);
				return;
			case SclPackage.TSERVICES__GET_CB_VALUES:
				setGetCBValues((TServiceYesNo)null);
				return;
			case SclPackage.TSERVICES__CONF_LOG_CONTROL:
				setConfLogControl((TServiceWithMax)null);
				return;
			case SclPackage.TSERVICES__REPORT_SETTINGS:
				setReportSettings((TReportSettings)null);
				return;
			case SclPackage.TSERVICES__LOG_SETTINGS:
				setLogSettings((TLogSettings)null);
				return;
			case SclPackage.TSERVICES__GSE_SETTINGS:
				setGSESettings((TGSESettings)null);
				return;
			case SclPackage.TSERVICES__SMV_SETTINGS:
				setSMVSettings((TSMVSettings)null);
				return;
			case SclPackage.TSERVICES__GSE_DIR:
				setGSEDir((TServiceYesNo)null);
				return;
			case SclPackage.TSERVICES__GOOSE:
				setGOOSE((TServiceWithMax)null);
				return;
			case SclPackage.TSERVICES__GSSE:
				setGSSE((TServiceWithMax)null);
				return;
			case SclPackage.TSERVICES__FILE_HANDLING:
				setFileHandling((TServiceYesNo)null);
				return;
			case SclPackage.TSERVICES__CONF_LNS:
				setConfLNs((TConfLNs)null);
				return;
			case SclPackage.TSERVICES__CLIENT_SERVICES:
				setClientServices((TClientServices)null);
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
			case SclPackage.TSERVICES__DYN_ASSOCIATION:
				return dynAssociation != null;
			case SclPackage.TSERVICES__SETTING_GROUPS:
				return settingGroups != null;
			case SclPackage.TSERVICES__GET_DIRECTORY:
				return getDirectory != null;
			case SclPackage.TSERVICES__GET_DATA_OBJECT_DEFINITION:
				return getDataObjectDefinition != null;
			case SclPackage.TSERVICES__DATA_OBJECT_DIRECTORY:
				return dataObjectDirectory != null;
			case SclPackage.TSERVICES__GET_DATA_SET_VALUE:
				return getDataSetValue != null;
			case SclPackage.TSERVICES__SET_DATA_SET_VALUE:
				return setDataSetValue != null;
			case SclPackage.TSERVICES__DATA_SET_DIRECTORY:
				return dataSetDirectory != null;
			case SclPackage.TSERVICES__CONF_DATA_SET:
				return confDataSet != null;
			case SclPackage.TSERVICES__DYN_DATA_SET:
				return dynDataSet != null;
			case SclPackage.TSERVICES__READ_WRITE:
				return readWrite != null;
			case SclPackage.TSERVICES__TIMER_ACTIVATED_CONTROL:
				return timerActivatedControl != null;
			case SclPackage.TSERVICES__CONF_REPORT_CONTROL:
				return confReportControl != null;
			case SclPackage.TSERVICES__GET_CB_VALUES:
				return getCBValues != null;
			case SclPackage.TSERVICES__CONF_LOG_CONTROL:
				return confLogControl != null;
			case SclPackage.TSERVICES__REPORT_SETTINGS:
				return reportSettings != null;
			case SclPackage.TSERVICES__LOG_SETTINGS:
				return logSettings != null;
			case SclPackage.TSERVICES__GSE_SETTINGS:
				return gSESettings != null;
			case SclPackage.TSERVICES__SMV_SETTINGS:
				return sMVSettings != null;
			case SclPackage.TSERVICES__GSE_DIR:
				return gSEDir != null;
			case SclPackage.TSERVICES__GOOSE:
				return gOOSE != null;
			case SclPackage.TSERVICES__GSSE:
				return gSSE != null;
			case SclPackage.TSERVICES__FILE_HANDLING:
				return fileHandling != null;
			case SclPackage.TSERVICES__CONF_LNS:
				return confLNs != null;
			case SclPackage.TSERVICES__CLIENT_SERVICES:
				return clientServices != null;
		}
		return super.eIsSet(featureID);
	}

} //TServicesImpl
