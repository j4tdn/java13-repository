import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = Integer.parseInt(ip.nextLine());
		int n = Integer.parseInt(ip.nextLine());

		String result = convert(number, n);
		printResult(result);
	}

	private static String convert(int number, int n) {
		String result = " ";
		int x = 0;
		while (number > 0) {
			x = number % n;
			number = number / n;
			result += x;
		}
		return result;
	}

	private static void printResult(String a) {
		for (int i = 0; i < a.length(); i++) {
			System.out.print(a.charAt(a.length() - 1 - i));
		}
	}

}
