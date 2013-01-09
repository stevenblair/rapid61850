package rapid61850.templates;

import rapid61850.CSource;
import java.util.Iterator;

public class CSourceInterfaceTemplate
{
  protected static String nl;
  public static synchronized CSourceInterfaceTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    CSourceInterfaceTemplate result = new CSourceInterfaceTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "#include <pcap.h>" + NL + "" + NL + "unsigned char bufIn[2048] = {0};" + NL + "unsigned char bufOut[2048] = {0};" + NL + "" + NL + "pcap_t *fp;" + NL + "char errbuf[PCAP_ERRBUF_SIZE];" + NL + "" + NL + "void D1Q1SB4_S1_C1_RSYNa_1_gse_inputs_ItlPositions_datasetDecodeDone(CTYPE_INT32U timeAllowedToLive, CTYPE_TIMESTAMP T, CTYPE_INT32U stNum, CTYPE_INT32U sqNum) {" + NL + "" + NL + "}" + NL + "" + NL + "" + NL + "pcap_t *init_pcap() {" + NL + "\tpcap_t *fpl;" + NL + "    pcap_if_t *alldevs;" + NL + "    pcap_if_t *used_if;" + NL + "" + NL + "    /* Retrieve the device list from the local machine */" + NL + "#ifdef _WIN32" + NL + "    if (pcap_findalldevs_ex(PCAP_SRC_IF_STRING, NULL /* auth is not needed */, &alldevs, errbuf) == -1) {" + NL + "        fprintf(stderr, \"Error in pcap_findalldevs_ex: %s\\n\", errbuf);" + NL + "        exit(1);" + NL + "    }" + NL + "#else" + NL + "    if (pcap_findalldevs(&alldevs, errbuf) == -1) {" + NL + "    \tfprintf(stderr, \"Error in pcap_findalldevs: %s\\n\", errbuf);" + NL + "    \texit(1);" + NL + "    }" + NL + "#endif" + NL + "" + NL + "    used_if = alldevs;" + NL + "" + NL + "    // find VirtualBox's \"Sun\" interface" + NL + "    /*while (strstr(used_if->description, \"Sun\") == NULL && used_if->next != NULL) {" + NL + "    \tused_if = used_if->next;" + NL + "    }*/" + NL + "" + NL + "    fprintf(stdout, \"network interface: %s\\n\", used_if->name);" + NL + "    fflush(stdout);" + NL + "" + NL + "\tif ((fpl = pcap_open_live(used_if->name,\t\t// name of the device" + NL + "\t\t\t\t\t\t\t 65536,\t\t\t// portion of the packet to capture. It doesn't matter in this case" + NL + "\t\t\t\t\t\t\t 1,\t\t\t\t// promiscuous mode (nonzero means promiscuous)" + NL + "\t\t\t\t\t\t\t 1000,\t\t\t// read timeout" + NL + "\t\t\t\t\t\t\t errbuf\t\t\t// error buffer" + NL + "\t\t\t\t\t\t\t )) == NULL)" + NL + "\t{" + NL + "\t\tfprintf(stderr, \"\\nUnable to open the adapter. %s is not supported by WinPcap\\n\", alldevs->name);" + NL + "\t\texit(2);" + NL + "\t}" + NL + "" + NL + "    pcap_freealldevs(alldevs);" + NL + "" + NL + "\treturn fpl;" + NL + "}" + NL + "" + NL + "" + NL + "" + NL + "void start() {" + NL + "\tinitialise_iec61850();\t// initialise IEC 61850 library" + NL + "" + NL + "\tfp = init_pcap();\t// initialise platform-specific libpcap network interface" + NL + "" + NL + "\t// initialise send() functions for each SV and GSE control?" + NL + "" + NL + "\t// initialise callback wrappers?" + NL + "\tD1Q1SB4.S1.C1.RSYNa_1.gse_inputs_ItlPositions.datasetDecodeDone = &D1Q1SB4_S1_C1_RSYNa_1_gse_inputs_ItlPositions_datasetDecodeDone;" + NL + "}" + NL + "" + NL + "void stop() {" + NL + "\t// close network interface" + NL + "}" + NL + "" + NL + "int readPacket() {" + NL + "\t// read from Ethernet packet here" + NL + "\tint len = 0;" + NL + "" + NL + "\tgse_sv_packet_filter(bufIn, len);" + NL + "" + NL + "\treturn 0;" + NL + "}" + NL;
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     CSource header = (CSource) argument; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append(
header.getIncludes()
);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    stringBuffer.append(
header.manualFunctions.toString()
);
    stringBuffer.append(TEXT_4);
    return stringBuffer.toString();
  }
}
