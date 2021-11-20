package ex02;

import java.util.Arrays;
import java.util.regex.Pattern;

public class App {
	public static void main(String[] args) {
		String[] strings = {"aa6b546c6e22h", "aa6b326c6e22h"};
		int[] numbers = getLargestNumbers(strings);

		// print out
		System.out.println(Arrays.toString(numbers));
		
		System.out.println("\n============\\\\\\================\n");
		
		// some way >> lesson 12
		Arrays.stream(strings)
		      .forEach(string -> {
		    	  int max = Pattern.compile("[a-z]+")
		    	         .splitAsStream(string)
		    	         .filter(s -> !s.isEmpty())
		    	         .mapToInt(Integer::parseInt)
		    	         .max()
		    	         .getAsInt();
		    	  System.out.print(max + "   ");
		      });
		
	}

	private static int[] getLargestNumbers(String... strings) {
		int[] result = new int[strings.length];
		int index = 0;

		// "aa6b546c6e22h", "aa6b326c6e22h"
		// string: aa6b546c6e22h
		for (String string : strings) {
			// Get max valid number in string
			int max = getMaxValidNumber(string);

			// Assign max valid number into array of int
			result[index++] = max;
		}

		return result;
	}

	private static int getMaxValidNumber(String string) {
		if (string == null || string.isEmpty() || string.matches("[a-z]+")) {
			return 0;
		}

		// aa6b546c6e22h
		// Get valid numbers in string >> "", "6", "546", "6", "22"
		String[] validNumbers = string.split("[a-z]+");

		// Pass to interger & find max number
		int max = Integer.MIN_VALUE;
		for (String validNumber : validNumbers) {
			if (!validNumber.isEmpty()) {
				int number = Integer.parseInt(validNumber);
				if (max < number) {
					max = number;
				}
			}

		}
		return max;
	}

}
