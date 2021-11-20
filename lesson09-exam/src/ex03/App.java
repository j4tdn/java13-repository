package ex03;

/**
 * Viết chương trình loại bỏ khoảng trắng thừa và đảo chuỗi theo từng từ
 */
public class App {

	private static final String ONE_OR_MORE_SPACES_PATTERN = "\\s+";

	public static void main(String[] args) {
		// immutable
		String input = "   Welcome   to   JAVA10  class  ";

		StringBuilder sb = new StringBuilder();
		String[] words = input.trim().split(ONE_OR_MORE_SPACES_PATTERN);
		for (String word: words) {
			sb.append(reverse(word)).append(" ");
		}
		
		System.out.println("=====================================");
		System.out.println("|||" + sb.toString().trim() + "|||");
	}
	
	private static String reverse(String string) {
		return new StringBuilder(string).reverse().toString();
	}
}
