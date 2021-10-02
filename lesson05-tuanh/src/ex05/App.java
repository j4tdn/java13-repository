package ex05;
/*
 * Bài 5: Viết chương trình mô ph�?ng việc mua bán sách giữa khách hàng
 * và nhân viên trong cửa hàng A.
 */
public class App {
	public static void main(String[] args) {
		TextBook book1 = new TextBook("SGK_001",53000d, "Nhi �?ồng", "New");
		TextBook book2 = new TextBook("SGK_002",55000d, "Sao Mai", "Old");
		TextBook book3 = new TextBook("SGK_003",59000d, "Nhi �?ồng", "New");
		
		ReferenceBook book4 = new ReferenceBook("STK_001", 60000d, "Nhi �?ồng", 0.1d);
		ReferenceBook book5 = new ReferenceBook("STK_002", 70000d, "Sao Mai", 0.3d);
		
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3);
		System.out.println(book4);
		System.out.println(book5);

		Book[] arrays = {book1,book2,book3,book4,book5};
		
		for (Book array: arrays) {
			if("Nhi �?ồng".equals(array.getBookSource())){
				System.out.println(array);
			}
		}	
	}		
}


