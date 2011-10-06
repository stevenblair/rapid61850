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
 * A representation of the literals of the enumeration '<em><b>TDomain LN Group PEnum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ch.iec._61850._2006.scl.SclPackage#getTDomainLNGroupPEnum()
 * @model extendedMetaData="name='tDomainLNGroupPEnum'"
 * @generated
 */
public enum TDomainLNGroupPEnum implements Enumerator {
	/**
	 * The '<em><b>PDIF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PDIF_VALUE
	 * @generated
	 * @ordered
	 */
	PDIF(0, "PDIF", "PDIF"),

	/**
	 * The '<em><b>PDIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PDIS_VALUE
	 * @generated
	 * @ordered
	 */
	PDIS(1, "PDIS", "PDIS"),

	/**
	 * The '<em><b>PDIR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PDIR_VALUE
	 * @generated
	 * @ordered
	 */
	PDIR(2, "PDIR", "PDIR"),

	/**
	 * The '<em><b>PDOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PDOP_VALUE
	 * @generated
	 * @ordered
	 */
	PDOP(3, "PDOP", "PDOP"),

	/**
	 * The '<em><b>PDUP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PDUP_VALUE
	 * @generated
	 * @ordered
	 */
	PDUP(4, "PDUP", "PDUP"),

	/**
	 * The '<em><b>PFRC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PFRC_VALUE
	 * @generated
	 * @ordered
	 */
	PFRC(5, "PFRC", "PFRC"),

	/**
	 * The '<em><b>PHAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHAR_VALUE
	 * @generated
	 * @ordered
	 */
	PHAR(6, "PHAR", "PHAR"),

	/**
	 * The '<em><b>PHIZ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHIZ_VALUE
	 * @generated
	 * @ordered
	 */
	PHIZ(7, "PHIZ", "PHIZ"),

	/**
	 * The '<em><b>PIOC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIOC_VALUE
	 * @generated
	 * @ordered
	 */
	PIOC(8, "PIOC", "PIOC"),

	/**
	 * The '<em><b>PMRI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PMRI_VALUE
	 * @generated
	 * @ordered
	 */
	PMRI(9, "PMRI", "PMRI"),

	/**
	 * The '<em><b>PMSS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PMSS_VALUE
	 * @generated
	 * @ordered
	 */
	PMSS(10, "PMSS", "PMSS"),

	/**
	 * The '<em><b>POPF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POPF_VALUE
	 * @generated
	 * @ordered
	 */
	POPF(11, "POPF", "POPF"),

	/**
	 * The '<em><b>PPAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PPAM_VALUE
	 * @generated
	 * @ordered
	 */
	PPAM(12, "PPAM", "PPAM"),

	/**
	 * The '<em><b>PSCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PSCH_VALUE
	 * @generated
	 * @ordered
	 */
	PSCH(13, "PSCH", "PSCH"),

	/**
	 * The '<em><b>PSDE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PSDE_VALUE
	 * @generated
	 * @ordered
	 */
	PSDE(14, "PSDE", "PSDE"),

	/**
	 * The '<em><b>PTEF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PTEF_VALUE
	 * @generated
	 * @ordered
	 */
	PTEF(15, "PTEF", "PTEF"),

	/**
	 * The '<em><b>PTOC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PTOC_VALUE
	 * @generated
	 * @ordered
	 */
	PTOC(16, "PTOC", "PTOC"),

	/**
	 * The '<em><b>PTOF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PTOF_VALUE
	 * @generated
	 * @ordered
	 */
	PTOF(17, "PTOF", "PTOF"),

	/**
	 * The '<em><b>PTOV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PTOV_VALUE
	 * @generated
	 * @ordered
	 */
	PTOV(18, "PTOV", "PTOV"),

	/**
	 * The '<em><b>PTRC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PTRC_VALUE
	 * @generated
	 * @ordered
	 */
	PTRC(19, "PTRC", "PTRC"),

	/**
	 * The '<em><b>PTTR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PTTR_VALUE
	 * @generated
	 * @ordered
	 */
	PTTR(20, "PTTR", "PTTR"),

	/**
	 * The '<em><b>PTUC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PTUC_VALUE
	 * @generated
	 * @ordered
	 */
	PTUC(21, "PTUC", "PTUC"),

	/**
	 * The '<em><b>PTUV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PTUV_VALUE
	 * @generated
	 * @ordered
	 */
	PTUV(22, "PTUV", "PTUV"),

	/**
	 * The '<em><b>PUPF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUPF_VALUE
	 * @generated
	 * @ordered
	 */
	PUPF(23, "PUPF", "PUPF"),

	/**
	 * The '<em><b>PTUF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PTUF_VALUE
	 * @generated
	 * @ordered
	 */
	PTUF(24, "PTUF", "PTUF"),

	/**
	 * The '<em><b>PVOC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PVOC_VALUE
	 * @generated
	 * @ordered
	 */
	PVOC(25, "PVOC", "PVOC"),

	/**
	 * The '<em><b>PVPH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PVPH_VALUE
	 * @generated
	 * @ordered
	 */
	PVPH(26, "PVPH", "PVPH"),

	/**
	 * The '<em><b>PZSU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PZSU_VALUE
	 * @generated
	 * @ordered
	 */
	PZSU(27, "PZSU", "PZSU");

	/**
	 * The '<em><b>PDIF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PDIF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PDIF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PDIF_VALUE = 0;

	/**
	 * The '<em><b>PDIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PDIS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PDIS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PDIS_VALUE = 1;

	/**
	 * The '<em><b>PDIR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PDIR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PDIR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PDIR_VALUE = 2;

	/**
	 * The '<em><b>PDOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PDOP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PDOP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PDOP_VALUE = 3;

	/**
	 * The '<em><b>PDUP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PDUP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PDUP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PDUP_VALUE = 4;

	/**
	 * The '<em><b>PFRC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PFRC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PFRC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PFRC_VALUE = 5;

	/**
	 * The '<em><b>PHAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PHAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PHAR_VALUE = 6;

	/**
	 * The '<em><b>PHIZ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PHIZ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHIZ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PHIZ_VALUE = 7;

	/**
	 * The '<em><b>PIOC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIOC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIOC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PIOC_VALUE = 8;

	/**
	 * The '<em><b>PMRI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PMRI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PMRI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PMRI_VALUE = 9;

	/**
	 * The '<em><b>PMSS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PMSS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PMSS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PMSS_VALUE = 10;

	/**
	 * The '<em><b>POPF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POPF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POPF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POPF_VALUE = 11;

	/**
	 * The '<em><b>PPAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PPAM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PPAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PPAM_VALUE = 12;

	/**
	 * The '<em><b>PSCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PSCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PSCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PSCH_VALUE = 13;

	/**
	 * The '<em><b>PSDE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PSDE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PSDE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PSDE_VALUE = 14;

	/**
	 * The '<em><b>PTEF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PTEF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PTEF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PTEF_VALUE = 15;

	/**
	 * The '<em><b>PTOC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PTOC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PTOC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PTOC_VALUE = 16;

	/**
	 * The '<em><b>PTOF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PTOF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PTOF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PTOF_VALUE = 17;

	/**
	 * The '<em><b>PTOV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PTOV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PTOV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PTOV_VALUE = 18;

	/**
	 * The '<em><b>PTRC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PTRC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PTRC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PTRC_VALUE = 19;

	/**
	 * The '<em><b>PTTR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PTTR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PTTR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PTTR_VALUE = 20;

	/**
	 * The '<em><b>PTUC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PTUC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PTUC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PTUC_VALUE = 21;

	/**
	 * The '<em><b>PTUV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PTUV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PTUV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PTUV_VALUE = 22;

	/**
	 * The '<em><b>PUPF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PUPF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUPF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUPF_VALUE = 23;

	/**
	 * The '<em><b>PTUF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PTUF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PTUF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PTUF_VALUE = 24;

	/**
	 * The '<em><b>PVOC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PVOC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PVOC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PVOC_VALUE = 25;

	/**
	 * The '<em><b>PVPH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PVPH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PVPH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PVPH_VALUE = 26;

	/**
	 * The '<em><b>PZSU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PZSU</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PZSU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PZSU_VALUE = 27;

	/**
	 * An array of all the '<em><b>TDomain LN Group PEnum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TDomainLNGroupPEnum[] VALUES_ARRAY =
		new TDomainLNGroupPEnum[] {
			PDIF,
			PDIS,
			PDIR,
			PDOP,
			PDUP,
			PFRC,
			PHAR,
			PHIZ,
			PIOC,
			PMRI,
			PMSS,
			POPF,
			PPAM,
			PSCH,
			PSDE,
			PTEF,
			PTOC,
			PTOF,
			PTOV,
			PTRC,
			PTTR,
			PTUC,
			PTUV,
			PUPF,
			PTUF,
			PVOC,
			PVPH,
			PZSU,
		};

	/**
	 * A public read-only list of all the '<em><b>TDomain LN Group PEnum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TDomainLNGroupPEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TDomain LN Group PEnum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TDomainLNGroupPEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TDomainLNGroupPEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TDomain LN Group PEnum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TDomainLNGroupPEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TDomainLNGroupPEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TDomain LN Group PEnum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TDomainLNGroupPEnum get(int value) {
		switch (value) {
			case PDIF_VALUE: return PDIF;
			case PDIS_VALUE: return PDIS;
			case PDIR_VALUE: return PDIR;
			case PDOP_VALUE: return PDOP;
			case PDUP_VALUE: return PDUP;
			case PFRC_VALUE: return PFRC;
			case PHAR_VALUE: return PHAR;
			case PHIZ_VALUE: return PHIZ;
			case PIOC_VALUE: return PIOC;
			case PMRI_VALUE: return PMRI;
			case PMSS_VALUE: return PMSS;
			case POPF_VALUE: return POPF;
			case PPAM_VALUE: return PPAM;
			case PSCH_VALUE: return PSCH;
			case PSDE_VALUE: return PSDE;
			case PTEF_VALUE: return PTEF;
			case PTOC_VALUE: return PTOC;
			case PTOF_VALUE: return PTOF;
			case PTOV_VALUE: return PTOV;
			case PTRC_VALUE: return PTRC;
			case PTTR_VALUE: return PTTR;
			case PTUC_VALUE: return PTUC;
			case PTUV_VALUE: return PTUV;
			case PUPF_VALUE: return PUPF;
			case PTUF_VALUE: return PTUF;
			case PVOC_VALUE: return PVOC;
			case PVPH_VALUE: return PVPH;
			case PZSU_VALUE: return PZSU;
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
	private TDomainLNGroupPEnum(int value, String name, String literal) {
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
	
} //TDomainLNGroupPEnum
