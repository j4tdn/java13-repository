package ex01;

import java.util.ArrayList;
import java.util.List;

public class StudentUtils {

	private StudentUtils() {
	};

	public static void getAverageScoreOverThan85(Student[] students) {
		System.out.println("The student has average score over than 8.5: ");
		for (Student student : students) {
			if (student.getAverageScore() > 8.5) {
				System.out.println(student);
			}
		}

	}

	public static void getStudentLTOverThanTH(Student[] students) {
		System.out.println("The student has LT score over than TH score: ");
		for (Student student : students) {
			if (student.getLT() > student.getTH()) {
				System.out.println(student);
			}
		}

	}
}
