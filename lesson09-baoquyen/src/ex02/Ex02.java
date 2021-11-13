package ex02;

import java.util.regex.Pattern;

public class Ex02 {
	public static void main(String[] args) {
		String [] s = {"bhcbxh123dcv3456","aa6b546c6e22h","aa6b326c6e22h"};
		System.out.println("result: ");
		int[] result = findNumber(s);
		for(int i = 0 ; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	private static int findNumber(String s) {
		String[] num = s.split("[a-zA-Z]+");
		int result = -1;
		for(int i = 0; i< num.length; i++ ) {
			try {
               int n = Integer.parseInt(num[i].toString());
               if (n > result ) result = n;
            } catch (NumberFormatException e) {
            	
            }
		}
		return result;
	}
	
	private static int[] findNumber(String[] s) {
		int [] result = new int[s.length];
		for(int i = 0; i< s.length; i++) {
			result[i] = findNumber(s[i]);
		}
		return result;
	}
}
