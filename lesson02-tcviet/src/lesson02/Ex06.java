package lesson02;

public class Ex06 {
	public static void main(String[] args) {
		int i = 0;

		int number = 0;
		do {
			number++;
			if (isPrime(number)) {
				i++;
			}
		} while (i < 168);
		System.out.println("So nguyen to thu 200 la: " + number);
	}

	private static boolean isPrime(int number) {
		// So nguyen to la so tu nhien lon hon 1
		if (number == 0 || number == 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
