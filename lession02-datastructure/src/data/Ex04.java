package data;

public class Ex04 {
	
	//global variable >< attribute	 >< property
	public static int x = 20;
	private static int a = 15;
	
	public static void main(String[] args) {
		//local variable
		int a = 10;
		System.out.println("a: " + Ex04.a);
		
		System.out.println("x: " + x);
		x = 30;
		
		System.out.println("x1:" + x);
		test();
	}
	
	private static void test() {
		//local variable
		System.out.println("a: " +a);
		int b = 10;
		x = 40;
		System.out.println("x2: " +x);
	}
}
