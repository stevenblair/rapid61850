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
 * A representation of the model object '<em><b>TControl With IED Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TControlWithIEDName#getIEDName <em>IED Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TControlWithIEDName#getConfRev <em>Conf Rev</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTControlWithIEDName()
 * @model extendedMetaData="name='tControlWithIEDName' kind='elementOnly'"
 * @generated
 */
public interface TControlWithIEDName extends TControl {
	/**
	 * Returns the value of the '<em><b>IED Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IED Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IED Name</em>' attribute list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTControlWithIEDName_IEDName()
	 * @model unique="false" dataType="ch.iec._61850._2006.scl.TName"
	 *        extendedMetaData="kind='element' name='IEDName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getIEDName();

	/**
	 * Returns the value of the '<em><b>Conf Rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conf Rev</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conf Rev</em>' attribute.
	 * @see #isSetConfRev()
	 * @see #unsetConfRev()
	 * @see #setConfRev(long)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTControlWithIEDName_ConfRev()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='attribute' name='confRev'"
	 * @generated
	 */
	long getConfRev();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TControlWithIEDName#getConfRev <em>Conf Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conf Rev</em>' attribute.
	 * @see #isSetConfRev()
	 * @see #unsetConfRev()
	 * @see #getConfRev()
	 * @generated
	 */
	void setConfRev(long value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TControlWithIEDName#getConfRev <em>Conf Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConfRev()
	 * @see #getConfRev()
	 * @see #setConfRev(long)
	 * @generated
	 */
	void unsetConfRev();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TControlWithIEDName#getConfRev <em>Conf Rev</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Conf Rev</em>' attribute is set.
	 * @see #unsetConfRev()
	 * @see #getConfRev()
	 * @see #setConfRev(long)
	 * @generated
	 */
	boolean isSetConfRev();

} // TControlWithIEDName
