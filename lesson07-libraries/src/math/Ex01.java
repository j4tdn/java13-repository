package math;

public class Ex01 {
	public static void main(String[] args) {
		int a = 8;
		int b = 10;
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		boolean isPos = a > 0 && b > 0;
		float c = 7.49f;
		int round = Math.round(c);
		double ceil = Math.ceil(c);
		double floor = Math.floor(c);

		System.out.println("min: " + min);
		System.out.println("max: " + max);
		System.out.println("round: " + round);
		System.out.println("ceil: " + ceil);
		System.out.println("floor: " + floor);

	}
}
