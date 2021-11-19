package ex01;

/**
 * Viết chương trình nhập vào một chuỗi kí tự bất kì sau đó thực hiện các công việc sau :
 * Yêu cầu: Chuỗi chỉ chứa các kí tự tiếng việt có dấu, phím space.
 * In ra mỗi kí tự trên một dòng
 * In ra mỗi từ trên mỗi dòng
 * In ra chuỗi đảo ngược theo kí tự
 * In ra chuỗi đảo ngược theo từ
 */

public class Main {
	public static void main(String[] args) {
		String str = "Trần Thị Thùy Vân";
		printEachCharacter(str);
		printEachWord(str);
		reverseByCharacter(str);
		reverseByWord(str);
	}

	public static void printEachCharacter(String str) {
		System.out.println("Print each character on one line: ");
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

	public static void printEachWord(String str) {
		String[] words = str.split("\\s+");
		System.out.println("================================");
		System.out.println("Print each word on one line: ");
		for (String i : words) {
			System.out.println(i);
		}
	}

	public static void reverseByCharacter(String str) {
		System.out.println("================================");
		System.out.println("Print reversed string by character: ");
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i));
		}
	}

	public static void reverseByWord(String str) {
		String[] words = str.split("\\s+");
		System.out.println("================================");
		System.out.println("Print reversed string by word: ");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.println(words[i]);
		}
	}
}
