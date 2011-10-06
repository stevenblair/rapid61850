/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.sc.lcoordinates;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.sc.lcoordinates.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link ch.iec._61850._2006.sc.lcoordinates.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link ch.iec._61850._2006.sc.lcoordinates.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link ch.iec._61850._2006.sc.lcoordinates.DocumentRoot#getCoord <em>Coord</em>}</li>
 *   <li>{@link ch.iec._61850._2006.sc.lcoordinates.DocumentRoot#getDir <em>Dir</em>}</li>
 *   <li>{@link ch.iec._61850._2006.sc.lcoordinates.DocumentRoot#getX <em>X</em>}</li>
 *   <li>{@link ch.iec._61850._2006.sc.lcoordinates.DocumentRoot#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.sc.lcoordinates.LcoordinatesPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see ch.iec._61850._2006.sc.lcoordinates.LcoordinatesPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see ch.iec._61850._2006.sc.lcoordinates.LcoordinatesPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see ch.iec._61850._2006.sc.lcoordinates.LcoordinatesPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Coord</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coord</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coord</em>' containment reference.
	 * @see #setCoord(CoordType)
	 * @see ch.iec._61850._2006.sc.lcoordinates.LcoordinatesPackage#getDocumentRoot_Coord()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Coord' namespace='##targetNamespace'"
	 * @generated
	 */
	CoordType getCoord();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.sc.lcoordinates.DocumentRoot#getCoord <em>Coord</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coord</em>' containment reference.
	 * @see #getCoord()
	 * @generated
	 */
	void setCoord(CoordType value);

	/**
	 * Returns the value of the '<em><b>Dir</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.iec._61850._2006.sc.lcoordinates.TConndir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir</em>' attribute.
	 * @see ch.iec._61850._2006.sc.lcoordinates.TConndir
	 * @see #isSetDir()
	 * @see #unsetDir()
	 * @see #setDir(TConndir)
	 * @see ch.iec._61850._2006.sc.lcoordinates.LcoordinatesPackage#getDocumentRoot_Dir()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='dir' namespace='##targetNamespace'"
	 * @generated
	 */
	TConndir getDir();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.sc.lcoordinates.DocumentRoot#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir</em>' attribute.
	 * @see ch.iec._61850._2006.sc.lcoordinates.TConndir
	 * @see #isSetDir()
	 * @see #unsetDir()
	 * @see #getDir()
	 * @generated
	 */
	void setDir(TConndir value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.sc.lcoordinates.DocumentRoot#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDir()
	 * @see #getDir()
	 * @see #setDir(TConndir)
	 * @generated
	 */
	void unsetDir();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.sc.lcoordinates.DocumentRoot#getDir <em>Dir</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dir</em>' attribute is set.
	 * @see #unsetDir()
	 * @see #getDir()
	 * @see #setDir(TConndir)
	 * @generated
	 */
	boolean isSetDir();

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #setX(int)
	 * @see ch.iec._61850._2006.sc.lcoordinates.LcoordinatesPackage#getDocumentRoot_X()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='x' namespace='##targetNamespace'"
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.sc.lcoordinates.DocumentRoot#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.sc.lcoordinates.DocumentRoot#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX()
	 * @see #getX()
	 * @see #setX(int)
	 * @generated
	 */
	void unsetX();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.sc.lcoordinates.DocumentRoot#getX <em>X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>X</em>' attribute is set.
	 * @see #unsetX()
	 * @see #getX()
	 * @see #setX(int)
	 * @generated
	 */
	boolean isSetX();

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #isSetY()
	 * @see #unsetY()
	 * @see #setY(int)
	 * @see ch.iec._61850._2006.sc.lcoordinates.LcoordinatesPackage#getDocumentRoot_Y()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='y' namespace='##targetNamespace'"
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.sc.lcoordinates.DocumentRoot#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #isSetY()
	 * @see #unsetY()
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.sc.lcoordinates.DocumentRoot#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY()
	 * @see #getY()
	 * @see #setY(int)
	 * @generated
	 */
	void unsetY();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.sc.lcoordinates.DocumentRoot#getY <em>Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Y</em>' attribute is set.
	 * @see #unsetY()
	 * @see #getY()
	 * @see #setY(int)
	 * @generated
	 */
	boolean isSetY();

} // DocumentRoot
