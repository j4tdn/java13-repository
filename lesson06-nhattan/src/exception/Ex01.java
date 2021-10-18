package exception;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int a = 0, b = 0;
		Scanner ip = new Scanner(System.in);
		
		do {
			try {
				System.out.println("Nhập a: ");
				a = Integer.parseInt(ip.nextLine());
				System.out.println("Nhập b: ");
				b = Integer.parseInt(ip.nextLine());
				System.out.println("Nghiệm: ");
				System.out.println(solutionOfLinearEquation(a, b));
				return;
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (true);
	
	}
	
	private static double solutionOfLinearEquation(int a, int b) {

		if (a == 0) {
			throw new ArithmeticException("--div by zero /0--");
		}

		return (double) -b / a;
	}
}
