package ex03;

public class InvalidMailException extends Exception{
	
	
	private static final long serialVersionUID = -4725493515759901964L;

	public InvalidMailException(String message) {
		super(message);
	}
}
