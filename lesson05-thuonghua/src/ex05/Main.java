package ex05;

/**
 * Tạo xong data >> 10đ
 */
public class Main {
	public static void main(String[] args) {

		TextBook textBook = new TextBook("SGK1", 20000, "Kim Đồng", "Mới");
		TextBook textBook1 = new TextBook("SGK2", 10000, "Kim Đồng", "Cũ");
		TextBook textBook2 = new TextBook("SGK3", 18000, "Nhi Đồng", "Mới");
		ReferBook book = new ReferBook("STK1", 30000, "Nhi Đồng", 0.1f);
		ReferBook book1 = new ReferBook("STK2", 25000, "Kim Đồng", 0.1f);

		Book[] array = { textBook, textBook1, textBook2, book, book1 };

		for (int i = 0; i < array.length; i++) {
			// Lúc này em mới new ra làm gì có giá trị để compare
			// Em phải get từ array ra để compare chứ
			TextBook text = new TextBook();
			if ("Nhi Đồng".equals(text.getPublishingCompany())) {
				System.out.println(array[i]);
			}
		}
	}

}
