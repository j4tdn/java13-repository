package utils;

public class JvmUtils {
	public JvmUtils() {
	}
	
	public static void hash(String text, CharSequence sequence) {
		System.out.println(text + ": " + System.identityHashCode(sequence));
	}
}
