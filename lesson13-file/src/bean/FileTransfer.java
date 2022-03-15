package bean;

@FunctionalInterface
public interface FileTransfer{
	/**
	 * Convert from current object to string before writing to file
	 * 
	 * @param t object type
	 * @return string
	 */
	String toLine();
}
