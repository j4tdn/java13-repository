package ex01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Student std1 = new Student(1, "Hứa Trọng Thưởng", 8.0f, 8.5f);
		Student std2 = new Student(2, "Phạm Huỳnh Văn Đạt", 8.1f, 8.3f);

		System.out.println("Nhập thông tin sinh viên thứ 3: ");
		Student std3 = new Student();
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập ID: ");
		std3.setId(ip.nextInt());
		ip.nextLine();
		System.out.println("Nhập tên sinh viên: ");
		std3.setName(ip.nextLine());
		System.out.println("Nhập điểm lí thuyết: ");
		std3.setPracticePoints(ip.nextFloat());
		System.out.println("Nhập điểm thực hành: ");
		std3.setTheoreticalPoint(ip.nextFloat());

		Student[] students = { std1, std2, std3 };
		System.out.println("Sinh viên có điểm trung bình lớn hơn 8.5: ");
		checkPointMedium(students);
		System.out.println("Sinh viên có điểm lí thuyết lớn hơn điểm thực hành: ");
		checkpoint(students);

	}

	private static void checkPointMedium(Student[] std) {
		for (Student student : std) {
			if (student.MediumScore() > 8.5) {
				System.out.println(student);
			}
		}
	}

	private static void checkpoint(Student[] std) {
		for (Student student : std) {
			if (student.getPracticePoints() < student.getTheoreticalPoint()) {
				System.out.println(student);
			}
		}
	}
}
