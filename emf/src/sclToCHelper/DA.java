package sclToCHelper;

import ch.iec._61850._2006.scl.TDA;;

public class DA
{
  protected static String nl;
  public static synchronized DA create(String lineSeparator)
  {
    nl = lineSeparator;
    DA result = new DA();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     TDA da = (TDA) argument; 

String bType = da.getBType().toString(); 

if (bType.equals("Struct")) {
    stringBuffer.append(TEXT_1);
    stringBuffer.append("struct " + da.getType().toString());
    
}
else if (bType.equals("Enum")) {

    stringBuffer.append("enum " + da.getType());
    
}
else {

    stringBuffer.append("CTYPE_" + bType.toUpperCase());
    
}

    stringBuffer.append(" " + da.getName() + ";");
    return stringBuffer.toString();
  }
}
