package operation;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = {1, 9, 5,25, 12, 23, 33};
	
		int sumOfOddElms = sum(numbers, num -> num % 2 != 0);
		System.out.println(sumOfOddElms);
		Tuple minMaxTuple = getMaxMin(numbers);
		System.out.println(minMaxTuple);
		
	}
	// sum of odd
	private static int sum(int[] numbers, Strategy strategy) {
		int sum = 0;
		for(int number : numbers) {
			if(strategy.check(number)) {
				sum += number;
			}
		}
		return sum;
	}
	// max, minimum

	private static Tuple getMaxMin(int[] numbers) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int number : numbers) {
			if(max < number) {
				max = number;
			}
			if(min > number) {
				min = number;
			}
		}
		return new Tuple(max, min);
	}
	
	// add index
	
	private static int[] insert(int[] numbers, int index, int newNumber) {
		int[] result = new int[numbers.length + 1];
		
		for(int i = 0; i < numbers.length; i++) {
			result[i] = numbers[i];
		}
		
		return result;
	}
}
