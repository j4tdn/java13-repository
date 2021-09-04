package operator;

public class Ex01 {
	
	public static void main(String[] args) {
		
		int a = 17;
		// ++, --, !
		// prefix suffix
		System.out.println(a--); // a= 17 => a = 18
		System.err.println(--a); //
		
		// boolean variable
		// if(variable) <==> if(variable == true)
		// if(!variable) <==> if(variable == false)
		
		// ! : negative
		if(!isEvenNbr(a)) {
			System.out.println("is odd number");
		}
		
		// E.g: == != operator >> compare, calculate value at stack
		Integer i1 = 5;
		Integer i2 = 5;
		
		boolean exp = i1 == i2;
		
		System.out.println("Compare: " + exp);
	}
	
	private static boolean isEvenNbr(int number) {
		return number % 2 == 0;
	}
}
