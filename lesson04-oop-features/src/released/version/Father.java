package released.version;

/**
 * Interface consists of
 * + abstract method >> no body
 * + default method >> have body
 * + static method >> have body
 */

public interface Father {
	
	void adn();
	
	// Could be override
	default void playSport() {
		System.out.println("Father >> football");
	}
	
	// Similar to attribute, couldn't
	static void drinkBeer(int quantity) {
		System.out.println("Father >> drinks " + quantity + " bottles");
	}
	
}
