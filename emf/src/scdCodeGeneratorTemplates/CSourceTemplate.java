package scdCodeGeneratorTemplates;

import scdCodeGenerator.CSource;
import java.util.Iterator;
import scdCodeGenerator.CFunction;

public class CSourceTemplate
{
  protected static String nl;
  public static synchronized CSourceTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    CSourceTemplate result = new CSourceTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = NL;
  protected final String TEXT_7 = NL;
  protected final String TEXT_8 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     CSource header = (CSource) argument; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append(
header.includes
);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    stringBuffer.append(
header.instances.toString()
);
    stringBuffer.append(TEXT_4);
    
Iterator<CFunction> functions = header.functions.iterator();
while (functions.hasNext()) {
	CFunction function = functions.next();

    stringBuffer.append(TEXT_5);
    stringBuffer.append(function.toString());
    }
    stringBuffer.append(TEXT_6);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(
header.manualFunctions.toString()
);
    stringBuffer.append(TEXT_8);
    return stringBuffer.toString();
  }
}
