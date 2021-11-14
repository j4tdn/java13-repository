package ex01;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		while (true) {
			System.out.print("Nhập vào chuỗi: ");
			str = sc.nextLine();
			try {
				if (isValid(str)) {
					break;
				}
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}

		}
		System.out.println("Chuỗi vừa nhập: " + str);
		printEachCharacter(str);
		printEachWord(str);
		printEachCharacterInReversed(str);
		printEachWordInReversed(str);
		sc.close();
	}

	private static boolean isValid(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isLetter(str.charAt(i)) && !(str.charAt(i) == ' ')) {
				return false;
			}
		}
		return true;
	}

	private static void printEachCharacter(String str) {
		System.out.println("=============================");
		System.out.println("In ra mỗi kí tự trên một dòng: ");
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

	private static void printEachWord(String str) {
		String[] words = str.split("\\s+");
		System.out.println("=============================");
		System.out.println("In ra mỗi từ trên mỗi dòng: ");
		for (String i : words) {
			System.out.println(i);
		}
	}

	private static void printEachWordInReversed(String str) {
		String[] words = str.split("\\s+");
		System.out.println("=============================");
		System.out.println("In ra chuỗi đảo ngược theo từ: ");
		for (int i = words.length-1; i >= 0; i--) {
			System.out.println(words[i]);
		}
	}

	private static void printEachCharacterInReversed(String str) {
		System.out.println("=============================");
		System.out.println("In ra chuỗi đảo ngược theo kí tự: ");
		for (int i = str.length()-1; i >= 0; i--) {
			System.out.println(str.charAt(i));
		}
	}
}
