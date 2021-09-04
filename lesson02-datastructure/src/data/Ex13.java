package data;

public class Ex13 {
	public static void main (String[] args) {
		// array of primitive type
		
		// declaration & initial
		// int[] object type
		// each element >> int type >> primitive type
		// contrast >> fixed length
		
		// declaration & initial and empty int[] object with length = 4
		int[] digits = new int[4];
		// digits[0], digits[1] digits[2], digits[3]
		int first = digits[0];
		System.out.println("first: " + first);
		
		digits[2] = 99;
		System.out.println("third: " + digits[2]);
		
		// declare
		int[] number = {1, 9, 4, 7, 5, 6};
		System.out.println("number[3]: " + number[3]);
		
		// loop
		// for >> index >> get index & value
		for (int i =0; i < number.lenght; i++) {
			System.out.println("nbr["+i"]=" + numbers[i]);
		}
		
		// for each >> get value
		for(int each: numbers) {
		
	}
}
