package data;

public class Ex03 {
	public static void main(String[] args) {
		Integer a = 4;
		Integer b = 22;
		
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
		
		swap(a, b);
		
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
	}
	
	// a = 1; b = 2;
	// after swap
	// a = 2; b = 1;
	private static void swap(Integer a, Integer b) {
		int temp = a;
		a = b;
		b = temp;		
	}
}
