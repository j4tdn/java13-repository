package ex01;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		String sequence = null;
		while(true) {
			try {
				sequence = enterSequence();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		
		System.out.println("1. In ra mỗi kí tự trên một dòng:");
		showText(sequence);
		System.out.println("2. In ra mỗi từ trên mỗi dòng");
		showWord(sequence);
		System.out.println("3. In ra chuỗi đảo ngược theo kí tự");
		showTextRevert(sequence);
		System.out.println("\n4. In ra chuỗi đảo ngược theo từ");
		showWordRevert(sequence);
	}
	private static String enterSequence() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sequence: ");
		String sequence = sc.nextLine();
		for(int i = 0; i < sequence.length(); i++) {
			char c = sequence.charAt(i);
			if(Character.isDigit(c)) {
				throw new Exception("Sequence no contain digit!!!");
			}
		}
		if(sequence.matches("(.*)[!@#$%^&*()-_+=](.*)")) {
			throw new Exception("Sequence no contain special character!!!");
		}
		return sequence;
		
	}
	
	private static void showText(String sequence) {
		for(int i = 0; i < sequence.length(); i++) {
			char c = sequence.charAt(i);
			System.out.println(c);
		}
	}
	private static void showWord(String sequence) {
		String[] words = sequence.split("\\s");
		for(String word : words) {
			System.out.println(word);
		}
	}
	private static void showTextRevert(String sequence) {
		for(int i = sequence.length()-1; i >= 0; i--) {
			char c = sequence.charAt(i);
			System.out.print(c);
		}
	}
	private static void showWordRevert(String sequence) {
		String[] words = sequence.split("\\s");
		for(int i = words.length-1 ; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}
	}
	
	
}
