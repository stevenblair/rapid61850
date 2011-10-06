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
 * A representation of the model object '<em><b>TAccess Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TAccessPoint#getServer <em>Server</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TAccessPoint#getLN <em>LN</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TAccessPoint#isClock <em>Clock</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TAccessPoint#isRouter <em>Router</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTAccessPoint()
 * @model extendedMetaData="name='tAccessPoint' kind='elementOnly'"
 * @generated
 */
public interface TAccessPoint extends TNaming {
	/**
	 * Returns the value of the '<em><b>Server</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' containment reference.
	 * @see #setServer(TServer)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTAccessPoint_Server()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Server' namespace='##targetNamespace'"
	 * @generated
	 */
	TServer getServer();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TAccessPoint#getServer <em>Server</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' containment reference.
	 * @see #getServer()
	 * @generated
	 */
	void setServer(TServer value);

	/**
	 * Returns the value of the '<em><b>LN</b></em>' containment reference list.
	 * The list contents are of type {@link ch.iec._61850._2006.scl.TLN}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LN</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LN</em>' containment reference list.
	 * @see ch.iec._61850._2006.scl.SclPackage#getTAccessPoint_LN()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LN' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TLN> getLN();

	/**
	 * Returns the value of the '<em><b>Clock</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock</em>' attribute.
	 * @see #isSetClock()
	 * @see #unsetClock()
	 * @see #setClock(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTAccessPoint_Clock()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='clock'"
	 * @generated
	 */
	boolean isClock();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TAccessPoint#isClock <em>Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock</em>' attribute.
	 * @see #isSetClock()
	 * @see #unsetClock()
	 * @see #isClock()
	 * @generated
	 */
	void setClock(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TAccessPoint#isClock <em>Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClock()
	 * @see #isClock()
	 * @see #setClock(boolean)
	 * @generated
	 */
	void unsetClock();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TAccessPoint#isClock <em>Clock</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Clock</em>' attribute is set.
	 * @see #unsetClock()
	 * @see #isClock()
	 * @see #setClock(boolean)
	 * @generated
	 */
	boolean isSetClock();

	/**
	 * Returns the value of the '<em><b>Router</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Router</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Router</em>' attribute.
	 * @see #isSetRouter()
	 * @see #unsetRouter()
	 * @see #setRouter(boolean)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTAccessPoint_Router()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='router'"
	 * @generated
	 */
	boolean isRouter();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TAccessPoint#isRouter <em>Router</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Router</em>' attribute.
	 * @see #isSetRouter()
	 * @see #unsetRouter()
	 * @see #isRouter()
	 * @generated
	 */
	void setRouter(boolean value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TAccessPoint#isRouter <em>Router</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRouter()
	 * @see #isRouter()
	 * @see #setRouter(boolean)
	 * @generated
	 */
	void unsetRouter();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TAccessPoint#isRouter <em>Router</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Router</em>' attribute is set.
	 * @see #unsetRouter()
	 * @see #isRouter()
	 * @see #setRouter(boolean)
	 * @generated
	 */
	boolean isSetRouter();

} // TAccessPoint
