package exception;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		test(a);
		
		System.out.println(Arrays.toString(a));
	}
	
	// Array is an object
	// Store data in heap memory
	private static void test(int[] a) {
		// NullPointException
		a[0] = 5;
		a[1] = 10;
		
		// ArrayIndexOutOfBoundExection
		a[3] = 20;
	}
}