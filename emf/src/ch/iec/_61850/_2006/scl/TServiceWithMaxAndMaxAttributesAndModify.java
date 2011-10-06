/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TService With Max And Max Attributes And Modify</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TServiceWithMaxAndMaxAttributesAndModify#isModify <em>Modify</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTServiceWithMaxAndMaxAttributesAndModify()
 * @model extendedMetaData="name='tServiceWithMaxAndMaxAttributesAndModify' kind='empty'"
 * @generated
 */
public interface TServiceWithMaxAndMaxAttributesAndModify extends TServiceWithMaxAndMaxAttributes {
	/**
	 * Returns the value of the '<em><b>Modify</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modify</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modify</em>' attribute.
	 * @see #isSetModify()
	 * @see #unsetModify()
	 * @see #setModify(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTServiceWithMaxAndMaxAttributesAndModify_Modify()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='modify'"
	 * @generated
	 */
	boolean isModify();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TServiceWithMaxAndMaxAttributesAndModify#isModify <em>Modify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modify</em>' attribute.
	 * @see #isSetModify()
	 * @see #unsetModify()
	 * @see #isModify()
	 * @generated
	 */
	void setModify(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TServiceWithMaxAndMaxAttributesAndModify#isModify <em>Modify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModify()
	 * @see #isModify()
	 * @see #setModify(boolean)
	 * @generated
	 */
	void unsetModify();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TServiceWithMaxAndMaxAttributesAndModify#isModify <em>Modify</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Modify</em>' attribute is set.
	 * @see #unsetModify()
	 * @see #isModify()
	 * @see #setModify(boolean)
	 * @generated
	 */
	boolean isSetModify();

} // TServiceWithMaxAndMaxAttributesAndModify
