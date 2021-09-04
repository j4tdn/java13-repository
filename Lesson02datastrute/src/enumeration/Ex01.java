package enumeration;

/**
 * Ex01: Kiểm tra vị trí của điểm A so với đường tròn O bán kính R
 */
public class Ex01 {
	public static void main(String[] args) {
		// Input: A(xA, yA), O(xO, yO), R
		// Output: Relative position of A with O(R): OUTSIDE, ONSIDE, INSIDE.
		// d(OA) = sqrt[(xA-xO)^2 + (yA - yO)^2]
		

		Circle circle = new Circle(new point(0, 0),5);
		point pA = new point(2, 4);
		point pB = new point(7, 8);
		
		CirclePos posA = getPos(pA, circle);
		CirclePos posB = getPos(pB, circle);
		
		System.out.println("posA:" + posA.getLocalized());
		System.out.println("posB:" + posB);
	}	
	
	private static CirclePos getPos(point point, Circle circle)
	{
		double distance = Math.sqrt(Math.pow((point.x-circle.p.x),2) + Math.pow((point.y-circle.p.y),2)) ; 
		// Math.pow ham binh phuong
		// Math.sqrt ham can bac hai
		if (distance > circle.R) {
			return CirclePos.OUTSIDE;
		}
		
		if (distance == circle.R) {
			return CirclePos.ONSIDE;
		}
		return CirclePos.INSIDE;
	}
		
}
