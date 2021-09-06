package homework;

public class Ex06 {
	public static void main(String[] args) {
		int i = 0,ans = 0, k = 2;
		while(i < 200) {
			if(isprime(k)) {
				ans = k;
				i++;
//				System.out.print(k +" ");
			}
			k++;
		}
		System.out.println("200th prime number: " + ans);
	}
	private static boolean isprime(int n) {
		for(int i = 2; i <= Math.sqrt(n); i++ ) {
			if(n % i == 0) return false;
		}
		return n > 1;
	}
}
