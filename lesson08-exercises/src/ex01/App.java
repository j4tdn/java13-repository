package ex01;

public class App {
	private static String texts = "Lớp Lập Trình Thầy Quyền";
	
	public static void main(String[] args) {
		System.out.println("Original string:                      |||" + 
							texts + "|||");
		
		System.out.println("-------------------------------------------------");
		
		// Print 1 character per line
		String textsWithoutSpace = texts.replaceAll("[\\s]+", "");
		char[] textsWithoutSpaceToCharArray = textsWithoutSpace.toCharArray();
		for(int i = 0; i < textsWithoutSpaceToCharArray.length; i++) {
			System.out.println(textsWithoutSpaceToCharArray[i]);
		}
		
		System.out.println("-------------------------------------------------");
		
		// Print 1 word per line
		String[] splitInputStringByWords = texts.split("[\\s]+");
		for(int i = 0; i < splitInputStringByWords.length; i++) {
			System.out.println(splitInputStringByWords[i]);
		}
		
		System.out.println("-------------------------------------------------");
		
		// Print string with reverse characters
		System.out.println("Print string with reverse characters: |||" + 
		reverseStringByLetters(texts) + "|||");
		
		System.out.println("-------------------------------------------------");
		
		// Print string with reverse words
		System.out.println("Print string with reverse words:      |||" + 
		reverseStringByWords(texts) + "|||");
	}
	
	private static String reverseStringByLetters(String inputString) {
		char[] inputStringToCharArray = inputString.toCharArray();
		String outputString = "";
		for(int i = inputString.length()-1; i >= 0; i--) {
			outputString += inputStringToCharArray[i];
		}
		return outputString;
	}
	
	private static String reverseStringByWords(String inputString) {
		String outputString = "";
		
		String[] splitInputStringByWords = inputString.split("[\\s]+");
		for(int i = 0; i < splitInputStringByWords.length; i++) {
			outputString += (" " + reverseStringByLetters(splitInputStringByWords[i]));
		}
		return outputString.trim();
	}
}
