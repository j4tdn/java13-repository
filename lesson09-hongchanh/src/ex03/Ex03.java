package ex03;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Welcome to JAVA10 class";
		String[] b = a.split("[\\s]+");
		String r ="";
		for (String c: b) {
			StringBuilder str = new StringBuilder(c);
			c= str.reverse().toString();
			r= r+c+" ";
		}
		
		System.out.println(r);
	}

}
