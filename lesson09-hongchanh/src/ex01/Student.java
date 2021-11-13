package ex01;

public class Student {
	private int id;
	private String name;
	private Mark mark;
	
	public Student() {
	}
	
	public Student(int id, String name , Mark mark) {
		this.id = id; 
		this.name = name ;
		this.mark = mark;
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

	public Mark getMark() {
		return mark;
	}

	public void setMark(Mark mark) {
		this.mark = mark;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+ id + " " + name + " " + mark ;
	}
}
