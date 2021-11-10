package immutable;
/**
 * 1. Kiểm tra kí tự, chuỗi bắt đầu, kết thúc trong chuỗi s có phải là s1 không
 * 2. Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
 * 3. Loại bỏ các khoảng trắng thừa của chuỗi s3
 * 4. Tạo chuỗi con s4 từ chuỗi s bắt đầu từ vị trí số 2
 * 5. Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
 */
public class Ex05 {
	public static void main(String[] args) {
		String s = "STK123";
		String s1 = "STK";
		String s2 = "SGK";
		
		// separate words by one space
		String s3 = "    Welcome to    our class    ";
		System.out.println(s.startsWith(s1));
		System.out.println(s.endsWith(s1));
		System.out.println(s.replace(s1, s2));
		
		// \s: space
		// ' ': space
		// +: 1 or N characters
		// {1,}: 1 or N characters
		// {a, b}: from a to b characters
		System.out.println("|" + s3.trim().replaceAll("[\\s]+", " ") + "|");
		
		
		String s4 = s.substring(1);
		
		System.out.println("s constain s1? : " + s.contains(s1));
		System.out.println("s constain s2? : " + s.contains(s2));
		
		
		System.out.println(s4);
	}
}
