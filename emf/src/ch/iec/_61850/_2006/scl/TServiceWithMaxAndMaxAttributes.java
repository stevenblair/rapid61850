/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TService With Max And Max Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TServiceWithMaxAndMaxAttributes#getMaxAttributes <em>Max Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTServiceWithMaxAndMaxAttributes()
 * @model extendedMetaData="name='tServiceWithMaxAndMaxAttributes' kind='empty'"
 * @generated
 */
public interface TServiceWithMaxAndMaxAttributes extends TServiceWithMax {
	/**
	 * Returns the value of the '<em><b>Max Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Attributes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Attributes</em>' attribute.
	 * @see #isSetMaxAttributes()
	 * @see #unsetMaxAttributes()
	 * @see #setMaxAttributes(long)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTServiceWithMaxAndMaxAttributes_MaxAttributes()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='attribute' name='maxAttributes'"
	 * @generated
	 */
	long getMaxAttributes();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TServiceWithMaxAndMaxAttributes#getMaxAttributes <em>Max Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Attributes</em>' attribute.
	 * @see #isSetMaxAttributes()
	 * @see #unsetMaxAttributes()
	 * @see #getMaxAttributes()
	 * @generated
	 */
	void setMaxAttributes(long value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TServiceWithMaxAndMaxAttributes#getMaxAttributes <em>Max Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxAttributes()
	 * @see #getMaxAttributes()
	 * @see #setMaxAttributes(long)
	 * @generated
	 */
	void unsetMaxAttributes();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TServiceWithMaxAndMaxAttributes#getMaxAttributes <em>Max Attributes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Attributes</em>' attribute is set.
	 * @see #unsetMaxAttributes()
	 * @see #getMaxAttributes()
	 * @see #setMaxAttributes(long)
	 * @generated
	 */
	boolean isSetMaxAttributes();

} // TServiceWithMaxAndMaxAttributes
