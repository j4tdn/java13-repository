package ex01;

public class Student {
	private int id;
	private String fullName;
	private float lecPoint;
	private float labPoint;
	public Student() {
	}
	
	public Student(int id, String fullName, float lecPoint, float labPoint) {
		this.id = id;
		this.fullName = fullName;
		this.lecPoint = lecPoint;
		this.labPoint = labPoint;
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
	
	
	public float getLecPoint() {
		return lecPoint;
	}

	public void setLecPoint(float lecPoint) {
		this.lecPoint = lecPoint;
	}

	public float getLabPoint() {
		return labPoint;
	}

	public void setLabPoint(float labPoint) {
		this.labPoint = labPoint;
	}

	@Override
	public String toString() {
		return  id + " " + fullName + " " + lecPoint
				+ " " + labPoint;
	}
	
	
	
	
}
