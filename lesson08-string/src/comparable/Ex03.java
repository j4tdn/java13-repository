package comparable;

public class Ex03 {
	public static void main(String[] args) {

		//compare content: equals, compareTo
		//return positive/negative value
		//A: 65
		//B: 66
		//a: 92
		//b: 93
		//"A".compareTo("D") >> -3
		//"AeB".compareTo("AaG") >> 4
		//
		
		String s1 = "hello";
		String s2 = "java";
		String s3 = "hello";

		System.out.println("s1, s2: " + (s1.compareTo(s2)));
		System.out.println("s1, s3: " + (s1.compareTo(s3)));
		System.out.println("s2, s3: " + (s2.compareTo(s3)));

		String o1 = new String("hello");
		String o2 = new String("java");
		String o3 = new String("hello");

		System.out.println("o1, o2: " + (o1.compareTo(o2)));
		System.out.println("o1, o3: " + (o1.compareTo(o3)));
		System.out.println("o2, o3: " + (o2.compareTo(o3)));


	}
}
