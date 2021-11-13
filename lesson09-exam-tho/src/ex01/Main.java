package ex01;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Student s1 = new Student(102, "Nam", Grade.C.toString());
		Student s2 = new Student(103, "Bảo", Grade.F.toString());
		Student s3 = new Student(104, "Hoàng", Grade.D.toString());
		Student s4 = new Student(105, "Nguyên", Grade.B.toString());
		Student s5 = new Student(107, "Vũ", Grade.F.toString());
		Student s6 = new Student(109, "Lan", Grade.A.toString());
		Student s7 = new Student(202, "Đạt", Grade.C.toString());
		Student s8 = new Student(103, "Bảo", Grade.F.toString());
		Student s9 = new Student(107, "Vũ", Grade.C.toString());
		Student s10 = new Student(104, "Hoàng", Grade.B.toString());
		
		Student allStudents[] = new Student[] {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10};
		
		// Get all students with grade A:
		System.out.println("Student with grade A: ");
		getStudentWithGrade(allStudents, Grade.A.toString());
		
		System.out.println("=======================");
		
		// Get all students which has to learn this course 2 times or more:
		System.out.println("Student has to learn this course 2 times or more: ");
		getStudentHasToLearnAgain(allStudents);
	}
	
	public static Student[] getStudentWithGrade(Student[] studentList, String grade) {
		Student result[] = new Student[studentList.length];
		
		for(int i = 0; i < studentList.length; i++) {
			if(studentList[i].Grade == grade) {
				result[i] = studentList[i];
			}
		}
		
		for(int i = 0; i < result.length; i++) {
			if(result[i] != null) {
				System.out.println(result[i]);
			}
		}
		return result;
	}
	
	public static Student[] getStudentHasToLearnAgain(Student[] studentList) {
		Student result[] = new Student[studentList.length];
		
		for(int i = 0; i < studentList.length; i++) {
			int Id = studentList[i].Id;
			for(int j = 0; j < studentList.length; j++) {
				if((i != j) && (studentList[i].Id == studentList[j].Id)) {
					result[i] = studentList[i];
				}
			}
			
		}
		
		for(int k = 0; k < result.length; k++) {
			if(result[k] != null) {
				System.out.println(result[k]);
			}
		}
		return result;
	}
}
