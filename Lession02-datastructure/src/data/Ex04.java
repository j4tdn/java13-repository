package data;

public class Ex04 {
	// global variable >< attribute
	// access modifier : pham vi truy cap
	// program : data struture + algorithm
	// class : attribute + method
	public static int x = 20;
	private static int a = 15;

	public static void main(String[] args) {
		
		// local variable
		System.out.println("x: " + x);
		int a = 10;
		System.out.println("a: " + a);
		x = 30;

		System.out.println("x1: " + x);
		test();
	}

	private static void test() {
		// local variable
		int a = 10;
		x = 40;
		System.out.println("x2: " + x);

	
	}
	

}
