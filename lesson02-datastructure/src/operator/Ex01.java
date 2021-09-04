package operator;

public class Ex01 {
	public static void main(String[] args) {
		int a = 17;
		// ++ -- !
		// prefix suffix
		System.out.println(a--); // a = 17 >> a = 18;
		System.out.println(--a);
		
		// !: negative
		if(!isEvenNbr(a)) {
			System.out.println(a + " is a odd number");
		}
		
		// E.g: == != operator >> compare, calculate value at stack
		Integer i1 =5;
		Integer i2 = 5;
		boolean exp = (i1 == i2);
		System.out.println("Exp: " + exp);
	}
	
	private static boolean isEvenNbr(int input) {
		return input % 2 == 0;
	}
}
