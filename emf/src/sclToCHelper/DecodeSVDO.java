package sclToCHelper;

import ch.iec._61850._2006.scl.TDOType;
import ch.iec._61850._2006.scl.TSDO;
import ch.iec._61850._2006.scl.TDA;
import java.util.Iterator;

 public class DecodeSVDO
 {
  protected static String nl;
  public static synchronized DecodeSVDO create(String lineSeparator)
  {
    nl = lineSeparator;
    DecodeSVDO result = new DecodeSVDO();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "int decode_";
  protected final String TEXT_2 = "(unsigned char *buf, struct ";
  protected final String TEXT_3 = " *";
  protected final String TEXT_4 = ") {" + NL + "\tint size = 0;";
  protected final String TEXT_5 = NL + "\tsize += decode_";
  protected final String TEXT_6 = "(&buf[size], &";
  protected final String TEXT_7 = "->";
  protected final String TEXT_8 = ");";
  protected final String TEXT_9 = NL + "\tsize += decode_";
  protected final String TEXT_10 = "(&buf[size], &";
  protected final String TEXT_11 = "->";
  protected final String TEXT_12 = ");";
  protected final String TEXT_13 = NL + "\tsize += DECODE_CTYPE_ENUM(&buf[size], (CTYPE_INT32 *) &";
  protected final String TEXT_14 = "->";
  protected final String TEXT_15 = ");";
  protected final String TEXT_16 = NL + "\tsize += DECODE_CTYPE_";
  protected final String TEXT_17 = "(&buf[size], &";
  protected final String TEXT_18 = "->";
  protected final String TEXT_19 = ");";
  protected final String TEXT_20 = NL + NL + "\treturn size;" + NL + "}";
  protected final String TEXT_21 = NL;

   public String generate(Object argument, String type)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     TDOType doType = (TDOType) argument; 
String doID = doType.getId(); 
Iterator<TDA> das = doType.getDA().iterator();
Iterator<TSDO> sdos = doType.getSDO().iterator();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(doID);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(doID);
    stringBuffer.append(TEXT_3);
    stringBuffer.append(doID);
    stringBuffer.append(TEXT_4);
    	while (sdos.hasNext()) {
		TSDO sdo = sdos.next();
		String sdoType = sdo.getType();
    stringBuffer.append(TEXT_5);
    stringBuffer.append(sdoType);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(doID);
    stringBuffer.append(TEXT_7);
    stringBuffer.append( sdo.getName());
    stringBuffer.append(TEXT_8);
    
	}
	while (das.hasNext()) {
		TDA da = das.next();
		String daBType = da.getBType().toString();
if (daBType.equals("Struct")) {
    stringBuffer.append(TEXT_9);
    stringBuffer.append(da.getType());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(doID);
    stringBuffer.append(TEXT_11);
    stringBuffer.append( da.getName());
    stringBuffer.append(TEXT_12);
    
}
else if (daBType.equals("Enum")) {
    stringBuffer.append(TEXT_13);
    stringBuffer.append(doID);
    stringBuffer.append(TEXT_14);
    stringBuffer.append( da.getName());
    stringBuffer.append(TEXT_15);
    
}
else {
    stringBuffer.append(TEXT_16);
    stringBuffer.append(daBType.toUpperCase());
    stringBuffer.append(TEXT_17);
    stringBuffer.append(doID);
    stringBuffer.append(TEXT_18);
    stringBuffer.append( da.getName());
    stringBuffer.append(TEXT_19);
    
	}
}
    stringBuffer.append(TEXT_20);
    stringBuffer.append(TEXT_21);
    return stringBuffer.toString();
  }
}
