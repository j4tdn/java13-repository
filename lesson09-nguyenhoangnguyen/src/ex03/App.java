package ex03;

import java.util.Arrays;

/**
 * 
 * Viết chương trình loại bỏ khoảng trắng thừa và đảo chuỗi theo từng từ
 *
 */
public class App {

	private static final String ONE_OR_MORE_SPACES_PATTERN = "\\s+";

	public static void main(String[] args) {
		String input = "Welcome   to JAVA10   class";
		System.out.println(revert(input));
	}

	private static String revert(String string) {
		String[] words = string.split("[\\s]+");
		StringBuilder stb = new StringBuilder();
		for(String word : words) {
			stb.append(reverseWord(word)).append(" ");
		}
		return stb.toString();
	}
	
	private static String reverseWord(String string) {
		return new StringBuilder(string).reverse().toString();
	}
}
