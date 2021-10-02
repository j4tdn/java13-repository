package ex05;

public class App {
	public static void main(String[] args) {
		TextBook t1= new TextBook("SGK1",45,"Nhi Đồng", "new");
		TextBook t2= new TextBook("SGK2",12,"Nhi Đồng", "old");
		TextBook t3= new TextBook("SGK3",100,"Kim Đồng", "new");
		ReferBook r1= new ReferBook("STK1",96,"Nhi Đồng", 0.15d);
		ReferBook r2= new ReferBook("STK2",150,"Kim Đồng", 0.17d);
		Book[] books = {t1, t2, t3, r1, r2};
		System.out.println("Sách thuộc nhà xuất bản Nhi Đồng: ");
		for(int i=0; i<books.length;i++) {
			if(books[i].checkPublisher()) System.out.println(books[i].toString());
		}
		System.out.println("========================================");
		System.out.println("Sách có đơn giá nhỏ hơn 50: ");
		for(int i=0; i<books.length;i++) {
			if(books[i].checkPriceLessThan50()) System.out.println(books[i].toString());
		}
		System.out.println("========================================");
		System.out.println("Sách có đơn giá từ 100 đến 200 ");
		for(int i=0; i<books.length;i++) {
			if(books[i].priceBetween100And200()) System.out.println(books[i].toString());
		}
		
		Customer c1 = new Customer(123,"Nguyễn Văn A", "0865234123", "123 Ngũ Hành Sơn");
		Order order = new Order(c1,new DetailBook[] {new DetailBook(t1,1), new DetailBook(r1,1)});
		System.out.println("Số tiền mà khách hàng phải trả: "+order.totalPrice());
	}
}
