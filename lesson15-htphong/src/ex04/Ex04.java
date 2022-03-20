package ex04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import bean.Student;
import utils.FileUtils;

/** 1. Sắp xếp danh sách sinh viên tăng dần theo ĐTB. Nếu DTB bằng nhau sắp xếp tăng
    dần theo họ tên.
    2. Viết hàm tìm kiếm danh sách sinh viên có ĐTB > 8
    3. Viết hàm tìm kiếm toàn bộ các sinh viên NỮ
    4. Tìm kiếm sinh viên chỉ xuất hiện một lần trong student.txt. Biết rằng 2 sinh viên được
    phân biệt với nhau thông qua MSSV */

public class Ex04 {
	private static final String path = "student.txt";
	public static void main(String[] args) {
		List<String> list = FileUtils.readLines(path);
		List<Student> students = transfer(list);
		
		System.out.println("After sorting: ");
		sortASC(students).forEach(System.out::println);
		
		System.out.println("List's student is more 8.0: ");
		searchMore8(students).forEach(System.out::println);
		
		System.out.println("List's student who are women: ");
		findWomen(students).forEach(System.out::println);
		
		System.out.println("Students only happens one time: ");
		findOnceHappens(students).forEach(System.out::println);
	}
	
	private static List<Student> findOnceHappens(List<Student> students){
		return students.stream()
				.filter( student -> {
					int count = 0;
					for(Student s : students) {
						if (student.getId() == s.getId()) {
							count++;
						}
					}
					return count == 1;
				}).toList();
	}
	
	private static List<Student> findWomen(List<Student> students){
		return students.stream().filter(student -> "Nu".equals(student.getGender())).toList();
	}
	
	private static List<Student> searchMore8(List<Student> students){
		return students.stream().filter(student -> student.getMark() > 8).toList();
	}
	
	private static List<Student> sortASC(List<Student> students){
		return students.stream().sorted(Comparator.comparing(Student::getMark).thenComparing(Student::getName)).toList();
	}
	
	private static List<Student> transfer(List<String> list){
		List<Student> students = new ArrayList<>();
		
		for (String s : list) {
			String[] info = s.split(", ");
			students.add(new Student(Integer.parseInt(info[0]), info[1], Double.parseDouble(info[2]), info[3]));
		}
		
		return students;
	}
}
