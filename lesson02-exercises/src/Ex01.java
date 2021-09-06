import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int number = Integer.parseInt(ip.nextLine());
		boolean result = isPowerOfTwo(number);
		if (result == true) {
			System.out.println(number + ": number is power of two");
		} else {
			System.out.println(number + ": number is not power of two");
		}
	}

	private static boolean isPowerOfTwo(int a) {
		if (a < 1) {
			return false;
		}
		if (a == 1) {
			return true;
		}
		if (a % 2 == 1) {
			return false;
		}

		return isPowerOfTwo(a / 2);

	}
}
