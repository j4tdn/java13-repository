package math;

public class Ex01 {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		
		boolean isPos = a > 0 && b > 0;
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		
		float c = 7.5f;
		//commercial round
		int round = Math.round(c);
		double ceil = Math.ceil(c);
		double floor = Math.floor(c);
		
		System.out.println("min: " + min);
		System.out.println("max: " + max);
		System.out.println("round: " + round); // từ .5 thì làm tròn trên, ngược lại
		System.out.println("ceil: " + ceil);// làm tròn trên
		System.out.println("floor: " + floor);// làm tròn dưới
		
	}
}
