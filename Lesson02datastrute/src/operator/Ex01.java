package operator;

public class Ex01 {
	public static void main(String[] args) {
		int a = 17;
		// ++ -- !
		System.out.println(a--);
		System.out.println(--a);
		// !: negative
	
		if (!isEvenNbr(a)) {
			System.out.println(a + " is odd number");
		}
		
		// E.g: == != operator >> compare, calculate value at stack
		Integer i1 = 5;
		Integer i2 = 5;
		System.out.println("i1: " + i1);
		System.out.println("i2: " + i2);
		
		boolean exp = (i1 == i2);
		System.out.println("exp: " + exp);
	}
	private static boolean isEvenNbr(int input) {
		return input % 2 == 0;
	}
}
