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
 * A representation of the literals of the enumeration '<em><b>TDomain LN Group YEnum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ch.iec._61850._2006.scl.SclPackage#getTDomainLNGroupYEnum()
 * @model extendedMetaData="name='tDomainLNGroupYEnum'"
 * @generated
 */
public enum TDomainLNGroupYEnum implements Enumerator {
	/**
	 * The '<em><b>YPTR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YPTR_VALUE
	 * @generated
	 * @ordered
	 */
	YPTR(0, "YPTR", "YPTR"),

	/**
	 * The '<em><b>YEFN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEFN_VALUE
	 * @generated
	 * @ordered
	 */
	YEFN(1, "YEFN", "YEFN"),

	/**
	 * The '<em><b>YLTC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YLTC_VALUE
	 * @generated
	 * @ordered
	 */
	YLTC(2, "YLTC", "YLTC"),

	/**
	 * The '<em><b>YPSH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YPSH_VALUE
	 * @generated
	 * @ordered
	 */
	YPSH(3, "YPSH", "YPSH");

	/**
	 * The '<em><b>YPTR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>YPTR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #YPTR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int YPTR_VALUE = 0;

	/**
	 * The '<em><b>YEFN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>YEFN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #YEFN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int YEFN_VALUE = 1;

	/**
	 * The '<em><b>YLTC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>YLTC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #YLTC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int YLTC_VALUE = 2;

	/**
	 * The '<em><b>YPSH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>YPSH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #YPSH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int YPSH_VALUE = 3;

	/**
	 * An array of all the '<em><b>TDomain LN Group YEnum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TDomainLNGroupYEnum[] VALUES_ARRAY =
		new TDomainLNGroupYEnum[] {
			YPTR,
			YEFN,
			YLTC,
			YPSH,
		};

	/**
	 * A public read-only list of all the '<em><b>TDomain LN Group YEnum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TDomainLNGroupYEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TDomain LN Group YEnum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TDomainLNGroupYEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TDomainLNGroupYEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TDomain LN Group YEnum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TDomainLNGroupYEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TDomainLNGroupYEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TDomain LN Group YEnum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TDomainLNGroupYEnum get(int value) {
		switch (value) {
			case YPTR_VALUE: return YPTR;
			case YEFN_VALUE: return YEFN;
			case YLTC_VALUE: return YLTC;
			case YPSH_VALUE: return YPSH;
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
	private TDomainLNGroupYEnum(int value, String name, String literal) {
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
	
} //TDomainLNGroupYEnum
