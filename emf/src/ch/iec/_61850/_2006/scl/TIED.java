/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TIED</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TIED#getServices <em>Services</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TIED#getAccessPoint <em>Access Point</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TIED#getConfigVersion <em>Config Version</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TIED#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TIED#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTIED()
 * @model extendedMetaData="name='tIED' kind='elementOnly'"
 * @generated
 */
public interface TIED extends TNaming {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference.
	 * @see #setServices(TServices)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTIED_Services()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Services' namespace='##targetNamespace'"
	 * @generated
	 */
	TServices getServices();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TIED#getServices <em>Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Services</em>' containment reference.
	 * @see #getServices()
	 * @generated
	 */
	void setServices(TServices value);

	/**
	 * Returns the value of the '<em><b>Access Point</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TAccessPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Point</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Point</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTIED_AccessPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AccessPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TAccessPoint> getAccessPoint();

	/**
	 * Returns the value of the '<em><b>Config Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Version</em>' attribute.
	 * @see #setConfigVersion(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTIED_ConfigVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='attribute' name='configVersion'"
	 * @generated
	 */
	String getConfigVersion();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TIED#getConfigVersion <em>Config Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Version</em>' attribute.
	 * @see #getConfigVersion()
	 * @generated
	 */
	void setConfigVersion(String value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufacturer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturer</em>' attribute.
	 * @see #setManufacturer(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTIED_Manufacturer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='attribute' name='manufacturer'"
	 * @generated
	 */
	String getManufacturer();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TIED#getManufacturer <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' attribute.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTIED_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TIED#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // TIED
