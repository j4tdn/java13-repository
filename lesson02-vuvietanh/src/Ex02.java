
public class Ex02 {
	public static void main(String[] args) {
		int result = sum(4) + sum(7) + sum(12) + sum(18);
		System.out.println("Result: " + result);
	}

	private static int sum(int number) {
		int a = 1;
		for (int i = 1; i <= number; i++) {
			a = a * i;
		}
		return a;
	}
}