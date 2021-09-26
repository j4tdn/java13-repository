package ex01;

public class Student {
	private int id;
	private String name;
	private float theoreticalPoint;
	private float praticePoint;

	public Student() {
	}

	public Student(int id, String name, float theoreticalPoint, float praticePoint) {
		this.id = id;
		this.name = name;
		this.theoreticalPoint = theoreticalPoint;
		this.praticePoint = praticePoint;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getTheoreticalPoint() {
		return theoreticalPoint;
	}

	public void setTheoreticalPoint(float theoreticalPoint) {
		this.theoreticalPoint = theoreticalPoint;
	}

	public float getPraticePoint() {
		return praticePoint;
	}

	public void setPraticePoint(float praticePoint) {
		this.praticePoint = praticePoint;
	}

	public float averagePoint() {
		return (theoreticalPoint + praticePoint) / 2;
	}

	@Override
	public String toString() {
		return id + ", " + name + ", " + theoreticalPoint + ", " + praticePoint + ", " + averagePoint();
	}

}
