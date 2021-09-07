package Exercise;

public class Ex02 {
	public static void main(String[] args) {
		long sum = 0;
		sum = factorial(4) + factorial(7) + factorial(12) + factorial(18);
		System.out.println("4! + 7! + 12! + 18! = " + sum);
	}
	
	public static long factorial(int n) {
		return n > 0 ? n * factorial(n - 1) : 1;
	}
}

