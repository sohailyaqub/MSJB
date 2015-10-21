
package fr.cap.wikimnv.core.persistance;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeStructure.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="typeStructure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ARTICLE"/>
 *     &lt;enumeration value="COMMENTAIRE"/>
 *     &lt;enumeration value="HISTORIQUE"/>
 *     &lt;enumeration value="PROFIL"/>
 *     &lt;enumeration value="ROLES"/>
 *     &lt;enumeration value="TAG"/>
 *     &lt;enumeration value="TEMPLATE"/>
 *     &lt;enumeration value="USER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeStructure")
@XmlEnum
public enum TypeStructure {

    ARTICLE,
    COMMENTAIRE,
    HISTORIQUE,
    PROFIL,
    ROLES,
    TAG,
    TEMPLATE,
    USER;

    public String value() {
        return name();
    }

    public static TypeStructure fromValue(String v) {
        return valueOf(v);
    }

}
