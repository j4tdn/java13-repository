package operator;

public class Ex01 {
	public static void main(String[] args) {
		int a = 17;
		//++, -- !
		System.out.println(a--);
		System.out.println(--a);
		
		
		//! : phủ định
		//boolean variable
		//if(variable) <==> if(variable == true)
		//if(!variable) <==> if(variable == false)
		
		if (!isEvenNbs(a)) {
			System.out.println(a + " is old number");
		}
		
		//e.g == ! = operator >> compare, calculate value at stack
		Integer i1 = 5;
		Integer i2 = 5;
		boolean exp = (i1==i2);
		System.out.println("exp: " + exp);
		
	}
	private static boolean isEvenNbs(int input) {
		return input % 2 == 0;
	}
}
