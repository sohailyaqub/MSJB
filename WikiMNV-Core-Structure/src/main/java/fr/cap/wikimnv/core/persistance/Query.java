
package fr.cap.wikimnv.core.persistance;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour query.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="query">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PROFIL_SELECT_COUNTARTICLESECRIT"/>
 *     &lt;enumeration value="PROFIL_SELECT_RANKING"/>
 *     &lt;enumeration value="TAG_RECHERCHETEXTUELLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "query")
@XmlEnum
public enum Query {

    PROFIL_SELECT_COUNTARTICLESECRIT,
    PROFIL_SELECT_RANKING,
    TAG_RECHERCHETEXTUELLE;

    public String value() {
        return name();
    }

    public static Query fromValue(String v) {
        return valueOf(v);
    }

}
