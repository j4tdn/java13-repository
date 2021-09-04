package data;

import java.util.Arrays;

public class Ex07 {
	public static void main(String[] args) {
		Integer a = new Integer(20);
		// Required: JAVA's available objects
		//E.g: Integer, Long Double, String, Character
		
		int sum = sumAll(10,20,30,50);
		
		System.out.println("sum: " + sum);
		
	}
	//JAVA Version 8
	/*
	public static int sum(int a, int b) {
		return a+ b;
	}
	*/
	// java version 9
	@Deprecated(since = "9")
	public static int sum(int a, int b) {
		return a+ b;
	}
	public static int sumAll(int ... nbrs) {
		 return Arrays.stream(nbrs).sum();
	}
}
