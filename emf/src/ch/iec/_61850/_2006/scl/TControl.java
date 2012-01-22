/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TControl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TControl#getDatSet <em>Dat Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTControl()
 * @model abstract="true"
 *        extendedMetaData="name='tControl' kind='elementOnly'"
 * @generated
 */
public interface TControl extends TNaming {
	/**
	 * Returns the value of the '<em><b>Dat Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dat Set</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dat Set</em>' attribute.
	 * @see #setDatSet(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTControl_DatSet()
	 * @model dataType="ch.iec._61850._2006.scl.TName"
	 *        extendedMetaData="kind='attribute' name='datSet'"
	 * @generated
	 */
	String getDatSet();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TControl#getDatSet <em>Dat Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dat Set</em>' attribute.
	 * @see #getDatSet()
	 * @generated
	 */
	void setDatSet(String value);

} // TControl
