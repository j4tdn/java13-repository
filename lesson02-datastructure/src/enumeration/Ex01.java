package enumeration;
//Kiem tra vi tri của diem A so voi duong tron ban kinh R
public class Ex01 {
	public static void main(String[] args) {
		//Input: A(xA,yA), O(xO,yO), R
		//Output: Relative position of A with O(R): OUTSIDE, ONSIDE, INSIDE
		//d(O,A)=sqrt[(xA-xO)^2+(yA-yO)^2]
		Point A=new Point(3,4);
		Point B=new Point(5,6);
		Circle circle = new Circle(new Point(1,1), 5);
		CirclePos posA=getPos(A,circle);
		CirclePos posB=getPos(B,circle);
		System.out.println("posA: "+posA.getLocalized());
		System.out.println("posB: "+posB);
	}
	//xac dinh vi tri cua 1 diem so voi duong tron
	private static CirclePos getPos(Point A, Circle circle) {
		double OA=Math.sqrt(Math.pow(A.x-circle.p.x, 2)+Math.pow(A.y- circle.p.y,2));
		if(OA>circle.R) return CirclePos.OUTSIDE;
		else if (OA==circle.R) return CirclePos.ONSIDE;
		else return CirclePos.INSIDE;
	}
}
