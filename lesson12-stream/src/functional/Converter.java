package functional;

public interface Converter<R> {
	/**
	 * Convert string to another value
	 * 
	 * @param string input
	 * @return R
	 */
	R execute(String string);

}
