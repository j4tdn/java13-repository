package ex5;

public class BookUtils {
	private BookUtils() {
		
	}
	
	public static void findBooksOfNhiDongPublisher(Book[] books) {
		for (Book booki : books) {
			if (booki.getPublisher().equals("Nhi Đồng")) {
				System.out.println(booki);
			}
		}
	}
	
	public static void findBooksHavePriceUnderPriceUnder50(Book[] books) {
		for (Book booki : books) {
			if (booki.getPrice() < 50) {
				System.out.println(booki);
			}
		}
	}
	
	public static void findBooksHavePriceFrom_100_To_200(Book[] books) {
		for (Book booki : books) {
			if (booki.getIdBook().contains("SGK") && booki.getPrice() >= 100 && booki.getPrice() <= 200) {
				System.out.println(booki);
			}
		}
	}
}
