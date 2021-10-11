package ex05;

import java.util.ArrayList;

/**
 * Thiếu 2 tasks đầu tiên là insert data vào ArrayList của em
 * 18đ
 */
public class Manage {

	// Dùng ArrayList có vẻ thuần thục
	// Nhưng cách code này chưa chuẩn. Đến phần Collection a sẽ sharing lại
	ArrayList<Book> bookList = new ArrayList<>();

	// OK
	public ArrayList<Book> findBookByPublisher(ArrayList<Book> bookList, String publisher) {
		ArrayList<Book> list = new ArrayList<>();
		for (Book book : bookList) {
			if (book.getPublisher().equalsIgnoreCase(publisher))
				list.add(book);
		}
		return list;
	}

	// OK
	public ArrayList<Book> findBookByPrice(ArrayList<Book> bookList, double priceMin, double priceMax) {
		ArrayList<Book> list = new ArrayList<>();
		for (Book book : bookList) {
			double price = book.getPrice();
			if (price >= priceMin && price <= priceMax)
				list.add(book);
		}
		return list;
	}

	public ArrayList<Book> findBookByPrice(ArrayList<Book> bookList, double priceMin, double priceMax, String code) {
		ArrayList<Book> list = new ArrayList<>();
		for (Book book : bookList) {
			if (book.getPrice() >= priceMin && book.getPrice() >= priceMax && book.getCode().equalsIgnoreCase(code))
				list.add(book);
		}
		return list;
	}

	public double price(ArrayList<Book> bookList) {
		double a = 0;
		for (Book book : bookList) {
			if (book instanceof TextBook) {
				TextBook textbook = (TextBook) book;
				double price = textbook.getPrice();
				if (textbook.isOld)
					price *= 0.7;
				a += price;
			} else {
				ReferBook referbook = (ReferBook) book;
				a += referbook.getPrice() * (1 + referbook.getTax());
			}
		}
		return a;
	}
}
