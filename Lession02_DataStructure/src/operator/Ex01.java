package operator;

public class Ex01 {
	public static void main(String[] args) {
//		int x = 5 ,y = 2, z = 3;
//		y+= x++ + z++ + ++z  + ++x - y-- +z;
////            5     2     4   	2	4
////            6	  3	    4      1    4
//		System.out.println(x + " "+ y + " "+ z);
		int i = 2;
		if( ++i > 2 && i++ > 2) {
			i++;
		}
		if(i ++ > 4 || ++i >5) {
			System.out.println(i);
		}
		if(i++< 4 || ++i>5 ) {
			System.out.println(i);
		}
	}
	

}
