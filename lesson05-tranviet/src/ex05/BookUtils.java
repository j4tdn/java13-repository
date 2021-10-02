package ex05;

public class BookUtils {
	private BookUtils() {
	}

	public static void findAllNhiDongBooks(Book[] books) {
		for (Book book : books) {
			if ("Nhi Đồng".equals(book.getPublisher())) {
				System.out.println(book);
			}
		}
	}

	public static void findAllBooksWithPriceLessThan50(Book[] books) {
		for (Book book : books) {
			if (book.getPrice() < 50) {
				System.out.println(book);
			}
		}
	}

	public static void findAllBooksWithPriceBtw100and200(Book[] books) {
		for (Book book : books) {
			if (book.getPrice() >= 100 && book.getPrice() <= 200) {
				System.out.println(book);
			}
		}
	}
}
