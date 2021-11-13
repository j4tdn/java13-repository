package ex03;

/*
 * Bài 3(20đ): Cho dãy kí tự chứa các kí tự thường và khoảng trắng.
Viết chương trình loại bỏ khoảng trắng thừa và đảo chuỗi như sau:
Example: input: Welcome to JAVA10 class
output: emocleW ot 01AVAJ ssalc
Method signature: revert(String s) >> String
 */
public class Ex03 {
	public static void main(String[] args) {
		String text = "Welcome to JAVA10 class";

		String[] texts = text.split("\\s");
		String results = revert(texts);
		System.out.println(results);

	}

	private static String revert(String[] elements) {
		String texts = "";
		for (String element : elements) {
			String text = "";
			for (int i = element.length() - 1; i >= 0; i--) {
				text += element.charAt(i);
			}
			texts += text + " ";
		}
		return texts;
	}
}
