package lesson05;

import java.util.Arrays;
import java.util.Objects;

public class AppStrategy {
	public static void main(String[] args) {
		Book [] books = getBook();
		
//	 	Book[] booksA = filter(  books, "SWA");
//		System.out.println("booksA: " + Arrays.toString(booksA));
//		Book[] booksB = filter( books, 200);
//		System.out.println("booksB: "+ Arrays.toString(booksB));
//		Book[] booksC = filter(  booksB, 300, 600);
//		System.out.println("booksC: " + Arrays.toString(booksC));
		//Strategy(behavior, function) pattern
		//pass a parameter as a behavior, function
		
		Condition condition = new Condition() {
			//Opt1: lớp ẩn danh : anonymous class : new 1 class từ interface 
			@Override
			public boolean check(Book book) {
				return book.getPrice() >= 200 && book.getPrice() <= 600;
			}
		};
		Book[] booksA = filter(books, condition);
		System.out.println(Arrays.toString(booksA));
		
		System.out.println("====================================");
		//Opt2 : Implementation class from Strategy interface
		Condition pcd = new PublicherCondition("SWX");
		Book [] booksB = filter(booksA, pcd);
		System.out.println(Arrays.toString(booksB));
		
	}
	private static Book[] filter(Book[]books, Condition condition) {
		Book[] result = new Book[books.length];
		int index= 0;
		for(Book book : books) {
			if(condition.check(book)) {
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
