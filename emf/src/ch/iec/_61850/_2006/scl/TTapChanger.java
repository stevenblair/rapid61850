/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TTap Changer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TTapChanger#getType <em>Type</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TTapChanger#isVirtual <em>Virtual</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTTapChanger()
 * @model extendedMetaData="name='tTapChanger' kind='elementOnly'"
 * @generated
 */
public interface TTapChanger extends TPowerSystemResource {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"LTC"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTTapChanger_Type()
	 * @model default="LTC" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TTapChanger#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TTapChanger#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TTapChanger#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Virtual</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual</em>' attribute.
	 * @see #isSetVirtual()
	 * @see #unsetVirtual()
	 * @see #setVirtual(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTTapChanger_Virtual()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='virtual'"
	 * @generated
	 */
	boolean isVirtual();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TTapChanger#isVirtual <em>Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual</em>' attribute.
	 * @see #isSetVirtual()
	 * @see #unsetVirtual()
	 * @see #isVirtual()
	 * @generated
	 */
	void setVirtual(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TTapChanger#isVirtual <em>Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVirtual()
	 * @see #isVirtual()
	 * @see #setVirtual(boolean)
	 * @generated
	 */
	void unsetVirtual();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TTapChanger#isVirtual <em>Virtual</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Virtual</em>' attribute is set.
	 * @see #unsetVirtual()
	 * @see #isVirtual()
	 * @see #setVirtual(boolean)
	 * @generated
	 */
	boolean isSetVirtual();

} // TTapChanger
