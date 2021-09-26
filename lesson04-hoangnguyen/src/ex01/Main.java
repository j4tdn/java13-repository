package ex01;

import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student sv1 = new Student(1, "Nguyễn Hoàng Nguyên", 5.0f, 8.0f);
		Student sv2 = new Student(1, "Vũ Việt Anh", 9.5f, 9.0f);
		Student sv3 = new Student();
		
		System.out.print("Input id: ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.print("Input full name: ");
		String fullName = sc.nextLine();
		System.out.print("Input LT score: ");
		float lT = Float.parseFloat(sc.nextLine());
		System.out.print("Input TH score: ");
		float tH = Float.parseFloat(sc.nextLine());
		
		sv3.setId(id);
		sv3.setFullName(fullName);
		sv3.setLT(lT);
		sv3.setTH(tH);
		
		Student[] students = {sv1, sv2, sv3};
		
		StudentUtils.getAverageScoreOverThan85(students);
		System.out.println("===============================================");
		StudentUtils.getStudentLTOverThanTH(students);
	}
}
