package utils;

import ex01.Student;

public class AppUtils {
	private AppUtils() {
		
	}
	
	public static void print(Student[] students) {
		for (Student student: students) {
			System.out.println(student);
		}
	}
}
