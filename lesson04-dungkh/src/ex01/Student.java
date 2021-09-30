package ex01;

public class Student {
	
	private int id;
	private String fullName;
	private float theoreticalScore;
	private float practiceScore;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String fullName, float theoreticalScore, float practiceScore) {
		this.id = id;
		this.fullName = fullName;
		this.theoreticalScore = theoreticalScore;
		this.practiceScore = practiceScore;
	}

	public int getId() {
		return id;
	}

	public String getFullName() {
		return fullName;
	}

	public float getTheoreticalScore() {
		return theoreticalScore;
	}

	public float getPracticeScore() {
		return practiceScore;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setTheoreticalScore(float theoreticalScore) {
		this.theoreticalScore = theoreticalScore;
	}

	public void setPracticeScore(float practiceScore) {
		this.practiceScore = practiceScore;
	}
	public float Avg() {
		return (theoreticalScore + practiceScore)/2;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fullName=" + fullName + ", theoreticalScore=" + theoreticalScore
				+ ", practiceScore=" + practiceScore + ", Avg()=" + Avg() + "]";
	}
}

