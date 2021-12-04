package lesson05;

import java.util.Arrays;

public class AppLambda {
	public static void main(String[] args) {
		Book[] books = getBook();
		
		//Condition lt50 = book -> book.getPrice() < 600;

		Book [] booksC =filter(books, book -> book.getPrice() < 600);
		Book [] booksD =filter(books, book -> book.getPrice() < 300);
		Book [] booksE =filter(books, book -> "SWA".equals(book.getPulisher()));


		System.out.println(Arrays.toString(booksC));
		System.out.println(Arrays.toString(booksD));
		System.out.println(Arrays.toString(booksE));

		

		
	}	

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
	

	private static Book[] getBook() {
		Textbook tb1 = new Textbook("SGK123", 220, "PLS", Status.NEW);
		Textbook tb2 = new Textbook("SGK258", 456, "STL", Status.OLD);
		ReferenceBook rf1 = new ReferenceBook("STK159", 600, "SWX", 2);
		ReferenceBook rf2 = new ReferenceBook("STK459", 620, "SWA", 3);
		ReferenceBook rf3 = new ReferenceBook("STK472", 840, "SWD", 3);

		return new Book[] { tb1, tb2, rf1, rf2, rf3 };
	}
}
