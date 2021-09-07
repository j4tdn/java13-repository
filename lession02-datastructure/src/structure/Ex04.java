package structure;

public class Ex04 {
	public static void main(String[] args) {
		int number = 7;
		System.out.println("\nmain");
		printFor(number);
	}
	
	private static void printWhile(int input) {
		int digit = 0;
		while(digit < input) {
			System.out.println(digit + " ");
			digit++;
		}
	}
	
	private static void printFor(int input) {
		for(int digit =0; digit < input ; digit++) {
			System.out.println(digit + "  ");
			
		}
	}
}
