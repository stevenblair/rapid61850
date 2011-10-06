/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.*;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SclFactoryImpl extends EFactoryImpl implements SclFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SclFactory init() {
		try {
			SclFactory theSclFactory = (SclFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.iec.ch/61850/2006/SCL"); 
			if (theSclFactory != null) {
				return theSclFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SclFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SclFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SclPackage.AUTHENTICATION_TYPE: return createAuthenticationType();
			case SclPackage.HISTORY_TYPE: return createHistoryType();
			case SclPackage.LN0_TYPE: return createLN0Type();
			case SclPackage.OPT_FIELDS_TYPE: return createOptFieldsType();
			case SclPackage.SCL_TYPE: return createSCLType();
			case SclPackage.SETTING_GROUPS_TYPE: return createSettingGroupsType();
			case SclPackage.SMV_OPTS_TYPE: return createSmvOptsType();
			case SclPackage.TACCESS_CONTROL: return createTAccessControl();
			case SclPackage.TACCESS_POINT: return createTAccessPoint();
			case SclPackage.TADDRESS: return createTAddress();
			case SclPackage.TASSOCIATION: return createTAssociation();
			case SclPackage.TBAY: return createTBay();
			case SclPackage.TBDA: return createTBDA();
			case SclPackage.TBIT_RATE_IN_MB_PER_SEC: return createTBitRateInMbPerSec();
			case SclPackage.TCLIENT_LN: return createTClientLN();
			case SclPackage.TCLIENT_SERVICES: return createTClientServices();
			case SclPackage.TCOMMUNICATION: return createTCommunication();
			case SclPackage.TCONDUCTING_EQUIPMENT: return createTConductingEquipment();
			case SclPackage.TCONF_LNS: return createTConfLNs();
			case SclPackage.TCONNECTED_AP: return createTConnectedAP();
			case SclPackage.TCONNECTIVITY_NODE: return createTConnectivityNode();
			case SclPackage.TCONTROL_WITH_IED_NAME: return createTControlWithIEDName();
			case SclPackage.TDA: return createTDA();
			case SclPackage.TDAI: return createTDAI();
			case SclPackage.TDATA_SET: return createTDataSet();
			case SclPackage.TDATA_TYPE_TEMPLATES: return createTDataTypeTemplates();
			case SclPackage.TDA_TYPE: return createTDAType();
			case SclPackage.TDO: return createTDO();
			case SclPackage.TDOI: return createTDOI();
			case SclPackage.TDO_TYPE: return createTDOType();
			case SclPackage.TDURATION_IN_MILLI_SEC: return createTDurationInMilliSec();
			case SclPackage.TDURATION_IN_SEC: return createTDurationInSec();
			case SclPackage.TENUM_TYPE: return createTEnumType();
			case SclPackage.TENUM_VAL: return createTEnumVal();
			case SclPackage.TEXT_REF: return createTExtRef();
			case SclPackage.TFCCB: return createTFCCB();
			case SclPackage.TFCDA: return createTFCDA();
			case SclPackage.TFUNCTION: return createTFunction();
			case SclPackage.TGENERAL_EQUIPMENT: return createTGeneralEquipment();
			case SclPackage.TGSE: return createTGSE();
			case SclPackage.TGSE_CONTROL: return createTGSEControl();
			case SclPackage.TGSE_SETTINGS: return createTGSESettings();
			case SclPackage.THEADER: return createTHeader();
			case SclPackage.THITEM: return createTHitem();
			case SclPackage.TIED: return createTIED();
			case SclPackage.TINPUTS: return createTInputs();
			case SclPackage.TL_DEVICE: return createTLDevice();
			case SclPackage.TLN: return createTLN();
			case SclPackage.TLN0: return createTLN0();
			case SclPackage.TL_NODE: return createTLNode();
			case SclPackage.TL_NODE_TYPE: return createTLNodeType();
			case SclPackage.TLOG: return createTLog();
			case SclPackage.TLOG_CONTROL: return createTLogControl();
			case SclPackage.TLOG_SETTINGS: return createTLogSettings();
			case SclPackage.TP: return createTP();
			case SclPackage.TPAPPID: return createTPAPPID();
			case SclPackage.TPHYS_CONN: return createTPhysConn();
			case SclPackage.TPIP: return createTPIP();
			case SclPackage.TPIPGATEWAY: return createTPIPGATEWAY();
			case SclPackage.TPIPSUBNET: return createTPIPSUBNET();
			case SclPackage.TPMAC_ADDRESS: return createTPMACAddress();
			case SclPackage.TPOSIAE_INVOKE: return createTPOSIAEInvoke();
			case SclPackage.TPOSIAE_QUALIFIER: return createTPOSIAEQualifier();
			case SclPackage.TPOSIAP_INVOKE: return createTPOSIAPInvoke();
			case SclPackage.TPOSIAP_TITLE: return createTPOSIAPTitle();
			case SclPackage.TPOSINSAP: return createTPOSINSAP();
			case SclPackage.TPOSIPSEL: return createTPOSIPSEL();
			case SclPackage.TPOSISSEL: return createTPOSISSEL();
			case SclPackage.TPOSITSEL: return createTPOSITSEL();
			case SclPackage.TPOWER_TRANSFORMER: return createTPowerTransformer();
			case SclPackage.TPRIVATE: return createTPrivate();
			case SclPackage.TPVLANID: return createTPVLANID();
			case SclPackage.TPVLANPRIORITY: return createTPVLANPRIORITY();
			case SclPackage.TREPORT_CONTROL: return createTReportControl();
			case SclPackage.TREPORT_SETTINGS: return createTReportSettings();
			case SclPackage.TRPT_ENABLED: return createTRptEnabled();
			case SclPackage.TSAMPLED_VALUE_CONTROL: return createTSampledValueControl();
			case SclPackage.TSCL_CONTROL: return createTSCLControl();
			case SclPackage.TSDI: return createTSDI();
			case SclPackage.TSDO: return createTSDO();
			case SclPackage.TSERVER: return createTServer();
			case SclPackage.TSERVICES: return createTServices();
			case SclPackage.TSERVICE_WITH_MAX: return createTServiceWithMax();
			case SclPackage.TSERVICE_WITH_MAX_AND_MAX_ATTRIBUTES: return createTServiceWithMaxAndMaxAttributes();
			case SclPackage.TSERVICE_WITH_MAX_AND_MAX_ATTRIBUTES_AND_MODIFY: return createTServiceWithMaxAndMaxAttributesAndModify();
			case SclPackage.TSERVICE_WITH_MAX_AND_MODIFY: return createTServiceWithMaxAndModify();
			case SclPackage.TSERVICE_YES_NO: return createTServiceYesNo();
			case SclPackage.TSETTING_CONTROL: return createTSettingControl();
			case SclPackage.TSMV: return createTSMV();
			case SclPackage.TSMV_SETTINGS: return createTSMVSettings();
			case SclPackage.TSUB_EQUIPMENT: return createTSubEquipment();
			case SclPackage.TSUB_FUNCTION: return createTSubFunction();
			case SclPackage.TSUB_NETWORK: return createTSubNetwork();
			case SclPackage.TSUBSTATION: return createTSubstation();
			case SclPackage.TTAP_CHANGER: return createTTapChanger();
			case SclPackage.TTERMINAL: return createTTerminal();
			case SclPackage.TTEXT: return createTText();
			case SclPackage.TTRANSFORMER_WINDING: return createTTransformerWinding();
			case SclPackage.TTRG_OPS: return createTTrgOps();
			case SclPackage.TVAL: return createTVal();
			case SclPackage.TVALUE_WITH_UNIT: return createTValueWithUnit();
			case SclPackage.TVOLTAGE: return createTVoltage();
			case SclPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case SclPackage.TVOLTAGE_LEVEL: return createTVoltageLevel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SclPackage.NAME_STRUCTURE_TYPE:
				return createNameStructureTypeFromString(eDataType, initialValue);
			case SclPackage.TASSOCIATION_KIND_ENUM:
				return createTAssociationKindEnumFromString(eDataType, initialValue);
			case SclPackage.TAUTHENTICATION_ENUM:
				return createTAuthenticationEnumFromString(eDataType, initialValue);
			case SclPackage.TDOMAIN_LN_GROUP_AENUM:
				return createTDomainLNGroupAEnumFromString(eDataType, initialValue);
			case SclPackage.TDOMAIN_LN_GROUP_CENUM:
				return createTDomainLNGroupCEnumFromString(eDataType, initialValue);
			case SclPackage.TDOMAIN_LN_GROUP_GENUM:
				return createTDomainLNGroupGEnumFromString(eDataType, initialValue);
			case SclPackage.TDOMAIN_LN_GROUP_IENUM:
				return createTDomainLNGroupIEnumFromString(eDataType, initialValue);
			case SclPackage.TDOMAIN_LN_GROUP_MENUM:
				return createTDomainLNGroupMEnumFromString(eDataType, initialValue);
			case SclPackage.TDOMAIN_LN_GROUP_PENUM:
				return createTDomainLNGroupPEnumFromString(eDataType, initialValue);
			case SclPackage.TDOMAIN_LN_GROUP_RENUM:
				return createTDomainLNGroupREnumFromString(eDataType, initialValue);
			case SclPackage.TDOMAIN_LN_GROUP_SENUM:
				return createTDomainLNGroupSEnumFromString(eDataType, initialValue);
			case SclPackage.TDOMAIN_LN_GROUP_TENUM:
				return createTDomainLNGroupTEnumFromString(eDataType, initialValue);
			case SclPackage.TDOMAIN_LN_GROUP_XENUM:
				return createTDomainLNGroupXEnumFromString(eDataType, initialValue);
			case SclPackage.TDOMAIN_LN_GROUP_YENUM:
				return createTDomainLNGroupYEnumFromString(eDataType, initialValue);
			case SclPackage.TDOMAIN_LN_GROUP_ZENUM:
				return createTDomainLNGroupZEnumFromString(eDataType, initialValue);
			case SclPackage.TFC_ENUM:
				return createTFCEnumFromString(eDataType, initialValue);
			case SclPackage.TGSE_CONTROL_TYPE_ENUM:
				return createTGSEControlTypeEnumFromString(eDataType, initialValue);
			case SclPackage.TLLN0_ENUM:
				return createTLLN0EnumFromString(eDataType, initialValue);
			case SclPackage.TLPHD_ENUM:
				return createTLPHDEnumFromString(eDataType, initialValue);
			case SclPackage.TPHASE_ENUM:
				return createTPhaseEnumFromString(eDataType, initialValue);
			case SclPackage.TPOWER_TRANSFORMER_ENUM:
				return createTPowerTransformerEnumFromString(eDataType, initialValue);
			case SclPackage.TPREDEFINED_ATTRIBUTE_NAME_ENUM:
				return createTPredefinedAttributeNameEnumFromString(eDataType, initialValue);
			case SclPackage.TPREDEFINED_BASIC_TYPE_ENUM:
				return createTPredefinedBasicTypeEnumFromString(eDataType, initialValue);
			case SclPackage.TPREDEFINED_CDC_ENUM:
				return createTPredefinedCDCEnumFromString(eDataType, initialValue);
			case SclPackage.TPREDEFINED_COMMON_CONDUCTING_EQUIPMENT_ENUM:
				return createTPredefinedCommonConductingEquipmentEnumFromString(eDataType, initialValue);
			case SclPackage.TPREDEFINED_GENERAL_EQUIPMENT_ENUM:
				return createTPredefinedGeneralEquipmentEnumFromString(eDataType, initialValue);
			case SclPackage.TPREDEFINED_PTYPE_ENUM:
				return createTPredefinedPTypeEnumFromString(eDataType, initialValue);
			case SclPackage.TSERVICE_FC_ENUM:
				return createTServiceFCEnumFromString(eDataType, initialValue);
			case SclPackage.TSERVICE_SETTINGS_ENUM:
				return createTServiceSettingsEnumFromString(eDataType, initialValue);
			case SclPackage.TSI_UNIT_ENUM:
				return createTSIUnitEnumFromString(eDataType, initialValue);
			case SclPackage.TTRANSFORMER_WINDING_ENUM:
				return createTTransformerWindingEnumFromString(eDataType, initialValue);
			case SclPackage.TTRG_OPT_CONTROL_ENUM:
				return createTTrgOptControlEnumFromString(eDataType, initialValue);
			case SclPackage.TTRG_OPT_ENUM:
				return createTTrgOptEnumFromString(eDataType, initialValue);
			case SclPackage.TUNIT_MULTIPLIER_ENUM:
				return createTUnitMultiplierEnumFromString(eDataType, initialValue);
			case SclPackage.TVAL_KIND_ENUM:
				return createTValKindEnumFromString(eDataType, initialValue);
			case SclPackage.NAME_STRUCTURE_TYPE_OBJECT:
				return createNameStructureTypeObjectFromString(eDataType, initialValue);
			case SclPackage.SMP_RATE_TYPE:
				return createSmpRateTypeFromString(eDataType, initialValue);
			case SclPackage.TANY_NAME:
				return createTAnyNameFromString(eDataType, initialValue);
			case SclPackage.TASSOCIATION_KIND_ENUM_OBJECT:
				return createTAssociationKindEnumObjectFromString(eDataType, initialValue);
			case SclPackage.TATTRIBUTE_NAME_ENUM:
				return createTAttributeNameEnumFromString(eDataType, initialValue);
			case SclPackage.TAUTHENTICATION_ENUM_OBJECT:
				return createTAuthenticationEnumObjectFromString(eDataType, initialValue);
			case SclPackage.TBASIC_TYPE_ENUM:
				return createTBasicTypeEnumFromString(eDataType, initialValue);
			case SclPackage.TCDC_ENUM:
				return createTCDCEnumFromString(eDataType, initialValue);
			case SclPackage.TCOMMON_CONDUCTING_EQUIPMENT_ENUM:
				return createTCommonConductingEquipmentEnumFromString(eDataType, initialValue);
			case SclPackage.TDOMAIN_LN_ENUM:
				return createTDomainLNEnumFromString(eDataType, initialValue);
			case SclPackage.TDOMAIN_LN_GROUP_AENUM_OBJECT:
				return createTDomainLNGroupAEnumObjectFromString(eDataType, initialValue);
			case SclPackage.TDOMAIN_LN_GROUP_CENUM_OBJECT:
				return createTDomainLNGroupCEnumObjectFromString(eDataType, initialValue);
			case SclPackage.TDOMAIN_LN_GROUP_GENUM_OBJECT:
				return createTDomainLNGroupGEnumObjectFromString(eDataType, initialValue);
			case SclPackage.TDOMAIN_LN_GROUP_IENUM_OBJECT:
				return createTDomainLNGroupIEnumObjectFromString(eDataType, initialValue);
			case SclPackage.TDOMAIN_LN_GROUP_MENUM_OBJECT:
				return createTDomainLNGroupMEnumObjectFromString(eDataType, initialValue);
			case SclPackage.TDOMAIN_LN_GROUP_PENUM_OBJECT:
				return createTDomainLNGroupPEnumObjectFromString(eDataType, initialValue);
			case SclPackage.TDOMAIN_LN_GROUP_RENUM_OBJECT:
				return createTDomainLNGroupREnumObjectFromString(eDataType, initialValue);
			case SclPackage.TDOMAIN_LN_GROUP_SENUM_OBJECT:
				return createTDomainLNGroupSEnumObjectFromString(eDataType, initialValue);
			case SclPackage.TDOMAIN_LN_GROUP_TENUM_OBJECT:
				return createTDomainLNGroupTEnumObjectFromString(eDataType, initialValue);
			case SclPackage.TDOMAIN_LN_GROUP_XENUM_OBJECT:
				return createTDomainLNGroupXEnumObjectFromString(eDataType, initialValue);
			case SclPackage.TDOMAIN_LN_GROUP_YENUM_OBJECT:
				return createTDomainLNGroupYEnumObjectFromString(eDataType, initialValue);
			case SclPackage.TDOMAIN_LN_GROUP_ZENUM_OBJECT:
				return createTDomainLNGroupZEnumObjectFromString(eDataType, initialValue);
			case SclPackage.TEQUIPMENT_ENUM:
				return createTEquipmentEnumFromString(eDataType, initialValue);
			case SclPackage.TEXTENSION_ATTRIBUTE_NAME_ENUM:
				return createTExtensionAttributeNameEnumFromString(eDataType, initialValue);
			case SclPackage.TEXTENSION_BASIC_TYPE_ENUM:
				return createTExtensionBasicTypeEnumFromString(eDataType, initialValue);
			case SclPackage.TEXTENSION_CDC_ENUM:
				return createTExtensionCDCEnumFromString(eDataType, initialValue);
			case SclPackage.TEXTENSION_EQUIPMENT_ENUM:
				return createTExtensionEquipmentEnumFromString(eDataType, initialValue);
			case SclPackage.TEXTENSION_GENERAL_EQUIPMENT_ENUM:
				return createTExtensionGeneralEquipmentEnumFromString(eDataType, initialValue);
			case SclPackage.TEXTENSION_LN_CLASS_ENUM:
				return createTExtensionLNClassEnumFromString(eDataType, initialValue);
			case SclPackage.TEXTENSION_PTYPE_ENUM:
				return createTExtensionPTypeEnumFromString(eDataType, initialValue);
			case SclPackage.TFC_ENUM_OBJECT:
				return createTFCEnumObjectFromString(eDataType, initialValue);
			case SclPackage.TGENERAL_EQUIPMENT_ENUM:
				return createTGeneralEquipmentEnumFromString(eDataType, initialValue);
			case SclPackage.TGSE_CONTROL_TYPE_ENUM_OBJECT:
				return createTGSEControlTypeEnumObjectFromString(eDataType, initialValue);
			case SclPackage.TLLN0_ENUM_OBJECT:
				return createTLLN0EnumObjectFromString(eDataType, initialValue);
			case SclPackage.TLN_CLASS_ENUM:
				return createTLNClassEnumFromString(eDataType, initialValue);
			case SclPackage.TLPHD_ENUM_OBJECT:
				return createTLPHDEnumObjectFromString(eDataType, initialValue);
			case SclPackage.TNAME:
				return createTNameFromString(eDataType, initialValue);
			case SclPackage.TP_ADDR:
				return createTPAddrFromString(eDataType, initialValue);
			case SclPackage.TPHASE_ENUM_OBJECT:
				return createTPhaseEnumObjectFromString(eDataType, initialValue);
			case SclPackage.TPOWER_TRANSFORMER_ENUM_OBJECT:
				return createTPowerTransformerEnumObjectFromString(eDataType, initialValue);
			case SclPackage.TPREDEFINED_ATTRIBUTE_NAME_ENUM_OBJECT:
				return createTPredefinedAttributeNameEnumObjectFromString(eDataType, initialValue);
			case SclPackage.TPREDEFINED_BASIC_TYPE_ENUM_OBJECT:
				return createTPredefinedBasicTypeEnumObjectFromString(eDataType, initialValue);
			case SclPackage.TPREDEFINED_CDC_ENUM_OBJECT:
				return createTPredefinedCDCEnumObjectFromString(eDataType, initialValue);
			case SclPackage.TPREDEFINED_COMMON_CONDUCTING_EQUIPMENT_ENUM_OBJECT:
				return createTPredefinedCommonConductingEquipmentEnumObjectFromString(eDataType, initialValue);
			case SclPackage.TPREDEFINED_EQUIPMENT_ENUM:
				return createTPredefinedEquipmentEnumFromString(eDataType, initialValue);
			case SclPackage.TPREDEFINED_GENERAL_EQUIPMENT_ENUM_OBJECT:
				return createTPredefinedGeneralEquipmentEnumObjectFromString(eDataType, initialValue);
			case SclPackage.TPREDEFINED_LN_CLASS_ENUM:
				return createTPredefinedLNClassEnumFromString(eDataType, initialValue);
			case SclPackage.TPREDEFINED_PTYPE_ENUM_OBJECT:
				return createTPredefinedPTypeEnumObjectFromString(eDataType, initialValue);
			case SclPackage.TP_TYPE_ENUM:
				return createTPTypeEnumFromString(eDataType, initialValue);
			case SclPackage.TREF:
				return createTRefFromString(eDataType, initialValue);
			case SclPackage.TRESTR_LD_NAME:
				return createTRestrLdNameFromString(eDataType, initialValue);
			case SclPackage.TRESTR_NAME:
				return createTRestrNameFromString(eDataType, initialValue);
			case SclPackage.TRESTR_NAME1ST_L:
				return createTRestrName1stLFromString(eDataType, initialValue);
			case SclPackage.TRESTR_NAME1ST_U:
				return createTRestrName1stUFromString(eDataType, initialValue);
			case SclPackage.TSERVICE_FC_ENUM_OBJECT:
				return createTServiceFCEnumObjectFromString(eDataType, initialValue);
			case SclPackage.TSERVICE_SETTINGS_ENUM_OBJECT:
				return createTServiceSettingsEnumObjectFromString(eDataType, initialValue);
			case SclPackage.TSI_UNIT_ENUM_OBJECT:
				return createTSIUnitEnumObjectFromString(eDataType, initialValue);
			case SclPackage.TTRANSFORMER_WINDING_ENUM_OBJECT:
				return createTTransformerWindingEnumObjectFromString(eDataType, initialValue);
			case SclPackage.TTRG_OPT_CONTROL_ENUM_OBJECT:
				return createTTrgOptControlEnumObjectFromString(eDataType, initialValue);
			case SclPackage.TTRG_OPT_ENUM_OBJECT:
				return createTTrgOptEnumObjectFromString(eDataType, initialValue);
			case SclPackage.TUNIT_MULTIPLIER_ENUM_OBJECT:
				return createTUnitMultiplierEnumObjectFromString(eDataType, initialValue);
			case SclPackage.TVAL_KIND_ENUM_OBJECT:
				return createTValKindEnumObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SclPackage.NAME_STRUCTURE_TYPE:
				return convertNameStructureTypeToString(eDataType, instanceValue);
			case SclPackage.TASSOCIATION_KIND_ENUM:
				return convertTAssociationKindEnumToString(eDataType, instanceValue);
			case SclPackage.TAUTHENTICATION_ENUM:
				return convertTAuthenticationEnumToString(eDataType, instanceValue);
			case SclPackage.TDOMAIN_LN_GROUP_AENUM:
				return convertTDomainLNGroupAEnumToString(eDataType, instanceValue);
			case SclPackage.TDOMAIN_LN_GROUP_CENUM:
				return convertTDomainLNGroupCEnumToString(eDataType, instanceValue);
			case SclPackage.TDOMAIN_LN_GROUP_GENUM:
				return convertTDomainLNGroupGEnumToString(eDataType, instanceValue);
			case SclPackage.TDOMAIN_LN_GROUP_IENUM:
				return convertTDomainLNGroupIEnumToString(eDataType, instanceValue);
			case SclPackage.TDOMAIN_LN_GROUP_MENUM:
				return convertTDomainLNGroupMEnumToString(eDataType, instanceValue);
			case SclPackage.TDOMAIN_LN_GROUP_PENUM:
				return convertTDomainLNGroupPEnumToString(eDataType, instanceValue);
			case SclPackage.TDOMAIN_LN_GROUP_RENUM:
				return convertTDomainLNGroupREnumToString(eDataType, instanceValue);
			case SclPackage.TDOMAIN_LN_GROUP_SENUM:
				return convertTDomainLNGroupSEnumToString(eDataType, instanceValue);
			case SclPackage.TDOMAIN_LN_GROUP_TENUM:
				return convertTDomainLNGroupTEnumToString(eDataType, instanceValue);
			case SclPackage.TDOMAIN_LN_GROUP_XENUM:
				return convertTDomainLNGroupXEnumToString(eDataType, instanceValue);
			case SclPackage.TDOMAIN_LN_GROUP_YENUM:
				return convertTDomainLNGroupYEnumToString(eDataType, instanceValue);
			case SclPackage.TDOMAIN_LN_GROUP_ZENUM:
				return convertTDomainLNGroupZEnumToString(eDataType, instanceValue);
			case SclPackage.TFC_ENUM:
				return convertTFCEnumToString(eDataType, instanceValue);
			case SclPackage.TGSE_CONTROL_TYPE_ENUM:
				return convertTGSEControlTypeEnumToString(eDataType, instanceValue);
			case SclPackage.TLLN0_ENUM:
				return convertTLLN0EnumToString(eDataType, instanceValue);
			case SclPackage.TLPHD_ENUM:
				return convertTLPHDEnumToString(eDataType, instanceValue);
			case SclPackage.TPHASE_ENUM:
				return convertTPhaseEnumToString(eDataType, instanceValue);
			case SclPackage.TPOWER_TRANSFORMER_ENUM:
				return convertTPowerTransformerEnumToString(eDataType, instanceValue);
			case SclPackage.TPREDEFINED_ATTRIBUTE_NAME_ENUM:
				return convertTPredefinedAttributeNameEnumToString(eDataType, instanceValue);
			case SclPackage.TPREDEFINED_BASIC_TYPE_ENUM:
				return convertTPredefinedBasicTypeEnumToString(eDataType, instanceValue);
			case SclPackage.TPREDEFINED_CDC_ENUM:
				return convertTPredefinedCDCEnumToString(eDataType, instanceValue);
			case SclPackage.TPREDEFINED_COMMON_CONDUCTING_EQUIPMENT_ENUM:
				return convertTPredefinedCommonConductingEquipmentEnumToString(eDataType, instanceValue);
			case SclPackage.TPREDEFINED_GENERAL_EQUIPMENT_ENUM:
				return convertTPredefinedGeneralEquipmentEnumToString(eDataType, instanceValue);
			case SclPackage.TPREDEFINED_PTYPE_ENUM:
				return convertTPredefinedPTypeEnumToString(eDataType, instanceValue);
			case SclPackage.TSERVICE_FC_ENUM:
				return convertTServiceFCEnumToString(eDataType, instanceValue);
			case SclPackage.TSERVICE_SETTINGS_ENUM:
				return convertTServiceSettingsEnumToString(eDataType, instanceValue);
			case SclPackage.TSI_UNIT_ENUM:
				return convertTSIUnitEnumToString(eDataType, instanceValue);
			case SclPackage.TTRANSFORMER_WINDING_ENUM:
				return convertTTransformerWindingEnumToString(eDataType, instanceValue);
			case SclPackage.TTRG_OPT_CONTROL_ENUM:
				return convertTTrgOptControlEnumToString(eDataType, instanceValue);
			case SclPackage.TTRG_OPT_ENUM:
				return convertTTrgOptEnumToString(eDataType, instanceValue);
			case SclPackage.TUNIT_MULTIPLIER_ENUM:
				return convertTUnitMultiplierEnumToString(eDataType, instanceValue);
			case SclPackage.TVAL_KIND_ENUM:
				return convertTValKindEnumToString(eDataType, instanceValue);
			case SclPackage.NAME_STRUCTURE_TYPE_OBJECT:
				return convertNameStructureTypeObjectToString(eDataType, instanceValue);
			case SclPackage.SMP_RATE_TYPE:
				return convertSmpRateTypeToString(eDataType, instanceValue);
			case SclPackage.TANY_NAME:
				return convertTAnyNameToString(eDataType, instanceValue);
			case SclPackage.TASSOCIATION_KIND_ENUM_OBJECT:
				return convertTAssociationKindEnumObjectToString(eDataType, instanceValue);
			case SclPackage.TATTRIBUTE_NAME_ENUM:
				return convertTAttributeNameEnumToString(eDataType, instanceValue);
			case SclPackage.TAUTHENTICATION_ENUM_OBJECT:
				return convertTAuthenticationEnumObjectToString(eDataType, instanceValue);
			case SclPackage.TBASIC_TYPE_ENUM:
				return convertTBasicTypeEnumToString(eDataType, instanceValue);
			case SclPackage.TCDC_ENUM:
				return convertTCDCEnumToString(eDataType, instanceValue);
			case SclPackage.TCOMMON_CONDUCTING_EQUIPMENT_ENUM:
				return convertTCommonConductingEquipmentEnumToString(eDataType, instanceValue);
			case SclPackage.TDOMAIN_LN_ENUM:
				return convertTDomainLNEnumToString(eDataType, instanceValue);
			case SclPackage.TDOMAIN_LN_GROUP_AENUM_OBJECT:
				return convertTDomainLNGroupAEnumObjectToString(eDataType, instanceValue);
			case SclPackage.TDOMAIN_LN_GROUP_CENUM_OBJECT:
				return convertTDomainLNGroupCEnumObjectToString(eDataType, instanceValue);
			case SclPackage.TDOMAIN_LN_GROUP_GENUM_OBJECT:
				return convertTDomainLNGroupGEnumObjectToString(eDataType, instanceValue);
			case SclPackage.TDOMAIN_LN_GROUP_IENUM_OBJECT:
				return convertTDomainLNGroupIEnumObjectToString(eDataType, instanceValue);
			case SclPackage.TDOMAIN_LN_GROUP_MENUM_OBJECT:
				return convertTDomainLNGroupMEnumObjectToString(eDataType, instanceValue);
			case SclPackage.TDOMAIN_LN_GROUP_PENUM_OBJECT:
				return convertTDomainLNGroupPEnumObjectToString(eDataType, instanceValue);
			case SclPackage.TDOMAIN_LN_GROUP_RENUM_OBJECT:
				return convertTDomainLNGroupREnumObjectToString(eDataType, instanceValue);
			case SclPackage.TDOMAIN_LN_GROUP_SENUM_OBJECT:
				return convertTDomainLNGroupSEnumObjectToString(eDataType, instanceValue);
			case SclPackage.TDOMAIN_LN_GROUP_TENUM_OBJECT:
				return convertTDomainLNGroupTEnumObjectToString(eDataType, instanceValue);
			case SclPackage.TDOMAIN_LN_GROUP_XENUM_OBJECT:
				return convertTDomainLNGroupXEnumObjectToString(eDataType, instanceValue);
			case SclPackage.TDOMAIN_LN_GROUP_YENUM_OBJECT:
				return convertTDomainLNGroupYEnumObjectToString(eDataType, instanceValue);
			case SclPackage.TDOMAIN_LN_GROUP_ZENUM_OBJECT:
				return convertTDomainLNGroupZEnumObjectToString(eDataType, instanceValue);
			case SclPackage.TEQUIPMENT_ENUM:
				return convertTEquipmentEnumToString(eDataType, instanceValue);
			case SclPackage.TEXTENSION_ATTRIBUTE_NAME_ENUM:
				return convertTExtensionAttributeNameEnumToString(eDataType, instanceValue);
			case SclPackage.TEXTENSION_BASIC_TYPE_ENUM:
				return convertTExtensionBasicTypeEnumToString(eDataType, instanceValue);
			case SclPackage.TEXTENSION_CDC_ENUM:
				return convertTExtensionCDCEnumToString(eDataType, instanceValue);
			case SclPackage.TEXTENSION_EQUIPMENT_ENUM:
				return convertTExtensionEquipmentEnumToString(eDataType, instanceValue);
			case SclPackage.TEXTENSION_GENERAL_EQUIPMENT_ENUM:
				return convertTExtensionGeneralEquipmentEnumToString(eDataType, instanceValue);
			case SclPackage.TEXTENSION_LN_CLASS_ENUM:
				return convertTExtensionLNClassEnumToString(eDataType, instanceValue);
			case SclPackage.TEXTENSION_PTYPE_ENUM:
				return convertTExtensionPTypeEnumToString(eDataType, instanceValue);
			case SclPackage.TFC_ENUM_OBJECT:
				return convertTFCEnumObjectToString(eDataType, instanceValue);
			case SclPackage.TGENERAL_EQUIPMENT_ENUM:
				return convertTGeneralEquipmentEnumToString(eDataType, instanceValue);
			case SclPackage.TGSE_CONTROL_TYPE_ENUM_OBJECT:
				return convertTGSEControlTypeEnumObjectToString(eDataType, instanceValue);
			case SclPackage.TLLN0_ENUM_OBJECT:
				return convertTLLN0EnumObjectToString(eDataType, instanceValue);
			case SclPackage.TLN_CLASS_ENUM:
				return convertTLNClassEnumToString(eDataType, instanceValue);
			case SclPackage.TLPHD_ENUM_OBJECT:
				return convertTLPHDEnumObjectToString(eDataType, instanceValue);
			case SclPackage.TNAME:
				return convertTNameToString(eDataType, instanceValue);
			case SclPackage.TP_ADDR:
				return convertTPAddrToString(eDataType, instanceValue);
			case SclPackage.TPHASE_ENUM_OBJECT:
				return convertTPhaseEnumObjectToString(eDataType, instanceValue);
			case SclPackage.TPOWER_TRANSFORMER_ENUM_OBJECT:
				return convertTPowerTransformerEnumObjectToString(eDataType, instanceValue);
			case SclPackage.TPREDEFINED_ATTRIBUTE_NAME_ENUM_OBJECT:
				return convertTPredefinedAttributeNameEnumObjectToString(eDataType, instanceValue);
			case SclPackage.TPREDEFINED_BASIC_TYPE_ENUM_OBJECT:
				return convertTPredefinedBasicTypeEnumObjectToString(eDataType, instanceValue);
			case SclPackage.TPREDEFINED_CDC_ENUM_OBJECT:
				return convertTPredefinedCDCEnumObjectToString(eDataType, instanceValue);
			case SclPackage.TPREDEFINED_COMMON_CONDUCTING_EQUIPMENT_ENUM_OBJECT:
				return convertTPredefinedCommonConductingEquipmentEnumObjectToString(eDataType, instanceValue);
			case SclPackage.TPREDEFINED_EQUIPMENT_ENUM:
				return convertTPredefinedEquipmentEnumToString(eDataType, instanceValue);
			case SclPackage.TPREDEFINED_GENERAL_EQUIPMENT_ENUM_OBJECT:
				return convertTPredefinedGeneralEquipmentEnumObjectToString(eDataType, instanceValue);
			case SclPackage.TPREDEFINED_LN_CLASS_ENUM:
				return convertTPredefinedLNClassEnumToString(eDataType, instanceValue);
			case SclPackage.TPREDEFINED_PTYPE_ENUM_OBJECT:
				return convertTPredefinedPTypeEnumObjectToString(eDataType, instanceValue);
			case SclPackage.TP_TYPE_ENUM:
				return convertTPTypeEnumToString(eDataType, instanceValue);
			case SclPackage.TREF:
				return convertTRefToString(eDataType, instanceValue);
			case SclPackage.TRESTR_LD_NAME:
				return convertTRestrLdNameToString(eDataType, instanceValue);
			case SclPackage.TRESTR_NAME:
				return convertTRestrNameToString(eDataType, instanceValue);
			case SclPackage.TRESTR_NAME1ST_L:
				return convertTRestrName1stLToString(eDataType, instanceValue);
			case SclPackage.TRESTR_NAME1ST_U:
				return convertTRestrName1stUToString(eDataType, instanceValue);
			case SclPackage.TSERVICE_FC_ENUM_OBJECT:
				return convertTServiceFCEnumObjectToString(eDataType, instanceValue);
			case SclPackage.TSERVICE_SETTINGS_ENUM_OBJECT:
				return convertTServiceSettingsEnumObjectToString(eDataType, instanceValue);
			case SclPackage.TSI_UNIT_ENUM_OBJECT:
				return convertTSIUnitEnumObjectToString(eDataType, instanceValue);
			case SclPackage.TTRANSFORMER_WINDING_ENUM_OBJECT:
				return convertTTransformerWindingEnumObjectToString(eDataType, instanceValue);
			case SclPackage.TTRG_OPT_CONTROL_ENUM_OBJECT:
				return convertTTrgOptControlEnumObjectToString(eDataType, instanceValue);
			case SclPackage.TTRG_OPT_ENUM_OBJECT:
				return convertTTrgOptEnumObjectToString(eDataType, instanceValue);
			case SclPackage.TUNIT_MULTIPLIER_ENUM_OBJECT:
				return convertTUnitMultiplierEnumObjectToString(eDataType, instanceValue);
			case SclPackage.TVAL_KIND_ENUM_OBJECT:
				return convertTValKindEnumObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationType createAuthenticationType() {
		AuthenticationTypeImpl authenticationType = new AuthenticationTypeImpl();
		return authenticationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryType createHistoryType() {
		HistoryTypeImpl historyType = new HistoryTypeImpl();
		return historyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LN0Type createLN0Type() {
		LN0TypeImpl ln0Type = new LN0TypeImpl();
		return ln0Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptFieldsType createOptFieldsType() {
		OptFieldsTypeImpl optFieldsType = new OptFieldsTypeImpl();
		return optFieldsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCLType createSCLType() {
		SCLTypeImpl sclType = new SCLTypeImpl();
		return sclType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SettingGroupsType createSettingGroupsType() {
		SettingGroupsTypeImpl settingGroupsType = new SettingGroupsTypeImpl();
		return settingGroupsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmvOptsType createSmvOptsType() {
		SmvOptsTypeImpl smvOptsType = new SmvOptsTypeImpl();
		return smvOptsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAccessControl createTAccessControl() {
		TAccessControlImpl tAccessControl = new TAccessControlImpl();
		return tAccessControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAccessPoint createTAccessPoint() {
		TAccessPointImpl tAccessPoint = new TAccessPointImpl();
		return tAccessPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAddress createTAddress() {
		TAddressImpl tAddress = new TAddressImpl();
		return tAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAssociation createTAssociation() {
		TAssociationImpl tAssociation = new TAssociationImpl();
		return tAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBay createTBay() {
		TBayImpl tBay = new TBayImpl();
		return tBay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBDA createTBDA() {
		TBDAImpl tbda = new TBDAImpl();
		return tbda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBitRateInMbPerSec createTBitRateInMbPerSec() {
		TBitRateInMbPerSecImpl tBitRateInMbPerSec = new TBitRateInMbPerSecImpl();
		return tBitRateInMbPerSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClientLN createTClientLN() {
		TClientLNImpl tClientLN = new TClientLNImpl();
		return tClientLN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClientServices createTClientServices() {
		TClientServicesImpl tClientServices = new TClientServicesImpl();
		return tClientServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCommunication createTCommunication() {
		TCommunicationImpl tCommunication = new TCommunicationImpl();
		return tCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TConductingEquipment createTConductingEquipment() {
		TConductingEquipmentImpl tConductingEquipment = new TConductingEquipmentImpl();
		return tConductingEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TConfLNs createTConfLNs() {
		TConfLNsImpl tConfLNs = new TConfLNsImpl();
		return tConfLNs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TConnectedAP createTConnectedAP() {
		TConnectedAPImpl tConnectedAP = new TConnectedAPImpl();
		return tConnectedAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TConnectivityNode createTConnectivityNode() {
		TConnectivityNodeImpl tConnectivityNode = new TConnectivityNodeImpl();
		return tConnectivityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TControlWithIEDName createTControlWithIEDName() {
		TControlWithIEDNameImpl tControlWithIEDName = new TControlWithIEDNameImpl();
		return tControlWithIEDName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDA createTDA() {
		TDAImpl tda = new TDAImpl();
		return tda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDAI createTDAI() {
		TDAIImpl tdai = new TDAIImpl();
		return tdai;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDataSet createTDataSet() {
		TDataSetImpl tDataSet = new TDataSetImpl();
		return tDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDataTypeTemplates createTDataTypeTemplates() {
		TDataTypeTemplatesImpl tDataTypeTemplates = new TDataTypeTemplatesImpl();
		return tDataTypeTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDAType createTDAType() {
		TDATypeImpl tdaType = new TDATypeImpl();
		return tdaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDO createTDO() {
		TDOImpl tdo = new TDOImpl();
		return tdo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDOI createTDOI() {
		TDOIImpl tdoi = new TDOIImpl();
		return tdoi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDOType createTDOType() {
		TDOTypeImpl tdoType = new TDOTypeImpl();
		return tdoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDurationInMilliSec createTDurationInMilliSec() {
		TDurationInMilliSecImpl tDurationInMilliSec = new TDurationInMilliSecImpl();
		return tDurationInMilliSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDurationInSec createTDurationInSec() {
		TDurationInSecImpl tDurationInSec = new TDurationInSecImpl();
		return tDurationInSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEnumType createTEnumType() {
		TEnumTypeImpl tEnumType = new TEnumTypeImpl();
		return tEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEnumVal createTEnumVal() {
		TEnumValImpl tEnumVal = new TEnumValImpl();
		return tEnumVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TExtRef createTExtRef() {
		TExtRefImpl tExtRef = new TExtRefImpl();
		return tExtRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFCCB createTFCCB() {
		TFCCBImpl tfccb = new TFCCBImpl();
		return tfccb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFCDA createTFCDA() {
		TFCDAImpl tfcda = new TFCDAImpl();
		return tfcda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFunction createTFunction() {
		TFunctionImpl tFunction = new TFunctionImpl();
		return tFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TGeneralEquipment createTGeneralEquipment() {
		TGeneralEquipmentImpl tGeneralEquipment = new TGeneralEquipmentImpl();
		return tGeneralEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TGSE createTGSE() {
		TGSEImpl tgse = new TGSEImpl();
		return tgse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TGSEControl createTGSEControl() {
		TGSEControlImpl tgseControl = new TGSEControlImpl();
		return tgseControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TGSESettings createTGSESettings() {
		TGSESettingsImpl tgseSettings = new TGSESettingsImpl();
		return tgseSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public THeader createTHeader() {
		THeaderImpl tHeader = new THeaderImpl();
		return tHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public THitem createTHitem() {
		THitemImpl tHitem = new THitemImpl();
		return tHitem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TIED createTIED() {
		TIEDImpl tied = new TIEDImpl();
		return tied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TInputs createTInputs() {
		TInputsImpl tInputs = new TInputsImpl();
		return tInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLDevice createTLDevice() {
		TLDeviceImpl tlDevice = new TLDeviceImpl();
		return tlDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLN createTLN() {
		TLNImpl tln = new TLNImpl();
		return tln;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLN0 createTLN0() {
		TLN0Impl tln0 = new TLN0Impl();
		return tln0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLNode createTLNode() {
		TLNodeImpl tlNode = new TLNodeImpl();
		return tlNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLNodeType createTLNodeType() {
		TLNodeTypeImpl tlNodeType = new TLNodeTypeImpl();
		return tlNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLog createTLog() {
		TLogImpl tLog = new TLogImpl();
		return tLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLogControl createTLogControl() {
		TLogControlImpl tLogControl = new TLogControlImpl();
		return tLogControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLogSettings createTLogSettings() {
		TLogSettingsImpl tLogSettings = new TLogSettingsImpl();
		return tLogSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TP createTP() {
		TPImpl tp = new TPImpl();
		return tp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPAPPID createTPAPPID() {
		TPAPPIDImpl tpappid = new TPAPPIDImpl();
		return tpappid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPhysConn createTPhysConn() {
		TPhysConnImpl tPhysConn = new TPhysConnImpl();
		return tPhysConn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPIP createTPIP() {
		TPIPImpl tpip = new TPIPImpl();
		return tpip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPIPGATEWAY createTPIPGATEWAY() {
		TPIPGATEWAYImpl tpipgateway = new TPIPGATEWAYImpl();
		return tpipgateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPIPSUBNET createTPIPSUBNET() {
		TPIPSUBNETImpl tpipsubnet = new TPIPSUBNETImpl();
		return tpipsubnet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPMACAddress createTPMACAddress() {
		TPMACAddressImpl tpmacAddress = new TPMACAddressImpl();
		return tpmacAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPOSIAEInvoke createTPOSIAEInvoke() {
		TPOSIAEInvokeImpl tposiaeInvoke = new TPOSIAEInvokeImpl();
		return tposiaeInvoke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPOSIAEQualifier createTPOSIAEQualifier() {
		TPOSIAEQualifierImpl tposiaeQualifier = new TPOSIAEQualifierImpl();
		return tposiaeQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPOSIAPInvoke createTPOSIAPInvoke() {
		TPOSIAPInvokeImpl tposiapInvoke = new TPOSIAPInvokeImpl();
		return tposiapInvoke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPOSIAPTitle createTPOSIAPTitle() {
		TPOSIAPTitleImpl tposiapTitle = new TPOSIAPTitleImpl();
		return tposiapTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPOSINSAP createTPOSINSAP() {
		TPOSINSAPImpl tposinsap = new TPOSINSAPImpl();
		return tposinsap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPOSIPSEL createTPOSIPSEL() {
		TPOSIPSELImpl tposipsel = new TPOSIPSELImpl();
		return tposipsel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPOSISSEL createTPOSISSEL() {
		TPOSISSELImpl tposissel = new TPOSISSELImpl();
		return tposissel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPOSITSEL createTPOSITSEL() {
		TPOSITSELImpl tpositsel = new TPOSITSELImpl();
		return tpositsel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPowerTransformer createTPowerTransformer() {
		TPowerTransformerImpl tPowerTransformer = new TPowerTransformerImpl();
		return tPowerTransformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPrivate createTPrivate() {
		TPrivateImpl tPrivate = new TPrivateImpl();
		return tPrivate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPVLANID createTPVLANID() {
		TPVLANIDImpl tpvlanid = new TPVLANIDImpl();
		return tpvlanid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPVLANPRIORITY createTPVLANPRIORITY() {
		TPVLANPRIORITYImpl tpvlanpriority = new TPVLANPRIORITYImpl();
		return tpvlanpriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TReportControl createTReportControl() {
		TReportControlImpl tReportControl = new TReportControlImpl();
		return tReportControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TReportSettings createTReportSettings() {
		TReportSettingsImpl tReportSettings = new TReportSettingsImpl();
		return tReportSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRptEnabled createTRptEnabled() {
		TRptEnabledImpl tRptEnabled = new TRptEnabledImpl();
		return tRptEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSampledValueControl createTSampledValueControl() {
		TSampledValueControlImpl tSampledValueControl = new TSampledValueControlImpl();
		return tSampledValueControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSCLControl createTSCLControl() {
		TSCLControlImpl tsclControl = new TSCLControlImpl();
		return tsclControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSDI createTSDI() {
		TSDIImpl tsdi = new TSDIImpl();
		return tsdi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSDO createTSDO() {
		TSDOImpl tsdo = new TSDOImpl();
		return tsdo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServer createTServer() {
		TServerImpl tServer = new TServerImpl();
		return tServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServices createTServices() {
		TServicesImpl tServices = new TServicesImpl();
		return tServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceWithMax createTServiceWithMax() {
		TServiceWithMaxImpl tServiceWithMax = new TServiceWithMaxImpl();
		return tServiceWithMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceWithMaxAndMaxAttributes createTServiceWithMaxAndMaxAttributes() {
		TServiceWithMaxAndMaxAttributesImpl tServiceWithMaxAndMaxAttributes = new TServiceWithMaxAndMaxAttributesImpl();
		return tServiceWithMaxAndMaxAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceWithMaxAndMaxAttributesAndModify createTServiceWithMaxAndMaxAttributesAndModify() {
		TServiceWithMaxAndMaxAttributesAndModifyImpl tServiceWithMaxAndMaxAttributesAndModify = new TServiceWithMaxAndMaxAttributesAndModifyImpl();
		return tServiceWithMaxAndMaxAttributesAndModify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceWithMaxAndModify createTServiceWithMaxAndModify() {
		TServiceWithMaxAndModifyImpl tServiceWithMaxAndModify = new TServiceWithMaxAndModifyImpl();
		return tServiceWithMaxAndModify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceYesNo createTServiceYesNo() {
		TServiceYesNoImpl tServiceYesNo = new TServiceYesNoImpl();
		return tServiceYesNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSettingControl createTSettingControl() {
		TSettingControlImpl tSettingControl = new TSettingControlImpl();
		return tSettingControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSMV createTSMV() {
		TSMVImpl tsmv = new TSMVImpl();
		return tsmv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSMVSettings createTSMVSettings() {
		TSMVSettingsImpl tsmvSettings = new TSMVSettingsImpl();
		return tsmvSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSubEquipment createTSubEquipment() {
		TSubEquipmentImpl tSubEquipment = new TSubEquipmentImpl();
		return tSubEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSubFunction createTSubFunction() {
		TSubFunctionImpl tSubFunction = new TSubFunctionImpl();
		return tSubFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSubNetwork createTSubNetwork() {
		TSubNetworkImpl tSubNetwork = new TSubNetworkImpl();
		return tSubNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSubstation createTSubstation() {
		TSubstationImpl tSubstation = new TSubstationImpl();
		return tSubstation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTapChanger createTTapChanger() {
		TTapChangerImpl tTapChanger = new TTapChangerImpl();
		return tTapChanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTerminal createTTerminal() {
		TTerminalImpl tTerminal = new TTerminalImpl();
		return tTerminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TText createTText() {
		TTextImpl tText = new TTextImpl();
		return tText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTransformerWinding createTTransformerWinding() {
		TTransformerWindingImpl tTransformerWinding = new TTransformerWindingImpl();
		return tTransformerWinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTrgOps createTTrgOps() {
		TTrgOpsImpl tTrgOps = new TTrgOpsImpl();
		return tTrgOps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TVal createTVal() {
		TValImpl tVal = new TValImpl();
		return tVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TValueWithUnit createTValueWithUnit() {
		TValueWithUnitImpl tValueWithUnit = new TValueWithUnitImpl();
		return tValueWithUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TVoltage createTVoltage() {
		TVoltageImpl tVoltage = new TVoltageImpl();
		return tVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TVoltageLevel createTVoltageLevel() {
		TVoltageLevelImpl tVoltageLevel = new TVoltageLevelImpl();
		return tVoltageLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameStructureType createNameStructureTypeFromString(EDataType eDataType, String initialValue) {
		NameStructureType result = NameStructureType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameStructureTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAssociationKindEnum createTAssociationKindEnumFromString(EDataType eDataType, String initialValue) {
		TAssociationKindEnum result = TAssociationKindEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTAssociationKindEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAuthenticationEnum createTAuthenticationEnumFromString(EDataType eDataType, String initialValue) {
		TAuthenticationEnum result = TAuthenticationEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTAuthenticationEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDomainLNGroupAEnum createTDomainLNGroupAEnumFromString(EDataType eDataType, String initialValue) {
		TDomainLNGroupAEnum result = TDomainLNGroupAEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTDomainLNGroupAEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDomainLNGroupCEnum createTDomainLNGroupCEnumFromString(EDataType eDataType, String initialValue) {
		TDomainLNGroupCEnum result = TDomainLNGroupCEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTDomainLNGroupCEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDomainLNGroupGEnum createTDomainLNGroupGEnumFromString(EDataType eDataType, String initialValue) {
		TDomainLNGroupGEnum result = TDomainLNGroupGEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTDomainLNGroupGEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDomainLNGroupIEnum createTDomainLNGroupIEnumFromString(EDataType eDataType, String initialValue) {
		TDomainLNGroupIEnum result = TDomainLNGroupIEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTDomainLNGroupIEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDomainLNGroupMEnum createTDomainLNGroupMEnumFromString(EDataType eDataType, String initialValue) {
		TDomainLNGroupMEnum result = TDomainLNGroupMEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTDomainLNGroupMEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDomainLNGroupPEnum createTDomainLNGroupPEnumFromString(EDataType eDataType, String initialValue) {
		TDomainLNGroupPEnum result = TDomainLNGroupPEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTDomainLNGroupPEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDomainLNGroupREnum createTDomainLNGroupREnumFromString(EDataType eDataType, String initialValue) {
		TDomainLNGroupREnum result = TDomainLNGroupREnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTDomainLNGroupREnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDomainLNGroupSEnum createTDomainLNGroupSEnumFromString(EDataType eDataType, String initialValue) {
		TDomainLNGroupSEnum result = TDomainLNGroupSEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTDomainLNGroupSEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDomainLNGroupTEnum createTDomainLNGroupTEnumFromString(EDataType eDataType, String initialValue) {
		TDomainLNGroupTEnum result = TDomainLNGroupTEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTDomainLNGroupTEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDomainLNGroupXEnum createTDomainLNGroupXEnumFromString(EDataType eDataType, String initialValue) {
		TDomainLNGroupXEnum result = TDomainLNGroupXEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTDomainLNGroupXEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDomainLNGroupYEnum createTDomainLNGroupYEnumFromString(EDataType eDataType, String initialValue) {
		TDomainLNGroupYEnum result = TDomainLNGroupYEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTDomainLNGroupYEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDomainLNGroupZEnum createTDomainLNGroupZEnumFromString(EDataType eDataType, String initialValue) {
		TDomainLNGroupZEnum result = TDomainLNGroupZEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTDomainLNGroupZEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFCEnum createTFCEnumFromString(EDataType eDataType, String initialValue) {
		TFCEnum result = TFCEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTFCEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TGSEControlTypeEnum createTGSEControlTypeEnumFromString(EDataType eDataType, String initialValue) {
		TGSEControlTypeEnum result = TGSEControlTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTGSEControlTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLLN0Enum createTLLN0EnumFromString(EDataType eDataType, String initialValue) {
		TLLN0Enum result = TLLN0Enum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTLLN0EnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLPHDEnum createTLPHDEnumFromString(EDataType eDataType, String initialValue) {
		TLPHDEnum result = TLPHDEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTLPHDEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPhaseEnum createTPhaseEnumFromString(EDataType eDataType, String initialValue) {
		TPhaseEnum result = TPhaseEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTPhaseEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPowerTransformerEnum createTPowerTransformerEnumFromString(EDataType eDataType, String initialValue) {
		TPowerTransformerEnum result = TPowerTransformerEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTPowerTransformerEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPredefinedAttributeNameEnum createTPredefinedAttributeNameEnumFromString(EDataType eDataType, String initialValue) {
		TPredefinedAttributeNameEnum result = TPredefinedAttributeNameEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTPredefinedAttributeNameEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPredefinedBasicTypeEnum createTPredefinedBasicTypeEnumFromString(EDataType eDataType, String initialValue) {
		TPredefinedBasicTypeEnum result = TPredefinedBasicTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTPredefinedBasicTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPredefinedCDCEnum createTPredefinedCDCEnumFromString(EDataType eDataType, String initialValue) {
		TPredefinedCDCEnum result = TPredefinedCDCEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTPredefinedCDCEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPredefinedCommonConductingEquipmentEnum createTPredefinedCommonConductingEquipmentEnumFromString(EDataType eDataType, String initialValue) {
		TPredefinedCommonConductingEquipmentEnum result = TPredefinedCommonConductingEquipmentEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTPredefinedCommonConductingEquipmentEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPredefinedGeneralEquipmentEnum createTPredefinedGeneralEquipmentEnumFromString(EDataType eDataType, String initialValue) {
		TPredefinedGeneralEquipmentEnum result = TPredefinedGeneralEquipmentEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTPredefinedGeneralEquipmentEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPredefinedPTypeEnum createTPredefinedPTypeEnumFromString(EDataType eDataType, String initialValue) {
		TPredefinedPTypeEnum result = TPredefinedPTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTPredefinedPTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceFCEnum createTServiceFCEnumFromString(EDataType eDataType, String initialValue) {
		TServiceFCEnum result = TServiceFCEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTServiceFCEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceSettingsEnum createTServiceSettingsEnumFromString(EDataType eDataType, String initialValue) {
		TServiceSettingsEnum result = TServiceSettingsEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTServiceSettingsEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSIUnitEnum createTSIUnitEnumFromString(EDataType eDataType, String initialValue) {
		TSIUnitEnum result = TSIUnitEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTSIUnitEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTransformerWindingEnum createTTransformerWindingEnumFromString(EDataType eDataType, String initialValue) {
		TTransformerWindingEnum result = TTransformerWindingEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTTransformerWindingEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTrgOptControlEnum createTTrgOptControlEnumFromString(EDataType eDataType, String initialValue) {
		TTrgOptControlEnum result = TTrgOptControlEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTTrgOptControlEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTrgOptEnum createTTrgOptEnumFromString(EDataType eDataType, String initialValue) {
		TTrgOptEnum result = TTrgOptEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTTrgOptEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TUnitMultiplierEnum createTUnitMultiplierEnumFromString(EDataType eDataType, String initialValue) {
		TUnitMultiplierEnum result = TUnitMultiplierEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTUnitMultiplierEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TValKindEnum createTValKindEnumFromString(EDataType eDataType, String initialValue) {
		TValKindEnum result = TValKindEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTValKindEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameStructureType createNameStructureTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNameStructureTypeFromString(SclPackage.eINSTANCE.getNameStructureType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameStructureTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNameStructureTypeToString(SclPackage.eINSTANCE.getNameStructureType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createSmpRateTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSmpRateTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTAnyNameFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NORMALIZED_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTAnyNameToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NORMALIZED_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAssociationKindEnum createTAssociationKindEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTAssociationKindEnumFromString(SclPackage.eINSTANCE.getTAssociationKindEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTAssociationKindEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTAssociationKindEnumToString(SclPackage.eINSTANCE.getTAssociationKindEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createTAttributeNameEnumFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createTPredefinedAttributeNameEnumFromString(SclPackage.eINSTANCE.getTPredefinedAttributeNameEnum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTExtensionAttributeNameEnumFromString(SclPackage.eINSTANCE.getTExtensionAttributeNameEnum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTAttributeNameEnumToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (SclPackage.eINSTANCE.getTPredefinedAttributeNameEnum().isInstance(instanceValue)) {
			try {
				String value = convertTPredefinedAttributeNameEnumToString(SclPackage.eINSTANCE.getTPredefinedAttributeNameEnum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SclPackage.eINSTANCE.getTExtensionAttributeNameEnum().isInstance(instanceValue)) {
			try {
				String value = convertTExtensionAttributeNameEnumToString(SclPackage.eINSTANCE.getTExtensionAttributeNameEnum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAuthenticationEnum createTAuthenticationEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTAuthenticationEnumFromString(SclPackage.eINSTANCE.getTAuthenticationEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTAuthenticationEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTAuthenticationEnumToString(SclPackage.eINSTANCE.getTAuthenticationEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createTBasicTypeEnumFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createTPredefinedBasicTypeEnumFromString(SclPackage.eINSTANCE.getTPredefinedBasicTypeEnum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTExtensionBasicTypeEnumFromString(SclPackage.eINSTANCE.getTExtensionBasicTypeEnum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTBasicTypeEnumToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (SclPackage.eINSTANCE.getTPredefinedBasicTypeEnum().isInstance(instanceValue)) {
			try {
				String value = convertTPredefinedBasicTypeEnumToString(SclPackage.eINSTANCE.getTPredefinedBasicTypeEnum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SclPackage.eINSTANCE.getTExtensionBasicTypeEnum().isInstance(instanceValue)) {
			try {
				String value = convertTExtensionBasicTypeEnumToString(SclPackage.eINSTANCE.getTExtensionBasicTypeEnum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createTCDCEnumFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createTPredefinedCDCEnumFromString(SclPackage.eINSTANCE.getTPredefinedCDCEnum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTExtensionCDCEnumFromString(SclPackage.eINSTANCE.getTExtensionCDCEnum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTCDCEnumToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (SclPackage.eINSTANCE.getTPredefinedCDCEnum().isInstance(instanceValue)) {
			try {
				String value = convertTPredefinedCDCEnumToString(SclPackage.eINSTANCE.getTPredefinedCDCEnum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SclPackage.eINSTANCE.getTExtensionCDCEnum().isInstance(instanceValue)) {
			try {
				String value = convertTExtensionCDCEnumToString(SclPackage.eINSTANCE.getTExtensionCDCEnum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createTCommonConductingEquipmentEnumFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createTPredefinedCommonConductingEquipmentEnumFromString(SclPackage.eINSTANCE.getTPredefinedCommonConductingEquipmentEnum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTExtensionEquipmentEnumFromString(SclPackage.eINSTANCE.getTExtensionEquipmentEnum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTCommonConductingEquipmentEnumToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (SclPackage.eINSTANCE.getTPredefinedCommonConductingEquipmentEnum().isInstance(instanceValue)) {
			try {
				String value = convertTPredefinedCommonConductingEquipmentEnumToString(SclPackage.eINSTANCE.getTPredefinedCommonConductingEquipmentEnum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SclPackage.eINSTANCE.getTExtensionEquipmentEnum().isInstance(instanceValue)) {
			try {
				String value = convertTExtensionEquipmentEnumToString(SclPackage.eINSTANCE.getTExtensionEquipmentEnum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator createTDomainLNEnumFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Enumerator result = null;
		RuntimeException exception = null;
		try {
			result = (Enumerator)createTDomainLNGroupAEnumFromString(SclPackage.eINSTANCE.getTDomainLNGroupAEnum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (Enumerator)createTDomainLNGroupCEnumFromString(SclPackage.eINSTANCE.getTDomainLNGroupCEnum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (Enumerator)createTDomainLNGroupGEnumFromString(SclPackage.eINSTANCE.getTDomainLNGroupGEnum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (Enumerator)createTDomainLNGroupIEnumFromString(SclPackage.eINSTANCE.getTDomainLNGroupIEnum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (Enumerator)createTDomainLNGroupMEnumFromString(SclPackage.eINSTANCE.getTDomainLNGroupMEnum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (Enumerator)createTDomainLNGroupPEnumFromString(SclPackage.eINSTANCE.getTDomainLNGroupPEnum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (Enumerator)createTDomainLNGroupREnumFromString(SclPackage.eINSTANCE.getTDomainLNGroupREnum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (Enumerator)createTDomainLNGroupSEnumFromString(SclPackage.eINSTANCE.getTDomainLNGroupSEnum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (Enumerator)createTDomainLNGroupTEnumFromString(SclPackage.eINSTANCE.getTDomainLNGroupTEnum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (Enumerator)createTDomainLNGroupXEnumFromString(SclPackage.eINSTANCE.getTDomainLNGroupXEnum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (Enumerator)createTDomainLNGroupYEnumFromString(SclPackage.eINSTANCE.getTDomainLNGroupYEnum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (Enumerator)createTDomainLNGroupZEnumFromString(SclPackage.eINSTANCE.getTDomainLNGroupZEnum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTDomainLNEnumToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (SclPackage.eINSTANCE.getTDomainLNGroupAEnum().isInstance(instanceValue)) {
			try {
				String value = convertTDomainLNGroupAEnumToString(SclPackage.eINSTANCE.getTDomainLNGroupAEnum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SclPackage.eINSTANCE.getTDomainLNGroupCEnum().isInstance(instanceValue)) {
			try {
				String value = convertTDomainLNGroupCEnumToString(SclPackage.eINSTANCE.getTDomainLNGroupCEnum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SclPackage.eINSTANCE.getTDomainLNGroupGEnum().isInstance(instanceValue)) {
			try {
				String value = convertTDomainLNGroupGEnumToString(SclPackage.eINSTANCE.getTDomainLNGroupGEnum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SclPackage.eINSTANCE.getTDomainLNGroupIEnum().isInstance(instanceValue)) {
			try {
				String value = convertTDomainLNGroupIEnumToString(SclPackage.eINSTANCE.getTDomainLNGroupIEnum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SclPackage.eINSTANCE.getTDomainLNGroupMEnum().isInstance(instanceValue)) {
			try {
				String value = convertTDomainLNGroupMEnumToString(SclPackage.eINSTANCE.getTDomainLNGroupMEnum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SclPackage.eINSTANCE.getTDomainLNGroupPEnum().isInstance(instanceValue)) {
			try {
				String value = convertTDomainLNGroupPEnumToString(SclPackage.eINSTANCE.getTDomainLNGroupPEnum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SclPackage.eINSTANCE.getTDomainLNGroupREnum().isInstance(instanceValue)) {
			try {
				String value = convertTDomainLNGroupREnumToString(SclPackage.eINSTANCE.getTDomainLNGroupREnum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SclPackage.eINSTANCE.getTDomainLNGroupSEnum().isInstance(instanceValue)) {
			try {
				String value = convertTDomainLNGroupSEnumToString(SclPackage.eINSTANCE.getTDomainLNGroupSEnum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SclPackage.eINSTANCE.getTDomainLNGroupTEnum().isInstance(instanceValue)) {
			try {
				String value = convertTDomainLNGroupTEnumToString(SclPackage.eINSTANCE.getTDomainLNGroupTEnum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SclPackage.eINSTANCE.getTDomainLNGroupXEnum().isInstance(instanceValue)) {
			try {
				String value = convertTDomainLNGroupXEnumToString(SclPackage.eINSTANCE.getTDomainLNGroupXEnum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SclPackage.eINSTANCE.getTDomainLNGroupYEnum().isInstance(instanceValue)) {
			try {
				String value = convertTDomainLNGroupYEnumToString(SclPackage.eINSTANCE.getTDomainLNGroupYEnum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SclPackage.eINSTANCE.getTDomainLNGroupZEnum().isInstance(instanceValue)) {
			try {
				String value = convertTDomainLNGroupZEnumToString(SclPackage.eINSTANCE.getTDomainLNGroupZEnum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDomainLNGroupAEnum createTDomainLNGroupAEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTDomainLNGroupAEnumFromString(SclPackage.eINSTANCE.getTDomainLNGroupAEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTDomainLNGroupAEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTDomainLNGroupAEnumToString(SclPackage.eINSTANCE.getTDomainLNGroupAEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDomainLNGroupCEnum createTDomainLNGroupCEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTDomainLNGroupCEnumFromString(SclPackage.eINSTANCE.getTDomainLNGroupCEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTDomainLNGroupCEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTDomainLNGroupCEnumToString(SclPackage.eINSTANCE.getTDomainLNGroupCEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDomainLNGroupGEnum createTDomainLNGroupGEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTDomainLNGroupGEnumFromString(SclPackage.eINSTANCE.getTDomainLNGroupGEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTDomainLNGroupGEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTDomainLNGroupGEnumToString(SclPackage.eINSTANCE.getTDomainLNGroupGEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDomainLNGroupIEnum createTDomainLNGroupIEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTDomainLNGroupIEnumFromString(SclPackage.eINSTANCE.getTDomainLNGroupIEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTDomainLNGroupIEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTDomainLNGroupIEnumToString(SclPackage.eINSTANCE.getTDomainLNGroupIEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDomainLNGroupMEnum createTDomainLNGroupMEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTDomainLNGroupMEnumFromString(SclPackage.eINSTANCE.getTDomainLNGroupMEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTDomainLNGroupMEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTDomainLNGroupMEnumToString(SclPackage.eINSTANCE.getTDomainLNGroupMEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDomainLNGroupPEnum createTDomainLNGroupPEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTDomainLNGroupPEnumFromString(SclPackage.eINSTANCE.getTDomainLNGroupPEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTDomainLNGroupPEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTDomainLNGroupPEnumToString(SclPackage.eINSTANCE.getTDomainLNGroupPEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDomainLNGroupREnum createTDomainLNGroupREnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTDomainLNGroupREnumFromString(SclPackage.eINSTANCE.getTDomainLNGroupREnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTDomainLNGroupREnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTDomainLNGroupREnumToString(SclPackage.eINSTANCE.getTDomainLNGroupREnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDomainLNGroupSEnum createTDomainLNGroupSEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTDomainLNGroupSEnumFromString(SclPackage.eINSTANCE.getTDomainLNGroupSEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTDomainLNGroupSEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTDomainLNGroupSEnumToString(SclPackage.eINSTANCE.getTDomainLNGroupSEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDomainLNGroupTEnum createTDomainLNGroupTEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTDomainLNGroupTEnumFromString(SclPackage.eINSTANCE.getTDomainLNGroupTEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTDomainLNGroupTEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTDomainLNGroupTEnumToString(SclPackage.eINSTANCE.getTDomainLNGroupTEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDomainLNGroupXEnum createTDomainLNGroupXEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTDomainLNGroupXEnumFromString(SclPackage.eINSTANCE.getTDomainLNGroupXEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTDomainLNGroupXEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTDomainLNGroupXEnumToString(SclPackage.eINSTANCE.getTDomainLNGroupXEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDomainLNGroupYEnum createTDomainLNGroupYEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTDomainLNGroupYEnumFromString(SclPackage.eINSTANCE.getTDomainLNGroupYEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTDomainLNGroupYEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTDomainLNGroupYEnumToString(SclPackage.eINSTANCE.getTDomainLNGroupYEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDomainLNGroupZEnum createTDomainLNGroupZEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTDomainLNGroupZEnumFromString(SclPackage.eINSTANCE.getTDomainLNGroupZEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTDomainLNGroupZEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTDomainLNGroupZEnumToString(SclPackage.eINSTANCE.getTDomainLNGroupZEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createTEquipmentEnumFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createTPredefinedEquipmentEnumFromString(SclPackage.eINSTANCE.getTPredefinedEquipmentEnum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTExtensionEquipmentEnumFromString(SclPackage.eINSTANCE.getTExtensionEquipmentEnum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTEquipmentEnumToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (SclPackage.eINSTANCE.getTPredefinedEquipmentEnum().isInstance(instanceValue)) {
			try {
				String value = convertTPredefinedEquipmentEnumToString(SclPackage.eINSTANCE.getTPredefinedEquipmentEnum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SclPackage.eINSTANCE.getTExtensionEquipmentEnum().isInstance(instanceValue)) {
			try {
				String value = convertTExtensionEquipmentEnumToString(SclPackage.eINSTANCE.getTExtensionEquipmentEnum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTExtensionAttributeNameEnumFromString(EDataType eDataType, String initialValue) {
		return createTRestrName1stLFromString(SclPackage.eINSTANCE.getTRestrName1stL(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTExtensionAttributeNameEnumToString(EDataType eDataType, Object instanceValue) {
		return convertTRestrName1stLToString(SclPackage.eINSTANCE.getTRestrName1stL(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTExtensionBasicTypeEnumFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTExtensionBasicTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTExtensionCDCEnumFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTExtensionCDCEnumToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTExtensionEquipmentEnumFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTExtensionEquipmentEnumToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTExtensionGeneralEquipmentEnumFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTExtensionGeneralEquipmentEnumToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTExtensionLNClassEnumFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTExtensionLNClassEnumToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTExtensionPTypeEnumFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NORMALIZED_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTExtensionPTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NORMALIZED_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFCEnum createTFCEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTFCEnumFromString(SclPackage.eINSTANCE.getTFCEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTFCEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTFCEnumToString(SclPackage.eINSTANCE.getTFCEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createTGeneralEquipmentEnumFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createTPredefinedGeneralEquipmentEnumFromString(SclPackage.eINSTANCE.getTPredefinedGeneralEquipmentEnum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTExtensionGeneralEquipmentEnumFromString(SclPackage.eINSTANCE.getTExtensionGeneralEquipmentEnum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTGeneralEquipmentEnumToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (SclPackage.eINSTANCE.getTPredefinedGeneralEquipmentEnum().isInstance(instanceValue)) {
			try {
				String value = convertTPredefinedGeneralEquipmentEnumToString(SclPackage.eINSTANCE.getTPredefinedGeneralEquipmentEnum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SclPackage.eINSTANCE.getTExtensionGeneralEquipmentEnum().isInstance(instanceValue)) {
			try {
				String value = convertTExtensionGeneralEquipmentEnumToString(SclPackage.eINSTANCE.getTExtensionGeneralEquipmentEnum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TGSEControlTypeEnum createTGSEControlTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTGSEControlTypeEnumFromString(SclPackage.eINSTANCE.getTGSEControlTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTGSEControlTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTGSEControlTypeEnumToString(SclPackage.eINSTANCE.getTGSEControlTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLLN0Enum createTLLN0EnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTLLN0EnumFromString(SclPackage.eINSTANCE.getTLLN0Enum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTLLN0EnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTLLN0EnumToString(SclPackage.eINSTANCE.getTLLN0Enum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createTLNClassEnumFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createTPredefinedLNClassEnumFromString(SclPackage.eINSTANCE.getTPredefinedLNClassEnum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTExtensionLNClassEnumFromString(SclPackage.eINSTANCE.getTExtensionLNClassEnum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTLNClassEnumToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (SclPackage.eINSTANCE.getTPredefinedLNClassEnum().isInstance(instanceValue)) {
			try {
				String value = convertTPredefinedLNClassEnumToString(SclPackage.eINSTANCE.getTPredefinedLNClassEnum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SclPackage.eINSTANCE.getTExtensionLNClassEnum().isInstance(instanceValue)) {
			try {
				String value = convertTExtensionLNClassEnumToString(SclPackage.eINSTANCE.getTExtensionLNClassEnum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLPHDEnum createTLPHDEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTLPHDEnumFromString(SclPackage.eINSTANCE.getTLPHDEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTLPHDEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTLPHDEnumToString(SclPackage.eINSTANCE.getTLPHDEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTNameFromString(EDataType eDataType, String initialValue) {
		return createTAnyNameFromString(SclPackage.eINSTANCE.getTAnyName(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTNameToString(EDataType eDataType, Object instanceValue) {
		return convertTAnyNameToString(SclPackage.eINSTANCE.getTAnyName(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTPAddrFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NORMALIZED_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTPAddrToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NORMALIZED_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPhaseEnum createTPhaseEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTPhaseEnumFromString(SclPackage.eINSTANCE.getTPhaseEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTPhaseEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTPhaseEnumToString(SclPackage.eINSTANCE.getTPhaseEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPowerTransformerEnum createTPowerTransformerEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTPowerTransformerEnumFromString(SclPackage.eINSTANCE.getTPowerTransformerEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTPowerTransformerEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTPowerTransformerEnumToString(SclPackage.eINSTANCE.getTPowerTransformerEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPredefinedAttributeNameEnum createTPredefinedAttributeNameEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTPredefinedAttributeNameEnumFromString(SclPackage.eINSTANCE.getTPredefinedAttributeNameEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTPredefinedAttributeNameEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTPredefinedAttributeNameEnumToString(SclPackage.eINSTANCE.getTPredefinedAttributeNameEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPredefinedBasicTypeEnum createTPredefinedBasicTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTPredefinedBasicTypeEnumFromString(SclPackage.eINSTANCE.getTPredefinedBasicTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTPredefinedBasicTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTPredefinedBasicTypeEnumToString(SclPackage.eINSTANCE.getTPredefinedBasicTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPredefinedCDCEnum createTPredefinedCDCEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTPredefinedCDCEnumFromString(SclPackage.eINSTANCE.getTPredefinedCDCEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTPredefinedCDCEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTPredefinedCDCEnumToString(SclPackage.eINSTANCE.getTPredefinedCDCEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPredefinedCommonConductingEquipmentEnum createTPredefinedCommonConductingEquipmentEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTPredefinedCommonConductingEquipmentEnumFromString(SclPackage.eINSTANCE.getTPredefinedCommonConductingEquipmentEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTPredefinedCommonConductingEquipmentEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTPredefinedCommonConductingEquipmentEnumToString(SclPackage.eINSTANCE.getTPredefinedCommonConductingEquipmentEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createTPredefinedEquipmentEnumFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createTCommonConductingEquipmentEnumFromString(SclPackage.eINSTANCE.getTCommonConductingEquipmentEnum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTPowerTransformerEnumFromString(SclPackage.eINSTANCE.getTPowerTransformerEnum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTTransformerWindingEnumFromString(SclPackage.eINSTANCE.getTTransformerWindingEnum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTPredefinedEquipmentEnumToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (SclPackage.eINSTANCE.getTCommonConductingEquipmentEnum().isInstance(instanceValue)) {
			try {
				String value = convertTCommonConductingEquipmentEnumToString(SclPackage.eINSTANCE.getTCommonConductingEquipmentEnum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SclPackage.eINSTANCE.getTPowerTransformerEnum().isInstance(instanceValue)) {
			try {
				String value = convertTPowerTransformerEnumToString(SclPackage.eINSTANCE.getTPowerTransformerEnum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SclPackage.eINSTANCE.getTTransformerWindingEnum().isInstance(instanceValue)) {
			try {
				String value = convertTTransformerWindingEnumToString(SclPackage.eINSTANCE.getTTransformerWindingEnum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPredefinedGeneralEquipmentEnum createTPredefinedGeneralEquipmentEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTPredefinedGeneralEquipmentEnumFromString(SclPackage.eINSTANCE.getTPredefinedGeneralEquipmentEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTPredefinedGeneralEquipmentEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTPredefinedGeneralEquipmentEnumToString(SclPackage.eINSTANCE.getTPredefinedGeneralEquipmentEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator createTPredefinedLNClassEnumFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Enumerator result = null;
		RuntimeException exception = null;
		try {
			result = (Enumerator)createTLPHDEnumFromString(SclPackage.eINSTANCE.getTLPHDEnum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (Enumerator)createTLLN0EnumFromString(SclPackage.eINSTANCE.getTLLN0Enum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTDomainLNEnumFromString(SclPackage.eINSTANCE.getTDomainLNEnum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTPredefinedLNClassEnumToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (SclPackage.eINSTANCE.getTLPHDEnum().isInstance(instanceValue)) {
			try {
				String value = convertTLPHDEnumToString(SclPackage.eINSTANCE.getTLPHDEnum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SclPackage.eINSTANCE.getTLLN0Enum().isInstance(instanceValue)) {
			try {
				String value = convertTLLN0EnumToString(SclPackage.eINSTANCE.getTLLN0Enum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SclPackage.eINSTANCE.getTDomainLNEnum().isInstance(instanceValue)) {
			try {
				String value = convertTDomainLNEnumToString(SclPackage.eINSTANCE.getTDomainLNEnum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPredefinedPTypeEnum createTPredefinedPTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTPredefinedPTypeEnumFromString(SclPackage.eINSTANCE.getTPredefinedPTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTPredefinedPTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTPredefinedPTypeEnumToString(SclPackage.eINSTANCE.getTPredefinedPTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createTPTypeEnumFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createTPredefinedPTypeEnumFromString(SclPackage.eINSTANCE.getTPredefinedPTypeEnum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTExtensionPTypeEnumFromString(SclPackage.eINSTANCE.getTExtensionPTypeEnum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTPTypeEnumToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (SclPackage.eINSTANCE.getTPredefinedPTypeEnum().isInstance(instanceValue)) {
			try {
				String value = convertTPredefinedPTypeEnumToString(SclPackage.eINSTANCE.getTPredefinedPTypeEnum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SclPackage.eINSTANCE.getTExtensionPTypeEnum().isInstance(instanceValue)) {
			try {
				String value = convertTExtensionPTypeEnumToString(SclPackage.eINSTANCE.getTExtensionPTypeEnum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTRefFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NORMALIZED_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTRefToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NORMALIZED_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTRestrLdNameFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTRestrLdNameToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTRestrNameFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTRestrNameToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTRestrName1stLFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTRestrName1stLToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTRestrName1stUFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTRestrName1stUToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceFCEnum createTServiceFCEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTServiceFCEnumFromString(SclPackage.eINSTANCE.getTServiceFCEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTServiceFCEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTServiceFCEnumToString(SclPackage.eINSTANCE.getTServiceFCEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceSettingsEnum createTServiceSettingsEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTServiceSettingsEnumFromString(SclPackage.eINSTANCE.getTServiceSettingsEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTServiceSettingsEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTServiceSettingsEnumToString(SclPackage.eINSTANCE.getTServiceSettingsEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSIUnitEnum createTSIUnitEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTSIUnitEnumFromString(SclPackage.eINSTANCE.getTSIUnitEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTSIUnitEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTSIUnitEnumToString(SclPackage.eINSTANCE.getTSIUnitEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTransformerWindingEnum createTTransformerWindingEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTTransformerWindingEnumFromString(SclPackage.eINSTANCE.getTTransformerWindingEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTTransformerWindingEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTTransformerWindingEnumToString(SclPackage.eINSTANCE.getTTransformerWindingEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTrgOptControlEnum createTTrgOptControlEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTTrgOptControlEnumFromString(SclPackage.eINSTANCE.getTTrgOptControlEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTTrgOptControlEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTTrgOptControlEnumToString(SclPackage.eINSTANCE.getTTrgOptControlEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTrgOptEnum createTTrgOptEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTTrgOptEnumFromString(SclPackage.eINSTANCE.getTTrgOptEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTTrgOptEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTTrgOptEnumToString(SclPackage.eINSTANCE.getTTrgOptEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TUnitMultiplierEnum createTUnitMultiplierEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTUnitMultiplierEnumFromString(SclPackage.eINSTANCE.getTUnitMultiplierEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTUnitMultiplierEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTUnitMultiplierEnumToString(SclPackage.eINSTANCE.getTUnitMultiplierEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TValKindEnum createTValKindEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTValKindEnumFromString(SclPackage.eINSTANCE.getTValKindEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTValKindEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTValKindEnumToString(SclPackage.eINSTANCE.getTValKindEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SclPackage getSclPackage() {
		return (SclPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SclPackage getPackage() {
		return SclPackage.eINSTANCE;
	}

} //SclFactoryImpl
