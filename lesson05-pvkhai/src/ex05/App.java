package ex05;

public class App {
	public static void main(String[] args) {
		
		TextBook tb1 = new TextBook("SGK01",45.5f,"Nhi Đồng","cũ");
		TextBook tb2 = new TextBook("SGK02",120f,"Nhi Đồng","mới");
		TextBook tb3 = new TextBook("SGK03",42f,"Giáo Dục","cũ");

		ReferBook rb1 = new ReferBook("STK01",48f,"Giáo Dục",0.5f);
		ReferBook rb2 = new ReferBook("STK02",150f,"Nhi Đồng",0.5f);

		Book[] books = {tb1,tb2,tb3,rb1,rb2};

		System.out.println("Sách thuộc nhà xuất bản Nhi Đồng: ");
		Utils.findBookNhiDong(books);
		System.out.println("\nSách có giá nhỏ hơn 50: ");
		Utils.findBookPrice50(books);
		System.out.println("\nSách giáo khoa có giá từ 100-200: ");
		
		TextBook[] textBooks = {tb1,tb2,tb3};
		Utils.findBookPrice100To200(textBooks);
		
		System.out.println("\n=======TOTAL MONEY=======");
		System.out.println(Utils.getTotalMoney(tb2, rb2));
	}
}
