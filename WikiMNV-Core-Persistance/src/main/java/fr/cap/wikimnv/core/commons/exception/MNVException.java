package fr.cap.wikimnv.core.commons.exception;

@SuppressWarnings("serial")
public class MNVException extends Exception {
		
	
	int codeErreur;
	
	
	public MNVException() {
		super();
	}
	public MNVException(int codeErreur, String message) {
		super(message);
		this.codeErreur = codeErreur;
	}

	
	public int getCodeErreur() {
		return codeErreur;
	}

	
}
