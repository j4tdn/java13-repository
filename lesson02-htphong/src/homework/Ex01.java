package homework;
import java.util.*;
public class Ex01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double a = input.nextDouble();
		if(expo(a)) System.out.println("true");
		else System.out.println("false");
	}
	public static boolean expo(double a) {
		boolean check=false;
		if(a<1) {
			int i=-1;
			double p=Math.pow(2,i);
			while(p>=a) {
				if(p==a) {
					check=true;
					break;
				}
				else {
					i--;
					p=Math.pow(2, i);
				}
			}
		}
		else {
			int i=0;
			double p=Math.pow(2, i);
			while(a>=p) {
				if(p==a) {
					check=true;
					break;
				}
				else {
					i++;
					p=Math.pow(2, i);
				}
			}
		}
		return check;
	}
}
