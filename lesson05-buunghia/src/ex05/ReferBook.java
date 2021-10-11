package ex05;

public class ReferBook extends Book {
	double tax;
	public ReferBook() {}
	public ReferBook(double price,String publisher,double tax) {
		// Có thể e hiểu sai đề rồi
		// Cái code này mình sẽ gán code của nó sau
		// code của nó sẽ bắt đầu bằng STK chứ k phải bằng STK
		this.code="STK";
		this.price=price;
		this.publisher=publisher;
		this.tax=tax;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
}
