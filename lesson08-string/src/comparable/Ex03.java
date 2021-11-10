package comparable;

public class Ex03 {
	public static void main(String[] args) {
		//compare address: .compareTo(
				String s1 ="Hello";
				String s2 ="Machine";
				String s3 ="Hello";
				
				System.out.println("s1,s2: "+(s1.compareTo(s2)));
				System.out.println("s1,s3: "+(s1.compareTo(s3)));
				System.out.println("s3,s2: "+(s3.compareTo(s2)));
				
				String o1 = new String("Welcome");
				String o2 = new String("Welcome");
				String o3 = new String("Student");
				
				System.out.println("o1,o2: "+(o1.compareTo(o2)));
				System.out.println("o1,o3: "+(o1.compareTo(o3)));
				System.out.println("o3,o2: "+(o3.compareTo(o2)));
				//compare content
	}
}
