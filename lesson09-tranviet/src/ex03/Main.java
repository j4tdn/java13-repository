/**
 * Cho dãy kí tự chứa các kí tự thường và khoảng trắng.
	Viết chương trình loại bỏ khoảng trắng thừa và đảo chuỗi như sau:
		Example: input: Welcome to JAVA10 class
	 		 output: emocleW ot 01AVAJ ssalc
 */
package ex03;

public class Main {
	public static void main(String[] args) {
		String input = "Welcome   to JAVA10  class";
		String output = revert(input);
		System.out.println("Input: " + input);
		System.out.println("Output: " + output);
	}

	private static String revert(String input) {
		String newString = "";
		String[] words = input.split("[\\s]+");
		for (String i : words) {
			StringBuilder sb = new StringBuilder(i);
			i = sb.reverse().toString();
			newString = newString.concat(sb.toString() + " ");
		}
		return newString.trim();
	}

}
