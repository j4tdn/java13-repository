package utils;

public class JvmUtils {
	
	private JvmUtils() {
		
	}
	
	public static void hash(String text, CharSequence sequence) {
		System.out.println(text + ": " + System.identityHashCode(sequence));
	}
}
