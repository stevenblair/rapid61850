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
 * A representation of the literals of the enumeration '<em><b>TDomain LN Group CEnum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ch.iec._61850._2006.scl.SclPackage#getTDomainLNGroupCEnum()
 * @model extendedMetaData="name='tDomainLNGroupCEnum'"
 * @generated
 */
public enum TDomainLNGroupCEnum implements Enumerator {
	/**
	 * The '<em><b>CILO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CILO_VALUE
	 * @generated
	 * @ordered
	 */
	CILO(0, "CILO", "CILO"),

	/**
	 * The '<em><b>CSWI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSWI_VALUE
	 * @generated
	 * @ordered
	 */
	CSWI(1, "CSWI", "CSWI"),

	/**
	 * The '<em><b>CALH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CALH_VALUE
	 * @generated
	 * @ordered
	 */
	CALH(2, "CALH", "CALH"),

	/**
	 * The '<em><b>CCGR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CCGR_VALUE
	 * @generated
	 * @ordered
	 */
	CCGR(3, "CCGR", "CCGR"),

	/**
	 * The '<em><b>CPOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CPOW_VALUE
	 * @generated
	 * @ordered
	 */
	CPOW(4, "CPOW", "CPOW");

	/**
	 * The '<em><b>CILO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CILO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CILO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CILO_VALUE = 0;

	/**
	 * The '<em><b>CSWI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CSWI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CSWI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CSWI_VALUE = 1;

	/**
	 * The '<em><b>CALH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CALH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CALH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CALH_VALUE = 2;

	/**
	 * The '<em><b>CCGR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CCGR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CCGR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CCGR_VALUE = 3;

	/**
	 * The '<em><b>CPOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CPOW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CPOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CPOW_VALUE = 4;

	/**
	 * An array of all the '<em><b>TDomain LN Group CEnum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TDomainLNGroupCEnum[] VALUES_ARRAY =
		new TDomainLNGroupCEnum[] {
			CILO,
			CSWI,
			CALH,
			CCGR,
			CPOW,
		};

	/**
	 * A public read-only list of all the '<em><b>TDomain LN Group CEnum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TDomainLNGroupCEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TDomain LN Group CEnum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TDomainLNGroupCEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TDomainLNGroupCEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TDomain LN Group CEnum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TDomainLNGroupCEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TDomainLNGroupCEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TDomain LN Group CEnum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TDomainLNGroupCEnum get(int value) {
		switch (value) {
			case CILO_VALUE: return CILO;
			case CSWI_VALUE: return CSWI;
			case CALH_VALUE: return CALH;
			case CCGR_VALUE: return CCGR;
			case CPOW_VALUE: return CPOW;
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
	private TDomainLNGroupCEnum(int value, String name, String literal) {
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
	
} //TDomainLNGroupCEnum
