package ex04;

public class Clerck extends People {
	protected int SlNvQl;
	
	@Override
	public String toString() {
		return ""+name+","+birth+","+HSL+","+SlNvQl;
	}	
	public float luong() {
		return HSL*2200000;
	}
}
