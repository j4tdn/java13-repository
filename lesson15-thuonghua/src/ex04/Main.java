package ex04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Student> listStudents = convertListStudent();
		System.out.println("========Ex01======");
		sortScore(listStudents);
		System.out.println("========Ex02======");
		findStudentsByScore(listStudents);
		System.out.println("========Ex03======");
		findStudentBySex(listStudents);
		System.out.println("========Ex04======");
		findUniqueStudent(listStudents);
	}
	
	private static List<Student> convertListStudent(){
		List<String> listString = Utils.readFile();
		List<Student> result = new ArrayList<>();
		
		for(int i = 0; i < listString.size(); i++) {
			String[] values = listString.get(i).split(",");
			
			Student student = new Student();
			
			student.setId(Integer.parseInt(values[0]));
			student.setName(values[1]);
			student.setScore(Double.parseDouble(values[2]));
			student.setSex(values[3]);
			
			result.add(student);
		}
		return result;
	}
	
	private static void sortScore(List<Student> students) {
		List<Student> result = students.stream().sorted(Comparator.comparing(Student::getScore).thenComparing(Student::getName))
				.collect(Collectors.toList());
		
		result.forEach(System.out::println);
		
	}
	
	private static void findStudentsByScore(List<Student> students) {
		List<Student> result = students.stream()
									   .filter(student -> student.getScore() > 8)
									   .collect(Collectors.toList());
		result.forEach(System.out::println);
	}
	
	private static void findStudentBySex(List<Student> students) {
		List<Student> result = students.stream()
									   .filter(student -> "Nam".equals(student.getSex()))
									   .collect(Collectors.toList());
		result.forEach(System.out::println);
	}
	
	private static void findUniqueStudent(List<Student> students) {
		List<Student> result = students.stream()
								.distinct()
								.collect(Collectors.toList());
		result.forEach(System.out::println);
	}
}
