package self;

public class InvalidAgeException extends Exception{
	// Khi extends từ một Exception > add thêm ID random như bên dưới
	// X extends/implements Serializable (to convert data to save memory (JVM) - encrypted data)
	private static final long serialVersionUID = -8733880812411933581L;

	public InvalidAgeException(String message) {
		super(message);
	}

}
