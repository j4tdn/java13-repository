package ex03;

public class StringUtils {
	private StringUtils() {
		
	}
	
	public static int priority(String s) {
		if (s == null) return 5;
		if ("Special".equals(s)) return 1;
		if (isNumber(s)) {
			int number = Integer.parseInt(s);
			return number < 0 ? 2 : 3;		
		}
		return 4;
	}
	
	private static boolean isNumber(String s) {
		try {
			Integer.parseInt(s);
		} catch(RuntimeException e) {
			return false;
		}
		return true;
	}
	
	public static void swap(String[] s, int i, int j) {
		String tmp = s[i];
		s[i] = s[j];
		s[j] = tmp;
	}
}
