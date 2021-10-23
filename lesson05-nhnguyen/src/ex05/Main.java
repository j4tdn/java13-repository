package ex05;

import java.util.List;

/**
 * Bài 1-4 tương tự commit của bạn VA - Nên bằng điểm
 * A xem qua phần review ở đây: https://github.com/j4tdn/java13-repository/commit/7879e47d899262d252e2526c5a0e5ca9170a928b
 * 
 * Bài 5: Bài làm tốt chỉ có 1 số minor convention ko đáng kể
 * 27đ
 */
public class Main {
	
	public static void main(String[] args) {
		Book[] books = BookUtils.createData();
		List<Book> booksLowerThan50 = BookUtils.getBookPriceLower(books);
		List<Book> booksFrom100To200 = BookUtils.getBookFrom100To200(books);
		
		Customer nguyen = new Customer("01", "NguyÃªn", "0772190059", "Ä�Ã  Náºµng");
		Customer vietAnh = new Customer("012", "Viá»‡t Anh", "21343124", "Ä�Ã  Náºµng");
		
		Book textbook = new TextBook("01", 120, "Nhi Ä�á»“ng", "new");
		Book referBook =  new ReferBook("02", 60, "Kim Ä�á»“ng", 2);
		
		Order o1 = new Order(textbook, 1);
		Order o2 = new Order(referBook, 2);
		Order[] orderArr = {o1, o2};
		
		OrderDetail od1 = new OrderDetail(nguyen,orderArr);
		
		System.out.println(BookUtils.simulator(od1));

	}
}
