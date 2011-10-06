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
 * A representation of the literals of the enumeration '<em><b>TPredefined Attribute Name Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ch.iec._61850._2006.scl.SclPackage#getTPredefinedAttributeNameEnum()
 * @model extendedMetaData="name='tPredefinedAttributeNameEnum'"
 * @generated
 */
public enum TPredefinedAttributeNameEnum implements Enumerator {
	/**
	 * The '<em><b>T</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #T_VALUE
	 * @generated
	 * @ordered
	 */
	T(0, "T", "T"),

	/**
	 * The '<em><b>Test</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEST_VALUE
	 * @generated
	 * @ordered
	 */
	TEST(1, "Test", "Test"),

	/**
	 * The '<em><b>Check</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECK_VALUE
	 * @generated
	 * @ordered
	 */
	CHECK(2, "Check", "Check"),

	/**
	 * The '<em><b>SI Unit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SI_UNIT_VALUE
	 * @generated
	 * @ordered
	 */
	SI_UNIT(3, "SIUnit", "SIUnit"),

	/**
	 * The '<em><b>Oper</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPER_VALUE
	 * @generated
	 * @ordered
	 */
	OPER(4, "Oper", "Oper"),

	/**
	 * The '<em><b>SBO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SBO_VALUE
	 * @generated
	 * @ordered
	 */
	SBO(5, "SBO", "SBO"),

	/**
	 * The '<em><b>SB Ow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SB_OW_VALUE
	 * @generated
	 * @ordered
	 */
	SB_OW(6, "SBOw", "SBOw"),

	/**
	 * The '<em><b>Cancel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCEL_VALUE
	 * @generated
	 * @ordered
	 */
	CANCEL(7, "Cancel", "Cancel");

	/**
	 * The '<em><b>T</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>T</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #T
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int T_VALUE = 0;

	/**
	 * The '<em><b>Test</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Test</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEST
	 * @model name="Test"
	 * @generated
	 * @ordered
	 */
	public static final int TEST_VALUE = 1;

	/**
	 * The '<em><b>Check</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Check</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHECK
	 * @model name="Check"
	 * @generated
	 * @ordered
	 */
	public static final int CHECK_VALUE = 2;

	/**
	 * The '<em><b>SI Unit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SI Unit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SI_UNIT
	 * @model name="SIUnit"
	 * @generated
	 * @ordered
	 */
	public static final int SI_UNIT_VALUE = 3;

	/**
	 * The '<em><b>Oper</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Oper</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPER
	 * @model name="Oper"
	 * @generated
	 * @ordered
	 */
	public static final int OPER_VALUE = 4;

	/**
	 * The '<em><b>SBO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SBO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SBO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SBO_VALUE = 5;

	/**
	 * The '<em><b>SB Ow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SB Ow</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SB_OW
	 * @model name="SBOw"
	 * @generated
	 * @ordered
	 */
	public static final int SB_OW_VALUE = 6;

	/**
	 * The '<em><b>Cancel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cancel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CANCEL
	 * @model name="Cancel"
	 * @generated
	 * @ordered
	 */
	public static final int CANCEL_VALUE = 7;

	/**
	 * An array of all the '<em><b>TPredefined Attribute Name Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TPredefinedAttributeNameEnum[] VALUES_ARRAY =
		new TPredefinedAttributeNameEnum[] {
			T,
			TEST,
			CHECK,
			SI_UNIT,
			OPER,
			SBO,
			SB_OW,
			CANCEL,
		};

	/**
	 * A public read-only list of all the '<em><b>TPredefined Attribute Name Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TPredefinedAttributeNameEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TPredefined Attribute Name Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TPredefinedAttributeNameEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TPredefinedAttributeNameEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TPredefined Attribute Name Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TPredefinedAttributeNameEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TPredefinedAttributeNameEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TPredefined Attribute Name Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TPredefinedAttributeNameEnum get(int value) {
		switch (value) {
			case T_VALUE: return T;
			case TEST_VALUE: return TEST;
			case CHECK_VALUE: return CHECK;
			case SI_UNIT_VALUE: return SI_UNIT;
			case OPER_VALUE: return OPER;
			case SBO_VALUE: return SBO;
			case SB_OW_VALUE: return SB_OW;
			case CANCEL_VALUE: return CANCEL;
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
	private TPredefinedAttributeNameEnum(int value, String name, String literal) {
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
	
} //TPredefinedAttributeNameEnum
