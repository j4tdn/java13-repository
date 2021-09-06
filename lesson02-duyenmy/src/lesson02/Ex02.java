package lesson02;

public class Ex02 {
	public static void main(String[] args) {
		long s= sum(4)+sum(7)+sum(12)+sum(18);
		System.out.println("Tong S ="+s);
	}
	public static long sum(int n) {
		long sum =1;
		for (int i=2; i<=n;i++) {
			sum*=i;
		}
		return sum;
		
	}
}
