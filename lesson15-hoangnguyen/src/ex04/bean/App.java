package ex04.bean;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	private static final String path = "student.txt";

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();

		try {
			students = FileUtils.readLines(path, Student::new);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(
				"1. Sắp xếp danh sách sinh viên tăng dần theo ĐTB. Nếu ĐTB bằng nhau sắp xếp tăng dần theo họ tên.");
		students.stream()
				.sorted(Comparator.comparing(Student::getScores).thenComparing(Student::getName))
				.forEach(System.out::println);

		System.out.println("============================================================================");

		System.out.println("2. Viết hàm tìm kiếm danh sách sinh viên có ĐTB > 8");
		students.stream().filter(student -> student.getScores() > 8).forEach(System.out::println);

		System.out.println("============================================================================");

		System.out.println("3. Viết hàm tìm kiếm toàn bộ các sinh viên NỮ");
		students.stream().filter(student -> "Nu".equalsIgnoreCase(student.getSex())).forEach(System.out::println);

		System.out.println("============================================================================");

		System.out.println("4. Tìm kiếm sinh viên chỉ xuất hiện một lần trong student.txt. Biết rằng 2 sinh viên được phân biệt với nhau thông qua MSSV");
		students.stream()
				.collect(Collectors.toSet())
				.forEach(System.out::println);;
	}
}
