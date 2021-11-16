package ex01;
/*
 * Bài 1: Viết chương trình nhập vào một chuỗi kí tự bất kì sau đó thực hiện các công việc sau :
Yêu cầu: Chuỗi chỉ chứa các kí tự tiếng việt có dấu, phím space.
In ra mỗi kí tự trên một dòng
In ra mỗi từ trên mỗi dòng
In ra chuỗi đảo ngược theo kí tự
In ra chuỗi đảo ngược theo từ
 */

public class Ex01 {
	public static void main(String[] args) {
		String text = "Trà My";

		for(int i=0;i<text.length();i++) {
			System.out.println(text.charAt(i));
		}
		System.out.println("==============");
		for(int i=text.length()-1;i>=0;i--) {
			System.out.print(text.charAt(i));
		}
		System.out.println();
		System.out.println("==============");
		String[] texts = text.split("\\s");
		show(texts);
		System.out.println("==============");
		revert(texts);
		System.out.println();

	}
	
	private static void show(String[] elements) {
		for (String element : elements) {
			System.out.println(element);
		}
	}
	private static void revert(String[] elements) {
		for (String element : elements) {
			String text = "";
			for (int i = element.length() - 1; i >= 0; i--) {
				text += element.charAt(i);
			}
			System.out.print(text+" ");
		}
		
	}
}
