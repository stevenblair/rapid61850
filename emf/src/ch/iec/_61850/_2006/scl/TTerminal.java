/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TTerminal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TTerminal#getBayName <em>Bay Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TTerminal#getCNodeName <em>CNode Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TTerminal#getConnectivityNode <em>Connectivity Node</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TTerminal#getName <em>Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TTerminal#getSubstationName <em>Substation Name</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TTerminal#getVoltageLevelName <em>Voltage Level Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTTerminal()
 * @model extendedMetaData="name='tTerminal' kind='elementOnly'"
 * @generated
 */
public interface TTerminal extends TUnNaming {
	/**
	 * Returns the value of the '<em><b>Bay Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bay Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bay Name</em>' attribute.
	 * @see #setBayName(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTTerminal_BayName()
	 * @model dataType="ch.iec._61850._2006.scl.TName" required="true"
	 *        extendedMetaData="kind='attribute' name='bayName'"
	 * @generated
	 */
	String getBayName();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TTerminal#getBayName <em>Bay Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bay Name</em>' attribute.
	 * @see #getBayName()
	 * @generated
	 */
	void setBayName(String value);

	/**
	 * Returns the value of the '<em><b>CNode Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CNode Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CNode Name</em>' attribute.
	 * @see #setCNodeName(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTTerminal_CNodeName()
	 * @model dataType="ch.iec._61850._2006.scl.TName" required="true"
	 *        extendedMetaData="kind='attribute' name='cNodeName'"
	 * @generated
	 */
	String getCNodeName();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TTerminal#getCNodeName <em>CNode Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CNode Name</em>' attribute.
	 * @see #getCNodeName()
	 * @generated
	 */
	void setCNodeName(String value);

	/**
	 * Returns the value of the '<em><b>Connectivity Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectivity Node</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectivity Node</em>' attribute.
	 * @see #setConnectivityNode(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTTerminal_ConnectivityNode()
	 * @model dataType="ch.iec._61850._2006.scl.TRef" required="true"
	 *        extendedMetaData="kind='attribute' name='connectivityNode'"
	 * @generated
	 */
	String getConnectivityNode();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TTerminal#getConnectivityNode <em>Connectivity Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectivity Node</em>' attribute.
	 * @see #getConnectivityNode()
	 * @generated
	 */
	void setConnectivityNode(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTTerminal_Name()
	 * @model default="" unsettable="true" dataType="ch.iec._61850._2006.scl.TAnyName"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TTerminal#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TTerminal#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TTerminal#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Substation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substation Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substation Name</em>' attribute.
	 * @see #setSubstationName(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTTerminal_SubstationName()
	 * @model dataType="ch.iec._61850._2006.scl.TName" required="true"
	 *        extendedMetaData="kind='attribute' name='substationName'"
	 * @generated
	 */
	String getSubstationName();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TTerminal#getSubstationName <em>Substation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substation Name</em>' attribute.
	 * @see #getSubstationName()
	 * @generated
	 */
	void setSubstationName(String value);

	/**
	 * Returns the value of the '<em><b>Voltage Level Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage Level Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Level Name</em>' attribute.
	 * @see #setVoltageLevelName(String)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTTerminal_VoltageLevelName()
	 * @model dataType="ch.iec._61850._2006.scl.TName" required="true"
	 *        extendedMetaData="kind='attribute' name='voltageLevelName'"
	 * @generated
	 */
	String getVoltageLevelName();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TTerminal#getVoltageLevelName <em>Voltage Level Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage Level Name</em>' attribute.
	 * @see #getVoltageLevelName()
	 * @generated
	 */
	void setVoltageLevelName(String value);

} // TTerminal
