package lesson02;

public class Ex02 {
	public static void main(String[] args) {
		long sum = 0;
		sum = giaiThua(4) + giaiThua(7) + giaiThua(12) + giaiThua(18);
		System.out.println("S: " + sum);
		
	}
	private static long giaiThua(int input) {
		int i = 1;
		long n = 1;
		while(i <= input) {
			n*=i;
			i++;
		}
		return n;
	}
}
