package bai1;

public class Student {
	private int id;
	private String name;
	private double mark;
	private String gender;
	
	public Student() {
		
	}

	public Student(int id, String name, double mark, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
		this.gender = gender;
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

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mark=" + mark + ", gender=" + gender + "]";
	}
	
}
