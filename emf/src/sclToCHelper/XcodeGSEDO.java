package sclToCHelper;

import ch.iec._61850._2006.scl.TDOType;
import ch.iec._61850._2006.scl.TSDO;
import ch.iec._61850._2006.scl.TDA;
import java.util.Iterator;

 public class XcodeGSEDO
 {
  protected static String nl;
  public static synchronized XcodeGSEDO create(String lineSeparator)
  {
    nl = lineSeparator;
    XcodeGSEDO result = new XcodeGSEDO();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "int ";
  protected final String TEXT_2 = "_";
  protected final String TEXT_3 = "(unsigned char *buf, struct ";
  protected final String TEXT_4 = " *";
  protected final String TEXT_5 = ") {" + NL + "\t//int size = 0;//ber_get_length_";
  protected final String TEXT_6 = "(";
  protected final String TEXT_7 = ");" + NL + "\tint offset = 0;" + NL + "\tbuf[offset++] = 0xA2;" + NL + "\toffset += encodeLength(&buf[offset], ber_get_length_";
  protected final String TEXT_8 = "(";
  protected final String TEXT_9 = "));" + NL + "\t";
  protected final String TEXT_10 = NL + "\toffset += ";
  protected final String TEXT_11 = "_";
  protected final String TEXT_12 = "(&buf[offset], &";
  protected final String TEXT_13 = "->";
  protected final String TEXT_14 = ");";
  protected final String TEXT_15 = NL + "\t//used to encode A2 and length here" + NL + "" + NL + "\toffset += ";
  protected final String TEXT_16 = "_";
  protected final String TEXT_17 = "(&buf[offset], &";
  protected final String TEXT_18 = "->";
  protected final String TEXT_19 = ");";
  protected final String TEXT_20 = NL + "\toffset += ";
  protected final String TEXT_21 = "_CTYPE_ENUM(&buf[offset], (CTYPE_INT32 *) &";
  protected final String TEXT_22 = "->";
  protected final String TEXT_23 = ");";
  protected final String TEXT_24 = NL + "\toffset += ";
  protected final String TEXT_25 = "_CTYPE_";
  protected final String TEXT_26 = "(&buf[offset], &";
  protected final String TEXT_27 = "->";
  protected final String TEXT_28 = ");";
  protected final String TEXT_29 = NL + NL + "\treturn offset;" + NL + "}";
  protected final String TEXT_30 = NL;

   public String generate(Object argument, String type)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     TDOType doType = (TDOType) argument; 
String doID = doType.getId(); 
Iterator<TDA> das = doType.getDA().iterator();
Iterator<TSDO> sdos = doType.getSDO().iterator();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(type);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(doID);
    stringBuffer.append(TEXT_3);
    stringBuffer.append(doID);
    stringBuffer.append(TEXT_4);
    stringBuffer.append(doID);
    stringBuffer.append(TEXT_5);
    stringBuffer.append(doID);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(doID);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(doID);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(doID);
    stringBuffer.append(TEXT_9);
    	while (sdos.hasNext()) {
		TSDO sdo = sdos.next();
		String sdoType = sdo.getType();
    stringBuffer.append(TEXT_10);
    stringBuffer.append(type);
    stringBuffer.append(TEXT_11);
    stringBuffer.append(sdoType);
    stringBuffer.append(TEXT_12);
    stringBuffer.append(doID);
    stringBuffer.append(TEXT_13);
    stringBuffer.append( sdo.getName());
    stringBuffer.append(TEXT_14);
    
	}
	while (das.hasNext()) {
		TDA da = das.next();
		String daBType = da.getBType().toString();
if (daBType.equals("Struct")) {
    stringBuffer.append(TEXT_15);
    stringBuffer.append(type);
    stringBuffer.append(TEXT_16);
    stringBuffer.append(da.getType());
    stringBuffer.append(TEXT_17);
    stringBuffer.append(doID);
    stringBuffer.append(TEXT_18);
    stringBuffer.append( da.getName());
    stringBuffer.append(TEXT_19);
    
}
else if (daBType.equals("Enum")) {
    stringBuffer.append(TEXT_20);
    stringBuffer.append(type.toUpperCase());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(doID);
    stringBuffer.append(TEXT_22);
    stringBuffer.append( da.getName());
    stringBuffer.append(TEXT_23);
    
}
else {
    stringBuffer.append(TEXT_24);
    stringBuffer.append(type.toUpperCase());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(daBType.toUpperCase());
    stringBuffer.append(TEXT_26);
    stringBuffer.append(doID);
    stringBuffer.append(TEXT_27);
    stringBuffer.append( da.getName());
    stringBuffer.append(TEXT_28);
    
	}
}
    stringBuffer.append(TEXT_29);
    stringBuffer.append(TEXT_30);
    return stringBuffer.toString();
  }
}
