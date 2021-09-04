package bean;

public class Item {
	//attributes >> glocal variable
	public int id;
	public String name;
	public double price;
	// constructor : hàm khởi tạo
	//hàm khởi tạo không có kiểu trả về và giống tên với class
	
	public Item(int pId, String pName, double pPrice ) {
		this.id = pId;
		this.name = pName;
		this.price = pPrice;
		
	} 
	//@Override
	public String toString() {
		return this.id + "," + this.name + "," + this.price;
	}
}