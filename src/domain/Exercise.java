package domain;

/**
 * Зашифрувати задану фразу шифром Цезаря з заданою величиною зсуву N
 * 
 * @author Vlad
 */
public class Exercise {
	
	/**
	 * Зашифрувати задану фразу шифром Цезаря з заданою величиною зсуву N
	 * 
	 * @param str рядок для шифрування
	 * @param shiftKey величина зсуву
	 * 
	 * @return Рядок ширфом цезаря
	 */
	public static String crypt(String str, int shiftKey) {
		char[] chars = str.toCharArray();	
		for (int i = 0; i < chars.length; i++) {
			chars[i] += shiftKey;
		}	
		return new String(chars);
	}
	
	/**
	 * Зашифрувати задану фразу шифром Цезаря з заданою величиною зсуву N
	 * 
	 * @param str рядок для розшифрування
	 * @param shiftKey величина зсуву
	 * 
	 * @return Розшифрований рядок
	 */
	public static String decrypt(String str, int shiftKey) {
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			chars[i] -= shiftKey;
		}
		return new String(chars);
	}
}
