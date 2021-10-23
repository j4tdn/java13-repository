package ex05;


public class ReferenceBook extends Book {
	private double tax;

	public ReferenceBook() {
		
	}
	
	public ReferenceBook(String bookCode, Double price, String bookSource,double tax) {
		// Chưa hiểu về kế thừa trong hướng đối tượng
		// Khi khởi tạo con gọi đến cha. E dùng super như bên dưới để set lại value của 3 tham số từ cha nha
		super(bookCode, price, bookSource);
		this.tax = tax;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "ReferenceBook: tax = " + tax;
	}

}
