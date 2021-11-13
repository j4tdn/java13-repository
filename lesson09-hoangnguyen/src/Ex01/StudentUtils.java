package Ex01;

public class StudentUtils {

	public static Student[] getStudentsGradeA(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;
		for (Student student : students) {
			if (student.getClassification().equals(ClassificationEnum.A)) {
				result[count] = student;
				count++;
			}
		}

		return result;
	}

	public static Student[] getStudentLearnAgain(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;
		for (int i = 0; i < students.length; i++) {
			for (int j = i + 1; j < students.length; j++) {
				if (students[i].getId() == students[j].getId()) {
					result[count] = students[i];
					count++;
				}
			}
		}

		return result;
	}
}
