package fr.cap.wikimnv.consultation.service.impl;

import fr.cap.wikimnv.consultation.service.IServiceConsultation;
import fr.cap.wikimnv.consultation.service.IServiceCommentaire;
import fr.cap.wikimnv.contribution.service.IGArticle;
import fr.cap.wikimnv.contribution.service.IGTag;
import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.global.service.IServiceAuth;

public class ServiceConsultationImpl implements IServiceConsultation {
public IServiceCommentaire serviceCommentaire ;


	public IServiceCommentaire getServiceCommentaire() {
		return serviceCommentaire;
	}

	public void setServiceCommentaire(IServiceCommentaire serviceCommentaire) {
		this.serviceCommentaire = serviceCommentaire;
	}

	@Override
	public IGArticle getServiceArticle() throws MNVException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IGTag getServiceTag() throws MNVException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

	
	

}
