package lesson05;

import java.util.Arrays;

public class AppLambda {
	public static void main(String[] args) {
		Book[] books = getBook();
		
		//Opt3 : anonymous function >> JAVA8
		//Interface interface = (/* danh sách tham số của hàm trừu tượng >> Condition */) -> {
			//override/thưc thi của abstract method
		//}
		//Anonymous function = Lambda
		//Target: là 1 cách code ngắn gọn thể hiệ 1 đối tượng của Interface
		Condition lt50 = (Book book) -> {
			return book.getPrice() < 600;
		};
		Book [] booksC =filter(books, lt50);
		System.out.println(Arrays.toString(booksC));
		
		//Opt1
		Condition condition = new Condition() {
			@Override
			public boolean check(Book book) {
				return book.getPrice() >= 200 && book.getPrice() <= 600;
			}
		};
		Book[] booksA = filter(books, condition);
		System.out.println(Arrays.toString(booksA));
		System.out.println("====================================");
		//Opt2 : Implementation class from Strategy interface
		Condition pcd = new PublicherCondition("SWX");
		Book[] booksB = filter(booksA, pcd);
		System.out.println(Arrays.toString(booksB));
	}

	private static Book[] filter(Book[] books, Condition condition) {
		Book[] result = new Book[books.length];
		int index = 0;
		for (Book book : books) {
			if (condition.check(book)) {
				result[index++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, index);

	}
	

	private static Book[] getBook() {
		Textbook tb1 = new Textbook("SGK123", 220, "PLS", Status.NEW);
		Textbook tb2 = new Textbook("SGK258", 456, "STL", Status.OLD);
		ReferenceBook rf1 = new ReferenceBook("STK159", 600, "SWX", 2);
		ReferenceBook rf2 = new ReferenceBook("STK459", 620, "SWA", 3);
		ReferenceBook rf3 = new ReferenceBook("STK472", 840, "SWD", 3);

		return new Book[] { tb1, tb2, rf1, rf2, rf3 };
	}
}
