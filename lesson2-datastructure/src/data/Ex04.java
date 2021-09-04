package data;

public class Ex04 {
	//global variable >< attibute >< property
	static int x = 20;
	
	public static void main(String[] args) {
	// local variable
		int a = 10;
		System.out.println("x: "+ x );
		x = 30;
		System.out.println("x1: "+ x );
		test();
	}
	
	private static void test() {
	// local variable
		int b = 20;
		x = 40;
		System.out.println("x2: "+ x );
	}
}
