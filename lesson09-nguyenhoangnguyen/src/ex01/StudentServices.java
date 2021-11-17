package ex01;

import java.util.Arrays;

public class StudentServices {

	// Tìm dánh sách sinh viên từng đạt loại A trong năm 2021
	public Student[] getStudents(Student[] students, Rank rank) {
		// Array definition: Fixed Size
		Student[] result = new Student[students.length];
		int index = 0;

		for (Student student : students) {
			// Check condition rank = A
			// TODO: check on duplicate student with same Rank
			if (student.getRank().equals(rank)) {
				result[index++] = student;
			}
		}

		return Arrays.copyOfRange(result, 0, index);
	}

	// Tìm danh sách sin viên từng học lại trong năm 2021
	public Student[] getStudents(Student[] students) {
		Student[] result = new Student[students.length];
		int index = 0;
		boolean[] flags = new boolean[students.length];

		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			// Verify current student is participating re-learn
			if (!flags[i] && isDuplicated(student, i, students, flags)) {
				result[index++] = student;
			}
		}

		return Arrays.copyOfRange(result, 0, index);
	}

	private boolean isDuplicated(Student currentStudent,int currentIndex, Student[] students, boolean[] flags) {
		int count = 0;
		int currentStudentId = currentStudent.getId();
		for (int i = currentIndex + 1; i < students.length; i++) {
			int studentID = students[i].getId();
			if (currentStudentId == studentID) {
				flags[i] = true;
				count++;
				
			}
		}
		return count > 0;
	}
}
