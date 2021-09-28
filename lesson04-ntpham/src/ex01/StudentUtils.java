package ex01;

import java.util.Scanner;

public class StudentUtils {
	private StudentUtils() {
	}
	
	public static float getAveragePoint(Student s) {
		return (s.getPracticePoint() + s.getTheoreticalPoint()) / 2;
	}
	
	public static void getInfoStudent(Student s) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter id: ");
		int id = Integer.parseInt(input.nextLine());
		System.out.print("Enter full name: ");
		String fullName = input.nextLine();
		System.out.print("Enter theoretical point: ");
		float theoreticalPoint = input.nextFloat();
		System.out.print("Enter practice point: ");
		float practicePoint = input.nextFloat();
		input.close();
		
		s.setIdStudent(id);
		s.setFullName(fullName);
		s.setTheoreticalPoint(theoreticalPoint);
		s.setPracticePoint(practicePoint);
	}
	
	public static void AveragePointAbove(Student[] students) {
		System.out.println("List students have average point above 8.5: ");
		for (Student s : students) 	
			if(getAveragePoint(s) > 8.5) System.out.println(s);
	}
	
	public static void theoretialPointAbovePracticePoint(Student[] students) {
		System.out.println("List students have theoretical point above practice point: ");
		for (Student s : students) 
			if (s.getTheoreticalPoint() > s.getPracticePoint())
				System.out.println(s);
	}
}
