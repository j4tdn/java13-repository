package math;

public class Ex01 {
	
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		
		boolean isPos = a > 0 && b > 0;
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		
		float c = 7.49f;
		// commercial round
		int round = Math.round(c);
		double ceil = Math.ceil(round);
		double floor = Math.floor(c);
		
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		System.out.println("Round: " + round);
		System.out.println("Ceil: " + ceil);
		System.out.println("Floor: " + floor);
		
	}
}
