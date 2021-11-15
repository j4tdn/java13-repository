package baitap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * Bài 1: Viết chương trình nhập vào một chuỗi kí tự bất kì sau đó thực hiện các công việc sau :
 * Yêu cầu: Chuỗi chỉ chứa các kí tự tiếng việt có dấu, phím space.
 * In ra mỗi kí tự trên một dòng
 * In ra mỗi từ trên mỗi dòng
 * In ra chuỗi đảo ngược theo kí tự
 * In ra chuỗi đảo ngược theo từ
 *
 */

public class Ex01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s;
		while(true) {
			System.out.println("Nhập chuỗi");
			s = input.nextLine();
			try {
				if(validString(s)) {
					System.out.println("In ra mỗi kí tự trên một dòng");
					printCharacter(s);
					System.out.println("In ra mỗi từ trên mỗi dòng");
					printWord(s);
					System.out.println("In ra chuỗi đảo ngược theo kí tự");
					reverseString(s);
					System.out.println("In ra chuỗi đảo ngược theo từ");
					reverseWord(s);
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	
	private static boolean validString(String s) throws Exception {
		if(!Pattern.matches("[\\p{L}\\s]+",s)) {
			throw new Exception("Chuỗi chỉ chứa các kí tự tiếng việt có dấu, phím space.");
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

