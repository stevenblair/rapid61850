/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>TPredefined General Equipment Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ch.iec._61850._2006.scl.SclPackage#getTPredefinedGeneralEquipmentEnum()
 * @model extendedMetaData="name='tPredefinedGeneralEquipmentEnum'"
 * @generated
 */
public enum TPredefinedGeneralEquipmentEnum implements Enumerator {
	/**
	 * The '<em><b>AXN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AXN_VALUE
	 * @generated
	 * @ordered
	 */
	AXN(0, "AXN", "AXN"),

	/**
	 * The '<em><b>BAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAT_VALUE
	 * @generated
	 * @ordered
	 */
	BAT(1, "BAT", "BAT"),

	/**
	 * The '<em><b>MOT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOT_VALUE
	 * @generated
	 * @ordered
	 */
	MOT(2, "MOT", "MOT");

	/**
	 * The '<em><b>AXN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AXN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AXN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AXN_VALUE = 0;

	/**
	 * The '<em><b>BAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BAT_VALUE = 1;

	/**
	 * The '<em><b>MOT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOT_VALUE = 2;

	/**
	 * An array of all the '<em><b>TPredefined General Equipment Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TPredefinedGeneralEquipmentEnum[] VALUES_ARRAY =
		new TPredefinedGeneralEquipmentEnum[] {
			AXN,
			BAT,
			MOT,
		};

	/**
	 * A public read-only list of all the '<em><b>TPredefined General Equipment Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TPredefinedGeneralEquipmentEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TPredefined General Equipment Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TPredefinedGeneralEquipmentEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TPredefinedGeneralEquipmentEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TPredefined General Equipment Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TPredefinedGeneralEquipmentEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TPredefinedGeneralEquipmentEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TPredefined General Equipment Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TPredefinedGeneralEquipmentEnum get(int value) {
		switch (value) {
			case AXN_VALUE: return AXN;
			case BAT_VALUE: return BAT;
			case MOT_VALUE: return MOT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TPredefinedGeneralEquipmentEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TPredefinedGeneralEquipmentEnum
