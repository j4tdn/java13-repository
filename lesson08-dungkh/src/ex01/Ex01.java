package ex01;

public class Ex01 {
	public static void main(String[] args) {
		String str = "Hello world";
		
		System.out.println("each characters in a line:");
		splitChars(str);
		
		System.out.println("each word in a line: ");
		splitWords(str);
		
		System.out.println(" reverse characters: ");
		reverseChars(str);
		
		System.out.println();
		System.out.println("reverse word:");
		reverseWords(str);
		
		
	}
	
	private static String splitChars(String line) {
		String string = line;
		
		for (int i = 0; i < string.length(); i++) {
			System.out.println(string.charAt(i));
		}
		
		return string;
	}
	
	private static String splitWords(String line) {
		String string = line;
		String [] Str = string.split(" ");
		
		for (int i = 0; i < Str.length; i++) {
			System.out.println(Str[i]);
		}
		
		return string;
	}
	
	private static String reverseWords(String line) {
		String string = line;
		String [] Str = string.split(" ");
		
		for (int i = Str.length - 1; i >= 0 ; i--) {
			System.out.print(Str[i] + " ");
			
		}
		
		return string;
	}
	
	private static String reverseChars(String line) {
		String string = line;
		
		for (int i = string.length()-1; i >= 0; i--) {
			System.out.print(string.charAt(i));
		}
		
		return string;
	}

}
