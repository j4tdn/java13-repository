package enumeration;
/**
 * Ex01: Kiểm tra vị trí của điểm A so với đường tròn O bán kính R
 */

public class Ex01 {
	public static void main (String[] args) {
		// Input: A(xA, yA), O(xO, yO), R
		// Output: Relative position of A with O(R): OUTSIDE, ONSITE, INSIDE
		// d(OA) = sqrt[(xA)-xO^2 + (yA-yO)^2]
		
		double R = 5;
		
		//A
		int xA = 3;
		int yA = 4;
		
		//O
		int xO = 0;
		int yO = 0;
		
		CirclePos posA = getPos(xA, yA, xO, yO, R);
		//CirclePos posB = getPos(xB, yB, xO, yO, R);
	}
	
	public static CirclePos getPos(int x, int y, int x0, int y0, double R) {
		double distance = Math.sqrt(Math.pow((x-x0),2) + Math.pow((y-y0),2));
		System.out.println("distance: " + distance);
		if (distance > R) {
			return CirclePos.OUTSIDE;
		}
		
		if (distance == R) {
			return CirclePos.ONSIDE;
		}
		
		return CirclePos.INSIDE;
	}
}
