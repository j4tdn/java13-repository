package ex04;



public class Student {
	private String id;
	private String name;
	private double scores;
	private String sex;
	
	public Student() {
		
	}

	public Student(String id, String name, double scores, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.scores = scores;
		this.sex = sex;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScores() {
		return scores;
	}

	public void setScores(double scores) {
		this.scores = scores;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", scores=" + scores + ", sex=" + sex + "]";
	}
	
}
