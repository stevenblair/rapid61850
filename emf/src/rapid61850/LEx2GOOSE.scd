<?xml version="1.0" encoding="UTF-8"?>
<SCL xmlns="http://www.iec.ch/61850/2006/SCL" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://www.iec.ch/61850/2006/SCL">
<Header id="SCD Example" nameStructure="IEDName"/>
<Communication>
    <SubNetwork name="W01" type="8-MMS">
      <Text>Station bus</Text>
      <BitRate unit="b/s">10</BitRate>
      <ConnectedAP iedName="LE_IED" apName="S1">
        <Address>
          <P type="IP">10.0.0.1</P>
          <P type="IP-SUBNET">255.255.255.0</P>
          <P type="IP-GATEWAY">10.0.0.101</P>
          <P type="OSI-TSEL">00000001</P>
          <P type="OSI-PSEL">01</P>
          <P type="OSI-SSEL">01</P>
        </Address>
        <SMV ldInst="MUnn" cbName="MSVCB01">
          <Address>
            <P type="MAC-Address">01-0C-CD-04-00-01</P>
            <P type="APPID">4000</P>
            <P type="VLAN-ID">000</P>
            <P type="VLAN-PRIORITY">4</P>
          </Address>
        </SMV>
        <SMV ldInst="MUnn" cbName="MSVCB02">
          <Address>
            <P type="MAC-Address">01-0C-CD-04-00-01</P>
            <P type="APPID">4000</P>
            <P type="VLAN-ID">000</P>
            <P type="VLAN-PRIORITY">4</P>
          </Address>
        </SMV>
      </ConnectedAP>
      <ConnectedAP iedName="LE_IED_RECV" apName="S1">
        <GSE ldInst="MUnn" cbName="TripMsg1">
          <Address>
            <P type="MAC-Address">01-0C-CD-01-00-02</P>
            <P type="APPID">3001</P>
            <P type="VLAN-PRIORITY">4</P>
          </Address>
        </GSE>
      </ConnectedAP>
    </SubNetwork>
  </Communication>
<IED name="LE_IED">
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
            <DataSet name="PhsMeas2">
              <FCDA ldInst="MUnn" prefix="" lnClass="TCTR" lnInst="5" fc="MX" doName="Amp" daName="instMag" />
              <FCDA ldInst="MUnn" prefix="" lnClass="TCTR" lnInst="5" fc="MX" doName="Amp" daName="q" />
              <FCDA ldInst="MUnn" prefix="" lnClass="TCTR" lnInst="6" fc="MX" doName="Amp" daName="instMag" />
              <FCDA ldInst="MUnn" prefix="" lnClass="TCTR" lnInst="6" fc="MX" doName="Amp" daName="q" />
              <FCDA ldInst="MUnn" prefix="" lnClass="TCTR" lnInst="7" fc="MX" doName="Amp" daName="instMag" />
              <FCDA ldInst="MUnn" prefix="" lnClass="TCTR" lnInst="7" fc="MX" doName="Amp" daName="q" />
              <FCDA ldInst="MUnn" prefix="" lnClass="TCTR" lnInst="8" fc="MX" doName="Amp" daName="instMag" />
              <FCDA ldInst="MUnn" prefix="" lnClass="TCTR" lnInst="8" fc="MX" doName="Amp" daName="q" />
              <FCDA ldInst="MUnn" prefix="" lnClass="TVTR" lnInst="5" fc="MX" doName="Vol" daName="instMag" />
              <FCDA ldInst="MUnn" prefix="" lnClass="TVTR" lnInst="5" fc="MX" doName="Vol" daName="q" />
              <FCDA ldInst="MUnn" prefix="" lnClass="TVTR" lnInst="6" fc="MX" doName="Vol" daName="instMag" />
              <FCDA ldInst="MUnn" prefix="" lnClass="TVTR" lnInst="6" fc="MX" doName="Vol" daName="q" />
              <FCDA ldInst="MUnn" prefix="" lnClass="TVTR" lnInst="7" fc="MX" doName="Vol" daName="instMag" />
              <FCDA ldInst="MUnn" prefix="" lnClass="TVTR" lnInst="7" fc="MX" doName="Vol" daName="q" />
              <FCDA ldInst="MUnn" prefix="" lnClass="TVTR" lnInst="8" fc="MX" doName="Vol" daName="instMag" />
              <FCDA ldInst="MUnn" prefix="" lnClass="TVTR" lnInst="8" fc="MX" doName="Vol" daName="q" />
            </DataSet>
            <SampledValueControl name="MSVCB01" datSet="PhsMeas1" smvID="000MU0001" smpRate="4000" nofASDU="1" confRev="1">
              <SmvOpts refreshTime="false" sampleSynchronized="true" sampleRate="false" security="false" />
            </SampledValueControl>
            <SampledValueControl name="MSVCB02" datSet="PhsMeas2" smvID="000MU0101" smpRate="4000" nofASDU="1" confRev="1">
              <SmvOpts refreshTime="false" sampleSynchronized="true" sampleRate="false" security="false" />
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

          <LN lnType="IEC_61850_9_2LETCTR" lnClass="TCTR" inst="5"/>
          <LN lnType="IEC_61850_9_2LETCTR" lnClass="TCTR" inst="6"/>
          <LN lnType="IEC_61850_9_2LETCTR" lnClass="TCTR" inst="7"/>
          <LN lnType="IEC_61850_9_2LETCTR" lnClass="TCTR" inst="8"/>
          <LN lnType="IEC_61850_9_2LETVTR" lnClass="TVTR" inst="5"/>
          <LN lnType="IEC_61850_9_2LETVTR" lnClass="TVTR" inst="6"/>
          <LN lnType="IEC_61850_9_2LETVTR" lnClass="TVTR" inst="7"/>
          <LN lnType="IEC_61850_9_2LETVTR" lnClass="TVTR" inst="8"/>
        </LDevice>
      </Server>
    </AccessPoint>
</IED>
<IED name="LE_IED_RECV">
    <AccessPoint name="S1">
      <Server>
        <Authentication/>
        <LDevice inst="MUnn">
          <LN0 lnType="IEC_61850_9_2LELLN0" lnClass="LLN0" inst="">
            <DataSet name="TripMsg1">
              <FCDA ldInst="MUnn" prefix="" lnClass="PDIF" lnInst="1" fc="ST" doName="Op" daName="general" />
              <FCDA ldInst="MUnn" prefix="" lnClass="PDIF" lnInst="1" fc="ST" doName="Op" daName="q" />
              <FCDA ldInst="MUnn" prefix="" lnClass="PDIF" lnInst="1" fc="ST" doName="Op" daName="t" />
            </DataSet>
            <GSEControl name="TripMsg1" datSet="TripMsg1" appID="TripMsg1" confRev="1"/>
          </LN0>
          <LN lnType="IEC_61850_9_2LETCTR" lnClass="TCTR" inst="1">
            <Inputs>
              <ExtRef iedName="LE_IED" ldInst="MUnn" prefix="" lnClass="TCTR" lnInst="1" doName="Amp" daName="instMag" />
              <ExtRef iedName="LE_IED" ldInst="MUnn" prefix="" lnClass="TCTR" lnInst="2" doName="Amp" daName="instMag" />
              <ExtRef iedName="LE_IED" ldInst="MUnn" prefix="" lnClass="TCTR" lnInst="3" doName="Amp" daName="instMag" />
              <ExtRef iedName="LE_IED" ldInst="MUnn" prefix="" lnClass="TCTR" lnInst="4" doName="Amp" daName="instMag" />
              <ExtRef iedName="LE_IED" ldInst="MUnn" prefix="" lnClass="TVTR" lnInst="1" doName="Vol" daName="instMag" />
              <ExtRef iedName="LE_IED" ldInst="MUnn" prefix="" lnClass="TVTR" lnInst="2" doName="Vol" daName="instMag" />
              <ExtRef iedName="LE_IED" ldInst="MUnn" prefix="" lnClass="TVTR" lnInst="3" doName="Vol" daName="instMag" />
              <ExtRef iedName="LE_IED" ldInst="MUnn" prefix="" lnClass="TVTR" lnInst="4" doName="Vol" daName="instMag" />

              <ExtRef iedName="LE_IED" ldInst="MUnn" prefix="" lnClass="TCTR" lnInst="5" doName="Amp" daName="instMag" />
              <ExtRef iedName="LE_IED" ldInst="MUnn" prefix="" lnClass="TCTR" lnInst="6" doName="Amp" daName="instMag" />
              <ExtRef iedName="LE_IED" ldInst="MUnn" prefix="" lnClass="TCTR" lnInst="7" doName="Amp" daName="instMag" />
              <ExtRef iedName="LE_IED" ldInst="MUnn" prefix="" lnClass="TCTR" lnInst="8" doName="Amp" daName="instMag" />
              <ExtRef iedName="LE_IED" ldInst="MUnn" prefix="" lnClass="TVTR" lnInst="5" doName="Vol" daName="instMag" />
              <ExtRef iedName="LE_IED" ldInst="MUnn" prefix="" lnClass="TVTR" lnInst="6" doName="Vol" daName="instMag" />
              <ExtRef iedName="LE_IED" ldInst="MUnn" prefix="" lnClass="TVTR" lnInst="7" doName="Vol" daName="instMag" />
              <ExtRef iedName="LE_IED" ldInst="MUnn" prefix="" lnClass="TVTR" lnInst="8" doName="Vol" daName="instMag" />
            </Inputs>
          </LN>
          <LN lnType="IEC_61850_9_2LETCTR" lnClass="TCTR" inst="2">
            
          </LN>
          <LN lnType="IEC_61850_9_2LETCTR" lnClass="TCTR" inst="3">
          </LN>
          <LN lnType="IEC_61850_9_2LETCTR" lnClass="TCTR" inst="4">
          </LN>
          <LN lnType="IEC_61850_9_2LETVTR" lnClass="TVTR" inst="1">
          </LN>
          <LN lnType="IEC_61850_9_2LETVTR" lnClass="TVTR" inst="2">
          </LN>
          <LN lnType="IEC_61850_9_2LETVTR" lnClass="TVTR" inst="3">
          </LN>
          <LN lnType="IEC_61850_9_2LETVTR" lnClass="TVTR" inst="4">
          </LN>

          <LN lnType="PDIFa" lnClass="PDIF" inst="1">
          </LN>
        </LDevice>
      </Server>
    </AccessPoint>
</IED>


<IED name="LE_IED_TRIP">
    <AccessPoint name="S1">
      <Server>
        <Authentication/>
        <LDevice inst="CB">
          <LN0 lnType="Trip_LLN0" lnClass="LLN0" inst="">
          </LN0>
          <LN lnType="XCBRa" lnClass="XCBR" inst="1">
            <Inputs>
              <ExtRef iedName="LE_IED_RECV" ldInst="MUnn" prefix="" lnClass="PDIF" lnInst="1" doName="Op" daName="general" />
            </Inputs>
          </LN>
        </LDevice>
      </Server>
    </AccessPoint>
</IED>



<DataTypeTemplates>
    <LNodeType id="XCBRa" lnClass="XCBR">
      <!--Mandatory DOs ignored for simplicity-->
    </LNodeType>
    <LNodeType id="PDIFa" lnClass="PDIF">
      <DO name="Op" type="simpleACT"/>
    </LNodeType>
    <LNodeType id="Trip_LLN0" lnClass="LLN0">
      <DO name="Mod" type="IEC_61850_9_2LEINC"/>
    </LNodeType>
    <LNodeType id="IEC_61850_9_2LELLN0" lnClass="LLN0">
      <DO name="Mod" type="IEC_61850_9_2LEINC"/>
    </LNodeType>
    <LNodeType id="IEC_61850_9_2LETCTR" lnClass="TCTR">
      <DO name="Amp" type="IEC_61850_9_2LESAVAmp"/>
    </LNodeType>
    <LNodeType id="IEC_61850_9_2LETVTR" lnClass="TVTR">
      <DO name="Vol" type="IEC_61850_9_2LESAVVol"/>
    </LNodeType>
    <DOType id="simpleACT" cdc="ACT">
      <DA name="general" bType="BOOLEAN" fc="ST">
        <Val>false</Val>
      </DA>
      <DA name="q" bType="Quality" fc="ST"/>
      <DA name="t" fc="ST" bType="Timestamp" dchg="true"/>
    </DOType>
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
</DataTypeTemplates>
</SCL>
