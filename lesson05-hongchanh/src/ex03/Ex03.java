package ex03;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,6,12,8};
		
		check(a);
	}
	
	private static void check(int[] a) {
		int k= boichung(a[0],a[1]);
		
		for (int i=2; i<a.length; i++) {
			k= boichung(k,a[i]);
		}
		
		System.out.println("boi chung la = "+ k);
	}	
		
	
	private static int boichung(int a, int b) {
		int c,d=0;
		if (a>b) {
			c=a;
			d=b;
		}else {
			c=b;
			d=a;
		}
		int i=1;
		while (c%d != 0) {
			c=c*i;
			i++;
		}
		
		return c;
	}
}
