package data;

public class Ex13 {

	public static void main(String[] args) {
		int[] digits = new int[4];
		int first =  digits[0];
		System.out.println("first " + first);
		
		digits[2] = 99;
		System.out.println("third " + digits[2]);
		
		int[] numbers = {1, 9, 4, 7, 5, 6};
		System.out.println("numbers[3]: " + numbers[3]);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("nbr["+i+"] = " + numbers[i]);
		}
		
		System.out.println("=======================");
		for (int number : numbers) {
			if (isEven(number)) {
				System.out.println("each: " + number);

			}
		}
	}	
	private static boolean isEven(int input) {
		return input % 2 == 0;
	}

}
