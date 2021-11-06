package immutable;

import java.util.stream.Stream;

public class Ex05 {
	public static void main(String[] args) {
		String s = "STK123";
		String s1 = "STK";
		String s2 = "SGK";
		String s3 = "  Welcome      to our class     ";
		//Kiểm tra s có bắt đầu bằng s1 không
		System.out.println(s.startsWith(s1));
		//Kiểm tra s có kết thúc bằng s1 không
		System.out.println(s.endsWith(s1));
		//Thay thế chuỗi s1 trong s bằng s2
		System.out.println(s.replaceAll(s1, s2));
		//Loại bỏ tất cả các khoảng trắng thừa
		s3 = s3.trim().replaceAll("[\\s]+", "-"); //   \\s{2,}
		System.out.println("Sau khi xoá các khoảng trắng: " + s3);
		//Tạo chuỗi s4 từ bắt đầu từ vị trí t2 đến hết
		String s4 = s.substring(2, s.length());
		System.out.println(s4);
	}
}
