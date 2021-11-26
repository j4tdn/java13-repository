package ex05;

import java.util.Arrays;

public class AppLambdaLast {
	public static void main(String[] args) {
		Book[] books = getBooks();
		// Opt3: Anonymous function, requite JAVA 8
		// Interface interface = (parameter) -> { 
		// body, override/ implement abstract method 
		//}
		
		// Anonymous function = Lambda
		// Target: Concise representation to creating an instance of Functional Interface
//		Condition lt600 = book -> book.getPrice() < 600;
		
		Book[] lt600 = filter(books, book -> book.getPrice() < 600);
		System.out.println(Arrays.toString(lt600 ));
		System.out.println("===========================");
		Book[] bt300 = filter(books, book -> book.getPrice() > 300);
		System.out.println(Arrays.toString(bt300 ));
		System.out.println("===========================");
		Book[] bookSWA = filter(books, book -> "SWA".equals(book.getPulisher()));
		System.out.println(Arrays.toString(bookSWA));
		System.out.println("===========================");
	}	
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