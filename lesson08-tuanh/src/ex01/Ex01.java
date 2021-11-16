package ex01;
/**
 * Bài 1: Viết chương trình nhập vào một chuỗi kí tự bất kì sau đó thực hiện các công việc sau :
Yêu cầu: Chuỗi chỉ chứa các kí tự tiếng việt có dấu, phím space.
* In ra mỗi kí tự trên một dòng
* In ra mỗi từ trên mỗi dòng
* In ra chuỗi đảo ngược theo kí tự
* In ra chuỗi đảo ngược theo từ
 */
import java.util.Scanner;

public class Ex01 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter a sequence: ");
		String str = scanner.nextLine();
		System.out.print(str);
		
		/**
		 * print each character in a line
		 */
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				System.out.println(str.charAt(i));
			}
		}
		System.out.println("==============");
		
		/**
		 * print each word in a line
		 */
		
		String[] words = str.split("\\s+");
		for (String word : words) {
			System.out.println(word);
		}

		System.out.println("==============");
		
		/**
		 * print the reverse string by character
		 */
		
		StringBuilder builder = new StringBuilder(str);
		System.out.println(builder.reverse());
		System.out.println("================");
		
		/**
		 * print the reverse string by word
		 */
		
		String[] a = str.split("[\\s]+");
		for (int i = 0; i < a.length; i++) {
			a[i] = new StringBuilder().append(a[i]).reverse().toString();
		}
		String result = "";
		for(String i : a) {
			result = result.concat(i).concat(" ");
		}
		System.out.println(result.trim());
	}
}
