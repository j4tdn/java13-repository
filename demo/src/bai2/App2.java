package bai2;

import java.util.ArrayList;

public class App2 {
	public static void main(String[] args) {
		System.out.println(distinguish("words", "Wdors"));
		char[] result = charHappensMost("aaaabbcccc");
		System.out.println("result: ");
		for(char c : result) {
			System.out.print(c + "   ");
		}
	}
	
	private static char[] charHappensMost(String s ) {
		char[] result = new char[s.length()];
		int countMax = countChar(s, s.charAt(0));
		int k = -1;
		for(int i = 0; i < s.length(); i++) {
			if (i > 0) {
				if (s.charAt(i) == s.charAt(i-1)) {
					continue;
				}
			}
			if (containChar(s.substring(i), s.charAt(i))) {
				continue;
			}
			if (countMax < countChar(s, s.charAt(i))) {
				result.clone();
				k = 0;
				result[k] = s.charAt(i);
			}
			if (countMax == countChar(s, s.charAt(i))) {
				if (s.charAt(i) != result[0]) {
					k++;
					result[k] = s.charAt(i);
				}
			}
			
		}
		return result;
	}
	
	private static boolean distinguish(String s1, String s2) {
		s1 = s1.toLowerCase().replaceAll("[\\s]+", "");
		s2 = s2.toLowerCase().replaceAll("[\\s]+", "");
		
		if (s1.length() != s2.length())
			return false;
		
		if (doCharToInt(s1) != doCharToInt(s2))
			return false;
		
		int count1 = 0;
		for(int i = 0; i < s1.length(); i++) {
			int count2 = 0;
			for(int j = 0; j < s2.length(); j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					count2++;
				}
			}
			if (count2 > 0) count1++;
		}
		return count1 == s1.length();
	}
	
	private static int doCharToInt(String s) {
		int result = 0;
		for(int i = 0; i < s.length(); i++) {
			result += s.charAt(i);
		}
		return result;
	}
	private static int countChar(String s, char c) {
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) count++;
		}
		return count;
	}
	private static boolean containChar(String s, char c) {
		for(int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) return false;
		}
		return true;
	}
}
