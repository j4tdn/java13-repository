package ex01;
//bai 1:Viet 1 ham kiem tra xem 1 so co phai luy thua cua so khac khong.
public class Power {
	public static void main(String[] args) {
		System.out.println(isPowerOf(8,2));
		System.out.println(isPowerOf(12,2));
		System.out.println(isPowerOf(3,9));
		
	}
	public static boolean isPowerOf(int a,int b) {
		if (a==0||b==0) return false;
		if (a==1||b==1) return true;
		if (a==b) return true;
		if (a>b) {
			if (a%b==0) return isPowerOf(a/b,b);
				else    return false; 
		}
		else {
			if (b%a==0) return isPowerOf(a,b/a);
				else        return false;
		}
	}
}
