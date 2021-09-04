package structure;

public class Ex13 {
	public static void main(String[] args) {
		// array of primitive type
		int [] digits = new int[4];
		int first = digits[0];
		System.out.println("first: "+ first);
		digits[2] = 99;
		System.out.println("third: "+ digits[2]);
		int [] numbers = {1, 9, 4, 5, 6, 7};
		System.out.println("number[3] = "+ numbers[3] );
		for(int i = 0; i< numbers.length; i++) {
			System.out.println("nbr["+ i + "] = " + numbers[i]);
		}
		for(int number:numbers) {
			System.out.println("each: "+ number);
		}
		
	}
}
