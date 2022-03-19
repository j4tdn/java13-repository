package ex03;

import java.util.Arrays;

/**
 * Kiểm tra 2 chuỗi Strings có phải là đảo ngữ (anagram) của nhau không?
 *
 */
public class App01 {
	public static void main(String[] args) {
		String s1 = "Word";
		String s2 = "drWo";

		System.out.println(s1 + " va " + s2 + " la dao ngu cua nhau: " + isAnagram(s1, s2));
	}

	private static boolean isAnagram(String s1, String s2) {
		char[] s1Chars = s1.toLowerCase().trim().toCharArray();
		char[] s2Chars = s2.toLowerCase().trim().toCharArray();
		if (s1Chars.length != s2Chars.length) {
			return false;
		}

		Arrays.sort(s1Chars);
		Arrays.sort(s2Chars);

		for (int i = 0; i < s1Chars.length; i++) {
			if (s1Chars[i] != s2Chars[i]) {
				return false;
			}
		}

		return true;
	}
}
