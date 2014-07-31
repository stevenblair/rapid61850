/**
 * Rapid-prototyping protection schemes with IEC 61850
 *
 * Copyright (c) 2014 Steven Blair
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package rapid61850;

import java.io.File;

import org.eclipse.emf.ecore.resource.Resource;

import ch.iec._61850._2006.scl.DocumentRoot;
import ch.iec._61850._2006.scl.util.SclXMLProcessor;

public class Main {
	
	final static String PATH_TO_SOURCE	= "src" + File.separator + "rapid61850" + File.separator;
	final static String SCD_FILENAME	= "scd.xml";					// edit this to match the input SCD filename
	
	public static void main(String[] args) {
		SCDValidator validator = new SCDValidator();
		SCDAdditionalMappings map = new SCDAdditionalMappings();
		SCDCodeGenerator scdCodeGenerator = new SCDCodeGenerator();

		// import SCD file
		Resource resource = null;
		try {
			File scdFile = new File(PATH_TO_SOURCE, SCD_FILENAME);
			if (scdFile.exists()) {
				SclXMLProcessor processor = new SclXMLProcessor();
				resource = processor.load(scdFile.getAbsolutePath(), null);
			}
			else {
				validator.error("SCD file '" + SCD_FILENAME + "' does not exist");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			validator.error("EMF cannot parse SCD file");
		}
		
		// get root of XML document
		DocumentRoot root = ((DocumentRoot) resource.getContents().get(0));
		
		// model validation and additional mappings
		validator.validate(root, map);
		
		// generate code
		scdCodeGenerator.generateCode(root, map);
	}
}
