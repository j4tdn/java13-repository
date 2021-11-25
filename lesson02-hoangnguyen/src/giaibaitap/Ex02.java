package giaibaitap;

public class Ex02 {
	
	public static void main(String[] args) {
		int[] numbers = {4, 7, 12, 18};
		long result = fact();

		System.out.println(result);
		
	}
	
	// variables ...
	// 1. array with data type
	// 2. aggregation of parameter >> 0 or n parameters
	private static long fact(int... numbers) {
		long result = 0;
		
		if(numbers != null) {
			
			for(int number : numbers) {
				result += factorial(number);
			}
			return result;
		}
		
		return result;
		
	}
	
	private static long factorial(int n) {
		long fact = 1;
		while(n > 1) {
			fact *= n;
			n--;
		}
		return fact;
	}
}
