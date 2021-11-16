package ex01;

import java.util.Scanner;

import ex02.InvalidFormatNameException;

/*
 	Bài 1: Viết chương trình nhập vào một chuỗi kí tự bất kì sau đó thực hiện các công việc sau :
			Yêu cầu: Chuỗi chỉ chứa các kí tự tiếng việt có dấu, phím space.
			In ra mỗi kí tự trên một dòng
			In ra mỗi từ trên mỗi dòng
			In ra chuỗi đảo ngược theo kí tự
			In ra chuỗi đảo ngược theo từ
 */

public class App {
	
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		String ipStr = "";
		
		while(true) {
			try {
				System.out.print("Input string: ");
				ipStr = inputString();
				break;
			}
			catch(InvalidFormatStringException e) {
				//e.printStackTrace();	
				System.out.println(e.getMessage());
			}
		}
		
		// In ra mỗi kí tự trên một dòng
		System.out.println("List character into string: ");
		showCharacter(ipStr);
		
		System.out.println("=======================");
		
		// In ra mỗi từ trên mỗi dòng
		System.out.println("List words into string");
		showWords(ipStr);
		
		System.out.println("=======================");
		
		// In ra chuỗi đảo ngược theo kí tự
		System.out.println("Revert string by character: ");
		System.out.println(getRevertStringByCharacter(ipStr));
		
		System.out.println("=======================");
		
		// In ra chuỗi đảo ngược theo từ
		System.out.println("Revert string by word: ");
		System.out.println(getRevertStringByWord(ipStr));
		
	}
	
	private static String inputString() {
		String ipStr = ip.nextLine();
		if (!StringUtils.isValidString(ipStr)) 
				throw new InvalidFormatNameException(
						"Input's String must not have characters "
						+ "differ vietnamese character and space");
		return ipStr;
	}
		
	private static void showCharacter(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}
	
	private static void showWords(String s) {
		String[] words = StringUtils.getWords(s);
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}
	
	private static String getRevertStringByCharacter(String s) {
		return StringUtils.revert(s);	
	}
	
	private static String getRevertStringByWord(String s) {
		String[] words = StringUtils.getWords(s);
		
		// rSBW : revert string by word
		String rSBW = "";
		for (int i = 0; i < words.length; i++) {
			rSBW += StringUtils.revert(words[i]) + " ";
		}
		
		return rSBW;
	}
	
}
