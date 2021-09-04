package data;

/**
 * 
 * Array Helper
 *
 */

public class Ex13 {
	public static void main(String[] args) {
		// array of primitive type
		
		// declaration & initial
		// int [] >> object type
		// each element >> int type >> primitive type
		// constrast >> fixed length
		
		// declaration & initial an empty int[] object with length = 4
		int[] digits = new int[4];
		// digits[0], digits[1], digits[2], digit[3]
		int first = digits[0];
		System.out.println("first: " + first);
		
		digits[2] = 99;
		System.out.println("third: " + digits[2]);
		
		// declaration & initial an int[] object with length = 4 and given values
		int[] numbers = {1,9,4,7,5,6};
		System.out.println("numbers[3]: " + numbers[3]);
		
		// loop
		// for >> index >> get index & value
		for (int i = 0; i < numbers.length;i++) {
			System.out.println("nbr[" + i + "]=" + numbers[i]);
		}
		
		System.out.println("============");
		
		// for-each >> get value
		for(int number: numbers) {
			//each = number[i];
			System.out.println("each: " + number);
		}
		// array of object type
		// >> OOP
	}

}
