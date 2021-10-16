package self;

public class InvalidAgeException extends Exception{

	// X extends/implement Serializable
	private static final long serialVersionUID = -8733880812411933581L;

	public InvalidAgeException(String message) {
		super(message);
	}
}
