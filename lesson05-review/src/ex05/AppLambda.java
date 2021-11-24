package ex05;

import java.util.Arrays;

public class AppLambda {
	public static void main(String[] args) {
		Book[] books = getBooks();
		// Opt3: Anonymous function, requite JAVA 8
		// Interface interface = (parameter) -> { 
		// body, override/ implement abstract method 
		//}
		
		// Anonymous function = Lambda
		// Target: Concise representation to creating an instance of Functional Interface
		Condition lt600 = (Book book) -> {
			return book.getPrice() < 600;
		};
		Book[] booksOpt3 = filter(books, lt600);
		System.out.println(Arrays.toString(booksOpt3));
		System.out.println("===========================");
		
		// Opt1: Anonymous Class
		Condition condition = new Condition() {
			@Override
			public boolean check(Book book) {
				return book.getPrice() >= 100 && book.getPrice() <= 600;
			}
		};

		Book[] booksA = filter(books, condition);
		System.out.println(Arrays.toString(booksA));
		System.out.println("===========================");
		
		//Opt2:
		Condition cps = new PublisherCondition("SWA");
		Book[] booksOpt2 = filter(books, cps);
		System.out.println(Arrays.toString(booksOpt2));
		System.out.println("===========================");

	}

	// strategy(behavior, function) pattern
	// pass a parameter as a behavior, function

	// usual >> pass a parameter as a variable

	// Tìm toàn bộ sách thuộc nhà xuất bản
	// publisherKw.equals(book.getPulisher())

	// Tìm toàn bộ sách có đơn giá nhỏ hơn 50
	// book.getPrice() < priceKw

	// Tìm toàn bộ sách giáo khoa có đơn giá từ 100 đến 200
	// book.getPrice() >= minPrice && book.getPrice() <= maxPrice

	// Condition#strategy
	private static Book[] filter(Book[] books, Condition condition) {
		Book[] result = new Book[books.length];
		int index = 0;
		for (Book book: books) {
			// strategy
			if (condition.check(book)) {
				result[index++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, index);
	}







	private static Book[] getBooks() {
		TextBook tb1 = new TextBook("SGK123", 220, "PLS", Status.NEW);
		TextBook tb2 = new TextBook("SGK258", 456, "STL", Status.OLD);

		ReferenceBook rb1 = new ReferenceBook("STK159", 600, "SWX", 2);
		ReferenceBook rb2 = new ReferenceBook("STK459", 620, "SWA", 3);
		ReferenceBook rb3 = new ReferenceBook("STK472", 840, "SWD", 3);

		return new Book[] {tb1, tb2, rb1, rb2, rb3};
	}
}
