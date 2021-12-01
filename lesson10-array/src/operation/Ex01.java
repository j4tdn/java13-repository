package operation;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = { 1, 9, 5, 36, 12, 33 };
		int sumOfOdd = sum(numbers, a -> a % 2 != 0);
		System.out.println("sum: " + sumOfOdd);
		Tuple minMaxTuple = maxMin(numbers);
		System.out.println("minMaxTuple: " + minMaxTuple);
		int[] newArray = addElement(numbers, 5, 18);
		System.out.println(Arrays.toString(newArray));
		int[] removeArray = remove(numbers, 3);
		System.out.println("remove: " + Arrays.toString(removeArray));
		int[] deleteArray = delete(numbers, 3);
		System.out.println("Delete: " + Arrays.toString(deleteArray));
	}
	
	//4.1 Cach 1:
	private static int[] remove(int[] origin, int k) {
		if(k < 0 || k > origin.length - 1) {
			throw new IllegalArgumentException(k + "Cannot out of range (0" + (origin.length-1) + ")");
		}
		
		// B1: Create a new array with size = presize -1
		int[] result = new int[origin.length - 1];
		
		// B2: Copy all elements from preArray to new Array
		for(int i = 0; i < k; i++) {
			result[i] = origin[i];
		}
		// B3: Copy all element from k+1 to length - 1, copy to new Array
		for(int i = k; i < result.length; i++) {
			result[i] = origin[i+1];
		}
		return result;
	}
	
	// 4.1 Cach 2:
	private static int[] delete(int[] origin, int k) {
		// B1: Create a new array with size = preSize & copy all elements to new array
		int[] result = Arrays.copyOfRange(origin, 0, origin.length);
		
		// B2: Shift left ONE UNIT k =3 to < length -1
		for(int i = k; i < result.length-1; i++) {
			result[i] = result[i+1];
		}
		
		return Arrays.copyOfRange(result, 0, result.length-1);
	}
	
	// 3.Add element
		private static int[] addElement(int[] numbers, int k, int value) {

			int[] newNumbers = new int[numbers.length + 1];
//			int i = 0;
//			for (int j = 0; j < newNumbers.length; j++) {
//				if (j == k) {
//					newNumbers[j] = value;
//				} else {
//					newNumbers[j] = numbers[i++];
//				}
	//
//			}
			for (int i = 0; i < numbers.length; i++) {
				newNumbers[i] = numbers[i];
			}
			for (int j = newNumbers.length - 1; j > k; j--) {
				newNumbers[j] = newNumbers[j - 1];
			}
			newNumbers[k] = value;
			return newNumbers;
		}

		// 2.Find maximum, minimum in one loop
		private static Tuple maxMin(int[] numbers) {
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			for (int number : numbers) {
				if (number > max) {
					max = number;
				}
				if (number < min) {
					min = number;
				}
			}
			return new Tuple(max, min);
		}

		// 1.Calculate sum of odd numbers
		private static int sum(int[] numbers, Strategy strategy) {
			int sum = 0;
			for (int i : numbers) {
				if (strategy.excuse(i)) {
					sum += i;
				}
			}
			return sum;
		}
}
