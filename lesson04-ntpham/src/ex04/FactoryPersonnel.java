package ex04;

import java.time.LocalDate;

public class FactoryPersonnel {
	public static Personnel CreateStaff(String fullName, LocalDate birthDay, double coefficientsSalary, String nameOfWorkUnit) {
		return new Staff(fullName, birthDay, coefficientsSalary, nameOfWorkUnit);
	}
	
	public static Personnel CreateManager(String fullName, LocalDate birthDay, double coefficientsSalary, int numberOfStaff) {
		return new Manager(fullName, birthDay, coefficientsSalary, numberOfStaff);
	}
	
	public static Personnel CreateDirector(String fullName, LocalDate birthDay, double coefficientsSalary, float jobCoefficients) {
		return new Director(fullName, birthDay, coefficientsSalary, jobCoefficients);
	}
}
