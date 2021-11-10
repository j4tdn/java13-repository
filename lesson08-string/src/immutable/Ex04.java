package immutable;

/**
 * Demo String utility methods
 * 1. Tính chiều dài của chuỗi s
 * 2. Nối chuỗi s1 vào chuối s
 * 3. Lấy một ký tự tại vị trí index trong chuỗi s
 * 4. Duyệt từng phần tử trong chuỗi
 * 5. Tìm vị trí xuất hiện đầu tiên, cuối cùng của kí tự trong chuỗi s
 *
 */

public class Ex04 {
	public static void main(String[] args) {
		String s = "Grid";
		String s1 = "Layout";
		
		
		System.out.println("Length: " + s.length());
		s = s + s1; // s = s.concat(s1);
		
		System.out.println("s concat: " + s);
		
		System.out.println("Value at index 3" + s.charAt(3));
		
		for(int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		
		System.out.println("First 'a' position: "+ s.indexOf("a"));
		
		System.out.println("Last 'a' position " + s.lastIndexOf("d"));
	}
}
