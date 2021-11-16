package ex01;

public class StringUtils {
	
	private StringUtils() {
		
	}
	
	public static boolean isValidString(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isLetter(s.charAt(i)) && (s.charAt(i) != ' ')) {
				return false;
			}
		}
		return true;
	}
	
	public static String revert(String s) {
		String rv = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rv += s.charAt(i);
		}
		return rv;
	}
	
	public static String[] getWords(String s) {
		return s.split("[\\s]+");
	}
}
