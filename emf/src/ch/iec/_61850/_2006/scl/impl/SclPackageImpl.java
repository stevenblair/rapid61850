/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.sc.lcoordinates.LcoordinatesPackage;

import ch.iec._61850._2006.sc.lcoordinates.impl.LcoordinatesPackageImpl;

import ch.iec._61850._2006.sc.lmaintenance.LmaintenancePackage;

import ch.iec._61850._2006.sc.lmaintenance.impl.LmaintenancePackageImpl;

import ch.iec._61850._2006.scl.SclFactory;
import ch.iec._61850._2006.scl.SclPackage;

import ch.iec._61850._2006.scl.util.SclValidator;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SclPackageImpl extends EPackageImpl implements SclPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "scl.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ln0TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optFieldsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sclTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass settingGroupsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smvOptsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tAbstractConductingEquipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tAbstractDataAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tAccessControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tAccessPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tAddressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tAnyContentFromOtherNamespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tAnyLNEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tBaseElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tBayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tbdaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tBitRateInMbPerSecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tClientLNEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tClientServicesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tCommunicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tConductingEquipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tConfLNsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tConnectedAPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tConnectivityNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tControlBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tControlWithIEDNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tControlWithTriggerOptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tdaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tdaiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tDataSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tDataTypeTemplatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tdaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tdoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tdoiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tdoTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tDurationInMilliSecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tDurationInSecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tEnumTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tEnumValEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tEquipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tEquipmentContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tExtRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tfccbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tfcdaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tGeneralEquipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tgseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tgseControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tgseSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tHitemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tidNamingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tiedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tInputsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tlDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tlnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tln0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tlNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tlNodeContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tlNodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tLogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tLogControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tLogSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tNamingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tpappidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tPhysConnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tpipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tpipgatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tpipsubnetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tpmacAddressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tposiaeInvokeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tposiaeQualifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tposiapInvokeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tposiapTitleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tposinsapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tposipselEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tposisselEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tpositselEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tPowerSystemResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tPowerTransformerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tPrivateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tpvlanidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tpvlanpriorityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tReportControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tReportSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tRptEnabledEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tSampledValueControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tsclControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tsdiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tsdoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tServicesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tServiceSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tServiceWithMaxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tServiceWithMaxAndMaxAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tServiceWithMaxAndMaxAttributesAndModifyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tServiceWithMaxAndModifyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tServiceYesNoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tSettingControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tsmvEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tsmvSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tSubEquipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tSubFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tSubNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tSubstationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tTapChangerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tTerminalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tTransformerWindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tTrgOpsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tUnNamingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tValEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tValueWithUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tVoltageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tVoltageLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nameStructureTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tAssociationKindEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tAuthenticationEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tDomainLNGroupAEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tDomainLNGroupCEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tDomainLNGroupGEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tDomainLNGroupIEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tDomainLNGroupMEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tDomainLNGroupPEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tDomainLNGroupREnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tDomainLNGroupSEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tDomainLNGroupTEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tDomainLNGroupXEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tDomainLNGroupYEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tDomainLNGroupZEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tfcEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tgseControlTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tlln0EnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tlphdEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tPhaseEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tPowerTransformerEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tPredefinedAttributeNameEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tPredefinedBasicTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tPredefinedCDCEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tPredefinedCommonConductingEquipmentEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tPredefinedGeneralEquipmentEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tPredefinedPTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tServiceFCEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tServiceSettingsEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tsiUnitEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tTransformerWindingEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tTrgOptControlEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tTrgOptEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tUnitMultiplierEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tValKindEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nameStructureTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType smpRateTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tAnyNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tAssociationKindEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tAttributeNameEnumEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tAuthenticationEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tBasicTypeEnumEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tcdcEnumEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tCommonConductingEquipmentEnumEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tDomainLNEnumEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tDomainLNGroupAEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tDomainLNGroupCEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tDomainLNGroupGEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tDomainLNGroupIEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tDomainLNGroupMEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tDomainLNGroupPEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tDomainLNGroupREnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tDomainLNGroupSEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tDomainLNGroupTEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tDomainLNGroupXEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tDomainLNGroupYEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tDomainLNGroupZEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tEquipmentEnumEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tExtensionAttributeNameEnumEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tExtensionBasicTypeEnumEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tExtensionCDCEnumEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tExtensionEquipmentEnumEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tExtensionGeneralEquipmentEnumEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tExtensionLNClassEnumEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tExtensionPTypeEnumEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tfcEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tGeneralEquipmentEnumEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tgseControlTypeEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tlln0EnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tlnClassEnumEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tlphdEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tpAddrEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tPhaseEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tPowerTransformerEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tPredefinedAttributeNameEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tPredefinedBasicTypeEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tPredefinedCDCEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tPredefinedCommonConductingEquipmentEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tPredefinedEquipmentEnumEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tPredefinedGeneralEquipmentEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tPredefinedLNClassEnumEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tPredefinedPTypeEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tpTypeEnumEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tRefEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tRestrLdNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tRestrNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tRestrName1stLEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tRestrName1stUEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tServiceFCEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tServiceSettingsEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tsiUnitEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tTransformerWindingEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tTrgOptControlEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tTrgOptEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tUnitMultiplierEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tValKindEnumObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ch.iec._61850._2006.scl.SclPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SclPackageImpl() {
		super(eNS_URI, SclFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SclPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static SclPackage init() {
		if (isInited) return (SclPackage)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI);

		// Obtain or create and register package
		SclPackageImpl theSclPackage = (SclPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SclPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SclPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		LcoordinatesPackageImpl theLcoordinatesPackage = (LcoordinatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LcoordinatesPackage.eNS_URI) instanceof LcoordinatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LcoordinatesPackage.eNS_URI) : LcoordinatesPackage.eINSTANCE);
		LmaintenancePackageImpl theLmaintenancePackage = (LmaintenancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LmaintenancePackage.eNS_URI) instanceof LmaintenancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LmaintenancePackage.eNS_URI) : LmaintenancePackage.eINSTANCE);

		// Load packages
		theSclPackage.loadPackage();

		// Create package meta-data objects
		theLcoordinatesPackage.createPackageContents();
		theLmaintenancePackage.createPackageContents();

		// Initialize created meta-data
		theLcoordinatesPackage.initializePackageContents();
		theLmaintenancePackage.initializePackageContents();

		// Fix loaded packages
		theSclPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSclPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return SclValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSclPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SclPackage.eNS_URI, theSclPackage);
		return theSclPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthenticationType() {
		if (authenticationTypeEClass == null) {
			authenticationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(0);
		}
		return authenticationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticationType_Certificate() {
        return (EAttribute)getAuthenticationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticationType_None() {
        return (EAttribute)getAuthenticationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticationType_Password() {
        return (EAttribute)getAuthenticationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticationType_Strong() {
        return (EAttribute)getAuthenticationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticationType_Weak() {
        return (EAttribute)getAuthenticationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(1);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Communication() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DataTypeTemplates() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IED() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LN() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LN0() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SCL() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Substation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryType() {
		if (historyTypeEClass == null) {
			historyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(2);
		}
		return historyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistoryType_Hitem() {
        return (EReference)getHistoryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLN0Type() {
		if (ln0TypeEClass == null) {
			ln0TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(3);
		}
		return ln0TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptFieldsType() {
		if (optFieldsTypeEClass == null) {
			optFieldsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(6);
		}
		return optFieldsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptFieldsType_BufOvfl() {
        return (EAttribute)getOptFieldsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptFieldsType_ConfigRef() {
        return (EAttribute)getOptFieldsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptFieldsType_DataRef() {
        return (EAttribute)getOptFieldsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptFieldsType_DataSet() {
        return (EAttribute)getOptFieldsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptFieldsType_EntryID() {
        return (EAttribute)getOptFieldsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptFieldsType_ReasonCode() {
        return (EAttribute)getOptFieldsType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptFieldsType_SeqNum() {
        return (EAttribute)getOptFieldsType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptFieldsType_TimeStamp() {
        return (EAttribute)getOptFieldsType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSCLType() {
		if (sclTypeEClass == null) {
			sclTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(7);
		}
		return sclTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSCLType_Header() {
        return (EReference)getSCLType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSCLType_Substation() {
        return (EReference)getSCLType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSCLType_Communication() {
        return (EReference)getSCLType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSCLType_IED() {
        return (EReference)getSCLType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSCLType_DataTypeTemplates() {
        return (EReference)getSCLType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSettingGroupsType() {
		if (settingGroupsTypeEClass == null) {
			settingGroupsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(8);
		}
		return settingGroupsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSettingGroupsType_SGEdit() {
        return (EReference)getSettingGroupsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSettingGroupsType_ConfSG() {
        return (EReference)getSettingGroupsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmvOptsType() {
		if (smvOptsTypeEClass == null) {
			smvOptsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(10);
		}
		return smvOptsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmvOptsType_DataSet() {
        return (EAttribute)getSmvOptsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmvOptsType_RefreshTime() {
        return (EAttribute)getSmvOptsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmvOptsType_SampleRate() {
        return (EAttribute)getSmvOptsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmvOptsType_SampleSynchronized() {
        return (EAttribute)getSmvOptsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmvOptsType_Security() {
        return (EAttribute)getSmvOptsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTAbstractConductingEquipment() {
		if (tAbstractConductingEquipmentEClass == null) {
			tAbstractConductingEquipmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(11);
		}
		return tAbstractConductingEquipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTAbstractConductingEquipment_Terminal() {
        return (EReference)getTAbstractConductingEquipment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTAbstractConductingEquipment_SubEquipment() {
        return (EReference)getTAbstractConductingEquipment().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTAbstractDataAttribute() {
		if (tAbstractDataAttributeEClass == null) {
			tAbstractDataAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(12);
		}
		return tAbstractDataAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTAbstractDataAttribute_Val() {
        return (EReference)getTAbstractDataAttribute().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTAbstractDataAttribute_BType() {
        return (EAttribute)getTAbstractDataAttribute().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTAbstractDataAttribute_Count() {
        return (EAttribute)getTAbstractDataAttribute().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTAbstractDataAttribute_Name() {
        return (EAttribute)getTAbstractDataAttribute().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTAbstractDataAttribute_SAddr() {
        return (EAttribute)getTAbstractDataAttribute().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTAbstractDataAttribute_Type() {
        return (EAttribute)getTAbstractDataAttribute().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTAbstractDataAttribute_ValKind() {
        return (EAttribute)getTAbstractDataAttribute().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTAbstractDataAttribute_PrintedType() {
        return (EAttribute)getTAbstractDataAttribute().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTAbstractDataAttribute_CoderType() {
        return (EAttribute)getTAbstractDataAttribute().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTAccessControl() {
		if (tAccessControlEClass == null) {
			tAccessControlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(13);
		}
		return tAccessControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTAccessPoint() {
		if (tAccessPointEClass == null) {
			tAccessPointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(14);
		}
		return tAccessPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTAccessPoint_Server() {
        return (EReference)getTAccessPoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTAccessPoint_LN() {
        return (EReference)getTAccessPoint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTAccessPoint_Clock() {
        return (EAttribute)getTAccessPoint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTAccessPoint_Router() {
        return (EAttribute)getTAccessPoint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTAddress() {
		if (tAddressEClass == null) {
			tAddressEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(15);
		}
		return tAddressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTAddress_P() {
        return (EReference)getTAddress().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTAnyContentFromOtherNamespace() {
		if (tAnyContentFromOtherNamespaceEClass == null) {
			tAnyContentFromOtherNamespaceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(16);
		}
		return tAnyContentFromOtherNamespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTAnyContentFromOtherNamespace_Mixed() {
        return (EAttribute)getTAnyContentFromOtherNamespace().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTAnyContentFromOtherNamespace_Group() {
        return (EAttribute)getTAnyContentFromOtherNamespace().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTAnyContentFromOtherNamespace_Any() {
        return (EAttribute)getTAnyContentFromOtherNamespace().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTAnyContentFromOtherNamespace_AnyAttribute() {
        return (EAttribute)getTAnyContentFromOtherNamespace().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTAnyLN() {
		if (tAnyLNEClass == null) {
			tAnyLNEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(17);
		}
		return tAnyLNEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTAnyLN_DataSet() {
        return (EReference)getTAnyLN().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTAnyLN_ReportControl() {
        return (EReference)getTAnyLN().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTAnyLN_LogControl() {
        return (EReference)getTAnyLN().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTAnyLN_DOI() {
        return (EReference)getTAnyLN().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTAnyLN_Inputs() {
        return (EReference)getTAnyLN().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTAnyLN_LnType() {
        return (EAttribute)getTAnyLN().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTAssociation() {
		if (tAssociationEClass == null) {
			tAssociationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(19);
		}
		return tAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTAssociation_AssociationID() {
        return (EAttribute)getTAssociation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTAssociation_IedName() {
        return (EAttribute)getTAssociation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTAssociation_Kind() {
        return (EAttribute)getTAssociation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTAssociation_LdInst() {
        return (EAttribute)getTAssociation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTAssociation_LnClass() {
        return (EAttribute)getTAssociation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTAssociation_LnInst() {
        return (EAttribute)getTAssociation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTAssociation_Prefix() {
        return (EAttribute)getTAssociation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTBaseElement() {
		if (tBaseElementEClass == null) {
			tBaseElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(25);
		}
		return tBaseElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTBaseElement_Any() {
        return (EAttribute)getTBaseElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTBaseElement_Text() {
        return (EReference)getTBaseElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTBaseElement_Private() {
        return (EReference)getTBaseElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTBaseElement_AnyAttribute() {
        return (EAttribute)getTBaseElement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTBay() {
		if (tBayEClass == null) {
			tBayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(27);
		}
		return tBayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTBay_ConductingEquipment() {
        return (EReference)getTBay().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTBay_ConnectivityNode() {
        return (EReference)getTBay().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTBDA() {
		if (tbdaEClass == null) {
			tbdaEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(28);
		}
		return tbdaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTBitRateInMbPerSec() {
		if (tBitRateInMbPerSecEClass == null) {
			tBitRateInMbPerSecEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(29);
		}
		return tBitRateInMbPerSecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTClientLN() {
		if (tClientLNEClass == null) {
			tClientLNEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(31);
		}
		return tClientLNEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTClientLN_IedName() {
        return (EAttribute)getTClientLN().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTClientLN_LdInst() {
        return (EAttribute)getTClientLN().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTClientLN_LnClass() {
        return (EAttribute)getTClientLN().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTClientLN_LnInst() {
        return (EAttribute)getTClientLN().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTClientLN_Prefix() {
        return (EAttribute)getTClientLN().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTClientServices() {
		if (tClientServicesEClass == null) {
			tClientServicesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(32);
		}
		return tClientServicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTClientServices_BufReport() {
        return (EAttribute)getTClientServices().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTClientServices_Goose() {
        return (EAttribute)getTClientServices().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTClientServices_Gsse() {
        return (EAttribute)getTClientServices().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTClientServices_ReadLog() {
        return (EAttribute)getTClientServices().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTClientServices_UnbufReport() {
        return (EAttribute)getTClientServices().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCommunication() {
		if (tCommunicationEClass == null) {
			tCommunicationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(34);
		}
		return tCommunicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCommunication_SubNetwork() {
        return (EReference)getTCommunication().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTConductingEquipment() {
		if (tConductingEquipmentEClass == null) {
			tConductingEquipmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(35);
		}
		return tConductingEquipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTConductingEquipment_Type() {
        return (EAttribute)getTConductingEquipment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTConfLNs() {
		if (tConfLNsEClass == null) {
			tConfLNsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(36);
		}
		return tConfLNsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTConfLNs_FixLnInst() {
        return (EAttribute)getTConfLNs().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTConfLNs_FixPrefix() {
        return (EAttribute)getTConfLNs().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTConnectedAP() {
		if (tConnectedAPEClass == null) {
			tConnectedAPEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(37);
		}
		return tConnectedAPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTConnectedAP_Address() {
        return (EReference)getTConnectedAP().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTConnectedAP_GSE() {
        return (EReference)getTConnectedAP().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTConnectedAP_SMV() {
        return (EReference)getTConnectedAP().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTConnectedAP_PhysConn() {
        return (EReference)getTConnectedAP().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTConnectedAP_ApName() {
        return (EAttribute)getTConnectedAP().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTConnectedAP_IedName() {
        return (EAttribute)getTConnectedAP().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTConnectivityNode() {
		if (tConnectivityNodeEClass == null) {
			tConnectivityNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(38);
		}
		return tConnectivityNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTConnectivityNode_PathName() {
        return (EAttribute)getTConnectivityNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTControl() {
		if (tControlEClass == null) {
			tControlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(39);
		}
		return tControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTControl_DatSet() {
        return (EAttribute)getTControl().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTControl_ControlBlock() {
        return (EReference)getTControl().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTControl_DataSetRef() {
        return (EReference)getTControl().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTControlBlock() {
		if (tControlBlockEClass == null) {
			tControlBlockEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(40);
		}
		return tControlBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTControlBlock_Address() {
        return (EReference)getTControlBlock().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTControlBlock_CbName() {
        return (EAttribute)getTControlBlock().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTControlBlock_LdInst() {
        return (EAttribute)getTControlBlock().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTControlBlock_Control() {
        return (EReference)getTControlBlock().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTControlWithIEDName() {
		if (tControlWithIEDNameEClass == null) {
			tControlWithIEDNameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(41);
		}
		return tControlWithIEDNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTControlWithIEDName_IEDName() {
        return (EAttribute)getTControlWithIEDName().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTControlWithIEDName_ConfRev() {
        return (EAttribute)getTControlWithIEDName().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTControlWithTriggerOpt() {
		if (tControlWithTriggerOptEClass == null) {
			tControlWithTriggerOptEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(42);
		}
		return tControlWithTriggerOptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTControlWithTriggerOpt_TrgOps() {
        return (EReference)getTControlWithTriggerOpt().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTControlWithTriggerOpt_IntgPd() {
        return (EAttribute)getTControlWithTriggerOpt().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTDA() {
		if (tdaEClass == null) {
			tdaEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(43);
		}
		return tdaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDA_Dchg() {
        return (EAttribute)getTDA().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDA_Dupd() {
        return (EAttribute)getTDA().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDA_Fc() {
        return (EAttribute)getTDA().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDA_Qchg() {
        return (EAttribute)getTDA().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTDAI() {
		if (tdaiEClass == null) {
			tdaiEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(44);
		}
		return tdaiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTDAI_Val() {
        return (EReference)getTDAI().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDAI_Ix() {
        return (EAttribute)getTDAI().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDAI_Name() {
        return (EAttribute)getTDAI().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDAI_SAddr() {
        return (EAttribute)getTDAI().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDAI_ValKind() {
        return (EAttribute)getTDAI().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTDataSet() {
		if (tDataSetEClass == null) {
			tDataSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(45);
		}
		return tDataSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDataSet_Group() {
        return (EAttribute)getTDataSet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTDataSet_FCDA() {
        return (EReference)getTDataSet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTDataSet_FCCB() {
        return (EReference)getTDataSet().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTDataSet_Control() {
        return (EReference)getTDataSet().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTDataSet_ExtRef() {
        return (EReference)getTDataSet().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTDataTypeTemplates() {
		if (tDataTypeTemplatesEClass == null) {
			tDataTypeTemplatesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(46);
		}
		return tDataTypeTemplatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTDataTypeTemplates_LNodeType() {
        return (EReference)getTDataTypeTemplates().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTDataTypeTemplates_DOType() {
        return (EReference)getTDataTypeTemplates().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTDataTypeTemplates_DAType() {
        return (EReference)getTDataTypeTemplates().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTDataTypeTemplates_EnumType() {
        return (EReference)getTDataTypeTemplates().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTDAType() {
		if (tdaTypeEClass == null) {
			tdaTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(47);
		}
		return tdaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTDAType_BDA() {
        return (EReference)getTDAType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDAType_IedType() {
        return (EAttribute)getTDAType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTDAType_ExtRef() {
        return (EReference)getTDAType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTDAType_Fcda() {
        return (EReference)getTDAType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTDO() {
		if (tdoEClass == null) {
			tdoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(48);
		}
		return tdoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDO_AccessControl() {
        return (EAttribute)getTDO().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDO_Name() {
        return (EAttribute)getTDO().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDO_Transient() {
        return (EAttribute)getTDO().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDO_Type() {
        return (EAttribute)getTDO().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTDOI() {
		if (tdoiEClass == null) {
			tdoiEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(49);
		}
		return tdoiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDOI_Group() {
        return (EAttribute)getTDOI().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTDOI_SDI() {
        return (EReference)getTDOI().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTDOI_DAI() {
        return (EReference)getTDOI().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDOI_AccessControl() {
        return (EAttribute)getTDOI().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDOI_Ix() {
        return (EAttribute)getTDOI().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDOI_Name() {
        return (EAttribute)getTDOI().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTDOType() {
		if (tdoTypeEClass == null) {
			tdoTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(75);
		}
		return tdoTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDOType_Group() {
        return (EAttribute)getTDOType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTDOType_SDO() {
        return (EReference)getTDOType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTDOType_DA() {
        return (EReference)getTDOType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDOType_Cdc() {
        return (EAttribute)getTDOType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDOType_IedType() {
        return (EAttribute)getTDOType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTDOType_ExtRef() {
        return (EReference)getTDOType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTDOType_Fcda() {
        return (EReference)getTDOType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTDurationInMilliSec() {
		if (tDurationInMilliSecEClass == null) {
			tDurationInMilliSecEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(76);
		}
		return tDurationInMilliSecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTDurationInSec() {
		if (tDurationInSecEClass == null) {
			tDurationInSecEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(77);
		}
		return tDurationInSecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTEnumType() {
		if (tEnumTypeEClass == null) {
			tEnumTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(78);
		}
		return tEnumTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTEnumType_EnumVal() {
        return (EReference)getTEnumType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTEnumVal() {
		if (tEnumValEClass == null) {
			tEnumValEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(79);
		}
		return tEnumValEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTEnumVal_Value() {
        return (EAttribute)getTEnumVal().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTEnumVal_Ord() {
        return (EAttribute)getTEnumVal().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTEquipment() {
		if (tEquipmentEClass == null) {
			tEquipmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(80);
		}
		return tEquipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTEquipment_Virtual() {
        return (EAttribute)getTEquipment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTEquipmentContainer() {
		if (tEquipmentContainerEClass == null) {
			tEquipmentContainerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(81);
		}
		return tEquipmentContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTEquipmentContainer_PowerTransformer() {
        return (EReference)getTEquipmentContainer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTEquipmentContainer_GeneralEquipment() {
        return (EReference)getTEquipmentContainer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTExtRef() {
		if (tExtRefEClass == null) {
			tExtRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(90);
		}
		return tExtRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTExtRef_DaName() {
        return (EAttribute)getTExtRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTExtRef_DoName() {
        return (EAttribute)getTExtRef().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTExtRef_IedName() {
        return (EAttribute)getTExtRef().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTExtRef_IntAddr() {
        return (EAttribute)getTExtRef().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTExtRef_LdInst() {
        return (EAttribute)getTExtRef().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTExtRef_LnClass() {
        return (EAttribute)getTExtRef().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTExtRef_LnInst() {
        return (EAttribute)getTExtRef().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTExtRef_Prefix() {
        return (EAttribute)getTExtRef().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTExtRef_DataSet() {
        return (EReference)getTExtRef().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTExtRef_DoType() {
        return (EReference)getTExtRef().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTExtRef_DaType() {
        return (EReference)getTExtRef().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTFCCB() {
		if (tfccbEClass == null) {
			tfccbEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(91);
		}
		return tfccbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTFCCB_CbName() {
        return (EAttribute)getTFCCB().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTFCCB_DaName() {
        return (EAttribute)getTFCCB().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTFCCB_Fc() {
        return (EAttribute)getTFCCB().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTFCCB_LdInst() {
        return (EAttribute)getTFCCB().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTFCCB_LnClass() {
        return (EAttribute)getTFCCB().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTFCCB_LnInst() {
        return (EAttribute)getTFCCB().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTFCCB_Prefix() {
        return (EAttribute)getTFCCB().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTFCDA() {
		if (tfcdaEClass == null) {
			tfcdaEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(92);
		}
		return tfcdaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTFCDA_DaName() {
        return (EAttribute)getTFCDA().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTFCDA_DoName() {
        return (EAttribute)getTFCDA().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTFCDA_Fc() {
        return (EAttribute)getTFCDA().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTFCDA_LdInst() {
        return (EAttribute)getTFCDA().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTFCDA_LnClass() {
        return (EAttribute)getTFCDA().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTFCDA_LnInst() {
        return (EAttribute)getTFCDA().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTFCDA_Prefix() {
        return (EAttribute)getTFCDA().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTFCDA_DoType() {
        return (EReference)getTFCDA().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTFCDA_DaType() {
        return (EReference)getTFCDA().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTFCDA_PrintedType() {
        return (EAttribute)getTFCDA().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTFCDA_BType() {
        return (EAttribute)getTFCDA().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTFCDA_CoderType() {
        return (EAttribute)getTFCDA().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTFCDA_VariableName() {
        return (EAttribute)getTFCDA().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTFCDA_LnRef() {
        return (EReference)getTFCDA().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTFunction() {
		if (tFunctionEClass == null) {
			tFunctionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(95);
		}
		return tFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTFunction_SubFunction() {
        return (EReference)getTFunction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTFunction_GeneralEquipment() {
        return (EReference)getTFunction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTGeneralEquipment() {
		if (tGeneralEquipmentEClass == null) {
			tGeneralEquipmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(96);
		}
		return tGeneralEquipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTGeneralEquipment_Type() {
        return (EAttribute)getTGeneralEquipment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTGSE() {
		if (tgseEClass == null) {
			tgseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(98);
		}
		return tgseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTGSE_MinTime() {
        return (EReference)getTGSE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTGSE_MaxTime() {
        return (EReference)getTGSE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTGSEControl() {
		if (tgseControlEClass == null) {
			tgseControlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(99);
		}
		return tgseControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTGSEControl_AppID() {
        return (EAttribute)getTGSEControl().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTGSEControl_Type() {
        return (EAttribute)getTGSEControl().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTGSESettings() {
		if (tgseSettingsEClass == null) {
			tgseSettingsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(102);
		}
		return tgseSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTGSESettings_AppID() {
        return (EAttribute)getTGSESettings().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTGSESettings_DataLabel() {
        return (EAttribute)getTGSESettings().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTHeader() {
		if (tHeaderEClass == null) {
			tHeaderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(103);
		}
		return tHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTHeader_Text() {
        return (EReference)getTHeader().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTHeader_History() {
        return (EReference)getTHeader().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTHeader_Id() {
        return (EAttribute)getTHeader().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTHeader_NameStructure() {
        return (EAttribute)getTHeader().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTHeader_Revision() {
        return (EAttribute)getTHeader().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTHeader_ToolID() {
        return (EAttribute)getTHeader().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTHeader_Version() {
        return (EAttribute)getTHeader().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTHitem() {
		if (tHitemEClass == null) {
			tHitemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(104);
		}
		return tHitemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTHitem_Revision() {
        return (EAttribute)getTHitem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTHitem_Version() {
        return (EAttribute)getTHitem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTHitem_What() {
        return (EAttribute)getTHitem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTHitem_When() {
        return (EAttribute)getTHitem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTHitem_Who() {
        return (EAttribute)getTHitem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTHitem_Why() {
        return (EAttribute)getTHitem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTIDNaming() {
		if (tidNamingEClass == null) {
			tidNamingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(105);
		}
		return tidNamingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTIDNaming_Desc() {
        return (EAttribute)getTIDNaming().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTIDNaming_Id() {
        return (EAttribute)getTIDNaming().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTIED() {
		if (tiedEClass == null) {
			tiedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(106);
		}
		return tiedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTIED_Services() {
        return (EReference)getTIED().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTIED_AccessPoint() {
        return (EReference)getTIED().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTIED_ConfigVersion() {
        return (EAttribute)getTIED().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTIED_Manufacturer() {
        return (EAttribute)getTIED().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTIED_Type() {
        return (EAttribute)getTIED().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTInputs() {
		if (tInputsEClass == null) {
			tInputsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(107);
		}
		return tInputsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTInputs_ExtRef() {
        return (EReference)getTInputs().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTLDevice() {
		if (tlDeviceEClass == null) {
			tlDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(108);
		}
		return tlDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTLDevice_LN0() {
        return (EReference)getTLDevice().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTLDevice_LN() {
        return (EReference)getTLDevice().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTLDevice_AccessControl() {
        return (EReference)getTLDevice().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLDevice_Inst() {
        return (EAttribute)getTLDevice().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLDevice_LdName() {
        return (EAttribute)getTLDevice().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTLN() {
		if (tlnEClass == null) {
			tlnEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(111);
		}
		return tlnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLN_Inst() {
        return (EAttribute)getTLN().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLN_LnClass() {
        return (EAttribute)getTLN().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLN_Prefix() {
        return (EAttribute)getTLN().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTLN0() {
		if (tln0EClass == null) {
			tln0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(112);
		}
		return tln0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTLN0_GSEControl() {
        return (EReference)getTLN0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTLN0_SampledValueControl() {
        return (EReference)getTLN0().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTLN0_SettingControl() {
        return (EReference)getTLN0().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTLN0_SCLControl() {
        return (EReference)getTLN0().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTLN0_Log() {
        return (EReference)getTLN0().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLN0_Inst() {
        return (EAttribute)getTLN0().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLN0_LnClass() {
        return (EAttribute)getTLN0().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTLNode() {
		if (tlNodeEClass == null) {
			tlNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(114);
		}
		return tlNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLNode_IedName() {
        return (EAttribute)getTLNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLNode_LdInst() {
        return (EAttribute)getTLNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLNode_LnClass() {
        return (EAttribute)getTLNode().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLNode_LnInst() {
        return (EAttribute)getTLNode().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLNode_LnType() {
        return (EAttribute)getTLNode().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLNode_Prefix() {
        return (EAttribute)getTLNode().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTLNodeContainer() {
		if (tlNodeContainerEClass == null) {
			tlNodeContainerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(115);
		}
		return tlNodeContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTLNodeContainer_LNode() {
        return (EReference)getTLNodeContainer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTLNodeType() {
		if (tlNodeTypeEClass == null) {
			tlNodeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(116);
		}
		return tlNodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTLNodeType_DO() {
        return (EReference)getTLNodeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLNodeType_IedType() {
        return (EAttribute)getTLNodeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLNodeType_LnClass() {
        return (EAttribute)getTLNodeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTLog() {
		if (tLogEClass == null) {
			tLogEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(117);
		}
		return tLogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTLogControl() {
		if (tLogControlEClass == null) {
			tLogControlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(118);
		}
		return tLogControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLogControl_LogEna() {
        return (EAttribute)getTLogControl().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLogControl_LogName() {
        return (EAttribute)getTLogControl().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLogControl_ReasonCode() {
        return (EAttribute)getTLogControl().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTLogSettings() {
		if (tLogSettingsEClass == null) {
			tLogSettingsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(119);
		}
		return tLogSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLogSettings_IntgPd() {
        return (EAttribute)getTLogSettings().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLogSettings_LogEna() {
        return (EAttribute)getTLogSettings().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLogSettings_TrgOps() {
        return (EAttribute)getTLogSettings().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTNaming() {
		if (tNamingEClass == null) {
			tNamingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(123);
		}
		return tNamingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTNaming_Desc() {
        return (EAttribute)getTNaming().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTNaming_Name() {
        return (EAttribute)getTNaming().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTP() {
		if (tpEClass == null) {
			tpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(124);
		}
		return tpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTP_Value() {
        return (EAttribute)getTP().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTP_Type() {
        return (EAttribute)getTP().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTPAPPID() {
		if (tpappidEClass == null) {
			tpappidEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(126);
		}
		return tpappidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTPhysConn() {
		if (tPhysConnEClass == null) {
			tPhysConnEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(129);
		}
		return tPhysConnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTPhysConn_P() {
        return (EReference)getTPhysConn().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTPhysConn_Type() {
        return (EAttribute)getTPhysConn().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTPIP() {
		if (tpipEClass == null) {
			tpipEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(130);
		}
		return tpipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTPIPGATEWAY() {
		if (tpipgatewayEClass == null) {
			tpipgatewayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(131);
		}
		return tpipgatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTPIPSUBNET() {
		if (tpipsubnetEClass == null) {
			tpipsubnetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(132);
		}
		return tpipsubnetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTPMACAddress() {
		if (tpmacAddressEClass == null) {
			tpmacAddressEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(133);
		}
		return tpmacAddressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTPOSIAEInvoke() {
		if (tposiaeInvokeEClass == null) {
			tposiaeInvokeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(134);
		}
		return tposiaeInvokeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTPOSIAEQualifier() {
		if (tposiaeQualifierEClass == null) {
			tposiaeQualifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(135);
		}
		return tposiaeQualifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTPOSIAPInvoke() {
		if (tposiapInvokeEClass == null) {
			tposiapInvokeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(136);
		}
		return tposiapInvokeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTPOSIAPTitle() {
		if (tposiapTitleEClass == null) {
			tposiapTitleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(137);
		}
		return tposiapTitleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTPOSINSAP() {
		if (tposinsapEClass == null) {
			tposinsapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(138);
		}
		return tposinsapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTPOSIPSEL() {
		if (tposipselEClass == null) {
			tposipselEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(139);
		}
		return tposipselEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTPOSISSEL() {
		if (tposisselEClass == null) {
			tposisselEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(140);
		}
		return tposisselEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTPOSITSEL() {
		if (tpositselEClass == null) {
			tpositselEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(141);
		}
		return tpositselEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTPowerSystemResource() {
		if (tPowerSystemResourceEClass == null) {
			tPowerSystemResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(142);
		}
		return tPowerSystemResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTPowerTransformer() {
		if (tPowerTransformerEClass == null) {
			tPowerTransformerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(143);
		}
		return tPowerTransformerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTPowerTransformer_TransformerWinding() {
        return (EReference)getTPowerTransformer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTPowerTransformer_Type() {
        return (EAttribute)getTPowerTransformer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTPrivate() {
		if (tPrivateEClass == null) {
			tPrivateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(160);
		}
		return tPrivateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTPrivate_Source() {
        return (EAttribute)getTPrivate().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTPrivate_Type() {
        return (EAttribute)getTPrivate().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTPVLANID() {
		if (tpvlanidEClass == null) {
			tpvlanidEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(162);
		}
		return tpvlanidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTPVLANPRIORITY() {
		if (tpvlanpriorityEClass == null) {
			tpvlanpriorityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(163);
		}
		return tpvlanpriorityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTReportControl() {
		if (tReportControlEClass == null) {
			tReportControlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(165);
		}
		return tReportControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTReportControl_OptFields() {
        return (EReference)getTReportControl().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTReportControl_RptEnabled() {
        return (EReference)getTReportControl().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTReportControl_Buffered() {
        return (EAttribute)getTReportControl().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTReportControl_BufTime() {
        return (EAttribute)getTReportControl().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTReportControl_ConfRev() {
        return (EAttribute)getTReportControl().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTReportControl_RptID() {
        return (EAttribute)getTReportControl().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTReportSettings() {
		if (tReportSettingsEClass == null) {
			tReportSettingsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(166);
		}
		return tReportSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTReportSettings_BufTime() {
        return (EAttribute)getTReportSettings().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTReportSettings_IntgPd() {
        return (EAttribute)getTReportSettings().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTReportSettings_OptFields() {
        return (EAttribute)getTReportSettings().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTReportSettings_RptID() {
        return (EAttribute)getTReportSettings().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTReportSettings_TrgOps() {
        return (EAttribute)getTReportSettings().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTRptEnabled() {
		if (tRptEnabledEClass == null) {
			tRptEnabledEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(171);
		}
		return tRptEnabledEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTRptEnabled_ClientLN() {
        return (EReference)getTRptEnabled().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTRptEnabled_Max() {
        return (EAttribute)getTRptEnabled().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTSampledValueControl() {
		if (tSampledValueControlEClass == null) {
			tSampledValueControlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(172);
		}
		return tSampledValueControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTSampledValueControl_SmvOpts() {
        return (EReference)getTSampledValueControl().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTSampledValueControl_Multicast() {
        return (EAttribute)getTSampledValueControl().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTSampledValueControl_NofASDU() {
        return (EAttribute)getTSampledValueControl().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTSampledValueControl_SmpRate() {
        return (EAttribute)getTSampledValueControl().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTSampledValueControl_SmvID() {
        return (EAttribute)getTSampledValueControl().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTSCLControl() {
		if (tsclControlEClass == null) {
			tsclControlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(173);
		}
		return tsclControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTSDI() {
		if (tsdiEClass == null) {
			tsdiEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(174);
		}
		return tsdiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTSDI_Group() {
        return (EAttribute)getTSDI().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTSDI_SDI() {
        return (EReference)getTSDI().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTSDI_DAI() {
        return (EReference)getTSDI().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTSDI_Ix() {
        return (EAttribute)getTSDI().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTSDI_Name() {
        return (EAttribute)getTSDI().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTSDO() {
		if (tsdoEClass == null) {
			tsdoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(175);
		}
		return tsdoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTSDO_Type() {
        return (EAttribute)getTSDO().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTServer() {
		if (tServerEClass == null) {
			tServerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(176);
		}
		return tServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTServer_Authentication() {
        return (EReference)getTServer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTServer_LDevice() {
        return (EReference)getTServer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTServer_Association() {
        return (EReference)getTServer().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTServer_Timeout() {
        return (EAttribute)getTServer().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTServices() {
		if (tServicesEClass == null) {
			tServicesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(179);
		}
		return tServicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTServices_DynAssociation() {
        return (EReference)getTServices().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTServices_SettingGroups() {
        return (EReference)getTServices().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTServices_GetDirectory() {
        return (EReference)getTServices().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTServices_GetDataObjectDefinition() {
        return (EReference)getTServices().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTServices_DataObjectDirectory() {
        return (EReference)getTServices().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTServices_GetDataSetValue() {
        return (EReference)getTServices().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTServices_SetDataSetValue() {
        return (EReference)getTServices().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTServices_DataSetDirectory() {
        return (EReference)getTServices().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTServices_ConfDataSet() {
        return (EReference)getTServices().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTServices_DynDataSet() {
        return (EReference)getTServices().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTServices_ReadWrite() {
        return (EReference)getTServices().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTServices_TimerActivatedControl() {
        return (EReference)getTServices().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTServices_ConfReportControl() {
        return (EReference)getTServices().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTServices_GetCBValues() {
        return (EReference)getTServices().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTServices_ConfLogControl() {
        return (EReference)getTServices().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTServices_ReportSettings() {
        return (EReference)getTServices().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTServices_LogSettings() {
        return (EReference)getTServices().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTServices_GSESettings() {
        return (EReference)getTServices().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTServices_SMVSettings() {
        return (EReference)getTServices().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTServices_GSEDir() {
        return (EReference)getTServices().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTServices_GOOSE() {
        return (EReference)getTServices().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTServices_GSSE() {
        return (EReference)getTServices().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTServices_FileHandling() {
        return (EReference)getTServices().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTServices_ConfLNs() {
        return (EReference)getTServices().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTServices_ClientServices() {
        return (EReference)getTServices().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTServiceSettings() {
		if (tServiceSettingsEClass == null) {
			tServiceSettingsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(180);
		}
		return tServiceSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTServiceSettings_CbName() {
        return (EAttribute)getTServiceSettings().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTServiceSettings_DatSet() {
        return (EAttribute)getTServiceSettings().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTServiceWithMax() {
		if (tServiceWithMaxEClass == null) {
			tServiceWithMaxEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(183);
		}
		return tServiceWithMaxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTServiceWithMax_Max() {
        return (EAttribute)getTServiceWithMax().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTServiceWithMaxAndMaxAttributes() {
		if (tServiceWithMaxAndMaxAttributesEClass == null) {
			tServiceWithMaxAndMaxAttributesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(184);
		}
		return tServiceWithMaxAndMaxAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTServiceWithMaxAndMaxAttributes_MaxAttributes() {
        return (EAttribute)getTServiceWithMaxAndMaxAttributes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTServiceWithMaxAndMaxAttributesAndModify() {
		if (tServiceWithMaxAndMaxAttributesAndModifyEClass == null) {
			tServiceWithMaxAndMaxAttributesAndModifyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(185);
		}
		return tServiceWithMaxAndMaxAttributesAndModifyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTServiceWithMaxAndMaxAttributesAndModify_Modify() {
        return (EAttribute)getTServiceWithMaxAndMaxAttributesAndModify().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTServiceWithMaxAndModify() {
		if (tServiceWithMaxAndModifyEClass == null) {
			tServiceWithMaxAndModifyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(186);
		}
		return tServiceWithMaxAndModifyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTServiceWithMaxAndModify_Modify() {
        return (EAttribute)getTServiceWithMaxAndModify().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTServiceYesNo() {
		if (tServiceYesNoEClass == null) {
			tServiceYesNoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(187);
		}
		return tServiceYesNoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTSettingControl() {
		if (tSettingControlEClass == null) {
			tSettingControlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(188);
		}
		return tSettingControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTSettingControl_ActSG() {
        return (EAttribute)getTSettingControl().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTSettingControl_NumOfSGs() {
        return (EAttribute)getTSettingControl().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTSMV() {
		if (tsmvEClass == null) {
			tsmvEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(191);
		}
		return tsmvEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTSMVSettings() {
		if (tsmvSettingsEClass == null) {
			tsmvSettingsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(192);
		}
		return tsmvSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTSMVSettings_SmpRate() {
        return (EAttribute)getTSMVSettings().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTSMVSettings_OptFields() {
        return (EAttribute)getTSMVSettings().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTSMVSettings_SmpRate1() {
        return (EAttribute)getTSMVSettings().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTSMVSettings_SvID() {
        return (EAttribute)getTSMVSettings().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTSubEquipment() {
		if (tSubEquipmentEClass == null) {
			tSubEquipmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(193);
		}
		return tSubEquipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTSubEquipment_Phase() {
        return (EAttribute)getTSubEquipment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTSubEquipment_Virtual() {
        return (EAttribute)getTSubEquipment().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTSubFunction() {
		if (tSubFunctionEClass == null) {
			tSubFunctionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(194);
		}
		return tSubFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTSubFunction_GeneralEquipment() {
        return (EReference)getTSubFunction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTSubNetwork() {
		if (tSubNetworkEClass == null) {
			tSubNetworkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(195);
		}
		return tSubNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTSubNetwork_BitRate() {
        return (EReference)getTSubNetwork().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTSubNetwork_ConnectedAP() {
        return (EReference)getTSubNetwork().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTSubNetwork_Type() {
        return (EAttribute)getTSubNetwork().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTSubstation() {
		if (tSubstationEClass == null) {
			tSubstationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(196);
		}
		return tSubstationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTSubstation_VoltageLevel() {
        return (EReference)getTSubstation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTSubstation_Function() {
        return (EReference)getTSubstation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTTapChanger() {
		if (tTapChangerEClass == null) {
			tTapChangerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(197);
		}
		return tTapChangerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTTapChanger_Type() {
        return (EAttribute)getTTapChanger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTTapChanger_Virtual() {
        return (EAttribute)getTTapChanger().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTTerminal() {
		if (tTerminalEClass == null) {
			tTerminalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(198);
		}
		return tTerminalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTTerminal_BayName() {
        return (EAttribute)getTTerminal().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTTerminal_CNodeName() {
        return (EAttribute)getTTerminal().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTTerminal_ConnectivityNode() {
        return (EAttribute)getTTerminal().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTTerminal_Name() {
        return (EAttribute)getTTerminal().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTTerminal_SubstationName() {
        return (EAttribute)getTTerminal().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTTerminal_VoltageLevelName() {
        return (EAttribute)getTTerminal().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTText() {
		if (tTextEClass == null) {
			tTextEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(199);
		}
		return tTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTText_Source() {
        return (EAttribute)getTText().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTTransformerWinding() {
		if (tTransformerWindingEClass == null) {
			tTransformerWindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(200);
		}
		return tTransformerWindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTTransformerWinding_TapChanger() {
        return (EReference)getTTransformerWinding().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTTransformerWinding_Type() {
        return (EAttribute)getTTransformerWinding().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTTrgOps() {
		if (tTrgOpsEClass == null) {
			tTrgOpsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(203);
		}
		return tTrgOpsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTTrgOps_Dchg() {
        return (EAttribute)getTTrgOps().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTTrgOps_Dupd() {
        return (EAttribute)getTTrgOps().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTTrgOps_Period() {
        return (EAttribute)getTTrgOps().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTTrgOps_Qchg() {
        return (EAttribute)getTTrgOps().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTUnNaming() {
		if (tUnNamingEClass == null) {
			tUnNamingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(210);
		}
		return tUnNamingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTUnNaming_Desc() {
        return (EAttribute)getTUnNaming().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTVal() {
		if (tValEClass == null) {
			tValEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(211);
		}
		return tValEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTVal_Value() {
        return (EAttribute)getTVal().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTVal_SGroup() {
        return (EAttribute)getTVal().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTValueWithUnit() {
		if (tValueWithUnitEClass == null) {
			tValueWithUnitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(214);
		}
		return tValueWithUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTValueWithUnit_Value() {
        return (EAttribute)getTValueWithUnit().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTValueWithUnit_Multiplier() {
        return (EAttribute)getTValueWithUnit().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTValueWithUnit_Unit() {
        return (EAttribute)getTValueWithUnit().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTVoltage() {
		if (tVoltageEClass == null) {
			tVoltageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(215);
		}
		return tVoltageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTVoltageLevel() {
		if (tVoltageLevelEClass == null) {
			tVoltageLevelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(216);
		}
		return tVoltageLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTVoltageLevel_Voltage() {
        return (EReference)getTVoltageLevel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTVoltageLevel_Bay() {
        return (EReference)getTVoltageLevel().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNameStructureType() {
		if (nameStructureTypeEEnum == null) {
			nameStructureTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(4);
		}
		return nameStructureTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTAssociationKindEnum() {
		if (tAssociationKindEnumEEnum == null) {
			tAssociationKindEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(20);
		}
		return tAssociationKindEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTAuthenticationEnum() {
		if (tAuthenticationEnumEEnum == null) {
			tAuthenticationEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(23);
		}
		return tAuthenticationEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTDomainLNGroupAEnum() {
		if (tDomainLNGroupAEnumEEnum == null) {
			tDomainLNGroupAEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(51);
		}
		return tDomainLNGroupAEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTDomainLNGroupCEnum() {
		if (tDomainLNGroupCEnumEEnum == null) {
			tDomainLNGroupCEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(53);
		}
		return tDomainLNGroupCEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTDomainLNGroupGEnum() {
		if (tDomainLNGroupGEnumEEnum == null) {
			tDomainLNGroupGEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(55);
		}
		return tDomainLNGroupGEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTDomainLNGroupIEnum() {
		if (tDomainLNGroupIEnumEEnum == null) {
			tDomainLNGroupIEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(57);
		}
		return tDomainLNGroupIEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTDomainLNGroupMEnum() {
		if (tDomainLNGroupMEnumEEnum == null) {
			tDomainLNGroupMEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(59);
		}
		return tDomainLNGroupMEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTDomainLNGroupPEnum() {
		if (tDomainLNGroupPEnumEEnum == null) {
			tDomainLNGroupPEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(61);
		}
		return tDomainLNGroupPEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTDomainLNGroupREnum() {
		if (tDomainLNGroupREnumEEnum == null) {
			tDomainLNGroupREnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(63);
		}
		return tDomainLNGroupREnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTDomainLNGroupSEnum() {
		if (tDomainLNGroupSEnumEEnum == null) {
			tDomainLNGroupSEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(65);
		}
		return tDomainLNGroupSEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTDomainLNGroupTEnum() {
		if (tDomainLNGroupTEnumEEnum == null) {
			tDomainLNGroupTEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(67);
		}
		return tDomainLNGroupTEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTDomainLNGroupXEnum() {
		if (tDomainLNGroupXEnumEEnum == null) {
			tDomainLNGroupXEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(69);
		}
		return tDomainLNGroupXEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTDomainLNGroupYEnum() {
		if (tDomainLNGroupYEnumEEnum == null) {
			tDomainLNGroupYEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(71);
		}
		return tDomainLNGroupYEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTDomainLNGroupZEnum() {
		if (tDomainLNGroupZEnumEEnum == null) {
			tDomainLNGroupZEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(73);
		}
		return tDomainLNGroupZEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTFCEnum() {
		if (tfcEnumEEnum == null) {
			tfcEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(93);
		}
		return tfcEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTGSEControlTypeEnum() {
		if (tgseControlTypeEnumEEnum == null) {
			tgseControlTypeEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(100);
		}
		return tgseControlTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTLLN0Enum() {
		if (tlln0EnumEEnum == null) {
			tlln0EnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(109);
		}
		return tlln0EnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTLPHDEnum() {
		if (tlphdEnumEEnum == null) {
			tlphdEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(120);
		}
		return tlphdEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTPhaseEnum() {
		if (tPhaseEnumEEnum == null) {
			tPhaseEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(127);
		}
		return tPhaseEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTPowerTransformerEnum() {
		if (tPowerTransformerEnumEEnum == null) {
			tPowerTransformerEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(144);
		}
		return tPowerTransformerEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTPredefinedAttributeNameEnum() {
		if (tPredefinedAttributeNameEnumEEnum == null) {
			tPredefinedAttributeNameEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(146);
		}
		return tPredefinedAttributeNameEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTPredefinedBasicTypeEnum() {
		if (tPredefinedBasicTypeEnumEEnum == null) {
			tPredefinedBasicTypeEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(148);
		}
		return tPredefinedBasicTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTPredefinedCDCEnum() {
		if (tPredefinedCDCEnumEEnum == null) {
			tPredefinedCDCEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(150);
		}
		return tPredefinedCDCEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTPredefinedCommonConductingEquipmentEnum() {
		if (tPredefinedCommonConductingEquipmentEnumEEnum == null) {
			tPredefinedCommonConductingEquipmentEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(152);
		}
		return tPredefinedCommonConductingEquipmentEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTPredefinedGeneralEquipmentEnum() {
		if (tPredefinedGeneralEquipmentEnumEEnum == null) {
			tPredefinedGeneralEquipmentEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(155);
		}
		return tPredefinedGeneralEquipmentEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTPredefinedPTypeEnum() {
		if (tPredefinedPTypeEnumEEnum == null) {
			tPredefinedPTypeEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(158);
		}
		return tPredefinedPTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTServiceFCEnum() {
		if (tServiceFCEnumEEnum == null) {
			tServiceFCEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(177);
		}
		return tServiceFCEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTServiceSettingsEnum() {
		if (tServiceSettingsEnumEEnum == null) {
			tServiceSettingsEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(181);
		}
		return tServiceSettingsEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTSIUnitEnum() {
		if (tsiUnitEnumEEnum == null) {
			tsiUnitEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(189);
		}
		return tsiUnitEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTTransformerWindingEnum() {
		if (tTransformerWindingEnumEEnum == null) {
			tTransformerWindingEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(201);
		}
		return tTransformerWindingEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTTrgOptControlEnum() {
		if (tTrgOptControlEnumEEnum == null) {
			tTrgOptControlEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(204);
		}
		return tTrgOptControlEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTTrgOptEnum() {
		if (tTrgOptEnumEEnum == null) {
			tTrgOptEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(206);
		}
		return tTrgOptEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTUnitMultiplierEnum() {
		if (tUnitMultiplierEnumEEnum == null) {
			tUnitMultiplierEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(208);
		}
		return tUnitMultiplierEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTValKindEnum() {
		if (tValKindEnumEEnum == null) {
			tValKindEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(212);
		}
		return tValKindEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNameStructureTypeObject() {
		if (nameStructureTypeObjectEDataType == null) {
			nameStructureTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(5);
		}
		return nameStructureTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSmpRateType() {
		if (smpRateTypeEDataType == null) {
			smpRateTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(9);
		}
		return smpRateTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTAnyName() {
		if (tAnyNameEDataType == null) {
			tAnyNameEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(18);
		}
		return tAnyNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTAssociationKindEnumObject() {
		if (tAssociationKindEnumObjectEDataType == null) {
			tAssociationKindEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(21);
		}
		return tAssociationKindEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTAttributeNameEnum() {
		if (tAttributeNameEnumEDataType == null) {
			tAttributeNameEnumEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(22);
		}
		return tAttributeNameEnumEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTAuthenticationEnumObject() {
		if (tAuthenticationEnumObjectEDataType == null) {
			tAuthenticationEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(24);
		}
		return tAuthenticationEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTBasicTypeEnum() {
		if (tBasicTypeEnumEDataType == null) {
			tBasicTypeEnumEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(26);
		}
		return tBasicTypeEnumEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTCDCEnum() {
		if (tcdcEnumEDataType == null) {
			tcdcEnumEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(30);
		}
		return tcdcEnumEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTCommonConductingEquipmentEnum() {
		if (tCommonConductingEquipmentEnumEDataType == null) {
			tCommonConductingEquipmentEnumEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(33);
		}
		return tCommonConductingEquipmentEnumEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTDomainLNEnum() {
		if (tDomainLNEnumEDataType == null) {
			tDomainLNEnumEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(50);
		}
		return tDomainLNEnumEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTDomainLNGroupAEnumObject() {
		if (tDomainLNGroupAEnumObjectEDataType == null) {
			tDomainLNGroupAEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(52);
		}
		return tDomainLNGroupAEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTDomainLNGroupCEnumObject() {
		if (tDomainLNGroupCEnumObjectEDataType == null) {
			tDomainLNGroupCEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(54);
		}
		return tDomainLNGroupCEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTDomainLNGroupGEnumObject() {
		if (tDomainLNGroupGEnumObjectEDataType == null) {
			tDomainLNGroupGEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(56);
		}
		return tDomainLNGroupGEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTDomainLNGroupIEnumObject() {
		if (tDomainLNGroupIEnumObjectEDataType == null) {
			tDomainLNGroupIEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(58);
		}
		return tDomainLNGroupIEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTDomainLNGroupMEnumObject() {
		if (tDomainLNGroupMEnumObjectEDataType == null) {
			tDomainLNGroupMEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(60);
		}
		return tDomainLNGroupMEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTDomainLNGroupPEnumObject() {
		if (tDomainLNGroupPEnumObjectEDataType == null) {
			tDomainLNGroupPEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(62);
		}
		return tDomainLNGroupPEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTDomainLNGroupREnumObject() {
		if (tDomainLNGroupREnumObjectEDataType == null) {
			tDomainLNGroupREnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(64);
		}
		return tDomainLNGroupREnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTDomainLNGroupSEnumObject() {
		if (tDomainLNGroupSEnumObjectEDataType == null) {
			tDomainLNGroupSEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(66);
		}
		return tDomainLNGroupSEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTDomainLNGroupTEnumObject() {
		if (tDomainLNGroupTEnumObjectEDataType == null) {
			tDomainLNGroupTEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(68);
		}
		return tDomainLNGroupTEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTDomainLNGroupXEnumObject() {
		if (tDomainLNGroupXEnumObjectEDataType == null) {
			tDomainLNGroupXEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(70);
		}
		return tDomainLNGroupXEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTDomainLNGroupYEnumObject() {
		if (tDomainLNGroupYEnumObjectEDataType == null) {
			tDomainLNGroupYEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(72);
		}
		return tDomainLNGroupYEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTDomainLNGroupZEnumObject() {
		if (tDomainLNGroupZEnumObjectEDataType == null) {
			tDomainLNGroupZEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(74);
		}
		return tDomainLNGroupZEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTEquipmentEnum() {
		if (tEquipmentEnumEDataType == null) {
			tEquipmentEnumEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(82);
		}
		return tEquipmentEnumEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTExtensionAttributeNameEnum() {
		if (tExtensionAttributeNameEnumEDataType == null) {
			tExtensionAttributeNameEnumEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(83);
		}
		return tExtensionAttributeNameEnumEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTExtensionBasicTypeEnum() {
		if (tExtensionBasicTypeEnumEDataType == null) {
			tExtensionBasicTypeEnumEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(84);
		}
		return tExtensionBasicTypeEnumEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTExtensionCDCEnum() {
		if (tExtensionCDCEnumEDataType == null) {
			tExtensionCDCEnumEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(85);
		}
		return tExtensionCDCEnumEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTExtensionEquipmentEnum() {
		if (tExtensionEquipmentEnumEDataType == null) {
			tExtensionEquipmentEnumEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(86);
		}
		return tExtensionEquipmentEnumEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTExtensionGeneralEquipmentEnum() {
		if (tExtensionGeneralEquipmentEnumEDataType == null) {
			tExtensionGeneralEquipmentEnumEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(87);
		}
		return tExtensionGeneralEquipmentEnumEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTExtensionLNClassEnum() {
		if (tExtensionLNClassEnumEDataType == null) {
			tExtensionLNClassEnumEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(88);
		}
		return tExtensionLNClassEnumEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTExtensionPTypeEnum() {
		if (tExtensionPTypeEnumEDataType == null) {
			tExtensionPTypeEnumEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(89);
		}
		return tExtensionPTypeEnumEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTFCEnumObject() {
		if (tfcEnumObjectEDataType == null) {
			tfcEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(94);
		}
		return tfcEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTGeneralEquipmentEnum() {
		if (tGeneralEquipmentEnumEDataType == null) {
			tGeneralEquipmentEnumEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(97);
		}
		return tGeneralEquipmentEnumEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTGSEControlTypeEnumObject() {
		if (tgseControlTypeEnumObjectEDataType == null) {
			tgseControlTypeEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(101);
		}
		return tgseControlTypeEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTLLN0EnumObject() {
		if (tlln0EnumObjectEDataType == null) {
			tlln0EnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(110);
		}
		return tlln0EnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTLNClassEnum() {
		if (tlnClassEnumEDataType == null) {
			tlnClassEnumEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(113);
		}
		return tlnClassEnumEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTLPHDEnumObject() {
		if (tlphdEnumObjectEDataType == null) {
			tlphdEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(121);
		}
		return tlphdEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTName() {
		if (tNameEDataType == null) {
			tNameEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(122);
		}
		return tNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTPAddr() {
		if (tpAddrEDataType == null) {
			tpAddrEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(125);
		}
		return tpAddrEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTPhaseEnumObject() {
		if (tPhaseEnumObjectEDataType == null) {
			tPhaseEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(128);
		}
		return tPhaseEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTPowerTransformerEnumObject() {
		if (tPowerTransformerEnumObjectEDataType == null) {
			tPowerTransformerEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(145);
		}
		return tPowerTransformerEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTPredefinedAttributeNameEnumObject() {
		if (tPredefinedAttributeNameEnumObjectEDataType == null) {
			tPredefinedAttributeNameEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(147);
		}
		return tPredefinedAttributeNameEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTPredefinedBasicTypeEnumObject() {
		if (tPredefinedBasicTypeEnumObjectEDataType == null) {
			tPredefinedBasicTypeEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(149);
		}
		return tPredefinedBasicTypeEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTPredefinedCDCEnumObject() {
		if (tPredefinedCDCEnumObjectEDataType == null) {
			tPredefinedCDCEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(151);
		}
		return tPredefinedCDCEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTPredefinedCommonConductingEquipmentEnumObject() {
		if (tPredefinedCommonConductingEquipmentEnumObjectEDataType == null) {
			tPredefinedCommonConductingEquipmentEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(153);
		}
		return tPredefinedCommonConductingEquipmentEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTPredefinedEquipmentEnum() {
		if (tPredefinedEquipmentEnumEDataType == null) {
			tPredefinedEquipmentEnumEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(154);
		}
		return tPredefinedEquipmentEnumEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTPredefinedGeneralEquipmentEnumObject() {
		if (tPredefinedGeneralEquipmentEnumObjectEDataType == null) {
			tPredefinedGeneralEquipmentEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(156);
		}
		return tPredefinedGeneralEquipmentEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTPredefinedLNClassEnum() {
		if (tPredefinedLNClassEnumEDataType == null) {
			tPredefinedLNClassEnumEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(157);
		}
		return tPredefinedLNClassEnumEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTPredefinedPTypeEnumObject() {
		if (tPredefinedPTypeEnumObjectEDataType == null) {
			tPredefinedPTypeEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(159);
		}
		return tPredefinedPTypeEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTPTypeEnum() {
		if (tpTypeEnumEDataType == null) {
			tpTypeEnumEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(161);
		}
		return tpTypeEnumEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTRef() {
		if (tRefEDataType == null) {
			tRefEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(164);
		}
		return tRefEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTRestrLdName() {
		if (tRestrLdNameEDataType == null) {
			tRestrLdNameEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(167);
		}
		return tRestrLdNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTRestrName() {
		if (tRestrNameEDataType == null) {
			tRestrNameEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(168);
		}
		return tRestrNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTRestrName1stL() {
		if (tRestrName1stLEDataType == null) {
			tRestrName1stLEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(169);
		}
		return tRestrName1stLEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTRestrName1stU() {
		if (tRestrName1stUEDataType == null) {
			tRestrName1stUEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(170);
		}
		return tRestrName1stUEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTServiceFCEnumObject() {
		if (tServiceFCEnumObjectEDataType == null) {
			tServiceFCEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(178);
		}
		return tServiceFCEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTServiceSettingsEnumObject() {
		if (tServiceSettingsEnumObjectEDataType == null) {
			tServiceSettingsEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(182);
		}
		return tServiceSettingsEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTSIUnitEnumObject() {
		if (tsiUnitEnumObjectEDataType == null) {
			tsiUnitEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(190);
		}
		return tsiUnitEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTTransformerWindingEnumObject() {
		if (tTransformerWindingEnumObjectEDataType == null) {
			tTransformerWindingEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(202);
		}
		return tTransformerWindingEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTTrgOptControlEnumObject() {
		if (tTrgOptControlEnumObjectEDataType == null) {
			tTrgOptControlEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(205);
		}
		return tTrgOptControlEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTTrgOptEnumObject() {
		if (tTrgOptEnumObjectEDataType == null) {
			tTrgOptEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(207);
		}
		return tTrgOptEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTUnitMultiplierEnumObject() {
		if (tUnitMultiplierEnumObjectEDataType == null) {
			tUnitMultiplierEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(209);
		}
		return tUnitMultiplierEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTValKindEnumObject() {
		if (tValKindEnumObjectEDataType == null) {
			tValKindEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(213);
		}
		return tValKindEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SclFactory getSclFactory() {
		return (SclFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("ch.iec._61850._2006.scl." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //SclPackageImpl
