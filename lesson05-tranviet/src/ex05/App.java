package ex05;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		TextBook tb1 = new TextBook("SGK_100", 40d, "Nhi Đồng", "New");
		TextBook tb2 = new TextBook("SGK_101", 120d, "Nhi Đồng", "Old");
		TextBook tb3 = new TextBook("SGK_102", 150d, "Thiếu Nhi", "Old");
		ReferenceBook rb1 = new ReferenceBook("STK_100", 20d, "Cô Tiên Xanh", 0.03);
		ReferenceBook rb2 = new ReferenceBook("STK_101", 300d, "Nhi Đồng", 0.04);
		
		Book[] books = {tb1, tb2, tb3, rb1, rb2};
		
		System.out.println("==> Toàn bộ sách thuộc nhà xuất bản Nhi Đồng: ");
		BookUtils.findAllNhiDongBooks(books);
		
		System.out.println("==> Toàn bộ sách có đơn giá nhỏ hơn 50: ");
		BookUtils.findAllBooksWithPriceLessThan50(books);
		
		System.out.println("==> Toàn bộ sách giáo khoa có đơn giá từ 100 đến 200");
		BookUtils.findAllBooksWithPriceBtw100and200(new TextBook[] {tb1, tb2,tb3});
		
		Customer c1 = new Customer("C1", "Trần Công Việt", "0935169835", "Quảng Nam");
		Shopping s1 = new Shopping(c1, new ReferenceBook[] {rb2}, new TextBook[] {tb2});
		Double totalPrice = ShoppingUtils.getToTalPrice(s1);
		System.out.println("==> Tổng tiền khách hàng s1 phải thanh toán là: " + totalPrice);
	}
	
	
}
