package released.version;

/**
 * Interface consists of
 * + abstract method >> no body
 * + default method >> body
 * + static method >> body
 * + 
 */

public interface Father {
	void adn();
	// this 'default' : is not access modifier
	// could override
	default void playSport() {
		System.out.println("Father >> football");
	}
	// similar to attribute, couldn't
	static void drinkBeer(int quantity) {
		money();
		System.out.println("Father >> drinks " + quantity + "bottles");
	}
	// couldn't
	private static void money() {
		System.out.println("Father >> 500K");
	}
}
