package bean;

@FunctionalInterface
public interface FileTransfer {
	/**
	 * Convert from object to string before writing to file
	 * 
	 * @return string
	 */
	String toLine();
}
