package bean;

public class Item {
		//attributes >> global varible
		public int id;
		public String name;
		public double price;
		
		//constructor hàm đối tượng
		// no return type & name same as class name  ko có hàm trả về và tên giống vowisteen hàm
		
		
		public Item(int pId, String pName, double pPrice) {
			// TODO Auto-generated constructor stub
			this.id = pId;
			this.name = pName;
			this.price = pPrice;
		}

		@Override
		public String toString() {
			return this.id + ", " + this.name + ", " + this.price;
		}
}
