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
		if(!c.getSecretAlphabet().equals("abcdefghijklmnopqrstuvwxyz����")){
			throw new RuntimeException("Fehler beim Konstruktor");
		}
	}
	
	/**
	 * Eine Methode, die das verschl�sseln testet.
	 */
	@Test
	public void encrypt(){
		ernhofer.cipher.MonoAlphabeticCipher c = new ernhofer.cipher.MonoAlphabeticCipher();
		String text = c.encrypt("Hallo"); //Verschl�sselt das Wort Hallo
		if(!text.equals("hallo")){
			throw new RuntimeException("Fehler beim verschl�sseln");
		}
	}
	
	/**
	 * Eine Methode, die das entscchl�sseln testet.
	 */
	@Test
	public void decrypt(){
		ernhofer.cipher.MonoAlphabeticCipher c = new ernhofer.cipher.MonoAlphabeticCipher();
		String text = c.decrypt("Hallo"); //Entschl�sselt das Wort Hallo
		if(!text.equals("hallo")){
			throw new RuntimeException("Fehler beim verschl�sseln");
		}
	}
}
