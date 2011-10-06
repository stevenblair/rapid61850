/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TVal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TVal#getValue <em>Value</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TVal#getSGroup <em>SGroup</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTVal()
 * @model extendedMetaData="name='tVal' kind='simple'"
 * @generated
 */
public interface TVal extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTVal_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TVal#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>SGroup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SGroup</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SGroup</em>' attribute.
	 * @see #isSetSGroup()
	 * @see #unsetSGroup()
	 * @see #setSGroup(long)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTVal_SGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='attribute' name='sGroup'"
	 * @generated
	 */
	long getSGroup();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TVal#getSGroup <em>SGroup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SGroup</em>' attribute.
	 * @see #isSetSGroup()
	 * @see #unsetSGroup()
	 * @see #getSGroup()
	 * @generated
	 */
	void setSGroup(long value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TVal#getSGroup <em>SGroup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSGroup()
	 * @see #getSGroup()
	 * @see #setSGroup(long)
	 * @generated
	 */
	void unsetSGroup();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TVal#getSGroup <em>SGroup</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>SGroup</em>' attribute is set.
	 * @see #unsetSGroup()
	 * @see #getSGroup()
	 * @see #setSGroup(long)
	 * @generated
	 */
	boolean isSetSGroup();

} // TVal
