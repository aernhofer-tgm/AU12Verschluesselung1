package ernhofer.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ernhofer.cipher.MonoAlphabeticCipher;

/**
 * Eine Klasse zum Testen der Methoden aus MonoAlphabeticCipher.
 * @author Andi Ernhofer
 * @version 2014-04-04
 */
public class MonoAlphabeticCipherTest {

	/**
	 * Eine Methode, die den Konstruktor der Klasse Testet.
	 */
	@Test
	public void MonoAlphabeticCipher(){
		ernhofer.cipher.MonoAlphabeticCipher c = new ernhofer.cipher.MonoAlphabeticCipher();
		if(!c.getSecretAlphabet().equals("abcdefghijklmnopqrstuvwxyzäöüß")){
			throw new RuntimeException("Fehler beim Konstruktor");
		}
	}
	
	/**
	 * Eine Methode, die das verschlüsseln testet.
	 */
	@Test
	public void encrypt(){
		ernhofer.cipher.MonoAlphabeticCipher c = new ernhofer.cipher.MonoAlphabeticCipher();
		String text = c.encrypt("Hallo"); //Verschlüsselt das Wort Hallo
		if(!text.equals("hallo")){
			throw new RuntimeException("Fehler beim verschlüsseln");
		}
	}
	
	/**
	 * Eine Methode, die das entscchlüsseln testet.
	 */
	@Test
	public void decrypt(){
		ernhofer.cipher.MonoAlphabeticCipher c = new ernhofer.cipher.MonoAlphabeticCipher();
		String text = c.decrypt("Hallo"); //Entschlüsselt das Wort Hallo
		if(!text.equals("hallo")){
			throw new RuntimeException("Fehler beim verschlüsseln");
		}
	}
}
