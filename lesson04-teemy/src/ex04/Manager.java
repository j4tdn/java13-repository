package ex04;

public class Manager extends People{
	protected float hesoCV;

	@Override
	public String toString() {
		return ""+name+","+birth+","+HSL+","+hesoCV;
	}
	public float luong() {
		return (HSL+hesoCV)*3000000;
	}
}
