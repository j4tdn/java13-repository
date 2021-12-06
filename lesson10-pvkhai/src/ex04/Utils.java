package ex04;

public class Utils {
	private Utils() {
		
	}
	
	public static void swap(Student[] students, int before, int after) {
		Student tmp = students[before];
		students[before] = students[after];
		students[after] = tmp;
	}
}
