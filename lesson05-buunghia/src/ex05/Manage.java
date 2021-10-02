package ex05;
import java.util.ArrayList;

public class Manage {
	ArrayList<Book> bookList = new ArrayList<>();
	public ArrayList<Book> findBookByPublisher(ArrayList<Book> bookList,String publisher) {
		ArrayList<Book> list =new ArrayList<>();
		for (Book book:bookList) {
			if (book.getPublisher().equalsIgnoreCase(publisher)) list.add(book);
		}
		return list;
	}
	
	public ArrayList<Book> findBookByPrice(ArrayList<Book> bookList,double priceMin,double priceMax){
		ArrayList<Book> list= new ArrayList<>();
		for (Book book:bookList) {
			if (book.getPrice()>=priceMin&&book.getPrice()>=priceMax)
				list.add(book);
			}
		return list;
		}
	public ArrayList<Book> findBookByPrice(ArrayList<Book> bookList,double priceMin,double priceMax,String code){
		ArrayList<Book> list= new ArrayList<>();
		for (Book book:bookList) {
			if (book.getPrice()>=priceMin&&book.getPrice()>=priceMax&&book.getCode().equalsIgnoreCase(code))
				list.add(book);
			}
		return list;
		}
	public double price(ArrayList<Book> bookList) {
		double a=0;
		for (Book book:bookList) {
			if (book instanceof TextBook) {
				TextBook textbook = (TextBook) book;
				if (textbook.isOld) a+=textbook.getPrice()*0.7;
				else a+=textbook.getPrice();
			}
			else {
				ReferBook referbook=(ReferBook) book;
				a+=referbook.getPrice()*(1+referbook.getTax());
			}
		}
		return a;
	}
}
	

