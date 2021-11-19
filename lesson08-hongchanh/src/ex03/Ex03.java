package ex03;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Em có yêu anh không anh để anh biết còn chờ \nEm xin lỗi em đã có thái độ không đúng với anh";
		
		System.out.println("chuỗi ban đầu");
		System.out.println(a);
		
		System.out.println("chuỗi bỏ dấu");
		String q = VNCharacterUtils.removeAccent(a);
		System.out.println(q);
	}

}
