package view;

public class Ex02 {
	public static void main(String[] args) {
		int a = 4;
		int b = 7;
		int c = 12;
		int d = 18;
		
		System.out.print(a+"! + "+b+"! + "+c+"! + "+d+"! + "+ "=");
		System.out.println(giaithua(a)+giaithua(b)+giaithua(c)+giaithua(d));
		
	}
	private static long giaithua(int n) {
		long gt = 1;
		for (int i = 1; i <= n; i++) {
			 gt = n*i;
		}
		return gt;
		
	}
}
