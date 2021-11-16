package ex02;

import java.util.Objects;

public class NameUtils {
	
	private NameUtils() {
		
	}
	
	public static boolean isValidName(String name) {
		Objects.requireNonNull(name, "Name cannot be null");
		for (int i = 0; i < name.length(); i++) {
			if (!Character.isLetter(name.charAt(i)) && (name.charAt(i) != ' ')) {
				return false;
			}
		}
		return true;
	}
	
	private static String[] getWords(String s) {
		return s.split("[\\s]+");
	}
	
	private static String capitalize(String s) {
		return Character.toUpperCase(s.charAt(0)) + s.substring(1);
	}
	
	public static String formatName(String name) {
		Objects.requireNonNull(name, "Name cannot be null!");
		
		String nameFormat = "";
		String words[] = getWords(name.toLowerCase());
		for (int i = 0 ; i < words.length; i++) {
			nameFormat += capitalize(words[i]) + " ";
		}
		return nameFormat;
	}
} 
