package Ex01;

public class Student {
	private int StudentCode;
	private String FullName;
	private float TheoreticalScore;
	private float PracticeScore;
	
	public Student() {
		
	}
	
	public Student(int studentCode, String fullName, float theoreticalScore, float practiceScore) {
		StudentCode = studentCode;
		FullName = fullName;
		TheoreticalScore = theoreticalScore;
		PracticeScore = practiceScore;
	}

	public int getStudentCode() {
		return StudentCode;
	}

	public void setStudentCode(int studentCode) {
		StudentCode = studentCode;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public float getTheoreticalScore() {
		return TheoreticalScore;
	}

	public void setTheoreticalScore(float theoreticalScore) {
		TheoreticalScore = theoreticalScore;
	}

	public float getPracticeScore() {
		return PracticeScore;
	}

	public void setPracticeScore(float practiceScore) {
		PracticeScore = practiceScore;
	}
	
	public float averageScore() {
		return (TheoreticalScore + PracticeScore)/2;
	}

	@Override
	public String toString() {
		return "Student [StudentCode = " + StudentCode + ", FullName = " + FullName + ", TheoreticalScore = "
				+ TheoreticalScore + ", PracticeScore = " + PracticeScore + ", averageScore = " + averageScore() + "]";
	}
	
	
}
