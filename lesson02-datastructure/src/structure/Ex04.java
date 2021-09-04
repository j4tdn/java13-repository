package structure;

public class Ex04 {
	public static void main(String[] args) {
		// Printout values less than 7 >> [0,6]
		int number = 0;
		
		System.out.println("===== PRINT FOR ====");
		printFor(number);
		
		System.out.println("\n===== PRINT WHILE ====");
		printWhile(number);
		
		System.out.println("\n===== PRINT DO WHILE ====");
		printDoWhile(number);
	}
	
	private static void printDoWhile(int input) {
		int digit = 0;
		do {
			System.out.print(digit + "  ");
			digit++;
		} while(digit < input);
	}
	
	private static void printWhile(int input) {
		// expression =>> exp2 in for
		// No semicolon in case of >> if, else, switch case, for while do while
		int digit = 0;
		/*while(digit < input) {
			// statement
			System.out.print(digit + "  ");
			digit++;
		}*/
		
		while(true) {
			// stop condition
			if (digit == input) {
				break;
			}
			System.out.print(digit + "  ");
			digit++;
		}
	}

	private static void printFor(int input) {
		// Opt 1: For
		// exp1: initial expression
		// exp2: condition expression
		// exp3: loop controlling expression
		for (int digit = 0; digit < input; digit++) {
			// statement
			System.out.print(digit + "  ");
		}
	}
}
