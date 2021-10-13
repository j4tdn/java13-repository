package ex05;

/**
 * 25đ
 */
public class App {
	public static void main(String[] args) {
		Book[] books = Utils.input();
		System.out.println("Sách thuộc nhà xuất bản Nhi Đồng: ");
		Utils.findBookNhiDong(books);
		System.out.println("Sách có giá nhỏ hơn 50: ");
		Utils.findBookPrice50(books);
		System.out.println("Sách giáo khoa có giá từ 100-200: ");
		Utils.findBookPrice100To200(books);
	}
}
