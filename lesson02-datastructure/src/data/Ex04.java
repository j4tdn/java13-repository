package data;


public class Ex04 {
	public static int a = 20;
	public static int x = 15;
	
	
	public static void main(String[] args) {
		int a = 10;
		 System.out.println("a: " + Ex04.a);
		 System.out.println("x: " + x);
		 x = 30;
		 System.out.println("x1: " + x);
		 test();
	}
	
	private static void test() {
		System.out.println("a: " + a);
		int b = 10;
		x =40;
		System.out.println("x2: " + x);
	}
	
}
