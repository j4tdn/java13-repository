package exception;

public class InvalidPrice extends RuntimeException{
	private static final long serialVersionUID = 207999352619480641L;

	public InvalidPrice(String message) {
		super(message);
	}
}
