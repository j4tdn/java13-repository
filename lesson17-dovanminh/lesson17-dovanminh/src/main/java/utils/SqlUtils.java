package utils;

public class SqlUtils {
	private SqlUtils() {
		
	}
	
	public static <C extends AutoCloseable> void close(AutoCloseable ...cs) {
		for (AutoCloseable c : cs) {
			if(c != null) {
				try {
					c.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
