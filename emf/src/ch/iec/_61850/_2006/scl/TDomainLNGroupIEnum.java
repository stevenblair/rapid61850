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
 * A representation of the literals of the enumeration '<em><b>TDomain LN Group IEnum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ch.iec._61850._2006.scl.SclPackage#getTDomainLNGroupIEnum()
 * @model extendedMetaData="name='tDomainLNGroupIEnum'"
 * @generated
 */
public enum TDomainLNGroupIEnum implements Enumerator {
	/**
	 * The '<em><b>IHMI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IHMI_VALUE
	 * @generated
	 * @ordered
	 */
	IHMI(0, "IHMI", "IHMI"),

	/**
	 * The '<em><b>IARC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IARC_VALUE
	 * @generated
	 * @ordered
	 */
	IARC(1, "IARC", "IARC"),

	/**
	 * The '<em><b>ITCI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITCI_VALUE
	 * @generated
	 * @ordered
	 */
	ITCI(2, "ITCI", "ITCI"),

	/**
	 * The '<em><b>ITMI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITMI_VALUE
	 * @generated
	 * @ordered
	 */
	ITMI(3, "ITMI", "ITMI");

	/**
	 * The '<em><b>IHMI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IHMI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IHMI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IHMI_VALUE = 0;

	/**
	 * The '<em><b>IARC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IARC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IARC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IARC_VALUE = 1;

	/**
	 * The '<em><b>ITCI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ITCI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ITCI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ITCI_VALUE = 2;

	/**
	 * The '<em><b>ITMI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ITMI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ITMI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ITMI_VALUE = 3;

	/**
	 * An array of all the '<em><b>TDomain LN Group IEnum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TDomainLNGroupIEnum[] VALUES_ARRAY =
		new TDomainLNGroupIEnum[] {
			IHMI,
			IARC,
			ITCI,
			ITMI,
		};

	/**
	 * A public read-only list of all the '<em><b>TDomain LN Group IEnum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TDomainLNGroupIEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TDomain LN Group IEnum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TDomainLNGroupIEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TDomainLNGroupIEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TDomain LN Group IEnum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TDomainLNGroupIEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TDomainLNGroupIEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TDomain LN Group IEnum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TDomainLNGroupIEnum get(int value) {
		switch (value) {
			case IHMI_VALUE: return IHMI;
			case IARC_VALUE: return IARC;
			case ITCI_VALUE: return ITCI;
			case ITMI_VALUE: return ITMI;
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
	private TDomainLNGroupIEnum(int value, String name, String literal) {
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
	
} //TDomainLNGroupIEnum
