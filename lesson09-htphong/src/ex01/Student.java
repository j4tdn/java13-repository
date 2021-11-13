package ex01;

public class Student {
	private int idStudent;
	private String name;
	private Graded graded;
	
	public Student() {
		
	}
	public Student(int id, String name, Graded graded) {
		this.idStudent = id;
		this.name = name;
		this.graded = graded;
	}
	public int getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Graded getGraded() {
		return graded;
	}
	public void setGraded(Graded graded) {
		this.graded = graded;
	}
	
	public boolean isGradeA() {
		if(graded == Graded.A) return true;
		return false;
	}
	
	@Override
	public String toString() {

		return idStudent + ", " + name + ", " + graded;
	}
}
