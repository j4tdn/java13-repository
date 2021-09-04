package structure;

public class Ex04 {
	public static void main(String[] args) {
		//Opt1: for
		int number = 0;
		System.out.println("===== FOR =====");
		printFor(number);
		System.out.println("\n==== WHILE ====");
		printWhile(number);
		System.out.println("\n==== DO WHILE ====");
		printDoWhile(number);
		
		
		System.out.println("\nmain");
	}		
	
		private static void printWhile(int input) {
			int digit = 0;
			while(digit < input) {
				System.out.print(digit + " ");
				digit++;
			}
		}
		
		
		private static void printFor(int input) {
			for(int digit = 0; digit < input; digit++) {
				System.out.print(digit + " ");
			}
		}
		
		private static void printDoWhile(int input) {
			int digit = 0;
			do {
				System.out.print(digit + " ");
			} while(digit < input);
		}
}
