import bean.Vehicle;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle a = new Vehicle("Nguyen Thu Loan","Future neo",100l,35000000l);
		Vehicle b = new Vehicle("Le Minh Tinh","Ford Ranger",3000l,25000000l);
		Vehicle c = new Vehicle("Nguyen Minh Tri","Landscape",1500l,1000000000l);
		
		a.setThue();
		b.setThue();
		c.setThue();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		

	}

}
