package math;

public class Ex01 {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		boolean isPos = a > 0 && b > 0;
		int min = Math.min(a, b);
		int max = Math.max(a,b);
		
		float c= 7.24358f;
		// comercial round
		Math.round(c);//int round = Math.round(c);
		Math.ceil(c);// int ceil = Math.ceil(c);
		Math.floor(c);//int floor = Math.floor(c);
		System.out.println("min: " + min);
		System.out.println("max : " + max);
		System.out.println("round: " + Math.round(c));
		System.out.println("ceil: " + Math.ceil(c));
		System.out.println("floor : " + Math.floor(c)) ;
	}

}
