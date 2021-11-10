package immutable;
/*
 * 	• Kiểm tra kí tự bắt đầu, kết thúc trong chuỗi s có phải là s1 không.
	• Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
	• Loại bỏ các khoảng trắng thừa của chuỗi s3
	• Tạo chuỗi con s4 từ chuỗi s bắt đầu từ vị trí số 2
 */
public class Ex05 {
	public static void main(String[] args) {
		String s = "STK123STK";
		String s1 = "STK";
		String s2 = "SGK";
		
		String s3 = "   Welcome    to   our class   ";
		
		//never update original string value in heap
		System.out.println("start with STK: " + s.startsWith(s1));
		System.out.println("end with STK: " + s.endsWith(s1));
		System.out.println("after replace: " + s.replace(s1, s2));
		
		System.out.println(s3.trim().replaceAll("[\\s]+", " "));
		
		String s4 = s.substring(2);
		System.out.println(s4);
	}
}
