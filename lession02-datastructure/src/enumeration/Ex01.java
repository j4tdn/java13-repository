package enumeration;

/**
 * 
 * Ex01: Kiểm tra vị trí của điểm A so với đường tròn O bán kính R;
 *
 */
public class Ex01 {

	public static void main(String[] args) {
		// Input: A(xA, yA) O(xO, yO), R
		// Output: Relative position of A with O(R): OUTSIDE, ONSIDE, INSIDE
		// distance(OA) = sqrt[(xA - xO)^ 2 + (yA - yO)^2]

		// R
		double R = 5;
		
		// A
		Point A = new Point(4, 3);
		
		// B
		Point B = new Point(6, 5);

		// O
		Circle circle = new Circle(new Point(0 ,0), 5);

		CirclePosition posA = getPosition(A, circle);
		CirclePosition posB = getPosition(B, circle);
		
		System.out.println("posA: " + posA.getLocalized());
		System.out.println("posB: " + posB.getLocalized());
		
	}

	private static CirclePosition getPosition(Point point, Circle circle) {

		double distance = Math.sqrt(Math.pow(point.x - circle.p.x, 2) + Math.pow(point.y - circle.p.y, 2));

		System.out.println("Distance: " + distance);

		if (distance > circle.R) {
			return CirclePosition.OUTSIDE;
		} else if (distance == circle.R) {
			return CirclePosition.ONSIDE;
		} else {
			return CirclePosition.INSIDE;
		}

	}

}
