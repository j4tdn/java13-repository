package Ex03;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		boolean result =  isAnagram("Word", "droW");
		System.out.println(result);
		
		System.out.println("=======================");
		
		char c = counting("aaavvvjjjj");
		System.out.println(c);
	}	
		private static char counting(String s) {
			
			int count[] = new int[256];
		      
	        int len = s.length();
	        for (int i=0; i<len; i++)
	            count[s.charAt(i)]++;
	      
	        int max = Integer.MIN_VALUE;
	        char result = ' ';

	        for (int i = 0; i < len; i++) {
	            if (max < count[s.charAt(i)]) {
	                max = count[s.charAt(i)];
	                result = s.charAt(i);
	            }
	        }
	      
	        return result;
		
	}
	 public static boolean isAnagram(String s1, String s2) {
	        if (s1 == null || s2 == null) {
	            return false;
	        }
	        if (s1.length() != s2.length()) {
	            return false;
	        }
	        int len = s1.length();
	        for (int i = 0; i < len; i++) {
	            if (s1.charAt(i) != s2.charAt(len - 1 - i)){
	                return false;
	            }
	        }
	        return true;
	    }

}
