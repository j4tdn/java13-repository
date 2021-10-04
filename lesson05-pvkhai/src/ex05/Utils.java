package ex05;


public class Utils {
	
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

	

	public static void findBookPrice100To200(Book[] textBooks) {
		for(Book textBook:textBooks) {
			if( textBook.getPrice()>100 && textBook.getPrice() < 200 ) {
				System.out.println(textBook);
			}
		}
	}

	public static double getTotalMoney(TextBook tb,ReferBook rb) {
		double money1 = 0;
		money1 += tb.getPrice();
		if("cũ".equals(tb.getStatus())){
			money1 *= 0.7;
		}
		double money2 = 0;
		money2 += rb.getPrice() * (1 + rb.getTax());
		
		return money1 + money2;
	}
	
}
