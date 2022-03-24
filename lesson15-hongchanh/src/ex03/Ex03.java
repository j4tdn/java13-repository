package ex03;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		String s1 = "Word";
		String s2 = "drWo";
		
		String a = "abc";
		String b = "bac";
		if (a==b) {System.out.println("true");}
		
		if(anagram(s1, s2)) {
		System.out.println(s1 + " và " + s2 + " là đảo ngữ! ");}
		else {System.out.println("không phải");}
		}

	// Good
	private static boolean anagram(String s1, String s2) {
		char[] c1 = s1.toLowerCase().trim().toCharArray();
		char[] c2 = s2.toLowerCase().trim().toCharArray();
		
		if (c1.length != c2.length) {
			return false;
		}

		Arrays.sort(c1);
		Arrays.sort(c2);
		
		// Có thể replace với Arrays.compare hoặc dùng String.equals
		for (int i = 0; i < c1.length; i++) {
			if (c1[i] != c2[i]) {
				return false;
			}
		}

		return true;
	}
}