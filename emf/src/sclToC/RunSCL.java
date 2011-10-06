/**
 * Rapid-prototyping protection schemes with IEC 61850
 *
 * Copyright (c) 2011 Steven Blair
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

package sclToC;


public class RunSCL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// define SCD file
		/*SclFactory sclFactory = SclFactory.eINSTANCE;
		SCLType scl = sclFactory.createSCLType();
		TSubstation sub = sclFactory.createTSubstation();
		TSubstation sub2 = sclFactory.createTSubstation();

		
		// Create a resource set.
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMLResourceFactoryImpl());

		// Get the URI of the model file.
		URI fileURI = URI.createFileURI(new File("src\\RunSCL\\autoscd.xml").getAbsolutePath());

		// Create a resource for this file.
		Resource resource = resourceSet.createResource(fileURI);

		// Add the book and writer objects to the contents.
		resource.getContents().add(scl);
		resource.getContents().add(sub);
		resource.getContents().add(sub2);

		// Save the contents of the resource to the file system.
		try {
			resource.save(Collections.EMPTY_MAP);
			resource.save(System.out, Collections.EMPTY_MAP);
		} catch (IOException e) {
		}*/
		
		//SclXMLProcessor sclProcessor = new SclXMLProcessor();
		
		
		// Create a resource set.
		/*ResourceSet resourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMLResourceFactoryImpl());

		// Register the package -- only needed for stand-alone!
		SclPackage sclPackage = SclPackage.eINSTANCE;

		// Get the URI of the model file.
		URI fileURI = URI.createFileURI(new File("src\\RunSCL\\basic.xml").getAbsolutePath());

		// Demand load the resource for this file.
		Resource resource = resourceSet.getResource(fileURI, true);

		// Print the contents of the resource to System.out.
		try {
			resource.save(System.out, Collections.EMPTY_MAP);
		} catch (IOException e) {
			
		}*/
	}

}
