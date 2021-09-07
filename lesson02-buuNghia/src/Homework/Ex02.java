package Homework;

public class Ex02 {
	public  static void main(String[] args) {
		System.out.print("4!+7!+12!+18!="+(f(4)+f(7)+f(12)+f(18)));
	}
	private static long f(int n) {
		if (n==0||n==1) return 1;
		return n*f(n-1);
	}
}
