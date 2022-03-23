package ex04.bean;

import java.util.Objects;

public class Student {
	private int id;
	private String name;
	private double scores; // *score
	private String sex; // should be boolean

	public Student() {

	}

	public Student(String lines) {
		String[] elements = lines.split(",\\s");// 102130174, Le Na, 7.8, Nu

		if (elements.length == 4) {
			id = Integer.parseInt(elements[0]);
			name = elements[1];
			scores = Double.parseDouble(elements[2]);
			sex = elements[3];
		}
	}

	public Student(int id, String name, double scores, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.scores = scores;
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
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		
		Student student = (Student)obj;
		if(!(this instanceof Student)) {
			return false;
		}
		
		return id == student.getId(); 
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", scores=" + scores + ", sex=" + sex + "]\n";
	}

}
