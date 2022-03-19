package ex04;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import utils.FileUtils;
import utils.ListUtils;

public class App {
	private static final String path = "student.txt";

	public static void main(String[] args) {
		File file = new File(path);
		List<Student> students = FileUtils.readLines(file, Student::new);
		ListUtils.print(students, "Du lieu tu file student.txt:");
		
		students.sort(Comparator.comparing(Student::getScore).thenComparing(Student::getName));
		ListUtils.print(students, "Danh sach sinh vien tang dan theo DTB. Neu bang DTB thi tang dan theo ho ten: ");

//		2. Viết hàm tìm kiếm danh sách sinh viên có ĐTB > 8
		List<Student> overEightPoint = ListUtils.suitableElements(students, student -> (student.getScore() > 8));
		ListUtils.print(overEightPoint, "Danh sach sinh vien co DTB > 8: ");

//		3. Viết hàm tìm kiếm toàn bộ các sinh viên NỮ
		List<Student> femaleStudents = ListUtils.suitableElements(students, student -> !student.getSex());
		ListUtils.print(femaleStudents, "Danh sach sinh vien co gioi tinh la NU: ");

//		4. Tìm kiếm sinh viên chỉ xuất hiện một lần trong student.txt. Biết rằng 2 sinh viên được
//		phân biệt với nhau thông qua MSSV
		List<Student> nonDuplicateStudent = findNonDuplicateStudent(students);
		ListUtils.print(nonDuplicateStudent, "Danh sach sinh vien chi xuat hien 1 lan: ");
	}

	private static List<Student> findNonDuplicateStudent(List<Student> students) {
		List<Student> rs = new ArrayList<>();
		for (int i = 0; i < students.size(); i++) {
			if (!isRepeated(students, i)) {
				rs.add(students.get(i));
			}
		}
		return rs;
	}

	private static boolean isRepeated(List<Student> students, int index) {
		for (int i = 0; i < students.size(); i++) {
			if (i == index) {
				continue;
			}
			if (students.get(i).equals(students.get(index))) {
				return true;
			}
		}
		return false;
	}

}
