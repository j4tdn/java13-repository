package ex04;

import java.util.Objects;

public class Student {
	private String id;
	private String name;
	private double scores; // *score
	private String sex; // should be boolean or enum
	
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
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof Student)) {
			return false;
		}
		Student that = (Student)o;
		return getId() == that.getId()
				&& getName() == that.getName()
				&& getScores() == that.getScores()
				&& getSex() == that.getSex();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getScores(), getSex());
	}
}
