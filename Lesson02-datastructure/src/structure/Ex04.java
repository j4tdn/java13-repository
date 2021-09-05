package structure;

public class Ex04 {
	public static void main(String[] args) {
		// Printout values less than 7 >> [0,6]
		int number = 7;
		
		// Opt1: For
		// exp1: initial expression
		// exp2: condition expression
		// exp3: loop controllong expression
		System.out.println("===== PRINT FOR=====");
		for(int digit = 0; digit < number; digit++) {
			//statement
			System.out.print(digit + " ");
		}
		System.out.println("\n===== PRINT WHILE ====");
		printWhile(number);
		System.out.println("\nmain ");
		System.out.println("===== PRINT DO WHILE ====");
		printDoWhile(number);
	}
	private static void printWhile(int input) {
		int digit = 0;
		while(digit < input) {
			System.out.print(digit + " ");
			digit ++;
		}
	}
	private static void printDoWhile(int input) {
		int digit = 0;
		do {
			System.out.print(digit + " ");
			digit ++;
		} while(digit < input);
	}
	
}
