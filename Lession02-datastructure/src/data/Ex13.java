package data;

/**
 * 
 * Array Helper
 *
 */
public class Ex13 {
	public static void main(String[] args) {
		//array of primitive type
		
		//int[] is object
		//delaration & Initial
		int [] digits = new int[4];
		//digit[0];digit[1];digit[2];digit[3];
		int first = digits[0];
		System.out.println("first: " + first);
		
		digits[2] = 99;
		System.out.println("third: " + digits[2]);
		//declaration & initial an int[] object with leangth = 6 and given values
		int [] numbers = { 1,9,7,5,8,4};
		System.out.println("number[3] :" + numbers[3]);
		
		//loop
		//for >> index >> get index & value
		
		for (int i = 0;i<numbers.length;i++) {
			System.out.println("nbr["+i+"]" + numbers[i]);
		}
		
		System.out.println("====================");
		
		//for-each
		for (int number : numbers) {
			//each = number[1]
			System.out.println("each: " + number);
		}
		
		//array of object type
	}
}
