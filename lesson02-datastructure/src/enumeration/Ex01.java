package enumeration;
/* kiem tra vi tri cua diem A so vs đuòng tron o bán kinh r*/

public class Ex01 {
	public static void main(String[] args) {
		//Input:A(xA,yA), O(xO,yO),R
		//Output: Relative position of A with O(R)
		//d(OA) = Sqrt[(xA-xO)^2-(yA-yO)^2]
		
		//A
		Point pA = new Point(1,1);
		Point pB = new Point(4,9);
		
		Circle circle =new Circle(new Point(0,0),5);
		
		CirclePos posA = getPos(pA,circle);
		CirclePos posB = getPos(pB,circle);
		
		System.out.println(posA.getLocalized());
		System.out.println(posB);
	
	}
	private static CirclePos getPos(Point point,Circle circle) {
		double distance = Math.sqrt(Math.pow((point.x-circle.p.x), 2) + Math.pow((point.y-circle.p.y), 2));
		
		if(distance>circle.R) {
			return CirclePos.OUTSIDE;			
		}
		if(distance==circle.R) {
			return CirclePos.ONSIDE;
			
		}
		return CirclePos.INSIDE;
		
	}
}
