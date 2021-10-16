package exception;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		// int[] a = null;
		// int[] a = new int[2];
		int[] a = { 1, 2, 3 };
		test(a);

		System.out.println(Arrays.toString(a));
	}

	// array is an object
	// store data in heap memory
	private static void test(int[] a) {
		// NPE
		a[0] = 5;
		a[1] = 10;
		
		// ArrayIndexOutOfBoundsException
		a[3] = 20;
	}

}
