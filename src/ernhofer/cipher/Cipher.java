package ernhofer.cipher;

/**
 * @author Andi Ernhofer
 * @version 2014-04-04
 */
public interface Cipher {
	public String encrypt(String text);
	public String decrypt(String text);
}
