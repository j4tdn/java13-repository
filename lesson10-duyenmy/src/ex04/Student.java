package ex04;

import java.util.Comparator;

public class Student implements Comparable<Student> {
private int id;
private String name;
private int age;
public Student() {}
public Student(int id, String name, int age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public int compareTo(Student o) {
	int compareAge=((Student)o).getAge();
	return this.age-compareAge;
}
public static Comparator<Student> StudentName=new Comparator<Student>() {
	public int compare(Student st1, Student st2) {
		String stname1=st1.getName().toUpperCase();
		String stname2=st2.getName().toUpperCase();
		return stname1.compareTo(stname2);
	}
};
}
