package data;

/*
 * Array Helper
 * */

public class Ex13 {

	public static void main(String[] args) {
		
		// array of primitive type
		
		// declaration && initial
		// int[] z.. object type
		// each element >> int type >> primitive type
		// contrast >> fixed length
		
		// declaration && initial an empty int[] object with length = 4
		int[] digits = new int[4];
		//digits[0], digits[1], digits[2], digits[3]
		int first = digits[0];
		System.out.println("First: " + first);
		
		digits[2] = 99;
		System.out.println("Third: " + digits[2]);
		
		// declaration && initial an int[] object with length = 4 and given values
		int[] numbers = {1, 4, 5, 67, 9 ,23};
		System.out.println("number[3]: " + numbers[3]);
		
		// Loop
		// For << index
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("nbr[" + i +"]: " + numbers[i]);
		}
		
		// For-each
		for(int number : numbers) {
			if(isEven(number)) {
				System.out.print(number + " ");
			}
		}
		
		
		// array of object type
		// OOP
	}
	
	private static boolean isEven(int number) {
		return number % 2 == 0;
	}

}
