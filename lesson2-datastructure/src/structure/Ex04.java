package structure;

public class Ex04 {
	public static void main(String[] args) {
		//print out values less than 7 (0 -> 6)
		// option 1: for statement
		int number = 7;
		printFor(number);
		System.out.println("=======");
		printWhile(number);
		System.out.println("==========");
		printDoWhile(number);
		System.out.println("=========");
	}
	private static void printFor(int value) {
		for(int i = 0; i< value ; i++) {
			System.out.print(i + " ");
		}
	}
	private static void printWhile(int input) {
		int i = 0;
		while(i < input) {
			System.out.print(i+ " ");
			i++;
		}
	}
	private static void printDoWhile(int input) {
		int i = 0;
		do {
			System.out.print(i + " ");
			i++;
		}while( i < input );
	}
}
