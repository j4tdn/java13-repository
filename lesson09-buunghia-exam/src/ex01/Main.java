package ex01;
import java.util.ArrayList;

import ex01.Student.Grade;

public class Main {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(102,"Nam",Grade.C));
		students.add(new Student(103,"Bảo",Grade.F));
		students.add(new Student(104,"Hoàng",Grade.D));
		students.add(new Student(105, "Nguyên",Grade.B));
		students.add(new Student(107, "Vũ",Grade.F));
		students.add(new Student(109, "Lan",Grade.A));
		students.add(new Student(202, "Đạt",Grade.C));
		students.add(new Student(103, "Bảo",Grade.F));
		students.add(new Student(107, "Vũ",Grade.C));
		students.add(new Student(104, "Hoàng",Grade.A));
		ArrayList<Student> gradeA = findStudentByGrade(students,Grade.A);
		for (Student student :gradeA) {
			System.out.println(student.toString());
		}
	}
	public static ArrayList<Student> findStudentByGrade(ArrayList<Student> students,Grade grade){
		ArrayList<Student> list = new ArrayList<>();
		for (Student student : students) {
			if(student.getStudentGrade() == grade) 
				list.add(student);
		}
		return list;
	}
	
}
