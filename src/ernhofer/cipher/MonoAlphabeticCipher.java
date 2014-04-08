package ernhofer.cipher;

/**
 * Eine Kasse, mit der man texte verschlüsseln lassen kann.
 * @author Andi Ernhofer
 * @version 2014-04-04
 */
public class MonoAlphabeticCipher implements Cipher {

	private String secretAlphabet; //Das geheime Alphabet, das als Verschlüsselungskey verwendet werden soll.
	
	/**
	 * Ein Konstruktor, der das Geheimalphabet auf das ganz normale Alphabet setzt.
	 * @since 2014-04-04
	 */
	public MonoAlphabeticCipher(){
		setSecretAlphabet("abcdefghijklmnopqrstuvwxyzäöüß"); //Initialisation des geheimen Alphabetes
	}
	
	/**
	 * Gibt das aktuelle Geheimalphabet zurück.
	 * @return das aktuelle Geheimalphabet
	 * @since 2014-04-04
	 */
	public String getSecretAlphabet(){
		return this.secretAlphabet; //Rückgabe des geheimen Alphabetes
	}
	
	/**
	 * Setzt das Geheimalphabet auf das im Parameter übergebene Alphabet.
	 * @param secretAlphabet Das neue Alphabet, nach dem verschlüsselt werden soll.
	 * @since 2014-04-04
	 */
	protected void setSecretAlphabet(String secretAlphabet){
		secretAlphabet = secretAlphabet.toLowerCase();
		this.secretAlphabet = secretAlphabet; //Speichert das übergebene Alphabet in die geheim Alphabet Variable
	}
	
	/**
	 * Eine Methode die einen String verschlüsselt.
	 * @paramtext Der Text der verschlüsselt werden soll.
	 * @return Der verschlüsselte String
	 */
	@Override
	public String encrypt(String text) {
		String s = "";
		String alphabet = "abcdefghijklmnopqrstuvwxyzäöüß"; //das klaare Alphabet
		text = text.toLowerCase(); //Alle Buchstaben werden zu Kleinbuchstaben
		for(int i = 0; i < text.length(); ++i){
			char zeichen = text.charAt(i); //Herauslesen eines Zeichen aus dem Text
			int index = alphabet.indexOf(""+zeichen); //Nach dem Zeichen im klaren Alphabet suchen
			s+=secretAlphabet.charAt(index); //Das Zeichen, welches an der Stelle des geheimen Alphabetes ist einsetzen
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
		String alphabet = "abcdefghijklmnopqrstuvwxyzäöüß"; //das klaare Alphabet
		text = text.toLowerCase(); //Alle Buchstaben werden zu Kleinbuchstaben
		for(int i = 0; i < text.length(); ++i){
			char zeichen = text.charAt(i); //Herauslesen eines Zeichen aus dem Text
			int index = secretAlphabet.indexOf(""+zeichen); //Nach dem Zeichen im geheimen Alphabet suchen
			s+=alphabet.charAt(index); //Das Zeichen, welches an der Stelle des klaren Alphabetes ist einsetzen
		}
		return s;
	}

}
