package enumeration;

public class Ex01 {
	public static void main(String[] args) {
//		int xA=3, yA=4, xO=0, yO=0, R=5;
//		int x = xA-xO;
//		int y = yA-yO;
//		double d = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
//		if(d<R) {
//			System.out.println("A nam trong duong tron");
//		}
//		else if(d==R) {
//			System.out.println("A nam tren duong tron");
//		}
//		else {
//			System.out.println("A nam ngoai duong tron");
//		}
		
		Circle circle = new Circle(new Point(0,0), 5);

		Point pA = new Point(2, 4);
		Point pB = new Point(7, 8);
		
		CirclePos posA = getPos(pA, circle);
		CirclePos posB = getPos(pB, circle);
		
		System.out.println("posA: "+ posA.getLocalized());
		System.out.println("posA: "+ posB);
		
		
	}
	
	private static CirclePos getPos(Point point, Circle circle) {
		double distance = Math.sqrt(Math.pow(point.x - circle.p.x, 2) +  Math.pow((point.y - circle.p.y), 2));
		if (distance > circle.R) {
			return CirclePos.OUTSIDE;
		}
		if (distance == circle.R) {
			return CirclePos.ONSIDE;
		}
		return CirclePos.INSIDE;
	}
}	
