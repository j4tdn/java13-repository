package ex01;

import java.util.Scanner;

public class StudentUtils {
	
	private StudentUtils() {
		
	}
	
	public static Student inputStudent() {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		
		System.out.println("Input student info: ");
		System.out.print("id: ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.print("name: ");
		String name = sc.nextLine();
		System.out.print("Theoretical point: ");
		float theoroticalPoint = sc.nextFloat();
		System.out.print("Practice point: ");
		float practicePoint = sc.nextFloat();
		
		student.setId(id);
		student.setName(name);
		student.setTheoreticalPoint(theoroticalPoint);
		student.setPraticePoint(practicePoint);
		sc.close();
		return student;
	
	}
	public static void showAllStudents(Student[] students) {
		for(Student st : students) {
			System.out.println(st);
		}
	}
	
	public static void averagePointAboveNumber(Student[] students, float number) {
		for(Student st: students) {
			if(st.averagePoint() > number) {
				System.out.println(st);
			}
		}
	}
	
	public static void theoreticalAbovepracticePoint(Student[] students) {
		for(Student st: students) {
			if(st.getTheoreticalPoint() > st.getPraticePoint()) {
				System.out.println(st);
			}
		}
	}
}
