package ex05;

/**
 * Nhớ format code
 * 22đ
 */
public class App {
	public static void main(String[] args) {

		// Viáº¿t hÃ m táº¡o dá»¯ liá»‡u sÃ¡ch cho cá»­a hÃ ng.
		Book b1 = FactoryBook.createTextbook("SGK1", 500, "Nhi Dong", "new");
		Book b2 = FactoryBook.createTextbook("SGK2", 30, "Kim Dong", "old");
		Book b3 = FactoryBook.createTextbook("SGK3", 70, "Thai Ha", "new");
		Book b4 = FactoryBook.createReferBook("STKA", 90, "Nhi Dong", 5);
		Book b5 = FactoryBook.createReferBook("STKB", 120, "Nhi Dong", 7);

		System.out.println("List of book: ");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);

		// TÃ¬m toÃ n bá»™ sÃ¡ch thuá»™c nhÃ  xuáº¥t báº£n Nhi Ä�á»“ng
		Book b = new Book();
		Textbook tb = new Textbook();
		ReferBook rb = new ReferBook();
		// đoạn tính tiền này. E có thể sử dụng data từ chỗ b1 đến b5 phía trên
		// ko cần tạo lại data

		Book[] books = { b1, b2, b3, b4, b5 };
	}

	public static void Book(Book[] books) {
		for (Book book : books) {
			System.out.println(book);
		}
	}

	// KHÔNG được đặt tên hàm tiếng việt
	public static void nhiDong(Book[] books) {
		System.out.println("Books of NhiDong's Publishing House: ");
		for (Book book : books)
			if (book.getPlaceOfPub().equals("Nhi Dong")) {
				System.out.println(book);
			}
	}

	// TÃ¬m toÃ n bá»™ sÃ¡ch cÃ³ Ä‘Æ¡n giÃ¡ nhá»� hÆ¡n 50
	// costLessThan50
	public static void CostLessThan50(Book[] books) {
		System.out.println("List books have cost less than 50: ");
		for (Book book : books)
			if (book.getCost() > 50) {
				System.out.println(book);
			}
	}

	// TÃ¬m toÃ n bá»™ sÃ¡ch giÃ¡o khoa cÃ³ Ä‘Æ¡n giÃ¡ tá»« 100 Ä‘áº¿n 200
	public static void getBook(Book[] books) {
		System.out.println("List books have cost from 100 to 200: ");
		for (Book book : books)
			if (book.getCost() <= 100 && book.getCost() < 200) {
				System.out.println(book);
			}
	}

	// Viáº¿t hÃ m tÃ­nh tá»•ng tiá»�n mÃ  khÃ¡ch hÃ ng pháº£i thanh toÃ¡n.

}
