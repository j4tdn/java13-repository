package ex01;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println(isPowerOf(9, 3));
	}
	
	public static boolean check(int a, int b){
		double logAB = Math.log(a)/Math.log(b);
		int logABi = (int) (Math.floor(logAB));
		if(logAB-logABi==0)
			return true;
		else
		return false;
	}
	
	public static boolean isPowerOf(int a, int b) {
		if (check(a, b) || check(b, a)) return true;
		return false;
	}
	
}
