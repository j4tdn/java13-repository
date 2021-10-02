package ex3;

public class App {
	public static void main(String[] args) {
		//int a[] = {2, 3};
		//System.out.println(getLeastCommonMutiple(a));
		int a[] = {2, 3, 4};
		System.out.println(getLeastCommonMutiple(a));
	}
	
	public static int getGreatestCommonDivisor(int a, int b) {
		if (b == 0) return a;
		return getGreatestCommonDivisor(b, a % b);
	}
	
	public static int LeastCommonMutiple(int a, int b) {
		return a * b / getGreatestCommonDivisor(a, b);
	}
	
	public static int getLeastCommonMutiple(int[] a) {
		int temp = LeastCommonMutiple(a[0], a[1]);
		for (int i = 2; i < a.length; i++) {
			temp = LeastCommonMutiple(temp, a[i]);
		}
		return temp;
	}
}
