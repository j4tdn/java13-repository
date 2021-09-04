package data;

public class Ex04 {
	
	// global variable >< attribute >< property
	// access modifier : quyền truy cập
	// Program : data structure + algorithm
	// Class : attribute + method
	public static int x = 20;
	public static int a = 20;
	
	public static void main(String[] args) {
		int a = 10;
		System.out.println("x: "+ a);
		System.out.println("x: "+ Ex04.a);
		int x = 40;
		System.out.println("x: "+ x);
		test();
	}
	
	private static void test() {
		// local variable 
		int b = 10;
		x = 30;
		System.out.println("x: "+ x);
	}
}
