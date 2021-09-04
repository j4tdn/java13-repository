package enumeration;
/**
 * 
 * Kiểm tra vị trí tương đối của điểm A so với đường tròn tâm O bán kình R.
 *
 */
public class Ex01 {
	public static void main(String[] args) {
		//Input A(xA, yA), O(x0,y0), R
		//Output: relative position of A with o(R) : outside, onside, inside.
		//d(OA) = sqrt[(xA - xO)^2 + (yA - yO)^2]
		//A
		//int xA = 3;
		//int yA = 5;
		//B
		//int xB = 7;
		//int yB = 8;
		Point pA = new Point(3, 5);
		Point pB = new Point(7, 8);		
		
		
		Circle circle = new Circle(new Point(0, 0), 5);
		
		CirclePos posA = getPos(pA, circle);
		CirclePos posB = getPos(pB, circle);
		
		System.out.println("posA: " + posA.getlocalized() );
		System.out.println("posB: " + posB);
	}	
	private static CirclePos getPos(Point point,Circle circle) {
		double distance = Math.sqrt(Math.pow((point.x - circle.p.x), 2) + Math.pow((point.y-circle.p.y), 2));
		if (distance > circle.R) {
			return(CirclePos.OUTSIDE);
		}
		if (distance == circle.R) {
			return(CirclePos.ONSIDE);
		}
		return (CirclePos.INSIDE) ;
	}
}

