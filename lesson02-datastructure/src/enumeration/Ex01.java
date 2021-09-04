package enumeration;

/**
 * Ex01: Kiểm tra vị trí của điểm A so với đường tròn ) bán kính R
 */
public class Ex01 {
	public static void main(String[] args) {
		// Input: A(xA, yA) O(x0, y0), R
		// Output: Relative position of A with O(R): OUTSIDE, ONSIDE, INSIDE
		// d(OA) = sqrt[(xA-xO)^2 + (yA-yO)^2]
		
		
		
		// A
		/**int xA = 2;
		int yA = 4; **/
		// B
		/**int xB = 7;
		int yB = 8;**/
		// O
		/**int xO = 0;
		int yO = 0;**/
		
		/** CirclePos posA = getPos(xA, yA, xO, yO, R);
		CirclePos posB = getPos(xB, yB, xO, yO, R); **/
		
		// Cách ngắn gọn: (từ "Point.java")
		Point pA = new Point(2, 4);
		Point pB = new Point(7, 8);
		
		/**Point pO = new Point(0, 0);
		double R = 5;
		Circle circle = new Circle(pO, R);**/
		// Ngắn gọn hơn:
		Circle circle = new Circle(new Point(0, 0), 5);
		
		CirclePos posA = getPos(pA, circle);
		CirclePos posB = getPos(pB, circle);
		
		// cannot set value 
		// posA.localized = "xyz"; (because of "private")
		
		System.out.println("posA: " + posA.getLocalized()); // "posA.getLocalized()" > print value
		System.out.println("posB: " + posB); // "posB.toString" > print name of Enum	
	}
		
		
		/**Cách 1 => đúng tuy nhiên dài dòng; VD cho điểm B thì phải làm y chang => trùng lặp
		double distance = Math.sqrt(Math.pow((xA-xO), 2) + Math.pow((yA-yO), 2));
		System.out.println("distance: " + distance);
		if (distance > R) {
			System.out.println(CirclePos.OUTSIDE);
		return; // (Kết thúc hàm VOID) Nếu thỏa thì kết thúc tại đây, ko thỏa thì xét điều kiện dưới
	}
		if (distance == R) {
			System.out.println(CirclePos.ONSIDE);
			return;
		}
		
		System.out.println(CirclePos.INSIDE); // Nếu ko thỏa 2 cái trên thì in cái còn lại nên ko cần "if" ở đây.
	}
	**/
	
	// Cách khác:
	/**private static CirclePos getPos(int x, int y, int xO, int yO, double R) {
		double distance = Math.sqrt(Math.pow((x-xO), 2) + Math.pow((y-yO), 2));
		if (distance > R) {
			return CirclePos.OUTSIDE; 
	}
		if (distance == R) {
			return CirclePos.ONSIDE;
		}
		
		return CirclePos.INSIDE;
		
	}**/
	
	// Cách tối ưu hơn:
		private static CirclePos getPos(Point point, Circle circle) {
			double distance = Math.sqrt(Math.pow((point.x - circle.p.x), 2) + Math.pow((point.y - circle.p.y), 2));
			if (distance > circle.R) {
				return CirclePos.OUTSIDE; 
		}
			if (distance == circle.R) {
				return CirclePos.ONSIDE;
			}
			
			return CirclePos.INSIDE;
			
		}
}








