/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.util;

import ch.iec._61850._2006.scl.*;

import java.math.BigDecimal;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see ch.iec._61850._2006.scl.SclPackage
 * @generated
 */
public class SclValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SclValidator INSTANCE = new SclValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "ch.iec._61850._2006.scl";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SclValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SclPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case SclPackage.AUTHENTICATION_TYPE:
				return validateAuthenticationType((AuthenticationType)value, diagnostics, context);
			case SclPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case SclPackage.HISTORY_TYPE:
				return validateHistoryType((HistoryType)value, diagnostics, context);
			case SclPackage.LN0_TYPE:
				return validateLN0Type((LN0Type)value, diagnostics, context);
			case SclPackage.OPT_FIELDS_TYPE:
				return validateOptFieldsType((OptFieldsType)value, diagnostics, context);
			case SclPackage.SCL_TYPE:
				return validateSCLType((SCLType)value, diagnostics, context);
			case SclPackage.SETTING_GROUPS_TYPE:
				return validateSettingGroupsType((SettingGroupsType)value, diagnostics, context);
			case SclPackage.SMV_OPTS_TYPE:
				return validateSmvOptsType((SmvOptsType)value, diagnostics, context);
			case SclPackage.TABSTRACT_CONDUCTING_EQUIPMENT:
				return validateTAbstractConductingEquipment((TAbstractConductingEquipment)value, diagnostics, context);
			case SclPackage.TABSTRACT_DATA_ATTRIBUTE:
				return validateTAbstractDataAttribute((TAbstractDataAttribute)value, diagnostics, context);
			case SclPackage.TACCESS_CONTROL:
				return validateTAccessControl((TAccessControl)value, diagnostics, context);
			case SclPackage.TACCESS_POINT:
				return validateTAccessPoint((TAccessPoint)value, diagnostics, context);
			case SclPackage.TADDRESS:
				return validateTAddress((TAddress)value, diagnostics, context);
			case SclPackage.TANY_CONTENT_FROM_OTHER_NAMESPACE:
				return validateTAnyContentFromOtherNamespace((TAnyContentFromOtherNamespace)value, diagnostics, context);
			case SclPackage.TANY_LN:
				return validateTAnyLN((TAnyLN)value, diagnostics, context);
			case SclPackage.TASSOCIATION:
				return validateTAssociation((TAssociation)value, diagnostics, context);
			case SclPackage.TBASE_ELEMENT:
				return validateTBaseElement((TBaseElement)value, diagnostics, context);
			case SclPackage.TBAY:
				return validateTBay((TBay)value, diagnostics, context);
			case SclPackage.TBDA:
				return validateTBDA((TBDA)value, diagnostics, context);
			case SclPackage.TBIT_RATE_IN_MB_PER_SEC:
				return validateTBitRateInMbPerSec((TBitRateInMbPerSec)value, diagnostics, context);
			case SclPackage.TCLIENT_LN:
				return validateTClientLN((TClientLN)value, diagnostics, context);
			case SclPackage.TCLIENT_SERVICES:
				return validateTClientServices((TClientServices)value, diagnostics, context);
			case SclPackage.TCOMMUNICATION:
				return validateTCommunication((TCommunication)value, diagnostics, context);
			case SclPackage.TCONDUCTING_EQUIPMENT:
				return validateTConductingEquipment((TConductingEquipment)value, diagnostics, context);
			case SclPackage.TCONF_LNS:
				return validateTConfLNs((TConfLNs)value, diagnostics, context);
			case SclPackage.TCONNECTED_AP:
				return validateTConnectedAP((TConnectedAP)value, diagnostics, context);
			case SclPackage.TCONNECTIVITY_NODE:
				return validateTConnectivityNode((TConnectivityNode)value, diagnostics, context);
			case SclPackage.TCONTROL:
				return validateTControl((TControl)value, diagnostics, context);
			case SclPackage.TCONTROL_BLOCK:
				return validateTControlBlock((TControlBlock)value, diagnostics, context);
			case SclPackage.TCONTROL_WITH_IED_NAME:
				return validateTControlWithIEDName((TControlWithIEDName)value, diagnostics, context);
			case SclPackage.TCONTROL_WITH_TRIGGER_OPT:
				return validateTControlWithTriggerOpt((TControlWithTriggerOpt)value, diagnostics, context);
			case SclPackage.TDA:
				return validateTDA((TDA)value, diagnostics, context);
			case SclPackage.TDAI:
				return validateTDAI((TDAI)value, diagnostics, context);
			case SclPackage.TDATA_SET:
				return validateTDataSet((TDataSet)value, diagnostics, context);
			case SclPackage.TDATA_TYPE_TEMPLATES:
				return validateTDataTypeTemplates((TDataTypeTemplates)value, diagnostics, context);
			case SclPackage.TDA_TYPE:
				return validateTDAType((TDAType)value, diagnostics, context);
			case SclPackage.TDO:
				return validateTDO((TDO)value, diagnostics, context);
			case SclPackage.TDOI:
				return validateTDOI((TDOI)value, diagnostics, context);
			case SclPackage.TDO_TYPE:
				return validateTDOType((TDOType)value, diagnostics, context);
			case SclPackage.TDURATION_IN_MILLI_SEC:
				return validateTDurationInMilliSec((TDurationInMilliSec)value, diagnostics, context);
			case SclPackage.TDURATION_IN_SEC:
				return validateTDurationInSec((TDurationInSec)value, diagnostics, context);
			case SclPackage.TENUM_TYPE:
				return validateTEnumType((TEnumType)value, diagnostics, context);
			case SclPackage.TENUM_VAL:
				return validateTEnumVal((TEnumVal)value, diagnostics, context);
			case SclPackage.TEQUIPMENT:
				return validateTEquipment((TEquipment)value, diagnostics, context);
			case SclPackage.TEQUIPMENT_CONTAINER:
				return validateTEquipmentContainer((TEquipmentContainer)value, diagnostics, context);
			case SclPackage.TEXT_REF:
				return validateTExtRef((TExtRef)value, diagnostics, context);
			case SclPackage.TFCCB:
				return validateTFCCB((TFCCB)value, diagnostics, context);
			case SclPackage.TFCDA:
				return validateTFCDA((TFCDA)value, diagnostics, context);
			case SclPackage.TFUNCTION:
				return validateTFunction((TFunction)value, diagnostics, context);
			case SclPackage.TGENERAL_EQUIPMENT:
				return validateTGeneralEquipment((TGeneralEquipment)value, diagnostics, context);
			case SclPackage.TGSE:
				return validateTGSE((TGSE)value, diagnostics, context);
			case SclPackage.TGSE_CONTROL:
				return validateTGSEControl((TGSEControl)value, diagnostics, context);
			case SclPackage.TGSE_SETTINGS:
				return validateTGSESettings((TGSESettings)value, diagnostics, context);
			case SclPackage.THEADER:
				return validateTHeader((THeader)value, diagnostics, context);
			case SclPackage.THITEM:
				return validateTHitem((THitem)value, diagnostics, context);
			case SclPackage.TID_NAMING:
				return validateTIDNaming((TIDNaming)value, diagnostics, context);
			case SclPackage.TIED:
				return validateTIED((TIED)value, diagnostics, context);
			case SclPackage.TINPUTS:
				return validateTInputs((TInputs)value, diagnostics, context);
			case SclPackage.TL_DEVICE:
				return validateTLDevice((TLDevice)value, diagnostics, context);
			case SclPackage.TLN:
				return validateTLN((TLN)value, diagnostics, context);
			case SclPackage.TLN0:
				return validateTLN0((TLN0)value, diagnostics, context);
			case SclPackage.TL_NODE:
				return validateTLNode((TLNode)value, diagnostics, context);
			case SclPackage.TL_NODE_CONTAINER:
				return validateTLNodeContainer((TLNodeContainer)value, diagnostics, context);
			case SclPackage.TL_NODE_TYPE:
				return validateTLNodeType((TLNodeType)value, diagnostics, context);
			case SclPackage.TLOG:
				return validateTLog((TLog)value, diagnostics, context);
			case SclPackage.TLOG_CONTROL:
				return validateTLogControl((TLogControl)value, diagnostics, context);
			case SclPackage.TLOG_SETTINGS:
				return validateTLogSettings((TLogSettings)value, diagnostics, context);
			case SclPackage.TNAMING:
				return validateTNaming((TNaming)value, diagnostics, context);
			case SclPackage.TP:
				return validateTP((TP)value, diagnostics, context);
			case SclPackage.TPAPPID:
				return validateTPAPPID((TPAPPID)value, diagnostics, context);
			case SclPackage.TPHYS_CONN:
				return validateTPhysConn((TPhysConn)value, diagnostics, context);
			case SclPackage.TPIP:
				return validateTPIP((TPIP)value, diagnostics, context);
			case SclPackage.TPIPGATEWAY:
				return validateTPIPGATEWAY((TPIPGATEWAY)value, diagnostics, context);
			case SclPackage.TPIPSUBNET:
				return validateTPIPSUBNET((TPIPSUBNET)value, diagnostics, context);
			case SclPackage.TPMAC_ADDRESS:
				return validateTPMACAddress((TPMACAddress)value, diagnostics, context);
			case SclPackage.TPOSIAE_INVOKE:
				return validateTPOSIAEInvoke((TPOSIAEInvoke)value, diagnostics, context);
			case SclPackage.TPOSIAE_QUALIFIER:
				return validateTPOSIAEQualifier((TPOSIAEQualifier)value, diagnostics, context);
			case SclPackage.TPOSIAP_INVOKE:
				return validateTPOSIAPInvoke((TPOSIAPInvoke)value, diagnostics, context);
			case SclPackage.TPOSIAP_TITLE:
				return validateTPOSIAPTitle((TPOSIAPTitle)value, diagnostics, context);
			case SclPackage.TPOSINSAP:
				return validateTPOSINSAP((TPOSINSAP)value, diagnostics, context);
			case SclPackage.TPOSIPSEL:
				return validateTPOSIPSEL((TPOSIPSEL)value, diagnostics, context);
			case SclPackage.TPOSISSEL:
				return validateTPOSISSEL((TPOSISSEL)value, diagnostics, context);
			case SclPackage.TPOSITSEL:
				return validateTPOSITSEL((TPOSITSEL)value, diagnostics, context);
			case SclPackage.TPOWER_SYSTEM_RESOURCE:
				return validateTPowerSystemResource((TPowerSystemResource)value, diagnostics, context);
			case SclPackage.TPOWER_TRANSFORMER:
				return validateTPowerTransformer((TPowerTransformer)value, diagnostics, context);
			case SclPackage.TPRIVATE:
				return validateTPrivate((TPrivate)value, diagnostics, context);
			case SclPackage.TPVLANID:
				return validateTPVLANID((TPVLANID)value, diagnostics, context);
			case SclPackage.TPVLANPRIORITY:
				return validateTPVLANPRIORITY((TPVLANPRIORITY)value, diagnostics, context);
			case SclPackage.TREPORT_CONTROL:
				return validateTReportControl((TReportControl)value, diagnostics, context);
			case SclPackage.TREPORT_SETTINGS:
				return validateTReportSettings((TReportSettings)value, diagnostics, context);
			case SclPackage.TRPT_ENABLED:
				return validateTRptEnabled((TRptEnabled)value, diagnostics, context);
			case SclPackage.TSAMPLED_VALUE_CONTROL:
				return validateTSampledValueControl((TSampledValueControl)value, diagnostics, context);
			case SclPackage.TSCL_CONTROL:
				return validateTSCLControl((TSCLControl)value, diagnostics, context);
			case SclPackage.TSDI:
				return validateTSDI((TSDI)value, diagnostics, context);
			case SclPackage.TSDO:
				return validateTSDO((TSDO)value, diagnostics, context);
			case SclPackage.TSERVER:
				return validateTServer((TServer)value, diagnostics, context);
			case SclPackage.TSERVICES:
				return validateTServices((TServices)value, diagnostics, context);
			case SclPackage.TSERVICE_SETTINGS:
				return validateTServiceSettings((TServiceSettings)value, diagnostics, context);
			case SclPackage.TSERVICE_WITH_MAX:
				return validateTServiceWithMax((TServiceWithMax)value, diagnostics, context);
			case SclPackage.TSERVICE_WITH_MAX_AND_MAX_ATTRIBUTES:
				return validateTServiceWithMaxAndMaxAttributes((TServiceWithMaxAndMaxAttributes)value, diagnostics, context);
			case SclPackage.TSERVICE_WITH_MAX_AND_MAX_ATTRIBUTES_AND_MODIFY:
				return validateTServiceWithMaxAndMaxAttributesAndModify((TServiceWithMaxAndMaxAttributesAndModify)value, diagnostics, context);
			case SclPackage.TSERVICE_WITH_MAX_AND_MODIFY:
				return validateTServiceWithMaxAndModify((TServiceWithMaxAndModify)value, diagnostics, context);
			case SclPackage.TSERVICE_YES_NO:
				return validateTServiceYesNo((TServiceYesNo)value, diagnostics, context);
			case SclPackage.TSETTING_CONTROL:
				return validateTSettingControl((TSettingControl)value, diagnostics, context);
			case SclPackage.TSMV:
				return validateTSMV((TSMV)value, diagnostics, context);
			case SclPackage.TSMV_SETTINGS:
				return validateTSMVSettings((TSMVSettings)value, diagnostics, context);
			case SclPackage.TSUB_EQUIPMENT:
				return validateTSubEquipment((TSubEquipment)value, diagnostics, context);
			case SclPackage.TSUB_FUNCTION:
				return validateTSubFunction((TSubFunction)value, diagnostics, context);
			case SclPackage.TSUB_NETWORK:
				return validateTSubNetwork((TSubNetwork)value, diagnostics, context);
			case SclPackage.TSUBSTATION:
				return validateTSubstation((TSubstation)value, diagnostics, context);
			case SclPackage.TTAP_CHANGER:
				return validateTTapChanger((TTapChanger)value, diagnostics, context);
			case SclPackage.TTERMINAL:
				return validateTTerminal((TTerminal)value, diagnostics, context);
			case SclPackage.TTEXT:
				return validateTText((TText)value, diagnostics, context);
			case SclPackage.TTRANSFORMER_WINDING:
				return validateTTransformerWinding((TTransformerWinding)value, diagnostics, context);
			case SclPackage.TTRG_OPS:
				return validateTTrgOps((TTrgOps)value, diagnostics, context);
			case SclPackage.TUN_NAMING:
				return validateTUnNaming((TUnNaming)value, diagnostics, context);
			case SclPackage.TVAL:
				return validateTVal((TVal)value, diagnostics, context);
			case SclPackage.TVALUE_WITH_UNIT:
				return validateTValueWithUnit((TValueWithUnit)value, diagnostics, context);
			case SclPackage.TVOLTAGE:
				return validateTVoltage((TVoltage)value, diagnostics, context);
			case SclPackage.TVOLTAGE_LEVEL:
				return validateTVoltageLevel((TVoltageLevel)value, diagnostics, context);
			case SclPackage.NAME_STRUCTURE_TYPE:
				return validateNameStructureType((NameStructureType)value, diagnostics, context);
			case SclPackage.TASSOCIATION_KIND_ENUM:
				return validateTAssociationKindEnum((TAssociationKindEnum)value, diagnostics, context);
			case SclPackage.TAUTHENTICATION_ENUM:
				return validateTAuthenticationEnum((TAuthenticationEnum)value, diagnostics, context);
			case SclPackage.TDOMAIN_LN_GROUP_AENUM:
				return validateTDomainLNGroupAEnum((TDomainLNGroupAEnum)value, diagnostics, context);
			case SclPackage.TDOMAIN_LN_GROUP_CENUM:
				return validateTDomainLNGroupCEnum((TDomainLNGroupCEnum)value, diagnostics, context);
			case SclPackage.TDOMAIN_LN_GROUP_GENUM:
				return validateTDomainLNGroupGEnum((TDomainLNGroupGEnum)value, diagnostics, context);
			case SclPackage.TDOMAIN_LN_GROUP_IENUM:
				return validateTDomainLNGroupIEnum((TDomainLNGroupIEnum)value, diagnostics, context);
			case SclPackage.TDOMAIN_LN_GROUP_MENUM:
				return validateTDomainLNGroupMEnum((TDomainLNGroupMEnum)value, diagnostics, context);
			case SclPackage.TDOMAIN_LN_GROUP_PENUM:
				return validateTDomainLNGroupPEnum((TDomainLNGroupPEnum)value, diagnostics, context);
			case SclPackage.TDOMAIN_LN_GROUP_RENUM:
				return validateTDomainLNGroupREnum((TDomainLNGroupREnum)value, diagnostics, context);
			case SclPackage.TDOMAIN_LN_GROUP_SENUM:
				return validateTDomainLNGroupSEnum((TDomainLNGroupSEnum)value, diagnostics, context);
			case SclPackage.TDOMAIN_LN_GROUP_TENUM:
				return validateTDomainLNGroupTEnum((TDomainLNGroupTEnum)value, diagnostics, context);
			case SclPackage.TDOMAIN_LN_GROUP_XENUM:
				return validateTDomainLNGroupXEnum((TDomainLNGroupXEnum)value, diagnostics, context);
			case SclPackage.TDOMAIN_LN_GROUP_YENUM:
				return validateTDomainLNGroupYEnum((TDomainLNGroupYEnum)value, diagnostics, context);
			case SclPackage.TDOMAIN_LN_GROUP_ZENUM:
				return validateTDomainLNGroupZEnum((TDomainLNGroupZEnum)value, diagnostics, context);
			case SclPackage.TFC_ENUM:
				return validateTFCEnum((TFCEnum)value, diagnostics, context);
			case SclPackage.TGSE_CONTROL_TYPE_ENUM:
				return validateTGSEControlTypeEnum((TGSEControlTypeEnum)value, diagnostics, context);
			case SclPackage.TLLN0_ENUM:
				return validateTLLN0Enum((TLLN0Enum)value, diagnostics, context);
			case SclPackage.TLPHD_ENUM:
				return validateTLPHDEnum((TLPHDEnum)value, diagnostics, context);
			case SclPackage.TPHASE_ENUM:
				return validateTPhaseEnum((TPhaseEnum)value, diagnostics, context);
			case SclPackage.TPOWER_TRANSFORMER_ENUM:
				return validateTPowerTransformerEnum((TPowerTransformerEnum)value, diagnostics, context);
			case SclPackage.TPREDEFINED_ATTRIBUTE_NAME_ENUM:
				return validateTPredefinedAttributeNameEnum((TPredefinedAttributeNameEnum)value, diagnostics, context);
			case SclPackage.TPREDEFINED_BASIC_TYPE_ENUM:
				return validateTPredefinedBasicTypeEnum((TPredefinedBasicTypeEnum)value, diagnostics, context);
			case SclPackage.TPREDEFINED_CDC_ENUM:
				return validateTPredefinedCDCEnum((TPredefinedCDCEnum)value, diagnostics, context);
			case SclPackage.TPREDEFINED_COMMON_CONDUCTING_EQUIPMENT_ENUM:
				return validateTPredefinedCommonConductingEquipmentEnum((TPredefinedCommonConductingEquipmentEnum)value, diagnostics, context);
			case SclPackage.TPREDEFINED_GENERAL_EQUIPMENT_ENUM:
				return validateTPredefinedGeneralEquipmentEnum((TPredefinedGeneralEquipmentEnum)value, diagnostics, context);
			case SclPackage.TPREDEFINED_PTYPE_ENUM:
				return validateTPredefinedPTypeEnum((TPredefinedPTypeEnum)value, diagnostics, context);
			case SclPackage.TSERVICE_FC_ENUM:
				return validateTServiceFCEnum((TServiceFCEnum)value, diagnostics, context);
			case SclPackage.TSERVICE_SETTINGS_ENUM:
				return validateTServiceSettingsEnum((TServiceSettingsEnum)value, diagnostics, context);
			case SclPackage.TSI_UNIT_ENUM:
				return validateTSIUnitEnum((TSIUnitEnum)value, diagnostics, context);
			case SclPackage.TTRANSFORMER_WINDING_ENUM:
				return validateTTransformerWindingEnum((TTransformerWindingEnum)value, diagnostics, context);
			case SclPackage.TTRG_OPT_CONTROL_ENUM:
				return validateTTrgOptControlEnum((TTrgOptControlEnum)value, diagnostics, context);
			case SclPackage.TTRG_OPT_ENUM:
				return validateTTrgOptEnum((TTrgOptEnum)value, diagnostics, context);
			case SclPackage.TUNIT_MULTIPLIER_ENUM:
				return validateTUnitMultiplierEnum((TUnitMultiplierEnum)value, diagnostics, context);
			case SclPackage.TVAL_KIND_ENUM:
				return validateTValKindEnum((TValKindEnum)value, diagnostics, context);
			case SclPackage.NAME_STRUCTURE_TYPE_OBJECT:
				return validateNameStructureTypeObject((NameStructureType)value, diagnostics, context);
			case SclPackage.SMP_RATE_TYPE:
				return validateSmpRateType((BigDecimal)value, diagnostics, context);
			case SclPackage.TANY_NAME:
				return validateTAnyName((String)value, diagnostics, context);
			case SclPackage.TASSOCIATION_KIND_ENUM_OBJECT:
				return validateTAssociationKindEnumObject((TAssociationKindEnum)value, diagnostics, context);
			case SclPackage.TATTRIBUTE_NAME_ENUM:
				return validateTAttributeNameEnum(value, diagnostics, context);
			case SclPackage.TAUTHENTICATION_ENUM_OBJECT:
				return validateTAuthenticationEnumObject((TAuthenticationEnum)value, diagnostics, context);
			case SclPackage.TBASIC_TYPE_ENUM:
				return validateTBasicTypeEnum(value, diagnostics, context);
			case SclPackage.TCDC_ENUM:
				return validateTCDCEnum(value, diagnostics, context);
			case SclPackage.TCOMMON_CONDUCTING_EQUIPMENT_ENUM:
				return validateTCommonConductingEquipmentEnum(value, diagnostics, context);
			case SclPackage.TDOMAIN_LN_ENUM:
				return validateTDomainLNEnum((Enumerator)value, diagnostics, context);
			case SclPackage.TDOMAIN_LN_GROUP_AENUM_OBJECT:
				return validateTDomainLNGroupAEnumObject((TDomainLNGroupAEnum)value, diagnostics, context);
			case SclPackage.TDOMAIN_LN_GROUP_CENUM_OBJECT:
				return validateTDomainLNGroupCEnumObject((TDomainLNGroupCEnum)value, diagnostics, context);
			case SclPackage.TDOMAIN_LN_GROUP_GENUM_OBJECT:
				return validateTDomainLNGroupGEnumObject((TDomainLNGroupGEnum)value, diagnostics, context);
			case SclPackage.TDOMAIN_LN_GROUP_IENUM_OBJECT:
				return validateTDomainLNGroupIEnumObject((TDomainLNGroupIEnum)value, diagnostics, context);
			case SclPackage.TDOMAIN_LN_GROUP_MENUM_OBJECT:
				return validateTDomainLNGroupMEnumObject((TDomainLNGroupMEnum)value, diagnostics, context);
			case SclPackage.TDOMAIN_LN_GROUP_PENUM_OBJECT:
				return validateTDomainLNGroupPEnumObject((TDomainLNGroupPEnum)value, diagnostics, context);
			case SclPackage.TDOMAIN_LN_GROUP_RENUM_OBJECT:
				return validateTDomainLNGroupREnumObject((TDomainLNGroupREnum)value, diagnostics, context);
			case SclPackage.TDOMAIN_LN_GROUP_SENUM_OBJECT:
				return validateTDomainLNGroupSEnumObject((TDomainLNGroupSEnum)value, diagnostics, context);
			case SclPackage.TDOMAIN_LN_GROUP_TENUM_OBJECT:
				return validateTDomainLNGroupTEnumObject((TDomainLNGroupTEnum)value, diagnostics, context);
			case SclPackage.TDOMAIN_LN_GROUP_XENUM_OBJECT:
				return validateTDomainLNGroupXEnumObject((TDomainLNGroupXEnum)value, diagnostics, context);
			case SclPackage.TDOMAIN_LN_GROUP_YENUM_OBJECT:
				return validateTDomainLNGroupYEnumObject((TDomainLNGroupYEnum)value, diagnostics, context);
			case SclPackage.TDOMAIN_LN_GROUP_ZENUM_OBJECT:
				return validateTDomainLNGroupZEnumObject((TDomainLNGroupZEnum)value, diagnostics, context);
			case SclPackage.TEQUIPMENT_ENUM:
				return validateTEquipmentEnum(value, diagnostics, context);
			case SclPackage.TEXTENSION_ATTRIBUTE_NAME_ENUM:
				return validateTExtensionAttributeNameEnum((String)value, diagnostics, context);
			case SclPackage.TEXTENSION_BASIC_TYPE_ENUM:
				return validateTExtensionBasicTypeEnum((String)value, diagnostics, context);
			case SclPackage.TEXTENSION_CDC_ENUM:
				return validateTExtensionCDCEnum((String)value, diagnostics, context);
			case SclPackage.TEXTENSION_EQUIPMENT_ENUM:
				return validateTExtensionEquipmentEnum((String)value, diagnostics, context);
			case SclPackage.TEXTENSION_GENERAL_EQUIPMENT_ENUM:
				return validateTExtensionGeneralEquipmentEnum((String)value, diagnostics, context);
			case SclPackage.TEXTENSION_LN_CLASS_ENUM:
				return validateTExtensionLNClassEnum((String)value, diagnostics, context);
			case SclPackage.TEXTENSION_PTYPE_ENUM:
				return validateTExtensionPTypeEnum((String)value, diagnostics, context);
			case SclPackage.TFC_ENUM_OBJECT:
				return validateTFCEnumObject((TFCEnum)value, diagnostics, context);
			case SclPackage.TGENERAL_EQUIPMENT_ENUM:
				return validateTGeneralEquipmentEnum(value, diagnostics, context);
			case SclPackage.TGSE_CONTROL_TYPE_ENUM_OBJECT:
				return validateTGSEControlTypeEnumObject((TGSEControlTypeEnum)value, diagnostics, context);
			case SclPackage.TLLN0_ENUM_OBJECT:
				return validateTLLN0EnumObject((TLLN0Enum)value, diagnostics, context);
			case SclPackage.TLN_CLASS_ENUM:
				return validateTLNClassEnum(value, diagnostics, context);
			case SclPackage.TLPHD_ENUM_OBJECT:
				return validateTLPHDEnumObject((TLPHDEnum)value, diagnostics, context);
			case SclPackage.TNAME:
				return validateTName((String)value, diagnostics, context);
			case SclPackage.TP_ADDR:
				return validateTPAddr((String)value, diagnostics, context);
			case SclPackage.TPHASE_ENUM_OBJECT:
				return validateTPhaseEnumObject((TPhaseEnum)value, diagnostics, context);
			case SclPackage.TPOWER_TRANSFORMER_ENUM_OBJECT:
				return validateTPowerTransformerEnumObject((TPowerTransformerEnum)value, diagnostics, context);
			case SclPackage.TPREDEFINED_ATTRIBUTE_NAME_ENUM_OBJECT:
				return validateTPredefinedAttributeNameEnumObject((TPredefinedAttributeNameEnum)value, diagnostics, context);
			case SclPackage.TPREDEFINED_BASIC_TYPE_ENUM_OBJECT:
				return validateTPredefinedBasicTypeEnumObject((TPredefinedBasicTypeEnum)value, diagnostics, context);
			case SclPackage.TPREDEFINED_CDC_ENUM_OBJECT:
				return validateTPredefinedCDCEnumObject((TPredefinedCDCEnum)value, diagnostics, context);
			case SclPackage.TPREDEFINED_COMMON_CONDUCTING_EQUIPMENT_ENUM_OBJECT:
				return validateTPredefinedCommonConductingEquipmentEnumObject((TPredefinedCommonConductingEquipmentEnum)value, diagnostics, context);
			case SclPackage.TPREDEFINED_EQUIPMENT_ENUM:
				return validateTPredefinedEquipmentEnum(value, diagnostics, context);
			case SclPackage.TPREDEFINED_GENERAL_EQUIPMENT_ENUM_OBJECT:
				return validateTPredefinedGeneralEquipmentEnumObject((TPredefinedGeneralEquipmentEnum)value, diagnostics, context);
			case SclPackage.TPREDEFINED_LN_CLASS_ENUM:
				return validateTPredefinedLNClassEnum((Enumerator)value, diagnostics, context);
			case SclPackage.TPREDEFINED_PTYPE_ENUM_OBJECT:
				return validateTPredefinedPTypeEnumObject((TPredefinedPTypeEnum)value, diagnostics, context);
			case SclPackage.TP_TYPE_ENUM:
				return validateTPTypeEnum(value, diagnostics, context);
			case SclPackage.TREF:
				return validateTRef((String)value, diagnostics, context);
			case SclPackage.TRESTR_LD_NAME:
				return validateTRestrLdName((String)value, diagnostics, context);
			case SclPackage.TRESTR_NAME:
				return validateTRestrName((String)value, diagnostics, context);
			case SclPackage.TRESTR_NAME1ST_L:
				return validateTRestrName1stL((String)value, diagnostics, context);
			case SclPackage.TRESTR_NAME1ST_U:
				return validateTRestrName1stU((String)value, diagnostics, context);
			case SclPackage.TSERVICE_FC_ENUM_OBJECT:
				return validateTServiceFCEnumObject((TServiceFCEnum)value, diagnostics, context);
			case SclPackage.TSERVICE_SETTINGS_ENUM_OBJECT:
				return validateTServiceSettingsEnumObject((TServiceSettingsEnum)value, diagnostics, context);
			case SclPackage.TSI_UNIT_ENUM_OBJECT:
				return validateTSIUnitEnumObject((TSIUnitEnum)value, diagnostics, context);
			case SclPackage.TTRANSFORMER_WINDING_ENUM_OBJECT:
				return validateTTransformerWindingEnumObject((TTransformerWindingEnum)value, diagnostics, context);
			case SclPackage.TTRG_OPT_CONTROL_ENUM_OBJECT:
				return validateTTrgOptControlEnumObject((TTrgOptControlEnum)value, diagnostics, context);
			case SclPackage.TTRG_OPT_ENUM_OBJECT:
				return validateTTrgOptEnumObject((TTrgOptEnum)value, diagnostics, context);
			case SclPackage.TUNIT_MULTIPLIER_ENUM_OBJECT:
				return validateTUnitMultiplierEnumObject((TUnitMultiplierEnum)value, diagnostics, context);
			case SclPackage.TVAL_KIND_ENUM_OBJECT:
				return validateTValKindEnumObject((TValKindEnum)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthenticationType(AuthenticationType authenticationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(authenticationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryType(HistoryType historyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(historyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLN0Type(LN0Type ln0Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ln0Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptFieldsType(OptFieldsType optFieldsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(optFieldsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSCLType(SCLType sclType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sclType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSettingGroupsType(SettingGroupsType settingGroupsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(settingGroupsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmvOptsType(SmvOptsType smvOptsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(smvOptsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTAbstractConductingEquipment(TAbstractConductingEquipment tAbstractConductingEquipment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tAbstractConductingEquipment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTAbstractDataAttribute(TAbstractDataAttribute tAbstractDataAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tAbstractDataAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTAccessControl(TAccessControl tAccessControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tAccessControl, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTAccessPoint(TAccessPoint tAccessPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tAccessPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTAddress(TAddress tAddress, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tAddress, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTAnyContentFromOtherNamespace(TAnyContentFromOtherNamespace tAnyContentFromOtherNamespace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tAnyContentFromOtherNamespace, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTAnyLN(TAnyLN tAnyLN, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tAnyLN, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTAssociation(TAssociation tAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tAssociation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBaseElement(TBaseElement tBaseElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tBaseElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBay(TBay tBay, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tBay, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBDA(TBDA tbda, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tbda, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBitRateInMbPerSec(TBitRateInMbPerSec tBitRateInMbPerSec, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tBitRateInMbPerSec, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTClientLN(TClientLN tClientLN, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tClientLN, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTClientServices(TClientServices tClientServices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tClientServices, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCommunication(TCommunication tCommunication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tCommunication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTConductingEquipment(TConductingEquipment tConductingEquipment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tConductingEquipment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTConfLNs(TConfLNs tConfLNs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tConfLNs, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTConnectedAP(TConnectedAP tConnectedAP, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tConnectedAP, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTConnectivityNode(TConnectivityNode tConnectivityNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tConnectivityNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTControl(TControl tControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tControl, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTControlBlock(TControlBlock tControlBlock, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tControlBlock, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTControlWithIEDName(TControlWithIEDName tControlWithIEDName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tControlWithIEDName, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTControlWithTriggerOpt(TControlWithTriggerOpt tControlWithTriggerOpt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tControlWithTriggerOpt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDA(TDA tda, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tda, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDAI(TDAI tdai, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tdai, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDataSet(TDataSet tDataSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tDataSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDataTypeTemplates(TDataTypeTemplates tDataTypeTemplates, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tDataTypeTemplates, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDAType(TDAType tdaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tdaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDO(TDO tdo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tdo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDOI(TDOI tdoi, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tdoi, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDOType(TDOType tdoType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tdoType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDurationInMilliSec(TDurationInMilliSec tDurationInMilliSec, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tDurationInMilliSec, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDurationInSec(TDurationInSec tDurationInSec, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tDurationInSec, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTEnumType(TEnumType tEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTEnumVal(TEnumVal tEnumVal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tEnumVal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTEquipment(TEquipment tEquipment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tEquipment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTEquipmentContainer(TEquipmentContainer tEquipmentContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tEquipmentContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTExtRef(TExtRef tExtRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tExtRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTFCCB(TFCCB tfccb, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tfccb, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTFCDA(TFCDA tfcda, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tfcda, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTFunction(TFunction tFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTGeneralEquipment(TGeneralEquipment tGeneralEquipment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tGeneralEquipment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTGSE(TGSE tgse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tgse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTGSEControl(TGSEControl tgseControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tgseControl, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTGSESettings(TGSESettings tgseSettings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tgseSettings, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTHeader(THeader tHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tHeader, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTHitem(THitem tHitem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tHitem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTIDNaming(TIDNaming tidNaming, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tidNaming, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTIED(TIED tied, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tied, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTInputs(TInputs tInputs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tInputs, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTLDevice(TLDevice tlDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tlDevice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTLN(TLN tln, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tln, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTLN0(TLN0 tln0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tln0, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTLNode(TLNode tlNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tlNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTLNodeContainer(TLNodeContainer tlNodeContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tlNodeContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTLNodeType(TLNodeType tlNodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tlNodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTLog(TLog tLog, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tLog, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTLogControl(TLogControl tLogControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tLogControl, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTLogSettings(TLogSettings tLogSettings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tLogSettings, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTNaming(TNaming tNaming, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tNaming, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTP(TP tp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPAPPID(TPAPPID tpappid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tpappid, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPhysConn(TPhysConn tPhysConn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tPhysConn, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPIP(TPIP tpip, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tpip, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPIPGATEWAY(TPIPGATEWAY tpipgateway, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tpipgateway, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPIPSUBNET(TPIPSUBNET tpipsubnet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tpipsubnet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPMACAddress(TPMACAddress tpmacAddress, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tpmacAddress, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPOSIAEInvoke(TPOSIAEInvoke tposiaeInvoke, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tposiaeInvoke, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPOSIAEQualifier(TPOSIAEQualifier tposiaeQualifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tposiaeQualifier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPOSIAPInvoke(TPOSIAPInvoke tposiapInvoke, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tposiapInvoke, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPOSIAPTitle(TPOSIAPTitle tposiapTitle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tposiapTitle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPOSINSAP(TPOSINSAP tposinsap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tposinsap, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPOSIPSEL(TPOSIPSEL tposipsel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tposipsel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPOSISSEL(TPOSISSEL tposissel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tposissel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPOSITSEL(TPOSITSEL tpositsel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tpositsel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPowerSystemResource(TPowerSystemResource tPowerSystemResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tPowerSystemResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPowerTransformer(TPowerTransformer tPowerTransformer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tPowerTransformer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPrivate(TPrivate tPrivate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tPrivate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPVLANID(TPVLANID tpvlanid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tpvlanid, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPVLANPRIORITY(TPVLANPRIORITY tpvlanpriority, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tpvlanpriority, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTReportControl(TReportControl tReportControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tReportControl, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTReportSettings(TReportSettings tReportSettings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tReportSettings, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRptEnabled(TRptEnabled tRptEnabled, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tRptEnabled, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSampledValueControl(TSampledValueControl tSampledValueControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tSampledValueControl, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSCLControl(TSCLControl tsclControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tsclControl, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSDI(TSDI tsdi, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tsdi, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSDO(TSDO tsdo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tsdo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTServer(TServer tServer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tServer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTServices(TServices tServices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tServices, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTServiceSettings(TServiceSettings tServiceSettings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tServiceSettings, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTServiceWithMax(TServiceWithMax tServiceWithMax, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tServiceWithMax, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTServiceWithMaxAndMaxAttributes(TServiceWithMaxAndMaxAttributes tServiceWithMaxAndMaxAttributes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tServiceWithMaxAndMaxAttributes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTServiceWithMaxAndMaxAttributesAndModify(TServiceWithMaxAndMaxAttributesAndModify tServiceWithMaxAndMaxAttributesAndModify, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tServiceWithMaxAndMaxAttributesAndModify, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTServiceWithMaxAndModify(TServiceWithMaxAndModify tServiceWithMaxAndModify, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tServiceWithMaxAndModify, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTServiceYesNo(TServiceYesNo tServiceYesNo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tServiceYesNo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSettingControl(TSettingControl tSettingControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tSettingControl, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSMV(TSMV tsmv, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tsmv, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSMVSettings(TSMVSettings tsmvSettings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tsmvSettings, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSubEquipment(TSubEquipment tSubEquipment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tSubEquipment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSubFunction(TSubFunction tSubFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tSubFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSubNetwork(TSubNetwork tSubNetwork, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tSubNetwork, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSubstation(TSubstation tSubstation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tSubstation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTTapChanger(TTapChanger tTapChanger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tTapChanger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTTerminal(TTerminal tTerminal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tTerminal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTText(TText tText, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tText, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTTransformerWinding(TTransformerWinding tTransformerWinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tTransformerWinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTTrgOps(TTrgOps tTrgOps, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tTrgOps, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTUnNaming(TUnNaming tUnNaming, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tUnNaming, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTVal(TVal tVal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tVal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTValueWithUnit(TValueWithUnit tValueWithUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tValueWithUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTVoltage(TVoltage tVoltage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tVoltage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTVoltageLevel(TVoltageLevel tVoltageLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tVoltageLevel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameStructureType(NameStructureType nameStructureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTAssociationKindEnum(TAssociationKindEnum tAssociationKindEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTAuthenticationEnum(TAuthenticationEnum tAuthenticationEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDomainLNGroupAEnum(TDomainLNGroupAEnum tDomainLNGroupAEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDomainLNGroupCEnum(TDomainLNGroupCEnum tDomainLNGroupCEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDomainLNGroupGEnum(TDomainLNGroupGEnum tDomainLNGroupGEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDomainLNGroupIEnum(TDomainLNGroupIEnum tDomainLNGroupIEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDomainLNGroupMEnum(TDomainLNGroupMEnum tDomainLNGroupMEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDomainLNGroupPEnum(TDomainLNGroupPEnum tDomainLNGroupPEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDomainLNGroupREnum(TDomainLNGroupREnum tDomainLNGroupREnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDomainLNGroupSEnum(TDomainLNGroupSEnum tDomainLNGroupSEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDomainLNGroupTEnum(TDomainLNGroupTEnum tDomainLNGroupTEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDomainLNGroupXEnum(TDomainLNGroupXEnum tDomainLNGroupXEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDomainLNGroupYEnum(TDomainLNGroupYEnum tDomainLNGroupYEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDomainLNGroupZEnum(TDomainLNGroupZEnum tDomainLNGroupZEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTFCEnum(TFCEnum tfcEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTGSEControlTypeEnum(TGSEControlTypeEnum tgseControlTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTLLN0Enum(TLLN0Enum tlln0Enum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTLPHDEnum(TLPHDEnum tlphdEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPhaseEnum(TPhaseEnum tPhaseEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPowerTransformerEnum(TPowerTransformerEnum tPowerTransformerEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPredefinedAttributeNameEnum(TPredefinedAttributeNameEnum tPredefinedAttributeNameEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPredefinedBasicTypeEnum(TPredefinedBasicTypeEnum tPredefinedBasicTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPredefinedCDCEnum(TPredefinedCDCEnum tPredefinedCDCEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPredefinedCommonConductingEquipmentEnum(TPredefinedCommonConductingEquipmentEnum tPredefinedCommonConductingEquipmentEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPredefinedGeneralEquipmentEnum(TPredefinedGeneralEquipmentEnum tPredefinedGeneralEquipmentEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPredefinedPTypeEnum(TPredefinedPTypeEnum tPredefinedPTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTServiceFCEnum(TServiceFCEnum tServiceFCEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTServiceSettingsEnum(TServiceSettingsEnum tServiceSettingsEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSIUnitEnum(TSIUnitEnum tsiUnitEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTTransformerWindingEnum(TTransformerWindingEnum tTransformerWindingEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTTrgOptControlEnum(TTrgOptControlEnum tTrgOptControlEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTTrgOptEnum(TTrgOptEnum tTrgOptEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTUnitMultiplierEnum(TUnitMultiplierEnum tUnitMultiplierEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTValKindEnum(TValKindEnum tValKindEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameStructureTypeObject(NameStructureType nameStructureTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmpRateType(BigDecimal smpRateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSmpRateType_Min(smpRateType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSmpRateType_Min
	 */
	public static final BigDecimal SMP_RATE_TYPE__MIN__VALUE = new BigDecimal("0");

	/**
	 * Validates the Min constraint of '<em>Smp Rate Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmpRateType_Min(BigDecimal smpRateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = smpRateType.compareTo(SMP_RATE_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(SclPackage.eINSTANCE.getSmpRateType(), smpRateType, SMP_RATE_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTAnyName(String tAnyName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTAssociationKindEnumObject(TAssociationKindEnum tAssociationKindEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTAttributeNameEnum(Object tAttributeNameEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTAttributeNameEnum_MemberTypes(tAttributeNameEnum, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>TAttribute Name Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTAttributeNameEnum_MemberTypes(Object tAttributeNameEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (SclPackage.eINSTANCE.getTPredefinedAttributeNameEnum().isInstance(tAttributeNameEnum)) {
				if (validateTPredefinedAttributeNameEnum((TPredefinedAttributeNameEnum)tAttributeNameEnum, tempDiagnostics, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTExtensionAttributeNameEnum().isInstance(tAttributeNameEnum)) {
				if (validateTExtensionAttributeNameEnum((String)tAttributeNameEnum, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (SclPackage.eINSTANCE.getTPredefinedAttributeNameEnum().isInstance(tAttributeNameEnum)) {
				if (validateTPredefinedAttributeNameEnum((TPredefinedAttributeNameEnum)tAttributeNameEnum, null, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTExtensionAttributeNameEnum().isInstance(tAttributeNameEnum)) {
				if (validateTExtensionAttributeNameEnum((String)tAttributeNameEnum, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTAuthenticationEnumObject(TAuthenticationEnum tAuthenticationEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBasicTypeEnum(Object tBasicTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTBasicTypeEnum_MemberTypes(tBasicTypeEnum, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>TBasic Type Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBasicTypeEnum_MemberTypes(Object tBasicTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (SclPackage.eINSTANCE.getTPredefinedBasicTypeEnum().isInstance(tBasicTypeEnum)) {
				if (validateTPredefinedBasicTypeEnum((TPredefinedBasicTypeEnum)tBasicTypeEnum, tempDiagnostics, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTExtensionBasicTypeEnum().isInstance(tBasicTypeEnum)) {
				if (validateTExtensionBasicTypeEnum((String)tBasicTypeEnum, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (SclPackage.eINSTANCE.getTPredefinedBasicTypeEnum().isInstance(tBasicTypeEnum)) {
				if (validateTPredefinedBasicTypeEnum((TPredefinedBasicTypeEnum)tBasicTypeEnum, null, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTExtensionBasicTypeEnum().isInstance(tBasicTypeEnum)) {
				if (validateTExtensionBasicTypeEnum((String)tBasicTypeEnum, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCDCEnum(Object tcdcEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTCDCEnum_MemberTypes(tcdcEnum, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>TCDC Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCDCEnum_MemberTypes(Object tcdcEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (SclPackage.eINSTANCE.getTPredefinedCDCEnum().isInstance(tcdcEnum)) {
				if (validateTPredefinedCDCEnum((TPredefinedCDCEnum)tcdcEnum, tempDiagnostics, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTExtensionCDCEnum().isInstance(tcdcEnum)) {
				if (validateTExtensionCDCEnum((String)tcdcEnum, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (SclPackage.eINSTANCE.getTPredefinedCDCEnum().isInstance(tcdcEnum)) {
				if (validateTPredefinedCDCEnum((TPredefinedCDCEnum)tcdcEnum, null, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTExtensionCDCEnum().isInstance(tcdcEnum)) {
				if (validateTExtensionCDCEnum((String)tcdcEnum, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCommonConductingEquipmentEnum(Object tCommonConductingEquipmentEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTCommonConductingEquipmentEnum_MemberTypes(tCommonConductingEquipmentEnum, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>TCommon Conducting Equipment Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCommonConductingEquipmentEnum_MemberTypes(Object tCommonConductingEquipmentEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (SclPackage.eINSTANCE.getTPredefinedCommonConductingEquipmentEnum().isInstance(tCommonConductingEquipmentEnum)) {
				if (validateTPredefinedCommonConductingEquipmentEnum((TPredefinedCommonConductingEquipmentEnum)tCommonConductingEquipmentEnum, tempDiagnostics, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTExtensionEquipmentEnum().isInstance(tCommonConductingEquipmentEnum)) {
				if (validateTExtensionEquipmentEnum((String)tCommonConductingEquipmentEnum, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (SclPackage.eINSTANCE.getTPredefinedCommonConductingEquipmentEnum().isInstance(tCommonConductingEquipmentEnum)) {
				if (validateTPredefinedCommonConductingEquipmentEnum((TPredefinedCommonConductingEquipmentEnum)tCommonConductingEquipmentEnum, null, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTExtensionEquipmentEnum().isInstance(tCommonConductingEquipmentEnum)) {
				if (validateTExtensionEquipmentEnum((String)tCommonConductingEquipmentEnum, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDomainLNEnum(Enumerator tDomainLNEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTDomainLNEnum_MemberTypes(tDomainLNEnum, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>TDomain LN Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDomainLNEnum_MemberTypes(Enumerator tDomainLNEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (SclPackage.eINSTANCE.getTDomainLNGroupAEnum().isInstance(tDomainLNEnum)) {
				if (validateTDomainLNGroupAEnum((TDomainLNGroupAEnum)tDomainLNEnum, tempDiagnostics, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTDomainLNGroupCEnum().isInstance(tDomainLNEnum)) {
				if (validateTDomainLNGroupCEnum((TDomainLNGroupCEnum)tDomainLNEnum, tempDiagnostics, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTDomainLNGroupGEnum().isInstance(tDomainLNEnum)) {
				if (validateTDomainLNGroupGEnum((TDomainLNGroupGEnum)tDomainLNEnum, tempDiagnostics, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTDomainLNGroupIEnum().isInstance(tDomainLNEnum)) {
				if (validateTDomainLNGroupIEnum((TDomainLNGroupIEnum)tDomainLNEnum, tempDiagnostics, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTDomainLNGroupMEnum().isInstance(tDomainLNEnum)) {
				if (validateTDomainLNGroupMEnum((TDomainLNGroupMEnum)tDomainLNEnum, tempDiagnostics, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTDomainLNGroupPEnum().isInstance(tDomainLNEnum)) {
				if (validateTDomainLNGroupPEnum((TDomainLNGroupPEnum)tDomainLNEnum, tempDiagnostics, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTDomainLNGroupREnum().isInstance(tDomainLNEnum)) {
				if (validateTDomainLNGroupREnum((TDomainLNGroupREnum)tDomainLNEnum, tempDiagnostics, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTDomainLNGroupSEnum().isInstance(tDomainLNEnum)) {
				if (validateTDomainLNGroupSEnum((TDomainLNGroupSEnum)tDomainLNEnum, tempDiagnostics, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTDomainLNGroupTEnum().isInstance(tDomainLNEnum)) {
				if (validateTDomainLNGroupTEnum((TDomainLNGroupTEnum)tDomainLNEnum, tempDiagnostics, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTDomainLNGroupXEnum().isInstance(tDomainLNEnum)) {
				if (validateTDomainLNGroupXEnum((TDomainLNGroupXEnum)tDomainLNEnum, tempDiagnostics, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTDomainLNGroupYEnum().isInstance(tDomainLNEnum)) {
				if (validateTDomainLNGroupYEnum((TDomainLNGroupYEnum)tDomainLNEnum, tempDiagnostics, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTDomainLNGroupZEnum().isInstance(tDomainLNEnum)) {
				if (validateTDomainLNGroupZEnum((TDomainLNGroupZEnum)tDomainLNEnum, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (SclPackage.eINSTANCE.getTDomainLNGroupAEnum().isInstance(tDomainLNEnum)) {
				if (validateTDomainLNGroupAEnum((TDomainLNGroupAEnum)tDomainLNEnum, null, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTDomainLNGroupCEnum().isInstance(tDomainLNEnum)) {
				if (validateTDomainLNGroupCEnum((TDomainLNGroupCEnum)tDomainLNEnum, null, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTDomainLNGroupGEnum().isInstance(tDomainLNEnum)) {
				if (validateTDomainLNGroupGEnum((TDomainLNGroupGEnum)tDomainLNEnum, null, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTDomainLNGroupIEnum().isInstance(tDomainLNEnum)) {
				if (validateTDomainLNGroupIEnum((TDomainLNGroupIEnum)tDomainLNEnum, null, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTDomainLNGroupMEnum().isInstance(tDomainLNEnum)) {
				if (validateTDomainLNGroupMEnum((TDomainLNGroupMEnum)tDomainLNEnum, null, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTDomainLNGroupPEnum().isInstance(tDomainLNEnum)) {
				if (validateTDomainLNGroupPEnum((TDomainLNGroupPEnum)tDomainLNEnum, null, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTDomainLNGroupREnum().isInstance(tDomainLNEnum)) {
				if (validateTDomainLNGroupREnum((TDomainLNGroupREnum)tDomainLNEnum, null, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTDomainLNGroupSEnum().isInstance(tDomainLNEnum)) {
				if (validateTDomainLNGroupSEnum((TDomainLNGroupSEnum)tDomainLNEnum, null, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTDomainLNGroupTEnum().isInstance(tDomainLNEnum)) {
				if (validateTDomainLNGroupTEnum((TDomainLNGroupTEnum)tDomainLNEnum, null, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTDomainLNGroupXEnum().isInstance(tDomainLNEnum)) {
				if (validateTDomainLNGroupXEnum((TDomainLNGroupXEnum)tDomainLNEnum, null, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTDomainLNGroupYEnum().isInstance(tDomainLNEnum)) {
				if (validateTDomainLNGroupYEnum((TDomainLNGroupYEnum)tDomainLNEnum, null, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTDomainLNGroupZEnum().isInstance(tDomainLNEnum)) {
				if (validateTDomainLNGroupZEnum((TDomainLNGroupZEnum)tDomainLNEnum, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDomainLNGroupAEnumObject(TDomainLNGroupAEnum tDomainLNGroupAEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDomainLNGroupCEnumObject(TDomainLNGroupCEnum tDomainLNGroupCEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDomainLNGroupGEnumObject(TDomainLNGroupGEnum tDomainLNGroupGEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDomainLNGroupIEnumObject(TDomainLNGroupIEnum tDomainLNGroupIEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDomainLNGroupMEnumObject(TDomainLNGroupMEnum tDomainLNGroupMEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDomainLNGroupPEnumObject(TDomainLNGroupPEnum tDomainLNGroupPEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDomainLNGroupREnumObject(TDomainLNGroupREnum tDomainLNGroupREnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDomainLNGroupSEnumObject(TDomainLNGroupSEnum tDomainLNGroupSEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDomainLNGroupTEnumObject(TDomainLNGroupTEnum tDomainLNGroupTEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDomainLNGroupXEnumObject(TDomainLNGroupXEnum tDomainLNGroupXEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDomainLNGroupYEnumObject(TDomainLNGroupYEnum tDomainLNGroupYEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDomainLNGroupZEnumObject(TDomainLNGroupZEnum tDomainLNGroupZEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTEquipmentEnum(Object tEquipmentEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTEquipmentEnum_MemberTypes(tEquipmentEnum, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>TEquipment Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTEquipmentEnum_MemberTypes(Object tEquipmentEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (SclPackage.eINSTANCE.getTPredefinedEquipmentEnum().isInstance(tEquipmentEnum)) {
				if (validateTPredefinedEquipmentEnum(tEquipmentEnum, tempDiagnostics, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTExtensionEquipmentEnum().isInstance(tEquipmentEnum)) {
				if (validateTExtensionEquipmentEnum((String)tEquipmentEnum, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (SclPackage.eINSTANCE.getTPredefinedEquipmentEnum().isInstance(tEquipmentEnum)) {
				if (validateTPredefinedEquipmentEnum(tEquipmentEnum, null, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTExtensionEquipmentEnum().isInstance(tEquipmentEnum)) {
				if (validateTExtensionEquipmentEnum((String)tEquipmentEnum, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTExtensionAttributeNameEnum(String tExtensionAttributeNameEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTRestrName1stL_Pattern(tExtensionAttributeNameEnum, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTExtensionBasicTypeEnum(String tExtensionBasicTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTExtensionBasicTypeEnum_Pattern(tExtensionBasicTypeEnum, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTExtensionBasicTypeEnum_Pattern
	 */
	public static final  PatternMatcher [][] TEXTENSION_BASIC_TYPE_ENUM__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\p{Lu}[\\p{L},\\d]*")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\i\\c*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>TExtension Basic Type Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTExtensionBasicTypeEnum_Pattern(String tExtensionBasicTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SclPackage.eINSTANCE.getTExtensionBasicTypeEnum(), tExtensionBasicTypeEnum, TEXTENSION_BASIC_TYPE_ENUM__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTExtensionCDCEnum(String tExtensionCDCEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTExtensionCDCEnum_Pattern(tExtensionCDCEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validateTExtensionCDCEnum_MinLength(tExtensionCDCEnum, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTExtensionCDCEnum_Pattern
	 */
	public static final  PatternMatcher [][] TEXTENSION_CDC_ENUM__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\p{Lu}+")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\i\\c*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>TExtension CDC Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTExtensionCDCEnum_Pattern(String tExtensionCDCEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SclPackage.eINSTANCE.getTExtensionCDCEnum(), tExtensionCDCEnum, TEXTENSION_CDC_ENUM__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>TExtension CDC Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTExtensionCDCEnum_MinLength(String tExtensionCDCEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = tExtensionCDCEnum.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(SclPackage.eINSTANCE.getTExtensionCDCEnum(), tExtensionCDCEnum, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTExtensionEquipmentEnum(String tExtensionEquipmentEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTExtensionEquipmentEnum_Pattern(tExtensionEquipmentEnum, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTExtensionEquipmentEnum_Pattern
	 */
	public static final  PatternMatcher [][] TEXTENSION_EQUIPMENT_ENUM__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("E\\p{Lu}*")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\i\\c*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>TExtension Equipment Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTExtensionEquipmentEnum_Pattern(String tExtensionEquipmentEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SclPackage.eINSTANCE.getTExtensionEquipmentEnum(), tExtensionEquipmentEnum, TEXTENSION_EQUIPMENT_ENUM__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTExtensionGeneralEquipmentEnum(String tExtensionGeneralEquipmentEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTExtensionGeneralEquipmentEnum_Pattern(tExtensionGeneralEquipmentEnum, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTExtensionGeneralEquipmentEnum_Pattern
	 */
	public static final  PatternMatcher [][] TEXTENSION_GENERAL_EQUIPMENT_ENUM__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("E\\p{Lu}*")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\i\\c*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>TExtension General Equipment Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTExtensionGeneralEquipmentEnum_Pattern(String tExtensionGeneralEquipmentEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SclPackage.eINSTANCE.getTExtensionGeneralEquipmentEnum(), tExtensionGeneralEquipmentEnum, TEXTENSION_GENERAL_EQUIPMENT_ENUM__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTExtensionLNClassEnum(String tExtensionLNClassEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTExtensionLNClassEnum_Pattern(tExtensionLNClassEnum, diagnostics, context);
		if (result || diagnostics != null) result &= validateTExtensionLNClassEnum_MinLength(tExtensionLNClassEnum, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTExtensionLNClassEnum_Pattern
	 */
	public static final  PatternMatcher [][] TEXTENSION_LN_CLASS_ENUM__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\p{Lu}+")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\i\\c*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>TExtension LN Class Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTExtensionLNClassEnum_Pattern(String tExtensionLNClassEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SclPackage.eINSTANCE.getTExtensionLNClassEnum(), tExtensionLNClassEnum, TEXTENSION_LN_CLASS_ENUM__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>TExtension LN Class Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTExtensionLNClassEnum_MinLength(String tExtensionLNClassEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = tExtensionLNClassEnum.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(SclPackage.eINSTANCE.getTExtensionLNClassEnum(), tExtensionLNClassEnum, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTExtensionPTypeEnum(String tExtensionPTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTExtensionPTypeEnum_Pattern(tExtensionPTypeEnum, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTExtensionPTypeEnum_Pattern
	 */
	public static final  PatternMatcher [][] TEXTENSION_PTYPE_ENUM__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\p{Lu}[\\d,\\p{L},\\-]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>TExtension PType Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTExtensionPTypeEnum_Pattern(String tExtensionPTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SclPackage.eINSTANCE.getTExtensionPTypeEnum(), tExtensionPTypeEnum, TEXTENSION_PTYPE_ENUM__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTFCEnumObject(TFCEnum tfcEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTGeneralEquipmentEnum(Object tGeneralEquipmentEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTGeneralEquipmentEnum_MemberTypes(tGeneralEquipmentEnum, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>TGeneral Equipment Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTGeneralEquipmentEnum_MemberTypes(Object tGeneralEquipmentEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (SclPackage.eINSTANCE.getTPredefinedGeneralEquipmentEnum().isInstance(tGeneralEquipmentEnum)) {
				if (validateTPredefinedGeneralEquipmentEnum((TPredefinedGeneralEquipmentEnum)tGeneralEquipmentEnum, tempDiagnostics, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTExtensionGeneralEquipmentEnum().isInstance(tGeneralEquipmentEnum)) {
				if (validateTExtensionGeneralEquipmentEnum((String)tGeneralEquipmentEnum, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (SclPackage.eINSTANCE.getTPredefinedGeneralEquipmentEnum().isInstance(tGeneralEquipmentEnum)) {
				if (validateTPredefinedGeneralEquipmentEnum((TPredefinedGeneralEquipmentEnum)tGeneralEquipmentEnum, null, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTExtensionGeneralEquipmentEnum().isInstance(tGeneralEquipmentEnum)) {
				if (validateTExtensionGeneralEquipmentEnum((String)tGeneralEquipmentEnum, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTGSEControlTypeEnumObject(TGSEControlTypeEnum tgseControlTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTLLN0EnumObject(TLLN0Enum tlln0EnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTLNClassEnum(Object tlnClassEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTLNClassEnum_MemberTypes(tlnClassEnum, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>TLN Class Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTLNClassEnum_MemberTypes(Object tlnClassEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (SclPackage.eINSTANCE.getTPredefinedLNClassEnum().isInstance(tlnClassEnum)) {
				if (validateTPredefinedLNClassEnum((Enumerator)tlnClassEnum, tempDiagnostics, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTExtensionLNClassEnum().isInstance(tlnClassEnum)) {
				if (validateTExtensionLNClassEnum((String)tlnClassEnum, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (SclPackage.eINSTANCE.getTPredefinedLNClassEnum().isInstance(tlnClassEnum)) {
				if (validateTPredefinedLNClassEnum((Enumerator)tlnClassEnum, null, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTExtensionLNClassEnum().isInstance(tlnClassEnum)) {
				if (validateTExtensionLNClassEnum((String)tlnClassEnum, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTLPHDEnumObject(TLPHDEnum tlphdEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTName(String tName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTName_MinLength(tName, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>TName</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTName_MinLength(String tName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = tName.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(SclPackage.eINSTANCE.getTName(), tName, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPAddr(String tpAddr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTPAddr_MinLength(tpAddr, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>TP Addr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPAddr_MinLength(String tpAddr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = tpAddr.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(SclPackage.eINSTANCE.getTPAddr(), tpAddr, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPhaseEnumObject(TPhaseEnum tPhaseEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPowerTransformerEnumObject(TPowerTransformerEnum tPowerTransformerEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPredefinedAttributeNameEnumObject(TPredefinedAttributeNameEnum tPredefinedAttributeNameEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPredefinedBasicTypeEnumObject(TPredefinedBasicTypeEnum tPredefinedBasicTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPredefinedCDCEnumObject(TPredefinedCDCEnum tPredefinedCDCEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPredefinedCommonConductingEquipmentEnumObject(TPredefinedCommonConductingEquipmentEnum tPredefinedCommonConductingEquipmentEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPredefinedEquipmentEnum(Object tPredefinedEquipmentEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTPredefinedEquipmentEnum_MemberTypes(tPredefinedEquipmentEnum, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>TPredefined Equipment Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPredefinedEquipmentEnum_MemberTypes(Object tPredefinedEquipmentEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (SclPackage.eINSTANCE.getTCommonConductingEquipmentEnum().isInstance(tPredefinedEquipmentEnum)) {
				if (validateTCommonConductingEquipmentEnum(tPredefinedEquipmentEnum, tempDiagnostics, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTPowerTransformerEnum().isInstance(tPredefinedEquipmentEnum)) {
				if (validateTPowerTransformerEnum((TPowerTransformerEnum)tPredefinedEquipmentEnum, tempDiagnostics, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTTransformerWindingEnum().isInstance(tPredefinedEquipmentEnum)) {
				if (validateTTransformerWindingEnum((TTransformerWindingEnum)tPredefinedEquipmentEnum, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (SclPackage.eINSTANCE.getTCommonConductingEquipmentEnum().isInstance(tPredefinedEquipmentEnum)) {
				if (validateTCommonConductingEquipmentEnum(tPredefinedEquipmentEnum, null, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTPowerTransformerEnum().isInstance(tPredefinedEquipmentEnum)) {
				if (validateTPowerTransformerEnum((TPowerTransformerEnum)tPredefinedEquipmentEnum, null, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTTransformerWindingEnum().isInstance(tPredefinedEquipmentEnum)) {
				if (validateTTransformerWindingEnum((TTransformerWindingEnum)tPredefinedEquipmentEnum, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPredefinedGeneralEquipmentEnumObject(TPredefinedGeneralEquipmentEnum tPredefinedGeneralEquipmentEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPredefinedLNClassEnum(Enumerator tPredefinedLNClassEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTPredefinedLNClassEnum_MemberTypes(tPredefinedLNClassEnum, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>TPredefined LN Class Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPredefinedLNClassEnum_MemberTypes(Enumerator tPredefinedLNClassEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (SclPackage.eINSTANCE.getTLPHDEnum().isInstance(tPredefinedLNClassEnum)) {
				if (validateTLPHDEnum((TLPHDEnum)tPredefinedLNClassEnum, tempDiagnostics, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTLLN0Enum().isInstance(tPredefinedLNClassEnum)) {
				if (validateTLLN0Enum((TLLN0Enum)tPredefinedLNClassEnum, tempDiagnostics, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTDomainLNEnum().isInstance(tPredefinedLNClassEnum)) {
				if (validateTDomainLNEnum(tPredefinedLNClassEnum, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (SclPackage.eINSTANCE.getTLPHDEnum().isInstance(tPredefinedLNClassEnum)) {
				if (validateTLPHDEnum((TLPHDEnum)tPredefinedLNClassEnum, null, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTLLN0Enum().isInstance(tPredefinedLNClassEnum)) {
				if (validateTLLN0Enum((TLLN0Enum)tPredefinedLNClassEnum, null, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTDomainLNEnum().isInstance(tPredefinedLNClassEnum)) {
				if (validateTDomainLNEnum(tPredefinedLNClassEnum, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPredefinedPTypeEnumObject(TPredefinedPTypeEnum tPredefinedPTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPTypeEnum(Object tpTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTPTypeEnum_MemberTypes(tpTypeEnum, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>TP Type Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPTypeEnum_MemberTypes(Object tpTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (SclPackage.eINSTANCE.getTPredefinedPTypeEnum().isInstance(tpTypeEnum)) {
				if (validateTPredefinedPTypeEnum((TPredefinedPTypeEnum)tpTypeEnum, tempDiagnostics, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTExtensionPTypeEnum().isInstance(tpTypeEnum)) {
				if (validateTExtensionPTypeEnum((String)tpTypeEnum, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (SclPackage.eINSTANCE.getTPredefinedPTypeEnum().isInstance(tpTypeEnum)) {
				if (validateTPredefinedPTypeEnum((TPredefinedPTypeEnum)tpTypeEnum, null, context)) return true;
			}
			if (SclPackage.eINSTANCE.getTExtensionPTypeEnum().isInstance(tpTypeEnum)) {
				if (validateTExtensionPTypeEnum((String)tpTypeEnum, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRef(String tRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTRef_Pattern(tRef, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTRef_Pattern
	 */
	public static final  PatternMatcher [][] TREF__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".+/.+/.+/.+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>TRef</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRef_Pattern(String tRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SclPackage.eINSTANCE.getTRef(), tRef, TREF__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRestrLdName(String tRestrLdName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTRestrLdName_Pattern(tRestrLdName, diagnostics, context);
		if (result || diagnostics != null) result &= validateTRestrLdName_MaxLength(tRestrLdName, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTRestrLdName_Pattern
	 */
	public static final  PatternMatcher [][] TRESTR_LD_NAME__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\p{L}[\\d,\\p{L}]*")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\i\\c*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>TRestr Ld Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRestrLdName_Pattern(String tRestrLdName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SclPackage.eINSTANCE.getTRestrLdName(), tRestrLdName, TRESTR_LD_NAME__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MaxLength constraint of '<em>TRestr Ld Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRestrLdName_MaxLength(String tRestrLdName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = tRestrLdName.length();
		boolean result = length <= 64;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(SclPackage.eINSTANCE.getTRestrLdName(), tRestrLdName, length, 64, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRestrName(String tRestrName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTRestrName_Pattern(tRestrName, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTRestrName_Pattern
	 */
	public static final  PatternMatcher [][] TRESTR_NAME__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[\\d,\\p{L}]+")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\i\\c*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>TRestr Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRestrName_Pattern(String tRestrName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SclPackage.eINSTANCE.getTRestrName(), tRestrName, TRESTR_NAME__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRestrName1stL(String tRestrName1stL, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTRestrName1stL_Pattern(tRestrName1stL, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTRestrName1stL_Pattern
	 */
	public static final  PatternMatcher [][] TRESTR_NAME1ST_L__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\p{Ll}[\\d,\\p{L}]*")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\i\\c*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>TRestr Name1st L</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRestrName1stL_Pattern(String tRestrName1stL, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SclPackage.eINSTANCE.getTRestrName1stL(), tRestrName1stL, TRESTR_NAME1ST_L__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRestrName1stU(String tRestrName1stU, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTRestrName1stU_Pattern(tRestrName1stU, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTRestrName1stU_Pattern
	 */
	public static final  PatternMatcher [][] TRESTR_NAME1ST_U__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\p{Lu}[\\d,\\p{L}]*")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\i\\c*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>TRestr Name1st U</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRestrName1stU_Pattern(String tRestrName1stU, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SclPackage.eINSTANCE.getTRestrName1stU(), tRestrName1stU, TRESTR_NAME1ST_U__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTServiceFCEnumObject(TServiceFCEnum tServiceFCEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTServiceSettingsEnumObject(TServiceSettingsEnum tServiceSettingsEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSIUnitEnumObject(TSIUnitEnum tsiUnitEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTTransformerWindingEnumObject(TTransformerWindingEnum tTransformerWindingEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTTrgOptControlEnumObject(TTrgOptControlEnum tTrgOptControlEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTTrgOptEnumObject(TTrgOptEnum tTrgOptEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTUnitMultiplierEnumObject(TUnitMultiplierEnum tUnitMultiplierEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTValKindEnumObject(TValKindEnum tValKindEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SclValidator
