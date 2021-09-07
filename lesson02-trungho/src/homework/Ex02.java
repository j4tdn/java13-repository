package homework;

public class Ex02 {
	/**
	 * <b>Description:</b> Calculate the summary of factorial value of 4 and 7 and 12 and 18 then print result<br>
	 */
	public static void main (String[] args) {
		System.out.print("Sum of 4! + 7! + 12! + 18! is: " + factorialCalculation(4) + " + " + factorialCalculation(7) + " + " + factorialCalculation(12) + " + " + factorialCalculation(18) + " = " + (factorialCalculation(4) + factorialCalculation(7) + factorialCalculation(12) + factorialCalculation(18)));
	}
	
	/**
	 * <b>Description:</b> Calculate the factorial value of a number<br>
	 * <b>Return:</b> Factorial value of the input number<br>
	 * @param n represent the input number
	 */
	public static long factorialCalculation(long n) {
		long result = 1;
		while (n != 0 && n != 1) {
			result = result*n;
			n = n-1;	
		}	
		return result;
	}
}
