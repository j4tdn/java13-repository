package ex05;


public class App {
	public static void main(String[] args) {
		Book [] book;
		book = createArray();
		show(book);
		System.out.println("------------");
		Book [] f = findBook(book);
		show(f);
		System.out.println("------------");
		Book [] f1 = findBook(book,"Nhi Dong");
		show(f1);
		System.out.println("------------");
		Book [] f2 = findBook(book,50.0);
		show(f2);
		
		
		
		
	}
	
	private static Book [] createArray() {
		Book t1 = new TextBook("SGK01", 50, "GD-DT", "NEW");
		Book t2 = new TextBook("SGK02", 150, "Nhi Dong", "OLD");
		Book t3 = new TextBook("SGK03", 300, "tuoi tre", "NEW");
		Book r1 = new ReferenceBook("STK01", 46, "Nhi Dong", 30);
		Book r2 = new ReferenceBook("STK02", 80, "GD-DT", 20);
		Book [] b = {t1,t2,t3,r1,r2};
		return b;
		
	}
	
	private static Book [] findBook(Book [] a, String publisher) {
		Book [] b = new Book[a.length];
		int i = 0;
		for( Book book : a) {
			if(book.getPublisher().equals(publisher)) {
				b[i] = book;
				i++;
			}
		}
		Book [] result = new Book[i];
		for(int j =0; j < i ; j++ ) {
			result[j] = b[j];
		}
		return result;
	}
	private static Book [] findBook(Book [] a, Double cost) {
		Book [] b = new Book[a.length];
		int i = 0;
		for( Book book : a) {
			if(book.getCost() < cost) {
				b[i] = book;
				i++;
			}
		}
		Book [] result = new Book[i];
		for(int j =0; j < i ; j++ ) {
			result[j] = b[j];
		}
		return result;
	}
	private static Book [] findBook(Book [] a) {
		Book [] b = new Book[a.length];
		int i = 0;
		for( Book book : a) {
			if(book instanceof TextBook && book.getCost() > 100 && book.getCost() < 200) {
				b[i] = book;
				i++;
			}
		}
		Book [] result = new Book[i];
		for(int j =0; j < i ; j++ ) {
			result[j] = b[j];
		}
		return result;
	}
	
	private static double getPrice(TextBook a, ReferenceBook b) {
		double price = 0;
			if(a.getStatus().equals("OLD")) {
				price =  price - 0.3*a.getCost() + a.getCost();
			}
			else price =  price + a.getCost();
			price = price + b.getCost()*(1+b.getTax()/100);
		return price;
	}
	
		

	
	private static void show(Book [] a) {
		for(Book book:a) {
			System.out.println(book);
		}
	}
}
