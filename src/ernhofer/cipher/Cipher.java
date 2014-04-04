package ernhofer.cipher;

/**
 * @author Andi Ernhofer
 * @version 2014-04-04
 */
public interface Cipher {
	
	/**
	 * Eine Methode die einen String verschl�sselt.
	 * @paramtext Der Text der verschl�sselt werden soll.
	 * @return Der verschl�sselte String
	 */
	public String encrypt(String text);
	
	/**
	 * Eine Methode, die einen String entschl�sselt.
	 * @param text Der Text der entschl�sselt werden soll.
	 * @return Der entschl�sselte String
	 */
	public String decrypt(String text);
}
