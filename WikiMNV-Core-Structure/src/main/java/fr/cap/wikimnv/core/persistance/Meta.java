
package fr.cap.wikimnv.core.persistance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour meta complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="meta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operateur" type="{http://persistance.core.wikimnv.cap.fr/}operateur" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meta", propOrder = {
    "key",
    "operateur",
    "value"
})
public class Meta {

    protected String key;
    @XmlSchemaType(name = "string")
    protected Operateur operateur;
    protected String value;

    /**
     * Obtient la valeur de la propri�t� key.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * D�finit la valeur de la propri�t� key.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Obtient la valeur de la propri�t� operateur.
     * 
     * @return
     *     possible object is
     *     {@link Operateur }
     *     
     */
    public Operateur getOperateur() {
        return operateur;
    }

    /**
     * D�finit la valeur de la propri�t� operateur.
     * 
     * @param value
     *     allowed object is
     *     {@link Operateur }
     *     
     */
    public void setOperateur(Operateur value) {
        this.operateur = value;
    }

    /**
     * Obtient la valeur de la propri�t� value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * D�finit la valeur de la propri�t� value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
