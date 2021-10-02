package ex05;

import java.util.ArrayList;
import java.util.List;

public class BookUtils {
	
	public static Book[] createData() {
		Book textbook1 = new TextBook("01", 50, "Nhi Đồng", "old");
		Book textbook2 = new TextBook("02", 110, "Kim Đồng", "new");
		Book textbook3 = new TextBook("03", 30, "Hoa Phượng Đỏ", "old");
		
		Book referBook1 = new ReferBook("01", 45, "Nhi Đồng", 2);
		Book referBook2 = new ReferBook("02", 70, "Kim Đồng", 5);
		
		Book[] books = {textbook1, textbook2, textbook3, referBook1, referBook2};
		
		return books;
	}
	
	public static List<Book> findPublishingCompany(Book[] books) {
		List<Book> result = new ArrayList<>();
		
		for(Book book : books) {
			if("Nhi Đồng".equalsIgnoreCase(book.getPublishingCompany())) {
				result.add(book);
			}
		}
		
		return result;
	}
	
	public static List<Book> getBookPriceLower(Book[] books) {
		List<Book> result = new ArrayList<>();
		
		for(Book book : books) {
			if(book.getPrice() < 50) {
				result.add(book);
			}
		}
		
		return result;
	}
	
	public static List<Book> getBookFrom100To200(Book[] books) {
		List<Book> result = new ArrayList<>();
		
		for(Book book : books) {
			if(book.getPrice() > 100 && book.getPrice() < 200) {
				result.add(book);
			}
		}
		
		return result;
	}
	
	public static double simulator(OrderDetail orderDetail) {
		int result = 0;
		for(Order order : orderDetail.getOrder()) {
			result += order.getBooks().getPrice() * order.getQuantity();
		}
		
		return result;
	}
}
