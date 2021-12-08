package ex03;

public class Ex03 {
	public static void main(String[] args) {
	
		String[] strings = {"-2", "-6", "10", null, "4", "8", null, "Special", "a", "c",
				"b", "xx"};
		String a = "xx";
		String b = "y";
		if (a.compareTo(b) > 0) {
			System.out.println("a > b");
		}else {
			System.out.println("a < b");
		}
	}
}
