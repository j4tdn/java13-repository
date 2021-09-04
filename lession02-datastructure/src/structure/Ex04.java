package structure;

public class Ex04 {
	public static void main(String[] args) {
		
		int number = 7;
		
		System.out.println("===PRINT FOR====");
		printFor(number);
		
		System.out.println("\n====PRINT WHILE===");
		printWhile(number);
		
		System.out.println("\n====PRINT DO WHILE===");
		printDoWhile(number);
		
	}
	private static void printDoWhile(int input) {
		int digit = 0;
		
		do {
			System.out.print(digit + " ");
			digit++;
		}while(digit < input);
		
	}
	
	private static void printWhile(int input) {
		int digit = 0;
//		while(digit < input) {
//			System.out.print(digit + " ");
//			digit++;
//		}
		while(true) {
			//Stop condition
			if(digit == input) {
				break;
			}
			System.out.print(digit + " ");
			digit++;
		}

	}
	
	private static void printFor(int input) {
		
		for(int digit = 0; digit < input;digit++) {
			System.out.print(digit + " ");
			
		}

	}

}
