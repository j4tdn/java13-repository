package ex01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		while (true) {
			try {
				System.out.print("Enter a = ");
				a = Integer.parseInt(sc.nextLine());
				System.out.print("Enter b = ");
				b = Integer.parseInt(sc.nextLine());
				System.out.print(a + "x + " + b +" = 0"+" => x = " + divide(a, b));
				break;
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
		}

	}

	private static double divide(double a, double b) throws ArithmeticException {
		if (a == 0) {
			throw new ArithmeticException("Devide by 0");
		}
		return -b / a;
	}


}
