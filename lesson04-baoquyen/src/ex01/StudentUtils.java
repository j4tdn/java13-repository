package ex01;

import java.util.Scanner;

public class StudentUtils {
	static Students inputInfor() {
			Students sv = new Students();
			Scanner ip = new Scanner(System.in);
			System.out.print("Enter Student's ID: ");
			sv.setId(Integer.parseInt(ip.nextLine()));
			System.out.print("Enter Student's name: ");
			sv.setName(ip.nextLine());
			System.out.print("Enter Student's theoryPoint: ");
			sv.setTheoryPoint(ip.nextFloat());
			System.out.print("Enter Student's practicePoint: ");
			sv.setPracticePoint(ip.nextFloat());
			return sv;
		}
	static void avgPointOver85(Students [] sv) {
		
		System.out.println("List of students who have AVGpoint over 8.5:");
		for(Students student:sv) {
			if(student.avgPoint() > 8.5) {
				System.out.println(student);
			}
		}
	}
	static void theoryIsBetterThanPractice(Students [] sv) {
		System.out.println("List of students who have theory point over practice point:");
		for(Students student:sv) {
			if(student.getTheoryPoint() > student.getPracticePoint()){
				System.out.println(student);
			}
		}
	}
	
}
