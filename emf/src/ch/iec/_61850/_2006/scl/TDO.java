/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TDO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TDO#getAccessControl <em>Access Control</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TDO#getName <em>Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TDO#isTransient <em>Transient</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TDO#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTDO()
 * @model extendedMetaData="name='tDO' kind='elementOnly'"
 * @generated
 */
public interface TDO extends TUnNaming {
	/**
	 * Returns the value of the '<em><b>Access Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Control</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Control</em>' attribute.
	 * @see #setAccessControl(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTDO_AccessControl()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='attribute' name='accessControl'"
	 * @generated
	 */
	String getAccessControl();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TDO#getAccessControl <em>Access Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Control</em>' attribute.
	 * @see #getAccessControl()
	 * @generated
	 */
	void setAccessControl(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTDO_Name()
	 * @model dataType="ch.iec._61850._2006.scl.TRestrName1stU" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TDO#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Transient</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient</em>' attribute.
	 * @see #isSetTransient()
	 * @see #unsetTransient()
	 * @see #setTransient(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTDO_Transient()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='transient'"
	 * @generated
	 */
	boolean isTransient();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TDO#isTransient <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient</em>' attribute.
	 * @see #isSetTransient()
	 * @see #unsetTransient()
	 * @see #isTransient()
	 * @generated
	 */
	void setTransient(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TDO#isTransient <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransient()
	 * @see #isTransient()
	 * @see #setTransient(boolean)
	 * @generated
	 */
	void unsetTransient();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TDO#isTransient <em>Transient</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transient</em>' attribute is set.
	 * @see #unsetTransient()
	 * @see #isTransient()
	 * @see #setTransient(boolean)
	 * @generated
	 */
	boolean isSetTransient();

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
	 * @see ch.iec._61850._2006.scl.SclPackage#getTDO_Type()
	 * @model dataType="ch.iec._61850._2006.scl.TName" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TDO#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // TDO
