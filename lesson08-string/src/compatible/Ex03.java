package compatible;

public class Ex03 {
	public static void main(String[] args) {
		// Compare address: .compareTo( : coding >> rarely use
		// Compare content: compareTo ( override from Object class), compareTo
		String s1 = "Hello";
		String s2 = "Machine";
		String s3 = "Hello";
		
		// return positive or negative value
		// A: 65
		// B: 66
		// a: 92
		// b: 93
		// "A".compareTo("B") >> -1
		// "AaB".compareTo("AeG") >> so sanh tung ki tu
		
		// >0 : 1st > 2nd
		// =0 : 1st = 2nd
		// <0 : 1st < 2nd
		
		System.out.println("s1,s2: " + (s1 .compareTo( s2)));
		System.out.println("s2,s3: " + (s2 .compareTo( s3)));
		System.out.println("s1,s3: " + (s1 .compareTo( s3)));
		
		String o1 = new String ("Welcome");
		String o2 = new String ("Welcome");
		String o3 = new String ("Student");
		
		System.out.println("o1,o2: " + (o1 .compareTo( o2)));
		System.out.println("o2,o3: " + (o2 .compareTo( o3)));
		System.out.println("o1,o3: " + (o1 .compareTo( o3)));
		
	}
}
