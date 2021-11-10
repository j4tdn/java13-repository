package immutable;


/**
 * Demo String utility methods
 * 	1. Tính chiều dài của chuỗi s
 * 	2. Nối chuỗi s1 vào chuỗi s
 * 	3. Lấy một kí tự tại vị trí index(3) trong chuỗi s
 * 	4. Duyệt từng phần tử trong chuỗi
 * 	5. Tìm "vị trí - chỉ số" xuất hiện đầu tiên, cuối cùng của kí tự(a) trong chuỗi s
 **/
public class Ex04 {
	public static void main(String[] args) {
		String s = "Grid ";
		String s1 = "Layout down";
		
		//1
		System.out.println("Length of string s: " + s.length());
		//2
		//s+= s1;
		s = s.concat(s1);
		System.out.println("s concat: " + s);
		//3 
		System.out.println("Index 3 of string s: " + s.charAt(3));
		//4
		for(int i = 0; i < s.length(); i++) {
			System.out.println("Index[" + i + "] : " + s.charAt(i));
		}
		//5
		System.out.println("First position of character 'a': " + s.indexOf("d"));
		System.out.println("Last position of charracter 'a': " +s.lastIndexOf("d"));
	}
	
	
}
