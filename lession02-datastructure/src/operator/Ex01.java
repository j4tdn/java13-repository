package operator;

public class Ex01 {

	public static void main(String[] args) {
		int a = 17;
		a = a + 1;
		System.out.println(a);
		
		if (!isEvenNbr(a)) {
			System.out.println(a + "is odd number");
		}
	}
	private static boolean isEvenNbr(int input) {
		
			return input % 2 == 0;
	}

}
