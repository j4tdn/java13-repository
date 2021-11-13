package ex01;

public class Student {
	private int id;
	private String name;
	private Type classification;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, Type classification) {
		super();
		this.id = id;
		this.name = name;
		this.classification = classification;
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

	public Type getClassification() {
		return classification;
	}

	public void setClassification(Type classification) {
		this.classification = classification;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", classification=" + classification + "]";
	}
	
	
}
