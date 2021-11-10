package utils;

public class JVMUtils {
	private JVMUtils() {
		
	}
	
	public static void hash(String txt, CharSequence sequence) {
		System.out.println(txt + ": " + System.identityHashCode(sequence));
	}
}
