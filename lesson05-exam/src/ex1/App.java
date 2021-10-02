package ex1;

public class App {
	public static void main(String[] args) {
		System.out.println(isPowerOf(8,2));
		System.out.println(isPowerOf(6,2));
		System.out.println(isPowerOf(20,4));
		System.out.println(isPowerOf(64,4));
	}
	
	public static boolean isPowerOf(int a, int b) {
		if (a == 1) return true;
		if (a % b != 0) return false;
		return isPowerOf(a/b, b);
	}
}

