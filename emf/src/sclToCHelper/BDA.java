package sclToCHelper;

import ch.iec._61850._2006.scl.TBDA;;

public class BDA
{
  protected static String nl;
  public static synchronized BDA create(String lineSeparator)
  {
    nl = lineSeparator;
    BDA result = new BDA();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     TBDA bda = (TBDA) argument; 

String bType = bda.getBType().toString(); 

if (bType.equals("Struct")) {
    stringBuffer.append(TEXT_1);
    stringBuffer.append("struct " + bda.getType().toString());
    
}
else if (bType.equals("Enum")) {

    stringBuffer.append("enum " + bda.getType());
    
}
else {

    stringBuffer.append("CTYPE_" + bType);
    
}

    stringBuffer.append(" " + bda.getName() + ";");
    return stringBuffer.toString();
  }
}
