package data;

public class Ex04 {
	public static int x = 20;
	private static int a = 15;

	public static void main(String[] args) {
		int a = 10;
		System.out.println("a: " + a);
		System.out.println("x: " + x);
		
		x = 30;
		System.out.println("x: " + x);
		test();
	}
	
	private static void test() {
		int b = 10;
		System.out.println("a: " + a);
		x = 40;
		System.out.println("x: " + x);
	}

}
