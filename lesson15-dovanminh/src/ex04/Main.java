package ex04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	private static final String pathname = "data" + File.separator + "student.txt";

	public static List<Student> getStudents() throws Exception{
		File file = new File(pathname);
		BufferedReader reader = new BufferedReader(new FileReader(file));
		List<Student> lists = new ArrayList<Student>();
		try {
			String line = "";
			while (line != null) {
				line = reader.readLine();
				String[] arr = line.split(", ");
				lists.add(new Student(arr[0], arr[1], Double.valueOf(arr[2]), arr[3]));
			}
		} catch (Exception ex) {

		} finally {
			reader.close();
		}
		return lists;
	}
	
	public static List<Student> getStudentsByScores(List<Student> lists, double scores){
		return lists.stream().filter(s->s.getScores() > scores).collect(Collectors.toList());
	}
	
	public static List<Student> getStudentsBySex(List<Student> lists, String sex){
		return lists.stream().filter(s->s.getSex().equals(sex)).collect(Collectors.toList());
	}
	
	public static List<Student> getStudentsOnly(List<Student> lists){
		Map<String, Integer> maps = new HashMap<>();
		lists.get(0).getId();
		for (int i = 0; i < lists.size(); i++) {
			if (maps.containsKey(lists.get(i).getId())) {
				maps.put(lists.get(i).getId(), 2);
			} else {
				maps.put(lists.get(i).getId(), 1);
			}
		}
		List<String> ids = maps.entrySet().stream().filter(m->m.getValue() == 1).map(m->m.getKey()).collect(Collectors.toList());
		
		return lists.stream().filter(s -> ids.contains(s.getId())).collect(Collectors.toList());
	}
	
	public static void main(String[] args) throws Exception {

		List<Student> lists = getStudents();
		lists.forEach(System.out::println);
		
		System.out.println("========Cau 1========");
//		Cau 1
		Comparator<Student> comp = Comparator.comparing(s -> s.getScores());
		lists.sort(comp.thenComparing(s->s.getName()));
		lists.forEach(System.out::println);
//		Cau 2
		System.out.println("========Cau 2========");
		getStudentsByScores(lists, 8).forEach(System.out::println);
//		Cau 3
		System.out.println("========Cau 3========");
		getStudentsBySex(lists, "Nu").forEach(System.out::println);
//		Cau 4
		System.out.println("========Cau 4========");
		getStudentsOnly(lists).forEach(System.out::println);
	}
}
