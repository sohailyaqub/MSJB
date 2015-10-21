package fr.cap.wikimnv.consultation.service;

import java.util.List;

import fr.cap.wikimnv.contribution.service.IGArticle;
import fr.cap.wikimnv.contribution.service.IGTag;
import fr.cap.wikimnv.exception.*;

import java.util.Set;

public interface IServiceConsultation {
	public IGArticle getServiceArticle() throws MNVException ;
	public IGTag getServiceTag() throws MNVException ;
	public IServiceCommentaire getServiceCommentaire() throws MNVException ;
}
