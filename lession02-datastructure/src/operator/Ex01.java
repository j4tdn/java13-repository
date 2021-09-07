package operator;

public class Ex01 {
	public static void main(String[] args) {
		int a = 17;
		
		if(!isEvenNbr(a)) {
			System.out.println(a + " odd number");
		}
		
		Integer i1 = new Integer(5);
		Integer i2 = new Integer(5);
		
		
		
	}
	
	private static boolean isEvenNbr(int input) {
		return input % 2 ==0;
	}
}
