package utils;

@FunctionalInterface
public interface FileTransfer {
	/*
	 * convert from current object to string before writing to file
	 */
	String toLine();
}
