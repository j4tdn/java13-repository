package ex01;

public class App {
	public static void main(String[] args) {
		System.out.println(isPowerOf(4,64));
	}
	public static boolean isPowerOf(int a, int b) {
		for(int i=0;i<=100;i++) {
			if(Math.pow(a, i)==b||Math.pow(b, i)==a) return true;
		}
		return false;
	}
}
