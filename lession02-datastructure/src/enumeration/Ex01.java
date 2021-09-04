package enumeration;
/*
 * Ex01: Kiểm tra vị trí của điểm A so với đường tròn O bán kính R
 * 
 */
public class Ex01 {
	public static void main(String[] args) {
		//Input: A(xA, yA), O(xO,yO), R
		//Output: Relative position of A with O(R)
		
		
		Point pointB = new Point(3, 4);
		Point pointO = new Point(0,0);
		
		
		Circle circle = new Circle(pointO, 6);
		
		CirclePostition posB = getPos(pointB, circle);
		//cannot set value
		
		
		System.out.println("posB: " + posB.getLocalized());
		
	}
	private static CirclePostition getPos(Point point, Circle circle) {

		double d = Math.sqrt(Math.pow((point.x-circle.pO.x),2) + Math.pow((point.y-circle.pO.y),2));
		
		System.out.println("Distance: " + d);
		if(d > circle.R) {
			return CirclePostition.OUTSIDE;
			
		}
		if(d == circle.R) {
			return CirclePostition.ONSIDE;
			
		}
		else	return CirclePostition.INSIDE;
		
	}
	
}
