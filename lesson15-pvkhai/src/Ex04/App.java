package Ex04;

import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {
	private static final String pathname = "Student.txt";

	public static void main(String[] args) throws Exception {
		List<Student> students = Utils.readLines(pathname, Student::new);

		List<Student> op1 = students.stream().sorted(Comparator.comparing(Student::getDTB).thenComparing(Student::getName))
				.collect(Collectors.toList());
		System.out.println("1. Sắp xếp danh sách sinh viên tăng dần theo DTB. Nếu DTB bằng nhau sắp xếp tăng\r\n"
				+ "dần theo họ tên.");
		op1.forEach(System.out::println);

		List<Student> op2 = students.stream().filter(student -> student.getDTB() > 8)
				.collect(Collectors.toList());
		System.out.println("2. Danh sách sinh viên có ĐTB > 8");
		op2.forEach(System.out::println);

		List<Student> op3 = students.stream().filter(student -> "Nu".equals(student.getGioiTinh()))
				.collect(Collectors.toList());
		System.out.println("3. Danh sách sinh viên NỮ");
		op3.forEach(System.out::println);

		System.out.println("4. Tìm kiếm sinh viên chỉ xuất hiện một lần trong student.txt. Biết rằng 2 sinh viên được\r\n"
				+ "phân biệt với nhau thông qua MSSV");
		List<Student> op4 = students.stream()
				.collect(Collectors.groupingBy(student -> student, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() == 1)
				.map(entry -> entry.getKey())
				.collect(Collectors.toList());	
		op4.forEach(System.out::println);
	}
}
