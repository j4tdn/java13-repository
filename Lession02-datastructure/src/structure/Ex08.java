package structure;

public class Ex08 {
	public static void main(String[] args) {
		//printout values less than 7 >> [0-6]
		int number = 7;
		System.out.println("====FOR======");
		printFor(number);
		System.out.println("\n====WHILE======");
		printWhile(number);
		System.out.println("\n====DOWHILE======");
		printDoWhile(number);
	}
	private static void printDoWhile(int input) {
		int digit = 0;
		do {
			System.out.print(digit + " ");
			digit++;
		}while (digit < input);
	}
	
	private static void printWhile(int input) {
		//expression >> exp 2 in for
		int digit = 0;
		while(digit<input) {
			System.out.print(digit + " ");
			digit++;
		}
	}
	
	private static void printFor(int input) {
		//opt 1: For
		//exp 1 : initial expression
		//exp 2 : condition expression
		//exp 3 : loop controlling expression
		
		for (int digit = 0;digit<input;digit++) {
			System.out.print(digit + " ");
		}
	}
}
