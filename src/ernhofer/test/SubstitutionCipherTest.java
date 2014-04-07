package ernhofer.test;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Eine Klasse, die Texte durch monoalphabetische Substitution verschlüsselt.
 * @author Andi Ernhofer
 * @version 2014-04-04
 */
public class SubstitutionCipherTest {

	/**
	 * Testet den Konstruktor mit dem ganz normalen Alphabet
	 */
	@Test
	public void SubstitutionCipher() {
		ernhofer.cipher.SubstitutionCipher c = new ernhofer.cipher.SubstitutionCipher("abcdefghijklmnopqrstuvwxyzäöüß");
		if(!c.getSecretAlphabet().equals("abcdefghijklmnopqrstuvwxyzäöüß")){
			throw new RuntimeException("Fehler beim Konstruktor");
		}
	}
	
	/**
	 * Testet den Konstruktor mit einem geheimen alphabet
	 */
	@Test
	public void SubstitutionCipher1() {
		ernhofer.cipher.SubstitutionCipher c = new ernhofer.cipher.SubstitutionCipher("defghijklmnopqrstuvwxyzäöüßabc");
		if(!c.getSecretAlphabet().equals("defghijklmnopqrstuvwxyzäöüßabc")){
			throw new RuntimeException("Fehler beim Konstruktor");
		}
	}
	
	/**
	 * Testet den Konstruktor mit einem Alphabet, welches zu kurz ist
	 */
	@Test
	public void SubstitutionCipher2() {
		try{
		ernhofer.cipher.SubstitutionCipher c = new ernhofer.cipher.SubstitutionCipher("abc");
		throw new RuntimeException("Fehler beim Konstruktor");//Werfen einer Exception wenn das Programm bis dahin kommt.
		}catch (IllegalArgumentException e){
			//Der Konstruktor wirft eine Exception, der String im Konstruktor zu klein ist. ( < 30)
		}
	}
	
	/**
	 * Testet das ändern des Geheimalphabets
	 */
	@Test
	public void setSecretAlphabet() {
		ernhofer.cipher.SubstitutionCipher c = new ernhofer.cipher.SubstitutionCipher("abcdefghijklmnopqrstuvwxyzäöüß");
		c.setSecretAlphabet("defghijklmnopqrstuvwxyzäöüßabc"); //Ändern des geheimalphabets
		if(!c.getSecretAlphabet().equals("defghijklmnopqrstuvwxyzäöüßabc")){
			throw new RuntimeException("Fehler beim ändern des Geheimalphabetes");
		}
	}
	
	/**
	 * Testet das verschlüsseln des Wortes Hallo mit ganz normalem Alphabet.
	 */
	@Test
	public void encrypt(){
		ernhofer.cipher.SubstitutionCipher c = new ernhofer.cipher.SubstitutionCipher("abcdefghijklmnopqrstuvwxyzäöüß");
		String text = c.encrypt("Hallo"); //Verschlüsseln des Textes
		if(!text.equals("hallo")){
			throw new RuntimeException("Fehler beim verschlüsseln");
		}
	}
	
	/**
	 * Testet das verschlüsseln des Wortes Hallo mit einem Geheimalphabet
	 */
	@Test
	public void encrypt1(){
		ernhofer.cipher.SubstitutionCipher c = new ernhofer.cipher.SubstitutionCipher("defghijklmnopqrstuvwxyzäöüßabc");
		String text = c.encrypt("Hallo"); //Verschlüsseln des Textes
		if(!text.equals("kdoor")){
			throw new RuntimeException("Fehler beim verschlüsseln");
		}
	}
	
	/**
	 * Testet das entschlüsseln des Wortes Hallo mit ganz normalem Alphabet.
	 */
	@Test
	public void decrypt(){
		ernhofer.cipher.SubstitutionCipher c = new ernhofer.cipher.SubstitutionCipher("abcdefghijklmnopqrstuvwxyzäöüß");
		String text = c.decrypt("Hallo"); //Entschlüsseln des Textes
		if(!text.equals("hallo")){
			throw new RuntimeException("Fehler beim verschlüsseln");
		}
	}
	
	/**
	 * Testet das entschlüsseln des Wortes Hallo mit einem Geheimalphabet
	 */
	@Test
	public void decrypt1(){
		ernhofer.cipher.SubstitutionCipher c = new ernhofer.cipher.SubstitutionCipher("defghijklmnopqrstuvwxyzäöüßabc");
		String text = c.decrypt("Kdoor"); //Entschlüsseln des Textes
		if(!text.equals("hallo")){
			throw new RuntimeException("Fehler beim verschlüsseln");
		}
	}

}
