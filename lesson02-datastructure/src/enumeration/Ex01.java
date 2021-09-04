package enumeration;

public class Ex01 {
	public static void main(String[] args) {
		Point pointA = new Point(3,4);
		Point pointB = new Point(7,8);
		
		System.out.println("A: " + pointA);
		System.out.println("B: " + pointB);
				
		Circle circle = new Circle(new Point(), 5);
		CirclePos PosA = getPos(pointA, circle);
		CirclePos PosB = getPos(pointB, circle);
		System.out.println("PosA: " + PosA.getLocalized());
		System.out.println("PosB: " + PosB);
		
		//null
		System.out.println(CirclePos.OFSIDE.getLocalized());
	}

	public static CirclePos getPos(Point A, Circle c) {
		double distance = Math.sqrt(Math.pow(A.getX() - c.getP().getX(), 2) + Math.pow(A.getY() - c.getP().getY(), c.getR()));
		if (distance < c.getR()) {
			return CirclePos.INSIDE;
		} else if (distance == c.getR()) {
			return CirclePos.ONSIDE;
		} else {
			return CirclePos.OUTSIDE;
		}
	}
}
