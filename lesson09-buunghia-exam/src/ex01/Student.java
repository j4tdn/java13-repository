package ex01;

public class Student {
	enum Grade{
		A,B,C,D,E,F
	}
	int studentCode;
	String studentName;
	Grade studentGrade;
	
	public Student() {
	}

	public Student(int studentCode, String studentName, Grade studentGrade) {
		this.studentCode = studentCode;
		this.studentName = studentName;
		this.studentGrade = studentGrade;
	}

	public int getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(int studentCode) {
		this.studentCode = studentCode;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Grade getStudentGrade() {
		return studentGrade;
	}

	public void setStudentGrade(Grade studentGrade) {
		this.studentGrade = studentGrade;
	}

	@Override
	public String toString() {
		return "Student ["+studentCode+",\""+studentName+"\","+studentGrade+"]";
	}
	
}
