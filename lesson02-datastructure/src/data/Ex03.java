package data;

public class Ex03 {
	public static void main(String[] args) {
		int a = 4;
		int b = 22;
		
		System.out.println("a1: " + a);
		System.out.println("b1: " + b);
		
		swap(a, b);
		
		
		//expected: a = 22, b = 4
		
		// actual
		System.out.println("a2: " + a);
		System.out.println("b2: " + b);
	}
	
		// a = 4, b = 22
		// after swap
		// a = 22, b = 4
	
	private static void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
	System.out.println("Result of swap: " + a);
	System.out.println("Result of swap: " + b);
	
	
	}
}
