package lesson02;

public class Ex02 {
	public static void main(String[] args) {
		long sum = factorial(4) + factorial(7) + factorial(12) + factorial(18);
		System.out.println("4! + 7! + 12! + 18! = " + factorial(4) + " + " + factorial(7) + " + " + factorial(12) + " + " + factorial(18)+ " = " +sum);
	}
	public static long factorial(int number) {
		if(number <= 1) {
			return 1;
		}
		else {
			return number*factorial(number-1);
		}
	}
}
