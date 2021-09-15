package been;
/**
 * Class Rectangel >> create các đối tượng
 * + attributes ( thuộc tính ) : width , height
 * ++ order of constructor,  getter , setter , toString
 * 1. Empty Constructor
 * 2. Contructor
 * 3. getter , setter
 * 4. toString
 */

public class Rectangel {
	
	//
	private int width;
	private int heigh;
	
	
	public Rectangel() {
		
	}
	//Muốn không lỗi thì sẽ tạo 1 hàm khởi tạo rỗng khác.
	
	//khi tạo 1 class mặc dịnh đã có 1 hàm khởi tạo rỗng:
	//public Rectangel() {
	//contructor
	//Khi tạo thêm 1 hàm khởi tạo mới thì hàm khởi tạo rỗng đó sẽ tự mất đi
	// Constructur
	public Rectangel(int width, int heigh) {
		super();
		this.width = width;
		this.heigh = heigh;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeigh() {
		return heigh;
	}

	public void setHeigh(int heigh) {
		this.heigh = heigh;
	}

	@Override
	public String toString() {
		return "w" + this.width + ", h" + this.heigh;
	}
	
	
}
