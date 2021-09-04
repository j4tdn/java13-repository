package data;

import java.util.Arrays;

public class Ex07 {
	public static void main(String[] args) {
		//line through >>deprecated
		
//		Integer a = new Integer(10); //take time, space
		// Required: Java's available objects
		// E.g: Integer, Long, Double, String, Character
		// 2 way to declare variable
		Integer a1 = new Integer(10);
		Integer a2 = new Integer(12);
		Integer a3 = new Integer(10); //different to a1's Hash Code
		//have 3 stack, 3 heap
		Integer b1=20;
		Integer b2=40;
		Integer b3=20; // same to a1's hash code
		//have 3 stack, 2 heap
		int sum = sumAll(10,20,30,40);
		System.out.println("sum:"+ sum);
		
	}
	@Deprecated (since = "9")
	public static int sum(int a, int b) {
		return a+b;
	}
	public static int sumAll(int ... nbrs) {
		return Arrays.stream(nbrs).sum();
	}
}
