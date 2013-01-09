<?xml version="1.0" encoding="UTF-8"?>
<SCL xmlns="http://www.iec.ch/61850/2006/SCL" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://www.iec.ch/61850/2006/SCL">
	<Header id="SCL Example T1-1" nameStructure="IEDName"/>
	<Substation name="S12" desc="Baden">
		<VoltageLevel name="D1">
			<PowerTransformer name="T1" type="PTR">
				<LNode lnInst="1" lnClass="PDIF" ldInst="F1" iedName="D1Q1BP2"/>
				<LNode lnInst="1" lnClass="TCTR" ldInst="MUnn" iedName="D1Q1SB1"/>
				<TransformerWinding name="W1" type="PTW">
					<Terminal connectivityNode="S12/D1/Q1/L1" substationName="S12" voltageLevelName="D1" bayName="Q1" cNodeName="L1"/>
				</TransformerWinding>
				<TransformerWinding name="W2" type="PTW">
					<Terminal connectivityNode="S12/E1/Q2/L3" substationName="S12" voltageLevelName="E1" bayName="Q2" cNodeName="L3"/>
				</TransformerWinding>
			</PowerTransformer>
			<Voltage multiplier="k" unit="V">220</Voltage>
			<Bay name="Q1">
				<LNode lnInst="1" lnClass="PDIS" ldInst="F1" iedName="D1Q1BP3"/>
				<ConductingEquipment name="I1" type="CTR">
					<Terminal connectivityNode="S12/D1/Q1/L1" substationName="S12" voltageLevelName="D1" bayName="Q1" cNodeName="L1"/>
					<SubEquipment name="R" phase="A">
						<LNode lnClass="TCTR " iedName="D1Q1BP2" ldInst="F1" lnInst="1"/>
					</SubEquipment>
					<SubEquipment name="S" phase="B">
						<LNode lnClass="TCTR " iedName="D1Q1BP2" ldInst="F1" lnInst="2"/>
					</SubEquipment>
					<SubEquipment name="T" phase="C">
						<LNode lnClass="TCTR " iedName="D1Q1BP2" ldInst="F1" lnInst="3"/>
					</SubEquipment>
					<SubEquipment name="I0" phase="N">
						<LNode lnClass="TCTR " iedName="D1Q1BP2" ldInst="F1" lnInst="4"/>
					</SubEquipment>
				</ConductingEquipment>
				<ConnectivityNode name="L1" pathName="S12/D1/Q1/L1"/>
			</Bay>
		</VoltageLevel>
		<VoltageLevel name="E1">
			<Voltage multiplier="k" unit="V">132</Voltage>
			<Bay name="Q1">
				<LNode lnInst="1" lnClass="MMXU" ldInst="MUnn" iedName="LE_IED"/>
				<LNode lnInst="1" lnClass="PDIS" ldInst="F1" iedName="E1Q1BP3"/>
				<LNode lnInst="1" lnClass="PDIF" ldInst="F1" iedName="E1Q1BP2"/>
				<ConductingEquipment name="QA1" type="CBR">
					<LNode lnInst="1" lnClass="CSWI" ldInst="MUnn" iedName="LE_IED"/>
					<Terminal connectivityNode="S12/E1/Q1/L1" substationName="S12" voltageLevelName="E1" bayName="Q1" cNodeName="L1"/>
					<Terminal connectivityNode="S12/E1/Q1/L2" substationName="S12" voltageLevelName="E1" bayName="Q1" cNodeName="L2"/>
				</ConductingEquipment>
				<ConductingEquipment name="QB1" type="DIS">
					<Terminal connectivityNode="S12/E1/W1/BB1" substationName="S12" voltageLevelName="E1" bayName="W1" cNodeName="BB1"/>
					<Terminal connectivityNode="S12/E1/Q1/L1" substationName="S12" voltageLevelName="E1" bayName="Q1" cNodeName="L1"/>
				</ConductingEquipment>
				<ConductingEquipment name="U1" type="VTR">
					<Terminal connectivityNode="S12/E1/Q1/L2" substationName="S12" voltageLevelName="E1" bayName="Q1" cNodeName="L2"/>
					<Terminal connectivityNode="S12/E1/Q1/L3" substationName="S12" voltageLevelName="E1" bayName="Q1" cNodeName="L3"/>
					<SubEquipment name="A" phase="A">
						<LNode lnClass="TVTR" iedName="LE_IED" ldInst="MUnn" lnInst="1" desc="VT phase L1"/>
					</SubEquipment>
				</ConductingEquipment>
				<ConductingEquipment name="I1" type="CTR">
					<Terminal connectivityNode="S12/E1/Q1/L3" substationName="S12" voltageLevelName="E1" bayName="Q1" cNodeName="L3"/>
					<Terminal connectivityNode="S12/E1/Q1/L4" substationName="S12" voltageLevelName="E1" bayName="Q1" cNodeName="L4"/>
				</ConductingEquipment>
				<ConnectivityNode name="L1" pathName="S12/E1/Q1/L1"/>
				<ConnectivityNode name="L2" pathName="S12/E1/Q1/L2"/>
				<ConnectivityNode name="L3" pathName="S12/E1/Q1/L3"/>
				<ConnectivityNode name="L4" pathName="S12/E1/Q1/L4"/>
			</Bay>
			<Bay name="Q2" desc="Turgi">
				<ConductingEquipment name="QA1" type="CBR">
					<LNode lnInst="1" lnClass="CILO" ldInst="MUnn" iedName="LE_IED"/>
					<Terminal connectivityNode="S12/E1/Q2/L0" substationName="S12" voltageLevelName="E1" bayName="Q2" cNodeName="L0"/>
					<Terminal connectivityNode="S12/E1/Q2/L1" substationName="S12" voltageLevelName="E1" bayName="Q2" cNodeName="L1"/>
				</ConductingEquipment>
				<ConductingEquipment name="QB1" type="DIS">
					<LNode lnInst="2" lnClass="CSWI" ldInst="MUnn" iedName="E1Q2SB1"/>
					<LNode lnInst="2" lnClass="CILO" ldInst="MUnn" iedName="LE_IED"/>
					<Terminal connectivityNode="S12/E1/Q4/B1" substationName="S12" voltageLevelName="E1" bayName="Q4" cNodeName="B1"/>
					<Terminal connectivityNode="S12/E1/Q2/L0" substationName="S12" voltageLevelName="E1" bayName="Q2" cNodeName="L0"/>
				</ConductingEquipment>
				<ConductingEquipment name="I1" type="CTR">
					<Terminal connectivityNode="S12/E1/Q2/L1" substationName="S12" voltageLevelName="E1" bayName="Q2" cNodeName="L1"/>
					<Terminal connectivityNode="S12/E1/Q2/L2" substationName="S12" voltageLevelName="E1" bayName="Q2" cNodeName="L2"/>
				</ConductingEquipment>
				<ConductingEquipment name="U1" type="VTR">
					<Terminal connectivityNode="S12/E1/Q2/L2" substationName="S12" voltageLevelName="E1" bayName="Q2" cNodeName="L2"/>
					<Terminal connectivityNode="S12/E1/Q2/L3" substationName="S12" voltageLevelName="E1" bayName="Q2" cNodeName="L3"/>
				</ConductingEquipment>
				<ConnectivityNode name="L0" pathName="S12/E1/Q2/L0"/>
				<ConnectivityNode name="L1" pathName="S12/E1/Q2/L1"/>
				<ConnectivityNode name="L2" pathName="S12/E1/Q2/L2"/>
				<ConnectivityNode name="L3" pathName="S12/E1/Q2/L3"/>
				<ConnectivityNode name="L4" pathName="S12/E1/Q2/L4"/>
			</Bay>
			<Bay name="Q3" desc="London">
				<LNode lnInst="1" lnClass="MMXU" ldInst="" iedName="E1Q3KA1"/>
				<LNode lnInst="1" lnClass="PDIS" ldInst="" iedName="E1Q3KA3"/>
				<LNode lnInst="1" lnClass="PDIF" ldInst="" iedName="E1Q3KA2"/>
				<ConductingEquipment name="QA1" type="CBR">
					<LNode lnInst="1" lnClass="CSWI" ldInst="MUnn" iedName="E1Q3SB1"/>
					<Terminal connectivityNode="S12/E1/Q3/L1" substationName="S12" voltageLevelName="E1" bayName="Q3" cNodeName="L1"/>
					<Terminal connectivityNode="S12/E1/Q3/L2" substationName="S12" voltageLevelName="E1" bayName="Q3" cNodeName="L2"/>
				</ConductingEquipment>
				<ConductingEquipment name="QB1" type="DIS">
					<Terminal connectivityNode="S12/E1/W1/BB1" substationName="S12" voltageLevelName="E1" bayName="W1" cNodeName="BB1"/>
					<Terminal connectivityNode="S12/E1/Q3/L1" substationName="S12" voltageLevelName="E1" bayName="Q3" cNodeName="L1"/>
				</ConductingEquipment>
				<ConductingEquipment name="U1" type="VTR">
					<Terminal connectivityNode="S12/E1/Q3/L2" substationName="S12" voltageLevelName="E1" bayName="Q3" cNodeName="L2"/>
					<Terminal connectivityNode="S12/E1/Q3/L3" substationName="S12" voltageLevelName="E1" bayName="Q3" cNodeName="L3"/>
				</ConductingEquipment>
				<ConductingEquipment name="I1" type="CTR">
					<Terminal connectivityNode="S12/E1/Q3/L3" substationName="S12" voltageLevelName="E1" bayName="Q3" cNodeName="L3"/>
					<Terminal connectivityNode="S12/E1/Q3/L4" substationName="S12" voltageLevelName="E1" bayName="Q3" cNodeName="L4"/>
				</ConductingEquipment>
				<ConnectivityNode name="L1" pathName="S12/E1/Q3/L1"/>
				<ConnectivityNode name="L2" pathName="S12/E1/Q3/L2"/>
				<ConnectivityNode name="L3" pathName="S12/E1/Q3/L3"/>
				<ConnectivityNode name="L4" pathName="S12/E1/Q3/L4"/>
			</Bay>
			<Bay name="Q4">
				<ConnectivityNode name="B1" pathName="S12/E1/Q4/B1"/>
			</Bay>
			<Bay name="W1">
				<ConnectivityNode name="BB1" pathName="S12/E1/W1/BB1"/>
			</Bay>
		</VoltageLevel>
	</Substation>
	<Communication>
		<SubNetwork name="W01" type="8-MMS">
			<Text>Station bus</Text>
			<BitRate unit="b/s">10</BitRate>
			<ConnectedAP iedName="LE_IED" apName="S1">
				<Address>
					<P type="IP">10.0.0.11</P>
					<P type="IP-SUBNET">255.255.255.0</P>
					<P type="IP-GATEWAY">10.0.0.101</P>
					<P type="OSI-TSEL">00000001</P>
					<P type="OSI-PSEL">01</P>
					<P type="OSI-SSEL">01</P>
				</Address>
				<GSE ldInst="MUnn" cbName="SyckResult">
					<Address>
						<P type="MAC-Address">01-0C-CD-01-00-02</P>
						<P type="APPID">3001</P>
						<P type="VLAN-PRIORITY">4</P>
					</Address>
				</GSE>
				<GSE ldInst="MUnn" cbName="MMXUResult">
					<Address>
						<P type="MAC-Address">01-0C-CD-01-00-02</P>
						<P type="APPID">3001</P>
						<P type="VLAN-PRIORITY">4</P>
					</Address>
				</GSE>
				<PhysConn type="Plug">
					<P type="Type">FOC</P>
					<P type="Plug">ST</P>
				</PhysConn>
			</ConnectedAP>
			<ConnectedAP iedName="LE_IED" apName="S1">
				<Address>
					<P type="IP">10.0.0.1</P>
					<P type="IP-SUBNET">255.255.255.0</P>
					<P type="IP-GATEWAY">10.0.0.101</P>
					<P type="OSI-TSEL">00000001</P>
					<P type="OSI-PSEL">01</P>
					<P type="OSI-SSEL">01</P>
				</Address>
				<GSE ldInst="MUnn" cbName="ItlPositions">
					<Address>
						<P type="MAC-Address">01-0C-CD-01-00-04</P>
						<P type="APPID">3000</P>
						<P type="VLAN-PRIORITY">4</P>
					</Address>
				</GSE>
				<GSE ldInst="MUnn" cbName="AnotherPositions">
					<Address>
						<P type="MAC-Address">01-0C-CD-01-00-04</P>
						<P type="APPID">3000</P>
						<P type="VLAN-PRIORITY">4</P>
					</Address>
				</GSE>
				<GSE ldInst="MUnn" cbName="MSVCB02">
					<Address>
						<P type="MAC-Address">01-0C-CD-01-00-04</P>
						<P type="APPID">3000</P>
						<P type="VLAN-PRIORITY">4</P>
					</Address>
				</GSE>
				<SMV ldInst="MUnn" cbName="MSVCB01">
					<Address>
						<P type="MAC-Address">01-0C-CD-04-00-01</P>
						<P type="APPID">4000</P>
						<P type="VLAN-ID">123</P>
						<P type="VLAN-PRIORITY">4</P>
					</Address>
				</SMV>
				<SMV ldInst="MUnn" cbName="Volt">
					<Address>
						<P type="MAC-Address">01-0C-CD-04-00-01</P>
						<P type="APPID">4000</P>
						<P type="VLAN-ID">123</P>
						<P type="VLAN-PRIORITY">4</P>
					</Address>
				</SMV>
				<SMV ldInst="MUnn" cbName="rmxuCB">
					<Address>
						<P type="MAC-Address">01-0C-CD-04-00-01</P>
						<P type="APPID">4000</P>
						<P type="VLAN-ID">123</P>
						<P type="VLAN-PRIORITY">4</P>
					</Address>
				</SMV>
			</ConnectedAP>
			<ConnectedAP iedName="E1Q1BP2" apName="S1">
				<Address>
					<P type="IP">10.0.0.2</P>
					<P type="IP-SUBNET">255.255.255.0</P>
					<P type="IP-GATEWAY">10.0.0.101</P>
					<P type="OSI-TSEL">00000001</P>
					<P type="OSI-PSEL">01</P>
					<P type="OSI-SSEL">01</P>
				</Address>
			</ConnectedAP>
			<ConnectedAP iedName="E1Q1BP3" apName="S1">
				<Address>
					<P type="IP">10.0.0.3</P>
					<P type="IP-SUBNET">255.255.255.0</P>
					<P type="IP-GATEWAY">10.0.0.101</P>
					<P type="OSI-TSEL">00000001</P>
					<P type="OSI-PSEL">01</P>
					<P type="OSI-SSEL">01</P>
				</Address>
			</ConnectedAP>
		</SubNetwork>
	</Communication>
	<IED name="LE_IED">
		<Services>
			<DynAssociation/>
			<GetDirectory/>
			<GetDataObjectDefinition/>
			<GetDataSetValue/>
			<DataSetDirectory/>
			<ReadWrite/>
			<FileHandling/>
			<ConfDataSet max="4" maxAttributes="50"/>
			<ConfReportControl max="12"/>
			<ReportSettings bufTime="Dyn" cbName="Conf" rptID="Dyn" datSet="Conf" intgPd="Dyn" optFields="Conf"/>
			<ConfLogControl max="1"/>
			<ConfLNs fixLnInst="true"/>
			<GetCBValues/>
			<GOOSE max="2"/>
			<GSESettings appID="Conf" cbName="Conf" datSet="Conf"/>
		</Services>
		<AccessPoint name="S1">
			<Server>
				<Authentication/>
				<LDevice inst="MUnn">
					<LN0 lnType="IEC_61850_9_2LELLN0" lnClass="LLN0" inst="">
						<DataSet name="PhsMeas1">
							<FCDA ldInst="MUnn" prefix="" lnClass="TCTR" lnInst="1" fc="MX" doName="Amp" daName="instMag" />
							<FCDA ldInst="MUnn" prefix="" lnClass="TCTR" lnInst="1" fc="MX" doName="Amp" daName="q" />
							<FCDA ldInst="MUnn" prefix="" lnClass="TCTR" lnInst="2" fc="MX" doName="Amp" daName="instMag" />
							<FCDA ldInst="MUnn" prefix="" lnClass="TCTR" lnInst="2" fc="MX" doName="Amp" daName="q" />
							<FCDA ldInst="MUnn" prefix="" lnClass="TCTR" lnInst="3" fc="MX" doName="Amp" daName="instMag" />
							<FCDA ldInst="MUnn" prefix="" lnClass="TCTR" lnInst="3" fc="MX" doName="Amp" daName="q" />
							<FCDA ldInst="MUnn" prefix="" lnClass="TCTR" lnInst="4" fc="MX" doName="Amp" daName="instMag" />
							<FCDA ldInst="MUnn" prefix="" lnClass="TCTR" lnInst="4" fc="MX" doName="Amp" daName="q" />
							<FCDA ldInst="MUnn" prefix="" lnClass="TVTR" lnInst="1" fc="MX" doName="Vol" daName="instMag" />
							<FCDA ldInst="MUnn" prefix="" lnClass="TVTR" lnInst="1" fc="MX" doName="Vol" daName="q" />
							<FCDA ldInst="MUnn" prefix="" lnClass="TVTR" lnInst="2" fc="MX" doName="Vol" daName="instMag" />
							<FCDA ldInst="MUnn" prefix="" lnClass="TVTR" lnInst="2" fc="MX" doName="Vol" daName="q" />
							<FCDA ldInst="MUnn" prefix="" lnClass="TVTR" lnInst="3" fc="MX" doName="Vol" daName="instMag" />
							<FCDA ldInst="MUnn" prefix="" lnClass="TVTR" lnInst="3" fc="MX" doName="Vol" daName="q" />
							<FCDA ldInst="MUnn" prefix="" lnClass="TVTR" lnInst="4" fc="MX" doName="Vol" daName="instMag" />
							<FCDA ldInst="MUnn" prefix="" lnClass="TVTR" lnInst="4" fc="MX" doName="Vol" daName="q" />
						</DataSet>
						<GSEControl name="MSVCB02" datSet="PhsMeas1" appID="0000MU0002" confRev="1"/>
						<SampledValueControl name="MSVCB01" datSet="PhsMeas1" smvID="0000MU0001" smpRate="4800" nofASDU="1" multicast="true" confRev="1">
							<SmvOpts sampleRate="true" refreshTime="true" sampleSynchronized="true"/>
						</SampledValueControl>
					</LN0>
					<LN lnType="IEC_61850_9_2LETCTR" lnClass="TCTR" inst="1"/>
					<LN lnType="IEC_61850_9_2LETCTR" lnClass="TCTR" inst="2"/>
					<LN lnType="IEC_61850_9_2LETCTR" lnClass="TCTR" inst="3"/>
					<LN lnType="IEC_61850_9_2LETCTR" lnClass="TCTR" inst="4"/>
					<LN lnType="IEC_61850_9_2LETVTR" lnClass="TVTR" inst="1"/>
					<LN lnType="IEC_61850_9_2LETVTR" lnClass="TVTR" inst="2"/>
					<LN lnType="IEC_61850_9_2LETVTR" lnClass="TVTR" inst="3"/>
					<LN lnType="IEC_61850_9_2LETVTR" lnClass="TVTR" inst="4"/>
				</LDevice>
			</Server>
		</AccessPoint>
	</IED>
	<IED name="LE_IED_RECV">
		<Services>
			<DynAssociation/>
			<GetDirectory/>
			<GetDataObjectDefinition/>
			<GetDataSetValue/>
			<DataSetDirectory/>
			<ReadWrite/>
			<FileHandling/>
			<ConfDataSet max="4"/>
			<ConfReportControl max="12"/>
			<ReportSettings bufTime="Dyn" cbName="Conf" rptID="Dyn" datSet="Conf" intgPd="Dyn" optFields="Conf"/>
			<ConfLogControl max="1"/>
			<GetCBValues/>
			<GOOSE max="2"/>
		</Services>
		<AccessPoint name="S1">
			<Server>
				<Authentication/>
				<LDevice inst="MUnn">
					<LN0 lnType="LN0" lnClass="LLN0" inst="">
					</LN0>
					<LN lnType="exampleMMXU" lnClass="MMXU" inst="1">
			            <Inputs>
							<ExtRef iedName="LE_IED" ldInst="MUnn" prefix="" lnClass="TCTR" lnInst="1" doName="Amp" daName="instMag" />
							<ExtRef iedName="LE_IED" ldInst="MUnn" prefix="" lnClass="TCTR" lnInst="2" doName="Amp" daName="instMag" />
							<ExtRef iedName="LE_IED" ldInst="MUnn" prefix="" lnClass="TCTR" lnInst="3" doName="Amp" daName="instMag" />
							<ExtRef iedName="LE_IED" ldInst="MUnn" prefix="" lnClass="TCTR" lnInst="4" doName="Amp" daName="instMag" />
							<ExtRef iedName="LE_IED" ldInst="MUnn" prefix="" lnClass="TVTR" lnInst="1" doName="Vol" daName="instMag" />
							<ExtRef iedName="LE_IED" ldInst="MUnn" prefix="" lnClass="TVTR" lnInst="2" doName="Vol" daName="instMag" />
							<ExtRef iedName="LE_IED" ldInst="MUnn" prefix="" lnClass="TVTR" lnInst="3" doName="Vol" daName="instMag" />
							<ExtRef iedName="LE_IED" ldInst="MUnn" prefix="" lnClass="TVTR" lnInst="4" doName="Vol" daName="instMag" />
			            </Inputs>
					</LN>
				</LDevice>
			</Server>
		</AccessPoint>
	</IED>
	<DataTypeTemplates>

		<LNodeType id="IEC_61850_9_2LELLN0" lnClass="LLN0">
			<DO name="Mod" type="IEC_61850_9_2LEINC"/>
		</LNodeType>
		<LNodeType id="IEC_61850_9_2LETCTR" lnClass="TCTR">
			<DO name="Amp" type="IEC_61850_9_2LESAVAmp"/>
		</LNodeType>
		<LNodeType id="IEC_61850_9_2LETVTR" lnClass="TVTR">
			<DO name="Vol" type="IEC_61850_9_2LESAVVol"/>
		</LNodeType>


		<LNodeType id="LN0" lnClass="LLN0">
			<DO name="Mod" type="myMod"/>
			<DO name="Health" type="myHealth"/>
			<DO name="Beh" type="myBeh"/>
			<DO name="NamPlt" type="myLPL"/>
		</LNodeType>
		<LNodeType id="LPHDa" lnClass="LPHD">
			<DO name="Mod" type="myMod"/>
			<DO name="Health" type="myHealth"/>
			<DO name="Beh" type="myBeh"/>
			<DO name="NamPlt" type="myLPL"/>
			<DO name="PhyNam" type="myDPL"/>
			<DO name="PhyHealth" type="myINS"/>
			<DO name="Proxy" type="mySPS"/>
		</LNodeType>
		<LNodeType id="CSWIa" lnClass="CSWI">
			<DO name="Mod" type="myMod"/>
			<DO name="Health" type="myHealth"/>
			<DO name="Beh" type="myBeh"/>
			<DO name="Pos" type="myPos"/>
			<DO name="GrpAl" type="mySPS"/>
		</LNodeType>
		<LNodeType id="MMXUa" lnClass="MMXU">
			<DO name="Mod" type="myMod"/>
			<DO name="Beh" type="myHealth"/>
			<DO name="Health" type="myBeh"/>
			<DO name="Amps" type="myMV"/>
			<DO name="Volts" type="myMV"/>
		</LNodeType>
		<LNodeType id="exampleMMXU" lnClass="MMXU">
			<DO name="Mod" type="myMod"/>
			<DO name="Beh" type="myHealth"/>
			<DO name="Health" type="myBeh"/>
			<DO name="A" type="simpleWYE"/>
		</LNodeType>
		<LNodeType id="exampleRMXU" lnClass="RMXU">
			<DO name="Mod" type="myMod"/>
			<DO name="Beh" type="myHealth"/>
			<DO name="Health" type="myBeh"/>
			<DO name="AmpLocPhsA" type="simpleSAV"/>
			<DO name="AmpLocPhsB" type="simpleSAV"/>
			<DO name="AmpLocPhsC" type="simpleSAV"/>
		</LNodeType>
		<LNodeType id="CILOa" lnClass="CILO">
			<DO name="Mod" type="myHealth"/>
			<DO name="Beh" type="myBeh"/>
			<DO name="Health" type="myINS"/>
			<DO name="EnaOpen" type="mySPS"/>
			<DO name="EnaClose" type="mySPS"/>
		</LNodeType>
		<LNodeType id="TVTRa" lnClass="TVTR">
			<DO name="Mod" type="myMod"/>
			<DO name="Health" type="myHealth"/>
			<DO name="Beh" type="myBeh"/>
			<DO name="Vol" type="mySAV"/>
		</LNodeType>
		<LNodeType id="RSYNa" lnClass="RSYN">
			<DO name="Mod" type="myMod"/>
			<DO name="Health" type="myHealth"/>
			<DO name="Beh" type="myBeh"/>
			<DO name="NamPlt" type="myLPL"/>
			<DO name="Rel" type="mySPS"/>
		</LNodeType>


		<DOType id="IEC_61850_9_2LESAVAmp" cdc="SAV">
			<DA name="instMag" bType="Struct" type="IEC_61850_9_2LEAV" fc="MX"/>
			<DA name="q" bType="Quality" fc="MX"/>
			<DA name="sVC" bType="Struct" type="IEC_61850_9_2LEsVCAmp" fc="CF"/>
		</DOType>
		<DOType id="IEC_61850_9_2LESAVVol" cdc="SAV">
			<DA name="instMag" bType="Struct" type="IEC_61850_9_2LEAV" fc="MX"/>
			<DA name="q" bType="Quality" fc="MX"/>
			<DA name="sVC" bType="Struct" type="IEC_61850_9_2LEsVCVol" fc="CF"/>
		</DOType>
		<DOType id="IEC_61850_9_2LEINC" cdc="INC">
			<DA name="ctlVal" fc="CO" bType="INT32"/>
			<DA name="stVal" fc="ST" bType="INT32" dchg="true"/>
			<DA name="q" fc="ST" bType="Quality" dchg="true"/>
			<DA name="t" fc="ST" bType="Timestamp" dchg="true"/>
		</DOType>


		<DOType id="myMod" cdc="INC">
			<DA name="ctlVal" fc="CO" bType="Enum" type="Mod"/>
			<DA name="stVal" fc="ST" dchg="true" bType="Enum" type="Mod"/>
			<DA name="q" fc="ST" bType="Quality" dchg="true"/>
			<DA name="t" fc="ST" bType="Timestamp" dchg="true"/>
		</DOType>
		<DOType id="myHealth" cdc="INS">
			<DA name="stVal" fc="ST" bType="Enum" dchg="true" type="Health"/>
		</DOType>
		<DOType id="myBeh" cdc="INS">
			<DA name="stVal" fc="ST" bType="Enum" dchg="true" type="Beh"/>
		</DOType>
		<DOType id="myINS" cdc="INS">
			<DA name="stVal" fc="ST" bType="INT32" dchg="true"/>
		</DOType>
		<DOType id="myLPL" cdc="LPL">
			<DA name="ldNs" fc="EX" bType="VisString255">
				<Val>IEC61850-7-4:2003</Val>
			</DA>
			<DA name="configRev" fc="DC" bType="VisString255">
				<Val>Rev 3.45</Val>
			</DA>
		</DOType>
		<DOType id="myDPL" cdc="DPL">
			<DA name="vendor" fc="DC" bType="VisString255">
				<Val>myVendorName</Val>
			</DA>
			<DA name="hwRev" fc="DC" bType="VisString255">
				<Val>Rev 1.23</Val>
			</DA>
		</DOType>
		<DOType id="myPos" cdc="DPC">
			<DA name="stVal" fc="ST" bType="Dbpos" dchg="true" type="Dbpos"/>
			<DA name="q" fc="ST" bType="Quality" qchg="true"/>
			<DA name="t" fc="ST" bType="Timestamp"/>
			<DA name="ctlVal" fc="CO" bType="BOOLEAN"/>
		</DOType>
		<DOType id="mySPS" cdc="SPS">
			<DA name="stVal" fc="ST" bType="INT32" dchg="true">
				 <Val>178</Val>
			</DA>
			<DA name="q" fc="ST" bType="Quality" qchg="true"/>
			<DA name="t" fc="ST" bType="Timestamp"/>
		</DOType>
		<DOType id="myMV" cdc="MV">
			<DA name="mag" fc="MX" bType="Struct" type="myAnalogValue" dchg="true"/>
			<DA name="q" fc="MX" bType="Quality" qchg="true"/>
			<DA name="t" fc="MX" bType="Timestamp"/>
			<DA name="sVC" fc="CF" bType="Struct" type="ScaledValueConfig" dchg="true"/>
			<DA name="int1" fc="MX" bType="INT32" qchg="true"/>
			<DA name="int2" fc="MX" bType="INT32" qchg="true"/>
			<DA name="int3" fc="MX" bType="INT32" qchg="true"/>
		</DOType>
		<DOType id="simpleMV" cdc="MV">
			<DA name="mag" fc="MX" bType="FLOAT32" dchg="true"/>
			<DA name="q" fc="MX" bType="Quality" qchg="true"/>
			<DA name="t" fc="MX" bType="Timestamp"/>
			<DA name="sVC" fc="CF" bType="Struct" type="ScaledValueConfig" dchg="true"/>
		</DOType>
		<DOType id="simpleCMV" cdc="CMV">
			<DA name="cVal" fc="MX" bType="Struct" type="simpleVector" dchg="true"/>
			<DA name="q" fc="MX" bType="Quality" qchg="true"/>
			<DA name="t" fc="MX" bType="Timestamp"/>
			<SDO name="testSecondLayerSDO" type="mySPS"/>
			<DA name="testInteger" fc="ST" bType="INT32" dchg="true">
				 <Val>-1234</Val>
			</DA>
			<DA name="testBoolean" fc="ST" bType="BOOLEAN" dchg="true">
				 <Val>1</Val>
			</DA>
		</DOType>
		<DOType id="simpleWYE" cdc="WYE">
			<SDO name="phsA" type="simpleCMV"/>
			<SDO name="phsB" type="simpleCMV"/>
			<SDO name="phsC" type="simpleCMV"/>
			<!--<DA name="phsA" fc="MX" bType="Struct" type="simpleCMV" dchg="true"/>
			<DA name="phsB" fc="MX" bType="Struct" type="simpleCMV" dchg="true"/>
			<DA name="phsC" fc="MX" bType="Struct" type="simpleCMV" dchg="true"/>-->
		</DOType>
		<DOType id="myCMV" cdc="CMV">
			<DA name="cVal" fc="MX" bType="Struct" type="myVector" dchg="true"/>
			<DA name="q" fc="MX" bType="Quality" qchg="true"/>
			<DA name="t" fc="MX" bType="Timestamp"/>
		</DOType>
		<DOType id="mySEQ" cdc="SEQ">
			<SDO name="MUnn" type="myCMV"/>
			<SDO name="c2" type="myCMV"/>
			<SDO name="c3" type="myCMV"/>
			<DA name="seqT" fc="MX" bType="Enum" type="seqT"/>
		</DOType>
		<DOType id="mySAV" cdc="SAV">
			<DA name="instMag" fc="MX" bType="Struct" type="myAnalogValue"/>
			<DA name="q" fc="MX" bType="Quality" qchg="true"/>
		</DOType>
		<DOType id="simpleSAV" cdc="SAV">
			<DA name="instMag" fc="MX" bType="Struct" type="myAnalogValue"/>
			<DA name="q" fc="MX" bType="Quality" qchg="true"/>
		</DOType>
		<DAType id="myAnalogValue">
			<BDA name="f" bType="FLOAT32">
				 <Val>1.024</Val>
			</BDA>
		</DAType>
		<DAType id="ScaledValueConfig">
			<BDA name="scaleFactor" bType="FLOAT32"/>
			<BDA name="offset" bType="FLOAT32"/>
		</DAType>
		<DAType id="myVector">
			<BDA name="mag" bType="Struct" type="myAnalogValue"/>
			<BDA name="ang" bType="Struct" type="myAnalogValue"/>
		</DAType>
		<DAType id="simpleVector">
			<BDA name="mag" bType="Struct" type="myAnalogValue"/>
			<BDA name="ang" bType="Struct" type="myAnalogValue"/>
		</DAType>


		<DAType id="IEC_61850_9_2LEAV">
			<BDA name="i" bType="INT32"/>
		</DAType>
		<DAType id="IEC_61850_9_2LEsVCAmp">
			<BDA name="scaleFactor" bType="FLOAT32">
				<Val>0.001</Val>
			</BDA>
			<BDA name="offset" bType="FLOAT32">
				<Val>0</Val>
			</BDA>
		</DAType>
		<DAType id="IEC_61850_9_2LEsVCVol">
			<BDA name="scaleFactor" bType="FLOAT32">
				<Val>0.01</Val>
			</BDA>
			<BDA name="offset" bType="FLOAT32">
				<Val>0</Val>
			</BDA>
		</DAType>

		<EnumType id="ACDdir">
			<EnumVal ord="0">unknown</EnumVal>
			<EnumVal ord="1">forward</EnumVal>
			<EnumVal ord="2">backward</EnumVal>
			<EnumVal ord="3">both</EnumVal>
		</EnumType>
		<EnumType id="seqT">
			<EnumVal ord="0">pos-neg-zero</EnumVal>
			<EnumVal ord="1">dir-quad-zero</EnumVal>
		</EnumType>
		<EnumType id="Dbpos">
			<EnumVal ord="0">intermediate</EnumVal>
			<EnumVal ord="1">off</EnumVal>
			<EnumVal ord="2">on</EnumVal>
			<EnumVal ord="3">bad</EnumVal>
		</EnumType>
		<EnumType id="Tcmd">
			<EnumVal ord="0">stop</EnumVal>
			<EnumVal ord="1">lower</EnumVal>
			<EnumVal ord="2">higher</EnumVal>
			<EnumVal ord="3">reserved</EnumVal>
		</EnumType>
		<EnumType id="Beh">
			<EnumVal ord="1">on</EnumVal>
			<EnumVal ord="2">blocked</EnumVal>
			<EnumVal ord="3">test</EnumVal>
			<EnumVal ord="4">test/blocked</EnumVal>
			<EnumVal ord="5">off</EnumVal>
		</EnumType>
		<EnumType id="Mod">
			<EnumVal ord="1">on</EnumVal>
			<EnumVal ord="2">blocked</EnumVal>
			<EnumVal ord="3">test</EnumVal>
			<EnumVal ord="4">test/blocked</EnumVal>
			<EnumVal ord="5">off</EnumVal>
		</EnumType>
		<EnumType id="Health">
			<EnumVal ord="1">Ok</EnumVal>
			<EnumVal ord="2">Warning</EnumVal>
			<EnumVal ord="3">Alarm</EnumVal>
		</EnumType>
	</DataTypeTemplates>
</SCL>
