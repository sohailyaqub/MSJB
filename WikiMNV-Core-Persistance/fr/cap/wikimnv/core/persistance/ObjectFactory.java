
package fr.cap.wikimnv.core.persistance;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.cap.wikimnv.core.persistance package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FaireRequeteResponse_QNAME = new QName("http://persistance.core.wikimnv.cap.fr/", "faireRequeteResponse");
    private final static QName _ListerResponse_QNAME = new QName("http://persistance.core.wikimnv.cap.fr/", "listerResponse");
    private final static QName _SauverResponse_QNAME = new QName("http://persistance.core.wikimnv.cap.fr/", "sauverResponse");
    private final static QName _FaireRequete_QNAME = new QName("http://persistance.core.wikimnv.cap.fr/", "faireRequete");
    private final static QName _SupprimerResponse_QNAME = new QName("http://persistance.core.wikimnv.cap.fr/", "supprimerResponse");
    private final static QName _Supprimer_QNAME = new QName("http://persistance.core.wikimnv.cap.fr/", "supprimer");
    private final static QName _Sauver_QNAME = new QName("http://persistance.core.wikimnv.cap.fr/", "sauver");
    private final static QName _LireResponse_QNAME = new QName("http://persistance.core.wikimnv.cap.fr/", "lireResponse");
    private final static QName _Lire_QNAME = new QName("http://persistance.core.wikimnv.cap.fr/", "lire");
    private final static QName _Lister_QNAME = new QName("http://persistance.core.wikimnv.cap.fr/", "lister");
    private final static QName _MNVException_QNAME = new QName("http://persistance.core.wikimnv.cap.fr/", "MNVException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.cap.wikimnv.core.persistance
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MNVException }
     * 
     */
    public MNVException createMNVException() {
        return new MNVException();
    }

    /**
     * Create an instance of {@link Lire }
     * 
     */
    public Lire createLire() {
        return new Lire();
    }

    /**
     * Create an instance of {@link Lister }
     * 
     */
    public Lister createLister() {
        return new Lister();
    }

    /**
     * Create an instance of {@link LireResponse }
     * 
     */
    public LireResponse createLireResponse() {
        return new LireResponse();
    }

    /**
     * Create an instance of {@link Supprimer }
     * 
     */
    public Supprimer createSupprimer() {
        return new Supprimer();
    }

    /**
     * Create an instance of {@link Sauver }
     * 
     */
    public Sauver createSauver() {
        return new Sauver();
    }

    /**
     * Create an instance of {@link FaireRequete }
     * 
     */
    public FaireRequete createFaireRequete() {
        return new FaireRequete();
    }

    /**
     * Create an instance of {@link SupprimerResponse }
     * 
     */
    public SupprimerResponse createSupprimerResponse() {
        return new SupprimerResponse();
    }

    /**
     * Create an instance of {@link SauverResponse }
     * 
     */
    public SauverResponse createSauverResponse() {
        return new SauverResponse();
    }

    /**
     * Create an instance of {@link FaireRequeteResponse }
     * 
     */
    public FaireRequeteResponse createFaireRequeteResponse() {
        return new FaireRequeteResponse();
    }

    /**
     * Create an instance of {@link ListerResponse }
     * 
     */
    public ListerResponse createListerResponse() {
        return new ListerResponse();
    }

    /**
     * Create an instance of {@link Critere }
     * 
     */
    public Critere createCritere() {
        return new Critere();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaireRequeteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://persistance.core.wikimnv.cap.fr/", name = "faireRequeteResponse")
    public JAXBElement<FaireRequeteResponse> createFaireRequeteResponse(FaireRequeteResponse value) {
        return new JAXBElement<FaireRequeteResponse>(_FaireRequeteResponse_QNAME, FaireRequeteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://persistance.core.wikimnv.cap.fr/", name = "listerResponse")
    public JAXBElement<ListerResponse> createListerResponse(ListerResponse value) {
        return new JAXBElement<ListerResponse>(_ListerResponse_QNAME, ListerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SauverResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://persistance.core.wikimnv.cap.fr/", name = "sauverResponse")
    public JAXBElement<SauverResponse> createSauverResponse(SauverResponse value) {
        return new JAXBElement<SauverResponse>(_SauverResponse_QNAME, SauverResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaireRequete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://persistance.core.wikimnv.cap.fr/", name = "faireRequete")
    public JAXBElement<FaireRequete> createFaireRequete(FaireRequete value) {
        return new JAXBElement<FaireRequete>(_FaireRequete_QNAME, FaireRequete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://persistance.core.wikimnv.cap.fr/", name = "supprimerResponse")
    public JAXBElement<SupprimerResponse> createSupprimerResponse(SupprimerResponse value) {
        return new JAXBElement<SupprimerResponse>(_SupprimerResponse_QNAME, SupprimerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Supprimer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://persistance.core.wikimnv.cap.fr/", name = "supprimer")
    public JAXBElement<Supprimer> createSupprimer(Supprimer value) {
        return new JAXBElement<Supprimer>(_Supprimer_QNAME, Supprimer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sauver }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://persistance.core.wikimnv.cap.fr/", name = "sauver")
    public JAXBElement<Sauver> createSauver(Sauver value) {
        return new JAXBElement<Sauver>(_Sauver_QNAME, Sauver.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LireResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://persistance.core.wikimnv.cap.fr/", name = "lireResponse")
    public JAXBElement<LireResponse> createLireResponse(LireResponse value) {
        return new JAXBElement<LireResponse>(_LireResponse_QNAME, LireResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Lire }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://persistance.core.wikimnv.cap.fr/", name = "lire")
    public JAXBElement<Lire> createLire(Lire value) {
        return new JAXBElement<Lire>(_Lire_QNAME, Lire.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Lister }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://persistance.core.wikimnv.cap.fr/", name = "lister")
    public JAXBElement<Lister> createLister(Lister value) {
        return new JAXBElement<Lister>(_Lister_QNAME, Lister.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MNVException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://persistance.core.wikimnv.cap.fr/", name = "MNVException")
    public JAXBElement<MNVException> createMNVException(MNVException value) {
        return new JAXBElement<MNVException>(_MNVException_QNAME, MNVException.class, null, value);
    }

}
