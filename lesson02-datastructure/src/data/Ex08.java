	package data;
	
	import bean.Digit;
	
	public class Ex08 {
		public static void main(String[] args) {
			String s1 = "Cake";
			String s2 = "Cake"; // Constant pool
			String s3 = "Cake";
			String s4 = new String("Cake"); // Normal heap
	
			System.out.println("s1: " + System.identityHashCode(s1));
			System.out.println("s2: " + System.identityHashCode(s2));
			System.out.println("s3: " + System.identityHashCode(s3));
			System.out.println("s4: " + System.identityHashCode(s4));
			System.out.println("===================================");
			s2 = "candy";
	
			System.out.println("s1: " + System.identityHashCode(s1));
			System.out.println("s2: " + System.identityHashCode(s2));
			System.out.println("s3: " + System.identityHashCode(s3));
			System.out.println("s4: " + System.identityHashCode(s4));
	
			Digit d = new Digit();
			
		}
	}
