package ex05;

public class TextBook extends Book {
	boolean isOld;
	public TextBook() {}
	public TextBook(String price,String publisher,boolean isOld) {
		this.code="SGK";
		this.publisher=publisher;
		this.isOld=isOld;
	}

	public boolean isOld() {
		return isOld;
	}

	public void setOld(boolean isOld) {
		this.isOld = isOld;
	}
}
