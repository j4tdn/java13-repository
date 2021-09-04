package data;

// Array Helper

public class Ex13 {
	public static void main(String[] args) {
		// array of primitive type
		
		// declaration & initial 
		// int[] >> object type
		// each element >> int type >> primitive type
		// contrast >> fixed length
		
		// declaration & initial an empty int[]	object with length = 4
		int[] digits = new int[4];
		// digits[0] digits[1] digits[2] digits[3]
		int first = digits[0];
		System.out.println("first" + first);
		
		digits[2] = 99;
		System.out.println("third" + digits[2]);
		
		// declaration & initial an int[] object with length = 6 and given values
		int[] numbers = {1, 9, 4, 7, 6, 5};
		System.out.println("numbers[3] = "+ numbers[3]);
		
		// loop
		// for >> index >> get index & value
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("nbr[" +i+"] = " + numbers[i]);
		}
		
		System.out.println("=====================");
		
		// for-each >> get value
		for (int number: numbers) {
			// number = numbers
			if(number % 2 == 0) {
				System.out.println("each: " + number);
			}
		}
		
		// array of object type
	}
}
