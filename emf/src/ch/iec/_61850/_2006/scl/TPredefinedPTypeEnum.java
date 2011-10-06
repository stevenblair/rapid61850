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
 * A representation of the literals of the enumeration '<em><b>TPredefined PType Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ch.iec._61850._2006.scl.SclPackage#getTPredefinedPTypeEnum()
 * @model extendedMetaData="name='tPredefinedPTypeEnum'"
 * @generated
 */
public enum TPredefinedPTypeEnum implements Enumerator {
	/**
	 * The '<em><b>IP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IP_VALUE
	 * @generated
	 * @ordered
	 */
	IP(0, "IP", "IP"),

	/**
	 * The '<em><b>IPSUBNET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPSUBNET_VALUE
	 * @generated
	 * @ordered
	 */
	IPSUBNET(1, "IPSUBNET", "IP-SUBNET"),

	/**
	 * The '<em><b>IPGATEWAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPGATEWAY_VALUE
	 * @generated
	 * @ordered
	 */
	IPGATEWAY(2, "IPGATEWAY", "IP-GATEWAY"),

	/**
	 * The '<em><b>OSINSAP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OSINSAP_VALUE
	 * @generated
	 * @ordered
	 */
	OSINSAP(3, "OSINSAP", "OSI-NSAP"),

	/**
	 * The '<em><b>OSITSEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OSITSEL_VALUE
	 * @generated
	 * @ordered
	 */
	OSITSEL(4, "OSITSEL", "OSI-TSEL"),

	/**
	 * The '<em><b>OSISSEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OSISSEL_VALUE
	 * @generated
	 * @ordered
	 */
	OSISSEL(5, "OSISSEL", "OSI-SSEL"),

	/**
	 * The '<em><b>OSIPSEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OSIPSEL_VALUE
	 * @generated
	 * @ordered
	 */
	OSIPSEL(6, "OSIPSEL", "OSI-PSEL"),

	/**
	 * The '<em><b>OSIAP Title</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OSIAP_TITLE_VALUE
	 * @generated
	 * @ordered
	 */
	OSIAP_TITLE(7, "OSIAPTitle", "OSI-AP-Title"),

	/**
	 * The '<em><b>OSIAP Invoke</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OSIAP_INVOKE_VALUE
	 * @generated
	 * @ordered
	 */
	OSIAP_INVOKE(8, "OSIAPInvoke", "OSI-AP-Invoke"),

	/**
	 * The '<em><b>OSIAE Qualifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OSIAE_QUALIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	OSIAE_QUALIFIER(9, "OSIAEQualifier", "OSI-AE-Qualifier"),

	/**
	 * The '<em><b>OSIAE Invoke</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OSIAE_INVOKE_VALUE
	 * @generated
	 * @ordered
	 */
	OSIAE_INVOKE(10, "OSIAEInvoke", "OSI-AE-Invoke"),

	/**
	 * The '<em><b>MAC Address</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAC_ADDRESS_VALUE
	 * @generated
	 * @ordered
	 */
	MAC_ADDRESS(11, "MACAddress", "MAC-Address"),

	/**
	 * The '<em><b>APPID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPID_VALUE
	 * @generated
	 * @ordered
	 */
	APPID(12, "APPID", "APPID"),

	/**
	 * The '<em><b>VLANPRIORITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VLANPRIORITY_VALUE
	 * @generated
	 * @ordered
	 */
	VLANPRIORITY(13, "VLANPRIORITY", "VLAN-PRIORITY"),

	/**
	 * The '<em><b>VLANID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VLANID_VALUE
	 * @generated
	 * @ordered
	 */
	VLANID(14, "VLANID", "VLAN-ID");

	/**
	 * The '<em><b>IP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IP_VALUE = 0;

	/**
	 * The '<em><b>IPSUBNET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IPSUBNET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IPSUBNET
	 * @model literal="IP-SUBNET"
	 * @generated
	 * @ordered
	 */
	public static final int IPSUBNET_VALUE = 1;

	/**
	 * The '<em><b>IPGATEWAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IPGATEWAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IPGATEWAY
	 * @model literal="IP-GATEWAY"
	 * @generated
	 * @ordered
	 */
	public static final int IPGATEWAY_VALUE = 2;

	/**
	 * The '<em><b>OSINSAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OSINSAP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OSINSAP
	 * @model literal="OSI-NSAP"
	 * @generated
	 * @ordered
	 */
	public static final int OSINSAP_VALUE = 3;

	/**
	 * The '<em><b>OSITSEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OSITSEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OSITSEL
	 * @model literal="OSI-TSEL"
	 * @generated
	 * @ordered
	 */
	public static final int OSITSEL_VALUE = 4;

	/**
	 * The '<em><b>OSISSEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OSISSEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OSISSEL
	 * @model literal="OSI-SSEL"
	 * @generated
	 * @ordered
	 */
	public static final int OSISSEL_VALUE = 5;

	/**
	 * The '<em><b>OSIPSEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OSIPSEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OSIPSEL
	 * @model literal="OSI-PSEL"
	 * @generated
	 * @ordered
	 */
	public static final int OSIPSEL_VALUE = 6;

	/**
	 * The '<em><b>OSIAP Title</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OSIAP Title</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OSIAP_TITLE
	 * @model name="OSIAPTitle" literal="OSI-AP-Title"
	 * @generated
	 * @ordered
	 */
	public static final int OSIAP_TITLE_VALUE = 7;

	/**
	 * The '<em><b>OSIAP Invoke</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OSIAP Invoke</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OSIAP_INVOKE
	 * @model name="OSIAPInvoke" literal="OSI-AP-Invoke"
	 * @generated
	 * @ordered
	 */
	public static final int OSIAP_INVOKE_VALUE = 8;

	/**
	 * The '<em><b>OSIAE Qualifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OSIAE Qualifier</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OSIAE_QUALIFIER
	 * @model name="OSIAEQualifier" literal="OSI-AE-Qualifier"
	 * @generated
	 * @ordered
	 */
	public static final int OSIAE_QUALIFIER_VALUE = 9;

	/**
	 * The '<em><b>OSIAE Invoke</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OSIAE Invoke</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OSIAE_INVOKE
	 * @model name="OSIAEInvoke" literal="OSI-AE-Invoke"
	 * @generated
	 * @ordered
	 */
	public static final int OSIAE_INVOKE_VALUE = 10;

	/**
	 * The '<em><b>MAC Address</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MAC Address</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAC_ADDRESS
	 * @model name="MACAddress" literal="MAC-Address"
	 * @generated
	 * @ordered
	 */
	public static final int MAC_ADDRESS_VALUE = 11;

	/**
	 * The '<em><b>APPID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>APPID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APPID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int APPID_VALUE = 12;

	/**
	 * The '<em><b>VLANPRIORITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VLANPRIORITY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VLANPRIORITY
	 * @model literal="VLAN-PRIORITY"
	 * @generated
	 * @ordered
	 */
	public static final int VLANPRIORITY_VALUE = 13;

	/**
	 * The '<em><b>VLANID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VLANID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VLANID
	 * @model literal="VLAN-ID"
	 * @generated
	 * @ordered
	 */
	public static final int VLANID_VALUE = 14;

	/**
	 * An array of all the '<em><b>TPredefined PType Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TPredefinedPTypeEnum[] VALUES_ARRAY =
		new TPredefinedPTypeEnum[] {
			IP,
			IPSUBNET,
			IPGATEWAY,
			OSINSAP,
			OSITSEL,
			OSISSEL,
			OSIPSEL,
			OSIAP_TITLE,
			OSIAP_INVOKE,
			OSIAE_QUALIFIER,
			OSIAE_INVOKE,
			MAC_ADDRESS,
			APPID,
			VLANPRIORITY,
			VLANID,
		};

	/**
	 * A public read-only list of all the '<em><b>TPredefined PType Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TPredefinedPTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TPredefined PType Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TPredefinedPTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TPredefinedPTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TPredefined PType Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TPredefinedPTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TPredefinedPTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TPredefined PType Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TPredefinedPTypeEnum get(int value) {
		switch (value) {
			case IP_VALUE: return IP;
			case IPSUBNET_VALUE: return IPSUBNET;
			case IPGATEWAY_VALUE: return IPGATEWAY;
			case OSINSAP_VALUE: return OSINSAP;
			case OSITSEL_VALUE: return OSITSEL;
			case OSISSEL_VALUE: return OSISSEL;
			case OSIPSEL_VALUE: return OSIPSEL;
			case OSIAP_TITLE_VALUE: return OSIAP_TITLE;
			case OSIAP_INVOKE_VALUE: return OSIAP_INVOKE;
			case OSIAE_QUALIFIER_VALUE: return OSIAE_QUALIFIER;
			case OSIAE_INVOKE_VALUE: return OSIAE_INVOKE;
			case MAC_ADDRESS_VALUE: return MAC_ADDRESS;
			case APPID_VALUE: return APPID;
			case VLANPRIORITY_VALUE: return VLANPRIORITY;
			case VLANID_VALUE: return VLANID;
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
	private TPredefinedPTypeEnum(int value, String name, String literal) {
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
	
} //TPredefinedPTypeEnum
