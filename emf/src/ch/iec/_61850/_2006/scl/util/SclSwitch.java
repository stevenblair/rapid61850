/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.util;

import ch.iec._61850._2006.scl.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ch.iec._61850._2006.scl.SclPackage
 * @generated
 */
public class SclSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SclPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SclSwitch() {
		if (modelPackage == null) {
			modelPackage = SclPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SclPackage.AUTHENTICATION_TYPE: {
				AuthenticationType authenticationType = (AuthenticationType)theEObject;
				T result = caseAuthenticationType(authenticationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.HISTORY_TYPE: {
				HistoryType historyType = (HistoryType)theEObject;
				T result = caseHistoryType(historyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.LN0_TYPE: {
				LN0Type ln0Type = (LN0Type)theEObject;
				T result = caseLN0Type(ln0Type);
				if (result == null) result = caseTLN0(ln0Type);
				if (result == null) result = caseTAnyLN(ln0Type);
				if (result == null) result = caseTUnNaming(ln0Type);
				if (result == null) result = caseTBaseElement(ln0Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.OPT_FIELDS_TYPE: {
				OptFieldsType optFieldsType = (OptFieldsType)theEObject;
				T result = caseOptFieldsType(optFieldsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.SCL_TYPE: {
				SCLType sclType = (SCLType)theEObject;
				T result = caseSCLType(sclType);
				if (result == null) result = caseTBaseElement(sclType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.SETTING_GROUPS_TYPE: {
				SettingGroupsType settingGroupsType = (SettingGroupsType)theEObject;
				T result = caseSettingGroupsType(settingGroupsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.SMV_OPTS_TYPE: {
				SmvOptsType smvOptsType = (SmvOptsType)theEObject;
				T result = caseSmvOptsType(smvOptsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TABSTRACT_CONDUCTING_EQUIPMENT: {
				TAbstractConductingEquipment tAbstractConductingEquipment = (TAbstractConductingEquipment)theEObject;
				T result = caseTAbstractConductingEquipment(tAbstractConductingEquipment);
				if (result == null) result = caseTEquipment(tAbstractConductingEquipment);
				if (result == null) result = caseTPowerSystemResource(tAbstractConductingEquipment);
				if (result == null) result = caseTLNodeContainer(tAbstractConductingEquipment);
				if (result == null) result = caseTNaming(tAbstractConductingEquipment);
				if (result == null) result = caseTBaseElement(tAbstractConductingEquipment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE: {
				TAbstractDataAttribute tAbstractDataAttribute = (TAbstractDataAttribute)theEObject;
				T result = caseTAbstractDataAttribute(tAbstractDataAttribute);
				if (result == null) result = caseTUnNaming(tAbstractDataAttribute);
				if (result == null) result = caseTBaseElement(tAbstractDataAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TACCESS_CONTROL: {
				TAccessControl tAccessControl = (TAccessControl)theEObject;
				T result = caseTAccessControl(tAccessControl);
				if (result == null) result = caseTAnyContentFromOtherNamespace(tAccessControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TACCESS_POINT: {
				TAccessPoint tAccessPoint = (TAccessPoint)theEObject;
				T result = caseTAccessPoint(tAccessPoint);
				if (result == null) result = caseTNaming(tAccessPoint);
				if (result == null) result = caseTBaseElement(tAccessPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TADDRESS: {
				TAddress tAddress = (TAddress)theEObject;
				T result = caseTAddress(tAddress);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TANY_CONTENT_FROM_OTHER_NAMESPACE: {
				TAnyContentFromOtherNamespace tAnyContentFromOtherNamespace = (TAnyContentFromOtherNamespace)theEObject;
				T result = caseTAnyContentFromOtherNamespace(tAnyContentFromOtherNamespace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TANY_LN: {
				TAnyLN tAnyLN = (TAnyLN)theEObject;
				T result = caseTAnyLN(tAnyLN);
				if (result == null) result = caseTUnNaming(tAnyLN);
				if (result == null) result = caseTBaseElement(tAnyLN);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TASSOCIATION: {
				TAssociation tAssociation = (TAssociation)theEObject;
				T result = caseTAssociation(tAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TBASE_ELEMENT: {
				TBaseElement tBaseElement = (TBaseElement)theEObject;
				T result = caseTBaseElement(tBaseElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TBAY: {
				TBay tBay = (TBay)theEObject;
				T result = caseTBay(tBay);
				if (result == null) result = caseTEquipmentContainer(tBay);
				if (result == null) result = caseTPowerSystemResource(tBay);
				if (result == null) result = caseTLNodeContainer(tBay);
				if (result == null) result = caseTNaming(tBay);
				if (result == null) result = caseTBaseElement(tBay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TBDA: {
				TBDA tbda = (TBDA)theEObject;
				T result = caseTBDA(tbda);
				if (result == null) result = caseTAbstractDataAttribute(tbda);
				if (result == null) result = caseTUnNaming(tbda);
				if (result == null) result = caseTBaseElement(tbda);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TBIT_RATE_IN_MB_PER_SEC: {
				TBitRateInMbPerSec tBitRateInMbPerSec = (TBitRateInMbPerSec)theEObject;
				T result = caseTBitRateInMbPerSec(tBitRateInMbPerSec);
				if (result == null) result = caseTValueWithUnit(tBitRateInMbPerSec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TCLIENT_LN: {
				TClientLN tClientLN = (TClientLN)theEObject;
				T result = caseTClientLN(tClientLN);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TCLIENT_SERVICES: {
				TClientServices tClientServices = (TClientServices)theEObject;
				T result = caseTClientServices(tClientServices);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TCOMMUNICATION: {
				TCommunication tCommunication = (TCommunication)theEObject;
				T result = caseTCommunication(tCommunication);
				if (result == null) result = caseTUnNaming(tCommunication);
				if (result == null) result = caseTBaseElement(tCommunication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TCONDUCTING_EQUIPMENT: {
				TConductingEquipment tConductingEquipment = (TConductingEquipment)theEObject;
				T result = caseTConductingEquipment(tConductingEquipment);
				if (result == null) result = caseTAbstractConductingEquipment(tConductingEquipment);
				if (result == null) result = caseTEquipment(tConductingEquipment);
				if (result == null) result = caseTPowerSystemResource(tConductingEquipment);
				if (result == null) result = caseTLNodeContainer(tConductingEquipment);
				if (result == null) result = caseTNaming(tConductingEquipment);
				if (result == null) result = caseTBaseElement(tConductingEquipment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TCONF_LNS: {
				TConfLNs tConfLNs = (TConfLNs)theEObject;
				T result = caseTConfLNs(tConfLNs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TCONNECTED_AP: {
				TConnectedAP tConnectedAP = (TConnectedAP)theEObject;
				T result = caseTConnectedAP(tConnectedAP);
				if (result == null) result = caseTUnNaming(tConnectedAP);
				if (result == null) result = caseTBaseElement(tConnectedAP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TCONNECTIVITY_NODE: {
				TConnectivityNode tConnectivityNode = (TConnectivityNode)theEObject;
				T result = caseTConnectivityNode(tConnectivityNode);
				if (result == null) result = caseTLNodeContainer(tConnectivityNode);
				if (result == null) result = caseTNaming(tConnectivityNode);
				if (result == null) result = caseTBaseElement(tConnectivityNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TCONTROL: {
				TControl tControl = (TControl)theEObject;
				T result = caseTControl(tControl);
				if (result == null) result = caseTNaming(tControl);
				if (result == null) result = caseTBaseElement(tControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TCONTROL_BLOCK: {
				TControlBlock tControlBlock = (TControlBlock)theEObject;
				T result = caseTControlBlock(tControlBlock);
				if (result == null) result = caseTUnNaming(tControlBlock);
				if (result == null) result = caseTBaseElement(tControlBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TCONTROL_WITH_IED_NAME: {
				TControlWithIEDName tControlWithIEDName = (TControlWithIEDName)theEObject;
				T result = caseTControlWithIEDName(tControlWithIEDName);
				if (result == null) result = caseTControl(tControlWithIEDName);
				if (result == null) result = caseTNaming(tControlWithIEDName);
				if (result == null) result = caseTBaseElement(tControlWithIEDName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TCONTROL_WITH_TRIGGER_OPT: {
				TControlWithTriggerOpt tControlWithTriggerOpt = (TControlWithTriggerOpt)theEObject;
				T result = caseTControlWithTriggerOpt(tControlWithTriggerOpt);
				if (result == null) result = caseTControl(tControlWithTriggerOpt);
				if (result == null) result = caseTNaming(tControlWithTriggerOpt);
				if (result == null) result = caseTBaseElement(tControlWithTriggerOpt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TDA: {
				TDA tda = (TDA)theEObject;
				T result = caseTDA(tda);
				if (result == null) result = caseTAbstractDataAttribute(tda);
				if (result == null) result = caseTUnNaming(tda);
				if (result == null) result = caseTBaseElement(tda);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TDAI: {
				TDAI tdai = (TDAI)theEObject;
				T result = caseTDAI(tdai);
				if (result == null) result = caseTUnNaming(tdai);
				if (result == null) result = caseTBaseElement(tdai);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TDATA_SET: {
				TDataSet tDataSet = (TDataSet)theEObject;
				T result = caseTDataSet(tDataSet);
				if (result == null) result = caseTNaming(tDataSet);
				if (result == null) result = caseTBaseElement(tDataSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TDATA_TYPE_TEMPLATES: {
				TDataTypeTemplates tDataTypeTemplates = (TDataTypeTemplates)theEObject;
				T result = caseTDataTypeTemplates(tDataTypeTemplates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TDA_TYPE: {
				TDAType tdaType = (TDAType)theEObject;
				T result = caseTDAType(tdaType);
				if (result == null) result = caseTIDNaming(tdaType);
				if (result == null) result = caseTBaseElement(tdaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TDO: {
				TDO tdo = (TDO)theEObject;
				T result = caseTDO(tdo);
				if (result == null) result = caseTUnNaming(tdo);
				if (result == null) result = caseTBaseElement(tdo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TDOI: {
				TDOI tdoi = (TDOI)theEObject;
				T result = caseTDOI(tdoi);
				if (result == null) result = caseTUnNaming(tdoi);
				if (result == null) result = caseTBaseElement(tdoi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TDO_TYPE: {
				TDOType tdoType = (TDOType)theEObject;
				T result = caseTDOType(tdoType);
				if (result == null) result = caseTIDNaming(tdoType);
				if (result == null) result = caseTBaseElement(tdoType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TDURATION_IN_MILLI_SEC: {
				TDurationInMilliSec tDurationInMilliSec = (TDurationInMilliSec)theEObject;
				T result = caseTDurationInMilliSec(tDurationInMilliSec);
				if (result == null) result = caseTValueWithUnit(tDurationInMilliSec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TDURATION_IN_SEC: {
				TDurationInSec tDurationInSec = (TDurationInSec)theEObject;
				T result = caseTDurationInSec(tDurationInSec);
				if (result == null) result = caseTValueWithUnit(tDurationInSec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TENUM_TYPE: {
				TEnumType tEnumType = (TEnumType)theEObject;
				T result = caseTEnumType(tEnumType);
				if (result == null) result = caseTIDNaming(tEnumType);
				if (result == null) result = caseTBaseElement(tEnumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TENUM_VAL: {
				TEnumVal tEnumVal = (TEnumVal)theEObject;
				T result = caseTEnumVal(tEnumVal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TEQUIPMENT: {
				TEquipment tEquipment = (TEquipment)theEObject;
				T result = caseTEquipment(tEquipment);
				if (result == null) result = caseTPowerSystemResource(tEquipment);
				if (result == null) result = caseTLNodeContainer(tEquipment);
				if (result == null) result = caseTNaming(tEquipment);
				if (result == null) result = caseTBaseElement(tEquipment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TEQUIPMENT_CONTAINER: {
				TEquipmentContainer tEquipmentContainer = (TEquipmentContainer)theEObject;
				T result = caseTEquipmentContainer(tEquipmentContainer);
				if (result == null) result = caseTPowerSystemResource(tEquipmentContainer);
				if (result == null) result = caseTLNodeContainer(tEquipmentContainer);
				if (result == null) result = caseTNaming(tEquipmentContainer);
				if (result == null) result = caseTBaseElement(tEquipmentContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TEXT_REF: {
				TExtRef tExtRef = (TExtRef)theEObject;
				T result = caseTExtRef(tExtRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TFCCB: {
				TFCCB tfccb = (TFCCB)theEObject;
				T result = caseTFCCB(tfccb);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TFCDA: {
				TFCDA tfcda = (TFCDA)theEObject;
				T result = caseTFCDA(tfcda);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TFUNCTION: {
				TFunction tFunction = (TFunction)theEObject;
				T result = caseTFunction(tFunction);
				if (result == null) result = caseTPowerSystemResource(tFunction);
				if (result == null) result = caseTLNodeContainer(tFunction);
				if (result == null) result = caseTNaming(tFunction);
				if (result == null) result = caseTBaseElement(tFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TGENERAL_EQUIPMENT: {
				TGeneralEquipment tGeneralEquipment = (TGeneralEquipment)theEObject;
				T result = caseTGeneralEquipment(tGeneralEquipment);
				if (result == null) result = caseTEquipment(tGeneralEquipment);
				if (result == null) result = caseTPowerSystemResource(tGeneralEquipment);
				if (result == null) result = caseTLNodeContainer(tGeneralEquipment);
				if (result == null) result = caseTNaming(tGeneralEquipment);
				if (result == null) result = caseTBaseElement(tGeneralEquipment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TGSE: {
				TGSE tgse = (TGSE)theEObject;
				T result = caseTGSE(tgse);
				if (result == null) result = caseTControlBlock(tgse);
				if (result == null) result = caseTUnNaming(tgse);
				if (result == null) result = caseTBaseElement(tgse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TGSE_CONTROL: {
				TGSEControl tgseControl = (TGSEControl)theEObject;
				T result = caseTGSEControl(tgseControl);
				if (result == null) result = caseTControlWithIEDName(tgseControl);
				if (result == null) result = caseTControl(tgseControl);
				if (result == null) result = caseTNaming(tgseControl);
				if (result == null) result = caseTBaseElement(tgseControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TGSE_SETTINGS: {
				TGSESettings tgseSettings = (TGSESettings)theEObject;
				T result = caseTGSESettings(tgseSettings);
				if (result == null) result = caseTServiceSettings(tgseSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.THEADER: {
				THeader tHeader = (THeader)theEObject;
				T result = caseTHeader(tHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.THITEM: {
				THitem tHitem = (THitem)theEObject;
				T result = caseTHitem(tHitem);
				if (result == null) result = caseTAnyContentFromOtherNamespace(tHitem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TID_NAMING: {
				TIDNaming tidNaming = (TIDNaming)theEObject;
				T result = caseTIDNaming(tidNaming);
				if (result == null) result = caseTBaseElement(tidNaming);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TIED: {
				TIED tied = (TIED)theEObject;
				T result = caseTIED(tied);
				if (result == null) result = caseTNaming(tied);
				if (result == null) result = caseTBaseElement(tied);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TINPUTS: {
				TInputs tInputs = (TInputs)theEObject;
				T result = caseTInputs(tInputs);
				if (result == null) result = caseTUnNaming(tInputs);
				if (result == null) result = caseTBaseElement(tInputs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TL_DEVICE: {
				TLDevice tlDevice = (TLDevice)theEObject;
				T result = caseTLDevice(tlDevice);
				if (result == null) result = caseTUnNaming(tlDevice);
				if (result == null) result = caseTBaseElement(tlDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TLN: {
				TLN tln = (TLN)theEObject;
				T result = caseTLN(tln);
				if (result == null) result = caseTAnyLN(tln);
				if (result == null) result = caseTUnNaming(tln);
				if (result == null) result = caseTBaseElement(tln);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TLN0: {
				TLN0 tln0 = (TLN0)theEObject;
				T result = caseTLN0(tln0);
				if (result == null) result = caseTAnyLN(tln0);
				if (result == null) result = caseTUnNaming(tln0);
				if (result == null) result = caseTBaseElement(tln0);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TL_NODE: {
				TLNode tlNode = (TLNode)theEObject;
				T result = caseTLNode(tlNode);
				if (result == null) result = caseTUnNaming(tlNode);
				if (result == null) result = caseTBaseElement(tlNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TL_NODE_CONTAINER: {
				TLNodeContainer tlNodeContainer = (TLNodeContainer)theEObject;
				T result = caseTLNodeContainer(tlNodeContainer);
				if (result == null) result = caseTNaming(tlNodeContainer);
				if (result == null) result = caseTBaseElement(tlNodeContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TL_NODE_TYPE: {
				TLNodeType tlNodeType = (TLNodeType)theEObject;
				T result = caseTLNodeType(tlNodeType);
				if (result == null) result = caseTIDNaming(tlNodeType);
				if (result == null) result = caseTBaseElement(tlNodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TLOG: {
				TLog tLog = (TLog)theEObject;
				T result = caseTLog(tLog);
				if (result == null) result = caseTAnyContentFromOtherNamespace(tLog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TLOG_CONTROL: {
				TLogControl tLogControl = (TLogControl)theEObject;
				T result = caseTLogControl(tLogControl);
				if (result == null) result = caseTControlWithTriggerOpt(tLogControl);
				if (result == null) result = caseTControl(tLogControl);
				if (result == null) result = caseTNaming(tLogControl);
				if (result == null) result = caseTBaseElement(tLogControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TLOG_SETTINGS: {
				TLogSettings tLogSettings = (TLogSettings)theEObject;
				T result = caseTLogSettings(tLogSettings);
				if (result == null) result = caseTServiceSettings(tLogSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TNAMING: {
				TNaming tNaming = (TNaming)theEObject;
				T result = caseTNaming(tNaming);
				if (result == null) result = caseTBaseElement(tNaming);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TP: {
				TP tp = (TP)theEObject;
				T result = caseTP(tp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TPAPPID: {
				TPAPPID tpappid = (TPAPPID)theEObject;
				T result = caseTPAPPID(tpappid);
				if (result == null) result = caseTP(tpappid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TPHYS_CONN: {
				TPhysConn tPhysConn = (TPhysConn)theEObject;
				T result = caseTPhysConn(tPhysConn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TPIP: {
				TPIP tpip = (TPIP)theEObject;
				T result = caseTPIP(tpip);
				if (result == null) result = caseTP(tpip);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TPIPGATEWAY: {
				TPIPGATEWAY tpipgateway = (TPIPGATEWAY)theEObject;
				T result = caseTPIPGATEWAY(tpipgateway);
				if (result == null) result = caseTP(tpipgateway);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TPIPSUBNET: {
				TPIPSUBNET tpipsubnet = (TPIPSUBNET)theEObject;
				T result = caseTPIPSUBNET(tpipsubnet);
				if (result == null) result = caseTP(tpipsubnet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TPMAC_ADDRESS: {
				TPMACAddress tpmacAddress = (TPMACAddress)theEObject;
				T result = caseTPMACAddress(tpmacAddress);
				if (result == null) result = caseTP(tpmacAddress);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TPOSIAE_INVOKE: {
				TPOSIAEInvoke tposiaeInvoke = (TPOSIAEInvoke)theEObject;
				T result = caseTPOSIAEInvoke(tposiaeInvoke);
				if (result == null) result = caseTP(tposiaeInvoke);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TPOSIAE_QUALIFIER: {
				TPOSIAEQualifier tposiaeQualifier = (TPOSIAEQualifier)theEObject;
				T result = caseTPOSIAEQualifier(tposiaeQualifier);
				if (result == null) result = caseTP(tposiaeQualifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TPOSIAP_INVOKE: {
				TPOSIAPInvoke tposiapInvoke = (TPOSIAPInvoke)theEObject;
				T result = caseTPOSIAPInvoke(tposiapInvoke);
				if (result == null) result = caseTP(tposiapInvoke);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TPOSIAP_TITLE: {
				TPOSIAPTitle tposiapTitle = (TPOSIAPTitle)theEObject;
				T result = caseTPOSIAPTitle(tposiapTitle);
				if (result == null) result = caseTP(tposiapTitle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TPOSINSAP: {
				TPOSINSAP tposinsap = (TPOSINSAP)theEObject;
				T result = caseTPOSINSAP(tposinsap);
				if (result == null) result = caseTP(tposinsap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TPOSIPSEL: {
				TPOSIPSEL tposipsel = (TPOSIPSEL)theEObject;
				T result = caseTPOSIPSEL(tposipsel);
				if (result == null) result = caseTP(tposipsel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TPOSISSEL: {
				TPOSISSEL tposissel = (TPOSISSEL)theEObject;
				T result = caseTPOSISSEL(tposissel);
				if (result == null) result = caseTP(tposissel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TPOSITSEL: {
				TPOSITSEL tpositsel = (TPOSITSEL)theEObject;
				T result = caseTPOSITSEL(tpositsel);
				if (result == null) result = caseTP(tpositsel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TPOWER_SYSTEM_RESOURCE: {
				TPowerSystemResource tPowerSystemResource = (TPowerSystemResource)theEObject;
				T result = caseTPowerSystemResource(tPowerSystemResource);
				if (result == null) result = caseTLNodeContainer(tPowerSystemResource);
				if (result == null) result = caseTNaming(tPowerSystemResource);
				if (result == null) result = caseTBaseElement(tPowerSystemResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TPOWER_TRANSFORMER: {
				TPowerTransformer tPowerTransformer = (TPowerTransformer)theEObject;
				T result = caseTPowerTransformer(tPowerTransformer);
				if (result == null) result = caseTEquipment(tPowerTransformer);
				if (result == null) result = caseTPowerSystemResource(tPowerTransformer);
				if (result == null) result = caseTLNodeContainer(tPowerTransformer);
				if (result == null) result = caseTNaming(tPowerTransformer);
				if (result == null) result = caseTBaseElement(tPowerTransformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TPRIVATE: {
				TPrivate tPrivate = (TPrivate)theEObject;
				T result = caseTPrivate(tPrivate);
				if (result == null) result = caseTAnyContentFromOtherNamespace(tPrivate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TPVLANID: {
				TPVLANID tpvlanid = (TPVLANID)theEObject;
				T result = caseTPVLANID(tpvlanid);
				if (result == null) result = caseTP(tpvlanid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TPVLANPRIORITY: {
				TPVLANPRIORITY tpvlanpriority = (TPVLANPRIORITY)theEObject;
				T result = caseTPVLANPRIORITY(tpvlanpriority);
				if (result == null) result = caseTP(tpvlanpriority);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TREPORT_CONTROL: {
				TReportControl tReportControl = (TReportControl)theEObject;
				T result = caseTReportControl(tReportControl);
				if (result == null) result = caseTControlWithTriggerOpt(tReportControl);
				if (result == null) result = caseTControl(tReportControl);
				if (result == null) result = caseTNaming(tReportControl);
				if (result == null) result = caseTBaseElement(tReportControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TREPORT_SETTINGS: {
				TReportSettings tReportSettings = (TReportSettings)theEObject;
				T result = caseTReportSettings(tReportSettings);
				if (result == null) result = caseTServiceSettings(tReportSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TRPT_ENABLED: {
				TRptEnabled tRptEnabled = (TRptEnabled)theEObject;
				T result = caseTRptEnabled(tRptEnabled);
				if (result == null) result = caseTUnNaming(tRptEnabled);
				if (result == null) result = caseTBaseElement(tRptEnabled);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TSAMPLED_VALUE_CONTROL: {
				TSampledValueControl tSampledValueControl = (TSampledValueControl)theEObject;
				T result = caseTSampledValueControl(tSampledValueControl);
				if (result == null) result = caseTControlWithIEDName(tSampledValueControl);
				if (result == null) result = caseTControl(tSampledValueControl);
				if (result == null) result = caseTNaming(tSampledValueControl);
				if (result == null) result = caseTBaseElement(tSampledValueControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TSCL_CONTROL: {
				TSCLControl tsclControl = (TSCLControl)theEObject;
				T result = caseTSCLControl(tsclControl);
				if (result == null) result = caseTUnNaming(tsclControl);
				if (result == null) result = caseTBaseElement(tsclControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TSDI: {
				TSDI tsdi = (TSDI)theEObject;
				T result = caseTSDI(tsdi);
				if (result == null) result = caseTUnNaming(tsdi);
				if (result == null) result = caseTBaseElement(tsdi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TSDO: {
				TSDO tsdo = (TSDO)theEObject;
				T result = caseTSDO(tsdo);
				if (result == null) result = caseTNaming(tsdo);
				if (result == null) result = caseTBaseElement(tsdo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TSERVER: {
				TServer tServer = (TServer)theEObject;
				T result = caseTServer(tServer);
				if (result == null) result = caseTUnNaming(tServer);
				if (result == null) result = caseTBaseElement(tServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TSERVICES: {
				TServices tServices = (TServices)theEObject;
				T result = caseTServices(tServices);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TSERVICE_SETTINGS: {
				TServiceSettings tServiceSettings = (TServiceSettings)theEObject;
				T result = caseTServiceSettings(tServiceSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TSERVICE_WITH_MAX: {
				TServiceWithMax tServiceWithMax = (TServiceWithMax)theEObject;
				T result = caseTServiceWithMax(tServiceWithMax);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TSERVICE_WITH_MAX_AND_MAX_ATTRIBUTES: {
				TServiceWithMaxAndMaxAttributes tServiceWithMaxAndMaxAttributes = (TServiceWithMaxAndMaxAttributes)theEObject;
				T result = caseTServiceWithMaxAndMaxAttributes(tServiceWithMaxAndMaxAttributes);
				if (result == null) result = caseTServiceWithMax(tServiceWithMaxAndMaxAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TSERVICE_WITH_MAX_AND_MAX_ATTRIBUTES_AND_MODIFY: {
				TServiceWithMaxAndMaxAttributesAndModify tServiceWithMaxAndMaxAttributesAndModify = (TServiceWithMaxAndMaxAttributesAndModify)theEObject;
				T result = caseTServiceWithMaxAndMaxAttributesAndModify(tServiceWithMaxAndMaxAttributesAndModify);
				if (result == null) result = caseTServiceWithMaxAndMaxAttributes(tServiceWithMaxAndMaxAttributesAndModify);
				if (result == null) result = caseTServiceWithMax(tServiceWithMaxAndMaxAttributesAndModify);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TSERVICE_WITH_MAX_AND_MODIFY: {
				TServiceWithMaxAndModify tServiceWithMaxAndModify = (TServiceWithMaxAndModify)theEObject;
				T result = caseTServiceWithMaxAndModify(tServiceWithMaxAndModify);
				if (result == null) result = caseTServiceWithMax(tServiceWithMaxAndModify);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TSERVICE_YES_NO: {
				TServiceYesNo tServiceYesNo = (TServiceYesNo)theEObject;
				T result = caseTServiceYesNo(tServiceYesNo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TSETTING_CONTROL: {
				TSettingControl tSettingControl = (TSettingControl)theEObject;
				T result = caseTSettingControl(tSettingControl);
				if (result == null) result = caseTUnNaming(tSettingControl);
				if (result == null) result = caseTBaseElement(tSettingControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TSMV: {
				TSMV tsmv = (TSMV)theEObject;
				T result = caseTSMV(tsmv);
				if (result == null) result = caseTControlBlock(tsmv);
				if (result == null) result = caseTUnNaming(tsmv);
				if (result == null) result = caseTBaseElement(tsmv);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TSMV_SETTINGS: {
				TSMVSettings tsmvSettings = (TSMVSettings)theEObject;
				T result = caseTSMVSettings(tsmvSettings);
				if (result == null) result = caseTServiceSettings(tsmvSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TSUB_EQUIPMENT: {
				TSubEquipment tSubEquipment = (TSubEquipment)theEObject;
				T result = caseTSubEquipment(tSubEquipment);
				if (result == null) result = caseTPowerSystemResource(tSubEquipment);
				if (result == null) result = caseTLNodeContainer(tSubEquipment);
				if (result == null) result = caseTNaming(tSubEquipment);
				if (result == null) result = caseTBaseElement(tSubEquipment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TSUB_FUNCTION: {
				TSubFunction tSubFunction = (TSubFunction)theEObject;
				T result = caseTSubFunction(tSubFunction);
				if (result == null) result = caseTPowerSystemResource(tSubFunction);
				if (result == null) result = caseTLNodeContainer(tSubFunction);
				if (result == null) result = caseTNaming(tSubFunction);
				if (result == null) result = caseTBaseElement(tSubFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TSUB_NETWORK: {
				TSubNetwork tSubNetwork = (TSubNetwork)theEObject;
				T result = caseTSubNetwork(tSubNetwork);
				if (result == null) result = caseTNaming(tSubNetwork);
				if (result == null) result = caseTBaseElement(tSubNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TSUBSTATION: {
				TSubstation tSubstation = (TSubstation)theEObject;
				T result = caseTSubstation(tSubstation);
				if (result == null) result = caseTEquipmentContainer(tSubstation);
				if (result == null) result = caseTPowerSystemResource(tSubstation);
				if (result == null) result = caseTLNodeContainer(tSubstation);
				if (result == null) result = caseTNaming(tSubstation);
				if (result == null) result = caseTBaseElement(tSubstation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TTAP_CHANGER: {
				TTapChanger tTapChanger = (TTapChanger)theEObject;
				T result = caseTTapChanger(tTapChanger);
				if (result == null) result = caseTPowerSystemResource(tTapChanger);
				if (result == null) result = caseTLNodeContainer(tTapChanger);
				if (result == null) result = caseTNaming(tTapChanger);
				if (result == null) result = caseTBaseElement(tTapChanger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TTERMINAL: {
				TTerminal tTerminal = (TTerminal)theEObject;
				T result = caseTTerminal(tTerminal);
				if (result == null) result = caseTUnNaming(tTerminal);
				if (result == null) result = caseTBaseElement(tTerminal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TTEXT: {
				TText tText = (TText)theEObject;
				T result = caseTText(tText);
				if (result == null) result = caseTAnyContentFromOtherNamespace(tText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TTRANSFORMER_WINDING: {
				TTransformerWinding tTransformerWinding = (TTransformerWinding)theEObject;
				T result = caseTTransformerWinding(tTransformerWinding);
				if (result == null) result = caseTAbstractConductingEquipment(tTransformerWinding);
				if (result == null) result = caseTEquipment(tTransformerWinding);
				if (result == null) result = caseTPowerSystemResource(tTransformerWinding);
				if (result == null) result = caseTLNodeContainer(tTransformerWinding);
				if (result == null) result = caseTNaming(tTransformerWinding);
				if (result == null) result = caseTBaseElement(tTransformerWinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TTRG_OPS: {
				TTrgOps tTrgOps = (TTrgOps)theEObject;
				T result = caseTTrgOps(tTrgOps);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TUN_NAMING: {
				TUnNaming tUnNaming = (TUnNaming)theEObject;
				T result = caseTUnNaming(tUnNaming);
				if (result == null) result = caseTBaseElement(tUnNaming);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TVAL: {
				TVal tVal = (TVal)theEObject;
				T result = caseTVal(tVal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TVALUE_WITH_UNIT: {
				TValueWithUnit tValueWithUnit = (TValueWithUnit)theEObject;
				T result = caseTValueWithUnit(tValueWithUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TVOLTAGE: {
				TVoltage tVoltage = (TVoltage)theEObject;
				T result = caseTVoltage(tVoltage);
				if (result == null) result = caseTValueWithUnit(tVoltage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SclPackage.TVOLTAGE_LEVEL: {
				TVoltageLevel tVoltageLevel = (TVoltageLevel)theEObject;
				T result = caseTVoltageLevel(tVoltageLevel);
				if (result == null) result = caseTEquipmentContainer(tVoltageLevel);
				if (result == null) result = caseTPowerSystemResource(tVoltageLevel);
				if (result == null) result = caseTLNodeContainer(tVoltageLevel);
				if (result == null) result = caseTNaming(tVoltageLevel);
				if (result == null) result = caseTBaseElement(tVoltageLevel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authentication Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authentication Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthenticationType(AuthenticationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryType(HistoryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LN0 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LN0 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLN0Type(LN0Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opt Fields Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opt Fields Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptFieldsType(OptFieldsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SCL Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SCL Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSCLType(SCLType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Setting Groups Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Setting Groups Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSettingGroupsType(SettingGroupsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Smv Opts Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Smv Opts Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmvOptsType(SmvOptsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAbstract Conducting Equipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAbstract Conducting Equipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTAbstractConductingEquipment(TAbstractConductingEquipment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAbstract Data Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAbstract Data Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTAbstractDataAttribute(TAbstractDataAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAccess Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAccess Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTAccessControl(TAccessControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAccess Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAccess Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTAccessPoint(TAccessPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAddress</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAddress</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTAddress(TAddress object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAny Content From Other Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAny Content From Other Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTAnyContentFromOtherNamespace(TAnyContentFromOtherNamespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAny LN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAny LN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTAnyLN(TAnyLN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAssociation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAssociation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTAssociation(TAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TBase Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TBase Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTBaseElement(TBaseElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TBay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TBay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTBay(TBay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TBDA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TBDA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTBDA(TBDA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TBit Rate In Mb Per Sec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TBit Rate In Mb Per Sec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTBitRateInMbPerSec(TBitRateInMbPerSec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TClient LN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TClient LN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTClientLN(TClientLN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TClient Services</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TClient Services</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTClientServices(TClientServices object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCommunication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCommunication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCommunication(TCommunication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TConducting Equipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TConducting Equipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTConductingEquipment(TConductingEquipment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TConf LNs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TConf LNs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTConfLNs(TConfLNs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TConnected AP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TConnected AP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTConnectedAP(TConnectedAP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TConnectivity Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TConnectivity Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTConnectivityNode(TConnectivityNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TControl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TControl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTControl(TControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TControl Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TControl Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTControlBlock(TControlBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TControl With IED Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TControl With IED Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTControlWithIEDName(TControlWithIEDName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TControl With Trigger Opt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TControl With Trigger Opt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTControlWithTriggerOpt(TControlWithTriggerOpt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTDA(TDA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDAI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDAI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTDAI(TDAI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TData Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TData Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTDataSet(TDataSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TData Type Templates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TData Type Templates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTDataTypeTemplates(TDataTypeTemplates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDA Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDA Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTDAType(TDAType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTDO(TDO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDOI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDOI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTDOI(TDOI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDO Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDO Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTDOType(TDOType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDuration In Milli Sec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDuration In Milli Sec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTDurationInMilliSec(TDurationInMilliSec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDuration In Sec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDuration In Sec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTDurationInSec(TDurationInSec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TEnum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TEnum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTEnumType(TEnumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TEnum Val</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TEnum Val</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTEnumVal(TEnumVal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TEquipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TEquipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTEquipment(TEquipment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TEquipment Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TEquipment Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTEquipmentContainer(TEquipmentContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TExt Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TExt Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTExtRef(TExtRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TFCCB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TFCCB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTFCCB(TFCCB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TFCDA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TFCDA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTFCDA(TFCDA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TFunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TFunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTFunction(TFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TGeneral Equipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TGeneral Equipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTGeneralEquipment(TGeneralEquipment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TGSE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TGSE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTGSE(TGSE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TGSE Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TGSE Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTGSEControl(TGSEControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TGSE Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TGSE Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTGSESettings(TGSESettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>THeader</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>THeader</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTHeader(THeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>THitem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>THitem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTHitem(THitem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TID Naming</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TID Naming</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTIDNaming(TIDNaming object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TIED</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TIED</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTIED(TIED object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TInputs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TInputs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTInputs(TInputs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TL Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TL Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTLDevice(TLDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TLN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TLN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTLN(TLN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TLN0</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TLN0</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTLN0(TLN0 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TL Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TL Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTLNode(TLNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TL Node Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TL Node Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTLNodeContainer(TLNodeContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TL Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TL Node Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTLNodeType(TLNodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TLog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TLog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTLog(TLog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TLog Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TLog Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTLogControl(TLogControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TLog Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TLog Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTLogSettings(TLogSettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TNaming</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TNaming</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTNaming(TNaming object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTP(TP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPAPPID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPAPPID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPAPPID(TPAPPID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPhys Conn</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPhys Conn</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPhysConn(TPhysConn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPIP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPIP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPIP(TPIP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPIPGATEWAY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPIPGATEWAY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPIPGATEWAY(TPIPGATEWAY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPIPSUBNET</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPIPSUBNET</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPIPSUBNET(TPIPSUBNET object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPMAC Address</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPMAC Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPMACAddress(TPMACAddress object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPOSIAE Invoke</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPOSIAE Invoke</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPOSIAEInvoke(TPOSIAEInvoke object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPOSIAE Qualifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPOSIAE Qualifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPOSIAEQualifier(TPOSIAEQualifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPOSIAP Invoke</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPOSIAP Invoke</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPOSIAPInvoke(TPOSIAPInvoke object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPOSIAP Title</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPOSIAP Title</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPOSIAPTitle(TPOSIAPTitle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPOSINSAP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPOSINSAP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPOSINSAP(TPOSINSAP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPOSIPSEL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPOSIPSEL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPOSIPSEL(TPOSIPSEL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPOSISSEL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPOSISSEL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPOSISSEL(TPOSISSEL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPOSITSEL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPOSITSEL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPOSITSEL(TPOSITSEL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPower System Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPower System Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPowerSystemResource(TPowerSystemResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPower Transformer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPower Transformer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPowerTransformer(TPowerTransformer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPrivate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPrivate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPrivate(TPrivate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPVLANID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPVLANID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPVLANID(TPVLANID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPVLANPRIORITY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPVLANPRIORITY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPVLANPRIORITY(TPVLANPRIORITY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TReport Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TReport Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTReportControl(TReportControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TReport Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TReport Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTReportSettings(TReportSettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TRpt Enabled</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TRpt Enabled</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTRptEnabled(TRptEnabled object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSampled Value Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSampled Value Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSampledValueControl(TSampledValueControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSCL Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSCL Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSCLControl(TSCLControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSDI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSDI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSDI(TSDI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSDO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSDO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSDO(TSDO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TServer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TServer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTServer(TServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TServices</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TServices</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTServices(TServices object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TService Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TService Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTServiceSettings(TServiceSettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TService With Max</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TService With Max</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTServiceWithMax(TServiceWithMax object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TService With Max And Max Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TService With Max And Max Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTServiceWithMaxAndMaxAttributes(TServiceWithMaxAndMaxAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TService With Max And Max Attributes And Modify</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TService With Max And Max Attributes And Modify</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTServiceWithMaxAndMaxAttributesAndModify(TServiceWithMaxAndMaxAttributesAndModify object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TService With Max And Modify</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TService With Max And Modify</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTServiceWithMaxAndModify(TServiceWithMaxAndModify object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TService Yes No</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TService Yes No</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTServiceYesNo(TServiceYesNo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSetting Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSetting Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSettingControl(TSettingControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSMV</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSMV</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSMV(TSMV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSMV Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSMV Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSMVSettings(TSMVSettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSub Equipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSub Equipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSubEquipment(TSubEquipment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSub Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSub Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSubFunction(TSubFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSub Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSub Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSubNetwork(TSubNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSubstation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSubstation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSubstation(TSubstation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TTap Changer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TTap Changer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTTapChanger(TTapChanger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TTerminal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TTerminal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTTerminal(TTerminal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TText</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TText</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTText(TText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TTransformer Winding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TTransformer Winding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTTransformerWinding(TTransformerWinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TTrg Ops</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TTrg Ops</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTTrgOps(TTrgOps object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TUn Naming</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TUn Naming</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTUnNaming(TUnNaming object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TVal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TVal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTVal(TVal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TValue With Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TValue With Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTValueWithUnit(TValueWithUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TVoltage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TVoltage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTVoltage(TVoltage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TVoltage Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TVoltage Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTVoltageLevel(TVoltageLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //SclSwitch
