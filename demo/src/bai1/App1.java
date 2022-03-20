package bai1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App1 {
	private static final String path = "student.txt";
	public static void main(String[] args) {
		List<String> list = FileUtils.readLines(path);
		List<Student> students = transfer(list);
		// System.out.println(students);
		
		System.out.println("After sorting: ");
		sortASC(students).forEach(System.out::println);
		
		System.out.println("List's student have more 8.0: ");
		searchMore8(students).forEach(System.out::println);
		
		System.out.println("List's student who are women: ");
		findWomen(students).forEach(System.out::println);
		
		System.out.println("Students only happens one time: ");
		findOnceHappens(students).forEach(System.out::println);
	}
	
	private static List<Student> findOnceHappens(List<Student> students){
		return students.stream()
				.filter((Student student) -> {
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
