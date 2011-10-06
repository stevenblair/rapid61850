/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TGSE Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TGSEControl#getAppID <em>App ID</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TGSEControl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTGSEControl()
 * @model extendedMetaData="name='tGSEControl' kind='elementOnly'"
 * @generated
 */
public interface TGSEControl extends TControlWithIEDName {
	/**
	 * Returns the value of the '<em><b>App ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App ID</em>' attribute.
	 * @see #setAppID(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTGSEControl_AppID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString" required="true"
	 *        extendedMetaData="kind='attribute' name='appID'"
	 * @generated
	 */
	String getAppID();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TGSEControl#getAppID <em>App ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App ID</em>' attribute.
	 * @see #getAppID()
	 * @generated
	 */
	void setAppID(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"GOOSE"</code>.
	 * The literals are from the enumeration {@link ch.iec._61850._2006.scl.TGSEControlTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TGSEControlTypeEnum
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TGSEControlTypeEnum)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTGSEControl_Type()
	 * @model default="GOOSE" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	TGSEControlTypeEnum getType();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TGSEControl#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TGSEControlTypeEnum
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TGSEControlTypeEnum value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TGSEControl#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TGSEControlTypeEnum)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TGSEControl#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TGSEControlTypeEnum)
	 * @generated
	 */
	boolean isSetType();

} // TGSEControl
