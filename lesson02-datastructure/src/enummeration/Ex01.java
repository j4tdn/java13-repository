package enummeration;

public class Ex01 {
	public static void main(String[] args) {

		Circel circle = new Circel(new Point(0, 0), 5);
		Point pA = new Point(2, 4);
		Point pB = new Point(2, 4);

		CirclePos posA = getPos(pA, circle);
		CirclePos posB = getPos(pB, circle);
	}

	private static CirclePos getPos(Point point, Circel circle) {
		double distance = Math.sqrt(Math.pow((point.x - circle.p.x), 2) + Math.pow((point.y - circle.p.y), 2));

		if (distance > circle.R) {
			return CirclePos.OUTSIDE;
		} else if (distance < circle.R) {
			return CirclePos.INSIDE;
		} else {
			return CirclePos.ONSIDE;
		}

	}
}
