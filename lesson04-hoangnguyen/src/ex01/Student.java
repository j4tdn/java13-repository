package ex01;

public class Student {
	private int id;
	private String fullName;
	private float LT;
	private float TH;
	
	public Student() {
	
	}

	public Student(int id, String fullName, float lT, float tH) {
		super();
		this.id = id;
		this.fullName = fullName;
		LT = lT;
		TH = tH;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public float getLT() {
		return LT;
	}

	public void setLT(float lT) {
		LT = lT;
	}

	public float getTH() {
		return TH;
	}

	public void setTH(float tH) {
		TH = tH;
	}
	
	public float getAverageScore() {
		return (getLT() + getTH()) / 2;
	}
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", fullName=" + fullName + ", LT=" + LT + ", TH=" + TH + "]";
	}
	
	
}
