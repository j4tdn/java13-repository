package exception;

public class Ex04 {
	
	public static void main(String[] args) {
		int[] a = null;
		test(a);
	}
	
	// Array is an object
	// Store data in help memory
	private static void test(int[] a) {
		a[0] = 5;
		a[1] = 10;
	}
}
