package shelf;

public class InvalidAgeException extends Exception{
	
	private static final long serialVersionUID = 5957626298175587753L;

	public InvalidAgeException(String message) {
		super(message);
	}
}
