package functional;

public interface Converter<R> {
	/** 
	 * Convert string to another value
	 * 
	 * @param String input
	 * @return R
	 */
	R excute(String String);
}
