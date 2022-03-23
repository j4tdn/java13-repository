package bean;

@FunctionalInterface
public interface FileTransfer {
	/**
	 * Convert from current object to string before writing to file
	 * 
	 * @return string
	 */
	String toLine();
}
