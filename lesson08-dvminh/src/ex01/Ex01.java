package ex01;

public class Ex01 {
	public static void main(String[] args) {
		String string = "Chào các bạn";
		aChar(string);
		System.out.println("========");
		aWord(string);
		System.out.println("========");
		reverseByChar(string);
		System.out.println("========");
		reverseByWord(string);
	}
	
	private static void aChar(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}
	
	private static void aWord(String s) {
		String[] word = s.split("\\s");
		for (String w : word) {
			System.out.println(w);
		}
	}
	
	private static void reverseByChar(String s) {
		StringBuilder stringBuilder = new StringBuilder(s);
		System.out.println(stringBuilder.reverse());
	}
	
	private static void reverseByWord(String s) {
		String s1 = s.trim().replaceAll("[\\s]+", " ");
		
		String[] words = s1.split("\\s");
		StringBuilder str;
		for (String w : words) {
			str = new StringBuilder(w);
			System.out.print(str.reverse() + " ");
		}
	}
}
