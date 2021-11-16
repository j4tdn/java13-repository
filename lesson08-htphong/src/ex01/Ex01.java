package ex01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		String s = "Mỗi ngày một khác";
		
		System.out.println("In ra mỗi kí tự trên một dòng: ");
		for(int i = 0; i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				System.out.println(s.charAt(i));
			}
		}
		System.out.println("In ra mỗi từ trên mỗi dòng: ");
		String[] s1 = s.split("\\s");
		for(String a : s1) {
			System.out.println(a);
		}
		System.out.println("In ra chuỗi đảo ngược theo kí tự");
		StringBuilder s2 = new StringBuilder(s);
		s2.reverse();
		System.out.println(s2);
		System.out.println("In ra chuỗi đảo ngược theo từ");
		for(int i = 0; i<s1.length; i++) {
			StringBuilder a = new StringBuilder(s1[i]);
			a.reverse();
			s1[i] = a.toString();
		}
		for(String a : s1) {
			System.out.println(a);
		}
	}
}
