package structure;

public class Ex04 {

	public static void main(String[] args) {
		// Printout values less than 7 >> [0,6]
		int n = 7;
		
		System.out.println("====== PRINT FOR ======");
		printFor(n);
		System.out.println("====== PRINT WHILE ======");
		printWhile(n);
		System.out.println("====== PRINT DO WHILE ======");
		printDoWhile(n);
		System.out.println("Main");
	}
	
	private static void printFor(int input) {
		
		for(int i = 0; i < input; i++) {
			if(i == input - 1) {
				System.out.println(i + " ");
			} else {
				System.out.print(i + " ");
			}
		}
	}
	
	private static void printWhile(int input) {
		// expression
		int i = 0;
		
		while(true) {
			
			//Stop condition
			if(i == input) {
				break;
			}
			if( i == input - 1) {
				System.out.println(i + " ");
			}else {
				System.out.print(i + " ");
			}
			i++;
		}
	}
	
	private static void printDoWhile(int input) {
		int i = 0;
		do {
			if( i == input - 1) {
				System.out.println(i + " ");
			}else {
				System.out.print(i + " ");
			}
			i++;
		} while(i < input);
	}

}
