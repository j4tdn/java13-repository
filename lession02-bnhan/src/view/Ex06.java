package view;

public class Ex06 {
	public static void main(String[] args) {
		int i = 0 , a = 0 ;
		int b = 2 ;
		while ( i < 200) {
			if(isPrime(b)) {
				a = b;
				
				i++;
			}
			b++;
		}
		System.out.println("So nguyen to thu 200: " + a);
	}
	public static boolean isPrime(int n) {
		if (n<2) return false;
		if (n == 2) return true;
		for (int i = 2; i < n ; i++) {
			if (n % i == 0) {
				return false;
			}
			
		}
		return true;
	}
}
