package data;

public class Ex02 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("a1 = " + a);
		System.out.println("b1 = " + b);
		
		a = b;
		
		System.out.println("a2 = " + a);
		System.out.println("b2 = " + b);
		
		a = 15;
		System.out.println("a3 = " + a);
		
		modify(a);
		System.out.println("a4 = " + a);
		
	}
	
	// pass by value || reference
	private static void modify(int a) {
		a = 99;
		System.out.println("a5 = " + a);
	}
	

}
