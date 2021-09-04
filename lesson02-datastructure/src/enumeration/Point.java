package enumeration;

public class Point {
	public int x; // > x và y là 2 giá trị trên HEAP của từng đối tượng > attribute (global variable)
	public int y;
	
	public Point(int x, int y) { // > x và y là giá trị bên ngoài trên vào lúc khởi tạo đối tượng > local variable
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		// VD: (5, 4) 
		return "(" + this.x + ", " + this.y + ")";
				
	}


}
