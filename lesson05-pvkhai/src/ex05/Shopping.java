package ex05;

public class Shopping {
	private Customer cus;
	private TextBook[] textBooks;
	private ReferBook[] referBooks;
	
	public Shopping() {
		// TODO Auto-generated constructor stub
	}

	public Shopping(Customer cus, TextBook[] textBooks, ReferBook[] referBooks) {
		super();
		this.cus = cus;
		this.textBooks = textBooks;
		this.referBooks = referBooks;
	}

	public Customer getCus() {
		return cus;
	}

	public void setCus(Customer cus) {
		this.cus = cus;
	}

	public TextBook[] getTextBooks() {
		return textBooks;
	}

	public void setTextBooks(TextBook[] textBooks) {
		this.textBooks = textBooks;
	}

	public ReferBook[] getReferBooks() {
		return referBooks;
	}

	public void setReferBooks(ReferBook[] referBooks) {
		this.referBooks = referBooks;
	}
	
	
}
