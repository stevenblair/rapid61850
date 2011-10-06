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
 * A representation of the literals of the enumeration '<em><b>TPredefined Basic Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ch.iec._61850._2006.scl.SclPackage#getTPredefinedBasicTypeEnum()
 * @model extendedMetaData="name='tPredefinedBasicTypeEnum'"
 * @generated
 */
public enum TPredefinedBasicTypeEnum implements Enumerator {
	/**
	 * The '<em><b>BOOLEAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN(0, "BOOLEAN", "BOOLEAN"),

	/**
	 * The '<em><b>INT8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT8_VALUE
	 * @generated
	 * @ordered
	 */
	INT8(1, "INT8", "INT8"),

	/**
	 * The '<em><b>INT16</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT16_VALUE
	 * @generated
	 * @ordered
	 */
	INT16(2, "INT16", "INT16"),

	/**
	 * The '<em><b>INT24</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT24_VALUE
	 * @generated
	 * @ordered
	 */
	INT24(3, "INT24", "INT24"),

	/**
	 * The '<em><b>INT32</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT32_VALUE
	 * @generated
	 * @ordered
	 */
	INT32(4, "INT32", "INT32"),

	/**
	 * The '<em><b>INT128</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT128_VALUE
	 * @generated
	 * @ordered
	 */
	INT128(5, "INT128", "INT128"),

	/**
	 * The '<em><b>INT8U</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT8U_VALUE
	 * @generated
	 * @ordered
	 */
	INT8U(6, "INT8U", "INT8U"),

	/**
	 * The '<em><b>INT16U</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT16U_VALUE
	 * @generated
	 * @ordered
	 */
	INT16U(7, "INT16U", "INT16U"),

	/**
	 * The '<em><b>INT24U</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT24U_VALUE
	 * @generated
	 * @ordered
	 */
	INT24U(8, "INT24U", "INT24U"),

	/**
	 * The '<em><b>INT32U</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT32U_VALUE
	 * @generated
	 * @ordered
	 */
	INT32U(9, "INT32U", "INT32U"),

	/**
	 * The '<em><b>FLOAT32</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT32_VALUE
	 * @generated
	 * @ordered
	 */
	FLOAT32(10, "FLOAT32", "FLOAT32"),

	/**
	 * The '<em><b>FLOAT64</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT64_VALUE
	 * @generated
	 * @ordered
	 */
	FLOAT64(11, "FLOAT64", "FLOAT64"),

	/**
	 * The '<em><b>Enum</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM(12, "Enum", "Enum"),

	/**
	 * The '<em><b>Dbpos</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DBPOS_VALUE
	 * @generated
	 * @ordered
	 */
	DBPOS(13, "Dbpos", "Dbpos"),

	/**
	 * The '<em><b>Tcmd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TCMD_VALUE
	 * @generated
	 * @ordered
	 */
	TCMD(14, "Tcmd", "Tcmd"),

	/**
	 * The '<em><b>Quality</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUALITY_VALUE
	 * @generated
	 * @ordered
	 */
	QUALITY(15, "Quality", "Quality"),

	/**
	 * The '<em><b>Timestamp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMESTAMP_VALUE
	 * @generated
	 * @ordered
	 */
	TIMESTAMP(16, "Timestamp", "Timestamp"),

	/**
	 * The '<em><b>Vis String32</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIS_STRING32_VALUE
	 * @generated
	 * @ordered
	 */
	VIS_STRING32(17, "VisString32", "VisString32"),

	/**
	 * The '<em><b>Vis String64</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIS_STRING64_VALUE
	 * @generated
	 * @ordered
	 */
	VIS_STRING64(18, "VisString64", "VisString64"),

	/**
	 * The '<em><b>Vis String129</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIS_STRING129_VALUE
	 * @generated
	 * @ordered
	 */
	VIS_STRING129(19, "VisString129", "VisString129"),

	/**
	 * The '<em><b>Vis String255</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIS_STRING255_VALUE
	 * @generated
	 * @ordered
	 */
	VIS_STRING255(20, "VisString255", "VisString255"),

	/**
	 * The '<em><b>Octet64</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCTET64_VALUE
	 * @generated
	 * @ordered
	 */
	OCTET64(21, "Octet64", "Octet64"),

	/**
	 * The '<em><b>Struct</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRUCT_VALUE
	 * @generated
	 * @ordered
	 */
	STRUCT(22, "Struct", "Struct"),

	/**
	 * The '<em><b>Entry Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTRY_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	ENTRY_TIME(23, "EntryTime", "EntryTime"),

	/**
	 * The '<em><b>Unicode255</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNICODE255_VALUE
	 * @generated
	 * @ordered
	 */
	UNICODE255(24, "Unicode255", "Unicode255"),

	/**
	 * The '<em><b>Check</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECK_VALUE
	 * @generated
	 * @ordered
	 */
	CHECK(25, "Check", "Check");

	/**
	 * The '<em><b>BOOLEAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BOOLEAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_VALUE = 0;

	/**
	 * The '<em><b>INT8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INT8</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INT8
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INT8_VALUE = 1;

	/**
	 * The '<em><b>INT16</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INT16</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INT16
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INT16_VALUE = 2;

	/**
	 * The '<em><b>INT24</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INT24</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INT24
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INT24_VALUE = 3;

	/**
	 * The '<em><b>INT32</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INT32</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INT32
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INT32_VALUE = 4;

	/**
	 * The '<em><b>INT128</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INT128</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INT128
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INT128_VALUE = 5;

	/**
	 * The '<em><b>INT8U</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INT8U</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INT8U
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INT8U_VALUE = 6;

	/**
	 * The '<em><b>INT16U</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INT16U</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INT16U
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INT16U_VALUE = 7;

	/**
	 * The '<em><b>INT24U</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INT24U</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INT24U
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INT24U_VALUE = 8;

	/**
	 * The '<em><b>INT32U</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INT32U</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INT32U
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INT32U_VALUE = 9;

	/**
	 * The '<em><b>FLOAT32</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FLOAT32</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOAT32
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLOAT32_VALUE = 10;

	/**
	 * The '<em><b>FLOAT64</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FLOAT64</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOAT64
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLOAT64_VALUE = 11;

	/**
	 * The '<em><b>Enum</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enum</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM
	 * @model name="Enum"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_VALUE = 12;

	/**
	 * The '<em><b>Dbpos</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dbpos</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DBPOS
	 * @model name="Dbpos"
	 * @generated
	 * @ordered
	 */
	public static final int DBPOS_VALUE = 13;

	/**
	 * The '<em><b>Tcmd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tcmd</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TCMD
	 * @model name="Tcmd"
	 * @generated
	 * @ordered
	 */
	public static final int TCMD_VALUE = 14;

	/**
	 * The '<em><b>Quality</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Quality</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUALITY
	 * @model name="Quality"
	 * @generated
	 * @ordered
	 */
	public static final int QUALITY_VALUE = 15;

	/**
	 * The '<em><b>Timestamp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Timestamp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIMESTAMP
	 * @model name="Timestamp"
	 * @generated
	 * @ordered
	 */
	public static final int TIMESTAMP_VALUE = 16;

	/**
	 * The '<em><b>Vis String32</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vis String32</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIS_STRING32
	 * @model name="VisString32"
	 * @generated
	 * @ordered
	 */
	public static final int VIS_STRING32_VALUE = 17;

	/**
	 * The '<em><b>Vis String64</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vis String64</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIS_STRING64
	 * @model name="VisString64"
	 * @generated
	 * @ordered
	 */
	public static final int VIS_STRING64_VALUE = 18;

	/**
	 * The '<em><b>Vis String129</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vis String129</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIS_STRING129
	 * @model name="VisString129"
	 * @generated
	 * @ordered
	 */
	public static final int VIS_STRING129_VALUE = 19;

	/**
	 * The '<em><b>Vis String255</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vis String255</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIS_STRING255
	 * @model name="VisString255"
	 * @generated
	 * @ordered
	 */
	public static final int VIS_STRING255_VALUE = 20;

	/**
	 * The '<em><b>Octet64</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Octet64</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OCTET64
	 * @model name="Octet64"
	 * @generated
	 * @ordered
	 */
	public static final int OCTET64_VALUE = 21;

	/**
	 * The '<em><b>Struct</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Struct</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRUCT
	 * @model name="Struct"
	 * @generated
	 * @ordered
	 */
	public static final int STRUCT_VALUE = 22;

	/**
	 * The '<em><b>Entry Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Entry Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENTRY_TIME
	 * @model name="EntryTime"
	 * @generated
	 * @ordered
	 */
	public static final int ENTRY_TIME_VALUE = 23;

	/**
	 * The '<em><b>Unicode255</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unicode255</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNICODE255
	 * @model name="Unicode255"
	 * @generated
	 * @ordered
	 */
	public static final int UNICODE255_VALUE = 24;

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
	public static final int CHECK_VALUE = 25;

	/**
	 * An array of all the '<em><b>TPredefined Basic Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TPredefinedBasicTypeEnum[] VALUES_ARRAY =
		new TPredefinedBasicTypeEnum[] {
			BOOLEAN,
			INT8,
			INT16,
			INT24,
			INT32,
			INT128,
			INT8U,
			INT16U,
			INT24U,
			INT32U,
			FLOAT32,
			FLOAT64,
			ENUM,
			DBPOS,
			TCMD,
			QUALITY,
			TIMESTAMP,
			VIS_STRING32,
			VIS_STRING64,
			VIS_STRING129,
			VIS_STRING255,
			OCTET64,
			STRUCT,
			ENTRY_TIME,
			UNICODE255,
			CHECK,
		};

	/**
	 * A public read-only list of all the '<em><b>TPredefined Basic Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TPredefinedBasicTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TPredefined Basic Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TPredefinedBasicTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TPredefinedBasicTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TPredefined Basic Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TPredefinedBasicTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TPredefinedBasicTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TPredefined Basic Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TPredefinedBasicTypeEnum get(int value) {
		switch (value) {
			case BOOLEAN_VALUE: return BOOLEAN;
			case INT8_VALUE: return INT8;
			case INT16_VALUE: return INT16;
			case INT24_VALUE: return INT24;
			case INT32_VALUE: return INT32;
			case INT128_VALUE: return INT128;
			case INT8U_VALUE: return INT8U;
			case INT16U_VALUE: return INT16U;
			case INT24U_VALUE: return INT24U;
			case INT32U_VALUE: return INT32U;
			case FLOAT32_VALUE: return FLOAT32;
			case FLOAT64_VALUE: return FLOAT64;
			case ENUM_VALUE: return ENUM;
			case DBPOS_VALUE: return DBPOS;
			case TCMD_VALUE: return TCMD;
			case QUALITY_VALUE: return QUALITY;
			case TIMESTAMP_VALUE: return TIMESTAMP;
			case VIS_STRING32_VALUE: return VIS_STRING32;
			case VIS_STRING64_VALUE: return VIS_STRING64;
			case VIS_STRING129_VALUE: return VIS_STRING129;
			case VIS_STRING255_VALUE: return VIS_STRING255;
			case OCTET64_VALUE: return OCTET64;
			case STRUCT_VALUE: return STRUCT;
			case ENTRY_TIME_VALUE: return ENTRY_TIME;
			case UNICODE255_VALUE: return UNICODE255;
			case CHECK_VALUE: return CHECK;
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
	private TPredefinedBasicTypeEnum(int value, String name, String literal) {
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
	
} //TPredefinedBasicTypeEnum
