package ex04;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import utils.FileUtils;
import utils.ListUtils;

public class Ex04 {
	private static final String path = "Student.txt";
	
	public static void main(String[] args) {
		
		File file = new File(path);
		
		List<Student> students = FileUtils.readLines(file, Student::new);
		ListUtils.print(students, "Dữ liệu từ file:");
	
		students.sort(Comparator.comparing(Student::getScore).thenComparing(Student::getName));
		ListUtils.print(students, "Theo tăng dần điểm tb:");
		
		List<Student> eightPoint = ListUtils.predicate(students, student -> (student.getScore() > 8));
		ListUtils.print(eightPoint, "DTB > 8: ");
		
		List<Student> femaleStudents = ListUtils.predicate(students, student -> !student.getSex());
		ListUtils.print(femaleStudents, "Nữ: ");
		
		List<Student> nonDuplicateStudent = findNonDuplicateStudent(students);
		ListUtils.print(nonDuplicateStudent, "Danh sach sinh vien chi xuat hien 1 lan: ");
		
		
}
	
	// Code những các như này rất tốt và ok - A hiểu
	// Nhưng kiểu khi vào làm dự án - E code thế này khả năng sẽ bị review -1 -2.
	// Vì code thể code những code đơn giản dễ hiểu hơn với các available methods
	// A k phải chê code logic nhưng thường ngôn ngữ ko hỗ trợ thì mình mới nghĩ đến logic e nha
	private static List<Student> findNonDuplicateStudent(List<Student> students) {
		List<Student> rs = new ArrayList<>();
		for (int i = 0; i < students.size(); i++) {
			
			int k = 0;
			for (int j = 0; j < students.size(); j++) {
				
				if (students.get(i).getId() == students.get(j).getId()) {
						k++;
				}
			}
			if (k==1) {
				rs.add(students.get(i));
			}
	}
		return rs;
	}
}
