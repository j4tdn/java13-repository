package functional;

public interface Converter<R>{
	/**
	 * Covert String to another value 
	 * @param string
	 * @return
	 */
	R execute (String string);
}
