package ernhofer.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ernhofer.cipher.MonoAlphabeticCipher;

public class MonoAlphabeticCipherTest {

	@Test
	public void MonoAlphabeticCipher(){
		ernhofer.cipher.MonoAlphabeticCipher c = new ernhofer.cipher.MonoAlphabeticCipher();
		if(!c.getSecretAlphabet().equals("abcdefghijklmnopqrstuvwxyzäöüß")){
			throw new RuntimeException("Fehler beim Konstruktor");
		}
	}
	
	@Test
	public void encrypt(){
		ernhofer.cipher.MonoAlphabeticCipher c = new ernhofer.cipher.MonoAlphabeticCipher();
		String text = c.encrypt("Hallo");
		if(!text.equals("hallo")){
			throw new RuntimeException("Fehler beim verschlüsseln");
		}
	}
	
	@Test
	public void decrypt(){
		ernhofer.cipher.MonoAlphabeticCipher c = new ernhofer.cipher.MonoAlphabeticCipher();
		String text = c.decrypt("Hallo");
		if(!text.equals("hallo")){
			throw new RuntimeException("Fehler beim verschlüsseln");
		}
	}
}
