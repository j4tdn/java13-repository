package ex02;

public class InvalidFormatNameException extends RuntimeException{

	private static final long serialVersionUID = -8783567024991062514L;
	
	public InvalidFormatNameException(String message) {
		super(message);
	}
}
