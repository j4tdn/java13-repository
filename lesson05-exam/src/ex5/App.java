package ex5;

public class App {
	public static void main(String[] args) {	
		Book b1 = FactoryBook.CreateTextBook("SGK01", 40, "Nhi Đồng", false);
		Book b2 = FactoryBook.CreateTextBook("SGK02", 170, "Đồng Nai", true);
		Book b3 = FactoryBook.CreateTextBook("SGK03", 80, "Nhi Đồng", true);
		Book b4 = FactoryBook.CreateReferenceBook("STK01", 80, "Lạc Việt", 30);
		Book b5 = FactoryBook.CreateReferenceBook("STK02", 195, "Nhi Đồng", 50);
		
		Book[] books = {b1, b2, b3, b4, b5};
		
		System.out.println("List books have publisher that is Nhi Dong: ");
		BookUtils.findBooksOfNhiDongPublisher(books);
		System.out.println("===============================================");
		
		System.out.println("List books have price < 50");
		BookUtils.findBooksHavePriceUnderPriceUnder50(books);
		System.out.println("===============================================");
		
		System.out.println("List reference books have price from 100 to 200");
		BookUtils.findBooksHavePriceFrom_100_To_200(books);
		System.out.println("===============================================");
		
		Client c1 = new Client("PTN01", "Phạm Thành Nguyên" , "0944914297", "Quảng Nam");
		Book[] bc1 = {b2, b5};
		Order o1 = new Order(c1, bc1);
		System.out.println("Total money that client PTN01 must charge: ");
		System.out.println(OrderUtils.getTotalMoney(o1));
	}
}
