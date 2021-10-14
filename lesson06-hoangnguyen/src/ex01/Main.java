package ex01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		String isContinue = "Y";
		do {
			try {
				System.out.print("Input A: ");
				a = Integer.parseInt(sc.nextLine());
				System.out.print("Input B: ");
				b = Integer.parseInt(sc.nextLine());

				System.out.println(a + "x" + " + " + b + " = " + firstDegreeEquation(a, b));
			} catch (NumberFormatException e) {
				System.out.println("Input must be a number");

			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());

			} finally {
				System.out.println("Do yoy want try again? [Y/N]");
				isContinue = sc.nextLine();
			}
		} while ("Y".equalsIgnoreCase(isContinue));

	}

	private static float firstDegreeEquation(int a, int b) {
		if (a == 0) {
			throw new ArithmeticException("A must be a number different 0");
		}

		return -b / a;
	}

}
