package utils;

import java.util.Objects;

import org.apache.commons.codec.digest.DigestUtils;

public class SqlUtils {
	private SqlUtils() {
		
	}
	
	public static String md5Hex(String text) {	
		Objects.requireNonNull(text,"String cannot be null");
		return DigestUtils.md5Hex(text);
	}
	
	public static void close(AutoCloseable... closeables) {
		try {
			for(AutoCloseable closeable: closeables) {
				closeable.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}