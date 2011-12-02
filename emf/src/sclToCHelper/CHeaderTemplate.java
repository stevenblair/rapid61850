package sclToCHelper;

import sclToC.CHeader;;

public class CHeaderTemplate
{
  protected static String nl;
  public static synchronized CHeaderTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    CHeaderTemplate result = new CHeaderTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "#ifndef ";
  protected final String TEXT_2 = NL + "#define ";
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL + "#ifdef __cplusplus /* If this is a C++ compiler, use C linkage */" + NL + "extern \"C\" {" + NL + "#endif";
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = NL;
  protected final String TEXT_7 = NL;
  protected final String TEXT_8 = NL;
  protected final String TEXT_9 = NL;
  protected final String TEXT_10 = NL;
  protected final String TEXT_11 = NL;
  protected final String TEXT_12 = NL;
  protected final String TEXT_13 = NL;
  protected final String TEXT_14 = NL + "#ifdef __cplusplus /* If this is a C++ compiler, end C linkage */" + NL + "}" + NL + "#endif";
  protected final String TEXT_15 = NL + NL + "#endif";
  protected final String TEXT_16 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     CHeader header = (CHeader) argument; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append(header.headerProtectName);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(header.headerProtectName);
    stringBuffer.append(TEXT_3);
     if (header.showExternC) { 
    stringBuffer.append(TEXT_4);
    }
    stringBuffer.append(TEXT_5);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(
header.includes
);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(
header.datatypes.toString()
);
    stringBuffer.append(TEXT_9);
    stringBuffer.append(TEXT_10);
    stringBuffer.append(
header.functionPrototypes.toString()
);
    stringBuffer.append(TEXT_11);
    stringBuffer.append(TEXT_12);
    stringBuffer.append(
header.extern.toString()
);
    stringBuffer.append(TEXT_13);
     if (header.showExternC) { 
    stringBuffer.append(TEXT_14);
    }
    stringBuffer.append(TEXT_15);
    stringBuffer.append(TEXT_16);
    return stringBuffer.toString();
  }
}
