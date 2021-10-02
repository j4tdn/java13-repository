package ex05;

public class Main {
	public static void main(String[] args) {
		
		TextBook textBook = new TextBook("SGK1", 20000, "Kim Đồng", "Mới");
		TextBook textBook1 = new TextBook("SGK2", 10000, "Kim Đồng", "Cũ");
		TextBook textBook2 = new TextBook("SGK3", 18000, "Nhi Đồng", "Mới");
		ReferBook book = new ReferBook("STK1", 30000, "Nhi Đồng", 0.1f);
		ReferBook book1 = new ReferBook("STK2", 25000, "Kim Đồng", 0.1f);
		
		Object[] array = {textBook, textBook1, textBook2, book, book1};
		
		
		for(int i = 0; i < array.length; i++) {
			TextBook text = new TextBook();
			if("Nhi Đồng".equals(text.getPublishingCompany())) {
				System.out.println(array[i]);
			}
		}
	}
	
	
	

}
