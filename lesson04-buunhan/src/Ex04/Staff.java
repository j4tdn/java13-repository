package Ex04;

import java.time.LocalDate;

public class Staff extends Personnel {
	private String unitName;

	public Staff() {
	}

	public Staff(String name, LocalDate birthday, double coefficientsSalary, String unitName) {
		super(name, birthday, coefficientsSalary);
		this.unitName = unitName;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + unitName + ", " + getSalary();
	}

	@Override
	public double getSalary() {
		return coefficientsSalary * 1250000;
	}
}
