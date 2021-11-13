package ex02;

import ex01.Student;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"01a2b3456cde478"};
		String[] b = {"aa6b546c6e22h","aa6b326c6e22h"};
		show(getLargestNumbers (a));
		//System.out.println(cut(b[1]));
	}
	
	private static Integer[] getLargestNumbers (String[] a) {
		Integer[] result = new Integer[a.length];
		int k=0;
		for (String b: a) {
			result[k] = cut(b);
			k++;
		}
		return result;
	}
	
	private static int cut(String a) {
		String[] numbers = a.split("[a-z]+");
		int max=0;
		for (String b: numbers) {
			if (Integer.parseInt(b) > max) {
				max = Integer.parseInt(b); 
			}
		}
		return max;
	}
	
	private static void show(Integer[] s) {
		for (Integer a : s) {
			if(a!=null)
				System.out.println(a);
		}
		
		System.out.println("======================");
	}

}
