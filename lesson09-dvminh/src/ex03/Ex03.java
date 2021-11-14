package ex03;

public class Ex03 {
	public static void main(String[] args) {
		String input = "Welcome   to JAVA10    class";
		String output;
		
		output = input.trim().replaceAll("[\\s]+", " ");
		
		String[] words = output.split("\\s");
		StringBuilder str;
		for (String w : words) {
			str = new StringBuilder(w);
			System.out.print(str.reverse() + " ");
		}
		
	}
}
