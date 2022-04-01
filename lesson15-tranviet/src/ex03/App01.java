package ex03;

import java.util.Arrays;

/**
 * Kiểm tra 2 chuỗi Strings có phải là đảo ngữ (anagram) của nhau không?
 *
 */
public class App01 {
	public static void main(String[] args) {
		String s1 = "Wo  r d adsa";
		String s2 = "s drd Wa o a";
		System.out.println(s1 + " va " + s2 + " la dao ngu cua nhau: " + isAnagram(s1, s2));
	}

	private static boolean isAnagram(String s1, String s2) {
		if(s1.length() != s2.length()){
			return false;
		}
		char[] s1Chars = toLowerCaseAndTrim(s1).toCharArray();
		char[] s2Chars = toLowerCaseAndTrim(s2).toCharArray();

		Arrays.sort(s1Chars);
		Arrays.sort(s2Chars);
		
//		// có thể sử dụng method equals để thay thế
//		for (int i = 0; i < s1Chars.length; i++) {
//			if (s1Chars[i] != s2Chars[i]) {
//				return false;
//			}
//		}

		return Arrays.toString(s1Chars).equals(Arrays.toString(s2Chars));
	}
	private static String toLowerCaseAndTrim(String str){
		return str.toLowerCase().trim().replaceAll("\\s+", "");
	}
}
