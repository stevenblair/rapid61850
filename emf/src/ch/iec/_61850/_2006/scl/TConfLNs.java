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
 * A representation of the model object '<em><b>TConf LNs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TConfLNs#isFixLnInst <em>Fix Ln Inst</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TConfLNs#isFixPrefix <em>Fix Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTConfLNs()
 * @model extendedMetaData="name='tConfLNs' kind='empty'"
 * @generated
 */
public interface TConfLNs extends EObject {
	/**
	 * Returns the value of the '<em><b>Fix Ln Inst</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fix Ln Inst</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fix Ln Inst</em>' attribute.
	 * @see #isSetFixLnInst()
	 * @see #unsetFixLnInst()
	 * @see #setFixLnInst(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTConfLNs_FixLnInst()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='fixLnInst'"
	 * @generated
	 */
	boolean isFixLnInst();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TConfLNs#isFixLnInst <em>Fix Ln Inst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fix Ln Inst</em>' attribute.
	 * @see #isSetFixLnInst()
	 * @see #unsetFixLnInst()
	 * @see #isFixLnInst()
	 * @generated
	 */
	void setFixLnInst(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TConfLNs#isFixLnInst <em>Fix Ln Inst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFixLnInst()
	 * @see #isFixLnInst()
	 * @see #setFixLnInst(boolean)
	 * @generated
	 */
	void unsetFixLnInst();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TConfLNs#isFixLnInst <em>Fix Ln Inst</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fix Ln Inst</em>' attribute is set.
	 * @see #unsetFixLnInst()
	 * @see #isFixLnInst()
	 * @see #setFixLnInst(boolean)
	 * @generated
	 */
	boolean isSetFixLnInst();

	/**
	 * Returns the value of the '<em><b>Fix Prefix</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fix Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fix Prefix</em>' attribute.
	 * @see #isSetFixPrefix()
	 * @see #unsetFixPrefix()
	 * @see #setFixPrefix(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTConfLNs_FixPrefix()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='fixPrefix'"
	 * @generated
	 */
	boolean isFixPrefix();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TConfLNs#isFixPrefix <em>Fix Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fix Prefix</em>' attribute.
	 * @see #isSetFixPrefix()
	 * @see #unsetFixPrefix()
	 * @see #isFixPrefix()
	 * @generated
	 */
	void setFixPrefix(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TConfLNs#isFixPrefix <em>Fix Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFixPrefix()
	 * @see #isFixPrefix()
	 * @see #setFixPrefix(boolean)
	 * @generated
	 */
	void unsetFixPrefix();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TConfLNs#isFixPrefix <em>Fix Prefix</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fix Prefix</em>' attribute is set.
	 * @see #unsetFixPrefix()
	 * @see #isFixPrefix()
	 * @see #setFixPrefix(boolean)
	 * @generated
	 */
	boolean isSetFixPrefix();

} // TConfLNs
