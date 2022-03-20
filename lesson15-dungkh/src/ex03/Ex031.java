package ex03;
import java.util.Arrays;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex031 {
	public static void main(String[] args) {
		System.out.println("======Ex03.1=====");
		String s1 = "Word";
		String s2 = "orWdd";
		System.out.println(s1 + " & " + s2 + " is Anagram : " + isAnagram(s1, s2));

	}
	public static boolean isAnagram(String s1,String s2) {
		s1= s1.toLowerCase();
		s2= s2.toLowerCase();
		if (s1.length() != s2.length()) 
			return false;
		char[] str1= s1.toCharArray();
		char[] str2= s2.toCharArray();
		Arrays.sort(str1);
		Arrays.sort(str2);
		return Arrays.equals(str1, str2);	
		}
	
	}


