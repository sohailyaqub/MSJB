
package fr.cap.wikimnv.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.cap.wikimnv.service package. 
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

    private final static QName _SupprimerResponse_QNAME = new QName("http://service.wikimnv.cap.fr/", "supprimerResponse");
    private final static QName _SauverResponse_QNAME = new QName("http://service.wikimnv.cap.fr/", "sauverResponse");
    private final static QName _Ranking_QNAME = new QName("http://service.wikimnv.cap.fr/", "ranking");
    private final static QName _MNVException_QNAME = new QName("http://service.wikimnv.cap.fr/", "MNVException");
    private final static QName _UpdateAvatar_QNAME = new QName("http://service.wikimnv.cap.fr/", "updateAvatar");
    private final static QName _CountArticlesEcris_QNAME = new QName("http://service.wikimnv.cap.fr/", "countArticlesEcris");
    private final static QName _LireResponse_QNAME = new QName("http://service.wikimnv.cap.fr/", "lireResponse");
    private final static QName _CountArticlesEcrisResponse_QNAME = new QName("http://service.wikimnv.cap.fr/", "countArticlesEcrisResponse");
    private final static QName _Sauver_QNAME = new QName("http://service.wikimnv.cap.fr/", "sauver");
    private final static QName _RankingResponse_QNAME = new QName("http://service.wikimnv.cap.fr/", "rankingResponse");
    private final static QName _Supprimer_QNAME = new QName("http://service.wikimnv.cap.fr/", "supprimer");
    private final static QName _UpdateAvatarResponse_QNAME = new QName("http://service.wikimnv.cap.fr/", "updateAvatarResponse");
    private final static QName _ListerResponse_QNAME = new QName("http://service.wikimnv.cap.fr/", "listerResponse");
    private final static QName _Lire_QNAME = new QName("http://service.wikimnv.cap.fr/", "lire");
    private final static QName _Lister_QNAME = new QName("http://service.wikimnv.cap.fr/", "lister");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.cap.wikimnv.service
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link UpdateAvatarResponse }
     * 
     */
    public UpdateAvatarResponse createUpdateAvatarResponse() {
        return new UpdateAvatarResponse();
    }

    /**
     * Create an instance of {@link ListerResponse }
     * 
     */
    public ListerResponse createListerResponse() {
        return new ListerResponse();
    }

    /**
     * Create an instance of {@link UpdateAvatar }
     * 
     */
    public UpdateAvatar createUpdateAvatar() {
        return new UpdateAvatar();
    }

    /**
     * Create an instance of {@link MNVException }
     * 
     */
    public MNVException createMNVException() {
        return new MNVException();
    }

    /**
     * Create an instance of {@link CountArticlesEcris }
     * 
     */
    public CountArticlesEcris createCountArticlesEcris() {
        return new CountArticlesEcris();
    }

    /**
     * Create an instance of {@link LireResponse }
     * 
     */
    public LireResponse createLireResponse() {
        return new LireResponse();
    }

    /**
     * Create an instance of {@link RankingResponse }
     * 
     */
    public RankingResponse createRankingResponse() {
        return new RankingResponse();
    }

    /**
     * Create an instance of {@link Supprimer }
     * 
     */
    public Supprimer createSupprimer() {
        return new Supprimer();
    }

    /**
     * Create an instance of {@link CountArticlesEcrisResponse }
     * 
     */
    public CountArticlesEcrisResponse createCountArticlesEcrisResponse() {
        return new CountArticlesEcrisResponse();
    }

    /**
     * Create an instance of {@link Sauver }
     * 
     */
    public Sauver createSauver() {
        return new Sauver();
    }

    /**
     * Create an instance of {@link SupprimerResponse }
     * 
     */
    public SupprimerResponse createSupprimerResponse() {
        return new SupprimerResponse();
    }

    /**
     * Create an instance of {@link Ranking }
     * 
     */
    public Ranking createRanking() {
        return new Ranking();
    }

    /**
     * Create an instance of {@link SauverResponse }
     * 
     */
    public SauverResponse createSauverResponse() {
        return new SauverResponse();
    }

    /**
     * Create an instance of {@link Profil }
     * 
     */
    public Profil createProfil() {
        return new Profil();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wikimnv.cap.fr/", name = "supprimerResponse")
    public JAXBElement<SupprimerResponse> createSupprimerResponse(SupprimerResponse value) {
        return new JAXBElement<SupprimerResponse>(_SupprimerResponse_QNAME, SupprimerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SauverResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wikimnv.cap.fr/", name = "sauverResponse")
    public JAXBElement<SauverResponse> createSauverResponse(SauverResponse value) {
        return new JAXBElement<SauverResponse>(_SauverResponse_QNAME, SauverResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ranking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wikimnv.cap.fr/", name = "ranking")
    public JAXBElement<Ranking> createRanking(Ranking value) {
        return new JAXBElement<Ranking>(_Ranking_QNAME, Ranking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MNVException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wikimnv.cap.fr/", name = "MNVException")
    public JAXBElement<MNVException> createMNVException(MNVException value) {
        return new JAXBElement<MNVException>(_MNVException_QNAME, MNVException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAvatar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wikimnv.cap.fr/", name = "updateAvatar")
    public JAXBElement<UpdateAvatar> createUpdateAvatar(UpdateAvatar value) {
        return new JAXBElement<UpdateAvatar>(_UpdateAvatar_QNAME, UpdateAvatar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountArticlesEcris }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wikimnv.cap.fr/", name = "countArticlesEcris")
    public JAXBElement<CountArticlesEcris> createCountArticlesEcris(CountArticlesEcris value) {
        return new JAXBElement<CountArticlesEcris>(_CountArticlesEcris_QNAME, CountArticlesEcris.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LireResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wikimnv.cap.fr/", name = "lireResponse")
    public JAXBElement<LireResponse> createLireResponse(LireResponse value) {
        return new JAXBElement<LireResponse>(_LireResponse_QNAME, LireResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountArticlesEcrisResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wikimnv.cap.fr/", name = "countArticlesEcrisResponse")
    public JAXBElement<CountArticlesEcrisResponse> createCountArticlesEcrisResponse(CountArticlesEcrisResponse value) {
        return new JAXBElement<CountArticlesEcrisResponse>(_CountArticlesEcrisResponse_QNAME, CountArticlesEcrisResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sauver }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wikimnv.cap.fr/", name = "sauver")
    public JAXBElement<Sauver> createSauver(Sauver value) {
        return new JAXBElement<Sauver>(_Sauver_QNAME, Sauver.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RankingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wikimnv.cap.fr/", name = "rankingResponse")
    public JAXBElement<RankingResponse> createRankingResponse(RankingResponse value) {
        return new JAXBElement<RankingResponse>(_RankingResponse_QNAME, RankingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Supprimer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wikimnv.cap.fr/", name = "supprimer")
    public JAXBElement<Supprimer> createSupprimer(Supprimer value) {
        return new JAXBElement<Supprimer>(_Supprimer_QNAME, Supprimer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAvatarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wikimnv.cap.fr/", name = "updateAvatarResponse")
    public JAXBElement<UpdateAvatarResponse> createUpdateAvatarResponse(UpdateAvatarResponse value) {
        return new JAXBElement<UpdateAvatarResponse>(_UpdateAvatarResponse_QNAME, UpdateAvatarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wikimnv.cap.fr/", name = "listerResponse")
    public JAXBElement<ListerResponse> createListerResponse(ListerResponse value) {
        return new JAXBElement<ListerResponse>(_ListerResponse_QNAME, ListerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Lire }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wikimnv.cap.fr/", name = "lire")
    public JAXBElement<Lire> createLire(Lire value) {
        return new JAXBElement<Lire>(_Lire_QNAME, Lire.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Lister }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wikimnv.cap.fr/", name = "lister")
    public JAXBElement<Lister> createLister(Lister value) {
        return new JAXBElement<Lister>(_Lister_QNAME, Lister.class, null, value);
    }

}
