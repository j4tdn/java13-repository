package operator;

public class Ex02 {
	public static void main(String[] args) {
		int x =5;
		int y = 2;
		int z = 3;
		y += x++ +z++ + ++z + ++x - y-- + z;
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		System.out.println("z:"+z);
		x = x++ + x++ +y-- +z;
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		System.out.println("z:"+z);
	}
}
