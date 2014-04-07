package ernhofer.test;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Eine Klasse, die Texte durch monoalphabetische Substitution verschl�sselt.
 * @author Andi Ernhofer
 * @version 2014-04-04
 */
public class SubstitutionCipherTest {

	/**
	 * Testet den Konstruktor mit dem ganz normalen Alphabet
	 */
	@Test
	public void SubstitutionCipher() {
		ernhofer.cipher.SubstitutionCipher c = new ernhofer.cipher.SubstitutionCipher("abcdefghijklmnopqrstuvwxyz����");
		if(!c.getSecretAlphabet().equals("abcdefghijklmnopqrstuvwxyz����")){
			throw new RuntimeException("Fehler beim Konstruktor");
		}
	}
	
	/**
	 * Testet den Konstruktor mit einem geheimen alphabet
	 */
	@Test
	public void SubstitutionCipher1() {
		ernhofer.cipher.SubstitutionCipher c = new ernhofer.cipher.SubstitutionCipher("defghijklmnopqrstuvwxyz����abc");
		if(!c.getSecretAlphabet().equals("defghijklmnopqrstuvwxyz����abc")){
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
	 * Testet das �ndern des Geheimalphabets
	 */
	@Test
	public void setSecretAlphabet() {
		ernhofer.cipher.SubstitutionCipher c = new ernhofer.cipher.SubstitutionCipher("abcdefghijklmnopqrstuvwxyz����");
		c.setSecretAlphabet("defghijklmnopqrstuvwxyz����abc"); //�ndern des geheimalphabets
		if(!c.getSecretAlphabet().equals("defghijklmnopqrstuvwxyz����abc")){
			throw new RuntimeException("Fehler beim �ndern des Geheimalphabetes");
		}
	}
	
	/**
	 * Testet das verschl�sseln des Wortes Hallo mit ganz normalem Alphabet.
	 */
	@Test
	public void encrypt(){
		ernhofer.cipher.SubstitutionCipher c = new ernhofer.cipher.SubstitutionCipher("abcdefghijklmnopqrstuvwxyz����");
		String text = c.encrypt("Hallo"); //Verschl�sseln des Textes
		if(!text.equals("hallo")){
			throw new RuntimeException("Fehler beim verschl�sseln");
		}
	}
	
	/**
	 * Testet das verschl�sseln des Wortes Hallo mit einem Geheimalphabet
	 */
	@Test
	public void encrypt1(){
		ernhofer.cipher.SubstitutionCipher c = new ernhofer.cipher.SubstitutionCipher("defghijklmnopqrstuvwxyz����abc");
		String text = c.encrypt("Hallo"); //Verschl�sseln des Textes
		if(!text.equals("kdoor")){
			throw new RuntimeException("Fehler beim verschl�sseln");
		}
	}
	
	/**
	 * Testet das entschl�sseln des Wortes Hallo mit ganz normalem Alphabet.
	 */
	@Test
	public void decrypt(){
		ernhofer.cipher.SubstitutionCipher c = new ernhofer.cipher.SubstitutionCipher("abcdefghijklmnopqrstuvwxyz����");
		String text = c.decrypt("Hallo"); //Entschl�sseln des Textes
		if(!text.equals("hallo")){
			throw new RuntimeException("Fehler beim verschl�sseln");
		}
	}
	
	/**
	 * Testet das entschl�sseln des Wortes Hallo mit einem Geheimalphabet
	 */
	@Test
	public void decrypt1(){
		ernhofer.cipher.SubstitutionCipher c = new ernhofer.cipher.SubstitutionCipher("defghijklmnopqrstuvwxyz����abc");
		String text = c.decrypt("Kdoor"); //Entschl�sseln des Textes
		if(!text.equals("hallo")){
			throw new RuntimeException("Fehler beim verschl�sseln");
		}
	}

}
