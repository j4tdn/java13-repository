package ex01;

import java.util.Objects;

public class StudentUtils {
	private StudentUtils() {
		
	}
	
	public static Student[] intialListStudents() {
		Student[] students =  new Student[10];
		students[0] = new Student(102, "Nam", rankedAcademic.A);
		students[1] = new Student(103, "Bao", rankedAcademic.F);
		students[2] = new Student(104, "Hoang", rankedAcademic.D);
		students[3] = new Student(105, "Nguyen", rankedAcademic.B);
		students[4] = new Student(107, "Vu", rankedAcademic.F);
		students[5] = new Student(109, "Lan", rankedAcademic.A);
		students[6] = new Student(202, "Dat", rankedAcademic.C);				
		students[7] = new Student(103, "Bao", rankedAcademic.F);				
		students[8] = new Student(107, "Vu", rankedAcademic.C);			
		students[9] = new Student(104, "Hoang", rankedAcademic.B);
		return students;
	}
	
	public static Student[] getListStudentsHaveRankedA(Student[] students) {
		Objects.requireNonNull(students, "Array student cannot be null");
		Student[] result = new Student[students.length];
		int i = 0;
		for (Student s : students) {
			if(isHaveRankedA(s)) {
				result[i++] = s;		
			}
		}
		return result;
	}
	
	public static Student[] getListStudentsStudyAgain(Student[] students) {
		Objects.requireNonNull(students, "Array student cannot be null");
		Student[] result = new Student[students.length];
		int i = 0;
		for (Student s : students) {
			if(isHaveStudiedAgain(students, s)) {
				result[i++] = s;		
			}
		}
		return result;
	}
	
	public static void showListStudents(Student[] students) {
		Objects.requireNonNull(students, "Array student cannot be null");
		for (Student s : students) {
			if (s != null)
				System.out.println(s);
		}
	}
	
	private static boolean isHaveRankedA(Student s) {
		Objects.requireNonNull(s, "Student cannot be null");
		return s.getRank() == rankedAcademic.A;
	}
	
	private static boolean isHaveStudiedAgain(Student[] students, Student st) {
		int count = 0;
		for (Student s : students) {
			if(s.getId() == st.getId()) {
				count++;		
			}
		}
		return count > 1;
	}
	
	
}
