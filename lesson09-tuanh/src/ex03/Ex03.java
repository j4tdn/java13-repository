package ex03;
/**
 *Bài 3(20đ): Cho dãy kí tự chứa các kí tự thường và khoảng trắng.
Viết chương trình loại bỏ khoảng trắng thừa và đảo chuỗi.
 */
public class Ex03 {
	public static void main(String[] args) {
		String s = "Welcome    to JAVA10    class";
		s = s.replaceAll("[\\s]+", " ");
		System.out.println(revert(s));
	}
	public static String revert(String s) {
		char[] charArray = s.toCharArray();
		int begin = 0;
		int end = charArray.length - 1;
		char temp;
		while(end > begin) {
			temp = charArray[begin];
			charArray[begin] = charArray[end];
			charArray[end] = temp;
			end--;
			begin++;
		}
		return new String(charArray);
	}
}
