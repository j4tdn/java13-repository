package ex05_review;

import java.util.Arrays;

public class AppStrategy {

	public static void main(String[] args) {
		Book[] books = getBooks();
		
		//strategy pattern
		//Tìm toàn bộ sách thuộc nhà xuất bản 'SWA'
		//anonymous class
		Condition condition = new Condition() {
			@Override
			public boolean check(Book book) {
				return book.getPrice() >= 100 && book.getPrice() <= 600;
			}
		};
		
		Book[] booksA = filter(books, condition);
		System.out.println(Arrays.toString(booksA));
		
		System.out.println("=====================");
		
		//implementation class from Stategy inteface
		Condition publisherCondition = new PublisherCondition("SWA");
		Book[] booksB = filter(books, publisherCondition);
		System.out.println(Arrays.toString(booksB));
	}
	
	// stategy(behavior, function) pattern
	// pass a parameter as a behavior, function
	
	//usual >> pass a parameter as a variable
	private static Book[] filter(Book[] books, Condition condition) {
		Book[] result = new Book[books.length];
		
		int index = 0;
		for(Book book: books) {
			// strategy
			if(condition.check(book)) {
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
