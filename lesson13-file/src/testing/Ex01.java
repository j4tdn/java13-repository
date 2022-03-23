package testing;

public class Ex01 {
	public static void main(String[] args) {
		// sub, sum, mul, div
		int[] numbers = {1,2,3,4,5};
		int result = perform(1, (a, b) -> a * b, numbers);
		System.out.println("result: " + result);
	}
	
	private static int perform(int identity, Operator operator, int[] numbers) {
		int result = identity;
		for (int number: numbers) {
			result = operator.operate(result, number);
		}
		return result;
	}
	
	
	private static interface Operator {
		int operate(int a, int b);
	}
}
