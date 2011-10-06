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
 * A representation of the literals of the enumeration '<em><b>TDomain LN Group TEnum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ch.iec._61850._2006.scl.SclPackage#getTDomainLNGroupTEnum()
 * @model extendedMetaData="name='tDomainLNGroupTEnum'"
 * @generated
 */
public enum TDomainLNGroupTEnum implements Enumerator {
	/**
	 * The '<em><b>TCTR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TCTR_VALUE
	 * @generated
	 * @ordered
	 */
	TCTR(0, "TCTR", "TCTR"),

	/**
	 * The '<em><b>TVTR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TVTR_VALUE
	 * @generated
	 * @ordered
	 */
	TVTR(1, "TVTR", "TVTR");

	/**
	 * The '<em><b>TCTR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TCTR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TCTR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TCTR_VALUE = 0;

	/**
	 * The '<em><b>TVTR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TVTR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TVTR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TVTR_VALUE = 1;

	/**
	 * An array of all the '<em><b>TDomain LN Group TEnum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TDomainLNGroupTEnum[] VALUES_ARRAY =
		new TDomainLNGroupTEnum[] {
			TCTR,
			TVTR,
		};

	/**
	 * A public read-only list of all the '<em><b>TDomain LN Group TEnum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TDomainLNGroupTEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TDomain LN Group TEnum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TDomainLNGroupTEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TDomainLNGroupTEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TDomain LN Group TEnum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TDomainLNGroupTEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TDomainLNGroupTEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TDomain LN Group TEnum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TDomainLNGroupTEnum get(int value) {
		switch (value) {
			case TCTR_VALUE: return TCTR;
			case TVTR_VALUE: return TVTR;
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
	private TDomainLNGroupTEnum(int value, String name, String literal) {
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
	
} //TDomainLNGroupTEnum
