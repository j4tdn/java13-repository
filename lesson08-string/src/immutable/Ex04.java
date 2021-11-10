package immutable;
/*
 * Demo String utility methods
 * 1. Tính chiều dài của chuỗi s
 * 2. Nối chuỗi s1 vào chuỗi s
 * 3. Lấy một ký tự tại vị trí index(3)
 * 4. Duyệt từng phần tử trong chuỗi
 * 5. Tìm vị trí xuất hiện đầu tiên, cuối cùng của ký tự "a" trong chuỗi s
 */
public class Ex04 {
	public static void main(String[] args) {
		String s = "Grid";
		String s1 = " Layout down";
		
		System.out.println("length: " + s.length());
		
		s = s + s1;
		System.out.println("s concat: " + s);
		
		System.out.println("Value at index 3: " + s.charAt(3));
		
		for(int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
		}
		
		System.out.println("\nfirst 'd' position:" + s.indexOf("d"));
		System.out.println("last 'd' position:" + s.lastIndexOf("d"));
	}
}
