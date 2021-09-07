
public class Ex02 {
public static void main(String[] args) {
	System.out.println(giaithua(2));
	System.out.println(giaithua(4));
	System.out.println(giaithua(7));
	System.out.println(giaithua(12));
	System.out.println(giaithua(18));
	Long s = giaithua(4) +giaithua(7) +giaithua(12) +giaithua(18);
	System.out.println("s = 4! +7! +12! +18! = " +s);
	
}
private static Long giaithua (Integer a) {
	Long r = 1L;
	if (a == 0) {
		return r;}
	while (a>0) {
		r = r * a;
		a = a-1;
	}
	
	return r;
}
}
