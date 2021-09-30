package ex01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Student student1 = new Student(1, "Hoang Dung", 10,8 );
		Student student2 = new Student(2, "Xuan Chau", 8, 10);
		
		Student student3 = new Student();
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter MSSV: ");
		student3.setId(ip.nextInt());
		ip.nextLine();
		System.out.print("Enter full name: ");
		student3.setFullName(ip.nextLine());
		System.out.print("Enter LT score: ");
		student3.setTheoreticalScore(ip.nextFloat());
		System.out.print("Enter TH score: ");
		student3.setPracticeScore(ip.nextFloat());
	
		Student[] students = { student1,student2,student3 };
		System.out.println("==============");
		AvarageGood(students);
		System.out.println("==============");
		HigherTheoreticalScore(students);
	
	}
	public static void AvarageGood(Student[] students) {
		System.out.println("Student with average score > 8.5 is: ");
		for(Student student:students) {
			if(student.Avg() > 8.5)
				System.out.println(student);
		}
	}
	
	public static void HigherTheoreticalScore(Student[] students) {
		System.out.println("Student with higher Theoretical Score is : ");
		for(Student student:students) {
			if(student.getTheoreticalScore() > student.getPracticeScore())
				System.out.println(student);
		}
	}

}
