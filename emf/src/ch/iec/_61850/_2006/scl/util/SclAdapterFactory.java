/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.util;

import ch.iec._61850._2006.scl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ch.iec._61850._2006.scl.SclPackage
 * @generated
 */
public class SclAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SclPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SclAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SclPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SclSwitch<Adapter> modelSwitch =
		new SclSwitch<Adapter>() {
			@Override
			public Adapter caseAuthenticationType(AuthenticationType object) {
				return createAuthenticationTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseHistoryType(HistoryType object) {
				return createHistoryTypeAdapter();
			}
			@Override
			public Adapter caseLN0Type(LN0Type object) {
				return createLN0TypeAdapter();
			}
			@Override
			public Adapter caseOptFieldsType(OptFieldsType object) {
				return createOptFieldsTypeAdapter();
			}
			@Override
			public Adapter caseSCLType(SCLType object) {
				return createSCLTypeAdapter();
			}
			@Override
			public Adapter caseSettingGroupsType(SettingGroupsType object) {
				return createSettingGroupsTypeAdapter();
			}
			@Override
			public Adapter caseSmvOptsType(SmvOptsType object) {
				return createSmvOptsTypeAdapter();
			}
			@Override
			public Adapter caseTAbstractConductingEquipment(TAbstractConductingEquipment object) {
				return createTAbstractConductingEquipmentAdapter();
			}
			@Override
			public Adapter caseTAbstractDataAttribute(TAbstractDataAttribute object) {
				return createTAbstractDataAttributeAdapter();
			}
			@Override
			public Adapter caseTAccessControl(TAccessControl object) {
				return createTAccessControlAdapter();
			}
			@Override
			public Adapter caseTAccessPoint(TAccessPoint object) {
				return createTAccessPointAdapter();
			}
			@Override
			public Adapter caseTAddress(TAddress object) {
				return createTAddressAdapter();
			}
			@Override
			public Adapter caseTAnyContentFromOtherNamespace(TAnyContentFromOtherNamespace object) {
				return createTAnyContentFromOtherNamespaceAdapter();
			}
			@Override
			public Adapter caseTAnyLN(TAnyLN object) {
				return createTAnyLNAdapter();
			}
			@Override
			public Adapter caseTAssociation(TAssociation object) {
				return createTAssociationAdapter();
			}
			@Override
			public Adapter caseTBaseElement(TBaseElement object) {
				return createTBaseElementAdapter();
			}
			@Override
			public Adapter caseTBay(TBay object) {
				return createTBayAdapter();
			}
			@Override
			public Adapter caseTBDA(TBDA object) {
				return createTBDAAdapter();
			}
			@Override
			public Adapter caseTBitRateInMbPerSec(TBitRateInMbPerSec object) {
				return createTBitRateInMbPerSecAdapter();
			}
			@Override
			public Adapter caseTClientLN(TClientLN object) {
				return createTClientLNAdapter();
			}
			@Override
			public Adapter caseTClientServices(TClientServices object) {
				return createTClientServicesAdapter();
			}
			@Override
			public Adapter caseTCommunication(TCommunication object) {
				return createTCommunicationAdapter();
			}
			@Override
			public Adapter caseTConductingEquipment(TConductingEquipment object) {
				return createTConductingEquipmentAdapter();
			}
			@Override
			public Adapter caseTConfLNs(TConfLNs object) {
				return createTConfLNsAdapter();
			}
			@Override
			public Adapter caseTConnectedAP(TConnectedAP object) {
				return createTConnectedAPAdapter();
			}
			@Override
			public Adapter caseTConnectivityNode(TConnectivityNode object) {
				return createTConnectivityNodeAdapter();
			}
			@Override
			public Adapter caseTControl(TControl object) {
				return createTControlAdapter();
			}
			@Override
			public Adapter caseTControlBlock(TControlBlock object) {
				return createTControlBlockAdapter();
			}
			@Override
			public Adapter caseTControlWithIEDName(TControlWithIEDName object) {
				return createTControlWithIEDNameAdapter();
			}
			@Override
			public Adapter caseTControlWithTriggerOpt(TControlWithTriggerOpt object) {
				return createTControlWithTriggerOptAdapter();
			}
			@Override
			public Adapter caseTDA(TDA object) {
				return createTDAAdapter();
			}
			@Override
			public Adapter caseTDAI(TDAI object) {
				return createTDAIAdapter();
			}
			@Override
			public Adapter caseTDataSet(TDataSet object) {
				return createTDataSetAdapter();
			}
			@Override
			public Adapter caseTDataTypeTemplates(TDataTypeTemplates object) {
				return createTDataTypeTemplatesAdapter();
			}
			@Override
			public Adapter caseTDAType(TDAType object) {
				return createTDATypeAdapter();
			}
			@Override
			public Adapter caseTDO(TDO object) {
				return createTDOAdapter();
			}
			@Override
			public Adapter caseTDOI(TDOI object) {
				return createTDOIAdapter();
			}
			@Override
			public Adapter caseTDOType(TDOType object) {
				return createTDOTypeAdapter();
			}
			@Override
			public Adapter caseTDurationInMilliSec(TDurationInMilliSec object) {
				return createTDurationInMilliSecAdapter();
			}
			@Override
			public Adapter caseTDurationInSec(TDurationInSec object) {
				return createTDurationInSecAdapter();
			}
			@Override
			public Adapter caseTEnumType(TEnumType object) {
				return createTEnumTypeAdapter();
			}
			@Override
			public Adapter caseTEnumVal(TEnumVal object) {
				return createTEnumValAdapter();
			}
			@Override
			public Adapter caseTEquipment(TEquipment object) {
				return createTEquipmentAdapter();
			}
			@Override
			public Adapter caseTEquipmentContainer(TEquipmentContainer object) {
				return createTEquipmentContainerAdapter();
			}
			@Override
			public Adapter caseTExtRef(TExtRef object) {
				return createTExtRefAdapter();
			}
			@Override
			public Adapter caseTFCCB(TFCCB object) {
				return createTFCCBAdapter();
			}
			@Override
			public Adapter caseTFCDA(TFCDA object) {
				return createTFCDAAdapter();
			}
			@Override
			public Adapter caseTFunction(TFunction object) {
				return createTFunctionAdapter();
			}
			@Override
			public Adapter caseTGeneralEquipment(TGeneralEquipment object) {
				return createTGeneralEquipmentAdapter();
			}
			@Override
			public Adapter caseTGSE(TGSE object) {
				return createTGSEAdapter();
			}
			@Override
			public Adapter caseTGSEControl(TGSEControl object) {
				return createTGSEControlAdapter();
			}
			@Override
			public Adapter caseTGSESettings(TGSESettings object) {
				return createTGSESettingsAdapter();
			}
			@Override
			public Adapter caseTHeader(THeader object) {
				return createTHeaderAdapter();
			}
			@Override
			public Adapter caseTHitem(THitem object) {
				return createTHitemAdapter();
			}
			@Override
			public Adapter caseTIDNaming(TIDNaming object) {
				return createTIDNamingAdapter();
			}
			@Override
			public Adapter caseTIED(TIED object) {
				return createTIEDAdapter();
			}
			@Override
			public Adapter caseTInputs(TInputs object) {
				return createTInputsAdapter();
			}
			@Override
			public Adapter caseTLDevice(TLDevice object) {
				return createTLDeviceAdapter();
			}
			@Override
			public Adapter caseTLN(TLN object) {
				return createTLNAdapter();
			}
			@Override
			public Adapter caseTLN0(TLN0 object) {
				return createTLN0Adapter();
			}
			@Override
			public Adapter caseTLNode(TLNode object) {
				return createTLNodeAdapter();
			}
			@Override
			public Adapter caseTLNodeContainer(TLNodeContainer object) {
				return createTLNodeContainerAdapter();
			}
			@Override
			public Adapter caseTLNodeType(TLNodeType object) {
				return createTLNodeTypeAdapter();
			}
			@Override
			public Adapter caseTLog(TLog object) {
				return createTLogAdapter();
			}
			@Override
			public Adapter caseTLogControl(TLogControl object) {
				return createTLogControlAdapter();
			}
			@Override
			public Adapter caseTLogSettings(TLogSettings object) {
				return createTLogSettingsAdapter();
			}
			@Override
			public Adapter caseTNaming(TNaming object) {
				return createTNamingAdapter();
			}
			@Override
			public Adapter caseTP(TP object) {
				return createTPAdapter();
			}
			@Override
			public Adapter caseTPAPPID(TPAPPID object) {
				return createTPAPPIDAdapter();
			}
			@Override
			public Adapter caseTPhysConn(TPhysConn object) {
				return createTPhysConnAdapter();
			}
			@Override
			public Adapter caseTPIP(TPIP object) {
				return createTPIPAdapter();
			}
			@Override
			public Adapter caseTPIPGATEWAY(TPIPGATEWAY object) {
				return createTPIPGATEWAYAdapter();
			}
			@Override
			public Adapter caseTPIPSUBNET(TPIPSUBNET object) {
				return createTPIPSUBNETAdapter();
			}
			@Override
			public Adapter caseTPMACAddress(TPMACAddress object) {
				return createTPMACAddressAdapter();
			}
			@Override
			public Adapter caseTPOSIAEInvoke(TPOSIAEInvoke object) {
				return createTPOSIAEInvokeAdapter();
			}
			@Override
			public Adapter caseTPOSIAEQualifier(TPOSIAEQualifier object) {
				return createTPOSIAEQualifierAdapter();
			}
			@Override
			public Adapter caseTPOSIAPInvoke(TPOSIAPInvoke object) {
				return createTPOSIAPInvokeAdapter();
			}
			@Override
			public Adapter caseTPOSIAPTitle(TPOSIAPTitle object) {
				return createTPOSIAPTitleAdapter();
			}
			@Override
			public Adapter caseTPOSINSAP(TPOSINSAP object) {
				return createTPOSINSAPAdapter();
			}
			@Override
			public Adapter caseTPOSIPSEL(TPOSIPSEL object) {
				return createTPOSIPSELAdapter();
			}
			@Override
			public Adapter caseTPOSISSEL(TPOSISSEL object) {
				return createTPOSISSELAdapter();
			}
			@Override
			public Adapter caseTPOSITSEL(TPOSITSEL object) {
				return createTPOSITSELAdapter();
			}
			@Override
			public Adapter caseTPowerSystemResource(TPowerSystemResource object) {
				return createTPowerSystemResourceAdapter();
			}
			@Override
			public Adapter caseTPowerTransformer(TPowerTransformer object) {
				return createTPowerTransformerAdapter();
			}
			@Override
			public Adapter caseTPrivate(TPrivate object) {
				return createTPrivateAdapter();
			}
			@Override
			public Adapter caseTPVLANID(TPVLANID object) {
				return createTPVLANIDAdapter();
			}
			@Override
			public Adapter caseTPVLANPRIORITY(TPVLANPRIORITY object) {
				return createTPVLANPRIORITYAdapter();
			}
			@Override
			public Adapter caseTReportControl(TReportControl object) {
				return createTReportControlAdapter();
			}
			@Override
			public Adapter caseTReportSettings(TReportSettings object) {
				return createTReportSettingsAdapter();
			}
			@Override
			public Adapter caseTRptEnabled(TRptEnabled object) {
				return createTRptEnabledAdapter();
			}
			@Override
			public Adapter caseTSampledValueControl(TSampledValueControl object) {
				return createTSampledValueControlAdapter();
			}
			@Override
			public Adapter caseTSCLControl(TSCLControl object) {
				return createTSCLControlAdapter();
			}
			@Override
			public Adapter caseTSDI(TSDI object) {
				return createTSDIAdapter();
			}
			@Override
			public Adapter caseTSDO(TSDO object) {
				return createTSDOAdapter();
			}
			@Override
			public Adapter caseTServer(TServer object) {
				return createTServerAdapter();
			}
			@Override
			public Adapter caseTServices(TServices object) {
				return createTServicesAdapter();
			}
			@Override
			public Adapter caseTServiceSettings(TServiceSettings object) {
				return createTServiceSettingsAdapter();
			}
			@Override
			public Adapter caseTServiceWithMax(TServiceWithMax object) {
				return createTServiceWithMaxAdapter();
			}
			@Override
			public Adapter caseTServiceWithMaxAndMaxAttributes(TServiceWithMaxAndMaxAttributes object) {
				return createTServiceWithMaxAndMaxAttributesAdapter();
			}
			@Override
			public Adapter caseTServiceWithMaxAndMaxAttributesAndModify(TServiceWithMaxAndMaxAttributesAndModify object) {
				return createTServiceWithMaxAndMaxAttributesAndModifyAdapter();
			}
			@Override
			public Adapter caseTServiceWithMaxAndModify(TServiceWithMaxAndModify object) {
				return createTServiceWithMaxAndModifyAdapter();
			}
			@Override
			public Adapter caseTServiceYesNo(TServiceYesNo object) {
				return createTServiceYesNoAdapter();
			}
			@Override
			public Adapter caseTSettingControl(TSettingControl object) {
				return createTSettingControlAdapter();
			}
			@Override
			public Adapter caseTSMV(TSMV object) {
				return createTSMVAdapter();
			}
			@Override
			public Adapter caseTSMVSettings(TSMVSettings object) {
				return createTSMVSettingsAdapter();
			}
			@Override
			public Adapter caseTSubEquipment(TSubEquipment object) {
				return createTSubEquipmentAdapter();
			}
			@Override
			public Adapter caseTSubFunction(TSubFunction object) {
				return createTSubFunctionAdapter();
			}
			@Override
			public Adapter caseTSubNetwork(TSubNetwork object) {
				return createTSubNetworkAdapter();
			}
			@Override
			public Adapter caseTSubstation(TSubstation object) {
				return createTSubstationAdapter();
			}
			@Override
			public Adapter caseTTapChanger(TTapChanger object) {
				return createTTapChangerAdapter();
			}
			@Override
			public Adapter caseTTerminal(TTerminal object) {
				return createTTerminalAdapter();
			}
			@Override
			public Adapter caseTText(TText object) {
				return createTTextAdapter();
			}
			@Override
			public Adapter caseTTransformerWinding(TTransformerWinding object) {
				return createTTransformerWindingAdapter();
			}
			@Override
			public Adapter caseTTrgOps(TTrgOps object) {
				return createTTrgOpsAdapter();
			}
			@Override
			public Adapter caseTUnNaming(TUnNaming object) {
				return createTUnNamingAdapter();
			}
			@Override
			public Adapter caseTVal(TVal object) {
				return createTValAdapter();
			}
			@Override
			public Adapter caseTValueWithUnit(TValueWithUnit object) {
				return createTValueWithUnitAdapter();
			}
			@Override
			public Adapter caseTVoltage(TVoltage object) {
				return createTVoltageAdapter();
			}
			@Override
			public Adapter caseTVoltageLevel(TVoltageLevel object) {
				return createTVoltageLevelAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.AuthenticationType <em>Authentication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.AuthenticationType
	 * @generated
	 */
	public Adapter createAuthenticationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.HistoryType <em>History Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.HistoryType
	 * @generated
	 */
	public Adapter createHistoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.LN0Type <em>LN0 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.LN0Type
	 * @generated
	 */
	public Adapter createLN0TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.OptFieldsType <em>Opt Fields Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.OptFieldsType
	 * @generated
	 */
	public Adapter createOptFieldsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.SCLType <em>SCL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.SCLType
	 * @generated
	 */
	public Adapter createSCLTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.SettingGroupsType <em>Setting Groups Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.SettingGroupsType
	 * @generated
	 */
	public Adapter createSettingGroupsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.SmvOptsType <em>Smv Opts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.SmvOptsType
	 * @generated
	 */
	public Adapter createSmvOptsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TAbstractConductingEquipment <em>TAbstract Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TAbstractConductingEquipment
	 * @generated
	 */
	public Adapter createTAbstractConductingEquipmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TAbstractDataAttribute <em>TAbstract Data Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TAbstractDataAttribute
	 * @generated
	 */
	public Adapter createTAbstractDataAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TAccessControl <em>TAccess Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TAccessControl
	 * @generated
	 */
	public Adapter createTAccessControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TAccessPoint <em>TAccess Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TAccessPoint
	 * @generated
	 */
	public Adapter createTAccessPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TAddress <em>TAddress</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TAddress
	 * @generated
	 */
	public Adapter createTAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TAnyContentFromOtherNamespace <em>TAny Content From Other Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TAnyContentFromOtherNamespace
	 * @generated
	 */
	public Adapter createTAnyContentFromOtherNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TAnyLN <em>TAny LN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TAnyLN
	 * @generated
	 */
	public Adapter createTAnyLNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TAssociation <em>TAssociation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TAssociation
	 * @generated
	 */
	public Adapter createTAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TBaseElement <em>TBase Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TBaseElement
	 * @generated
	 */
	public Adapter createTBaseElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TBay <em>TBay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TBay
	 * @generated
	 */
	public Adapter createTBayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TBDA <em>TBDA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TBDA
	 * @generated
	 */
	public Adapter createTBDAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TBitRateInMbPerSec <em>TBit Rate In Mb Per Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TBitRateInMbPerSec
	 * @generated
	 */
	public Adapter createTBitRateInMbPerSecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TClientLN <em>TClient LN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TClientLN
	 * @generated
	 */
	public Adapter createTClientLNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TClientServices <em>TClient Services</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TClientServices
	 * @generated
	 */
	public Adapter createTClientServicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TCommunication <em>TCommunication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TCommunication
	 * @generated
	 */
	public Adapter createTCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TConductingEquipment <em>TConducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TConductingEquipment
	 * @generated
	 */
	public Adapter createTConductingEquipmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TConfLNs <em>TConf LNs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TConfLNs
	 * @generated
	 */
	public Adapter createTConfLNsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TConnectedAP <em>TConnected AP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TConnectedAP
	 * @generated
	 */
	public Adapter createTConnectedAPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TConnectivityNode <em>TConnectivity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TConnectivityNode
	 * @generated
	 */
	public Adapter createTConnectivityNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TControl <em>TControl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TControl
	 * @generated
	 */
	public Adapter createTControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TControlBlock <em>TControl Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TControlBlock
	 * @generated
	 */
	public Adapter createTControlBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TControlWithIEDName <em>TControl With IED Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TControlWithIEDName
	 * @generated
	 */
	public Adapter createTControlWithIEDNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TControlWithTriggerOpt <em>TControl With Trigger Opt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TControlWithTriggerOpt
	 * @generated
	 */
	public Adapter createTControlWithTriggerOptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TDA <em>TDA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TDA
	 * @generated
	 */
	public Adapter createTDAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TDAI <em>TDAI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TDAI
	 * @generated
	 */
	public Adapter createTDAIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TDataSet <em>TData Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TDataSet
	 * @generated
	 */
	public Adapter createTDataSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TDataTypeTemplates <em>TData Type Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TDataTypeTemplates
	 * @generated
	 */
	public Adapter createTDataTypeTemplatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TDAType <em>TDA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TDAType
	 * @generated
	 */
	public Adapter createTDATypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TDO <em>TDO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TDO
	 * @generated
	 */
	public Adapter createTDOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TDOI <em>TDOI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TDOI
	 * @generated
	 */
	public Adapter createTDOIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TDOType <em>TDO Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TDOType
	 * @generated
	 */
	public Adapter createTDOTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TDurationInMilliSec <em>TDuration In Milli Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TDurationInMilliSec
	 * @generated
	 */
	public Adapter createTDurationInMilliSecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TDurationInSec <em>TDuration In Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TDurationInSec
	 * @generated
	 */
	public Adapter createTDurationInSecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TEnumType <em>TEnum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TEnumType
	 * @generated
	 */
	public Adapter createTEnumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TEnumVal <em>TEnum Val</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TEnumVal
	 * @generated
	 */
	public Adapter createTEnumValAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TEquipment <em>TEquipment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TEquipment
	 * @generated
	 */
	public Adapter createTEquipmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TEquipmentContainer <em>TEquipment Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TEquipmentContainer
	 * @generated
	 */
	public Adapter createTEquipmentContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TExtRef <em>TExt Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TExtRef
	 * @generated
	 */
	public Adapter createTExtRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TFCCB <em>TFCCB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TFCCB
	 * @generated
	 */
	public Adapter createTFCCBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TFCDA <em>TFCDA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TFCDA
	 * @generated
	 */
	public Adapter createTFCDAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TFunction <em>TFunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TFunction
	 * @generated
	 */
	public Adapter createTFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TGeneralEquipment <em>TGeneral Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TGeneralEquipment
	 * @generated
	 */
	public Adapter createTGeneralEquipmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TGSE <em>TGSE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TGSE
	 * @generated
	 */
	public Adapter createTGSEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TGSEControl <em>TGSE Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TGSEControl
	 * @generated
	 */
	public Adapter createTGSEControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TGSESettings <em>TGSE Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TGSESettings
	 * @generated
	 */
	public Adapter createTGSESettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.THeader <em>THeader</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.THeader
	 * @generated
	 */
	public Adapter createTHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.THitem <em>THitem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.THitem
	 * @generated
	 */
	public Adapter createTHitemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TIDNaming <em>TID Naming</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TIDNaming
	 * @generated
	 */
	public Adapter createTIDNamingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TIED <em>TIED</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TIED
	 * @generated
	 */
	public Adapter createTIEDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TInputs <em>TInputs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TInputs
	 * @generated
	 */
	public Adapter createTInputsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TLDevice <em>TL Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TLDevice
	 * @generated
	 */
	public Adapter createTLDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TLN <em>TLN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TLN
	 * @generated
	 */
	public Adapter createTLNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TLN0 <em>TLN0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TLN0
	 * @generated
	 */
	public Adapter createTLN0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TLNode <em>TL Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TLNode
	 * @generated
	 */
	public Adapter createTLNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TLNodeContainer <em>TL Node Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TLNodeContainer
	 * @generated
	 */
	public Adapter createTLNodeContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TLNodeType <em>TL Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TLNodeType
	 * @generated
	 */
	public Adapter createTLNodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TLog <em>TLog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TLog
	 * @generated
	 */
	public Adapter createTLogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TLogControl <em>TLog Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TLogControl
	 * @generated
	 */
	public Adapter createTLogControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TLogSettings <em>TLog Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TLogSettings
	 * @generated
	 */
	public Adapter createTLogSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TNaming <em>TNaming</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TNaming
	 * @generated
	 */
	public Adapter createTNamingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TP <em>TP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TP
	 * @generated
	 */
	public Adapter createTPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TPAPPID <em>TPAPPID</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TPAPPID
	 * @generated
	 */
	public Adapter createTPAPPIDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TPhysConn <em>TPhys Conn</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TPhysConn
	 * @generated
	 */
	public Adapter createTPhysConnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TPIP <em>TPIP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TPIP
	 * @generated
	 */
	public Adapter createTPIPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TPIPGATEWAY <em>TPIPGATEWAY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TPIPGATEWAY
	 * @generated
	 */
	public Adapter createTPIPGATEWAYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TPIPSUBNET <em>TPIPSUBNET</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TPIPSUBNET
	 * @generated
	 */
	public Adapter createTPIPSUBNETAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TPMACAddress <em>TPMAC Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TPMACAddress
	 * @generated
	 */
	public Adapter createTPMACAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TPOSIAEInvoke <em>TPOSIAE Invoke</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TPOSIAEInvoke
	 * @generated
	 */
	public Adapter createTPOSIAEInvokeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TPOSIAEQualifier <em>TPOSIAE Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TPOSIAEQualifier
	 * @generated
	 */
	public Adapter createTPOSIAEQualifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TPOSIAPInvoke <em>TPOSIAP Invoke</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TPOSIAPInvoke
	 * @generated
	 */
	public Adapter createTPOSIAPInvokeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TPOSIAPTitle <em>TPOSIAP Title</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TPOSIAPTitle
	 * @generated
	 */
	public Adapter createTPOSIAPTitleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TPOSINSAP <em>TPOSINSAP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TPOSINSAP
	 * @generated
	 */
	public Adapter createTPOSINSAPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TPOSIPSEL <em>TPOSIPSEL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TPOSIPSEL
	 * @generated
	 */
	public Adapter createTPOSIPSELAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TPOSISSEL <em>TPOSISSEL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TPOSISSEL
	 * @generated
	 */
	public Adapter createTPOSISSELAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TPOSITSEL <em>TPOSITSEL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TPOSITSEL
	 * @generated
	 */
	public Adapter createTPOSITSELAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TPowerSystemResource <em>TPower System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TPowerSystemResource
	 * @generated
	 */
	public Adapter createTPowerSystemResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TPowerTransformer <em>TPower Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TPowerTransformer
	 * @generated
	 */
	public Adapter createTPowerTransformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TPrivate <em>TPrivate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TPrivate
	 * @generated
	 */
	public Adapter createTPrivateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TPVLANID <em>TPVLANID</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TPVLANID
	 * @generated
	 */
	public Adapter createTPVLANIDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TPVLANPRIORITY <em>TPVLANPRIORITY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TPVLANPRIORITY
	 * @generated
	 */
	public Adapter createTPVLANPRIORITYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TReportControl <em>TReport Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TReportControl
	 * @generated
	 */
	public Adapter createTReportControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TReportSettings <em>TReport Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TReportSettings
	 * @generated
	 */
	public Adapter createTReportSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TRptEnabled <em>TRpt Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TRptEnabled
	 * @generated
	 */
	public Adapter createTRptEnabledAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TSampledValueControl <em>TSampled Value Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TSampledValueControl
	 * @generated
	 */
	public Adapter createTSampledValueControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TSCLControl <em>TSCL Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TSCLControl
	 * @generated
	 */
	public Adapter createTSCLControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TSDI <em>TSDI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TSDI
	 * @generated
	 */
	public Adapter createTSDIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TSDO <em>TSDO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TSDO
	 * @generated
	 */
	public Adapter createTSDOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TServer <em>TServer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TServer
	 * @generated
	 */
	public Adapter createTServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TServices <em>TServices</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TServices
	 * @generated
	 */
	public Adapter createTServicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TServiceSettings <em>TService Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TServiceSettings
	 * @generated
	 */
	public Adapter createTServiceSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TServiceWithMax <em>TService With Max</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TServiceWithMax
	 * @generated
	 */
	public Adapter createTServiceWithMaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TServiceWithMaxAndMaxAttributes <em>TService With Max And Max Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TServiceWithMaxAndMaxAttributes
	 * @generated
	 */
	public Adapter createTServiceWithMaxAndMaxAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TServiceWithMaxAndMaxAttributesAndModify <em>TService With Max And Max Attributes And Modify</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TServiceWithMaxAndMaxAttributesAndModify
	 * @generated
	 */
	public Adapter createTServiceWithMaxAndMaxAttributesAndModifyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TServiceWithMaxAndModify <em>TService With Max And Modify</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TServiceWithMaxAndModify
	 * @generated
	 */
	public Adapter createTServiceWithMaxAndModifyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TServiceYesNo <em>TService Yes No</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TServiceYesNo
	 * @generated
	 */
	public Adapter createTServiceYesNoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TSettingControl <em>TSetting Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TSettingControl
	 * @generated
	 */
	public Adapter createTSettingControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TSMV <em>TSMV</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TSMV
	 * @generated
	 */
	public Adapter createTSMVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TSMVSettings <em>TSMV Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TSMVSettings
	 * @generated
	 */
	public Adapter createTSMVSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TSubEquipment <em>TSub Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TSubEquipment
	 * @generated
	 */
	public Adapter createTSubEquipmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TSubFunction <em>TSub Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TSubFunction
	 * @generated
	 */
	public Adapter createTSubFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TSubNetwork <em>TSub Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TSubNetwork
	 * @generated
	 */
	public Adapter createTSubNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TSubstation <em>TSubstation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TSubstation
	 * @generated
	 */
	public Adapter createTSubstationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TTapChanger <em>TTap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TTapChanger
	 * @generated
	 */
	public Adapter createTTapChangerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TTerminal <em>TTerminal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TTerminal
	 * @generated
	 */
	public Adapter createTTerminalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TText <em>TText</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TText
	 * @generated
	 */
	public Adapter createTTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TTransformerWinding <em>TTransformer Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TTransformerWinding
	 * @generated
	 */
	public Adapter createTTransformerWindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TTrgOps <em>TTrg Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TTrgOps
	 * @generated
	 */
	public Adapter createTTrgOpsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TUnNaming <em>TUn Naming</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TUnNaming
	 * @generated
	 */
	public Adapter createTUnNamingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TVal <em>TVal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TVal
	 * @generated
	 */
	public Adapter createTValAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TValueWithUnit <em>TValue With Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TValueWithUnit
	 * @generated
	 */
	public Adapter createTValueWithUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TVoltage <em>TVoltage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TVoltage
	 * @generated
	 */
	public Adapter createTVoltageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.iec._61850._2006.scl.TVoltageLevel <em>TVoltage Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.iec._61850._2006.scl.TVoltageLevel
	 * @generated
	 */
	public Adapter createTVoltageLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SclAdapterFactory
