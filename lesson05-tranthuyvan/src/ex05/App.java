package ex05;

public class App {
	public static void main(String[] args) {
		
		//Viết hàm tạo dữ liệu sách cho cửa hàng.
		Book b1 = FactoryBook.createTextbook("SGK1", 500, "Nhi Dong", "new");
		Book b2 = FactoryBook.createTextbook("SGK2", 30, "Kim Dong", "old");
		Book b3 = FactoryBook.createTextbook("SGK3", 70, "Thai Ha", "new");
		Book b4 = FactoryBook.createReferBook("STKA", 90, "Nhi Dong", 5);
		Book b5 = FactoryBook.createReferBook("STKB", 120, "Nhi Dong", 7);
		
		System.out.println("List of book: ");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		
		// Tìm toàn bộ sách thuộc nhà xuất bản Nhi Đồng
		Book b = new Book();
		Textbook tb = new Textbook();
		ReferBook rb = new ReferBook();
		
		Book[] books = {b1, b2, b3, b4, b5};}
	
		public static void Book(Book[] books) {
			for (Book book : books) {
			System.out.println(book);
			}
		}
		
		public static void nhiDong(Book[] books) {
		System.out.println("Books of NhiDong's Publishing House: ");
			for (Book book : books) 
				if(book.getPlaceOfPub().equals("Nhi Dong")) {
					System.out.println(book);
				}
		}
		
		// Tìm toàn bộ sách có đơn giá nhỏ hơn 50
		public static void CostLessThan50(Book[] books) {
			System.out.println("List books have cost less than 50: ");
			for (Book book : books) 	
				if(book.getCost() > 50) {
					System.out.println(book);
				}
		}
			
		// Tìm toàn bộ sách giáo khoa có đơn giá từ 100 đến 200
		public static void getBook(Book[] books) {
			System.out.println("List books have cost from 100 to 200: ");
			for (Book book : books) 	
				if(book.getCost() <= 100 && book.getCost() < 200) {
					System.out.println(book);
				}
		}
		
		// Viết hàm tính tổng tiền mà khách hàng phải thanh toán.
		
			
		}
		
	

