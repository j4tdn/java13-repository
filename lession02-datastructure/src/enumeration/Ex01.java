package enumeration;

public class Ex01 {
	public static void main(String[] args) {
		
		//A
		Point pA = new Point(3, 4);
		
		//0
		Circle circle= new Circle(new Point(0, 0), 5);
		//B
		Point pB = new Point(7, 8);
		
		CirclePos posB = getPos(pB, circle);
		CirclePos posA = getPos(pA, circle);
		System.out.println("posA: " + posA.getlocalized());
		System.out.println("posB: " + posB);
		
		
	}
	private static CirclePos getPos(Point point, Circle circle) {
	double distance = Math.sqrt(Math.pow((point.y + circle.p.y),2) + Math.pow((point.x + circle.p.x),2));
			
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
