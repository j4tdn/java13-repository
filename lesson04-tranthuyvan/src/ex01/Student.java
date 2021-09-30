package ex01;

public class Student {
	private int id;
	private String name;
	private float theoPts; // theoreticalPoints
	private float pracPts; // practicePoints
	
	public Student() {
	}

	public Student(int id, String name, float theoPts, float pracPts) {
		this.id = id;
		this.name = name;
		this.theoPts = theoPts;
		this.pracPts = pracPts;
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

	public float getTheoPts() {
		return theoPts;
	}

	public void setTheoPts(float theoPts) {
		this.theoPts = theoPts;
	}

	public float getPracPts() {
		return pracPts;
	}

	public void setPracPts(float pracPts) {
		this.pracPts = pracPts;
	}
	
	public float avePts() {               // average points
		return (theoPts + pracPts) / 2;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", theoPts=" + theoPts + ", pracPts=" + pracPts + ", avePts=" + avePts() + "]";
	}
}
