package immutable;

public class Ex05 {
	public static void main(String[] args) {
		String s = "STK123";
		String s1 = "STK";
		String s2 = "SGK";
		String s3 = "  Welcome      to our class     ";
		// Kiểm tra s có bắt đầu bằng s1 không
		System.out.println("s.startsWith(s1): " + s.startsWith(s1));
		// Kiểm tra s có kết thúc bằng s1 không
		System.out.println("s.endsWith(s1): " + s.endsWith(s1));
		// Thay thế chuỗi s1 trong s bằng s2
		System.out.println("s.replaceAll(s1, s2): " + s.replaceAll(s1, s2));
		// Loại bỏ tất cả các khoảng trắng thừa
		s3 = s3.trim().replaceAll("[\\s]+", "-"); // \\s{2,}
		
		System.out.println("s3.trim().replaceAll(\"[\\\\s]+\", \"-\"): " + s3);
		// Tạo chuỗi s4 từ bắt đầu từ vị trí t2 đến hết
		String s4 = s.substring(2);
		// String s4 = s.substring(2, s.length());
		System.out.println("s.substring(2): " + s4);

		String s5 = s.substring(0, 5);
		System.out.println("s.substring(0,5): " + s5);
		String s6 = s.substring(2, 6);
		System.out.println("s.substring(2,6): " + s6);

		System.out.println("s.contains(s1): " + s.contains(s1));
		System.out.println("s.contains(s2): " + s.contains(s2));
	}
}
