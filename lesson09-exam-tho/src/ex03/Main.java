package ex03;

public class Main {
	public static void main(String[] args) {
		String originalString = "Welcome  to JAVA10  class";
		
		// Original string
		System.out.println("Original String: |||" + originalString + "|||");
		
		// Remove redundant space from originalString
		System.out.println("Step 1: Remove redundant space: |||" + removeRedundantSpace(originalString) + "|||");
		
		// Revert string
		System.out.println("Step 2: Revert String: |||" + revertString(originalString) + "|||");
	}
	
	public static String removeRedundantSpace (String string) {
		return string.trim().replaceAll("[\\s]+", " ");
	}
	
	public static String revertWord (String string) {
		char ch;
		String newString = "";
		for (int i = 0; i < string.length(); i++) {
			ch = string.charAt(i);
			newString = ch + newString;
		}
		
		return newString;
	}
	
	public static String revertString (String string) {
		String newString = "";
		String[] separateWord = string.split("[\\s]+");
		
		for (int i = 0; i < separateWord.length; i++) {
			newString = (newString + " " + revertWord(separateWord[i])).trim();
		}
		
		return newString;
	}
}
