package enumeration;

import java.util.Scanner;

public class Ex01 {
private static CirclePos getPos(int xa, int ya, int xo, int yo,double  R) {
	double d;
	d = Math.sqrt( Math.pow(xa-xo, 2) + Math.pow(ya-yo, 2));
	
	if( d == R) return CirclePos.ONSIDE;
	else if (d>R) return CirclePos.OUTSIDE;
	else return CirclePos.INSIDE;
	
	}
	
	public static void main(String[] args) {
		//Input: A(xA,yA), O(xo,yo), R
		//Output: Related position of A with O(R) : OUTSIDE, INSITE, ONSITE
		// d(OA) = sqrt((Xa-Xo)^2 + (Ya - Yo)^2)
		
		Scanner kb = new Scanner(System.in);
		
		Point pA = new Point(2,4);
		Point pB = new Point(7,8);
		Circle O = new Circle(new Point(0,0),5);	
		CirclePos posA = getPos(pA.x, pA.y,O.p.x , O.p.y, O.R);
		CirclePos posB = getPos(pB.x, pB.y, O.p.x,O.p.y, O.R);
		System.out.println("PosA: "+ posA.getLocalied());
		System.out.println("PosB: "+ posB);
	}
	
}
