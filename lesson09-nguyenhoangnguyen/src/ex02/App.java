package ex02;

import java.util.Arrays;
import java.util.regex.Pattern;

public class App {

	public static void main(String[] args) {
		String[] strings = {"aa6b546c6e22h", "aa6b326c6e22h"};
		int[] numbers = getLargestNumbers(strings);
		System.out.println(Arrays.toString(numbers));
		
		System.out.println("==============================");
		// another way >> lesson12
		Arrays.stream(strings)
			  .forEach(string -> {
				  int max = Pattern.compile("[a-z]+")
				  		 .splitAsStream(string)
				  		 .filter(s -> !s.isEmpty())
				  		 .mapToInt(Integer::parseInt)
				  		 .max()
				  		 .getAsInt();
				  System.out.print(max + " ");
			  });
		
	}

	private static int[] getLargestNumbers(String... strings) {
		int[] result = new int[strings.length];
		int index = 0;
		// "aa6b546c6e22h", "aa6b326c6e22h"
		// string : aa6b546c6e22h
		for (String string : strings) {

			// get max valid number in each string
			int max = getMaxValidNumber(string);

			// Assign max valid number into array of int
			result[index++] = max;
		}

//		for (int i = 0; i < result.length - 1; i++) {
//			if (result[i + 1] < result[i]) {
//				int temp = result[i];
//				result[i] = result[i + 1];
//				result[i + 1] = temp;
//			}
//		}
		
		Arrays.sort(result);

		return result;
	}

	private static int getMaxValidNumber(String string) {
		// aa6b546c6e22h
		if (string == null || string.isEmpty() || string.matches("[a-z]+")) {
			return 0;
		}
		// Split string by pattern to get valid numbers
		String[] validNumbers = string.split("[a-z]+");

		// Parse to Integer
		// Find max number
		int[] numbers = new int[validNumbers.length];
		int index = 0;
		int max = Integer.MIN_VALUE;
		for (String validNumber : validNumbers) {
			if (!validNumber.isEmpty()) {
				int number = Integer.parseInt(validNumber);
				if (number > max) {
					max = number;
				}
			}
		}

		return max;

	}
}
