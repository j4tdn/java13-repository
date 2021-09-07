package Homework;

public class Ex06 {
	public static void main(String[] args) {
		int n=0,count=0;
		while(count<200){
			n++;
			if (isPrime(n)) count++;
		}
		System.out.print(n+" is the 200th prime number.");
	}
	private static boolean isPrime(int n) {
		if (n==0||n==1) return false;
		for (int i=2;i<=n/2;i++) {
			if (n%i==0) return false;
		}
		return true;
	}
}
