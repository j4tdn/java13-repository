package ex01;

import java.util.Arrays;

public class StudentService {

	/**
	 * Get students with give rank
	 * 
	 * @param students students
	 * @param rank     filter with given rank
	 */
	public Student[] getStudents(Student[] students, Rank rank) {
		// Array definition: Fixed-Size
		Student[] result = new Student[students.length];
		int index = 0;
		
		for (Student student: students) {
			// check condition. E.g rank=A
			// TODO: check non duplicate student with same rank
			if (student.getRank().equals(rank)) {
				result[index++] = student;
			}
		}
		
		// final: index = number of non null elements in result
		// copy result array from 0 to index-1
		return Arrays.copyOfRange(result, 0, index);
	}
	
	public Student[] getStudents(Student[] students) {
		// Array definition: Fixed-Size
		Student[] result = new Student[students.length];
		boolean[] flags  = new boolean[students.length];
		
		int index = 0;
		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			// Verify current student is participating re-learn
			if (!flags[i] && isDuplicated(student, i, students, flags)) {
				result[index++] = student;
			}
		}
		
		return Arrays.copyOfRange(result, 0, index);
	}

	private boolean isDuplicated(Student currentStudent, int currentIndex,
			Student[] students, boolean[] flags) {
		int count = 0;
		int currentStudentId = currentStudent.getId();
		for (int i = currentIndex + 1; i < students.length; i++) {
			int studentId = students[i].getId();
			if (studentId == currentStudentId) {
				flags[i] = true;
				count++;
			}
		}
		return count > 0;
	}
}
