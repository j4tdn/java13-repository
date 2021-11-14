package ex04;

public class InvalidPasswordException extends Exception{
	private static final long serialVersionUID = 2787125337821931338L;

	public InvalidPasswordException(String message) {
		super(message);
	}
}
