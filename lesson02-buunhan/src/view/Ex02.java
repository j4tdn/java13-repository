package view;

public class Ex02 {
	public static void main(String[] args) {
		long sum = f(4) + f(7) + f(12) + f(18);
		System.out.println("factorial of 4! + 7! + 12! +18! : " + sum);
	}
	
	public static long f(int n) {
		long f = 1;
		if(n == 1  || n == 0) {
			f = 1;
		}
		else {
			for (int i =2;i <=n; i++) {
				f = i * f;
			}
		}
		return f;
	}
}
