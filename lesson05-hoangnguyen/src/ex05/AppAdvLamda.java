package ex05;

import java.util.Arrays;
import java.util.Objects;

public class AppAdvLamda {

	public static void main(String[] args) {
		Book[] books = getBooks();
		
		// Strategy pattern
		
		// TODO >> Lambda expression
		Condition condition = new Condition() {

			@Override
			public boolean check(Book book) {
				return "SWA".equals(book.getPulisher());
			}
		};

		// Tìm toàn bộ sách thuộc nhà xuất bản 'SWA'
		Book[] booksA = filter(books, condition);
		System.out.println(Arrays.toString(booksA));
		System.out.println("\n========////////////==========\n");

	}

	// Condition#strategy
	private static Book[] filter(Book[] books, Condition condition) {

		Book[] result = new Book[books.length];

		int index = 0;

		for (Book book : books) {
			if (condition.check(book)) {
				result[index++] = book;
			}
		}

		return Arrays.copyOfRange(result, 0, index);
	}

	private static Book[] getBooks() {
		TextBook tb1 = new TextBook("SGK123", 190, "PLS", Status.NEW);
		TextBook tb2 = new TextBook("SGK258", 456, "STL", Status.OLD);

		ReferenceBook rb1 = new ReferenceBook("STK159", 600, "SWX", 2);
		ReferenceBook rb2 = new ReferenceBook("STK459", 620, "SWA", 3);
		ReferenceBook rb3 = new ReferenceBook("STK472", 840, "SWD", 3);

		Book[] books = new Book[] { tb1, tb2, rb1, rb2, rb3 };
		return books;
	}
}
