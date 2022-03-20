package ex04;

import java.util.Objects;

public class Student {
	private String id;
	private String name;
	private Double score;
	private Boolean sex;

	public Student() {
	}

	public Student(String line) {
		String[] elements = line.trim().split(",\\s+");
		if (elements.length == 4) {
			this.id = elements[0];
			this.name = elements[1];
			this.score = Double.parseDouble(elements[2]);
			this.sex = "Nam".equals(elements[3]) ? true : false;
		}

	}

	public Student(String id, String name, Double score, Boolean sex) {
		this.id = id;
		this.name = name;
		this.score = score;
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

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Boolean getSex() {
		return sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + ", sex=" + sex + "]";
	}
	//Phan biet theo ID
	@Override
	public boolean equals(Object obj) {
		if (Objects.isNull(obj)) {
			return false;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student student = (Student) obj;
		return this.getId().equals(student.getId());

	}
}