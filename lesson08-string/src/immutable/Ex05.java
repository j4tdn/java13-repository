package immutable;

/**
 * 1. Kiểm tra ký tự, chuỗi bắt đầu, kết thúc trong chuỗi s có phải là s1 không. 
 * 2. Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
 * 3. Loại bỏ các khoảng trắng thừa của chuỗi s3
 * 4. Tạo chuỗi con s4 từ chuỗi s bắt đầu từ vị trí số 2
 * 5. Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không?
 */

public class Ex05 {
	public static void main(String[] args) {
		String s = "STK123STK"; // SGK246
		String s1 = "STK";
		String s2 = "SGK";

		// separate words by one space || Welcome to our class ||
		String s3 = "  Welcome to    our class     ";

		// Bản chất của String: never update original string value in HEAP
		System.out.println("Start with STK: " + s.startsWith(s1));
		System.out.println("End with STK: " + s.endsWith(s1));
		System.out.println("After replace: " + s.replace(s1, s2));
		System.out.println("After replace s: " + s);

		// replace versus replaceAll // replaceAll(" ", "")
		// trim() = strip(JAVA11) > xóa space ở đầu và cuối
		// stripLeading() > xóa space ở đầu
		// stripTrailing() > xóa space ở cuối
		// \'\s' : space
		// ' ' : space
		// + : 1 or N characters
		// {1,} : 1 or N characters
		// {a, b} : from a to b characters
		// regex 1 or n characters

		System.out.println("Remove redundant space: " + s3.trim().replaceAll("[\\s]+", "-"));

		// replace 1 or N spaces by 1 space
		
		String s4 = s.substring(4);
		System.out.println("s4 substring: " + s4);
		
		String s5 = s.substring(0, 5); // cut from 0-4 => 5 characters
		System.out.println("s5 sub(0, 5): " + s5);
		
		String s6 = s.substring(2, 6); 
		System.out.println("s6 sub(2, 6): " + s6);
		
		System.out.println("s contains s1 ? " + s.contains(s1));
		System.out.println("s contains s2 ? " + s.contains(s2));

	}

}
