package ex05;

import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		Book[] books = BookUtils.createData();
		List<Book> booksLowerThan50 = BookUtils.getBookPriceLower(books);
		List<Book> booksFrom100To200 = BookUtils.getBookFrom100To200(books);
		
		Customer nguyen = new Customer("01", "Nguyên", "0772190059", "Đà Nẵng");
		Customer vietAnh = new Customer("012", "Việt Anh", "21343124", "Đà Nẵng");
		
		Book textbook = new TextBook("01", 120, "Nhi Đồng", "new");
		Book referBook =  new ReferBook("02", 60, "Kim Đồng", 2);
		
		Order o1 = new Order(textbook, 1);
		Order o2 = new Order(referBook, 2);
		Order[] orderArr = {o1, o2};
		
		OrderDetail od1 = new OrderDetail(nguyen,orderArr);
		
		System.out.println(BookUtils.simulator(od1));

	}
}
