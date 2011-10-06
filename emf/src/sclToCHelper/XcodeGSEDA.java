package sclToCHelper;

import ch.iec._61850._2006.scl.TDAType;
import ch.iec._61850._2006.scl.TBDA;
import java.util.Iterator;

 public class XcodeGSEDA
 {
  protected static String nl;
  public static synchronized XcodeGSEDA create(String lineSeparator)
  {
    nl = lineSeparator;
    XcodeGSEDA result = new XcodeGSEDA();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "int ";
  protected final String TEXT_2 = "_";
  protected final String TEXT_3 = "(unsigned char *buf, struct ";
  protected final String TEXT_4 = " *";
  protected final String TEXT_5 = ") {" + NL + "\tint offset = 0;" + NL + "\t" + NL + "\tbuf[offset++] = 0xA2;" + NL + "\toffset += encodeLength(&buf[offset], ber_get_length_";
  protected final String TEXT_6 = "(";
  protected final String TEXT_7 = "));" + NL + "\t";
  protected final String TEXT_8 = NL + "\toffset += ";
  protected final String TEXT_9 = "_";
  protected final String TEXT_10 = "(&buf[offset], &";
  protected final String TEXT_11 = "->";
  protected final String TEXT_12 = ");";
  protected final String TEXT_13 = NL + "\toffset += ";
  protected final String TEXT_14 = "_CTYPE_ENUM(&buf[offset], (CTYPE_INT32 *) &";
  protected final String TEXT_15 = "->";
  protected final String TEXT_16 = ");";
  protected final String TEXT_17 = NL + "\toffset += ";
  protected final String TEXT_18 = "_CTYPE_";
  protected final String TEXT_19 = "(&buf[offset], &";
  protected final String TEXT_20 = "->";
  protected final String TEXT_21 = ");";
  protected final String TEXT_22 = NL + NL + "\treturn offset;" + NL + "}";
  protected final String TEXT_23 = NL;

   public String generate(Object argument, String type)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     TDAType da = (TDAType) argument;
String daID = da.getId(); 
Iterator<TBDA> bdas = da.getBDA().iterator();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(type);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(daID);
    stringBuffer.append(TEXT_3);
    stringBuffer.append(daID);
    stringBuffer.append(TEXT_4);
    stringBuffer.append(daID);
    stringBuffer.append(TEXT_5);
    stringBuffer.append(daID);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(daID);
    stringBuffer.append(TEXT_7);
    
	while (bdas.hasNext()) {
		TBDA bda = bdas.next();
		String bdaBType = bda.getBType().toString();
if (bdaBType.equals("Struct")) {
    stringBuffer.append(TEXT_8);
    stringBuffer.append(type);
    stringBuffer.append(TEXT_9);
    stringBuffer.append(bda.getType());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(daID);
    stringBuffer.append(TEXT_11);
    stringBuffer.append( bda.getName());
    stringBuffer.append(TEXT_12);
    
}
else if (bdaBType.equals("Enum")) {
    stringBuffer.append(TEXT_13);
    stringBuffer.append(type.toUpperCase());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(daID);
    stringBuffer.append(TEXT_15);
    stringBuffer.append( bda.getName());
    stringBuffer.append(TEXT_16);
    
}
else {
    stringBuffer.append(TEXT_17);
    stringBuffer.append(type.toUpperCase());
    stringBuffer.append(TEXT_18);
    stringBuffer.append(bdaBType.toUpperCase());
    stringBuffer.append(TEXT_19);
    stringBuffer.append(daID);
    stringBuffer.append(TEXT_20);
    stringBuffer.append( bda.getName());
    stringBuffer.append(TEXT_21);
    
	}
}
    stringBuffer.append(TEXT_22);
    stringBuffer.append(TEXT_23);
    return stringBuffer.toString();
  }
}
