package ex01;

import java.util.Scanner;

/**
 * Viết chương trình OOP quản lý sinh viên
 * + Nhập xuất thông tin 
 * + Tính điểm trung bình 
 */

public class App {
	public static void main(String[] args) {
		Student sv1 = new Student(1, "Tran Thuy Van", 8.5f, 9.5f);
		Student sv2 = new Student(2, "Le Ngoc Quynh Nhu", 9.0f, 9.8f);
		
		Student sv3 = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your ID: ");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter your theoretical point: ");
		float theoPts = sc.nextFloat();
		
		System.out.println("Enter your practice point: ");
		float pracPts = sc.nextFloat();
		
		sv3.setId(id);
		sv3.setName(name);
		sv3.setTheoPts(theoPts);
		sv3.setPracPts(pracPts);
		
		Student[] students = {sv1, sv2, sv3};
		
		StudentUtils.getAveragePointMoreThan85(students);
		System.out.println("==========================");
		StudentUtils.theoPtsMoreThanPracPts(students);
	}
}
