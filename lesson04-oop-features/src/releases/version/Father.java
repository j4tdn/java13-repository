package releases.version;
/*
 * Interface consist of
 * + abstract method
 * + abstract method >> no body
 * + default method >> body
 * + static method >> body
 * + private method
 */ 
public interface Father {
	void adn();
	
	// could be override
	default void playSport() {
		System.out.println("Father >> football");
	}
	
	//similar to attribute, couldn't
	static void drinkBeer(int quantity) {
		System.out.println("Father >> drink "+ quantity + " bottles");
	}
	
	//couldn't
	private void money() {
		System.out.println("Father >> 500K");
	}
}
