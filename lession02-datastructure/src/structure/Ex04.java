package structure;

public class Ex04 {

	public static void main(String[] args) {
		int number = 7;
		
		printFor(number);
		System.out.println("========");
		
		printWhile(number);
		System.out.println("========");
		
		printDoWhile(number);

		System.out.println("main");
	}
	
	private static void printDoWhile(int input) {
		int digit = 0;
		do {
			System.out.println(digit + " ");
			digit++;
		} while(input > digit);
	}
	
	private static void printFor(int input) {
		for(int digit = 0; digit < input; digit++ ) {
			System.out.println(digit);
		}
	}
	
	private static void printWhile(int input) {
		int digit = 0;
		while (digit < input) {
			System.out.println(digit + " ");
			digit++;
		}
	}

}
