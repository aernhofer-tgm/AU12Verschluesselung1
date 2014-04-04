package ernhofer.cipher;

/**
 * Eine Kasse, mit der man texte verschl�sseln lassen kann.
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
		setSecretAlphabet("abcdefghijklmnopqrstuvwxyz����");
	}
	
	/**
	 * Gibt das aktuelle Geheimalphabet zur�ck.
	 * @return das aktuelle Geheimalphabet
	 * @since 2014-04-04
	 */
	public String getSecretAlphabet(){
		return this.secretAlphabet;
	}
	
	/**
	 * Setzt das Geheimalphabet auf das im Parameter �bergebene Alphabet.
	 * @param secretAlphabet Das neue Alphabet, nach dem verschl�sselt werden soll.
	 * @since 2014-04-04
	 */
	protected void setSecretAlphabet(String secretAlphabet){
		this.secretAlphabet = secretAlphabet;
	}
	
	/**
	 * Eine Methode die einen String verschl�sselt.
	 * @paramtext Der Text der verschl�sselt werden soll.
	 * @return Der verschl�sselte String
	 */
	@Override
	public String encrypt(String text) {
		String s = "";
		String alphabet = "abcdefghijklmnopqrstuvwxyz����";
		text = text.toLowerCase();
		for(int i = 0; i < text.length(); ++i){
			char zeichen = text.charAt(i);
			int index = alphabet.indexOf(""+zeichen);
			s+=secretAlphabet.charAt(index);
		}
		return s;
	}

	/**
	 * Eine Methode, die einen String entschl�sselt.
	 * @param text Der Text der entschl�sselt werden soll.
	 * @return Der entschl�sselte String
	 */
	@Override
	public String decrypt(String text) {
		String s = "";
		String alphabet = "abcdefghijklmnopqrstuvwxyz����";
		text = text.toLowerCase();
		for(int i = 0; i < text.length(); ++i){
			char zeichen = text.charAt(i);
			int index = secretAlphabet.indexOf(""+zeichen);
			s+=alphabet.charAt(index);
		}
		return s;
	}

}
