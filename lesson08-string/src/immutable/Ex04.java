package immutable;
/**
 * Demo String utility methods
 * 1. Tìm chiều dài của chuỗi s
 * 2. Nối chuỗi s1 vào chuỗi s
 * 3. Lấy một ký tự tại vị trí index(3) trong chuỗi s
 * 4. Duyệt từng phần tử trong chuỗi 
 * 5. Tìm vị trí xuất hiện đầu tiên, cuối cùng của ký tự (a) trong chuỗi s
 */


public class Ex04 {
	public static void main(String[] args) {
		String s = "Grid ";
		String s1 = "Layout down";

		System.out.println("String length is: " + s.length());

		s = s + s1; // s = s.concat(s1);
		System.out.println("s concat: " + s);

		System.out.println("Value at index 3: " + s.charAt(3));

		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}

		// Exist >> [0, length)
		// Not exit >> -1
		System.out.println("First 'a' position: " + s.indexOf("d"));
		System.out.println("Last 'a' position: " + s.lastIndexOf("d"));

	}

}
