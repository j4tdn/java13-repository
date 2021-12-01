package lesson05;

import java.util.Arrays;
import java.util.Objects;

public class Ex05OOP {
	public static void main(String[] args) {
		Book [] books = getBook();
		
		Book[] booksA = filter(  books, "SWA");
		System.out.println("booksA: " + Arrays.toString(booksA));
		
		Book[] booksB = filter( books, 200);
		System.out.println("booksB: "+ Arrays.toString(booksB));
		
		Book[] booksC = filter(  booksB, 300, 600);
		System.out.println("booksC: " + Arrays.toString(booksC));
	}
	private static Book[] filter(Book[]books, String pulisherKw) {
		Objects.requireNonNull(pulisherKw, "Pulisher connot be null");
		Book[] result = new Book[books.length];
		int index= 0;
		for(Book book : books) {
			if(pulisherKw.equals(book.getPulisher())) {
				result[index++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, index);
		
	}
	private static Book[] filter(Book[]books, double priceKW) {
		Book[] result = new Book[books.length];
		int index= 0;
		for(Book book : books) {
			if(book.getPrice() > priceKW) {
				result[index++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, index);
		
	}
	private static Book[] filter(Book[]books, double minPrice , double maxPrice) {
		Book[] result = new Book[books.length];
		
		int index= 0;
		for(Book book : books) {
			if(book.getPrice() >= minPrice && book.getPrice() <= maxPrice) {
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

		return new Book[] {tb1, tb2, rf1, rf2, rf3};
	}
}
