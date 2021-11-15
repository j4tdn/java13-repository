package baitap;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String s1, s2;
		System.out.println("Nhập chuỗi 1: ");
		s1 = input.nextLine();
		System.out.println("Nhập chuỗi 2: ");
		s2 = input.nextLine();
		System.out.println("Chuỗi con chung dài nhất: " + getLongestSubString(s1, s2));
		
	}
	
	private static String getLongestSubString(String a, String b) {
		String sub = "";
		for(int i = 0; i < a.length(); i++ ) {
			for(int j = i; j< a.length(); j++) {
				if(b.contains(a.substring(i, j +1))) {
					if(sub.length() < a.substring(i, j+1).length()) sub = a.substring(i, j+1);
				}
			}
		}
		return sub;
	}
	
	private static boolean isValid(String s) throws Exception {
		if (!s.matches("[A-Z]+")) {
			throw new Exception("s1,s2 chỉ chứa các kí tự [A-Z]");
		}
		return true;
	}
}
