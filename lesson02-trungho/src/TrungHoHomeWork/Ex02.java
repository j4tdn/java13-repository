package TrungHoHomeWork;

public class Ex02 {
	public static void main (String[] args) {
		System.out.print("Sum of 4! + 7! + 12! + 18! is: " + factorialCalculation(4) + " + " + factorialCalculation(7) + " + " + factorialCalculation(12) + " + " + factorialCalculation(18) + " = " + (factorialCalculation(4) + factorialCalculation(7) + factorialCalculation(12) + factorialCalculation(18)));
	}
	
	public static long factorialCalculation(long n) {
		long result = 1;
		while (n != 0 && n != 1) {
			result = result*n;
			n = n-1;	
		}
		
		return result;
	}
}
