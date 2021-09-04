package data;

public class Ex04 {
	
	// global variable = attribute = property
	// access modifier: phạm vi truy cập
	// Program: data structure + algorithm
	// Class: attribute + method
	
	// global variable
	public static int x = 20;
	private static int a = 15;
	
	public static void main (String[] args) {
		//local variable
		int a = 10;
		System.out.println("a :" + a);
		System.out.println("a :" + Ex04.a);	
		
		System.out.println("x1 :" + x);
		x = 30;
		System.out.println("x1 :" + x);
		test();
	}
	
	private static void test() {
		//local variable
		int b = 10;
		x = 40;
		System.out.println("x2 :" + x);
	}
}
