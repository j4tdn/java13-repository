package ex03;

public class App {
	public static void main(String[] args) {
		String input = "Welcome  to JAVA01  class";
		
		System.out.println(revert(input));
	}
	private static StringBuilder revert(String input) {
		String s = input.trim().replaceAll("[\\s]+", " ");
		String[] words = s.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		String output = "";
		for(String word : words) {
			for(int i = word.length()-1; i >= 0; i--) {
				 sb.append(word.charAt(i));
			}
			sb.append(" ");
		}
		return sb;
	}
}
