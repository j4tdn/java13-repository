package Ex01;

/**
 * Bài 1: Viết chương trình OOP quản lý sinh viên đơn giản: Nhập xuất thông tin,
 * tính điểm trung bình
 */

import java.util.Scanner;

public class StudentManagement {
	public static void main(String[] args) {
		Student student1 = new Student(10517892, "Nguyễn Thị Tú Anh", 8, 9);
		Student student2 = new Student(15084746, "Nguyễn Thị Anh Thư", 9, 10);
		Student student3 = new Student();
		Student3(student3);
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println("=================================================");
		
		Student[] students = { student1,student2,student3 };
		averageScoreBig(students);
		averageScoreCompare(students);
	}
	public static void Student3(Student student) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập MSSV: ");
		student.setStudentCode(ip.nextInt());
		ip.nextLine();
		System.out.println("Nhập họ và tên: ");
		student.setFullName(ip.nextLine());
		System.out.println("Nhập điểm lý thuyết: ");
		student.setTheoreticalScore(ip.nextFloat());
		System.out.println("Nhập điểm thực hành: ");
		student.setPracticeScore(ip.nextFloat());
		ip.close();
	}
	
	public static void averageScoreBig(Student[] students) {
		// Score have Average > 8.5
		System.out.println("Sinh viên có số điểm trung bình lớn hơn 8.5 là: ");
		for(Student student:students) {
			if(student.averageScore() > 8.5)
				System.out.println(student);
		}
	}
	
	public static void averageScoreCompare(Student[] students) {
		System.out.println("=================================================");
		System.out.println("Sinh viên có số điểm LT lớn hơn điểm TH là: ");
		for(Student student:students) {
			if(student.getTheoreticalScore() > student.getPracticeScore())
				System.out.println(student);
		}
	}
}