package ex01;

public class Student {
	private String name;
	private int id;
	private float LTPoint;
	private float THPoint;
	
	public Student() {
	}
	
	public Student(String name, int id, float lTPoint, float tHPoint) {
		this.name = name;
		this.id = id;
		LTPoint = lTPoint;
		THPoint = tHPoint;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getLTPoint() {
		return LTPoint;
	}

	public void setLTPoint(float lTPoint) {
		LTPoint = lTPoint;
	}

	public float getTHPoint() {
		return THPoint;
	}

	public void setTHPoint(float tHPoint) { 
		THPoint = tHPoint;
	}
	
	public float average() {
		return (this.LTPoint + this.THPoint)/2;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", LTPoint=" + LTPoint + ", THPoint=" + THPoint + "]";
	}
	
	
}
