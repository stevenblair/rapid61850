package sclToCHelper;

import ch.iec._61850._2006.scl.TDAType;
import ch.iec._61850._2006.scl.TBDA;
import java.util.Iterator;

 public class DecodeSVDA
 {
  protected static String nl;
  public static synchronized DecodeSVDA create(String lineSeparator)
  {
    nl = lineSeparator;
    DecodeSVDA result = new DecodeSVDA();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "int decode_";
  protected final String TEXT_2 = "(unsigned char *buf, struct ";
  protected final String TEXT_3 = " *";
  protected final String TEXT_4 = ") {" + NL + "\tint size = 0;" + NL + "\t";
  protected final String TEXT_5 = NL + "\tsize += decode_";
  protected final String TEXT_6 = "(&buf[size], &";
  protected final String TEXT_7 = "->";
  protected final String TEXT_8 = ");";
  protected final String TEXT_9 = NL + "\tsize += DECODE_CTYPE_ENUM(&buf[size], (CTYPE_INT32 *) &";
  protected final String TEXT_10 = "->";
  protected final String TEXT_11 = ");";
  protected final String TEXT_12 = NL + "\tsize += DECODE_CTYPE_";
  protected final String TEXT_13 = "(&buf[size], &";
  protected final String TEXT_14 = "->";
  protected final String TEXT_15 = ");";
  protected final String TEXT_16 = NL + NL + "\treturn size;" + NL + "}";
  protected final String TEXT_17 = NL;

   public String generate(Object argument, String type)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     TDAType da = (TDAType) argument; 
String daID = da.getId(); 
Iterator<TBDA> bdas = da.getBDA().iterator();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(daID);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(daID);
    stringBuffer.append(TEXT_3);
    stringBuffer.append(daID);
    stringBuffer.append(TEXT_4);
    
	while (bdas.hasNext()) {
		TBDA bda = bdas.next();
		String bdaBType = bda.getBType().toString();
if (bdaBType.equals("Struct")) {
    stringBuffer.append(TEXT_5);
    stringBuffer.append(bda.getType());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(daID);
    stringBuffer.append(TEXT_7);
    stringBuffer.append( bda.getName());
    stringBuffer.append(TEXT_8);
    
}
else if (bdaBType.equals("Enum")) {
    stringBuffer.append(TEXT_9);
    stringBuffer.append(daID);
    stringBuffer.append(TEXT_10);
    stringBuffer.append( bda.getName());
    stringBuffer.append(TEXT_11);
    
}
else {
    stringBuffer.append(TEXT_12);
    stringBuffer.append(bdaBType.toUpperCase());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(daID);
    stringBuffer.append(TEXT_14);
    stringBuffer.append( bda.getName());
    stringBuffer.append(TEXT_15);
    
	}
}
    stringBuffer.append(TEXT_16);
    stringBuffer.append(TEXT_17);
    return stringBuffer.toString();
  }
}
