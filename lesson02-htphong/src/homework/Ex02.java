package homework;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("4! + 7! + 12! + 18! = "+ sumFactorial(4, 7, 12, 18));
	}
	public static long factorial(int a) {
		long S=1;
		for(int i=1;i<=a;i++) {
			S*=i;
		}
		return S;
	}
	public static long sumFactorial(int a, int b, int c, int d) {
		long S=0;
		S=factorial(a) + factorial(b) + factorial(c) + factorial(d);
		return S;
	}
}
