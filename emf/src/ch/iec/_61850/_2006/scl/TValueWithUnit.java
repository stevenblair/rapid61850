/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TValue With Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.TValueWithUnit#getValue <em>Value</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TValueWithUnit#getMultiplier <em>Multiplier</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.TValueWithUnit#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.iec._61850._2006.scl.SclPackage#getTValueWithUnit()
 * @model extendedMetaData="name='tValueWithUnit' kind='simple'"
 * @generated
 */
public interface TValueWithUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigDecimal)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTValueWithUnit_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	BigDecimal getValue();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TValueWithUnit#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Multiplier</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link ch.iec._61850._2006.scl.TUnitMultiplierEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplier</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TUnitMultiplierEnum
	 * @see #isSetMultiplier()
	 * @see #unsetMultiplier()
	 * @see #setMultiplier(TUnitMultiplierEnum)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTValueWithUnit_Multiplier()
	 * @model default="" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='multiplier'"
	 * @generated
	 */
	TUnitMultiplierEnum getMultiplier();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TValueWithUnit#getMultiplier <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplier</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TUnitMultiplierEnum
	 * @see #isSetMultiplier()
	 * @see #unsetMultiplier()
	 * @see #getMultiplier()
	 * @generated
	 */
	void setMultiplier(TUnitMultiplierEnum value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TValueWithUnit#getMultiplier <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMultiplier()
	 * @see #getMultiplier()
	 * @see #setMultiplier(TUnitMultiplierEnum)
	 * @generated
	 */
	void unsetMultiplier();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TValueWithUnit#getMultiplier <em>Multiplier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Multiplier</em>' attribute is set.
	 * @see #unsetMultiplier()
	 * @see #getMultiplier()
	 * @see #setMultiplier(TUnitMultiplierEnum)
	 * @generated
	 */
	boolean isSetMultiplier();

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.iec._61850._2006.scl.TSIUnitEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TSIUnitEnum
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #setUnit(TSIUnitEnum)
	 * @see ch.iec._61850._2006.scl.SclPackage#getTValueWithUnit_Unit()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='unit'"
	 * @generated
	 */
	TSIUnitEnum getUnit();

	/**
	 * Sets the value of the '{@link ch.iec._61850._2006.scl.TValueWithUnit#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see ch.iec._61850._2006.scl.TSIUnitEnum
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(TSIUnitEnum value);

	/**
	 * Unsets the value of the '{@link ch.iec._61850._2006.scl.TValueWithUnit#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnit()
	 * @see #getUnit()
	 * @see #setUnit(TSIUnitEnum)
	 * @generated
	 */
	void unsetUnit();

	/**
	 * Returns whether the value of the '{@link ch.iec._61850._2006.scl.TValueWithUnit#getUnit <em>Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unit</em>' attribute is set.
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @see #setUnit(TSIUnitEnum)
	 * @generated
	 */
	boolean isSetUnit();

} // TValueWithUnit
