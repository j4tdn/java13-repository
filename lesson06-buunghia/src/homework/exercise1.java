package homework;
import java.util.Scanner;
public class exercise1 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("ax + b =0");
		double x= calculate();
		System.out.println("x = "+x);
	}
	public static double  calculate() {
		while(true) {
			try {
				System.out.print("Enter a = ");
				double a=Double.parseDouble(sc.nextLine());
				if (a == 0) throw new ArithmeticException();
				System.out.print("Enter b =");
				double b=Double.parseDouble(sc.nextLine());
				return (- b / a);
			}catch(NumberFormatException e) {
				System.out.println("Please enter a valid number");
			}
			catch(ArithmeticException e) {
				System.out.println("Cannot divide by zero");
			}
		}
	}
}
