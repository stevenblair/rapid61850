package sclToCHelper;

import ch.iec._61850._2006.scl.TDOType;
import ch.iec._61850._2006.scl.TSDO;
import ch.iec._61850._2006.scl.TDA;
import java.util.Iterator;

 public class XcodeSVDO
 {
  protected static String nl;
  public static synchronized XcodeSVDO create(String lineSeparator)
  {
    nl = lineSeparator;
    XcodeSVDO result = new XcodeSVDO();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "int ";
  protected final String TEXT_2 = "_";
  protected final String TEXT_3 = "(unsigned char *buf, struct ";
  protected final String TEXT_4 = " *";
  protected final String TEXT_5 = ") {" + NL + "\tint size = 0;";
  protected final String TEXT_6 = NL + "\tsize += ";
  protected final String TEXT_7 = "_";
  protected final String TEXT_8 = "(&buf[size], &";
  protected final String TEXT_9 = "->";
  protected final String TEXT_10 = ");";
  protected final String TEXT_11 = NL + "\tsize += ";
  protected final String TEXT_12 = "_";
  protected final String TEXT_13 = "(&buf[size], &";
  protected final String TEXT_14 = "->";
  protected final String TEXT_15 = ");";
  protected final String TEXT_16 = NL + "\tsize += ";
  protected final String TEXT_17 = "_CTYPE_ENUM(&buf[size], (CTYPE_INT32 *) &";
  protected final String TEXT_18 = "->";
  protected final String TEXT_19 = ");";
  protected final String TEXT_20 = NL + "\tsize += ";
  protected final String TEXT_21 = "_CTYPE_";
  protected final String TEXT_22 = "(&buf[size], &";
  protected final String TEXT_23 = "->";
  protected final String TEXT_24 = ");";
  protected final String TEXT_25 = NL + NL + "\treturn size;" + NL + "}";
  protected final String TEXT_26 = NL;

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
    	while (sdos.hasNext()) {
		TSDO sdo = sdos.next();
		String sdoType = sdo.getType();
    stringBuffer.append(TEXT_6);
    stringBuffer.append(type);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(sdoType);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(doID);
    stringBuffer.append(TEXT_9);
    stringBuffer.append( sdo.getName());
    stringBuffer.append(TEXT_10);
    
	}
	while (das.hasNext()) {
		TDA da = das.next();
		String daBType = da.getBType().toString();
if (daBType.equals("Struct")) {
    stringBuffer.append(TEXT_11);
    stringBuffer.append(type);
    stringBuffer.append(TEXT_12);
    stringBuffer.append(da.getType());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(doID);
    stringBuffer.append(TEXT_14);
    stringBuffer.append( da.getName());
    stringBuffer.append(TEXT_15);
    
}
else if (daBType.equals("Enum")) {
    stringBuffer.append(TEXT_16);
    stringBuffer.append(type.toUpperCase());
    stringBuffer.append(TEXT_17);
    stringBuffer.append(doID);
    stringBuffer.append(TEXT_18);
    stringBuffer.append( da.getName());
    stringBuffer.append(TEXT_19);
    
}
else {
    stringBuffer.append(TEXT_20);
    stringBuffer.append(type.toUpperCase());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(daBType.toUpperCase());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(doID);
    stringBuffer.append(TEXT_23);
    stringBuffer.append( da.getName());
    stringBuffer.append(TEXT_24);
    
	}
}
    stringBuffer.append(TEXT_25);
    stringBuffer.append(TEXT_26);
    return stringBuffer.toString();
  }
}
