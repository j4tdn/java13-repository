package package03;

import java.util.Arrays;

public class Ex03App01 {
	public static void main(String[] args) {
		String expected = " W  o  rdan ";
		String actual = "wa  ndo  r";
		
		System.out.println("isAnagram: " + isAnagram(expected, actual));
	}
	
	private static boolean isAnagram(String s1, String s2) {
		s1 = toLowerCaseAndTrim(s1);
		s2 = toLowerCaseAndTrim(s2);
		
		char[] s1Array = s1.toCharArray();
		char[] s2Array = s2.toCharArray();
		
		Arrays.sort(s1Array);
		Arrays.sort(s2Array);
		
		return Arrays.compare(s1Array, s2Array) == 0;
	}
	
	private static String toLowerCaseAndTrim(String input) {
		return input.trim().replaceAll("\\s+", "").toLowerCase();
	}
}
