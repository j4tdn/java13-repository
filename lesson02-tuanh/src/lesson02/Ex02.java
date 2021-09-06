package lesson02;

public class Ex02 {
	public static void main(String[] args) {
		sum();
	}
	private static void sum() {
		long sum = fact(4) + fact(7) + fact(12) + fact(18);
		System.out.println(sum);
	}
	private static long fact(int n)
	{
		long fact = n;
		for (int i = n;i > 1; i--) {
			fact = fact*(i-1);
		}
		return fact;
	}

}
