
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = Integer.parseInt(ip.nextLine());
		int count = 0;
		int i = 1;
		while (count != n) {
			i++;
			if (isPrime(i)) {
				count++;
			}
		}
		System.out.println("so nguyen to " + n + ": " + i);

	}

	private static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		if (n % 2 == 0) {
			return false;
		}

		for (int i = 3; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}