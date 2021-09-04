package operator;

public class Ex03 {
	public static void main(String[] args) {
		int i = 2;
		//boolean bt1 = ++i > 2;
		if (++i > 2 && i++ > 2) {
			i++;
		}
		
		if (i++ > 4 || ++i > 5) {
			System.out.println(i);
		}
		
		if (i++ < 4 || ++i > 5) {
			System.out.println(i);
		}
	}
}
