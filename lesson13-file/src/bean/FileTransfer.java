package bean;

@FunctionalInterface
public interface FileTransfer {
	/**
	 * convert form object to string before writing to file
	 * @return
	 */
	String toLine();
}
