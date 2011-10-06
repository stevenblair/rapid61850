/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TSetting Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TSettingControl#getActSG <em>Act SG</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TSettingControl#getNumOfSGs <em>Num Of SGs</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTSettingControl()
 * @model extendedMetaData="name='tSettingControl' kind='elementOnly'"
 * @generated
 */
public interface TSettingControl extends TUnNaming {
	/**
	 * Returns the value of the '<em><b>Act SG</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Act SG</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Act SG</em>' attribute.
	 * @see #isSetActSG()
	 * @see #unsetActSG()
	 * @see #setActSG(long)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTSettingControl_ActSG()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='attribute' name='actSG'"
	 * @generated
	 */
	long getActSG();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TSettingControl#getActSG <em>Act SG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Act SG</em>' attribute.
	 * @see #isSetActSG()
	 * @see #unsetActSG()
	 * @see #getActSG()
	 * @generated
	 */
	void setActSG(long value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TSettingControl#getActSG <em>Act SG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActSG()
	 * @see #getActSG()
	 * @see #setActSG(long)
	 * @generated
	 */
	void unsetActSG();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TSettingControl#getActSG <em>Act SG</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Act SG</em>' attribute is set.
	 * @see #unsetActSG()
	 * @see #getActSG()
	 * @see #setActSG(long)
	 * @generated
	 */
	boolean isSetActSG();

	/**
	 * Returns the value of the '<em><b>Num Of SGs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Of SGs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Of SGs</em>' attribute.
	 * @see #isSetNumOfSGs()
	 * @see #unsetNumOfSGs()
	 * @see #setNumOfSGs(long)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTSettingControl_NumOfSGs()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" required="true"
	 *        extendedMetaData="kind='attribute' name='numOfSGs'"
	 * @generated
	 */
	long getNumOfSGs();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TSettingControl#getNumOfSGs <em>Num Of SGs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Of SGs</em>' attribute.
	 * @see #isSetNumOfSGs()
	 * @see #unsetNumOfSGs()
	 * @see #getNumOfSGs()
	 * @generated
	 */
	void setNumOfSGs(long value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TSettingControl#getNumOfSGs <em>Num Of SGs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumOfSGs()
	 * @see #getNumOfSGs()
	 * @see #setNumOfSGs(long)
	 * @generated
	 */
	void unsetNumOfSGs();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TSettingControl#getNumOfSGs <em>Num Of SGs</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Num Of SGs</em>' attribute is set.
	 * @see #unsetNumOfSGs()
	 * @see #getNumOfSGs()
	 * @see #setNumOfSGs(long)
	 * @generated
	 */
	boolean isSetNumOfSGs();

} // TSettingControl
