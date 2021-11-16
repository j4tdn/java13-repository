package ex01;
import java.util.Scanner;
public class Main {
/*/**
 * 
 * Bài 1: Viết chương trình nhập vào một chuỗi kí tự bất kì sau đó thực hiện các công việc sau :
 * Yêu cầu: Chuỗi chỉ chứa các kí tự tiếng việt có dấu, phím space.
 * In ra mỗi kí tự trên một dòng
 * In ra mỗi từ trên mỗi dòng
 * In ra chuỗi đảo ngược theo kí tự
 * In ra chuỗi đảo ngược theo từ
 *
 */


	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Nhập chuỗi kí tự:  ");
		String str = scanner.nextLine();
		System.out.print(str);
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				System.out.println(str.charAt(i));
			}
		}
		System.out.println("==============");
		
		
		String[] words = str.split("\\s+");
		for (String word : words) {
			System.out.println(word);
		}

		System.out.println("==============");
		
		
		StringBuilder builder = new StringBuilder(str);
		System.out.println(builder.reverse());
		System.out.println("================");
		
		
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
