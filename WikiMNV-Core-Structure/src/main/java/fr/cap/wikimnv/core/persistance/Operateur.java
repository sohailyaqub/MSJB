
package fr.cap.wikimnv.core.persistance;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour operateur.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="operateur">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GT"/>
 *     &lt;enumeration value="LT"/>
 *     &lt;enumeration value="EQ"/>
 *     &lt;enumeration value="NEQ"/>
 *     &lt;enumeration value="LIKE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "operateur")
@XmlEnum
public enum Operateur {

    GT,
    LT,
    EQ,
    NEQ,
    LIKE;

    public String value() {
        return name();
    }

    public static Operateur fromValue(String v) {
        return valueOf(v);
    }

}
