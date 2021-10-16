package math;

public class Ex01 {
	public static void main(String[] args) {
		int a = 5, b = 10;
		boolean isPos = a > 0 && b> 0;
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		
		float c = 7.5f;
		
		// commercial round
		int round = Math.round(c);
		double ceil = Math.ceil(c);
		double floor = Math.floor(c);
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		System.out.println("Round: " + round);
		System.out.println("ceil: " + ceil);
		System.out.println("floor: " + floor);
	}

}
