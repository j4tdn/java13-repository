package ex05;

public class Utils {
	public static Book[] input() {
		Book tb1 = new TextBook("SGK01",45.5f,"Nhi Đồng","cũ");
		Book tb2 = new TextBook("SGK02",120f,"Nhi Đồng","mới");
		Book tb3 = new TextBook("SGK03",42f,"Giáo Dục","cũ");
		
		Book rb1 = new ReferBook("STK01",120.5f,"Giáo Dục",0.5f);
		Book rb2 = new ReferBook("STK02",150f,"Thời Đại",0.5f);
		
		Book[] books = {tb1,tb2,tb3,rb1,rb2};
		
		return books;
	}
	
	public static void findBookNhiDong(Book[] books) {
		for(Book book:books) {
			if("Nhi Đồng".equals(book.getPublisher())) {
				System.out.println(book);
			}
		}
	}
	
	public static void findBookPrice50(Book[] books) {
		for(Book book:books) {
			if(book.getPrice() < 50) {
				System.out.println(book);
			}
		}
	}
	
	public static void findBookPrice100To200(Book[] books) {
		for(Book book:books) {
			if( book.getPrice()>100 && book.getPrice() < 200 ) {
				System.out.println(book);
			}
		}
	}
	

}
