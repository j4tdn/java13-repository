package enumeration;

public class Ex01 {
	public static void main(String[] args) {
		// Input: A(xA, yA), O(xO, yO), R
		// Output: Relative position of A with O(R): OUTSIDE, ONSIDE, INSIDE
		// d(OA) = sqrt[(xA - xO)^2 + (yA - yO)^2]
		
		Circle circle = new Circle(new Point(0,0) , 5);
		
		Point pA = new Point(2,4);
		Point pB = new Point(7,8); 
		
		
		
		CirclePos posA = getPos(pA, circle);
		CirclePos posB = getPos(pB, circle);
		
		System.out.println("posA: " + posA.getLocalized());
		System.out.println("posB: " + posB.getLocalized());
		
	}
	
	private static CirclePos getPos(Point point, Circle circle) {
		double distance = Math.sqrt(Math.pow((point.x - circle.p.x),2) + Math.pow((point.y - circle.p.y),2));
		System.out.println("distance: " + distance);
		if (distance > circle.R) {
			return CirclePos.OUTSIDE;
		}
		
		if (distance == circle.R) {
			return CirclePos.ONSIDE;
		}
		
		return CirclePos.INSIDE;
	}
	
}
