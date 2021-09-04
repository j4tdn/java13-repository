package operator;

public class Ex02 {
	public static void main(String[] args) {
		int x =5, y = 2, z = 3;
		//y += x++ + z++ + ++z + ++x - y-- +z;
		y = y + x++ + z++ + ++z + ++x - y-- +z;
		System.out.println("x=" + x); // 7
		System.out.println("y=" + y); // 25
		System.out.println("z=" + z); // 5
		
		System.out.println("============");
		
		// x=7, y =25, z=5
		x = ++x + x++ + y-- +z;
		System.out.println("x=" + x); // 46
		System.out.println("y=" + y); // 24
		System.out.println("z=" + z); // 5
	}

}
