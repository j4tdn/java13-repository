package data;

public class Ex02 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		System.out.println("a: " + a);
		System.out.println("b: " + b);

		a = b;

		System.out.println("a: " + a);
		System.out.println("b: " + b);

		a = 15;

		System.out.println("a: " + a);

		modify(a);
		System.out.println("a4: " + a);
	}

	private static void modify(int a) {
		a = 99;
	}
}
