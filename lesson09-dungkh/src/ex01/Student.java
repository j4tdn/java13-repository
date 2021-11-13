package ex01;

public class Student {
	private String id;
	private String name;
	private Point level;
	
	public Student() {
	}

	public Student(String id, String name, Point level) {
		this.id = id;
		this.name = name;
		this.level = level;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Point getLevel() {
		return level;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLevel(Point level) {
		this.level = level;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", level=" + level + "]";
	}
	

}
