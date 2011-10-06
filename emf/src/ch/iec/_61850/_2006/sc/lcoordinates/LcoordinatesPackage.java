/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.sc.lcoordinates;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * 	                        COPYRIGHT IEC, 2005. Version 1.4. Release 2005/09/11.
 * 	                        This schema is for infomational purposes only, and is not normative!
 * 		
 * <!-- end-model-doc -->
 * @see ch.iec._61850._2006.sc.lcoordinates.LcoordinatesFactory
 * @model kind="package"
 * @generated
 */
public interface LcoordinatesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lcoordinates";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.iec.ch/61850/2006/SCLcoordinates";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lcoordinates";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LcoordinatesPackage eINSTANCE = ch.iec._61850._2006.sc.lcoordinates.impl.LcoordinatesPackageImpl.init();

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.sc.lcoordinates.impl.CoordTypeImpl <em>Coord Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.sc.lcoordinates.impl.CoordTypeImpl
	 * @see ch.iec._61850._2006.sc.lcoordinates.impl.LcoordinatesPackageImpl#getCoordType()
	 * @generated
	 */
	int COORD_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORD_TYPE__DIR = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORD_TYPE__X = 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORD_TYPE__Y = 2;

	/**
	 * The number of structural features of the '<em>Coord Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORD_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.sc.lcoordinates.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.sc.lcoordinates.impl.DocumentRootImpl
	 * @see ch.iec._61850._2006.sc.lcoordinates.impl.LcoordinatesPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Coord</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COORD = 3;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIR = 4;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__X = 5;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__Y = 6;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link ch.iec._61850._2006.sc.lcoordinates.TConndir <em>TConndir</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.sc.lcoordinates.TConndir
	 * @see ch.iec._61850._2006.sc.lcoordinates.impl.LcoordinatesPackageImpl#getTConndir()
	 * @generated
	 */
	int TCONNDIR = 2;

	/**
	 * The meta object id for the '<em>TConndir Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.iec._61850._2006.sc.lcoordinates.TConndir
	 * @see ch.iec._61850._2006.sc.lcoordinates.impl.LcoordinatesPackageImpl#getTConndirObject()
	 * @generated
	 */
	int TCONNDIR_OBJECT = 3;


	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.sc.lcoordinates.CoordType <em>Coord Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coord Type</em>'.
	 * @see ch.iec._61850._2006.sc.lcoordinates.CoordType
	 * @generated
	 */
	EClass getCoordType();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.sc.lcoordinates.CoordType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see ch.iec._61850._2006.sc.lcoordinates.CoordType#getDir()
	 * @see #getCoordType()
	 * @generated
	 */
	EAttribute getCoordType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.sc.lcoordinates.CoordType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see ch.iec._61850._2006.sc.lcoordinates.CoordType#getX()
	 * @see #getCoordType()
	 * @generated
	 */
	EAttribute getCoordType_X();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.sc.lcoordinates.CoordType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see ch.iec._61850._2006.sc.lcoordinates.CoordType#getY()
	 * @see #getCoordType()
	 * @generated
	 */
	EAttribute getCoordType_Y();

	/**
	 * Returns the meta object for class '{@link ch.iec._61850._2006.sc.lcoordinates.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see ch.iec._61850._2006.sc.lcoordinates.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link ch.iec._61850._2006.sc.lcoordinates.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see ch.iec._61850._2006.sc.lcoordinates.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link ch.iec._61850._2006.sc.lcoordinates.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see ch.iec._61850._2006.sc.lcoordinates.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link ch.iec._61850._2006.sc.lcoordinates.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see ch.iec._61850._2006.sc.lcoordinates.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link ch.iec._61850._2006.sc.lcoordinates.DocumentRoot#getCoord <em>Coord</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coord</em>'.
	 * @see ch.iec._61850._2006.sc.lcoordinates.DocumentRoot#getCoord()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Coord();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.sc.lcoordinates.DocumentRoot#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see ch.iec._61850._2006.sc.lcoordinates.DocumentRoot#getDir()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Dir();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.sc.lcoordinates.DocumentRoot#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see ch.iec._61850._2006.sc.lcoordinates.DocumentRoot#getX()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_X();

	/**
	 * Returns the meta object for the attribute '{@link ch.iec._61850._2006.sc.lcoordinates.DocumentRoot#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see ch.iec._61850._2006.sc.lcoordinates.DocumentRoot#getY()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Y();

	/**
	 * Returns the meta object for enum '{@link ch.iec._61850._2006.sc.lcoordinates.TConndir <em>TConndir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TConndir</em>'.
	 * @see ch.iec._61850._2006.sc.lcoordinates.TConndir
	 * @generated
	 */
	EEnum getTConndir();

	/**
	 * Returns the meta object for data type '{@link ch.iec._61850._2006.sc.lcoordinates.TConndir <em>TConndir Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TConndir Object</em>'.
	 * @see ch.iec._61850._2006.sc.lcoordinates.TConndir
	 * @model instanceClass="ch.iec._61850._2006.sc.lcoordinates.TConndir"
	 *        extendedMetaData="name='tConndir:Object' baseType='tConndir'"
	 * @generated
	 */
	EDataType getTConndirObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LcoordinatesFactory getLcoordinatesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ch.iec._61850._2006.sc.lcoordinates.impl.CoordTypeImpl <em>Coord Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.iec._61850._2006.sc.lcoordinates.impl.CoordTypeImpl
		 * @see ch.iec._61850._2006.sc.lcoordinates.impl.LcoordinatesPackageImpl#getCoordType()
		 * @generated
		 */
		EClass COORD_TYPE = eINSTANCE.getCoordType();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORD_TYPE__DIR = eINSTANCE.getCoordType_Dir();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORD_TYPE__X = eINSTANCE.getCoordType_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORD_TYPE__Y = eINSTANCE.getCoordType_Y();

		/**
		 * The meta object literal for the '{@link ch.iec._61850._2006.sc.lcoordinates.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.iec._61850._2006.sc.lcoordinates.impl.DocumentRootImpl
		 * @see ch.iec._61850._2006.sc.lcoordinates.impl.LcoordinatesPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Coord</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COORD = eINSTANCE.getDocumentRoot_Coord();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DIR = eINSTANCE.getDocumentRoot_Dir();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__X = eINSTANCE.getDocumentRoot_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__Y = eINSTANCE.getDocumentRoot_Y();

		/**
		 * The meta object literal for the '{@link ch.iec._61850._2006.sc.lcoordinates.TConndir <em>TConndir</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.iec._61850._2006.sc.lcoordinates.TConndir
		 * @see ch.iec._61850._2006.sc.lcoordinates.impl.LcoordinatesPackageImpl#getTConndir()
		 * @generated
		 */
		EEnum TCONNDIR = eINSTANCE.getTConndir();

		/**
		 * The meta object literal for the '<em>TConndir Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.iec._61850._2006.sc.lcoordinates.TConndir
		 * @see ch.iec._61850._2006.sc.lcoordinates.impl.LcoordinatesPackageImpl#getTConndirObject()
		 * @generated
		 */
		EDataType TCONNDIR_OBJECT = eINSTANCE.getTConndirObject();

	}

} //LcoordinatesPackage
