package ex04;

public class Person {
	String name;
	String birthday;
	Double hsluong;
	public Person() {};
	public Person(String name, String birthday, Double hsluong) {
		this.name = name;
		this.birthday = birthday;
		this.hsluong = hsluong;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public Double getHsluong() {
		return hsluong;
	}
	public void setHsluong(Double hsluong) {
		this.hsluong = hsluong;
	}
	@Override
	public String toString() {
		return String.format("%-15s%-15s%-15.2f",name,birthday,hsluong );
	}
	
}
