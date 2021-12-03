package ex01;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input string:");
		String str = sc.nextLine().trim();
			try {
				if(validString(str)) {
					System.out.println("Every characters:");
					printCharacter(str);
					System.out.println("Every word:");
					printWord(str);
					System.out.println("String in reverse:");
					reverseString(str);
					System.out.println("String in reverse by word:");
					reverseWord(str);
					
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		
		
	}
	
	private static boolean validString(String s) throws Exception {
		if(!Pattern.matches("[\\p{L}\\s]+",s)) {
			throw new Exception("Chuỗi chỉ chứa các kí tự tiếng việt có dấu, phím cach.");
		}
		return true;
	}
	
	private static void printCharacter(String s) {
		for(int i = 0; i< s.length() ; i++ ) {
			System.out.println(s.charAt(i));
		}
	}
	
	private static void printWord(String s) {
		String [] words = s.split("[\\s]+");
		for(String word:words) {
			System.out.println(word);
		}
	}
	
	private static void reverseString(String s) {
		StringBuffer input = new StringBuffer(s);
		input.reverse();
		System.out.println(input.toString());
	}
	
	private static void reverseWord(String s) {
		String [] words = s.split("[\\s]+");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}
	}
}
