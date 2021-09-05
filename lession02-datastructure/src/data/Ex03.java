package data;

public class Ex03 {

	public static void main(String[] args) {
		int a = 4;
		int b = 22;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		swap(a, b);
		

	}
	
	private static void swap(int a, int b) {
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}

}
