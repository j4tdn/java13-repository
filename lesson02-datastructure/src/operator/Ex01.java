package operator;

import bean.Digit;

public class Ex01 {
	public static void main(String[] args) {
		int a = 17;
		
		System.out.println(a--); // a=17 >> a=18
		System.out.println(--a);
		
		if (!isEvenNbr(a)) {
			System.out.println(a + " is odd number");
		}
		
		Integer i1 = new Integer(5);
		Integer i2 = new Integer(5);
		
		System.out.println("i1: " + i1);
		System.out.println("i2: " + i2);
		
		boolean exp = (i1 != i2);
		System.out.println("exp: " + exp);
	}
	
	private static boolean isEvenNbr(int input) {
		return input % 2 == 0;
	}
}