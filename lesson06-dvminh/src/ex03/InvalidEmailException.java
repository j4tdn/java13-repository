package ex03;

public class InvalidEmailException extends Exception{
	
	private static final long serialVersionUID = -8050833039692797637L;

	public InvalidEmailException(String message) {
		super(message);
	}
}
