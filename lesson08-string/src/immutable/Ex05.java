package immutable;
/**
 * 1. Kiểm tra kí tự bắt đầu, kết thúc trong chuỗi s có phải là s1 không.
   2. Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
   3. Loại bỏ các khoảng trắng thừa của chuỗi s3
   4. Tạo chuỗi con s4 từ chuỗi s bắt đầu từ vị trí số 6
 *
 */
public class Ex05 {
	public static void main(String[] args) {
		String s = "STK123STK"; //SGK 246
		String s1 = "STK";
		String s2 = "SGK";
		
		// separate word by one space || Welcome to our class ||
		String s3 = "    Welcome   to    our class  ";
		
		// nature: never update original string value in heap
		System.out.println("Start with 'STK': " + s.startsWith(s1));
		System.out.println("End with 'STK': " + s.endsWith(s1));
		System.out.println("After replace: " + s.replace(s1, s2));
		System.out.println("After replace s: " + s);
		
		// trim = strip(JAVA 11), stringLeading, stringTrailing
		// replace versus replaceAll  // replace(" ", "")
		
		// \s: space
		// ' ': space
		// +: 1 or N character
		// {1,}: 1 or N character
		// {a, b}: from a to be characters
		
		System.out.println("Remove redundant spaces:|||" + s3.replaceAll("[\\s]+", " ") + "|||");
		
		// replace 1 or N spaces by 1 space
		
		String s4 = s.substring(4);
		System.out.println("s4 substring: " + s4);
		
		String s5 = s.substring(0, 5);
		System.out.println("s5 substring: " + s5);

		String s6 = s.substring(2, 6);
		System.out.println("s6 substring: " + s6);
		
		System.out.println("s contains s1 ? " + s.contains(s1));
		System.out.println("s contains s2 ? " + s.contains(s2));
		

	}	
}
