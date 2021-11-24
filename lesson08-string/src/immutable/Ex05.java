package immutable;

public class Ex05 {
	public static void main(String[] args) {
		String s = "STK123STK";
		String s1 = "STK";
		String s2 = "SGK";
		String s3 = "   Welcome      to our class   ";
		
		System.out.println("Start " + s.startsWith(s1));
		System.out.println("End " + s.endsWith(s1));
		//thay thế s2 vào s replace
		System.out.println("After replace: " + s.replace(s1, s2));
		
		//xóa khoảng trắng 2 đầu trim();
		s3 = s3.trim().replaceAll("[\\s]+", " ");
		System.out.println(s3);
		//cắt bắt đầu từ 1 kí tự bất kì dùng substring
		String s4 = s.substring(4);
		System.out.println("s4 substring: " + s4);
		//cắt bắt đầu từ 1 kí tự đến 1 kí tự bất kì dùng substring
		String s5 = s.substring(0, 5);
		System.out.println("sub (0,5): "+s5);
		String s6 = s.substring(2, 6);
		System.out.println("sub (2-6): " + s6);
		//kiểm tra s1 có tồn tại trong s hay không : contains
		System.out.println("s contains s1 ? : "+ s.contains(s1));
		System.out.println("s contains s2 ? : "+ s.contains(s2));
		
	}
}
