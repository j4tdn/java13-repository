package ex01;

public class InvalidFormatStringException extends RuntimeException{

	private static final long serialVersionUID = -8783567024991062514L;
	
	public InvalidFormatStringException(String message) {
		super(message);
	}
}
