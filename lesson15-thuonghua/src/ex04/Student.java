package ex04;

import java.util.Objects;

public class Student {
	private int id;
	private String name;
	private Double score;
	private String sex;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, Double score, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
		this.sex = sex;
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

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + ", sex=" + sex + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student that = (Student) obj;
		return getId() == that.getId();
	}
}
	

