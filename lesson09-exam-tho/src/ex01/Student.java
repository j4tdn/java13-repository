package ex01;

public class Student {
	public Student(int id, String name, String grade) {
		super();
		Id = id;
		Name = name;
		Grade = grade;
	}

	public int Id;
	
	public String Name;
	
	public String Grade;
	
	@Override
	public String toString() {
		return Id + ", " + Name + ", " + Grade;
	}
}
