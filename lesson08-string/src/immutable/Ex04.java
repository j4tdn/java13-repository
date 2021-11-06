package immutable;

//Demo String utility methods
public class Ex04 {
	public static void main(String[] args) {
		String s = "Grid ";
		String s1 = "Layout";

		System.out.println("Chiều dài của chuỗi s: " + s.length());
		s = s + s1;
		System.out.println("Nối chuỗi s1 và s: " + s);
		System.out.println("Lấy ký tự tại ví trí index(3) của chuỗi s: " + s.charAt(3));
		System.out.println("Duyệt từng phần tử trong chuỗi: ");
		for (int i = 0; i < s.length(); i++) {
			System.out.println("Index " + i + ": " + s.charAt(i));
		}
		
		//Exist >> [0,length)
		//Not Exist >> -1
		System.out.println("Vị trí xuất hiện đầu tiên, cuối cùng của kí tự (a) trong s lần lượt là: " + s.indexOf("a")
				+ ", " + s.lastIndexOf("a"));
	}
}
