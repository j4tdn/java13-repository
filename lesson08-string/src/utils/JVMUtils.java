package utils;

public class JVMUtils {
	
	private JVMUtils() {};
	
	public static void has(String msg, CharSequence s) {
		System.out.println(msg + ": " + System.identityHashCode(s));
	}
}
