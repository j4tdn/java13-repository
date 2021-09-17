package bean;
/**
 * 
 * Class Rectangle >> Crerate some object
 * + attributes: width, height;
 * ++ orrder of constructor , getter, setter, toString
 * mục đích của constructor: khởi tạo đối tượng cụ thể là khởi tạo 1 ô nhớ heAD,LƯU TRỮ DỮ liệu trên vừng nhớ Head
 *  --------getter: lấy giá trị của đối tượng
 *  --------setter: cập nhật giá trị
 */
public class Rectangle {
	//attributes
    private int width;
    private int height;

    //default empty 
    public Rectangle() {
	}
   
    public Rectangle( int pw, int ph) {
    		this.width = pw;
    		this.height = ph;
    	}
   /* //getter >> get attribute value
    public int getWidth() {
    	return this.width;
    }
    //setter >> truyền tham số vào cho 1 đối tượng
    public void setWitdth(int width) {
    	this.width = width;
    }
    */
    

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}	
	@Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "w" + this.width + "h" +this.height;
    }
}
