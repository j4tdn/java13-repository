package enumration;

public class Ex01 {
	public static void main(String[] args) {
		int xA = 3;
		int yA = 4;
		
		int x0 = 0;
		int y0 = 0;
		
		int R = 3;
		
		Point pA = new Point(2, 4);
		Point pB = new Point(7, 8);
		
		CirclePos posA = getPos(pA, Circle);
		CirclePos posB = getPos(pB, Circle);
		
		
	}	
		
		private static CirclePos getPos(Point point, Circle circle) {
			double distance = Math.sqrt(Math.pow((point.x -circle.p.x), 2) + Math.pow((point.y - circle.p.y), 2));
			
			if (distance > circle.R) {
				return CirclePos.OUTSIDE;
				
			}
			if (distance == circle.R) {
				return CirclePos.ONSIDE;
				
			}
			else return CirclePos.INSIDE;
		}
}
