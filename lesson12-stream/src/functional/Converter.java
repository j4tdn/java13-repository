package functional;

@FunctionalInterface
public interface Converter<R> {
	/**
	 * Convert String to another value
	 * 
	 * @param String input
	 * @return R
	 */
	R execute(String s);
}
