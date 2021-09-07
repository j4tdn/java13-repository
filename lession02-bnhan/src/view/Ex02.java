package view;

public class Ex02 {
	public static void main(String[] args) {
		long sum = factorial(4) + factorial(7) + factorial(12) + factorial(18);
		System.out.println("factorial of 4! + 7! + 12! +18! : " + sum);
	}
	
	public static long factorial(int n) {
		long factorial = 1;
		if(n == 1  || n == 0) {
			factorial = 1;
		}
		else {
			for (int i =2;i <=n; i++) {
				factorial = i * factorial;
			}
		}
		return factorial;
	}
}
