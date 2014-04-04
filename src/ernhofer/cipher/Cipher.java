package ernhofer.cipher;

/**
 * @author Andi Ernhofer
 * @version 2014-04-04
 */
public interface Cipher {
	
	/**
	 * Eine Methode die einen String verschlüsselt.
	 * @paramtext Der Text der verschlüsselt werden soll.
	 * @return Der verschlüsselte String
	 */
	public String encrypt(String text);
	
	/**
	 * Eine Methode, die einen String entschlüsselt.
	 * @param text Der Text der entschlüsselt werden soll.
	 * @return Der entschlüsselte String
	 */
	public String decrypt(String text);
}
