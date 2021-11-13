package ex01;

public class Student {
	private int id;
	private String name;
	private Academic academic;

	public Student() {
	}

	public Student(int id, String name, Academic academic) {
		this.id = id;
		this.name = name;
		this.academic = academic;
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

	public Academic getAcademic() {
		return academic;
	}

	public void setAcademic(Academic academic) {
		this.academic = academic;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", academic=" + academic + "]";
	}
}
