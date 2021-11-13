package ex01;

import java.util.Objects;

public class Student {
	private int id;
	private String name;
	private rankedAcademic rank;
	
	public Student(int id, String name, rankedAcademic rank) {
		Objects.requireNonNull(id, "Sutdent id cannot be null");
		Objects.requireNonNull(name, "Student name cannot be null");
		Objects.requireNonNull(rank, "Student rank cannot be null");
		this.id = id;
		this.name = name;
		this.rank = rank;
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

	public rankedAcademic getRank() {
		return rank;
	}

	public void setRank(rankedAcademic rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Student id=" + id + ", name=" + name + ", rank=" + rank;
	}

	
}
