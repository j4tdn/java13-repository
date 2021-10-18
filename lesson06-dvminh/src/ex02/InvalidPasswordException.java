package ex02;

public class InvalidPasswordException extends Exception{

	private static final long serialVersionUID = 5465246032678878337L;

	public InvalidPasswordException(String message) {
		super(message);
	}
}
