package ontap;

public class Bt01 {
	public static void main(String[] args) {
		Point pA = new Point(5, 6);
		Point pB = new Point(9, 6);
		
		double R = 9;
		Diem diem = new Diem(new Point(0, 0), R);
		
		CircleP posA = getPoint(pA, diem);
		CircleP posB = getPoint(pB,diem);
		
		System.out.println("A: " + posA.value);
		System.out.println("B: " + posB.value);		
	}
	private static CircleP getPoint(Point point,Diem diem) {
		double khoangcan = Math.sqrt(Math.pow(point.x-diem.p.x, 2) + Math.pow(point.y-diem.p.y, 2));
		if (khoangcan == diem.R) {
			return CircleP.ONSIDE;
		}
		if (khoangcan > diem.R) {
			return(CircleP.OUTSIDE);
		}
		return(CircleP.INSIDE);
		
		
	}
	
}
