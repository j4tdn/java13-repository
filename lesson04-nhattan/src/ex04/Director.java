package ex04;

import java.util.Scanner;

public class Director extends Member{
	public static int basicPay = 3000000;
	
	private double coefficientsResponsibility;
	
	public Director() {
		super();
	}

	public Director(double coefficientsResponsibility) {
		super();
		this.coefficientsResponsibility = coefficientsResponsibility;
	}

	public double getCoefficientsResponsibility() {
		return coefficientsResponsibility;
	}

	public void setCoefficientsResponsibility(double coefficientsResponsibility) {
		this.coefficientsResponsibility = coefficientsResponsibility;
	}

	@Override
	public double pay() {
		return (coefficientsSalary + this.coefficientsResponsibility) * basicPay;
	}
	
	@Override
	public void enterInfo() {
		System.out.print("\n-----Giám đốc-----.\n");
		super.enterInfo();
		System.out.println("Nhập hệ số chức vụ: ");
		this.coefficientsResponsibility = new Scanner(System.in).nextDouble();
	}
	
	@Override
	public String toString() {
		return super.toString() + "   Giám đốc";
	}
	
}
