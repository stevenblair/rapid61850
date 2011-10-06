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
 * A representation of the literals of the enumeration '<em><b>TDomain LN Group GEnum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ch.iec._61850._2006.scl.SclPackage#getTDomainLNGroupGEnum()
 * @model extendedMetaData="name='tDomainLNGroupGEnum'"
 * @generated
 */
public enum TDomainLNGroupGEnum implements Enumerator {
	/**
	 * The '<em><b>GAPC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAPC_VALUE
	 * @generated
	 * @ordered
	 */
	GAPC(0, "GAPC", "GAPC"),

	/**
	 * The '<em><b>GGIO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GGIO_VALUE
	 * @generated
	 * @ordered
	 */
	GGIO(1, "GGIO", "GGIO"),

	/**
	 * The '<em><b>GSAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GSAL_VALUE
	 * @generated
	 * @ordered
	 */
	GSAL(2, "GSAL", "GSAL");

	/**
	 * The '<em><b>GAPC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GAPC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GAPC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GAPC_VALUE = 0;

	/**
	 * The '<em><b>GGIO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GGIO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GGIO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GGIO_VALUE = 1;

	/**
	 * The '<em><b>GSAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GSAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GSAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GSAL_VALUE = 2;

	/**
	 * An array of all the '<em><b>TDomain LN Group GEnum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TDomainLNGroupGEnum[] VALUES_ARRAY =
		new TDomainLNGroupGEnum[] {
			GAPC,
			GGIO,
			GSAL,
		};

	/**
	 * A public read-only list of all the '<em><b>TDomain LN Group GEnum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TDomainLNGroupGEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TDomain LN Group GEnum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TDomainLNGroupGEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TDomainLNGroupGEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TDomain LN Group GEnum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TDomainLNGroupGEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TDomainLNGroupGEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TDomain LN Group GEnum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TDomainLNGroupGEnum get(int value) {
		switch (value) {
			case GAPC_VALUE: return GAPC;
			case GGIO_VALUE: return GGIO;
			case GSAL_VALUE: return GSAL;
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
	private TDomainLNGroupGEnum(int value, String name, String literal) {
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
	
} //TDomainLNGroupGEnum
