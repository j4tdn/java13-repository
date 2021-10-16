package math;

public class Ex01 {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		
		float c = 7.58f;
		// commercial round
		int round = Math.round(c);
		System.out.println("Round: " + round);
		double ceil = Math.ceil(c); // lam tron len
		double floor = Math.floor(c); // lam tron duoi
		System.out.println("Ceil: " + ceil);
		System.out.println("floor: " + floor);
	}
}
