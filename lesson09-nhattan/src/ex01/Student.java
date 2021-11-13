package ex01;

public class Student {
	private int id;
	private String name;
	private Classification clasification;

	public Student() {

	}

	public Student(int id, String name, Classification clasification) {
		this.id = id;
		this.name = name;
		this.clasification = clasification;
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

	public Classification getClasification() {
		return clasification;
	}

	public void setClasification(Classification clasification) {
		this.clasification = clasification;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", clasification=" + clasification + "]";
	}

}
