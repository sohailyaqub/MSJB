
package fr.cap.wikimnv.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ranking complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ranking">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://service.wikimnv.cap.fr/}profil" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ranking", propOrder = {
    "arg0"
})
public class Ranking {

    protected Profil arg0;

    /**
     * Obtient la valeur de la propriété arg0.
     * 
     * @return
     *     possible object is
     *     {@link Profil }
     *     
     */
    public Profil getArg0() {
        return arg0;
    }

    /**
     * Définit la valeur de la propriété arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link Profil }
     *     
     */
    public void setArg0(Profil value) {
        this.arg0 = value;
    }

}
