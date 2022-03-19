package view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import bean.Student;

public class Ex04 {
	private static final String link = "Student.txt";
	public static void main(String[] args) {
		File file = new File(link);
		List<String> dataString = readFile(file);
		List<Student> students = dataString.stream()
			.map(Student::transfer)
			.collect(Collectors.toList());
		// 1.Sắp xếp danh sách sinh viên tăng dần theo ĐTB. Nếu DTB bằng nhau sắp xếp tăng
		// dần theo họ tên.
		System.out.println("List sorted students: ");
		students.stream()
			.sorted(Comparator.comparing(Student::getScore).thenComparing(Student::getName))
			.forEach(System.out::println);
			
		// 2.Viết hàm tìm kiếm danh sách sinh viên có ĐTB > 8
		System.out.println("List students have score bigger 8: ");
		findStudent(students, student -> "Nu".equals(student.getGender()))
			.forEach(System.out::println);
		// 3. Viết hàm tìm kiếm toàn bộ các sinh viên NỮ
		System.out.println("List Nu student");
		findStudent(students, student -> student.getScore() > 8)
			.forEach(System.out::println);
		// 4. Tìm kiếm sinh viên chỉ xuất hiện một lần trong student.txt. Biết rằng 2 sinh viên được
		// phân biệt với nhau thông qua MSSV	
		System.out.println("List students have appeared one time: ");
		students.stream()
			.collect(Collectors.toSet())
			.forEach(System.out::println);
	}
	
	private static List<Student> findStudent(List<Student> students, Predicate<Student> predicate) {
		return students.stream()
				.filter(predicate)
				.collect(Collectors.toList());
	}
	
	private static List<String> readFile(File file) {
		List<String> result = new ArrayList<String>();
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				result.add(line);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}
