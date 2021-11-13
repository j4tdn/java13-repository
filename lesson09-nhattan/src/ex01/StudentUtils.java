package ex01;

public class StudentUtils {
	private StudentUtils() {

	}

	public static Student[] getStudentsA(Student[] students) {
		Student[] studentsA = new Student[students.length];
		int index = -1;

		for (int i = 0; i < students.length; i++) {
			if (students[i].getClasification().equals(Classification.A)) {
				index++;
				studentsA[index] = students[i];
			}
		}

		Student[] temp = new Student[index + 1];
		System.arraycopy(studentsA, 0, temp, 0, index + 1);
		return temp;
	}

//	public static Student[] getStudentsAgain(Student[] students) {
//		Student[] stdAgain = new Student[students.length];
//		int index = -1;
//		
//		for (int i = 0; i < students.length - 1; i++) {
//			for (int j = i + 1; j < students.length; j++) {
//				if(students[i].getId() == students[i].getId()) {
//					index++;
//					stdAgain[index] = students[i];
//				}
//			}
//		}
//		
//		Student[] temp = new Student[index + 1];
//		System.arraycopy(stdAgain, 0, temp, 0, index + 1);
//		return temp;
//	}
}
