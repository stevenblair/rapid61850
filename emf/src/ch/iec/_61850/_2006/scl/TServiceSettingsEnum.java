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
 * A representation of the literals of the enumeration '<em><b>TService Settings Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ch.iec._61850._2006.scl.SclPackage#getTServiceSettingsEnum()
 * @model extendedMetaData="name='tServiceSettingsEnum'"
 * @generated
 */
public enum TServiceSettingsEnum implements Enumerator {
	/**
	 * The '<em><b>Dyn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DYN_VALUE
	 * @generated
	 * @ordered
	 */
	DYN(0, "Dyn", "Dyn"),

	/**
	 * The '<em><b>Conf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONF_VALUE
	 * @generated
	 * @ordered
	 */
	CONF(1, "Conf", "Conf"),

	/**
	 * The '<em><b>Fix</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIX_VALUE
	 * @generated
	 * @ordered
	 */
	FIX(2, "Fix", "Fix");

	/**
	 * The '<em><b>Dyn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dyn</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DYN
	 * @model name="Dyn"
	 * @generated
	 * @ordered
	 */
	public static final int DYN_VALUE = 0;

	/**
	 * The '<em><b>Conf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Conf</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONF
	 * @model name="Conf"
	 * @generated
	 * @ordered
	 */
	public static final int CONF_VALUE = 1;

	/**
	 * The '<em><b>Fix</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fix</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIX
	 * @model name="Fix"
	 * @generated
	 * @ordered
	 */
	public static final int FIX_VALUE = 2;

	/**
	 * An array of all the '<em><b>TService Settings Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TServiceSettingsEnum[] VALUES_ARRAY =
		new TServiceSettingsEnum[] {
			DYN,
			CONF,
			FIX,
		};

	/**
	 * A public read-only list of all the '<em><b>TService Settings Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TServiceSettingsEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TService Settings Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TServiceSettingsEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TServiceSettingsEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TService Settings Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TServiceSettingsEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TServiceSettingsEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TService Settings Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TServiceSettingsEnum get(int value) {
		switch (value) {
			case DYN_VALUE: return DYN;
			case CONF_VALUE: return CONF;
			case FIX_VALUE: return FIX;
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
	private TServiceSettingsEnum(int value, String name, String literal) {
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
	
} //TServiceSettingsEnum
