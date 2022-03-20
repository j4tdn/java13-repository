package ex04;

import java.io.File;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class Ex04 {
	
	private static final String path = "student.txt";
	public static void main(String[] args) throws Exception {
		File file = new File(path);
		List<Student> students = FileUtils.readLines(file, Student::transfer);
		students.forEach(System.out::println);
		
		//Sắp xếp danh sách sinh viên tăng dần theo ĐTB. Nếu DTB bằng nhau sắp xếp tăng dần theo họ tên.
		students.sort(Comparator.comparing(Student::getGpa).thenComparing(Student::getName));
		System.out.println("=============================");
		students.forEach(System.out::println);
		
		//Viết hàm tìm kiếm danh sách sinh viên có ĐTB > 8
		List<Student> gpaOver8 = students.stream()
		 		.filter(student -> student.getGpa() > 8)
		 		.collect(Collectors.toList());
		System.out.println("=============================");
		gpaOver8.forEach(System.out::println);
		
		//Viết hàm tìm kiếm toàn bộ các sinh viên NỮ 
		List<Student> femaleList = students.stream()
				 		.filter(student -> "Nu".equals(student.getGender()))
				 		.collect(Collectors.toList());
		 System.out.println("=============================");
		 femaleList.forEach(System.out::println);
		//Tìm kiếm sinh viên chỉ xuất hiện một lần trong student.txt. Biết rằng 2 sinh viên được phân biệt với nhau thông qua MSSV
		List<Student> uniqueStudents = students.stream()
				 	.filter(student -> {
				 		int count = 0;
				 		for (Student stu : students) {
							if(student.getId().equals(stu.getId())) {
								count ++;
							}
						}
				 		return count == 1;
				 	}).toList();
		 System.out.println("=============================");
		 uniqueStudents.forEach(System.out::println);
	}
	
}
