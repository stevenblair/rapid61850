/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TServices</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TServices#getDynAssociation <em>Dyn Association</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TServices#getSettingGroups <em>Setting Groups</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TServices#getGetDirectory <em>Get Directory</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TServices#getGetDataObjectDefinition <em>Get Data Object Definition</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TServices#getDataObjectDirectory <em>Data Object Directory</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TServices#getGetDataSetValue <em>Get Data Set Value</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TServices#getSetDataSetValue <em>Set Data Set Value</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TServices#getDataSetDirectory <em>Data Set Directory</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TServices#getConfDataSet <em>Conf Data Set</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TServices#getDynDataSet <em>Dyn Data Set</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TServices#getReadWrite <em>Read Write</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TServices#getTimerActivatedControl <em>Timer Activated Control</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TServices#getConfReportControl <em>Conf Report Control</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TServices#getGetCBValues <em>Get CB Values</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TServices#getConfLogControl <em>Conf Log Control</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TServices#getReportSettings <em>Report Settings</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TServices#getLogSettings <em>Log Settings</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TServices#getGSESettings <em>GSE Settings</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TServices#getSMVSettings <em>SMV Settings</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TServices#getGSEDir <em>GSE Dir</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TServices#getGOOSE <em>GOOSE</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TServices#getGSSE <em>GSSE</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TServices#getFileHandling <em>File Handling</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TServices#getConfLNs <em>Conf LNs</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TServices#getClientServices <em>Client Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTServices()
 * @model extendedMetaData="name='tServices' kind='elementOnly'"
 * @generated
 */
public interface TServices extends EObject {
	/**
	 * Returns the value of the '<em><b>Dyn Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dyn Association</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dyn Association</em>' containment reference.
	 * @see #setDynAssociation(TServiceYesNo)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTServices_DynAssociation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DynAssociation' namespace='##targetNamespace'"
	 * @generated
	 */
	TServiceYesNo getDynAssociation();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TServices#getDynAssociation <em>Dyn Association</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dyn Association</em>' containment reference.
	 * @see #getDynAssociation()
	 * @generated
	 */
	void setDynAssociation(TServiceYesNo value);

	/**
	 * Returns the value of the '<em><b>Setting Groups</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setting Groups</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setting Groups</em>' containment reference.
	 * @see #setSettingGroups(SettingGroupsType)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTServices_SettingGroups()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SettingGroups' namespace='##targetNamespace'"
	 * @generated
	 */
	SettingGroupsType getSettingGroups();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TServices#getSettingGroups <em>Setting Groups</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setting Groups</em>' containment reference.
	 * @see #getSettingGroups()
	 * @generated
	 */
	void setSettingGroups(SettingGroupsType value);

	/**
	 * Returns the value of the '<em><b>Get Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Directory</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Directory</em>' containment reference.
	 * @see #setGetDirectory(TServiceYesNo)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTServices_GetDirectory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GetDirectory' namespace='##targetNamespace'"
	 * @generated
	 */
	TServiceYesNo getGetDirectory();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TServices#getGetDirectory <em>Get Directory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Directory</em>' containment reference.
	 * @see #getGetDirectory()
	 * @generated
	 */
	void setGetDirectory(TServiceYesNo value);

	/**
	 * Returns the value of the '<em><b>Get Data Object Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Data Object Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Data Object Definition</em>' containment reference.
	 * @see #setGetDataObjectDefinition(TServiceYesNo)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTServices_GetDataObjectDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GetDataObjectDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	TServiceYesNo getGetDataObjectDefinition();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TServices#getGetDataObjectDefinition <em>Get Data Object Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Data Object Definition</em>' containment reference.
	 * @see #getGetDataObjectDefinition()
	 * @generated
	 */
	void setGetDataObjectDefinition(TServiceYesNo value);

	/**
	 * Returns the value of the '<em><b>Data Object Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Object Directory</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Object Directory</em>' containment reference.
	 * @see #setDataObjectDirectory(TServiceYesNo)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTServices_DataObjectDirectory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataObjectDirectory' namespace='##targetNamespace'"
	 * @generated
	 */
	TServiceYesNo getDataObjectDirectory();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TServices#getDataObjectDirectory <em>Data Object Directory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Object Directory</em>' containment reference.
	 * @see #getDataObjectDirectory()
	 * @generated
	 */
	void setDataObjectDirectory(TServiceYesNo value);

	/**
	 * Returns the value of the '<em><b>Get Data Set Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Data Set Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Data Set Value</em>' containment reference.
	 * @see #setGetDataSetValue(TServiceYesNo)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTServices_GetDataSetValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GetDataSetValue' namespace='##targetNamespace'"
	 * @generated
	 */
	TServiceYesNo getGetDataSetValue();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TServices#getGetDataSetValue <em>Get Data Set Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Data Set Value</em>' containment reference.
	 * @see #getGetDataSetValue()
	 * @generated
	 */
	void setGetDataSetValue(TServiceYesNo value);

	/**
	 * Returns the value of the '<em><b>Set Data Set Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Data Set Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Data Set Value</em>' containment reference.
	 * @see #setSetDataSetValue(TServiceYesNo)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTServices_SetDataSetValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SetDataSetValue' namespace='##targetNamespace'"
	 * @generated
	 */
	TServiceYesNo getSetDataSetValue();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TServices#getSetDataSetValue <em>Set Data Set Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Data Set Value</em>' containment reference.
	 * @see #getSetDataSetValue()
	 * @generated
	 */
	void setSetDataSetValue(TServiceYesNo value);

	/**
	 * Returns the value of the '<em><b>Data Set Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Set Directory</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set Directory</em>' containment reference.
	 * @see #setDataSetDirectory(TServiceYesNo)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTServices_DataSetDirectory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataSetDirectory' namespace='##targetNamespace'"
	 * @generated
	 */
	TServiceYesNo getDataSetDirectory();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TServices#getDataSetDirectory <em>Data Set Directory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set Directory</em>' containment reference.
	 * @see #getDataSetDirectory()
	 * @generated
	 */
	void setDataSetDirectory(TServiceYesNo value);

	/**
	 * Returns the value of the '<em><b>Conf Data Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conf Data Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conf Data Set</em>' containment reference.
	 * @see #setConfDataSet(TServiceWithMaxAndMaxAttributesAndModify)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTServices_ConfDataSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConfDataSet' namespace='##targetNamespace'"
	 * @generated
	 */
	TServiceWithMaxAndMaxAttributesAndModify getConfDataSet();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TServices#getConfDataSet <em>Conf Data Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conf Data Set</em>' containment reference.
	 * @see #getConfDataSet()
	 * @generated
	 */
	void setConfDataSet(TServiceWithMaxAndMaxAttributesAndModify value);

	/**
	 * Returns the value of the '<em><b>Dyn Data Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dyn Data Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dyn Data Set</em>' containment reference.
	 * @see #setDynDataSet(TServiceWithMaxAndMaxAttributes)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTServices_DynDataSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DynDataSet' namespace='##targetNamespace'"
	 * @generated
	 */
	TServiceWithMaxAndMaxAttributes getDynDataSet();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TServices#getDynDataSet <em>Dyn Data Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dyn Data Set</em>' containment reference.
	 * @see #getDynDataSet()
	 * @generated
	 */
	void setDynDataSet(TServiceWithMaxAndMaxAttributes value);

	/**
	 * Returns the value of the '<em><b>Read Write</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Write</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Write</em>' containment reference.
	 * @see #setReadWrite(TServiceYesNo)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTServices_ReadWrite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReadWrite' namespace='##targetNamespace'"
	 * @generated
	 */
	TServiceYesNo getReadWrite();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TServices#getReadWrite <em>Read Write</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Write</em>' containment reference.
	 * @see #getReadWrite()
	 * @generated
	 */
	void setReadWrite(TServiceYesNo value);

	/**
	 * Returns the value of the '<em><b>Timer Activated Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timer Activated Control</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timer Activated Control</em>' containment reference.
	 * @see #setTimerActivatedControl(TServiceYesNo)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTServices_TimerActivatedControl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TimerActivatedControl' namespace='##targetNamespace'"
	 * @generated
	 */
	TServiceYesNo getTimerActivatedControl();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TServices#getTimerActivatedControl <em>Timer Activated Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timer Activated Control</em>' containment reference.
	 * @see #getTimerActivatedControl()
	 * @generated
	 */
	void setTimerActivatedControl(TServiceYesNo value);

	/**
	 * Returns the value of the '<em><b>Conf Report Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conf Report Control</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conf Report Control</em>' containment reference.
	 * @see #setConfReportControl(TServiceWithMax)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTServices_ConfReportControl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConfReportControl' namespace='##targetNamespace'"
	 * @generated
	 */
	TServiceWithMax getConfReportControl();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TServices#getConfReportControl <em>Conf Report Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conf Report Control</em>' containment reference.
	 * @see #getConfReportControl()
	 * @generated
	 */
	void setConfReportControl(TServiceWithMax value);

	/**
	 * Returns the value of the '<em><b>Get CB Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get CB Values</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get CB Values</em>' containment reference.
	 * @see #setGetCBValues(TServiceYesNo)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTServices_GetCBValues()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GetCBValues' namespace='##targetNamespace'"
	 * @generated
	 */
	TServiceYesNo getGetCBValues();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TServices#getGetCBValues <em>Get CB Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get CB Values</em>' containment reference.
	 * @see #getGetCBValues()
	 * @generated
	 */
	void setGetCBValues(TServiceYesNo value);

	/**
	 * Returns the value of the '<em><b>Conf Log Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conf Log Control</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conf Log Control</em>' containment reference.
	 * @see #setConfLogControl(TServiceWithMax)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTServices_ConfLogControl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConfLogControl' namespace='##targetNamespace'"
	 * @generated
	 */
	TServiceWithMax getConfLogControl();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TServices#getConfLogControl <em>Conf Log Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conf Log Control</em>' containment reference.
	 * @see #getConfLogControl()
	 * @generated
	 */
	void setConfLogControl(TServiceWithMax value);

	/**
	 * Returns the value of the '<em><b>Report Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Report Settings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report Settings</em>' containment reference.
	 * @see #setReportSettings(TReportSettings)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTServices_ReportSettings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReportSettings' namespace='##targetNamespace'"
	 * @generated
	 */
	TReportSettings getReportSettings();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TServices#getReportSettings <em>Report Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report Settings</em>' containment reference.
	 * @see #getReportSettings()
	 * @generated
	 */
	void setReportSettings(TReportSettings value);

	/**
	 * Returns the value of the '<em><b>Log Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Settings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Settings</em>' containment reference.
	 * @see #setLogSettings(TLogSettings)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTServices_LogSettings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LogSettings' namespace='##targetNamespace'"
	 * @generated
	 */
	TLogSettings getLogSettings();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TServices#getLogSettings <em>Log Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Settings</em>' containment reference.
	 * @see #getLogSettings()
	 * @generated
	 */
	void setLogSettings(TLogSettings value);

	/**
	 * Returns the value of the '<em><b>GSE Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GSE Settings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GSE Settings</em>' containment reference.
	 * @see #setGSESettings(TGSESettings)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTServices_GSESettings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GSESettings' namespace='##targetNamespace'"
	 * @generated
	 */
	TGSESettings getGSESettings();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TServices#getGSESettings <em>GSE Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GSE Settings</em>' containment reference.
	 * @see #getGSESettings()
	 * @generated
	 */
	void setGSESettings(TGSESettings value);

	/**
	 * Returns the value of the '<em><b>SMV Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SMV Settings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SMV Settings</em>' containment reference.
	 * @see #setSMVSettings(TSMVSettings)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTServices_SMVSettings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SMVSettings' namespace='##targetNamespace'"
	 * @generated
	 */
	TSMVSettings getSMVSettings();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TServices#getSMVSettings <em>SMV Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SMV Settings</em>' containment reference.
	 * @see #getSMVSettings()
	 * @generated
	 */
	void setSMVSettings(TSMVSettings value);

	/**
	 * Returns the value of the '<em><b>GSE Dir</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GSE Dir</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GSE Dir</em>' containment reference.
	 * @see #setGSEDir(TServiceYesNo)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTServices_GSEDir()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GSEDir' namespace='##targetNamespace'"
	 * @generated
	 */
	TServiceYesNo getGSEDir();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TServices#getGSEDir <em>GSE Dir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GSE Dir</em>' containment reference.
	 * @see #getGSEDir()
	 * @generated
	 */
	void setGSEDir(TServiceYesNo value);

	/**
	 * Returns the value of the '<em><b>GOOSE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GOOSE</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GOOSE</em>' containment reference.
	 * @see #setGOOSE(TServiceWithMax)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTServices_GOOSE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GOOSE' namespace='##targetNamespace'"
	 * @generated
	 */
	TServiceWithMax getGOOSE();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TServices#getGOOSE <em>GOOSE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GOOSE</em>' containment reference.
	 * @see #getGOOSE()
	 * @generated
	 */
	void setGOOSE(TServiceWithMax value);

	/**
	 * Returns the value of the '<em><b>GSSE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GSSE</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GSSE</em>' containment reference.
	 * @see #setGSSE(TServiceWithMax)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTServices_GSSE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GSSE' namespace='##targetNamespace'"
	 * @generated
	 */
	TServiceWithMax getGSSE();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TServices#getGSSE <em>GSSE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GSSE</em>' containment reference.
	 * @see #getGSSE()
	 * @generated
	 */
	void setGSSE(TServiceWithMax value);

	/**
	 * Returns the value of the '<em><b>File Handling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Handling</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Handling</em>' containment reference.
	 * @see #setFileHandling(TServiceYesNo)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTServices_FileHandling()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FileHandling' namespace='##targetNamespace'"
	 * @generated
	 */
	TServiceYesNo getFileHandling();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TServices#getFileHandling <em>File Handling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Handling</em>' containment reference.
	 * @see #getFileHandling()
	 * @generated
	 */
	void setFileHandling(TServiceYesNo value);

	/**
	 * Returns the value of the '<em><b>Conf LNs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conf LNs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conf LNs</em>' containment reference.
	 * @see #setConfLNs(TConfLNs)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTServices_ConfLNs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConfLNs' namespace='##targetNamespace'"
	 * @generated
	 */
	TConfLNs getConfLNs();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TServices#getConfLNs <em>Conf LNs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conf LNs</em>' containment reference.
	 * @see #getConfLNs()
	 * @generated
	 */
	void setConfLNs(TConfLNs value);

	/**
	 * Returns the value of the '<em><b>Client Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Services</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Services</em>' containment reference.
	 * @see #setClientServices(TClientServices)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTServices_ClientServices()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ClientServices' namespace='##targetNamespace'"
	 * @generated
	 */
	TClientServices getClientServices();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TServices#getClientServices <em>Client Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Services</em>' containment reference.
	 * @see #getClientServices()
	 * @generated
	 */
	void setClientServices(TClientServices value);

} // TServices
