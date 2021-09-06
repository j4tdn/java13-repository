package homework;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("4! +7! + 12! + 18! = "+ (factorial(4)+ factorial(7)+ factorial(12) + factorial(18)) );
	}
	private static long factorial(int n) {
		long x = 1;
		for(int i = 1; i<= n ; i++) {
			x = x*i;
		}
		return x;
	}
}
