package data;

public class Ex02 {
	public static void main(String[] args) {
		int a = 4;
		int b = 10;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		swap(a, b);
		System.out.println("a2: " + a);
		System.out.println("b2: " + b);
	}
	
	private static void swap (int a, int b) {
		int tmp = a ;
		a = b;
		b = tmp;
		System.out.println("ablue: " +a);
		System.out.println("bblue: " +b);
	}
	
	
	
}
