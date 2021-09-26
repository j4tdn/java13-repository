package ex04;

public class Employee extends People {
	protected String nameDV;

	@Override
	public String toString() {
		return ""+name+","+birth+","+HSL+","+nameDV;
	}
	public float luong() {
		return HSL*1250000;
	}
}
