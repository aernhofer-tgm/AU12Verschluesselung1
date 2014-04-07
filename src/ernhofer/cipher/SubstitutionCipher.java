package ernhofer.cipher;

/**
 * @author Andi Ernhofer
 * @version 2014-04-04
 */
public class SubstitutionCipher extends MonoAlphabeticCipher {

	/**
	 * Ein Konstruktor, der ein geheimalphabet übernimmt und als Key verwendet.
	 * @param secretAlphabet Das Geheimalphabet
	 */
	public SubstitutionCipher(String secretAlphabet) {
		super(); //Ruft den Superkonstruktor auf
		setSecretAlphabet(secretAlphabet); //Speichert das geheimalphabet
	}
	
	/**
	 * Eine Methode die ein neues Geheimalphabet speichert.
	 * @param secretAlphabet Das neue Geheimalphabet
	 */
	@Override
	public void setSecretAlphabet(String secretAlphabet){
		if(secretAlphabet.length()!=30){ //Kontroliert ob das Alphabet 30 Zeichen hat
			throw new IllegalArgumentException("Das angegebene Geheimalphabet ist entweder zu kurz oder zu lang!\nEs muss 30 Zeichen lang sein!");//Wirft eine Exception
		}
		super.setSecretAlphabet(secretAlphabet); //speichert das neue geheim Alphabet
	}

}
