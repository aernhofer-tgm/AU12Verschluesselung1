package ernhofer.cipher;

/**
 * Eine Kasse, mit der man texte verschlüsseln lassen kann.
 * @author Andi Ernhofer
 * @version 2014-04-04
 */
public class MonoAlphabeticCipher implements Cipher {

	private String secretAlphabet;
	
	/**
	 * Ein Konstruktor, der das Geheimalphabet auf das ganz normale Alphabet setzt.
	 * @since 2014-04-04
	 */
	public MonoAlphabeticCipher(){
		setSecretAlphabet("abcdefghijklmnopqrstuvwxyzäöüß");
	}
	
	/**
	 * Gibt das aktuelle Geheimalphabet zurück.
	 * @return das aktuelle Geheimalphabet
	 * @since 2014-04-04
	 */
	public String getSecretAlphabet(){
		return this.secretAlphabet;
	}
	
	/**
	 * Setzt das Geheimalphabet auf das im Parameter übergebene Alphabet.
	 * @param secretAlphabet Das neue Alphabet, nach dem verschlüsselt werden soll.
	 * @since 2014-04-04
	 */
	protected void setSecretAlphabet(String secretAlphabet){
		this.secretAlphabet = secretAlphabet;
	}
	
	/**
	 * Eine Methode die einen String verschlüsselt.
	 * @paramtext Der Text der verschlüsselt werden soll.
	 * @return Der verschlüsselte String
	 */
	@Override
	public String encrypt(String text) {
		String s = "";
		String alphabet = "abcdefghijklmnopqrstuvwxyzäöüß";
		text = text.toLowerCase();
		for(int i = 0; i < text.length(); ++i){
			char zeichen = text.charAt(i);
			int index = alphabet.indexOf(""+zeichen);
			s+=secretAlphabet.charAt(index);
		}
		return s;
	}

	/**
	 * Eine Methode, die einen String entschlüsselt.
	 * @param text Der Text der entschlüsselt werden soll.
	 * @return Der entschlüsselte String
	 */
	@Override
	public String decrypt(String text) {
		String s = "";
		String alphabet = "abcdefghijklmnopqrstuvwxyzäöüß";
		text = text.toLowerCase();
		for(int i = 0; i < text.length(); ++i){
			char zeichen = text.charAt(i);
			int index = secretAlphabet.indexOf(""+zeichen);
			s+=alphabet.charAt(index);
		}
		return s;
	}

}
