package ex05;

import java.util.Arrays;

public class AppLambda {
	public static void main(String[] args) {
		Book[] books = getBooks();
		
		// Tìm toàn bộ sách có đơn giá nhỏ hơn 50
		// Opt 3: anonymous function, required(at least JAVA 8)
		// Interface interface = (/* abstract method's parameters >> Condition#check */) -> {
			// body, override/implement of abstract method
		// }
		// Anonymous function = Lambda
		// Target: Concise representation to creating an instance(object) of "Functional" Interface
		Condition lt50 = (Book book) -> {
			return book.getPrice() < 600;
		};
		Book[] booksOpt3 = filter(books, lt50);
		System.out.println(Arrays.toString(booksOpt3));
		
		System.out.println("\n=============\\\\\\\\\\=============\n");
		
		// Opt 1: anonymous class
		Condition condition = new Condition() {
			@Override
			public boolean check(Book book) {
				return book.getPrice() >= 100 && book.getPrice() <= 600;
			}
		};
		
		Book[] booksA = filter(books, condition);
		System.out.println(Arrays.toString(booksA));
		
		System.out.println("\n=============\\\\\\\\\\=============\n");
		
		// Opt 2: Implementation class
		Condition pcd = new PublisherCondition("SWA");
		Book[] booksB = filter(books, pcd);
		System.out.println(Arrays.toString(booksB));
	}
	
	private static Book[] filter(Book[] books, Condition condition) {
		Book[] result = new Book[books.length];
		int index = 0;
		for (Book book: books) {
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
