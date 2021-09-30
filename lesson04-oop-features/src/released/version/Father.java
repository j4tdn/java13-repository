package released.version;

/**
 * Interface consists of
 * + abstract method >> no body
 * + default method  >> body
 * + static method   >> body
 * + private method
 */
public interface Father {
	void adn();
	
	// could be override
	default void playSport() {
		System.out.println("Father >> football");
	}
	
	// similar to attribute, counldn't
	static void drinkBeer(int quantity) {
		// money();
		System.out.println("Father >> drinks " + quantity + "bottles");
	}
	
	// couldn't >> JAVA09
	// private static void money() {
		// System.out.println("Father >> 500K");
	// }
	
}
