package ex05;

import java.util.Arrays;
import java.util.Objects;

public class App {
	
	public static void main(String[] args) {
		Book[] books = getBooks();
		
		// Tìm toàn bộ sách thuộc nhà xuất bản 'SWA'
		Book[] booksA = filter(books, "SWA");
		System.out.println(Arrays.toString(booksA));
		System.out.println("\n========////////////==========\n");
		// Tìm toàn bộ sách có đơn giá nhỏ hơn 50
		Book[] booksB = filter(books, 50);
		System.out.println(Arrays.toString(booksB));
		System.out.println("\n========////////////==========\n");
		// Tìm toàn bộ sách giáo khoa có đơn giá từ 100 - 200
		Book[] booksC = filter(books, 100, 200);
		System.out.println(Arrays.toString(booksC));
		System.out.println("\n========////////////==========\n");
	}
	
	// Tìm toàn bộ sách thuộc nhà xuất bản 'SWA'
	private static Book[] filter(Book[] books, String pulisher) {
		Objects.requireNonNull(pulisher, "Pulisher cannot be null");
		Book[] result = new Book[books.length];
		
		int index = 0;
		
		for(Book book : books) {
			if(pulisher.equalsIgnoreCase(book.getPulisher())) {
				result[index++] = book;
			}
		}
		
		return Arrays.copyOfRange(result, 0, index);
	}
	
	// Tìm toàn bộ sách có đơn giá nhỏ hơn 50
	private static Book[] filter(Book[] books, double price) {

		Book[] result = new Book[books.length];
		
		int index = 0;
		
		for(Book book : books) {
			if(book.getPrice() < price) {
				result[index++] = book;
			}
		}
		
		return Arrays.copyOfRange(result, 0, index);
	}
	
	private static Book[] filter(Book[] books, double minPrice, double maxPrice) {

		Book[] result = new Book[books.length];
		
		int index = 0;
		
		for(Book book : books) {
			if(book.getPrice() <= maxPrice && book.getPrice() >= minPrice) {
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
		
		Book[] books = new Book[] {tb1, tb2, rb1, rb2, rb3};
		return books;
	}
}
