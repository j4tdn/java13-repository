package operator;

public class Ex02 {

	public static void main(String[] args) {
		int x = 5, y = 2, z = 3;
		y = y + x++ + z++ + ++z + ++x - y-- + z;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		System.out.println("===========");
		// 7, 25, 5
		x = ++x + x++ + y-- + z;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
	}

}
