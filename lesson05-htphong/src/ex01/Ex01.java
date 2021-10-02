package ex01;

public class Ex01 {
	public static void main(String[] args) {
		if(isPowerOf(8,2)) System.out.println("True");
		else System.out.println("False");
	}
	public static boolean isPowerOf(double a, int b) {
		boolean check=false;
		if(a<1) {
			int i=-1;
			double p=Math.pow(b,i);
			while(p>=a) {
				if(p==a) {
					check=true;
					break;
				}
				else {
					i--;
					p=Math.pow(b, i);
				}
			}
		}
		else {
			int i=0;
			double p=Math.pow(b, i);
			while(a>=p) {
				if(p==a) {
					check=true;
					break;
				}
				else {
					i++;
					p=Math.pow(b, i);
				}
			}
		}
		return check;
	}
}
