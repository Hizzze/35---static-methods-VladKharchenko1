package domain;

/**
 * Клас шифрує і розшифровує строку шифром Цезаря.
 * 
 * @author Vlad
 */
public class Exercise {
	
	/**
	 * Шифрує строку шифром Цезаря з заданою величиною зсуву
	 * 
	 * @param str строка для шифрування
	 * @param shiftKey величина зсуву
	 * 
	 * @return Строка ширфом цезаря
	 */
	public static String crypt(String str, int shiftKey) {
		char[] chars = str.toCharArray();	
		for (int i = 0; i < chars.length; i++) {
			chars[i] += shiftKey;
		}	
		return new String(chars);
	}
	
	/**
	 * Розшифровує строку шифром Цезаря з заданою величиною зсуву
	 * 
	 * @param str строка для розшифрування
	 * @param shiftKey величина зсуву
	 * 
	 * @return Розшифрована строка
	 */
	public static String decrypt(String str, int shiftKey) {
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			chars[i] -= shiftKey;
		}
		return new String(chars);
	}
}
